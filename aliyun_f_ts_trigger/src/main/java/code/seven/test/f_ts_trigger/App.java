package code.seven.test.f_ts_trigger;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.aliyun.fc.runtime.Context;
import com.aliyun.fc.runtime.FunctionInitializer;
import com.aliyun.fc.runtime.StreamRequestHandler;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;

/**
 * Hello world!
 *
 */
public class App implements StreamRequestHandler, FunctionInitializer {

	public void initialize(Context context) throws IOException {
		// TODO
		System.out.println("initialize");
	}

	@Override
	public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
		System.out.println("handleRequest");
		CBORFactory f = new CBORFactory();
		ObjectMapper mapper = new ObjectMapper(f);
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		Event s = mapper.readValue(inputStream, Event.class);
        System.out.println("===" + new ObjectMapper().writeValueAsString(s) + "=== \n test ");

		outputStream.write(new String("ok").getBytes());
	}
}
