# Jack's Simple Mining Notifier

A robust, focused idle notifier for Mining in Old School RuneScape, built for [RuneLite](https://runelite.net).

Unlike standard notifiers that simply check if a rock is empty, this plugin monitors your player's **animation state** and **movement**. This ensures you are notified exactly when you stop mining, even if the rock is still there (e.g., if you are interrupted by combat or a misclick).

## Features

- **Smart Idle Detection:** Tracks your pickaxe animation. If you stop swinging for more than 1.8 seconds, you get notified—even if the rock hasn't depleted yet.
- **Interaction Safety:** Clicking your inventory (to drop ore), the chatbox, or the ground does **not** reset the tracker. The plugin knows you are still busy mining.
- **Movement Filters:** Intelligently detects when you are running to the bank. It suppresses "Inventory Full" notifications while you are moving, preventing spam.
- **Supported Actions:**
    - Standard Mining (Rocks, Motherlode Mine, etc.)
    - Dense Essence (Chipping)
- **Customization:** Configurable notification messages.

## Installation

1. Open RuneLite.
2. Navigate to the **Plugin Hub** (Configuration > Plugin Hub).
3. Search for **"Simple Mining Notifier"**.
4. Click **Install**.

## Usage

1. Enable the plugin in the configuration panel.
2. Simply click a rock to start mining.
3. The plugin will automatically track your status and notify you when:
    - The rock depletes.
    - Your inventory is full.
    - You stop mining (idle) for any other reason.

## License

This project is licensed under the BSD 2-Clause License.