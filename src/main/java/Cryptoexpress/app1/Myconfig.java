package Cryptoexpress.app1;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Configuration
@ConfigurationProperties(prefix = "poc")
public class Myconfig {
    private String myusername;
    private String myservicname;

    public String getMyusername() {
        
        return myusername;
    }
    public void setMyusername(String myusername) {
        this.myusername = myusername;
    }

    
    public String getMyservicname() {
        return myservicname;
    }
    public void setMyservicname(String myservicname) {
        this.myservicname = myservicname;
    }

}