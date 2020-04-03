package code.seven.test.f_ts_trigger;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

	@JsonProperty("Version")
	private String version;
	@JsonProperty("Records")
	private List<Record> records;

	@Data
	@JsonIgnoreProperties(ignoreUnknown = true)
	static class Record {
		@JsonProperty("Columns")
		private List<Column> columns;
		@JsonProperty("Info")
		private Info info;
		@JsonProperty("PrimaryKey")
		private List<PrimaryKey> primaryKey;
		@JsonProperty("Type")
		private String type;
		
		@Data
		@JsonIgnoreProperties(ignoreUnknown = true)
		static class Column {
			@JsonProperty("Column")
			private String column;
			@JsonProperty("TimeStamp")
			private Long timeStamp;
			@JsonProperty("Type")
			private String type;
			@JsonProperty("Value")
			private String value;
		}
		
		@Data
		@JsonIgnoreProperties(ignoreUnknown = true)
		static class Info {
			@JsonProperty("TimeStamp")
			private Long timestamp;
		}
		
		@Data
		@JsonIgnoreProperties(ignoreUnknown = true)
		static class PrimaryKey {
			@JsonProperty("ColumnName")
			private String columnName;
			@JsonProperty("Value")
			private String value;
		}
	}
}
