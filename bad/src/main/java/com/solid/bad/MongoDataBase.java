package com.solid.bad;

// MongoDB - не реляционная база данных,
// все данные хранятся в форме коллекций и документов,
// никаких таблиц нет. Соответственно, метод joinTables()
// абсолютно бесполезен
public class MongoDataBase extends DataBase {
	@Override
	public void connect() {
		// ...
	}

	@Override
	public void read() {
		// ...
	}

	@Override
	public void write() {
		// ...
	}

	@Override
	public void joinTables() {
		throw new UnsupportedOperationException();
	}
}
