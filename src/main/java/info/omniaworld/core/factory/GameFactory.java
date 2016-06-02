package info.omniaworld.core.factory;

import info.omniaworld.core.Game;
import info.omniaworld.mom.MOM;

/**
 * Created by Omnia on 2016/6/2.
 */
public class GameFactory {

    private GameFactory(){

    }

    public static Game createGame(String gameName){
        if("MOM".equals(gameName)){
            return new MOM();
        }else{
            return null;
        }
    }
}
