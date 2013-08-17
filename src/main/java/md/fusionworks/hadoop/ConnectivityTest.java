package md.fusionworks.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.yarn.client.YarnClient;
import org.apache.hadoop.yarn.client.YarnClientImpl;
import org.apache.hadoop.yarn.conf.YarnConfiguration;

public class ConnectivityTest {

	public static void main(String[] args) throws Exception {
		Configuration conf = new YarnConfiguration();

		YarnClient client = new YarnClientImpl()  ;
		client.init(conf);
		client.start();
		client.getNewApplication();
		client.close();
	}

}
