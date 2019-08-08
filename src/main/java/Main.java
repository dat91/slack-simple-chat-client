import org.json.JSONObject;

import java.io.IOException;

/**
 * Created by dat on 2019-08-09.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        JSONObject jo = new JSONObject();
        jo.put("channel","DM6DKR6T1"); //Replace with your channel ID
        jo.put("text","Hello, world");

        SlackClient client = new SlackClient("xxxx-333734198151-720461855415-EHVGv3c21sZFhRunhI03nzS0"); //Replace with your Bot user Oauth Token.
        client.post(jo.toString());
    }
}
