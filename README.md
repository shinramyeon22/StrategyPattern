# GameApp Strategy Pattern – Problem Scenario

## Characters in the Game

The GameApp contains three types of characters, each with unique attack and defense behaviors.

### 1. Knight
- **Attack:** Swing Sword
- **Defense Strategies:**
  - Shield
  - Dodge
  - Magic Barrier

### 2. Wizard
- **Attack:** Cast Spell
- **Defense Strategy:**
  - Magic Barrier

### 3. Archer
- **Attack:** Shoot Arrow
- **Defense Strategy:**
  - Dodge

---

## Strategy Types

### A. DefenseStrategy
The following strategies define how a character defends:

1. Shield  
2. Dodge  
3. CreateMagic  

### B. AttackStrategy
The following strategies define how a character attacks:

1. CastSpell  
2. ShootArrow  
3. SwingSword  
