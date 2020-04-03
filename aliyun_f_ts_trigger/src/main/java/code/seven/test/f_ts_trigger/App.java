package code.seven.test.f_ts_trigger;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.aliyun.fc.runtime.Context;
import com.aliyun.fc.runtime.FunctionInitializer;
import com.aliyun.fc.runtime.StreamRequestHandler;

/**
 * Hello world!
 *
 */
public class App implements StreamRequestHandler, FunctionInitializer {

    public void initialize(Context context) throws IOException {
        //TODO
    	System.out.println("initialize");
    }

    @Override
    public void handleRequest(
            InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
    	System.out.println("handleRequest");
    	ByteArrayOutputStream result = new ByteArrayOutputStream();
    	byte[] buffer = new byte[1024];
    	int length;
    	while ((length = inputStream.read(buffer)) != -1) {
    	    result.write(buffer, 0, length);
    	}
    	// StandardCharsets.UTF_8.name() > JDK 7
        outputStream.write(result.toByteArray());
    }
}
