import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConnectionBancoTest {
    @Test
    public void setUser() {
        ConnectionBanco.getInstance().setUser("DanielDev");
        assertEquals("DanielDev", ConnectionBanco.getInstance().getUser());
    }

    @Test
    public void setHost() {
        ConnectionBanco.getInstance().setHost("simulancaoHost");
        assertEquals("simulancaoHost", ConnectionBanco.getInstance().getHost());
    }

    @Test
    public void setDataBase(){
        ConnectionBanco.getInstance().setDataBase("postgres");
        assertEquals("postgres", ConnectionBanco.getInstance().getDataBase());
    }

    @Test
    public void setPort(){
        ConnectionBanco.getInstance().setPort("8000");
        assertEquals("8000", ConnectionBanco.getInstance().getPort());
    }

    @Test
    public void setPassword(){
        ConnectionBanco.getInstance().setPassword("snx102030");
        assertEquals("snx102030", ConnectionBanco.getInstance().getPassword());
    }
}
