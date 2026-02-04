<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>GameApp Strategy Design</title>
    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
            background-color: #f4f6f8;
            margin: 20px;
            color: #333;
        }
        h1, h2, h3 {
            color: #2c3e50;
        }
        .container {
            max-width: 900px;
            margin: auto;
            background: #ffffff;
            padding: 20px;
            border-radius: 8px;
        }
        .section {
            margin-bottom: 25px;
        }
        .card {
            border: 1px solid #ddd;
            border-radius: 6px;
            padding: 15px;
            margin-bottom: 15px;
            background-color: #fafafa;
        }
        ul {
            margin-left: 20px;
        }
        .tag {
            display: inline-block;
            background-color: #3498db;
            color: white;
            padding: 3px 8px;
            border-radius: 4px;
            font-size: 12px;
            margin-right: 5px;
        }
    </style>
</head>
<body>

<div class="container">

    <h1>🎮 GameApp – Strategy Design Pattern</h1>
    <p>
        This design demonstrates the use of the <strong>Strategy Pattern</strong>
        by separating attack and defense behaviors from game characters.
    </p>

    <div class="section">
        <h2>🧍 Characters</h2>

        <div class="card">
            <h3>Knight</h3>
            <p><span class="tag">Attack</span> Swing Sword</p>
            <p><span class="tag">Defense</span></p>
            <ul>
                <li>Shield</li>
                <li>Dodge</li>
                <li>Magic Barrier</li>
            </ul>
        </div>

        <div class="card">
            <h3>Wizard</h3>
            <p><span class="tag">Attack</span> Cast Spell</p>
            <p><span class="tag">Defense</span></p>
            <ul>
                <li>Magic Barrier</li>
            </ul>
        </div>

        <div class="card">
            <h3>Archer</h3>
            <p><span class="tag">Attack</span> Shoot Arrow</p>
            <p><span class="tag">Defense</span></p>
            <ul>
                <li>Dodge</li>
            </ul>
        </div>
    </div>

    <div class="section">
        <h2>⚔️ Attack Strategies</h2>
        <ul>
            <li><strong>SwingSword</strong> – Melee sword attack</li>
            <li><strong>CastSpell</strong> – Magical ranged attack</li>
            <li><strong>ShootArrow</strong> – Long-range projectile attack</li>
        </ul>
    </div>

    <div class="section">
        <h2>🛡️ Defense Strategies</h2>
        <ul>
            <li><strong>Shield</strong> – Blocks physical damage</li>
            <li><strong>Dodge</strong> – Evades incoming attacks</li>
            <li><strong>CreateMagic</strong> – Generates a magic barrier</li>
        </ul>
    </div>

    <div class="section">
        <h2>📐 Design Concept</h2>
        <p>
            Each character can change its attack or defense behavior at runtime.
            This makes the system flexible, reusable, and easy to extend without
            modifying existing character classes.
        </p>
    </div>

</div>

</body>
</html>
