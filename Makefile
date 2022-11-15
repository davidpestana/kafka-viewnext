build:
	@read -p "Enter Tag Name: " tag; \
	docker build -t $$tag .

launch-server:
	docker run -it --rm davidpestana/kafka 

cleanup:
	docker rm -f $$(docker ps -aq)