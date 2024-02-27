package CLIENT.BLL;

import CLIENT.Client;
import CLIENT.DTO.ResponseDTO;
import CLIENT.DTO.ResultDTO;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class ResultBLL {
    static ArrayList<ResultDTO> listResults;
    public static Gson gson = new Gson();

    public ResultBLL() {}

    public static ArrayList<ResultDTO> getListResults() {
        return listResults;
    }

    public static void setListResults(ArrayList<ResultDTO> listResults) {
        ResultBLL.listResults = listResults;
    }

    public  ArrayList<ResultDTO> loadDSResult(int examID) throws Exception {
        Gson gson = new Gson();
        if(listResults==null) listResults = new ArrayList<>();
        ResponseDTO listData= Client.CallServer("LOAD_RESULTS",examID+"");
        Type listType = new TypeToken<ArrayList<ResultDTO>>(){}.getType();
        
        listResults= gson.fromJson(listData.getResult(), listType);
        return listResults;
    }


    public int addEResult(ResultDTO re) throws Exception {
        ResponseDTO res=null;
        try {

          res=  Client.CallServer("ADD_RESULT", gson.toJson(re));
        
        }
        catch (Exception e) {
            e.printStackTrace();
        }
          return (res.getStatus()==200)?Integer.valueOf(res.getResult()):0;
    }

}
