package homework.sqlRequest;

import java.util.HashMap;
import java.util.Map;

public class CarsSqlRequest {

    public static void main(String[] args) {

        Map<String, Object> params = new HashMap<>();
        params.put("model", "V-60");
        params.put("country", "Germany");
        params.put("city", "Berlin");
        params.put("year", null);
        params.put("active", true);

        String sqlRequest = createRequest(params);
        System.out.println(sqlRequest);

    }

    public static String createRequest (Map<String, Object> params){
        StringBuilder builder = new StringBuilder("SELECT * FROM cars WHERE ");
        boolean isFirstParam = true;
        for (Map.Entry<String, Object> element : params.entrySet()){
            String key = element.getKey();
            Object value = element.getValue();
            if (value != null){
                if(!isFirstParam){
                    builder.append(" AND ");
                }
                builder.append(key).append(" = ");
                if (value instanceof String) {
                    builder.append("'").append(value).append("'");
                } else {
                    builder.append(value);
                }
                isFirstParam = false;
            }
        }
        return builder.toString();
    }
}
