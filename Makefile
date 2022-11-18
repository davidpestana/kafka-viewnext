bootstrap-server= broker2:9092,broker3:9092

start:
	docker compose up -d

start-localhost:
	docker compose -f docker-compose.localhost.yaml up -d

start-all-in-one:
	docker compose -f docker-compose.all-in-one.yaml up -d

launch-services:
	docker compose -f services.yaml up

build:
	@read -p "Enter Tag Name: " tag; \
	docker build -t $$tag .

launch-server:
	docker compose -f tools.yaml run -it --rm tools 

cleanup:
	docker compose down --remove-orphans
	docker rm -f $$(docker ps -aq)	

remove:
	docker compose -f tools.yaml run --rm tools bash -c \
			"rm -Rf /state"

du:
	du -h --max-depth=1 state/

stats:
	docker stats


create-topic:
	@read -p "Enter Topic Name: " topic; \
	read -p "Enter Topic Partitions number: " partitions; \
	read -p "Enter Topic Replication factor: " replication; \
	docker compose -f tools.yaml run --rm tools bash -c \
			"./bin/kafka-topics.sh --bootstrap-server $(bootstrap-server) --create --partitions $$partitions --replication-factor $$replication --topic $$topic"


delete-topic:
	@read -p "Enter Topic Name: " topic; \
	docker compose -f tools.yaml run --rm tools bash -c \
			"./bin/kafka-topics.sh --bootstrap-server $(bootstrap-server) --delete --topic $$topic"


topic-list:
	docker compose -f tools.yaml run --rm tools bash -c \
			"./bin/kafka-topics.sh --bootstrap-server $(bootstrap-server) --list"

topic-describe-all:
	docker compose -f tools.yaml run --rm tools bash -c \
			"./bin/kafka-topics.sh --bootstrap-server $(bootstrap-server) --describe"

topic-describe:
	@read -p "Enter Topic Name: " topic; \
	docker compose -f tools.yaml run --rm tools bash -c \
			"./bin/kafka-topics.sh --bootstrap-server $(bootstrap-server) --describe --topic $$topic"

group-describe-all:
	docker compose -f tools.yaml run --rm tools bash -c \
			"./bin/kafka-consumer-groups.sh --bootstrap-server $(bootstrap-server) --describe --all-groups"


launch-producer:
	@read -p "Enter Topic Name: " topic; \
	docker compose -f tools.yaml run --rm tools bash -c \
			"./bin/kafka-console-producer.sh --bootstrap-server $(bootstrap-server) --topic $$topic"

launch-consumer:
	@read -p "Enter Topic Name: " topic; \
	read -p "Enter Group Id: " groupId; \
	docker compose -f tools.yaml run --rm tools bash -c \
			"./bin/kafka-console-consumer.sh --bootstrap-server $(bootstrap-server) --from-beginning --group $$groupId --topic $$topic"