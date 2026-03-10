# Docker with Selenium Grid

## Tech Stack
Java | TestNG | Maven | Docker | Docker Compose | Selenium Grid 4 | AWS EC2

## What this project does
- Runs cross-browser Selenium tests remotely on AWS EC2
- Uses Docker Compose to spin up Selenium Grid 4 with Chrome and Firefox nodes
- Supports parallel execution across 6 nodes (3 Chrome + 3 Firefox)
- Tests executed via RemoteWebDriver

## How to run
1. Start grid: `docker compose up -d --scale chrome=3 --scale firefox=3`
2. Run tests: `mvn clean install
