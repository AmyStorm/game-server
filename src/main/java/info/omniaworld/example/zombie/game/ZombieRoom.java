package info.omniaworld.example.zombie.game;

import info.omniaworld.example.zombie.domain.Defender;
import info.omniaworld.example.zombie.domain.IAM;
import info.omniaworld.example.zombie.domain.World;
import info.omniaworld.example.zombie.domain.Zombie;
import io.nadron.app.PlayerSession;
import io.nadron.app.impl.GameRoomSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ZombieRoom extends GameRoomSession
{
	private static final Logger LOG = LoggerFactory.getLogger(ZombieRoom.class);
	
	private Defender defender;
	private Zombie zombie;
	
	public ZombieRoom(GameRoomSessionBuilder sessionBuilder)
	{
		super(sessionBuilder);
	}
	
	public ZombieRoom(GameRoomSessionBuilder sessionBuilder, World world, Defender defender, Zombie zombie)
	{
		super(sessionBuilder);
		this.defender = defender;
		this.zombie = zombie;
	}
	
	@Override
	public void onLogin(PlayerSession playerSession)
	{
		SessionHandler listener = new SessionHandler(playerSession,defender, zombie,
				IAM.ZOMBIE);
		playerSession.addHandler(listener);
		LOG.trace("Added event listener in Zombie Room");
	}
	
	public Defender getDefender()
	{
		return defender;
	}

	public void setDefender(Defender defender)
	{
		this.defender = defender;
	}

	public Zombie getZombie()
	{
		return zombie;
	}

	public void setZombie(Zombie zombie)
	{
		this.zombie = zombie;
	}
}
