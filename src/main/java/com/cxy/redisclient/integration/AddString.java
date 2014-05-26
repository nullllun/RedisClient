package com.cxy.redisclient.integration;

import com.cxy.redisclient.domain.RedisVersion;


public class AddString extends JedisCommand {
	private int db;
	private String key;
	private String value;
	
	public AddString(int id, int db, String key, String value) {
		super(id);
		this.db = db;
		this.key = key;
		this.value = value;
	}

	@Override
	public void command() {
		jedis.select(db);
		jedis.set(key, value);
	}

	@Override
	public RedisVersion getVersion() {
		return RedisVersion.REDIS_1_0;
	}

}
