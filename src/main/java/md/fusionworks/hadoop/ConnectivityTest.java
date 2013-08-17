package md.fusionworks.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.yarn.client.api.YarnClient;
import org.apache.hadoop.yarn.conf.YarnConfiguration;

public class ConnectivityTest {

	public static void main(String[] args) throws Exception {
		Configuration conf = new YarnConfiguration();

		YarnClient client = YarnClient.createYarnClient();  
		client.init(conf);
		client.start();
		client.createApplication();
	}

}
