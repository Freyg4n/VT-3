package server.entity;

import server.entity.info.ClientInfo;
import server.entity.info.Info;
import server.entity.info.StudentInfo;

import java.util.List;

public class Factory {

    public Info getInfo(List<String> parameters, String type){
        if (type.equals("Client")){
            ClientInfo clientInfo = new ClientInfo();
            clientInfo.setName(parameters.get(0));
            clientInfo.setAllowance(parameters.get(2));
            return clientInfo;
        }
        else{
            StudentInfo studentInfo = new StudentInfo();
            studentInfo.setName(parameters.get(0));
            studentInfo.setAverageScore(parameters.get(1));
            return studentInfo;
        }
    }
}