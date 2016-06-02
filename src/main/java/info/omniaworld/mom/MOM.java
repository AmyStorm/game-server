package info.omniaworld.mom;

import info.omniaworld.core.AbstractGame;
import info.omniaworld.core.GameType;

import static info.omniaworld.core.GameType.BOARDGAME;
import static info.omniaworld.core.GameType.COMPETITION;
import static info.omniaworld.core.GameType.MULTIPLAYER;

/**
 * Created by Omnia on 2016/6/2.
 */
public class MOM extends AbstractGame {



    @Override
    public GameType[] getGameType() {
        return new GameType[]{BOARDGAME, MULTIPLAYER, COMPETITION};
    }
}
