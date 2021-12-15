install: # очистка результатов предыдущей сборки и запуск новой сборки
		./gradlew clean install

run-dist: # запуск исполняемого файла
		./build/install/app/bin/app

check-updates: # проверка обновлений зависимостей и плагинов
		./gradlew dependencyUpdates