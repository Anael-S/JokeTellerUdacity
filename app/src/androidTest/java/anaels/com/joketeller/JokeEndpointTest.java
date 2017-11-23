package anaels.com.joketeller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JokeEndpointTest {

    @Test
    public void test() throws Exception{
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.onJokeRecovered = new EndpointsAsyncTask.OnJokeRecovered() {
            @Override
            public void onJokeRecovered(String joke) {
                Assert.assertNotNull(joke);
                Assert.assertNotEquals("",joke);
            }
        };
        task.execute();
    }
}