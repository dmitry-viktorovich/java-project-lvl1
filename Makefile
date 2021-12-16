install: # очистка результатов предыдущей сборки и запуск новой сборки
		./gradlew clean install

build: # сборка проекта
		./gradlew clean build

run-dist: # запуск исполняемого файла
		./build/install/app/bin/app

check-updates: # проверка обновлений зависимостей и плагинов
		./gradlew dependencyUpdates

lint: # проверка качества кода
		./gradlew checkstyleMain

.PHONY: build
