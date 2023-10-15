package JToJPackage;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonUtil {

    private static ObjectMapper mapper;

    static
    {
     mapper = new ObjectMapper();
    }

        public static String convertJavaToJson(Object obj) throws IOException {

            String jsonResult="";
            try {
                jsonResult = mapper.writeValueAsString(obj);
            }
            catch (JsonGenerationException e) {
                System.out.println("Json generation exception");
                e.printStackTrace();
            }
            catch (JsonMappingException e) {
                 System.out.println("Json Mapping exceoption");
                 e.printStackTrace();
            }
            catch (IOException e) {
                System.out.println("I/O exception");
                e.printStackTrace();
            }
        return jsonResult;

        }

        public static<T> T converJsonToJava(String Jsonstr,Class<T> cls) throws IOException {
           T res = null;
         try {
             res = mapper.readValue(Jsonstr,cls);
         }
         catch (JsonGenerationException e) {
             System.out.println(e.getMessage());
             e.printStackTrace();
         }
         catch (JsonMappingException e) {
             System.out.println(e.getMessage());
             e.printStackTrace();
         }
         catch (IOException e) {
             System.out.println(e.getMessage());
             e.printStackTrace();
         }
         return  res;
        }
}
