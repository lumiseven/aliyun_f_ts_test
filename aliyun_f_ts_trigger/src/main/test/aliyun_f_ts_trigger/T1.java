//package aliyun_f_ts_trigger;
//
//import org.junit.Test;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import code.seven.test.f_ts_trigger.Event;
//
//public class T1 {
//
//	@Test
//	public void t1_1() {
//		String s = "{\n" + 
//				"    \"Version\":\"Sync-v1\",\n" + 
//				"    \"Records\":[\n" + 
//				"        {\n" + 
//				"            \"Columns\":[\n" + 
//				"                {\n" + 
//				"                    \"ColumnName\":\"user_id\",\n" + 
//				"                    \"Timestamp\":1585929066917,\n" + 
//				"                    \"Type\":\"Put\",\n" + 
//				"                    \"Value\":49\n" + 
//				"                },\n" + 
//				"                {\n" + 
//				"                    \"ColumnName\":\"status\",\n" + 
//				"                    \"Timestamp\":1585929066917,\n" + 
//				"                    \"Type\":\"Put\",\n" + 
//				"                    \"Value\":1\n" + 
//				"                },\n" + 
//				"                {\n" + 
//				"                    \"ColumnName\":\"receiver_name\",\n" + 
//				"                    \"Timestamp\":1585929066917,\n" + 
//				"                    \"Type\":\"Put\",\n" + 
//				"                    \"Value\":\"qie\"\n" + 
//				"                },\n" + 
//				"                {\n" + 
//				"                    \"ColumnName\":\"receiver_phone\",\n" + 
//				"                    \"Timestamp\":1585929066917,\n" + 
//				"                    \"Type\":\"Put\",\n" + 
//				"                    \"Value\":\"12987329183\"\n" + 
//				"                },\n" + 
//				"                {\n" + 
//				"                    \"ColumnName\":\"receiver_location\",\n" + 
//				"                    \"Timestamp\":1585929066917,\n" + 
//				"                    \"Type\":\"Put\",\n" + 
//				"                    \"Value\":\"rl\"\n" + 
//				"                },\n" + 
//				"                {\n" + 
//				"                    \"ColumnName\":\"receiver_location_detail\",\n" + 
//				"                    \"Timestamp\":1585929066917,\n" + 
//				"                    \"Type\":\"Put\",\n" + 
//				"                    \"Value\":\"rld\"\n" + 
//				"                },\n" + 
//				"                {\n" + 
//				"                    \"ColumnName\":\"receiver_location_code\",\n" + 
//				"                    \"Timestamp\":1585929066917,\n" + 
//				"                    \"Type\":\"Put\",\n" + 
//				"                    \"Value\":\"310000\"\n" + 
//				"                },\n" + 
//				"                {\n" + 
//				"                    \"ColumnName\":\"binding_city\",\n" + 
//				"                    \"Timestamp\":1585929066917,\n" + 
//				"                    \"Type\":\"Put\",\n" + 
//				"                    \"Value\":123987\n" + 
//				"                },\n" + 
//				"                {\n" + 
//				"                    \"ColumnName\":\"remark\",\n" + 
//				"                    \"Timestamp\":1585929066917,\n" + 
//				"                    \"Type\":\"Put\",\n" + 
//				"                    \"Value\":\"remark\"\n" + 
//				"                },\n" + 
//				"                {\n" + 
//				"                    \"ColumnName\":\"total_price\",\n" + 
//				"                    \"Timestamp\":1585929066917,\n" + 
//				"                    \"Type\":\"Put\",\n" + 
//				"                    \"Value\":0\n" + 
//				"                },\n" + 
//				"                {\n" + 
//				"                    \"ColumnName\":\"total_point\",\n" + 
//				"                    \"Timestamp\":1585929066917,\n" + 
//				"                    \"Type\":\"Put\",\n" + 
//				"                    \"Value\":0\n" + 
//				"                },\n" + 
//				"                {\n" + 
//				"                    \"ColumnName\":\"total_given_point\",\n" + 
//				"                    \"Timestamp\":1585929066917,\n" + 
//				"                    \"Type\":\"Put\",\n" + 
//				"                    \"Value\":0\n" + 
//				"                },\n" + 
//				"                {\n" + 
//				"                    \"ColumnName\":\"create_time\",\n" + 
//				"                    \"Timestamp\":1585929066917,\n" + 
//				"                    \"Type\":\"Put\",\n" + 
//				"                    \"Value\":1585929066867\n" + 
//				"                },\n" + 
//				"                {\n" + 
//				"                    \"ColumnName\":\"update_time\",\n" + 
//				"                    \"Timestamp\":1585929066917,\n" + 
//				"                    \"Type\":\"Put\",\n" + 
//				"                    \"Value\":1585929066867\n" + 
//				"                }\n" + 
//				"            ],\n" + 
//				"            \"Info\":{\n" + 
//				"                \"Timestamp\":1585929066916922\n" + 
//				"            },\n" + 
//				"            \"PrimaryKey\":[\n" + 
//				"                {\n" + 
//				"                    \"ColumnName\":\"order_num\",\n" + 
//				"                    \"Value\":\"b9876506-95b9-464c-abe4-05cc63797e7e\"\n" + 
//				"                }\n" + 
//				"            ],\n" + 
//				"            \"Type\":\"PutRow\"\n" + 
//				"        }\n" + 
//				"    ]\n" + 
//				"}";
//		ObjectMapper mapper = new ObjectMapper();
//		Event e = mapper.readValue(s, Event.class);
//		System.out.println(e.toString());
//	}
//}
