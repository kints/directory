package mx.com.citelis.directory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DirectoryController {

    @Autowired
    private Environment env;

    @GetMapping("/dbinfo")
    public String getDbinfo(){
    //    @Value(datasource.url)
        String dbInfo = env.getProperty("spring.datasource.url");

        return dbInfo;
    }
    @GetMapping("/version")
    public String getVersion()
    {

        return env.getProperty("dev.version");
    }
}
