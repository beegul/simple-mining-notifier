
package jack.miningnotifier;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Notification;

@ConfigGroup("simplemining")
public interface SimpleMiningConfig extends Config
{
	@ConfigItem(
			keyName = "notifications",
			name = "Notifications",
			description = "Configures all notifications"
	)
	default Notification notification()
	{
		return Notification.ON;
	}

	@ConfigItem(
			keyName = "customMessage",
			name = "Idle Message",
			description = "The message to send when you become idle",
			position = 1
	)
	default String customMessage()
	{
		return "You are idle!";
	}
}
