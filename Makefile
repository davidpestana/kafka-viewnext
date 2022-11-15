build:
	@read -p "Enter Tag Name: " tag; \
	docker build -t $$tag .