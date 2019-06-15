import redis.clients.jedis.Jedis;
public class HelloJedis{
	public static void main(String[] args){
		Jedis jedis = new Jedis("localhost");
		System.out.println("redis connect successfully");
		
		jedis.set("key","redisValue");
		
		System.out.println("get value from redis key : " + jedis.get("key"));
		jedis.set("key1","value2");
		jedis.set("key2","value3");
		System.out.println("get value from key1:" + jedis.get("key1"));
		System.out.println("get value from key2:" + jedis.get("key2"));

		System.out.println("get name by get:" + jedis.get("name"));
	}
}
