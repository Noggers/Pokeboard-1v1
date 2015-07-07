/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.pokeboard;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.KeyEvent;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.imageio.*;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;



/**
 *
 * @author Collin
 * @author MichaelJ
 */
public class PokeboardUI extends javax.swing.JFrame {


    Color lightPurple = new Color(204,102,255);
    Color darkPurple = new Color(102,0,102);
    Color limeGreen = new Color(50,205,50);
    Color forestGreen = new Color(0,100,0);
    Color EnergyGreen = new Color(69,150,73);
    Color EnergyBlue = new Color(25,75,144);
    Color EnergyPurple = new Color(70,36,69);
    Color EnergyBrown = new Color(51,41,40);
    

    /**
     * Creates new form PokeboardUI
     */
    public PokeboardUI() {
        initComponents();
        setIcon();
    }

    private int JohtoDamage = 0;
    private int KantoDamage = 0;
    private int KantoBench1Damage = 0;
    private int KantoBench2Damage = 0;    
    private int KantoBench3Damage = 0;
    private int KantoBench4Damage = 0;
    private int KantoBench5Damage = 0; 
    private int JohtoBench1Damage = 0;
    private int JohtoBench2Damage = 0;    
    private int JohtoBench3Damage = 0;
    private int JohtoBench4Damage = 0;
    private int JohtoBench5Damage = 0;      
    
    String[] PokemonList = { " ", "Abra", "Abra (R)", "Abra (Sabrina's)", "Abra (Sabrina's 2)", "Abra (Sabrina's 3)", "Aerodactyl", "Aerodactyl (NR)", "Aipom (NG)", "Aipom (NR)", "Alakazam", "Alakazam (Dark)", "Alakazam (Sabrina's)", "Ampharos (NG)", "Ampharos (NR)", "Ampharos (Dark)", "Arbok", "Arbok (Dark)", "Arbok (Koga's)", "Arcanine", "Arcanine (Blaine's)", "Arcanine (Light)", "Arcanine (Promo)", "Ariados (NG)", "Ariados (Dark)", "Articuno", "Articuno (Promo)", "Articuno (Promo 2)", "Azumarill (NG)", "Azumarill (Light)", "Bayleef (NG)", "Bayleef (NG 2)", "Beedrill", "Beedrill (Koga's)", "Beedrill (ND)", "Bellossom (NG)", "Bellsprout", "Bellsprout (Erika's)", "Bellsprout (Erika's 2)", "Bellsprout (Erika's 3)", "Blastoise", "Blastoise (Dark)", "Blissey (NR)", "Bulbasaur", "Bulbasaur (Erika's)", "Butterfree", "Butterfree (ND)", "Butterfree (SI)", "Caterpie", "Caterpie (ND)", "Celebi (NR)", "Celebi (NR 2)", "Celebi (Shining)", "Chansey", "Chansey (NDe)", "Charizard", "Charizard (Dark)", "Charizard (Blaine's)", "Charizard (Shining)", "Charizard (Premium)", "Charmander", "Charmander (R)", "Charmander (Blaine's)", "Charmander (Blaine's 2)", "Charmeleon", "Charmeleon (Dark)", "Charmeleon (Blaine's)", "Chikorita (NG)", "Chikorita (NG 2)", "Chinchou (NG)", "Chinchou (NR)", "Clefable", "Clefable (Erika's)", "Clefairy", "Clefairy (Erika's)", "Clefairy (Erika's 2)", "Clefairy (NG)", "Cleffa (NG)", "Cleffa (Promo)", "Cloyster", "Cloyster (Misty's)", "Corsola (ND)", "Crobat (NR)", "Crobat (Dark)", "Croconaw (NG)", "Croconaw (NG 2)", "Croconaw (Dark)", "Cubone", "Cyndaquil (NG)", "Cyndaquil (NG 2)", "Cyndaquil (NDe)", "Delibird (NR)", "Dewgong", "Dewgong (Misty's)", "Dewgong (Light)", "Diglett", "Diglett (R)", "Diglett (Brock's)", "Ditto", "Ditto (Koga's)", "Dodrio", "Dodrio (Blaine's)", "Doduo", "Doduo (Blaine's)", "Donphan (NG)", "Donphan (Dark)", "Dragonair", "Dragonair (Dark)", "Dragonair (Erika's)", "Dragonair (Light)", "Dragonite", "Dragonite (Dark)", "Dragonite (Light)", "Dragonite (Promo)", "Dratini", "Dratini (R)", "Dratini (Erika's)", "Dratini (NDe)", "Drowzee", "Drowzee (R)", "Drowzee (Sabrina's)", "Drowzee (Sabrina's 2)", "Dugtrio", "Dugtrio (Dark)", "Dugtrio (Brock's)", "Dunsparce (ND)", "Eevee", "Eevee (R)", "Eevee (Lt. Surge's)", "Eevee (ND)", "Eevee (Promo)", "Ekans", "Ekans (R)", "Ekans (Koga's)", "Electabuzz", "Electabuzz (Lt. Surge's)", "Electabuzz (Lt. Surge's 2)", "Electabuzz (NG)", "Electabuzz (Promo)", "Electabuzz (Promo 2)", "Electrode", "Electrode (Jungle)", "Electrode (Dark)", "Electrode (Lt. Surge's)", "Elekid (NG)", "Entei (NR)", "Entei (NR 2)", "Entei (Promo)", "Espeon (ND)", "Espeon (ND 2)", "Espeon (Dark)", "Exeggcute", "Exeggcute (Erika's)", "Exeggcute (Erika's 2)", "Exeggcute (NDe)", "Exeggutor", "Exeggutor (Erika's)", "Exeggutor (Dark)", "Exeggutor (SI)", "Farfetch'd", "Farfetch'd (NR)", "Fearow", "Fearow (Lt. Surge's)", "Feraligatr (NG)", "Feraligatr (NG 2)", "Feraligatr (Dark)", "Flaaffy (NG)", "Flaaffy (NR)", "Flaaffy (Dark)", "Flareon", "Flareon (Dark)", "Flareon (Light)", "Forretress (ND)", "Forretress (Dark)", "Furret (NG)", "Gastly", "Gastly (Fossil)", "Gastly (Sabrina's)", "Gastly (Sabrina's 2)", "Gastly (Sabrina's 3)", "Gastly (NDe)", "Gengar", "Gengar (Sabrina's)", "Gengar (Sabrina's 2)", "Gengar (Dark)", "Geodude", "Geodude (Brock's)", "Geodude (Brock's 2)", "Geodude (Brock's 3)", "Geodude (NR)", "Girafarig (NG)", "Girafarig (NDe)", "Gligar (NG)", "Gligar (NDe)", "Gloom", "Gloom (Dark)", "Gloom (Erika's)", "Gloom (Erika's 2)", "Gloom (NG)", "Golbat", "Golbat (Dark)", "Golbat (Brock's)", "Golbat (Koga's)", "Golbat (NR)", "Goldeen", "Goldeen (Misty's)", "Goldeen (Misty's 2)", "Goldeen (NR)", "Golduck", "Golduck (Dark)", "Golduck (Misty's)", "Golduck (Sabrina's)", "Golduck (Light)", "Golem", "Golem (Brock's)", "Granbull (NG)", "Graveler", "Graveler (Brock's)", "Graveler (Brock's 2)", "Graveler (NR)", "Grimer", "Grimer (R)", "Grimer (Koga's)", "Growlithe", "Growlithe (Blaine's)", "Growlithe (Blaine's 2)", "Growlithe (Blaine's 3)", "Growlithe (NDe)", "Gyarados", "Gyarados (Dark)", "Gyarados (Giovanni's)", "Gyarados (Misty's)", "Gyarados (Shining)", "Haunter", "Haunter (Fossil)", "Haunter (Sabrina's)", "Haunter (Sabrina's 2)", "Haunter (Dark)", "Heracross (NG)", "Heracross (NDe)", "Hitmonchan", "Hitmonchan (Rocket's)", "Hitmonchan (NDe)", "Hitmonlee", "Hitmonlee (NDe)", "Hitmontop (ND)", "Hitmontop (Promo)", "Ho-Oh (NR)", "Ho-Oh (NR 2)", "Hoothoot (NG)", "Hoppip (NG)", "Hoppip (ND)", "Horsea", "Horsea (Misty's)", "Horsea (Misty's 2)", "Horsea (NG)", "Houndoom (ND)", "Houndoom (NR)", "Houndoom (Dark)", "Houndour (ND)", "Houndour (ND 2)", "Houndour (NDe)", "Hypno", "Hypno (Dark)", "Hypno (Sabrina's)", "Igglybuff (ND)", "Igglybuff (Promo)", "Ivysaur", "Ivysaur (Erika's)", "Ivysaur (SI)", "Jigglypuff", "Jigglypuff (Erika's)", "Jigglypuff (NDe)", "Jigglypuff (Promo)", "Jigglypuff (SI)", "Jolteon", "Jolteon (Dark)", "Jolteon (Lt. Surge's)", "Jolteon (Light)", "Jumpluff (NG)", "Jumpluff (NR)", "Jynx", "Jynx (Sabrina's)", "Jynx (Sabrina's 2)", "Jynx (NR)", "Kabuto", "Kabuto (ND)", "Kabutops", "Kabutops (ND)", "Kabutops (Shining)", "Kadabra", "Kadabra (Dark)", "Kadabra (Sabrina's)", "Kakuna", "Kakuna (Koga's)", "Kakuna (ND)", "Kangaskhan", "Kangaskhan (Blaine's)", "Kingdra (NG)", "Kingdra (NR)", "Kingler", "Koffing", "Koffing (R)", "Koffing (Koga's)", "Koffing (Koga's 2)", "Krabby", "Lanturn (NG)", "Lanturn (NR)", "Lanturn (Light)", "Lapras", "Lapras (SI)", "Larvitar (ND)", "Larvitar (NDe)", "Ledian (NG)", "Ledian (Light)", "Ledyba (NG)", "Ledyba (NDe)", "Ledyba (SI)", "Lickitung", "Lickitung (Brock's)", "Lickitung (SI)", "Lugia (NG)", "Lugia (NR)", "Machamp", "Machamp (Dark)", "Machamp (Giovanni's)", "Machamp (Light)", "Machamp (Promo)", "Machoke", "Machoke (Dark)", "Machoke (Giovanni's)", "Machoke (Light)", "Machop", "Machop (R)", "Machop (Giovanni's)", "Machop (NDe)", "Magby (NG)", "Magcargo (NR)", "Magcargo (Dark)", "Magikarp", "Magikarp (R)", "Magikarp (Giovanni's)", "Magikarp (Misty's)", "Magikarp (Shining)", "Magmar", "Magmar (Fossil)", "Magmar (Blaine's)", "Magmar (NG)", "Magmar (Promo)", "Magnemite", "Magnemite (R)", "Magnemite (Lt. Surge's)", "Magnemite (Lt. Surge's 2)", "Magnemite (ND)", "Magneton", "Magneton (Fossil)", "Magneton (Dark)", "Magneton (Lt. Surge's)", "Magneton (NR)", "Mankey", "Mankey (R)", "Mankey (Brock's)", "Mankey (Brock's 2)", "Mankey (Blaine's)", "Mantine (NG)", "Mantine (NDe)", "Mareep (NG)", "Mareep (ND)", "Mareep (NDe)", "Marill (NG)", "Marill (Promo)", "Marill (SI)", "Marowak", "Meganium (NG)", "Meganium (NG 2)", "Meowth", "Meowth (R)", "Meowth (Giovanni's)", "Meowth (Giovanni's 2)", "Meowth (Promo)", "Meowth (Team Rocket's)", "Metapod", "Metapod (ND)", "Mew (Promo)", "Mew (Promo 2)", "Mew (SI)", "Mew (Ancient)", "Mewtwo", "Mewtwo (Rocket's)", "Mewtwo (Shining)", "Mewtwo (Promo)", "Mewtwo (Promo 2)", "Miltank (NG)", "Misdreavus (NR)", "Misdreavus (Promo)", "Moltres", "Moltres (Blaine's)", "Moltres (Rocket's)", "Moltres (Promo)", "Mr. Mime", "Mr. Mime (Sabrina's)", "Mr. Mime (Sabrina's 2)", "Muk", "Muk (Dark)", "Muk (Koga's)", "Murkrow (NG)", "Murkrow (NR)", "Mysterious Fossil", "Natu (NG)", "Natu (ND)", "Nidoking", "Nidoking (Giovanni's)", "Nidoqueen", "Nidoqueen (Giovanni's)", "Nidoran Female", "Nidoran Female (Giovanni's)", "Nidoran Male", "Nidoran Male (Giovanni's)", "Nidorina", "Nidorina (Giovanni's)", "Nidorino", "Nidorino (Giovanni's)", "Ninetales", "Ninetales (Brock's)", "Ninetales (Blaine's)", "Ninetales (Light)", "Noctowl (NG)", "Noctowl (Shining)", "Octillery (NR)", "Octillery (Dark)", "Oddish", "Oddish (R)", "Oddish (Erika's)", "Oddish (Erika's 2)", "Oddish (Erika's 3)", "Oddish (NG)", "Omanyte", "Omanyte (ND)", "Omanyte (Dark)", "Omastar", "Omastar (ND)", "Omastar (Dark)", "Onix", "Onix (Brock's)", "Onix (Brock's 2)", "Onix (NG)", "Onix (SI)", "Paras", "Paras (Erika's)", "Paras (NR)", "Parasect", "Parasect (NR)", "Persian", "Persian (Dark)", "Persian (Giovanni's)", "Phanpy (NG)", "Phanpy (NDe)", "Pichu (NG)", "Pichu (Promo)", "Pidgeot", "Pidgeot (SI)", "Pidgeotto", "Pidgeotto (Koga's)", "Pidgey", "Pidgey (Koga's)", "Pidgey (Koga's 2)", "Pikachu", "Pikachu (Jungle)", "Pikachu (Lt. Surge's)", "Pikachu (Lt. Surge's 2)", "Pikachu (NG)", "Pikachu (Promo)", "Pikachu (Promo 2)", "Pikachu (Promo 3)", "Pikachu (Promo 4)", "Pikachu (___'s)", "Pikachu (Flying)", "Pikachu (Surfing)", "Piloswine (NG)", "Piloswine (NR)", "Piloswine (Light)", "Pineco (ND)", "Pineco (NDe)", "Pinsir", "Pinsir (Giovanni's)", "Politoed (ND)", "Poliwag", "Poliwag (Misty's)", "Poliwag (Misty's 2)", "Poliwag (ND)", "Poliwhirl", "Poliwhirl (Misty's)", "Poliwhirl (ND)", "Poliwrath", "Poliwrath (Misty's)", "Poliwrath (ND)", "Ponyta", "Ponyta (R)", "Ponyta (Blaine's)", "Ponyta (Blaine's 2)", "Porygon", "Porygon (R)", "Porygon (NDe)", "Porygon (Sabrina's)", "Porygon (Cool)", "Porygon2 (NR)", "Porygon2 (Dark)", "Primeape", "Primeape (Dark)", "Primeape (Brock's)", "Primeape (SI)", "Psyduck", "Psyduck (R)", "Psyduck (Misty's)", "Psyduck (Misty's 2)", "Psyduck (Sabrina's)", "Psyduck (NDe)", "Pupitar (ND)", "Pupitar (Dark)", "Quagsire (NG)", "Quagsire (NR)", "Quilava (NG)", "Quilava (NG 2)", "Quilava (Dark)", "Qwilfish (NR)", "Raichu", "Raichu (Fossil)", "Raichu (Dark)", "Raichu (Lt. Surge's)", "Raichu (Lt. Surge's 2)", "Raichu (NR)", "Raichu (Shining)", "Raikou (NR)", "Raikou (NR 2)", "Rapidash", "Rapidash (Dark)", "Rapidash (Blaine's)", "Raticate", "Raticate (Dark)", "Raticate (Lt. Surge's)", "Raticate (Lt. Surge's 2)", "Raticate (SI)", "Rattata", "Rattata (R)", "Rattata (Lt. Surge's)", "Rattata (Lt. Surge's 2)", "Remoraid (NR)", "Remoraid (NDe)", "Rhydon", "Rhydon (Brock's)", "Rhyhorn", "Rhyhorn (Brock's)", "Rhyhorn (Brock's 2)", "Rhyhorn (Blaine's)", "Sandshrew", "Sandshrew (Brock's)", "Sandshrew (Brock's 2)", "Sandslash", "Sandslash (Brock's)", "Sandslash (Brock's 2)", "Scizor (ND)", "Scizor (Dark)", "Scizor (Promo)", "Scyther", "Scyther (Rocket's)", "Scyther (ND)", "Scyther (NDe)", "Scyther (Promo)", "Seadra", "Seadra (Misty's)", "Seadra (NG)", "Seaking", "Seaking (Misty's)", "Seaking (NR)", "Seel", "Seel (Misty's)", "Seel (Misty's 2)", "Seel (NDe)", "Sentret (NG)", "Sentret (ND)", "Shellder", "Shellder (Misty's)", "Shuckle (NG)", "Shuckle (NR)", "Skarmory (NG)", "Skarmory (NR)", "Skiploom (NG)", "Skiploom (NR)", "Slowbro", "Slowbro (Dark)", "Slowbro (Sabrina's)", "Slowbro (Light)", "Slowking (NG)", "Slowking (Dark)", "Slowking (SI)", "Slowpoke", "Slowpoke (R)", "Slowpoke (Sabrina's)", "Slowpoke (NG)", "Slugma (NR)", "Slugma (NDe)", "Smeargle (ND)", "Smeargle (Promo)", "Smoochum (NR)", "Sneasel (NG)", "Sneasel (NR)", "Snorlax", "Snorlax (Rocket's)", "Snorlax (Promo)", "Snubbull (NG)", "Snubbull (NR)", "Spearow", "Spearow (Lt. Surge's)", "Spearow (Lt. Surge's 2)", "Spinarak (NG)", "Spinarak (ND)", "Squirtle", "Squirtle (R)", "Stantler (NG)", "Stantler (NR)", "Starmie", "Starmie (Misty's)", "Starmie (NR)", "Staryu", "Staryu (Misty's)", "Staryu (Misty's 2)", "Staryu (NR)", "Steelix (NG)", "Steelix (Shining)", "Sudowoodo (NG)", "Sudowoodo (NR)", "Suicune (NR)", "Suicune (NR 2)", "Sunflora (NG)", "Sunflora (Light)", "Sunkern (NG)", "Sunkern (NDe)", "Swinub (NG)", "Swinub (NR)", "Swinub (NDe)", "Tangela", "Tangela (Erika's)", "Tangela (Koga's)", "Tauros", "Tauros (Blaine's)", "Teddiursa (ND)", "Tentacool", "Tentacool (Misty's)", "Tentacool (Misty's 2)", "Tentacruel", "Tentacruel (Misty's)", "Tentacruel (SI)", "Togepi (NG)", "Togepi (NDe)", "Togepi (Promo)", "Togepi (SI)", "Togetic (NG)", "Togetic (Light)", "Totodile (NG)", "Totodile (NG 2)", "Totodile (NDe)", "Typhlosion (NG)", "Typhlosion (NG 2)", "Typhlosion (Dark)", "Tyranitar (ND)", "Tyranitar (Dark)", "Tyranitar (Shining)", "Tyrogue (ND)", "Umbreon (ND)", "Unown A", "Unown B", "Unown C", "Unown D", "Unown E", "Unown F", "Unown G", "Unown H", "Unown I", "Unown J (Promo)", "Unown K", "Unown L", "Unown M", "Unown N", "Unown O", "Unown P", "Unown Q", "Unown R (Promo)", "Unown S", "Unown T", "Unown U", "Unown V", "Unown W", "Unown X", "Unown Y", "Unown Z", "Ursaring (ND)", "Ursaring (Dark)", "Vaporeon", "Vaporeon (Dark)", "Vaporeon (Light)", "Venomoth", "Venomoth (Sabrina's)", "Venomoth (Light)", "Venonat", "Venonat (Sabrina's)", "Venonat (NDe)", "Venusaur", "Venusaur (Erika's)", "Venusaur (Promo)", "Victreebel", "Victreebel (Erika's)", "Vileplume", "Vileplume (Dark)", "Vileplume (Erika's)", "Vileplume (SI)", "Voltorb", "Voltorb (R)", "Voltorb (Lt. Surge's)", "Voltorb (Lt. Surge's 2)", "Vulpix", "Vulpix (Blaine's)", "Vulpix (Blaine's 2)", "Vulpix (Brock's)", "Vulpix (Brock's 2)", "Vulpix (NDe)", "Wartortle", "Wartortle (Dark)", "Wartortle (SI)", "Weedle", "Weedle (Koga's)", "Weedle (ND)", "Weepinbell", "Weepinbell (Erika's)", "Weepinbell (Erika's 2)", "Weezing", "Weezing (Dark)", "Weezing (Koga's)", "Wigglytuff", "Wigglytuff (Dark)", "Wigglytuff (Light)", "Wobbuffet (ND)", "Wooper (NG)", "Wooper (ND)", "Xatu (NG)", "Xatu (ND)", "Yanma (ND)", "Zapdos", "Zapdos (Fossil)", "Zapdos (Rocket's)", "Zapdos (Promo)", "Zubat", "Zubat (R)", "Zubat (Brock's)", "Zubat (Brock's 2)", "Zubat (Koga's)", "Zubat (NR)" };


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JohtoActiveCard = new javax.swing.JFrame();
        JohtoActivePic = new javax.swing.JLabel();
        Background = new javax.swing.JLayeredPane();
        Stadium = new javax.swing.JComboBox();
        JohtoActive = new javax.swing.JComboBox();
        JohtoPrize1 = new javax.swing.JLabel();
        JohtoPrize2 = new javax.swing.JLabel();
        JohtoPrize3 = new javax.swing.JLabel();
        JohtoPrize4 = new javax.swing.JLabel();
        JohtoPrize5 = new javax.swing.JLabel();
        JohtoPrize6 = new javax.swing.JLabel();
        KantoPrize1 = new javax.swing.JLabel();
        KantoPrize2 = new javax.swing.JLabel();
        KantoPrize3 = new javax.swing.JLabel();
        KantoPrize4 = new javax.swing.JLabel();
        KantoPrize5 = new javax.swing.JLabel();
        KantoPrize6 = new javax.swing.JLabel();
        JohtoActiveEnergy1 = new javax.swing.JButton();
        JohtoActiveEnergy2 = new javax.swing.JButton();
        JohtoActiveEnergy3 = new javax.swing.JButton();
        JohtoActiveEnergy4 = new javax.swing.JButton();
        JohtoBench5 = new javax.swing.JComboBox();
        JohtoBench5Energy1 = new javax.swing.JButton();
        JohtoBench5Energy2 = new javax.swing.JButton();
        JohtoBench5Energy3 = new javax.swing.JButton();
        JohtoBench5Energy4 = new javax.swing.JButton();
        JohtoBench4 = new javax.swing.JComboBox();
        JohtoBench4Energy1 = new javax.swing.JButton();
        JohtoBench4Energy2 = new javax.swing.JButton();
        JohtoBench4Energy3 = new javax.swing.JButton();
        JohtoBench4Energy4 = new javax.swing.JButton();
        JohtoBench3 = new javax.swing.JComboBox();
        JohtoBench3Energy1 = new javax.swing.JButton();
        JohtoBench3Energy2 = new javax.swing.JButton();
        JohtoBench3Energy3 = new javax.swing.JButton();
        JohtoBench3Energy4 = new javax.swing.JButton();
        JohtoBench2 = new javax.swing.JComboBox();
        JohtoBench2Energy1 = new javax.swing.JButton();
        JohtoBench2Energy2 = new javax.swing.JButton();
        JohtoBench2Energy3 = new javax.swing.JButton();
        JohtoBench2Energy4 = new javax.swing.JButton();
        JohtoBench1 = new javax.swing.JComboBox();
        JohtoBench1Energy4 = new javax.swing.JButton();
        JohtoBench1Energy3 = new javax.swing.JButton();
        JohtoBench1Energy2 = new javax.swing.JButton();
        JohtoBench1Energy1 = new javax.swing.JButton();
        KantoActive = new javax.swing.JComboBox();
        KantoBench1 = new javax.swing.JComboBox();
        KantoBench2 = new javax.swing.JComboBox();
        KantoBench3 = new javax.swing.JComboBox();
        KantoBench4 = new javax.swing.JComboBox();
        KantoBench5 = new javax.swing.JComboBox();
        ClearButton = new javax.swing.JButton();
        JohtoPlus = new javax.swing.JButton();
        JohtoMinus = new javax.swing.JButton();
        JohtoDamageNumB5 = new javax.swing.JTextField();
        JohtoDamageNum = new javax.swing.JTextField();
        JohtoDamageNumB4 = new javax.swing.JTextField();
        JohtoDamageNumB3 = new javax.swing.JTextField();
        JohtoDamageNumB2 = new javax.swing.JTextField();
        JohtoDamageNumB1 = new javax.swing.JTextField();
        KantoPlus = new javax.swing.JButton();
        KantoMinus = new javax.swing.JButton();
        KantoDamageNum = new javax.swing.JTextField();
        KantoDamageNumB5 = new javax.swing.JTextField();
        KantoDamageNumB4 = new javax.swing.JTextField();
        KantoDamageNumB3 = new javax.swing.JTextField();
        KantoDamageNumB2 = new javax.swing.JTextField();
        KantoDamageNumB1 = new javax.swing.JTextField();
        StadiumCard = new javax.swing.JLabel();
        JohtoCard = new javax.swing.JLabel();
        KantoCard = new javax.swing.JLabel();
        mid = new javax.swing.JLabel();
        Kanto = new javax.swing.JLabel();
        Johto = new javax.swing.JLabel();
        KantoActiveEnergy1 = new javax.swing.JButton();
        KantoActiveEnergy2 = new javax.swing.JButton();
        KantoActiveEnergy3 = new javax.swing.JButton();
        KantoActiveEnergy4 = new javax.swing.JButton();
        KantoBench5Energy4 = new javax.swing.JButton();
        KantoBench5Energy3 = new javax.swing.JButton();
        KantoBench5Energy2 = new javax.swing.JButton();
        KantoBench5Energy1 = new javax.swing.JButton();
        KantoBench4Energy4 = new javax.swing.JButton();
        KantoBench4Energy3 = new javax.swing.JButton();
        KantoBench4Energy2 = new javax.swing.JButton();
        KantoBench4Energy1 = new javax.swing.JButton();
        KantoBench3Energy4 = new javax.swing.JButton();
        KantoBench3Energy3 = new javax.swing.JButton();
        KantoBench3Energy2 = new javax.swing.JButton();
        KantoBench3Energy1 = new javax.swing.JButton();
        KantoBench2Energy4 = new javax.swing.JButton();
        KantoBench2Energy3 = new javax.swing.JButton();
        KantoBench2Energy2 = new javax.swing.JButton();
        KantoBench2Energy1 = new javax.swing.JButton();
        KantoBench1Energy4 = new javax.swing.JButton();
        KantoBench1Energy3 = new javax.swing.JButton();
        KantoBench1Energy2 = new javax.swing.JButton();
        KantoBench1Energy1 = new javax.swing.JButton();
        JohtoPZ = new javax.swing.JButton();
        JohtoSL = new javax.swing.JButton();
        JohtoPO = new javax.swing.JButton();
        JohtoBR = new javax.swing.JButton();
        JohtoCN = new javax.swing.JButton();
        KantoCN = new javax.swing.JButton();
        KantoBR = new javax.swing.JButton();
        KantoPO = new javax.swing.JButton();
        KantoSL = new javax.swing.JButton();
        KantoPZ = new javax.swing.JButton();
        KantoBench5Switch = new javax.swing.JButton();
        KantoBench4Switch = new javax.swing.JButton();
        KantoBench3Switch = new javax.swing.JButton();
        KantoBench2Switch = new javax.swing.JButton();
        KantoBench1Switch = new javax.swing.JButton();
        JohtoBench5Switch = new javax.swing.JButton();
        JohtoBench4Switch = new javax.swing.JButton();
        JohtoBench3Switch = new javax.swing.JButton();
        JohtoBench2Switch = new javax.swing.JButton();
        JohtoBench1Switch = new javax.swing.JButton();
        KantoClear = new javax.swing.JButton();
        JohtoClear = new javax.swing.JButton();

        JohtoActivePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.png"))); // NOI18N

        javax.swing.GroupLayout JohtoActiveCardLayout = new javax.swing.GroupLayout(JohtoActiveCard.getContentPane());
        JohtoActiveCard.getContentPane().setLayout(JohtoActiveCardLayout);
        JohtoActiveCardLayout.setHorizontalGroup(
            JohtoActiveCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(JohtoActiveCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JohtoActiveCardLayout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(JohtoActivePic, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(191, Short.MAX_VALUE)))
        );
        JohtoActiveCardLayout.setVerticalGroup(
            JohtoActiveCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(JohtoActiveCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JohtoActiveCardLayout.createSequentialGroup()
                    .addComponent(JohtoActivePic, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pokeleague 2015");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.black);

        Background.setAlignmentX(0.0F);
        Background.setAlignmentY(0.0F);
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stadium.setEditable(true);
        Stadium.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Stadium", "Broken Ground Gym", "Celadon City Gym", "Cerulean City Gym", "Chaos Gym", "Cinnabar City Gym", "Ecogym", "Energy Stadium", "Fuchsia City Gym", "Healing Field", "Lucky Stadium", "No Removal Gym", "Narrow Gym", "Pewter City Gym", "Pokemon Tower", "Radio Tower", "Resistance Gym", "Rocket's Hideout", "Rocket's Minefield Gym", "Saffron City Gym", "Sprout Tower", "The Rocket's Training Gym", "Vermillion City Gym" }));
        AutoCompleteDecorator.decorate(Stadium);
        Stadium.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                StadiumItemStateChanged(evt);
            }
        });
        Background.add(Stadium, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 150, 20));

        JohtoActive.setEditable(true);
        JohtoActive.setModel(new javax.swing.DefaultComboBoxModel(PokemonList));
        JohtoActive.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JohtoActiveItemStateChanged(evt);
            }
        });
        JohtoActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoActiveActionPerformed(evt);
            }
        });
        AutoCompleteDecorator.decorate(JohtoActive);
        Background.add(JohtoActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 210, 20));

        JohtoPrize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png"))); // NOI18N
        JohtoPrize1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JohtoPrize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoPrize1MouseClicked(evt);
            }
        });
        Background.add(JohtoPrize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 21, 30));

        JohtoPrize2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png"))); // NOI18N
        JohtoPrize2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JohtoPrize2.setPreferredSize(new java.awt.Dimension(14, 20));
        JohtoPrize2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoPrize2MouseClicked(evt);
            }
        });
        Background.add(JohtoPrize2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 21, 30));

        JohtoPrize3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png"))); // NOI18N
        JohtoPrize3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JohtoPrize3.setPreferredSize(new java.awt.Dimension(21, 30));
        JohtoPrize3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoPrize3MouseClicked(evt);
            }
        });
        Background.add(JohtoPrize3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 21, 30));

        JohtoPrize4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png"))); // NOI18N
        JohtoPrize4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JohtoPrize4.setMaximumSize(new java.awt.Dimension(21, 30));
        JohtoPrize4.setMinimumSize(new java.awt.Dimension(21, 30));
        JohtoPrize4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoPrize4MouseClicked(evt);
            }
        });
        Background.add(JohtoPrize4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 21, 30));

        JohtoPrize5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png"))); // NOI18N
        JohtoPrize5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JohtoPrize5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoPrize5MouseClicked(evt);
            }
        });
        Background.add(JohtoPrize5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 20, 30));

        JohtoPrize6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png"))); // NOI18N
        JohtoPrize6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JohtoPrize6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoPrize6MouseClicked(evt);
            }
        });
        Background.add(JohtoPrize6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 20, 30));

        KantoPrize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png"))); // NOI18N
        KantoPrize1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        KantoPrize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoPrize1MouseClicked(evt);
            }
        });
        Background.add(KantoPrize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 21, 30));

        KantoPrize2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png"))); // NOI18N
        KantoPrize2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        KantoPrize2.setPreferredSize(new java.awt.Dimension(14, 20));
        KantoPrize2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoPrize2MouseClicked(evt);
            }
        });
        Background.add(KantoPrize2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 21, 30));

        KantoPrize3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png"))); // NOI18N
        KantoPrize3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        KantoPrize3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoPrize3MouseClicked(evt);
            }
        });
        Background.add(KantoPrize3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 21, 30));

        KantoPrize4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png"))); // NOI18N
        KantoPrize4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        KantoPrize4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoPrize4MouseClicked(evt);
            }
        });
        Background.add(KantoPrize4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 21, 30));

        KantoPrize5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png"))); // NOI18N
        KantoPrize5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        KantoPrize5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoPrize5MouseClicked(evt);
            }
        });
        Background.add(KantoPrize5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 20, 30));

        KantoPrize6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png"))); // NOI18N
        KantoPrize6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        KantoPrize6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoPrize6MouseClicked(evt);
            }
        });
        Background.add(KantoPrize6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 20, 30));

        JohtoActiveEnergy1.setBackground(java.awt.Color.lightGray);
        JohtoActiveEnergy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoActiveEnergy1MouseClicked(evt);
            }
        });
        Background.add(JohtoActiveEnergy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, 20));
        Background.setLayer(JohtoActiveEnergy1, 1);

        JohtoActiveEnergy2.setBackground(java.awt.Color.lightGray);
        JohtoActiveEnergy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoActiveEnergy2MouseClicked(evt);
            }
        });
        Background.add(JohtoActiveEnergy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 30, 20));
        Background.setLayer(JohtoActiveEnergy2, 2);

        JohtoActiveEnergy3.setBackground(java.awt.Color.lightGray);
        JohtoActiveEnergy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoActiveEnergy3MouseClicked(evt);
            }
        });
        Background.add(JohtoActiveEnergy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 30, 20));
        Background.setLayer(JohtoActiveEnergy3, 3);

        JohtoActiveEnergy4.setBackground(java.awt.Color.lightGray);
        JohtoActiveEnergy4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoActiveEnergy4MouseClicked(evt);
            }
        });
        Background.add(JohtoActiveEnergy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 30, 20));
        Background.setLayer(JohtoActiveEnergy4, 4);

        JohtoBench5.setEditable(true);
        JohtoBench5.setModel(new javax.swing.DefaultComboBoxModel(PokemonList));
        JohtoBench5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoBench5ActionPerformed(evt);
            }
        });
        AutoCompleteDecorator.decorate(JohtoBench5);
        Background.add(JohtoBench5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 100, 20));

        JohtoBench5Energy1.setBackground(java.awt.Color.lightGray);
        JohtoBench5Energy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench5Energy1MouseClicked(evt);
            }
        });
        Background.add(JohtoBench5Energy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, -1, 20));
        Background.setLayer(JohtoBench5Energy1, 1);

        JohtoBench5Energy2.setBackground(java.awt.Color.lightGray);
        JohtoBench5Energy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench5Energy2MouseClicked(evt);
            }
        });
        Background.add(JohtoBench5Energy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 30, 20));
        Background.setLayer(JohtoBench5Energy2, 2);

        JohtoBench5Energy3.setBackground(java.awt.Color.lightGray);
        JohtoBench5Energy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench5Energy3MouseClicked(evt);
            }
        });
        Background.add(JohtoBench5Energy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 30, 20));
        Background.setLayer(JohtoBench5Energy3, 3);

        JohtoBench5Energy4.setBackground(java.awt.Color.lightGray);
        JohtoBench5Energy4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench5Energy4MouseClicked(evt);
            }
        });
        Background.add(JohtoBench5Energy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 30, 20));
        Background.setLayer(JohtoBench5Energy4, 4);

        JohtoBench4.setEditable(true);
        JohtoBench4.setModel(new javax.swing.DefaultComboBoxModel(PokemonList));
        JohtoBench4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoBench4ActionPerformed(evt);
            }
        });
        AutoCompleteDecorator.decorate(JohtoBench4);
        Background.add(JohtoBench4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 100, 20));

        JohtoBench4Energy1.setBackground(java.awt.Color.lightGray);
        JohtoBench4Energy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench4Energy1MouseClicked(evt);
            }
        });
        Background.add(JohtoBench4Energy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, 20));
        Background.setLayer(JohtoBench4Energy1, 1);

        JohtoBench4Energy2.setBackground(java.awt.Color.lightGray);
        JohtoBench4Energy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench4Energy2MouseClicked(evt);
            }
        });
        Background.add(JohtoBench4Energy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 30, 20));
        Background.setLayer(JohtoBench4Energy2, 2);

        JohtoBench4Energy3.setBackground(java.awt.Color.lightGray);
        JohtoBench4Energy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench4Energy3MouseClicked(evt);
            }
        });
        Background.add(JohtoBench4Energy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 30, 20));
        Background.setLayer(JohtoBench4Energy3, 3);

        JohtoBench4Energy4.setBackground(java.awt.Color.lightGray);
        JohtoBench4Energy4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench4Energy4MouseClicked(evt);
            }
        });
        Background.add(JohtoBench4Energy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 30, 20));
        Background.setLayer(JohtoBench4Energy4, 4);

        JohtoBench3.setEditable(true);
        JohtoBench3.setModel(new javax.swing.DefaultComboBoxModel(PokemonList));
        JohtoBench3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoBench3ActionPerformed(evt);
            }
        });
        AutoCompleteDecorator.decorate(JohtoBench3);
        Background.add(JohtoBench3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 100, 20));

        JohtoBench3Energy1.setBackground(java.awt.Color.lightGray);
        JohtoBench3Energy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench3Energy1MouseClicked(evt);
            }
        });
        Background.add(JohtoBench3Energy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, 20));
        Background.setLayer(JohtoBench3Energy1, 1);

        JohtoBench3Energy2.setBackground(java.awt.Color.lightGray);
        JohtoBench3Energy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench3Energy2MouseClicked(evt);
            }
        });
        Background.add(JohtoBench3Energy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 30, 20));
        Background.setLayer(JohtoBench3Energy2, 2);

        JohtoBench3Energy3.setBackground(java.awt.Color.lightGray);
        JohtoBench3Energy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench3Energy3MouseClicked(evt);
            }
        });
        Background.add(JohtoBench3Energy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 30, 20));
        Background.setLayer(JohtoBench3Energy3, 3);

        JohtoBench3Energy4.setBackground(java.awt.Color.lightGray);
        JohtoBench3Energy4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench3Energy4MouseClicked(evt);
            }
        });
        Background.add(JohtoBench3Energy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 30, 20));
        Background.setLayer(JohtoBench3Energy4, 4);

        JohtoBench2.setEditable(true);
        JohtoBench2.setModel(new javax.swing.DefaultComboBoxModel(PokemonList));
        JohtoBench2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoBench2ActionPerformed(evt);
            }
        });
        AutoCompleteDecorator.decorate(JohtoBench2);
        Background.add(JohtoBench2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 100, 20));

        JohtoBench2Energy1.setBackground(java.awt.Color.lightGray);
        JohtoBench2Energy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench2Energy1MouseClicked(evt);
            }
        });
        Background.add(JohtoBench2Energy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, 20));
        Background.setLayer(JohtoBench2Energy1, 1);

        JohtoBench2Energy2.setBackground(java.awt.Color.lightGray);
        JohtoBench2Energy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench2Energy2MouseClicked(evt);
            }
        });
        Background.add(JohtoBench2Energy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 30, 20));
        Background.setLayer(JohtoBench2Energy2, 2);

        JohtoBench2Energy3.setBackground(java.awt.Color.lightGray);
        JohtoBench2Energy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench2Energy3MouseClicked(evt);
            }
        });
        Background.add(JohtoBench2Energy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 30, 20));
        Background.setLayer(JohtoBench2Energy3, 3);

        JohtoBench2Energy4.setBackground(java.awt.Color.lightGray);
        JohtoBench2Energy4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench2Energy4MouseClicked(evt);
            }
        });
        JohtoBench2Energy4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoBench2Energy4ActionPerformed(evt);
            }
        });
        Background.add(JohtoBench2Energy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 30, 20));
        Background.setLayer(JohtoBench2Energy4, 4);

        JohtoBench1.setEditable(true);
        JohtoBench1.setModel(new javax.swing.DefaultComboBoxModel(PokemonList));
        JohtoBench1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoBench1ActionPerformed(evt);
            }
        });
        AutoCompleteDecorator.decorate(JohtoBench1);
        Background.add(JohtoBench1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 20));

        JohtoBench1Energy4.setBackground(java.awt.Color.lightGray);
        JohtoBench1Energy4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench1Energy4MouseClicked(evt);
            }
        });
        Background.add(JohtoBench1Energy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 30, 20));
        Background.setLayer(JohtoBench1Energy4, 4);

        JohtoBench1Energy3.setBackground(java.awt.Color.lightGray);
        JohtoBench1Energy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench1Energy3MouseClicked(evt);
            }
        });
        Background.add(JohtoBench1Energy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 30, 20));
        Background.setLayer(JohtoBench1Energy3, 3);

        JohtoBench1Energy2.setBackground(java.awt.Color.lightGray);
        JohtoBench1Energy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench1Energy2MouseClicked(evt);
            }
        });
        Background.add(JohtoBench1Energy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 30, 20));
        Background.setLayer(JohtoBench1Energy2, 2);

        JohtoBench1Energy1.setBackground(java.awt.Color.lightGray);
        JohtoBench1Energy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench1Energy1MouseClicked(evt);
            }
        });
        Background.add(JohtoBench1Energy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));
        Background.setLayer(JohtoBench1Energy1, 1);

        KantoActive.setEditable(true);
        KantoActive.setModel(new javax.swing.DefaultComboBoxModel(PokemonList));
        KantoActive.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                KantoActiveItemStateChanged(evt);
            }
        });
        KantoActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoActiveActionPerformed(evt);
            }
        });
        AutoCompleteDecorator.decorate(KantoActive);
        Background.add(KantoActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 210, 20));

        KantoBench1.setEditable(true);
        KantoBench1.setModel(new javax.swing.DefaultComboBoxModel(PokemonList));
        KantoBench1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoBench1ActionPerformed(evt);
            }
        });
        AutoCompleteDecorator.decorate(KantoBench1);
        Background.add(KantoBench1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 100, 20));

        KantoBench2.setEditable(true);
        KantoBench2.setModel(new javax.swing.DefaultComboBoxModel(PokemonList));
        KantoBench2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoBench2ActionPerformed(evt);
            }
        });
        AutoCompleteDecorator.decorate(KantoBench2);
        Background.add(KantoBench2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, 100, 20));

        KantoBench3.setEditable(true);
        KantoBench3.setModel(new javax.swing.DefaultComboBoxModel(PokemonList));
        KantoBench3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoBench3ActionPerformed(evt);
            }
        });
        AutoCompleteDecorator.decorate(KantoBench3);
        Background.add(KantoBench3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, 100, 20));

        KantoBench4.setEditable(true);
        KantoBench4.setModel(new javax.swing.DefaultComboBoxModel(PokemonList));
        KantoBench4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoBench4ActionPerformed(evt);
            }
        });
        AutoCompleteDecorator.decorate(KantoBench4);
        Background.add(KantoBench4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 620, 100, 20));

        KantoBench5.setEditable(true);
        KantoBench5.setModel(new javax.swing.DefaultComboBoxModel(PokemonList));
        KantoBench5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoBench5ActionPerformed(evt);
            }
        });
        AutoCompleteDecorator.decorate(KantoBench5);
        Background.add(KantoBench5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, 100, 20));

        ClearButton.setBackground(new java.awt.Color(0, 0, 0));
        ClearButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(204, 0, 0));
        ClearButton.setText("X");
        ClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearButtonMouseClicked(evt);
            }
        });
        Background.add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 50, -1));

        JohtoPlus.setBackground(new java.awt.Color(255, 0, 0));
        JohtoPlus.setText("+");
        JohtoPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoPlusMouseClicked(evt);
            }
        });
        JohtoPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoPlusActionPerformed(evt);
            }
        });
        Background.add(JohtoPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));
        Background.setLayer(JohtoPlus, 2);

        JohtoMinus.setBackground(new java.awt.Color(255, 0, 0));
        JohtoMinus.setText("-");
        JohtoMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoMinusMouseClicked(evt);
            }
        });
        Background.add(JohtoMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));
        Background.setLayer(JohtoMinus, 2);

        JohtoDamageNumB5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JohtoDamageNumB5.setText("0");
        JohtoDamageNumB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoDamageNumB5ActionPerformed(evt);
            }
        });
        Background.add(JohtoDamageNumB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 40, -1));

        JohtoDamageNum.setEditable(false);
        JohtoDamageNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JohtoDamageNum.setText("0");
        JohtoDamageNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoDamageNumActionPerformed(evt);
            }
        });
        Background.add(JohtoDamageNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 40, -1));

        JohtoDamageNumB4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JohtoDamageNumB4.setText("0");
        JohtoDamageNumB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoDamageNumB4ActionPerformed(evt);
            }
        });
        Background.add(JohtoDamageNumB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 40, -1));

        JohtoDamageNumB3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JohtoDamageNumB3.setText("0");
        JohtoDamageNumB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoDamageNumB3ActionPerformed(evt);
            }
        });
        Background.add(JohtoDamageNumB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 40, -1));

        JohtoDamageNumB2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JohtoDamageNumB2.setText("0");
        JohtoDamageNumB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoDamageNumB2ActionPerformed(evt);
            }
        });
        Background.add(JohtoDamageNumB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 40, -1));

        JohtoDamageNumB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JohtoDamageNumB1.setText("0");
        JohtoDamageNumB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoDamageNumB1ActionPerformed(evt);
            }
        });
        Background.add(JohtoDamageNumB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 40, -1));

        KantoPlus.setBackground(new java.awt.Color(255, 255, 255));
        KantoPlus.setText("+");
        KantoPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoPlusMouseClicked(evt);
            }
        });
        KantoPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoPlusActionPerformed(evt);
            }
        });
        Background.add(KantoPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));
        Background.setLayer(KantoPlus, 2);

        KantoMinus.setBackground(new java.awt.Color(255, 255, 255));
        KantoMinus.setText("-");
        KantoMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoMinusMouseClicked(evt);
            }
        });
        Background.add(KantoMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));
        Background.setLayer(KantoMinus, 2);

        KantoDamageNum.setEditable(false);
        KantoDamageNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KantoDamageNum.setText("0");
        Background.add(KantoDamageNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 40, -1));

        KantoDamageNumB5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KantoDamageNumB5.setText("0");
        KantoDamageNumB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoDamageNumB5ActionPerformed(evt);
            }
        });
        Background.add(KantoDamageNumB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 40, -1));

        KantoDamageNumB4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KantoDamageNumB4.setText("0");
        KantoDamageNumB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoDamageNumB4ActionPerformed(evt);
            }
        });
        Background.add(KantoDamageNumB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, 40, -1));

        KantoDamageNumB3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KantoDamageNumB3.setText("0");
        KantoDamageNumB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoDamageNumB3ActionPerformed(evt);
            }
        });
        Background.add(KantoDamageNumB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 640, 40, -1));

        KantoDamageNumB2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KantoDamageNumB2.setText("0");
        KantoDamageNumB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoDamageNumB2ActionPerformed(evt);
            }
        });
        Background.add(KantoDamageNumB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 640, 40, -1));

        KantoDamageNumB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KantoDamageNumB1.setText("0");
        KantoDamageNumB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoDamageNumB1ActionPerformed(evt);
            }
        });
        Background.add(KantoDamageNumB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 40, -1));
        Background.add(StadiumCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 186, 260));

        JohtoCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.png"))); // NOI18N
        JohtoCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoCardMouseClicked(evt);
            }
        });
        Background.add(JohtoCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 134, 190));

        KantoCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.png"))); // NOI18N
        Background.add(KantoCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 134, 190));

        mid.setBackground(new java.awt.Color(0, 0, 0));
        mid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boackground2-1.png"))); // NOI18N
        mid.setAlignmentY(0.0F);
        mid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        mid.setMaximumSize(new java.awt.Dimension(750, 469));
        mid.setMinimumSize(new java.awt.Dimension(750, 469));
        mid.setPreferredSize(new java.awt.Dimension(750, 469));
        Background.add(mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 750, 430));
        mid.getAccessibleContext().setAccessibleName("mid");

        Kanto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Kanto copy.png"))); // NOI18N
        Kanto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Background.add(Kanto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 750, 170));

        Johto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Johto copy.png"))); // NOI18N
        Johto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Background.add(Johto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 150));

        KantoActiveEnergy1.setBackground(java.awt.Color.lightGray);
        KantoActiveEnergy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoActiveEnergy1MouseClicked(evt);
            }
        });
        Background.add(KantoActiveEnergy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, 20));
        Background.setLayer(KantoActiveEnergy1, 1);

        KantoActiveEnergy2.setBackground(java.awt.Color.lightGray);
        KantoActiveEnergy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoActiveEnergy2MouseClicked(evt);
            }
        });
        Background.add(KantoActiveEnergy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 30, 20));
        Background.setLayer(KantoActiveEnergy2, 2);

        KantoActiveEnergy3.setBackground(java.awt.Color.lightGray);
        KantoActiveEnergy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoActiveEnergy3MouseClicked(evt);
            }
        });
        Background.add(KantoActiveEnergy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 30, 20));
        Background.setLayer(KantoActiveEnergy3, 3);

        KantoActiveEnergy4.setBackground(java.awt.Color.lightGray);
        KantoActiveEnergy4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoActiveEnergy4MouseClicked(evt);
            }
        });
        Background.add(KantoActiveEnergy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 30, 20));
        Background.setLayer(KantoActiveEnergy4, 4);

        KantoBench5Energy4.setBackground(java.awt.Color.lightGray);
        KantoBench5Energy4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench5Energy4MouseClicked(evt);
            }
        });
        Background.add(KantoBench5Energy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 600, 30, 20));
        Background.setLayer(KantoBench5Energy4, 4);

        KantoBench5Energy3.setBackground(java.awt.Color.lightGray);
        KantoBench5Energy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench5Energy3MouseClicked(evt);
            }
        });
        Background.add(KantoBench5Energy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, 30, 20));
        Background.setLayer(KantoBench5Energy3, 3);

        KantoBench5Energy2.setBackground(java.awt.Color.lightGray);
        KantoBench5Energy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench5Energy2MouseClicked(evt);
            }
        });
        Background.add(KantoBench5Energy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 600, 30, 20));
        Background.setLayer(KantoBench5Energy2, 2);

        KantoBench5Energy1.setBackground(java.awt.Color.lightGray);
        KantoBench5Energy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench5Energy1MouseClicked(evt);
            }
        });
        Background.add(KantoBench5Energy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 600, -1, 20));
        Background.setLayer(KantoBench5Energy1, 1);

        KantoBench4Energy4.setBackground(java.awt.Color.lightGray);
        KantoBench4Energy4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench4Energy4MouseClicked(evt);
            }
        });
        Background.add(KantoBench4Energy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 600, 30, 20));
        Background.setLayer(KantoBench4Energy4, 4);

        KantoBench4Energy3.setBackground(java.awt.Color.lightGray);
        KantoBench4Energy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench4Energy3MouseClicked(evt);
            }
        });
        Background.add(KantoBench4Energy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 600, 30, 20));
        Background.setLayer(KantoBench4Energy3, 3);

        KantoBench4Energy2.setBackground(java.awt.Color.lightGray);
        KantoBench4Energy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench4Energy2MouseClicked(evt);
            }
        });
        Background.add(KantoBench4Energy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 600, 30, 20));
        Background.setLayer(KantoBench4Energy2, 2);

        KantoBench4Energy1.setBackground(java.awt.Color.lightGray);
        KantoBench4Energy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench4Energy1MouseClicked(evt);
            }
        });
        Background.add(KantoBench4Energy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, -1, 20));
        Background.setLayer(KantoBench4Energy1, 1);

        KantoBench3Energy4.setBackground(java.awt.Color.lightGray);
        KantoBench3Energy4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench3Energy4MouseClicked(evt);
            }
        });
        Background.add(KantoBench3Energy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 600, 30, 20));
        Background.setLayer(KantoBench3Energy4, 4);

        KantoBench3Energy3.setBackground(java.awt.Color.lightGray);
        KantoBench3Energy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench3Energy3MouseClicked(evt);
            }
        });
        Background.add(KantoBench3Energy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, 30, 20));
        Background.setLayer(KantoBench3Energy3, 3);

        KantoBench3Energy2.setBackground(java.awt.Color.lightGray);
        KantoBench3Energy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench3Energy2MouseClicked(evt);
            }
        });
        Background.add(KantoBench3Energy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, 30, 20));
        Background.setLayer(KantoBench3Energy2, 2);

        KantoBench3Energy1.setBackground(java.awt.Color.lightGray);
        KantoBench3Energy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench3Energy1MouseClicked(evt);
            }
        });
        Background.add(KantoBench3Energy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, -1, 20));
        Background.setLayer(KantoBench3Energy1, 1);

        KantoBench2Energy4.setBackground(java.awt.Color.lightGray);
        KantoBench2Energy4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench2Energy4MouseClicked(evt);
            }
        });
        KantoBench2Energy4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoBench2Energy4ActionPerformed(evt);
            }
        });
        Background.add(KantoBench2Energy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 600, 30, 20));
        Background.setLayer(KantoBench2Energy4, 4);

        KantoBench2Energy3.setBackground(java.awt.Color.lightGray);
        KantoBench2Energy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench2Energy3MouseClicked(evt);
            }
        });
        Background.add(KantoBench2Energy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, 30, 20));
        Background.setLayer(KantoBench2Energy3, 3);

        KantoBench2Energy2.setBackground(java.awt.Color.lightGray);
        KantoBench2Energy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench2Energy2MouseClicked(evt);
            }
        });
        Background.add(KantoBench2Energy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 30, 20));
        Background.setLayer(KantoBench2Energy2, 2);

        KantoBench2Energy1.setBackground(java.awt.Color.lightGray);
        KantoBench2Energy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench2Energy1MouseClicked(evt);
            }
        });
        Background.add(KantoBench2Energy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, -1, 20));
        Background.setLayer(KantoBench2Energy1, 1);

        KantoBench1Energy4.setBackground(java.awt.Color.lightGray);
        KantoBench1Energy4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench1Energy4MouseClicked(evt);
            }
        });
        Background.add(KantoBench1Energy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 30, 20));
        Background.setLayer(KantoBench1Energy4, 4);

        KantoBench1Energy3.setBackground(java.awt.Color.lightGray);
        KantoBench1Energy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench1Energy3MouseClicked(evt);
            }
        });
        Background.add(KantoBench1Energy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 30, 20));
        Background.setLayer(KantoBench1Energy3, 3);

        KantoBench1Energy2.setBackground(java.awt.Color.lightGray);
        KantoBench1Energy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench1Energy2MouseClicked(evt);
            }
        });
        Background.add(KantoBench1Energy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 30, 20));
        Background.setLayer(KantoBench1Energy2, 2);

        KantoBench1Energy1.setBackground(java.awt.Color.lightGray);
        KantoBench1Energy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench1Energy1MouseClicked(evt);
            }
        });
        Background.add(KantoBench1Energy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, 20));
        Background.setLayer(KantoBench1Energy1, 1);

        JohtoPZ.setBackground(java.awt.Color.lightGray);
        JohtoPZ.setText("PZ");
        JohtoPZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoPZMouseClicked(evt);
            }
        });
        Background.add(JohtoPZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));
        Background.setLayer(JohtoPZ, 2);

        JohtoSL.setBackground(java.awt.Color.lightGray);
        JohtoSL.setText("SL");
        JohtoSL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoSLMouseClicked(evt);
            }
        });
        Background.add(JohtoSL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));
        Background.setLayer(JohtoSL, 2);

        JohtoPO.setBackground(java.awt.Color.lightGray);
        JohtoPO.setText("PO");
        JohtoPO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoPOMouseClicked(evt);
            }
        });
        Background.add(JohtoPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));
        Background.setLayer(JohtoPO, 2);

        JohtoBR.setBackground(java.awt.Color.lightGray);
        JohtoBR.setText("BR");
        JohtoBR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBRMouseClicked(evt);
            }
        });
        Background.add(JohtoBR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));
        Background.setLayer(JohtoBR, 2);

        JohtoCN.setBackground(java.awt.Color.lightGray);
        JohtoCN.setText("CN");
        JohtoCN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoCNMouseClicked(evt);
            }
        });
        Background.add(JohtoCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));
        Background.setLayer(JohtoCN, 2);

        KantoCN.setBackground(java.awt.Color.lightGray);
        KantoCN.setText("CN");
        KantoCN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoCNMouseClicked(evt);
            }
        });
        Background.add(KantoCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, -1, -1));
        Background.setLayer(KantoCN, 2);

        KantoBR.setBackground(java.awt.Color.lightGray);
        KantoBR.setText("BR");
        KantoBR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBRMouseClicked(evt);
            }
        });
        KantoBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoBRActionPerformed(evt);
            }
        });
        Background.add(KantoBR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, -1, -1));
        Background.setLayer(KantoBR, 2);

        KantoPO.setBackground(java.awt.Color.lightGray);
        KantoPO.setText("PO");
        KantoPO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoPOMouseClicked(evt);
            }
        });
        Background.add(KantoPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, -1, -1));
        Background.setLayer(KantoPO, 2);

        KantoSL.setBackground(java.awt.Color.lightGray);
        KantoSL.setText("SL");
        KantoSL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoSLMouseClicked(evt);
            }
        });
        Background.add(KantoSL, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, -1, -1));
        Background.setLayer(KantoSL, 2);

        KantoPZ.setBackground(java.awt.Color.lightGray);
        KantoPZ.setText("PZ");
        KantoPZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoPZMouseClicked(evt);
            }
        });
        Background.add(KantoPZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, -1, -1));
        Background.setLayer(KantoPZ, 2);

        KantoBench5Switch.setBackground(new java.awt.Color(255, 255, 255));
        KantoBench5Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switch.png"))); // NOI18N
        KantoBench5Switch.setPreferredSize(new java.awt.Dimension(33, 10));
        KantoBench5Switch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench5SwitchMouseClicked(evt);
            }
        });
        KantoBench5Switch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoBench5SwitchActionPerformed(evt);
            }
        });
        Background.add(KantoBench5Switch, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 640, 40, 30));
        Background.setLayer(KantoBench5Switch, 2);

        KantoBench4Switch.setBackground(new java.awt.Color(255, 255, 255));
        KantoBench4Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switch.png"))); // NOI18N
        KantoBench4Switch.setPreferredSize(new java.awt.Dimension(33, 10));
        KantoBench4Switch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench4SwitchMouseClicked(evt);
            }
        });
        KantoBench4Switch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoBench4SwitchActionPerformed(evt);
            }
        });
        Background.add(KantoBench4Switch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 640, 40, 30));
        Background.setLayer(KantoBench4Switch, 2);

        KantoBench3Switch.setBackground(new java.awt.Color(255, 255, 255));
        KantoBench3Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switch.png"))); // NOI18N
        KantoBench3Switch.setPreferredSize(new java.awt.Dimension(33, 10));
        KantoBench3Switch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench3SwitchMouseClicked(evt);
            }
        });
        KantoBench3Switch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoBench3SwitchActionPerformed(evt);
            }
        });
        Background.add(KantoBench3Switch, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 640, 40, 30));
        Background.setLayer(KantoBench3Switch, 2);

        KantoBench2Switch.setBackground(new java.awt.Color(255, 255, 255));
        KantoBench2Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switch.png"))); // NOI18N
        KantoBench2Switch.setPreferredSize(new java.awt.Dimension(33, 10));
        KantoBench2Switch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench2SwitchMouseClicked(evt);
            }
        });
        KantoBench2Switch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoBench2SwitchActionPerformed(evt);
            }
        });
        Background.add(KantoBench2Switch, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 640, 40, 30));
        Background.setLayer(KantoBench2Switch, 2);

        KantoBench1Switch.setBackground(new java.awt.Color(255, 255, 255));
        KantoBench1Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switch.png"))); // NOI18N
        KantoBench1Switch.setPreferredSize(new java.awt.Dimension(33, 10));
        KantoBench1Switch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoBench1SwitchMouseClicked(evt);
            }
        });
        KantoBench1Switch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoBench1SwitchActionPerformed(evt);
            }
        });
        Background.add(KantoBench1Switch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 40, 30));
        Background.setLayer(KantoBench1Switch, 2);

        JohtoBench5Switch.setBackground(new java.awt.Color(255, 0, 0));
        JohtoBench5Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switch.png"))); // NOI18N
        JohtoBench5Switch.setPreferredSize(new java.awt.Dimension(33, 10));
        JohtoBench5Switch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench5SwitchMouseClicked(evt);
            }
        });
        JohtoBench5Switch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoBench5SwitchActionPerformed(evt);
            }
        });
        Background.add(JohtoBench5Switch, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 40, 30));
        Background.setLayer(JohtoBench5Switch, 2);

        JohtoBench4Switch.setBackground(new java.awt.Color(255, 0, 0));
        JohtoBench4Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switch.png"))); // NOI18N
        JohtoBench4Switch.setPreferredSize(new java.awt.Dimension(33, 10));
        JohtoBench4Switch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench4SwitchMouseClicked(evt);
            }
        });
        JohtoBench4Switch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoBench4SwitchActionPerformed(evt);
            }
        });
        Background.add(JohtoBench4Switch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 40, 30));
        Background.setLayer(JohtoBench4Switch, 2);

        JohtoBench3Switch.setBackground(new java.awt.Color(255, 0, 0));
        JohtoBench3Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switch.png"))); // NOI18N
        JohtoBench3Switch.setPreferredSize(new java.awt.Dimension(33, 10));
        JohtoBench3Switch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench3SwitchMouseClicked(evt);
            }
        });
        JohtoBench3Switch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoBench3SwitchActionPerformed(evt);
            }
        });
        Background.add(JohtoBench3Switch, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 40, 30));
        Background.setLayer(JohtoBench3Switch, 2);

        JohtoBench2Switch.setBackground(new java.awt.Color(255, 0, 0));
        JohtoBench2Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switch.png"))); // NOI18N
        JohtoBench2Switch.setPreferredSize(new java.awt.Dimension(33, 10));
        JohtoBench2Switch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench2SwitchMouseClicked(evt);
            }
        });
        JohtoBench2Switch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoBench2SwitchActionPerformed(evt);
            }
        });
        Background.add(JohtoBench2Switch, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 40, 30));
        Background.setLayer(JohtoBench2Switch, 2);

        JohtoBench1Switch.setBackground(new java.awt.Color(255, 0, 0));
        JohtoBench1Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/switch.png"))); // NOI18N
        JohtoBench1Switch.setPreferredSize(new java.awt.Dimension(33, 10));
        JohtoBench1Switch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoBench1SwitchMouseClicked(evt);
            }
        });
        JohtoBench1Switch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoBench1SwitchActionPerformed(evt);
            }
        });
        Background.add(JohtoBench1Switch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 40, 30));
        Background.setLayer(JohtoBench1Switch, 2);

        KantoClear.setBackground(new java.awt.Color(255, 255, 255));
        KantoClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        KantoClear.setForeground(new java.awt.Color(255, 0, 0));
        KantoClear.setText("X");
        KantoClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoClearMouseClicked(evt);
            }
        });
        KantoClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KantoClearActionPerformed(evt);
            }
        });
        Background.add(KantoClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, -1, -1));
        Background.setLayer(KantoClear, 2);

        JohtoClear.setBackground(new java.awt.Color(255, 0, 0));
        JohtoClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JohtoClear.setText("X");
        JohtoClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoClearMouseClicked(evt);
            }
        });
        JohtoClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JohtoClearActionPerformed(evt);
            }
        });
        Background.add(JohtoClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));
        Background.setLayer(JohtoClear, 2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JohtoActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoActiveActionPerformed

    private void JohtoBench1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoBench1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench1ActionPerformed

    private void JohtoBench2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoBench2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench2ActionPerformed

    private void JohtoBench3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoBench3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench3ActionPerformed

    private void JohtoBench4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoBench4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench4ActionPerformed

    private void JohtoBench5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoBench5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench5ActionPerformed

    private void KantoBench1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoBench1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench1ActionPerformed

    private void KantoBench2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoBench2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench2ActionPerformed

    private void KantoBench3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoBench3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench3ActionPerformed

    private void KantoBench4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoBench4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench4ActionPerformed

    private void KantoBench5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoBench5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench5ActionPerformed

    private void JohtoBench1Energy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench1Energy1MouseClicked
        OneEnergy(JohtoBench1Energy1,JohtoBench1Energy2,JohtoBench1Energy3,JohtoBench1Energy4, Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench1Energy1MouseClicked

    private void JohtoBench1Energy4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench1Energy4MouseClicked
        FourEnergy(JohtoBench1Energy1,JohtoBench1Energy2,JohtoBench1Energy3,JohtoBench1Energy4, Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench1Energy4MouseClicked

    private void JohtoBench1Energy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench1Energy3MouseClicked
        ThreeEnergy(JohtoBench1Energy1,JohtoBench1Energy2,JohtoBench1Energy3,JohtoBench1Energy4, Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench1Energy3MouseClicked

    private void JohtoBench1Energy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench1Energy2MouseClicked
        TwoEnergy(JohtoBench1Energy1,JohtoBench1Energy2,JohtoBench1Energy3,JohtoBench1Energy4, Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench1Energy2MouseClicked

    private void JohtoBench2Energy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench2Energy1MouseClicked
        OneEnergy(JohtoBench2Energy1,JohtoBench2Energy2,JohtoBench2Energy3,JohtoBench2Energy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench2Energy1MouseClicked

    private void JohtoBench2Energy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench2Energy2MouseClicked
        TwoEnergy(JohtoBench2Energy1,JohtoBench2Energy2,JohtoBench2Energy3,JohtoBench2Energy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench2Energy2MouseClicked

    private void JohtoBench2Energy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench2Energy3MouseClicked
        ThreeEnergy(JohtoBench2Energy1,JohtoBench2Energy2,JohtoBench2Energy3,JohtoBench2Energy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench2Energy3MouseClicked

    private void JohtoBench2Energy4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench2Energy4MouseClicked
        FourEnergy(JohtoBench2Energy1,JohtoBench2Energy2,JohtoBench2Energy3,JohtoBench2Energy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench2Energy4MouseClicked

    private void JohtoBench3Energy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench3Energy1MouseClicked
        OneEnergy(JohtoBench3Energy1,JohtoBench3Energy2,JohtoBench3Energy3,JohtoBench3Energy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench3Energy1MouseClicked

    private void JohtoBench3Energy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench3Energy2MouseClicked
        TwoEnergy(JohtoBench3Energy1,JohtoBench3Energy2,JohtoBench3Energy3,JohtoBench3Energy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench3Energy2MouseClicked

    private void JohtoBench3Energy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench3Energy3MouseClicked
        ThreeEnergy(JohtoBench3Energy1,JohtoBench3Energy2,JohtoBench3Energy3,JohtoBench3Energy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench3Energy3MouseClicked

    private void JohtoBench3Energy4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench3Energy4MouseClicked
        FourEnergy(JohtoBench3Energy1,JohtoBench3Energy2,JohtoBench3Energy3,JohtoBench3Energy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench3Energy4MouseClicked

    private void JohtoBench4Energy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench4Energy1MouseClicked
        OneEnergy(JohtoBench4Energy1,JohtoBench4Energy2,JohtoBench4Energy3,JohtoBench4Energy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench4Energy1MouseClicked

    private void JohtoBench4Energy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench4Energy2MouseClicked
        TwoEnergy(JohtoBench4Energy1,JohtoBench4Energy2,JohtoBench4Energy3,JohtoBench4Energy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench4Energy2MouseClicked

    private void JohtoBench4Energy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench4Energy3MouseClicked
        ThreeEnergy(JohtoBench4Energy1,JohtoBench4Energy2,JohtoBench4Energy3,JohtoBench4Energy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench4Energy3MouseClicked

    private void JohtoBench4Energy4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench4Energy4MouseClicked
        FourEnergy(JohtoBench4Energy1,JohtoBench4Energy2,JohtoBench4Energy3,JohtoBench4Energy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench4Energy4MouseClicked

    private void JohtoBench5Energy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench5Energy1MouseClicked
        OneEnergy(JohtoBench5Energy1,JohtoBench5Energy2,JohtoBench5Energy3,JohtoBench5Energy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench5Energy1MouseClicked

    private void JohtoBench5Energy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench5Energy2MouseClicked
        TwoEnergy(JohtoBench5Energy1,JohtoBench5Energy2,JohtoBench5Energy3,JohtoBench5Energy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench5Energy2MouseClicked

    private void JohtoBench5Energy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench5Energy3MouseClicked
        ThreeEnergy(JohtoBench5Energy1,JohtoBench5Energy2,JohtoBench5Energy3,JohtoBench5Energy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench5Energy3MouseClicked

    private void JohtoBench5Energy4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench5Energy4MouseClicked
        FourEnergy(JohtoBench5Energy1,JohtoBench5Energy2,JohtoBench5Energy3,JohtoBench5Energy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench5Energy4MouseClicked

    private void JohtoActiveEnergy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoActiveEnergy1MouseClicked
        OneEnergy(JohtoActiveEnergy1,JohtoActiveEnergy2,JohtoActiveEnergy3,JohtoActiveEnergy4, Color.BLACK);         // TODO add your handling code here:
    }//GEN-LAST:event_JohtoActiveEnergy1MouseClicked

    private void JohtoActiveEnergy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoActiveEnergy2MouseClicked
        TwoEnergy(JohtoActiveEnergy1,JohtoActiveEnergy2,JohtoActiveEnergy3,JohtoActiveEnergy4, Color.BLACK);         // TODO add your handling code here:
    }//GEN-LAST:event_JohtoActiveEnergy2MouseClicked

    private void JohtoActiveEnergy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoActiveEnergy3MouseClicked
        ThreeEnergy(JohtoActiveEnergy1,JohtoActiveEnergy2,JohtoActiveEnergy3,JohtoActiveEnergy4, Color.BLACK);         // TODO add your handling code here:
    }//GEN-LAST:event_JohtoActiveEnergy3MouseClicked

    private void JohtoActiveEnergy4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoActiveEnergy4MouseClicked
        FourEnergy(JohtoActiveEnergy1,JohtoActiveEnergy2,JohtoActiveEnergy3,JohtoActiveEnergy4, Color.BLACK);          // TODO add your handling code here:
    }//GEN-LAST:event_JohtoActiveEnergy4MouseClicked

    private void JohtoBench2Energy4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoBench2Energy4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench2Energy4ActionPerformed

    private void KantoActiveEnergy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoActiveEnergy1MouseClicked
        OneEnergy(KantoActiveEnergy1,KantoActiveEnergy2,KantoActiveEnergy3,KantoActiveEnergy4, Color.RED);          // TODO add your handling code here:
    }//GEN-LAST:event_KantoActiveEnergy1MouseClicked

    private void KantoActiveEnergy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoActiveEnergy2MouseClicked
        TwoEnergy(KantoActiveEnergy1,KantoActiveEnergy2,KantoActiveEnergy3,KantoActiveEnergy4, Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoActiveEnergy2MouseClicked

    private void KantoActiveEnergy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoActiveEnergy3MouseClicked
        ThreeEnergy(KantoActiveEnergy1,KantoActiveEnergy2,KantoActiveEnergy3,KantoActiveEnergy4, Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoActiveEnergy3MouseClicked

    private void KantoActiveEnergy4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoActiveEnergy4MouseClicked
        FourEnergy(KantoActiveEnergy1,KantoActiveEnergy2,KantoActiveEnergy3,KantoActiveEnergy4, Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoActiveEnergy4MouseClicked

    private void KantoBench5Energy4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench5Energy4MouseClicked
        FourEnergy(KantoBench5Energy1,KantoBench5Energy2,KantoBench5Energy3,KantoBench5Energy4, Color.RED);         // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench5Energy4MouseClicked

    private void KantoBench5Energy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench5Energy3MouseClicked
        ThreeEnergy(KantoBench5Energy1,KantoBench5Energy2,KantoBench5Energy3,KantoBench5Energy4, Color.RED);         // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench5Energy3MouseClicked

    private void KantoBench5Energy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench5Energy2MouseClicked
        TwoEnergy(KantoBench5Energy1,KantoBench5Energy2,KantoBench5Energy3,KantoBench5Energy4, Color.RED);         // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench5Energy2MouseClicked

    private void KantoBench5Energy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench5Energy1MouseClicked
        OneEnergy(KantoBench5Energy1,KantoBench5Energy2,KantoBench5Energy3,KantoBench5Energy4, Color.RED);         // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench5Energy1MouseClicked

    private void KantoBench4Energy4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench4Energy4MouseClicked
        FourEnergy(KantoBench4Energy1,KantoBench4Energy2,KantoBench4Energy3,KantoBench4Energy4, Color.RED);         // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench4Energy4MouseClicked

    private void KantoBench4Energy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench4Energy3MouseClicked
        ThreeEnergy(KantoBench4Energy1,KantoBench4Energy2,KantoBench4Energy3,KantoBench4Energy4, Color.RED);         // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench4Energy3MouseClicked

    private void KantoBench4Energy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench4Energy2MouseClicked
        TwoEnergy(KantoBench4Energy1,KantoBench4Energy2,KantoBench4Energy3,KantoBench4Energy4, Color.RED);         // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench4Energy2MouseClicked

    private void KantoBench4Energy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench4Energy1MouseClicked
        OneEnergy(KantoBench4Energy1,KantoBench4Energy2,KantoBench4Energy3,KantoBench4Energy4, Color.RED);         // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench4Energy1MouseClicked

    private void KantoBench3Energy4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench3Energy4MouseClicked
        FourEnergy(KantoBench3Energy1,KantoBench3Energy2,KantoBench3Energy3,KantoBench3Energy4, Color.RED);         // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench3Energy4MouseClicked

    private void KantoBench3Energy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench3Energy3MouseClicked
        ThreeEnergy(KantoBench3Energy1,KantoBench3Energy2,KantoBench3Energy3,KantoBench3Energy4, Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench3Energy3MouseClicked

    private void KantoBench3Energy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench3Energy2MouseClicked
        TwoEnergy(KantoBench3Energy1,KantoBench3Energy2,KantoBench3Energy3,KantoBench3Energy4, Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench3Energy2MouseClicked

    private void KantoBench3Energy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench3Energy1MouseClicked
        OneEnergy(KantoBench3Energy1,KantoBench3Energy2,KantoBench3Energy3,KantoBench3Energy4, Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench3Energy1MouseClicked

    private void KantoBench2Energy4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench2Energy4MouseClicked
        FourEnergy(KantoBench2Energy1,KantoBench2Energy2,KantoBench2Energy3,KantoBench2Energy4, Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench2Energy4MouseClicked

    private void KantoBench2Energy4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoBench2Energy4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench2Energy4ActionPerformed

    private void KantoBench2Energy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench2Energy3MouseClicked
        ThreeEnergy(KantoBench2Energy1,KantoBench2Energy2,KantoBench2Energy3,KantoBench2Energy4, Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench2Energy3MouseClicked

    private void KantoBench2Energy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench2Energy2MouseClicked
        TwoEnergy(KantoBench2Energy1,KantoBench2Energy2,KantoBench2Energy3,KantoBench2Energy4, Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench2Energy2MouseClicked

    private void KantoBench2Energy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench2Energy1MouseClicked
        OneEnergy(KantoBench2Energy1,KantoBench2Energy2,KantoBench2Energy3,KantoBench2Energy4, Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench2Energy1MouseClicked

    private void KantoBench1Energy4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench1Energy4MouseClicked
        FourEnergy(KantoBench1Energy1,KantoBench1Energy2,KantoBench1Energy3,KantoBench1Energy4, Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench1Energy4MouseClicked

    private void KantoBench1Energy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench1Energy3MouseClicked
       ThreeEnergy(KantoBench1Energy1,KantoBench1Energy2,KantoBench1Energy3,KantoBench1Energy4, Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench1Energy3MouseClicked

    private void KantoBench1Energy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench1Energy2MouseClicked
        TwoEnergy(KantoBench1Energy1,KantoBench1Energy2,KantoBench1Energy3,KantoBench1Energy4, Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench1Energy2MouseClicked

    private void KantoBench1Energy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench1Energy1MouseClicked
        OneEnergy(KantoBench1Energy1,KantoBench1Energy2,KantoBench1Energy3,KantoBench1Energy4, Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench1Energy1MouseClicked

    private void ClearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearButtonMouseClicked
        Reset();        // TODO add your handling code here:
    }//GEN-LAST:event_ClearButtonMouseClicked

    private void JohtoPZMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoPZMouseClicked
        if(JohtoPZ.getBackground()== Color.lightGray){
            JohtoPZ.setBackground(Color.yellow);
        }
        else{
            JohtoPZ.setBackground(Color.lightGray);
        }// TODO add your handling code here:
    }//GEN-LAST:event_JohtoPZMouseClicked

    private void JohtoSLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoSLMouseClicked
        if(JohtoSL.getBackground()== Color.lightGray){
            JohtoSL.setBackground(lightPurple);
        }
        else
        if(JohtoSL.getBackground()== lightPurple){
            JohtoSL.setBackground(darkPurple);
        }

        else
        JohtoSL.setBackground(Color.lightGray);// TODO add your handling code here:
    }//GEN-LAST:event_JohtoSLMouseClicked

    private void JohtoPOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoPOMouseClicked
        if(JohtoPO.getBackground()== Color.lightGray){
            JohtoPO.setBackground(limeGreen);
        }
        else
        if(JohtoPO.getBackground()== limeGreen){
            JohtoPO.setBackground(forestGreen);
        }

        else
        JohtoPO.setBackground(Color.lightGray);// TODO add your handling code here:
    }//GEN-LAST:event_JohtoPOMouseClicked

    private void JohtoBRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBRMouseClicked
        if(JohtoBR.getBackground()== Color.lightGray){
            JohtoBR.setBackground(Color.red);
        }
        else{
            JohtoBR.setBackground(Color.lightGray);
        }// TODO add your handling code here:
    }//GEN-LAST:event_JohtoBRMouseClicked

    private void JohtoCNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoCNMouseClicked
        if(JohtoCN.getBackground()== Color.lightGray){
            JohtoCN.setBackground(new Color(205,92,92));
        }
        else
        JohtoCN.setBackground(Color.lightGray);// TODO add your handling code here:
    }//GEN-LAST:event_JohtoCNMouseClicked

    private void KantoCNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoCNMouseClicked
        if(KantoCN.getBackground()== Color.lightGray){
            KantoCN.setBackground(new Color(205,92,92));
        }
        else
        KantoCN.setBackground(Color.lightGray);// TODO add your handling code here:
    }//GEN-LAST:event_KantoCNMouseClicked

    private void KantoBRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBRMouseClicked
        if(KantoBR.getBackground()== Color.lightGray){
            KantoBR.setBackground(Color.red);
        }
        else{
            KantoBR.setBackground(Color.lightGray);
        }// TODO add your handling code here:
    }//GEN-LAST:event_KantoBRMouseClicked

    private void KantoPOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoPOMouseClicked
        if(KantoPO.getBackground()== Color.lightGray){
            KantoPO.setBackground(limeGreen);
        }
        else
        if(KantoPO.getBackground()== limeGreen){
            KantoPO.setBackground(forestGreen);
        }

        else
        KantoPO.setBackground(Color.lightGray);// TODO add your handling code here:
    }//GEN-LAST:event_KantoPOMouseClicked

    private void KantoSLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoSLMouseClicked
        if(KantoSL.getBackground()== Color.lightGray){
            KantoSL.setBackground(lightPurple);
        }
        else
        if(KantoSL.getBackground()== lightPurple){
            KantoSL.setBackground(darkPurple);
        }

        else
        KantoSL.setBackground(Color.lightGray);// TODO add your handling code here:
    }//GEN-LAST:event_KantoSLMouseClicked

    private void KantoPZMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoPZMouseClicked
        if(KantoPZ.getBackground()== Color.lightGray){
            KantoPZ.setBackground(Color.yellow);
        }
        else{
            KantoPZ.setBackground(Color.lightGray);
        }// TODO add your handling code here:
    }//GEN-LAST:event_KantoPZMouseClicked

    private void KantoBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoBRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBRActionPerformed

    private void JohtoPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoPlusMouseClicked
        AddDamage(JohtoDamageNum); // TODO add your handling code here:
    }//GEN-LAST:event_JohtoPlusMouseClicked

    private void JohtoMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoMinusMouseClicked
        SubtractDamage (JohtoDamageNum); // TODO add your handling code here:
    }//GEN-LAST:event_JohtoMinusMouseClicked

    private void JohtoDamageNumB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoDamageNumB5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoDamageNumB5ActionPerformed

    private void KantoPlusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoPlusMouseClicked
        AddDamage(KantoDamageNum); // TODO add your handling code here:
    }//GEN-LAST:event_KantoPlusMouseClicked

    private void KantoMinusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoMinusMouseClicked
        SubtractDamage (KantoDamageNum); // TODO add your handling code here:
    }//GEN-LAST:event_KantoMinusMouseClicked

    private void KantoPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoPlusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoPlusActionPerformed

    private void JohtoDamageNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoDamageNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoDamageNumActionPerformed

    private void JohtoDamageNumB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoDamageNumB4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoDamageNumB4ActionPerformed

    private void JohtoDamageNumB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoDamageNumB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoDamageNumB3ActionPerformed

    private void JohtoDamageNumB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoDamageNumB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoDamageNumB2ActionPerformed

    private void JohtoDamageNumB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoDamageNumB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoDamageNumB1ActionPerformed

    private void JohtoPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoPlusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoPlusActionPerformed

    private void KantoDamageNumB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoDamageNumB5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoDamageNumB5ActionPerformed

    private void KantoDamageNumB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoDamageNumB4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoDamageNumB4ActionPerformed

    private void KantoDamageNumB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoDamageNumB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoDamageNumB3ActionPerformed

    private void KantoDamageNumB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoDamageNumB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoDamageNumB2ActionPerformed

    private void KantoDamageNumB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoDamageNumB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoDamageNumB1ActionPerformed

    private void KantoActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoActiveActionPerformed

    private void KantoActiveItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_KantoActiveItemStateChanged
String KantoString = (String)KantoActive.getSelectedItem();
DisplayCard(KantoString, KantoCard);

    }//GEN-LAST:event_KantoActiveItemStateChanged

    private void StadiumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_StadiumItemStateChanged
String StadiumString = (String)Stadium.getSelectedItem();
switch(StadiumString){
    case "Stadium": StadiumCard.setIcon(null); break;
    case "No Removal Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/No Removal Gym.png"))); break;
    case "The Rocket's Training Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/The Rocket's Training Gym.png"))); break;
    case "Celadon City Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Celadon City Gym.png"))); break;
    case "Cerulean City Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Cerulean City Gym.png"))); break;
    case "Pewter City Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Pewter City Gym.png"))); break;
    case "Vermillion City Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Vermillion City Gym.png"))); break;
    case "Narrow Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Narrow Gym.png"))); break;
    case "Chaos Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Chaos Gym.png"))); break;
    case "Resistance Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Resistance Gym.png"))); break;
    case "Cinnabar City Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Cinnabar City Gym.png"))); break;        
    case "Fuchsia City Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Fuchsia City Gym.png"))); break;        
    case "Rocket's Minefield Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Rocket's Minefield Gym.png"))); break;        
    case "Saffron City Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Saffron City Gym.png"))); break;        
    case "Viridian City Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Viridian City Gym.png"))); break;        
    case "Ecogym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Ecogym.png"))); break;        
    case "Sprout Tower": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Sprout Tower.png"))); break;        
    case "Healing Field": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Healing Field.png"))); break;        
    case "Rocket's Hideout": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Rocket's Hideout.png"))); break;        
    case "Lucky Stadium": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Lucky Stadium.png"))); break;        
    case "Pokemon Tower": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Pokemon Tower.png"))); break;        
    case "Broken Ground Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Broken Ground Gym.png"))); break;        
    case "Radio Tower": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Radio Tower.png"))); break;        
    case "Energy Stadium": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stadiums/Energy Stadium.png"))); break;        
}// TODO add your handling code here:
    }//GEN-LAST:event_StadiumItemStateChanged

    private void JohtoBench1SwitchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench1SwitchMouseClicked
    DamageSwitch(JohtoDamageNumB1, JohtoDamageNum);
    PokeSwitch(JohtoBench1,JohtoActive);
    EnergySwitch(JohtoBench1Energy1,JohtoBench1Energy2,JohtoBench1Energy3,JohtoBench1Energy4,
            JohtoActiveEnergy1,JohtoActiveEnergy2,JohtoActiveEnergy3,JohtoActiveEnergy4,Color.BLACK);
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench1SwitchMouseClicked

    private void JohtoBench1SwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoBench1SwitchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench1SwitchActionPerformed

    private void JohtoBench2SwitchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench2SwitchMouseClicked
    DamageSwitch(JohtoDamageNumB2, JohtoDamageNum);
    PokeSwitch(JohtoBench2,JohtoActive);
    EnergySwitch(JohtoBench2Energy1,JohtoBench2Energy2,JohtoBench2Energy3,JohtoBench2Energy4,
            JohtoActiveEnergy1,JohtoActiveEnergy2,JohtoActiveEnergy3,JohtoActiveEnergy4,Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench2SwitchMouseClicked

    private void JohtoBench2SwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoBench2SwitchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench2SwitchActionPerformed

    private void JohtoBench3SwitchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench3SwitchMouseClicked
    DamageSwitch(JohtoDamageNumB3, JohtoDamageNum);
    PokeSwitch(JohtoBench3,JohtoActive);
    EnergySwitch(JohtoBench3Energy1,JohtoBench3Energy2,JohtoBench3Energy3,JohtoBench3Energy4,
            JohtoActiveEnergy1,JohtoActiveEnergy2,JohtoActiveEnergy3,JohtoActiveEnergy4,Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench3SwitchMouseClicked

    private void JohtoBench3SwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoBench3SwitchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench3SwitchActionPerformed

    private void JohtoBench4SwitchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench4SwitchMouseClicked
    DamageSwitch(JohtoDamageNumB4, JohtoDamageNum);
    PokeSwitch(JohtoBench4,JohtoActive);
    EnergySwitch(JohtoBench4Energy1,JohtoBench4Energy2,JohtoBench4Energy3,JohtoBench4Energy4,
            JohtoActiveEnergy1,JohtoActiveEnergy2,JohtoActiveEnergy3,JohtoActiveEnergy4,Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench4SwitchMouseClicked

    private void JohtoBench4SwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoBench4SwitchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench4SwitchActionPerformed

    private void JohtoBench5SwitchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoBench5SwitchMouseClicked
    DamageSwitch(JohtoDamageNumB5, JohtoDamageNum);
    PokeSwitch(JohtoBench5,JohtoActive);
    EnergySwitch(JohtoBench5Energy1,JohtoBench5Energy2,JohtoBench5Energy3,JohtoBench5Energy4,
            JohtoActiveEnergy1,JohtoActiveEnergy2,JohtoActiveEnergy3,JohtoActiveEnergy4,Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench5SwitchMouseClicked

    private void JohtoBench5SwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoBench5SwitchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoBench5SwitchActionPerformed

    private void KantoBench1SwitchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench1SwitchMouseClicked
    DamageSwitch(KantoDamageNumB1, KantoDamageNum);
    PokeSwitch(KantoBench1,KantoActive);
    EnergySwitch(KantoBench1Energy1,KantoBench1Energy2,KantoBench1Energy3,KantoBench1Energy4,
            KantoActiveEnergy1,KantoActiveEnergy2,KantoActiveEnergy3,KantoActiveEnergy4,Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench1SwitchMouseClicked

    private void KantoBench1SwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoBench1SwitchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench1SwitchActionPerformed

    private void KantoBench2SwitchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench2SwitchMouseClicked
    DamageSwitch(KantoDamageNumB2, KantoDamageNum);
    PokeSwitch(KantoBench2,KantoActive);
    EnergySwitch(KantoBench2Energy1,KantoBench2Energy2,KantoBench2Energy3,KantoBench2Energy4,
            KantoActiveEnergy1,KantoActiveEnergy2,KantoActiveEnergy3,KantoActiveEnergy4,Color.RED);         // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench2SwitchMouseClicked

    private void KantoBench2SwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoBench2SwitchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench2SwitchActionPerformed

    private void KantoBench3SwitchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench3SwitchMouseClicked
    DamageSwitch(KantoDamageNumB3, KantoDamageNum);
    PokeSwitch(KantoBench3,KantoActive);
    EnergySwitch(KantoBench3Energy1,KantoBench3Energy2,KantoBench3Energy3,KantoBench3Energy4,
            KantoActiveEnergy1,KantoActiveEnergy2,KantoActiveEnergy3,KantoActiveEnergy4,Color.RED);         // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench3SwitchMouseClicked

    private void KantoBench3SwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoBench3SwitchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench3SwitchActionPerformed

    private void KantoBench4SwitchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench4SwitchMouseClicked
    DamageSwitch(KantoDamageNumB4, KantoDamageNum);
    PokeSwitch(KantoBench4,KantoActive);
    EnergySwitch(KantoBench4Energy1,KantoBench4Energy2,KantoBench4Energy3,KantoBench4Energy4,
            KantoActiveEnergy1,KantoActiveEnergy2,KantoActiveEnergy3,KantoActiveEnergy4,Color.RED);         // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench4SwitchMouseClicked

    private void KantoBench4SwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoBench4SwitchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench4SwitchActionPerformed

    private void KantoBench5SwitchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoBench5SwitchMouseClicked
    DamageSwitch(KantoDamageNumB5, KantoDamageNum);
    PokeSwitch(KantoBench5,KantoActive);
    EnergySwitch(KantoBench5Energy1,KantoBench5Energy2,KantoBench5Energy3,KantoBench5Energy4,
            KantoActiveEnergy1,KantoActiveEnergy2,KantoActiveEnergy3,KantoActiveEnergy4,Color.RED);         // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench5SwitchMouseClicked

    private void KantoBench5SwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoBench5SwitchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoBench5SwitchActionPerformed

    private void JohtoActiveItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JohtoActiveItemStateChanged
String JohtoString = (String)JohtoActive.getSelectedItem();
DisplayCard(JohtoString, JohtoCard);        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoActiveItemStateChanged

    private void JohtoPrize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoPrize1MouseClicked
TogglePrize(JohtoPrize1);        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoPrize1MouseClicked

    private void JohtoPrize2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoPrize2MouseClicked
TogglePrize(JohtoPrize2);        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoPrize2MouseClicked

    private void JohtoPrize3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoPrize3MouseClicked
TogglePrize(JohtoPrize3);        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoPrize3MouseClicked

    private void JohtoPrize4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoPrize4MouseClicked
TogglePrize(JohtoPrize4);        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoPrize4MouseClicked

    private void JohtoPrize6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoPrize6MouseClicked
TogglePrize(JohtoPrize6);        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoPrize6MouseClicked

    private void JohtoPrize5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoPrize5MouseClicked
TogglePrize(JohtoPrize5);        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoPrize5MouseClicked

    private void KantoPrize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoPrize1MouseClicked
TogglePrize(KantoPrize1);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoPrize1MouseClicked

    private void KantoPrize2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoPrize2MouseClicked
TogglePrize(KantoPrize2);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoPrize2MouseClicked

    private void KantoPrize4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoPrize4MouseClicked
TogglePrize(KantoPrize4);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoPrize4MouseClicked

    private void KantoPrize3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoPrize3MouseClicked
TogglePrize(KantoPrize3);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoPrize3MouseClicked

    private void KantoPrize5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoPrize5MouseClicked
TogglePrize(KantoPrize5);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoPrize5MouseClicked

    private void KantoPrize6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoPrize6MouseClicked
TogglePrize(KantoPrize6);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoPrize6MouseClicked

    private void KantoClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoClearMouseClicked
    KantoActive.setSelectedIndex(0);
    ResetEnergies(KantoActiveEnergy1,KantoActiveEnergy2,KantoActiveEnergy3,KantoActiveEnergy4);
    ResetStatuses(KantoBR, KantoPO, KantoPZ, KantoSL, KantoCN);
    KantoDamageNum.setText("0");// TODO add your handling code here:
    }//GEN-LAST:event_KantoClearMouseClicked

    private void JohtoClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoClearMouseClicked
    ResetEnergies(JohtoActiveEnergy1,JohtoActiveEnergy2,JohtoActiveEnergy3,JohtoActiveEnergy4);
    ResetStatuses(JohtoBR, JohtoPO, JohtoPZ, JohtoSL, JohtoCN);
    JohtoActive.setSelectedIndex(0);
    JohtoDamageNum.setText("0");
   // TODO add your handling code here:
    }//GEN-LAST:event_JohtoClearMouseClicked

    private void KantoClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KantoClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KantoClearActionPerformed

    private void JohtoClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JohtoClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JohtoClearActionPerformed

    private void JohtoCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JohtoCardMouseClicked
        JohtoActiveCard.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_JohtoCardMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PokeboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokeboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokeboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokeboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//      catch (NullPointerException ex) {
//          java.util.logging.Logger.getLogger(PokeboardUI.class.getName()).log(Level.INFO, "message");
//      }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokeboardUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Background;
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel Johto;
    private javax.swing.JComboBox JohtoActive;
    private javax.swing.JFrame JohtoActiveCard;
    private javax.swing.JButton JohtoActiveEnergy1;
    private javax.swing.JButton JohtoActiveEnergy2;
    private javax.swing.JButton JohtoActiveEnergy3;
    private javax.swing.JButton JohtoActiveEnergy4;
    private javax.swing.JLabel JohtoActivePic;
    private javax.swing.JButton JohtoBR;
    private javax.swing.JComboBox JohtoBench1;
    private javax.swing.JButton JohtoBench1Energy1;
    private javax.swing.JButton JohtoBench1Energy2;
    private javax.swing.JButton JohtoBench1Energy3;
    private javax.swing.JButton JohtoBench1Energy4;
    private javax.swing.JButton JohtoBench1Switch;
    private javax.swing.JComboBox JohtoBench2;
    private javax.swing.JButton JohtoBench2Energy1;
    private javax.swing.JButton JohtoBench2Energy2;
    private javax.swing.JButton JohtoBench2Energy3;
    private javax.swing.JButton JohtoBench2Energy4;
    private javax.swing.JButton JohtoBench2Switch;
    private javax.swing.JComboBox JohtoBench3;
    private javax.swing.JButton JohtoBench3Energy1;
    private javax.swing.JButton JohtoBench3Energy2;
    private javax.swing.JButton JohtoBench3Energy3;
    private javax.swing.JButton JohtoBench3Energy4;
    private javax.swing.JButton JohtoBench3Switch;
    private javax.swing.JComboBox JohtoBench4;
    private javax.swing.JButton JohtoBench4Energy1;
    private javax.swing.JButton JohtoBench4Energy2;
    private javax.swing.JButton JohtoBench4Energy3;
    private javax.swing.JButton JohtoBench4Energy4;
    private javax.swing.JButton JohtoBench4Switch;
    private javax.swing.JComboBox JohtoBench5;
    private javax.swing.JButton JohtoBench5Energy1;
    private javax.swing.JButton JohtoBench5Energy2;
    private javax.swing.JButton JohtoBench5Energy3;
    private javax.swing.JButton JohtoBench5Energy4;
    private javax.swing.JButton JohtoBench5Switch;
    private javax.swing.JButton JohtoCN;
    private javax.swing.JLabel JohtoCard;
    private javax.swing.JButton JohtoClear;
    private javax.swing.JTextField JohtoDamageNum;
    private javax.swing.JTextField JohtoDamageNumB1;
    private javax.swing.JTextField JohtoDamageNumB2;
    private javax.swing.JTextField JohtoDamageNumB3;
    private javax.swing.JTextField JohtoDamageNumB4;
    private javax.swing.JTextField JohtoDamageNumB5;
    private javax.swing.JButton JohtoMinus;
    private javax.swing.JButton JohtoPO;
    private javax.swing.JButton JohtoPZ;
    private javax.swing.JButton JohtoPlus;
    private javax.swing.JLabel JohtoPrize1;
    private javax.swing.JLabel JohtoPrize2;
    private javax.swing.JLabel JohtoPrize3;
    private javax.swing.JLabel JohtoPrize4;
    private javax.swing.JLabel JohtoPrize5;
    private javax.swing.JLabel JohtoPrize6;
    private javax.swing.JButton JohtoSL;
    private javax.swing.JLabel Kanto;
    private javax.swing.JComboBox KantoActive;
    private javax.swing.JButton KantoActiveEnergy1;
    private javax.swing.JButton KantoActiveEnergy2;
    private javax.swing.JButton KantoActiveEnergy3;
    private javax.swing.JButton KantoActiveEnergy4;
    private javax.swing.JButton KantoBR;
    private javax.swing.JComboBox KantoBench1;
    private javax.swing.JButton KantoBench1Energy1;
    private javax.swing.JButton KantoBench1Energy2;
    private javax.swing.JButton KantoBench1Energy3;
    private javax.swing.JButton KantoBench1Energy4;
    private javax.swing.JButton KantoBench1Switch;
    private javax.swing.JComboBox KantoBench2;
    private javax.swing.JButton KantoBench2Energy1;
    private javax.swing.JButton KantoBench2Energy2;
    private javax.swing.JButton KantoBench2Energy3;
    private javax.swing.JButton KantoBench2Energy4;
    private javax.swing.JButton KantoBench2Switch;
    private javax.swing.JComboBox KantoBench3;
    private javax.swing.JButton KantoBench3Energy1;
    private javax.swing.JButton KantoBench3Energy2;
    private javax.swing.JButton KantoBench3Energy3;
    private javax.swing.JButton KantoBench3Energy4;
    private javax.swing.JButton KantoBench3Switch;
    private javax.swing.JComboBox KantoBench4;
    private javax.swing.JButton KantoBench4Energy1;
    private javax.swing.JButton KantoBench4Energy2;
    private javax.swing.JButton KantoBench4Energy3;
    private javax.swing.JButton KantoBench4Energy4;
    private javax.swing.JButton KantoBench4Switch;
    private javax.swing.JComboBox KantoBench5;
    private javax.swing.JButton KantoBench5Energy1;
    private javax.swing.JButton KantoBench5Energy2;
    private javax.swing.JButton KantoBench5Energy3;
    private javax.swing.JButton KantoBench5Energy4;
    private javax.swing.JButton KantoBench5Switch;
    private javax.swing.JButton KantoCN;
    private javax.swing.JLabel KantoCard;
    private javax.swing.JButton KantoClear;
    private javax.swing.JTextField KantoDamageNum;
    private javax.swing.JTextField KantoDamageNumB1;
    private javax.swing.JTextField KantoDamageNumB2;
    private javax.swing.JTextField KantoDamageNumB3;
    private javax.swing.JTextField KantoDamageNumB4;
    private javax.swing.JTextField KantoDamageNumB5;
    private javax.swing.JButton KantoMinus;
    private javax.swing.JButton KantoPO;
    private javax.swing.JButton KantoPZ;
    private javax.swing.JButton KantoPlus;
    private javax.swing.JLabel KantoPrize1;
    private javax.swing.JLabel KantoPrize2;
    private javax.swing.JLabel KantoPrize3;
    private javax.swing.JLabel KantoPrize4;
    private javax.swing.JLabel KantoPrize5;
    private javax.swing.JLabel KantoPrize6;
    private javax.swing.JButton KantoSL;
    private javax.swing.JComboBox Stadium;
    private javax.swing.JLabel StadiumCard;
    private javax.swing.JLabel mid;
    // End of variables declaration//GEN-END:variables

 private void EnergySwitch(JButton Bench1, JButton Bench2, JButton Bench3, JButton Bench4, JButton Active1, JButton Active2, JButton Active3, JButton Active4, Color EnergyColor) {
   int ActiveNum = 0;
   int BenchNum = 0;
   if(Bench4.getBackground()==EnergyColor){
        BenchNum = 4;}
        else 
        if(Bench3.getBackground()==EnergyColor){
        BenchNum = 3;}
        else
if(Bench2.getBackground()==EnergyColor){
    BenchNum = 2;}
else
    if(Bench1.getBackground()==EnergyColor){
        BenchNum=1;}
   else
        BenchNum = 0;
   
      if(Active4.getBackground()==EnergyColor){
        ActiveNum = 4;}
        else 
        if(Active3.getBackground()==EnergyColor){
        ActiveNum = 3;}
        else
if(Active2.getBackground()==EnergyColor){
    ActiveNum = 2;}
else
    if(Active1.getBackground()==EnergyColor){
        ActiveNum=1;}
   else
        ActiveNum = 0;
      switch (BenchNum){
          case 0: Active1.setBackground(Color.LIGHT_GRAY);
              Active2.setBackground(Color.LIGHT_GRAY);
              Active3.setBackground(Color.LIGHT_GRAY);
              Active4.setBackground(Color.LIGHT_GRAY);
              break;
          case 1: Active1.setBackground(EnergyColor);
              Active2.setBackground(Color.LIGHT_GRAY);
              Active3.setBackground(Color.LIGHT_GRAY);
              Active4.setBackground(Color.LIGHT_GRAY);
              break;
          case 2: Active1.setBackground(EnergyColor);
              Active2.setBackground(EnergyColor);
              Active3.setBackground(Color.LIGHT_GRAY);
              Active4.setBackground(Color.LIGHT_GRAY);
              break;
           case 3: Active1.setBackground(EnergyColor);
              Active2.setBackground(EnergyColor);
              Active3.setBackground(EnergyColor);
              Active4.setBackground(Color.LIGHT_GRAY);
              break;
           case 4: Active1.setBackground(EnergyColor);
              Active2.setBackground(EnergyColor);
              Active3.setBackground(EnergyColor);
              Active4.setBackground(EnergyColor);
              break;
      }
       switch (ActiveNum){
          case 0: Bench1.setBackground(Color.LIGHT_GRAY);
              Bench2.setBackground(Color.LIGHT_GRAY);
              Bench3.setBackground(Color.LIGHT_GRAY);
              Bench4.setBackground(Color.LIGHT_GRAY);
              break;
          case 1: Bench1.setBackground(EnergyColor);
              Bench2.setBackground(Color.LIGHT_GRAY);
              Bench3.setBackground(Color.LIGHT_GRAY);
              Bench4.setBackground(Color.LIGHT_GRAY);
              break;
          case 2: Bench1.setBackground(EnergyColor);
              Bench2.setBackground(EnergyColor);
              Bench3.setBackground(Color.LIGHT_GRAY);
              Bench4.setBackground(Color.LIGHT_GRAY);
              break;
           case 3: Bench1.setBackground(EnergyColor);
              Bench2.setBackground(EnergyColor);
              Bench3.setBackground(EnergyColor);
              Bench4.setBackground(Color.LIGHT_GRAY);
              break;
           case 4: Bench1.setBackground(EnergyColor);
              Bench2.setBackground(EnergyColor);
              Bench3.setBackground(EnergyColor);
              Bench4.setBackground(EnergyColor);
              break;
    
}
//To change body of generated methods, choose Tools | Templates.
    }
   private void OneEnergy(JButton Energy1, JButton Energy2, JButton Energy3, JButton Energy4, Color EnergyColor) {
   if(Energy2.getBackground()== EnergyColor){
   Energy2.setBackground(Color.LIGHT_GRAY);
   Energy3.setBackground(Color.LIGHT_GRAY);
   Energy4.setBackground(Color.LIGHT_GRAY);
}   
else 
    if(Energy1.getBackground()==Color.lightGray){
        Energy1.setBackground(EnergyColor);
    }
else
        Energy1.setBackground(Color.lightGray); //To change body of generated methods, choose Tools | Templates.
    }

    private void TwoEnergy(JButton Energy1, JButton Energy2, JButton Energy3, JButton Energy4, Color EnergyColor) {
 if(Energy3.getBackground()== EnergyColor){
   Energy3.setBackground(Color.LIGHT_GRAY);
   Energy4.setBackground(Color.LIGHT_GRAY);
}   
else 
    if(Energy2.getBackground()==Color.lightGray){
        Energy1.setBackground(EnergyColor);
        Energy2.setBackground(EnergyColor);
    }
else
        Energy2.setBackground(Color.lightGray);//To change body of generated methods, choose Tools | Templates.
    }

    private void ThreeEnergy(JButton Energy1, JButton Energy2, JButton Energy3, JButton Energy4, Color EnergyColor) {
 if(Energy4.getBackground()== EnergyColor){
   Energy4.setBackground(Color.LIGHT_GRAY);
}   
else 
    if(Energy3.getBackground()==Color.lightGray){
        Energy1.setBackground(EnergyColor);
        Energy2.setBackground(EnergyColor);
        Energy3.setBackground(EnergyColor);
    }
else
        Energy3.setBackground(Color.lightGray);  //To change body of generated methods, choose Tools | Templates.
    }

    private void FourEnergy(JButton Energy1, JButton Energy2, JButton Energy3, JButton Energy4, Color EnergyColor) {
if(Energy4.getBackground()==Color.lightGray){
        Energy4.setBackground(EnergyColor);
        Energy3.setBackground(EnergyColor);
        Energy2.setBackground(EnergyColor);
        Energy1.setBackground(EnergyColor);
    }
else
        Energy4.setBackground(Color.lightGray); //To change body of generated methods, choose Tools | Templates.
    }

    private void Reset() {
//Reset Damages        
JohtoDamageNum.setText("0");        
JohtoDamageNumB1.setText("0");
JohtoDamageNumB2.setText("0");
JohtoDamageNumB3.setText("0");
JohtoDamageNumB4.setText("0");
JohtoDamageNumB5.setText("0");

KantoDamageNum.setText("0");        
KantoDamageNumB1.setText("0");
KantoDamageNumB2.setText("0");
KantoDamageNumB3.setText("0");
KantoDamageNumB4.setText("0");
KantoDamageNumB5.setText("0");


JohtoActiveEnergy4.setBackground(Color.LIGHT_GRAY);
JohtoActiveEnergy3.setBackground(Color.LIGHT_GRAY);
JohtoActiveEnergy2.setBackground(Color.LIGHT_GRAY);
JohtoActiveEnergy1.setBackground(Color.LIGHT_GRAY);//Johto Active Energies reset

JohtoBench1Energy4.setBackground(Color.LIGHT_GRAY);
JohtoBench1Energy3.setBackground(Color.LIGHT_GRAY);
JohtoBench1Energy2.setBackground(Color.LIGHT_GRAY);
JohtoBench1Energy1.setBackground(Color.LIGHT_GRAY);//Johto Bench 1 energy reset

JohtoBench2Energy4.setBackground(Color.LIGHT_GRAY);
JohtoBench2Energy3.setBackground(Color.LIGHT_GRAY);
JohtoBench2Energy2.setBackground(Color.LIGHT_GRAY);
JohtoBench2Energy1.setBackground(Color.LIGHT_GRAY);//Johto Bench 2 energy reset

JohtoBench3Energy4.setBackground(Color.LIGHT_GRAY);
JohtoBench3Energy3.setBackground(Color.LIGHT_GRAY);
JohtoBench3Energy2.setBackground(Color.LIGHT_GRAY);
JohtoBench3Energy1.setBackground(Color.LIGHT_GRAY);//Johto Bench 3 energy reset

JohtoBench4Energy4.setBackground(Color.LIGHT_GRAY);
JohtoBench4Energy3.setBackground(Color.LIGHT_GRAY);
JohtoBench4Energy2.setBackground(Color.LIGHT_GRAY);
JohtoBench4Energy1.setBackground(Color.LIGHT_GRAY);//Johto Bench 4 energy reset

JohtoBench5Energy4.setBackground(Color.LIGHT_GRAY);
JohtoBench5Energy3.setBackground(Color.LIGHT_GRAY);
JohtoBench5Energy2.setBackground(Color.LIGHT_GRAY);
JohtoBench5Energy1.setBackground(Color.LIGHT_GRAY);//Johto Bench 5 energy reset

KantoActiveEnergy4.setBackground(Color.LIGHT_GRAY);
KantoActiveEnergy3.setBackground(Color.LIGHT_GRAY);
KantoActiveEnergy2.setBackground(Color.LIGHT_GRAY);
KantoActiveEnergy1.setBackground(Color.LIGHT_GRAY);//Kanto Active energy reset

KantoBench1Energy4.setBackground(Color.LIGHT_GRAY);
KantoBench1Energy3.setBackground(Color.LIGHT_GRAY);
KantoBench1Energy2.setBackground(Color.LIGHT_GRAY);
KantoBench1Energy1.setBackground(Color.LIGHT_GRAY);//Kanto Bench 1 energy reset

KantoBench2Energy4.setBackground(Color.LIGHT_GRAY);
KantoBench2Energy3.setBackground(Color.LIGHT_GRAY);
KantoBench2Energy2.setBackground(Color.LIGHT_GRAY);
KantoBench2Energy1.setBackground(Color.LIGHT_GRAY);//Kanto Bench 2 energy reset

KantoBench3Energy4.setBackground(Color.LIGHT_GRAY);
KantoBench3Energy3.setBackground(Color.LIGHT_GRAY);
KantoBench3Energy2.setBackground(Color.LIGHT_GRAY);
KantoBench3Energy1.setBackground(Color.LIGHT_GRAY);//Kanto Bench 3 energy reset

KantoBench4Energy4.setBackground(Color.LIGHT_GRAY);
KantoBench4Energy3.setBackground(Color.LIGHT_GRAY);
KantoBench4Energy2.setBackground(Color.LIGHT_GRAY);
KantoBench4Energy1.setBackground(Color.LIGHT_GRAY);//Kanto Bench 4 energy reset

KantoBench5Energy4.setBackground(Color.LIGHT_GRAY);
KantoBench5Energy3.setBackground(Color.LIGHT_GRAY);
KantoBench5Energy2.setBackground(Color.LIGHT_GRAY);
KantoBench5Energy1.setBackground(Color.LIGHT_GRAY);//Kanto Bench 5 energy reset

Stadium.setSelectedIndex(0);//Stadium Reset
KantoActive.setSelectedIndex(0);//Kanto Active Reset
JohtoActive.setSelectedIndex(0);//Johto Active Reset
KantoBench1.setSelectedIndex(0);//Kanto Bench 1 Reset
KantoBench2.setSelectedIndex(0);//Kanto Bench 2 Reset
KantoBench3.setSelectedIndex(0);//Kanto Bench 3 Reset
KantoBench4.setSelectedIndex(0);//Kanto Bench 4 Reset
KantoBench5.setSelectedIndex(0);//Kanto Bench 5 Reset
JohtoBench1.setSelectedIndex(0);//Johto Bench 1 Reset
JohtoBench2.setSelectedIndex(0);//Johto Bench 2 Reset
JohtoBench3.setSelectedIndex(0);//Johto Bench 3 Reset
JohtoBench4.setSelectedIndex(0);//Johto Bench 4 Reset
JohtoBench5.setSelectedIndex(0);//Johto Bench 5 Reset

//Reset Statuses
ResetStatuses(JohtoBR, JohtoPO, JohtoPZ, JohtoSL, JohtoCN);
ResetStatuses(KantoBR, KantoPO, KantoPZ, KantoSL, KantoCN);

//Reset Prizes
JohtoPrize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png")));
JohtoPrize2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png")));
JohtoPrize3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png")));
JohtoPrize4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png")));
JohtoPrize5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png")));
JohtoPrize6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png")));
KantoPrize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png")));
KantoPrize2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png")));
KantoPrize3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png")));
KantoPrize4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png")));
KantoPrize5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png")));
KantoPrize6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png")));
//To change body of generated methods, choose Tools | Templates.
    }
    private void PokeSwitch(JComboBox Bench, JComboBox Active) {
         String SwitchName1 = (String)Active.getSelectedItem();
         String SwitchName2 = (String)Bench.getSelectedItem();
        Active.setSelectedItem(SwitchName2);
        Bench.setSelectedItem(SwitchName1);//To change body of generated methods, choose Tools | Templates.
    }
    private void DamageSwitch(JTextField Bench, JTextField Active){
    String BenchDam = Bench.getText();
    String ActiveDam = Active.getText();
    if (Bench.getText().equals("") || Integer.parseInt(BenchDam) % 10 != 0 || Integer.parseInt(BenchDam) < 0){
        Active.setText("0");
    }
    else{
    Active.setText(BenchDam);
            }
    Bench.setText(ActiveDam);
    
    }

    private void AddDamage(JTextField TextField) {
String DamageText = TextField.getText();
int DamageInt = Integer.parseInt(DamageText);
DamageInt += 10;
DamageText = Integer.toString(DamageInt);
TextField.setText(DamageText);//To change body of generated methods, choose Tools | Templates.
    }

    private void SubtractDamage(JTextField TextField) {
String DamageText = TextField.getText();
int DamageInt = Integer.parseInt(DamageText);
DamageInt -= 10;
DamageText = Integer.toString(DamageInt);
TextField.setText(DamageText); //To change body of generated methods, choose Tools | Templates.
    }

        private void setIcon() {
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/pokeball.png")));
    }
        
    private void DisplayCard(String NameString, JLabel Card) {
                switch (NameString){
//Base Set
    case "Active": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Back.png"))); break;
    case "Abra": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Abra.png"))); break;
    case "Abra (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Abra.png"))); break;
    case "Alakazam": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Alakazam.png"))); break;
    case "Arcanine": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Arcanine.png"))); break;
    case "Beedrill": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Beedrill.png"))); break;
    case "Blastoise": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Blastoise.png"))); break;
    case "Bulbasaur": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Bulbasaur.png"))); break;
    case "Caterpie": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Caterpie.png"))); break;
    case "Chansey": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Chansey.png"))); break;
    case "Charizard": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Charizard.png"))); break;
    case "Charmander": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Charmander.png"))); break;
    case "Charmeleon": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Charmeleon.png"))); break;
    case "Clefairy": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Clefairy.png"))); break;
    case "Dewgong": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Dewgong.png"))); break;
    case "Diglett": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Diglett.png"))); break;
    case "Doduo":  Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Doduo.png"))); break;
    case "Dragonair":  Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Dragonair.png"))); break;
    case "Dratini": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Dratini.png"))); break;
    case "Drowzee": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Drowzee.png"))); break;
    case "Dugtrio": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Dugtrio.png"))); break;
    case "Electabuzz": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Electabuzz.png"))); break;
    case "Electrode": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Electrode.png"))); break;
    case "Farfetch'd": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Farfetch'd.png"))); break;
    case "Gastly": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Gastly.png"))); break;
    case "Growlithe": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Growlithe.png"))); break;
    case "Gyarados": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Gyarados.png"))); break;    
    case "Haunter": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Haunter.png"))); break; 
    case "Hitmonchan": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Hitmonchan.png"))); break;    
    case "Ivysaur": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Ivysaur.png"))); break;    
    case "Jynx": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Jynx.png"))); break;    
    case "Kadabra": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Kadabra.png"))); break; 
    case "Kakuna": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Kakuna.png"))); break;    
    case "Koffing": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Koffing.png"))); break;
    case "Machamp": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Machamp.png"))); break;    
    case "Machoke": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Machoke.png"))); break;
    case "Machop": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Machop.png"))); break;
    case "Magikarp": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Magikarp.png"))); break;
    case "Magmar": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Magmar.png"))); break;
    case "Magnemite": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Magnemite.png"))); break;
    case "Magneton": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Magneton.png"))); break;    
    case "Metapod": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Metapod.png"))); break;    
    case "Mewtwo": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Mewtwo.png"))); break;
    case "Nidoking": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Nidoking.png"))); break;
    case "Nidoran Male": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Nidoran_male.png"))); break;    
    case "Nidorino": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Nidorino.png"))); break;
    case "Ninetales": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Ninetales.png"))); break;    
    case "Onix": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Onix.png"))); break;    
    case "Pidgeotto": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Pidgeotto.png"))); break;    
    case "Pidgey": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Pidgey.png"))); break;    
    case "Pikachu": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Pikachu.png"))); break;  
    case "Poliwag": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Poliwag.png"))); break;
    case "Poliwhirl": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Poliwhirl.png"))); break;
    case "Poliwrath": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Poliwrath.png"))); break;    
    case "Ponyta": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Ponyta.png"))); break;
    case "Porygon": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Porygon.png"))); break;
    case "Raichu": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Raichu.png"))); break;
    case "Raticate": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Raticate.png"))); break;
    case "Rattata": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Rattata.png"))); break;
    case "Sandshrew": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Sandshrew.png"))); break;    
    case "Seel": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Seel.png"))); break;   
    case "Squirtle": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Squirtle.png"))); break;
    case "Starmie": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Starmie.png"))); break;
    case "Staryu": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Staryu.png"))); break;  
    case "Tangela": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Tangela.png"))); break;
    case "Venusaur": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Venusaur.png"))); break;
    case "Voltorb": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Voltorb.png"))); break;
    case "Vulpix": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Vulpix.png"))); break; 
    case "Wartortle": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Wartortle.png"))); break;
    case "Weedle": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Weedle.png"))); break;
    case "Zapdos": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/base/Zapdos.png"))); break;

//Jungle
    case "Bellsprout": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Bellsprout.png"))); break;    
    case "Butterfree": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Butterfree.png"))); break; 
    case "Clefable": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Clefable.png"))); break;    
    case "Cubone": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Cubone.png"))); break;    
    case "Dodrio": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Dodrio.png"))); break;    
    case "Electrode (Jungle)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Electrode.png"))); break;    
    case "Exeggcute": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Exeggcute.png"))); break;    
    case "Exeggutor": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Exeggutor.png"))); break;    
    case "Fearow": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Fearow.png"))); break;
    case "Flareon": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Flareon.png"))); break;    
    case "Gloom": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Gloom.png"))); break;    
    case "Goldeen": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Goldeen.png"))); break;    
    case "Jigglypuff": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Jigglypuff.png"))); break;    
    case "Jolteon": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Jolteon.png"))); break;
    case "Kangaskhan": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Kangaskhan.png"))); break;    
    case "Lickitung": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Lickitung.png"))); break;    
    case "Mankey": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Mankey.png"))); break;    
    case "Marowak": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Marowak.png"))); break;    
    case "Meowth": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Meowth.png"))); break; 
    case "Mr. Mime": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/MrMime.png"))); break;    
    case "Nidoqueen": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Nidoqueen.png"))); break;    
    case "Nidoran Female": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Nidoran(Female).png"))); break; 
    case "Nidorina": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Nidorina.png"))); break;    
    case "Oddish": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Oddish(Stun_Spore).png"))); break;    
    case "Paras": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Paras.png"))); break;    
    case "Parasect": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Parasect.png"))); break;    
    case "Persian": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Persian.png"))); break;
    case "Pidgeot": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Pidgeot.png"))); break;    
    case "Pikachu (Jungle)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Pikachu(Spark).png"))); break;    
    case "Pinsir": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Pinsir.png"))); break;    
    case "Primeape": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Primeape.png"))); break;    
    case "Rapidash": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Rapidash.png"))); break;    
    case "Rhydon": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Rhydon.png"))); break;
    case "Rhyhorn": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Rhyhorn.png"))); break;    
    case "Seaking": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Seaking.png"))); break;    
    case "Snorlax": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Snorlax.png"))); break;    
    case "Spearow": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Spearow.png"))); break;    
    case "Tauros": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Tauros.png"))); break;    
    case "Vaporeon": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Vaporeon.png"))); break;
    case "Venomoth": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Venemoth.png"))); break;    
    case "Venonat": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Venonat.png"))); break;    
    case "Victreebel": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Victreebel.png"))); break;    
    case "Vileplume": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Vileplume.png"))); break;    
    case "Weepinbell": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Weepinbell.png"))); break;
    case "Wigglytuff": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Wigglytuff.png"))); break;
    case "Eevee": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Eevee.png"))); break;
    case "Scyther": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jungle/Scyther.png"))); break;    
        
//Fossil   
    case "Aerodactyl": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Aerodactyl.png"))); break;
    case "Arbok": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Arbok.png"))); break;
    case "Articuno": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Articuno.png"))); break;
    case "Cloyster": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Cloyster.png"))); break;
    case "Ditto": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Ditto.png"))); break;
    case "Dragonite": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Dragonite.png"))); break;
    case "Ekans": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Ekans.png"))); break;    
    case "Gastly (Fossil)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Gastly.png"))); break;
    case "Gengar": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Gengar.png"))); break;
    case "Geodude": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Geodude.png"))); break;
    case "Golbat": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Golbat.png"))); break;
    case "Golduck": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Golduck.png"))); break;
    case "Golem": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Golem.png"))); break;
    case "Graveler": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Graveler.png"))); break;
    case "Grimer": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Grimer.png"))); break;
    case "Haunter (Fossil)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Haunter.png"))); break;    
    case "Hitmonlee": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Hitmonlee.png"))); break;    
    case "Horsea": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Horsea.png"))); break;    
    case "Hypno": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Hypno.png"))); break;    
    case "Kabuto": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Kabuto.png"))); break;    
    case "Kabutops": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Kabutops.png"))); break;    
    case "Kingler": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Kingler.png"))); break;    
    case "Krabby": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Krabby.png"))); break;
    case "Lapras": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Lapras.png"))); break;    
    case "Magmar (Fossil)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Magmar.png"))); break;    
    case "Magneton (Fossil)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Magneton.png"))); break;    
    case "Moltres": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Moltres.png"))); break;    
    case "Muk": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Muk.png"))); break;
    case "Mysterious Fossil": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Mysterious Fossil.png"))); break;    
    case "Omanyte": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Omanyte.png"))); break;    
    case "Omastar": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Omastar.png"))); break;    
    case "Psyduck": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Psyduck.png"))); break;    
    case "Raichu (Fossil)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Raichu.png"))); break;
    case "Sandslash": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Sandslash.png"))); break;    
    case "Seadra": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Seadra.png"))); break; 
    case "Shellder": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Shellder.png"))); break;    
    case "Slowbro": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Slowbro.png"))); break;    
    case "Slowpoke": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Slowpoke.png"))); break;    
    case "Tentacool": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Tentacool.png"))); break;    
    case "Tentacruel": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Tentacruel.png"))); break;    
    case "Weezing": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Weezing.png"))); break; 
    case "Zapdos (Fossil)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Zapdos.png"))); break;    
    case "Zubat": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fossil/Zubat.png"))); break;    
        
//Team Rocket
    case "Charmander (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Charmander.png"))); break;
    case "Alakazam (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Alakazam.png"))); break;
    case "Arbok (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Arbok.png"))); break;        
    case "Blastoise (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Blastoise.png"))); break;        
    case "Charizard (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Charizard.png"))); break;        
    case "Charmeleon (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Charmeleon.png"))); break;
    case "Dragonair (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Dragonair.png"))); break;    
    case "Dragonite (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Dragonite.png"))); break;    
    case "Dugtrio (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Dugtrio.png"))); break;    
    case "Electrode (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Electrode.png"))); break;
    case "Flareon (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Flareon.png"))); break;    
    case "Gloom (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Gloom.png"))); break;    
    case "Golbat (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Golbat.png"))); break;    
    case "Golduck (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Golduck.png"))); break;
    case "Gyarados (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Gyarados.png"))); break;    
    case "Hypno (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Hypno.png"))); break;    
    case "Jolteon (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Jolteon.png"))); break;    
    case "Kadabra (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Kadabra.png"))); break;    
    case "Machamp (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Machamp.png"))); break;    
    case "Machoke (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Machoke.png"))); break;    
    case "Magneton (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Magneton.png"))); break;
    case "Muk (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Muk.png"))); break;    
    case "Persian (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Persian.png"))); break;    
    case "Primeape (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Primeape.png"))); break;    
    case "Raichu (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Raichu.png"))); break;    
    case "Rapidash (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Rapidash.png"))); break;    
    case "Raticate (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Raticate.png"))); break;    
    case "Slowbro (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Slowbro.png"))); break;    
    case "Vaporeon (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Vaporeon.png"))); break;
    case "Vileplume (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Vileplume.png"))); break;    
    case "Wartortle (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Wartortle.png"))); break;    
    case "Weezing (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dark Weezing.png"))); break;    
    case "Diglett (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Diglett.png"))); break;
    case "Dratini (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Dratini.png"))); break;    
    case "Drowzee (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Drowzee.png"))); break;    
    case "Eevee (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Eevee.png"))); break;    
    case "Ekans (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Ekans.png"))); break;
    case "Grimer (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Grimer.png"))); break;    
    case "Koffing (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Koffing.png"))); break;    
    case "Machop (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Machop.png"))); break;    
    case "Magikarp (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Magikarp.png"))); break;    
    case "Magnemite (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Magnemite.png"))); break;    
    case "Mankey (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Mankey.png"))); break;
    case "Meowth (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Meowth.png"))); break;    
    case "Oddish (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Oddish.png"))); break;    
    case "Ponyta (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Ponyta.png"))); break;    
    case "Porygon (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Porygon.png"))); break;
    case "Psyduck (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Psyduck.png"))); break;    
    case "Rattata (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Rattata.png"))); break;    
    case "Slowpoke (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Slowpoke.png"))); break;    
    case "Squirtle (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Squirtle.png"))); break;
    case "Voltorb (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Voltorb.png"))); break;    
    case "Zubat (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/team_rocket/Zubat.png"))); break;    
        
//Gym Challenge
    case "Arcanine (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Blaine's Arcanine.png"))); break;    
    case "Charizard (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Blaine's Charizard.png"))); break;    
    case "Charmander (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Blaine's Charmander.png"))); break;
    case "Charmeleon (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Blaine's Charmeleon.png"))); break;    
    case "Dodrio (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Blaine's Dodrio.png"))); break;    
    case "Doduo (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Blaine's Doduo.png"))); break;    
    case "Growlithe (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Blaine's Growlithe.png"))); break;    
    case "Mankey (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Blaine's Mankey.png"))); break;
    case "Ninetales (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Blaine's Ninetales.png"))); break;    
    case "Ponyta (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Blaine's Ponyta.png"))); break;   
    case "Rapidash (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Blaine's Rapidash.png"))); break;    
    case "Rhyhorn (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Blaine's Rhyhorn.png"))); break;    
    case "Vulpix (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Blaine's Vulpix.png"))); break;  
    case "Diglett (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Brock's Diglett.png"))); break;
    case "Dugtrio (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Brock's Dugtrio.png"))); break;
    case "Geodude (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Brock's Geodude.png"))); break;    
    case "Graveler (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Brock's Graveler.png"))); break;    
    case "Ninetales (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Brock's Ninetales.png"))); break;    
    case "Primeape (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Brock's Primeape.png"))); break;    
    case "Sandslash (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Brock's Sandslash.png"))); break;
    case "Vulpix (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Brock's Vulpix.png"))); break;    
    case "Bellsprout (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Erika's Bellsprout.png"))); break; 
    case "Bulbasaur (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Erika's Bulbasaur.png"))); break;    
    case "Clefairy (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Erika's Clefairy.png"))); break;
    case "Ivysaur (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Erika's Ivysaur.png"))); break;    
    case "Jigglypuff (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Erika's Jigglypuff.png"))); break;    
    case "Oddish (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Erika's Oddish.png"))); break;    
    case "Paras (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Erika's Paras.png"))); break;
    case "Venusaur (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Erika's Venusaur.png"))); break;    
    case "Gyarados (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Giovanni's Gyarados.png"))); break;
    case "Machamp (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Giovanni's Machamp.png"))); break;
    case "Machoke (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Giovanni's Machoke.png"))); break;
    case "Machop (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Giovanni's Machop.png"))); break;    
    case "Magikarp (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Giovanni's Magikarp.png"))); break;    
    case "Meowth (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Giovanni's Meowth Lv17.png"))); break;    
    case "Meowth (Giovanni's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Giovanni's Meowth.png"))); break;    
    case "Nidoking (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Giovanni's Nidoking.png"))); break;    
    case "Nidoqueen (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Giovanni's Nidoqueen.png"))); break;    
    case "Nidoran Female (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Giovanni's Nidoran Female.png"))); break;    
    case "Nidoran Male (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Giovanni's Nidoran Male.png"))); break;   
    case "Nidorina (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Giovanni's Nidorina.png"))); break;    
    case "Nidorino (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Giovanni's Nidorino.png"))); break;
    case "Persian (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Giovanni's Persian.png"))); break;    
    case "Pinsir (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Giovanni's Pinsir.png"))); break;    
    case "Arbok (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Arbok.png"))); break;
    case "Beedrill (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Beedrill.png"))); break;    
    case "Ditto (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Ditto.png"))); break;    
    case "Ekans (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Ekans.png"))); break;
    case "Golbat (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Golbat.png"))); break;    
    case "Grimer (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Grimer.png"))); break;    
    case "Kakuna (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Kakuna.png"))); break;    
    case "Koffing (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Koffing Lv10.png"))); break;
    case "Koffing (Koga's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Koffing.png"))); break;    
    case "Muk (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Muk.png"))); break;    
    case "Pidgeotto (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Pidgeotto.png"))); break;    
    case "Pidgey (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Pidgey Lv15.png"))); break;    
    case "Pidgey (Koga's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Pidgey.png"))); break;    
    case "Tangela (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Tangela.png"))); break;
    case "Weedle (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Weedle.png"))); break;    
    case "Weezing (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Weezing.png"))); break;    
    case "Zubat (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Koga's Zubat.png"))); break;    
    case "Eevee (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Lt Surge's Eevee.png"))); break;    
    case "Electrode (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Lt Surge's Electrode.png"))); break;    
    case "Jolteon (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Lt Surge's Jolteon.png"))); break;
    case "Pikachu (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Lt Surge's Pikachu.png"))); break;    
    case "Raichu (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Lt Surge's Raichu.png"))); break;    
    case "Raticate (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Lt Surge's Raticate.png"))); break;    
    case "Rattata (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Lt Surge's Rattata.png"))); break;    
    case "Voltorb (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Lt Surge's Voltorb.png"))); break;    
    case "Dewgong (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Misty's Dewgong.png"))); break;
    case "Golduck (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Misty's Golduck.png"))); break;    
    case "Gyarados (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Misty's Gyarados.png"))); break;    
    case "Horsea (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Misty's Horsea.png"))); break;
    case "Magikarp (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Misty's Magikarp.png"))); break;    
    case "Poliwag (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Misty's Poliwag.png"))); break;    
    case "Psyduck (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Misty's Psyduck.png"))); break;    
    case "Seel (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Misty's Seel.png"))); break;    
    case "Staryu (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Misty's Staryu.png"))); break;    
    case "Mewtwo (Rocket's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Rocket's Mewtwo.png"))); break;
    case "Zapdos (Rocket's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Rocket's Zapdos.png"))); break;    
    case "Abra (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Sabrina's Abra Lv18.png"))); break;    
    case "Abra (Sabrina's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Sabrina's Abra.png"))); break;    
    case "Alakazam (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Sabrina's Alakazam.png"))); break;    
    case "Drowzee (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Sabrina's Drowzee.png"))); break;    
    case "Gastly (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Sabrina's Gastly Lv10.png"))); break;
    case "Gastly (Sabrina's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Sabrina's Gastly.png"))); break;    
    case "Gengar (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Sabrina's Gengar.png"))); break;    
    case "Golduck (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Sabrina's Golduck.png"))); break;    
    case "Haunter (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Sabrina's Haunter.png"))); break;    
    case "Hypno (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Sabrina's Hypno.png"))); break; 
    case "Jynx (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Sabrina's Jynx.png"))); break;    
    case "Kadabra (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Sabrina's Kadabra.png"))); break;    
    case "Mr. Mime (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Sabrina's Mr.png"))); break;    
    case "Porygon (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Sabrina's Porygon.png"))); break;    
    case "Psyduck (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_challenge/Sabrina's Psyduck.png"))); break;    
   
//Gym Heroes
    case "Charmander (Blaine's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Blaine's Charmander.png"))); break;
    case "Growlithe (Blaine's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Blaine's Growlithe Lv15.png"))); break;    
    case "Growlithe (Blaine's 3)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Blaine's Growlithe.png"))); break;    
    case "Kangaskhan (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Blaine's Kangaskhan.png"))); break;
    case "Magmar (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Blaine's Magmar.png"))); break;
    case "Moltres (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Blaine's Moltres.png"))); break;
    case "Ponyta (Blaine's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Blaine's Ponyta.png"))); break;
    case "Tauros (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Blaine's Tauros.png"))); break;
    case "Vulpix (Blaine's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Blaine's Vulpix.png"))); break;
    case "Geodude (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Geodude Lv13.png"))); break;
    case "Geodude (Brock's 3)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Geodude.png"))); break;
    case "Golbat (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Golbat.png"))); break;
    case "Golem (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Golem.png"))); break;    
    case "Graveler (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Graveler.png"))); break;    
    case "Lickitung (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Lickitung.png"))); break;    
    case "Mankey (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Mankey Lv12.png"))); break;
    case "Mankey (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Mankey.png"))); break;
    case "Onix (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Onix Lv41.png"))); break;
    case "Onix (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Onix.png"))); break;
    case "Rhyhorn (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Rhyhorn.png"))); break;
    case "Rhydon (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Rhydon.png"))); break;    
    case "Rhyhorn (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Rhyhorn Lv29.png"))); break;
    case "Sandshrew (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Sandshrew.png"))); break;
    case "Sandshrew (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Sandshrew Lv20.png"))); break;
    case "Sandslash (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Sandslash.png"))); break;
    case "Vulpix (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Vulpix.png"))); break;
    case "Zubat (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Zubat.png"))); break;
    case "Zubat (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Brock's Zubat Lv11.png"))); break;
    case "Bellsprout (Erika's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Bellsprout.png"))); break;
    case "Bellsprout (Erika's 3)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Bellsprout Lv15.png"))); break;
    case "Clefable (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Clefable.png"))); break;
    case "Clefairy (Erika's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Clefairy.png"))); break;
    case "Dragonair (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Dragonair.png"))); break;
    case "Dratini (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Dratini.png"))); break;
    case "Exeggcute (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Exeggcute Lv12.png"))); break;
    case "Exeggcute (Erika's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Exeggcute.png"))); break;
    case "Exeggutor (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Exeggutor.png"))); break;
    case "Gloom (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Gloom Lv28.png"))); break;
    case "Gloom (Erika's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Gloom.png"))); break;
    case "Oddish (Erika's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Oddish Lv15.png"))); break;
    case "Oddish (Erika's 3)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Oddish.png"))); break;
    case "Tangela (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Tangela.png"))); break;
    case "Victreebel (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Victreebel.png"))); break;
    case "Vileplume (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Vileplume.png"))); break;
    case "Weepinbell (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Weepinbell.png"))); break;
    case "Weepinbell (Erika's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Erika's Weepinbell Lv30.png"))); break;
    case "Electabuzz (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Lt Surge's Electabuzz Lv22.png"))); break;
    case "Electabuzz (Lt. Surge's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Lt Surge's Electabuzz.png"))); break;
    case "Fearow (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Lt Surge's Fearow.png"))); break;
    case "Magnemite (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Lt Surge's Magnemite.png"))); break;
    case "Magnemite (Lt. Surge's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Lt Surge's Magnemite Lv12.png"))); break;
    case "Magneton (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Lt Surge's Magneton.png"))); break;    
    case "Pikachu (Lt. Surge's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Lt Surge's Pikachu.png"))); break;
    case "Raichu (Lt. Surge's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Lt Surge's Raichu.png"))); break;
    case "Raticate (Lt. Surge's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Lt Surge's Raticate.png"))); break;
    case "Rattata (Lt. Surge's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Lt Surge's Rattata.png"))); break;
    case "Spearow (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Lt Surge's Spearow Lv17.png"))); break;
    case "Spearow (Lt. Surge's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Lt Surge's Spearow.png"))); break;
    case "Voltorb (Lt. Surge's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Lt Surge's Voltorb.png"))); break;
    case "Cloyster (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Cloyster.png"))); break;
    case "Goldeen (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Goldeen.png"))); break;
    case "Goldeen (Misty's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Goldeen Lv10.png"))); break;
    case "Horsea (Misty's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Horsea.png"))); break;    
    case "Poliwag (Misty's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Poliwag.png"))); break;    
    case "Poliwhirl (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Poliwhirl.png"))); break;    
    case "Poliwrath (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Poliwrath.png"))); break;
    case "Psyduck (Misty's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Psyduck.png"))); break;
    case "Seadra (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Seadra.png"))); break;
    case "Seaking (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Seaking.png"))); break;
    case "Seel (Misty's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Seel.png"))); break;
    case "Shellder (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Shellder.png"))); break;
    case "Starmie (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Starmie.png"))); break;
    case "Staryu (Misty's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Staryu.png"))); break;
    case "Tentacool (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Tentacool.png"))); break;
    case "Tentacool (Misty's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Tentacool Lv16.png"))); break;    
    case "Tentacruel (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Misty's Tentacruel.png"))); break;    
    case "Hitmonchan (Rocket's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Rocket's Hitmonchan.png"))); break;  
    case "Moltres (Rocket's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Rocket's Moltres.png"))); break;    
    case "Scyther (Rocket's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Rocket's Scyther.png"))); break;    
    case "Snorlax (Rocket's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Rocket's Snorlax.png"))); break;
    case "Abra (Sabrina's 3)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Sabrina's Abra.png"))); break;    
    case "Drowzee (Sabrina's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Sabrina's Drowzee.png"))); break;    
    case "Gastly (Sabrina's 3)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Sabrina's Gastly.png"))); break;    
    case "Gengar (Sabrina's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Sabrina's Gengar.png"))); break;    
    case "Haunter (Sabrina's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Sabrina's Haunter.png"))); break;
    case "Jynx (Sabrina's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Sabrina's Jynx.png"))); break;
    case "Mr. Mime (Sabrina's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Sabrina's Mr.png"))); break;
    case "Slowbro (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Sabrina's Slowbro.png"))); break;
    case "Slowpoke (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Sabrina's Slowpoke.png"))); break;
    case "Venomoth (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Sabrina's Venomoth.png"))); break;
    case "Venonat (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym_heroes/Sabrina's Venonat.png"))); break;
    
    //Neo Genesis
    case "Aipom (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Aipom_NG.png"))); break;
    case "Ampharos (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Ampharos_NG.png"))); break;
    case "Ariados (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Ariados_NG.png"))); break;
    case "Azumarill (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Azumarill.png"))); break;
    case "Bayleef (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Bayleef1_NG.png"))); break;
    case "Bayleef (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Bayleef2_NG.png"))); break;
    case "Bellossom (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Bellossom_NG.png"))); break;
    case "Chikorita (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Chikorita1_NG.png"))); break;
    case "Chikorita (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Chikorita2_NG.png"))); break;
    case "Chinchou (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Chinchou_NG.png"))); break;
    case "Clefairy (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Clefairy_NG.png"))); break;
    case "Cleffa (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/CleffaBROKEN_ng.png"))); break;
    case "Croconaw (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/CroconawGOOD_NG.png"))); break;
    case "Croconaw (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Croconaw_NG.png"))); break;
    case "Cyndaquil (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Cyndaquil1_NG.png"))); break;
    case "Cyndaquil (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Cyndaquil2_NG.png"))); break;
    case "Donphan (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Donphan_NG.png"))); break;
    case "Electabuzz (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Electabuzz_NG.png"))); break;
    case "Elekid (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Elekid_NG.png"))); break;
    case "Feraligatr (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/FeraligatrBERSERK_NG.png"))); break;
    case "Feraligatr (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/FeraligatrRIPTIDE_NG.png"))); break;
    case "Flaaffy (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Flaaffy_NG.png"))); break;
    case "Furret (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Furret_NG.png"))); break;
    case "Girafarig (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Girafarig_NG.png"))); break;
    case "Gligar (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Gligar_NG.png"))); break;
    case "Gloom (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Gloom_NG.png"))); break;
    case "Granbull (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Granbull_NG.png"))); break;
    case "Heracross (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Heracross_NG.png"))); break;
    case "Hoothoot (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Hoothoot_NG.png"))); break;
    case "Hoppip (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Hoppip_NG.png"))); break;
    case "Horsea (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Horsea_NG.png"))); break;
    case "Jumpluff (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Jumpluff.png"))); break;
    case "Kingdra (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Kingdra_NG.png"))); break;
    case "Lanturn (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Lanturn_NG.png"))); break;
    case "Ledian (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Ledian_NG.png"))); break;
    case "Ledyba (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Ledyba_NG.png"))); break;
    case "Lugia (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Lugia_NG.png"))); break;
    case "Magby (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Magby_NG.png"))); break;
    case "Magmar (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Magmar_NG.png"))); break;
    case "Mantine (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Mantine_NG.png"))); break;
    case "Mareep (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Mareep_NG.png"))); break;
    case "Marill (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Marill_NG.png"))); break;
    case "Meganium (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/MeganiumHERBALSCENT_NG.png"))); break;
    case "Meganium (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/MeganiumWILDGROWTH_NG.png"))); break;
    case "Miltank (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Miltank_NG.png"))); break;
    case "Murkrow (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Murkrow_NG.png"))); break;
    case "Natu (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Natu_NG.png"))); break;
    case "Noctowl (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Noctowl_NG.png"))); break;
    case "Oddish (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Oddish_NG.png"))); break;
    case "Onix (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Onix_NG.png"))); break;
    case "Phanpy (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Phanpy_NG.png"))); break;
    case "Pichu (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Pichu_NG.png"))); break;
    case "Pikachu (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Pikachu_NG.png"))); break;
    case "Piloswine (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Piloswine_NG.png"))); break;
    case "Quagsire (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Quagsire_NG.png"))); break;
    case "Quilava (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Quilava1_NG.png"))); break;
    case "Quilava (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Quilava2_NG.png"))); break;
    case "Seadra (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Seadra_NG.png"))); break;
    case "Sentret (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Sentret_NG.png"))); break;
    case "Shuckle (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Shuckle_NG.png"))); break;
    case "Skarmory (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Skarmory_NG.png"))); break;
    case "Skiploom (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Skiploom_NG.png"))); break;
    case "Slowking (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Slowking_NG.png"))); break;
    case "Slowpoke (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Slowpoke_NG.png"))); break;
    case "Sneasel (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/SneaselBANNED_NG.png"))); break;
    case "Snubbull (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Snubbull_NG.png"))); break;
    case "Spinarak (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Spinarak_NG.png"))); break;
    case "Stantler (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Stantler_NG.png"))); break;
    case "Steelix (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Steelix_NG.png"))); break;
    case "Sudowoodo (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Sudowoodo_NG.png"))); break;
    case "Sunflora (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Sunflora_NG.png"))); break;
    case "Sunkern (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Sunkern_NG.png"))); break;
    case "Swinub (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Swinub_NG.png"))); break;
    case "Togepi (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Togepi_NG.png"))); break;
    case "Togetic (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Togetic.png"))); break;
    case "Totodile (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Totodile1_NG.png"))); break;
    case "Totodile (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Totodile2_NG.png"))); break;
    case "Typhlosion (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/TyphlosionFIREBOOST_NG.png"))); break;
    case "Typhlosion (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Typhlosion_FIRERECHARGE.png"))); break;    
    case "Wooper (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Wooper_NG.png"))); break;    
    case "Xatu (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_genesis/Xatu_NG.png"))); break;
    
    //Neo Discovery
    case "Beedrill (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Beedrill_NDISC.png"))); break;
    case "Butterfree (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Butterfree_NDISC.png"))); break;
    case "Caterpie (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Caterpie_NDISC.png"))); break;
    case "Corsola (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Corsola_NDISC.png"))); break;
    case "Dunsparce (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Dunsparce_NDISC.png"))); break;
    case "Eevee (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Eevee_NDISC.png"))); break;
    case "Espeon (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Espeon_NDISC.png"))); break;
    case "Espeon (ND 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Espeon2_NDISC.png"))); break;
    case "Forretress (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Forretress.png"))); break;
    case "Hitmontop (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Hitmontop.png"))); break;    
    case "Hoppip (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Hoppip_NDISC.png"))); break;    
    case "Houndoom (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Houndoom_NDISC.png"))); break;    
    case "Houndour (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Houndour_DARKNESS_NDISC.png"))); break;    
    case "Houndour (ND 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Houndour_NDISC.png"))); break;
    case "Igglybuff (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Igglybuff.png"))); break;
    case "Kabuto (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Kabuto_NDISC.png"))); break;
    case "Kabutops (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Kabutops_NDISC.png"))); break;
    case "Kakuna (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Kakuna_NDISC.png"))); break;
    case "Larvitar (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Larvitar_NDISC.png"))); break;
    case "Magnemite (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Magnemite_NDISC.png"))); break;
    case "Mareep (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Mareep_NDISC.png"))); break;
    case "Metapod (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Metapod_NDISC.png"))); break;
    case "Natu (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Natu_NDISC.png"))); break;
    case "Omanyte (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Omanyte_NDISC.png"))); break;
    case "Omastar (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Omastar_NDISC.png"))); break;
    case "Pineco (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Pineco_NDISC.png"))); break;
    case "Politoed (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Politoed.png"))); break;
    case "Poliwag (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Poliwag_NDISC.png"))); break;
    case "Poliwhirl (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Poliwhirl_NDISC.png"))); break;
    case "Poliwrath (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Poliwrath_NDISC.png"))); break;
    case "Pupitar (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Pupitar_NDISC.png"))); break;
    case "Scizor (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Scizor_NDISC.png"))); break; 
    case "Scyther (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Scyther_NDISC.png"))); break;
    case "Sentret (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Sentret_NDISC.png"))); break;
    case "Smeargle (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Smeargle_NDISC.png"))); break;
    case "Spinarak (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Spinarak_NDISC.png"))); break;
    case "Teddiursa (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Teddiursa_NDISC.png"))); break;
    case "Tyranitar (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Tyranitar_NDISC.png"))); break;
    case "Tyrogue (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Tyrogue_NDISC.png"))); break;
    case "Umbreon (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Umbreon_NDISC.png"))); break;
    case "Unown A": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/UnownA_NDISC.png"))); break;
    case "Unown D": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/UnownD_NDISC.png"))); break;
    case "Unown E": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/UnownE_NDISC.png"))); break;
    case "Unown F": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/UnownF_NDISC.png"))); break;
    case "Unown I": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/UnownI_NDISC.png"))); break;
    case "Unown M": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/UnownM_NDISC.png"))); break;
    case "Unown N": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/UnownN_NDISC.png"))); break;
    case "Unown O": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/UnownO_NDISC.png"))); break;
    case "Unown U": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/UnownU_NDISC.png"))); break; 
    case "Ursaring (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Ursaring_NDISC.png"))); break;
    case "Weedle (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Weedle_NDISC.png"))); break;
    case "Wobbuffet (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Wobbuffet_NDISC.png"))); break;
    case "Wooper (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Wooper_NDISC.png"))); break;
    case "Xatu (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Xatu_NDISC.png"))); break;
    case "Yanma (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_discovery/Yanma_NDISC.png"))); break;
    
    //Neo Revelations
    case "Aerodactyl (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Aerodactyl_NR.png"))); break;    
    case "Aipom (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Aipom_NR.png"))); break;
    case "Ampharos (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Ampharos_NR.png"))); break;
    case "Blissey (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Blissey.png"))); break;
    case "Celebi (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Celebi_NR.png"))); break;
    case "Celebi (NR 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Celebi_NRgrass.png"))); break;
    case "Chinchou (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Chinchou_NR.png"))); break;
    case "Crobat (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Crobat_NR.png"))); break;
    case "Delibird (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Delibird.png"))); break;
    case "Entei (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Entei_LegendaryBody.png"))); break;
    case "Entei (NR 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Entei_NR.png"))); break;
    case "Farfetch'd (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Farfetch'd_NR.png"))); break;
    case "Flaaffy (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Flaaffy_NR.png"))); break;
    case "Geodude (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Geodude_NR.png"))); break;
    case "Golbat (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Golbat_NR.png"))); break;
    case "Goldeen (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Goldeen_NR.png"))); break;
    case "Graveler (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Graveler_NR.png"))); break;
    case "Ho-Oh (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Ho-oh_NR.png"))); break;
    case "Ho-Oh (NR 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Ho-oh_colorless.png"))); break;
    case "Houndoom (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Houndoom.png"))); break;
    case "Jumpluff (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Jumpluff.png"))); break;
    case "Jynx (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Jynx_NRwater.png"))); break;
    case "Kingdra (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Kingdra.png"))); break;
    case "Lanturn (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Lanturn_NR.png"))); break;
    case "Lugia (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Lugia.png"))); break;
    case "Magcargo (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Magcargo.png"))); break;
    case "Magneton (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Magneton_NR.png"))); break;
    case "Misdreavus (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Misdreavus.png"))); break;
    case "Murkrow (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Murkrow.png"))); break;
    case "Octillery (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Octillery.png"))); break;
    case "Paras (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Paras_NR.png"))); break;
    case "Parasect (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Parasect_NR.png"))); break;
    case "Piloswine (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Piloswine_NR.png"))); break;
    case "Porygon2 (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Porygon2.png"))); break;
    case "Quagsire (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Quagsire_NR.png"))); break;
    case "Qwilfish (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Qwilfish.png"))); break;
    case "Raichu (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Raichu_NR.png"))); break;
    case "Raikou (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Raikou_NR.png"))); break;
    case "Raikou (NR 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Raikou_Legendarybody.png"))); break;
    case "Remoraid (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Remoraid_NR.png"))); break;    
    case "Seaking (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Seaking_NR.png"))); break;
    case "Shuckle (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Shuckle_NR.png"))); break;
    case "Skarmory (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Skarmory.png"))); break;
    case "Skiploom (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Skiploom_NR.png"))); break;
    case "Slugma (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Slugma_NR.png"))); break;
    case "Smoochum (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Smoochum_NR.png"))); break;
    case "Sneasel (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Sneasel.png"))); break;
    case "Snubbull (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Snubbull.png"))); break;
    case "Stantler (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Stantler.png"))); break;
    case "Starmie (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Starmie_NR.png"))); break;
    case "Staryu (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Staryu_NR.png"))); break;
    case "Sudowoodo (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Sudowoodo_NRmimic.png"))); break;
    case "Suicune (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Suicune_NR.png"))); break;
    case "Suicune (NR 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Suicune_legendarybody.png"))); break;
    case "Swinub (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Swinub_NR.png"))); break;
    case "Unown B": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/UnownB.png"))); break;
    case "Unown K": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/UnownK.png"))); break;
    case "Unown Y": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/UnownY.png"))); break;
    case "Zubat (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Zubat_NR.png"))); break;
    case "Magikarp (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Magikarp (Shining).png"))); break;    
    case "Gyarados (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_revelation/Gyarados (Shining).png"))); break;
    
        //Neo Destiny
    case "Ampharos (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Ampharos.png"))); break;    
    case "Cyndaquil (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Cyndaquil_ND.png"))); break;
    case "Chansey (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Chansey_ND.png"))); break;    
    case "Ariados (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Ariados.png"))); break;
    case "Crobat (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Crobat.png"))); break;
    case "Croconaw (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Croconaw.png"))); break;    
    case "Donphan (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Donphan.png"))); break;    
    case "Espeon (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Espeon.png"))); break;    
    case "Exeggutor (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Exeggutor.png"))); break;
    case "Feraligatr (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Feraligatr.png"))); break;    
    case "Flaaffy (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Flaaffy.png"))); break;
    case "Forretress (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Forretress.png"))); break;
    case "Gengar (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Gengar.png"))); break;    
    case "Haunter (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Haunter.png"))); break;    
    case "Houndoom (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Houndoom.png"))); break;
    case "Magcargo (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Magcargo.png"))); break;
    case "Octillery (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Octillery.png"))); break;
    case "Omanyte (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Omanyte.png"))); break;
    case "Omastar (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Omastar.png"))); break;
    case "Porygon2 (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Porygon2.png"))); break;
    case "Pupitar (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Pupitar.png"))); break;
    case "Quilava (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Quilava.png"))); break;
    case "Scizor (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Scizor.png"))); break;
    case "Slowking (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Slowking.png"))); break;
    case "Typhlosion (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Typhlosion.png"))); break;
    case "Tyranitar (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Tyranitar.png"))); break;
    case "Ursaring (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Ursaring.png"))); break;
    case "Wigglytuff (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dark_Wigglytuff.png"))); break;
    case "Dratini (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Dratini_NDshed.png"))); break;
    case "Exeggcute (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Exeggcute_ND.png"))); break;
    case "Gastly (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Gastly_ND.png"))); break;
    case "Girafarig (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Girafarig_ND.png"))); break;
    case "Gligar (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Gligar_NDstunpoison.png"))); break;
    case "Growlithe (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Growlithe_ND.png"))); break;
    case "Heracross (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Heracross.png"))); break;
    case "Hitmonchan (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Hitmonchan_ND.png"))); break;
    case "Hitmonlee (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Hitmonlee_ND.png"))); break;
    case "Houndour (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Houndour_ND.png"))); break;
    case "Jigglypuff (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Jigglypuff_ND.png"))); break;
    case "Vaporeon (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/LIght_Vaporeon.png"))); break;
    case "Larvitar (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Larvitar_ND.png"))); break;
    case "Ledyba (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Ledyba_ND.png"))); break;
    case "Arcanine (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Arcanine.png"))); break;
    case "Azumarill (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Azumarill.png"))); break;
    case "Dewgong (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Dewgong.png"))); break;
    case "Dragonair (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Dragonair.png"))); break;
    case "Dragonite (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Dragonite.png"))); break;
    case "Flareon (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Flareon.png"))); break;
    case "Golduck (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Golduck.png"))); break;
    case "Jolteon (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Jolteon.png"))); break;
    case "Lanturn (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Lanturn.png"))); break;
    case "Ledian (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Ledian.png"))); break;
    case "Machamp (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Machamp.png"))); break;
    case "Machoke (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Machoke.png"))); break;
    case "Ninetales (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Ninetales.png"))); break;
    case "Piloswine (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Piloswine.png"))); break;
    case "Slowbro (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Slowbro.png"))); break;
    case "Sunflora (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Sunflora.png"))); break;
    case "Togetic (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Togetic.png"))); break;
    case "Venomoth (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Venomoth.png"))); break;
    case "Wigglytuff (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Light_Wigglytuff.png"))); break;
    case "Machop (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Machop_ND.png"))); break;
    case "Mantine (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Mantine_ND.png"))); break;
    case "Mareep (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Mareep_ND.png"))); break;
    case "Phanpy (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Phanpy_ND.png"))); break;
    case "Pineco (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Pineco_ND.png"))); break;
    case "Porygon (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Porygon_ND.png"))); break;
    case "Psyduck (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Psyduck_ND.png"))); break;
    case "Remoraid (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Remoraid_ND.png"))); break;
    case "Scyther (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Scyther_ND.png"))); break;
    case "Seel (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Seel_ND.png"))); break;
    case "Celebi (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Shining_Celebi.png"))); break;
    case "Charizard (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Shining_Charizard.png"))); break;
    case "Kabutops (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Shining_Kabutops.png"))); break;
    case "Mewtwo (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Shining_Mewtwo.png"))); break;
    case "Noctowl (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Shining_Noctowl.png"))); break;
    case "Raichu (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Shining_Raichu.png"))); break;
    case "Steelix (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Shining_Steelix.png"))); break;
    case "Tyranitar (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Shining_Tyranitar.png"))); break;
    case "Slugma (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Slugma_ND.png"))); break;
    case "Sunkern (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Sunkern_ND.png"))); break;
    case "Swinub (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Swinub_ND.png"))); break;
    case "Togepi (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Togepi_ND.png"))); break;
    case "Totodile (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Totodile_ND.png"))); break;
    case "Venonat (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Venonat_ND.png"))); break;
    case "Vulpix (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/Vulpix_ND.png"))); break;
    case "Unown C": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/UnownC_ND.png"))); break;
    case "Unown G": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/UnownG_ND.png"))); break;    
    case "Unown H": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/UnownH_ND.png"))); break;
    case "Unown L": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/UnownL_ND.png"))); break;
    case "Unown P": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/UnownP_ND.png"))); break;
    case "Unown Q": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/UnownQ_ND.png"))); break;
    case "Unown S": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/UnownS_ND.png"))); break;
    case "Unown T": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/UnownT_ND.png"))); break;
    case "Unown V": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/UnownV_ND.png"))); break;
    case "Unown W": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/UnownW_ND.png"))); break;
    case "Unown X": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/UnownX_ND.png"))); break;
    case "Unown Z": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neo_destiny/UnownZ_ND.png"))); break;
    
    //Promo's and Southern Islands
    case "Arcanine (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Arcanine (Promo).png"))); break;
    case "Articuno (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Articuno (Promo).png"))); break;
    case "Articuno (Promo 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Articuno (Promo 2).png"))); break;
    case "Butterfree (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Butterfree (SI).png"))); break;
    case "Cleffa (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Cleffa (Promo).png"))); break;
    case "Charizard (Premium)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Charizard (Premium).png"))); break;    
    case "Dragonite (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Dragonite (Promo).png"))); break;
    case "Eevee (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Eevee (Promo).png"))); break;
    case "Electabuzz (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Electabuzz (Promo).png"))); break;
    case "Electabuzz (Promo 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Electabuzz (Promo 2).png"))); break;
    case "Entei (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Entei (Promo).png"))); break;
    case "Exeggutor (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Exeggutor (SI).png"))); break;
    case "Hitmontop (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Hitmontop (Promo).png"))); break;
    case "Igglybuff (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Igglybuff (Promo).png"))); break;
    case "Ivysaur (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Ivysaur (SI).png"))); break;
    case "Jigglypuff (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Jigglypuff (Promo).png"))); break;
    case "Jigglypuff (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Jigglypuff (SI).png"))); break;
    case "Lapras (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Lapras (SI).png"))); break;
    case "Ledyba (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Ledyba (SI).png"))); break;
    case "Lickitung (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Lickitung (SI).png"))); break;
    case "Machamp (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Machamp (Promo).png"))); break;
    case "Magmar (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Magmar (Promo).png"))); break;
    case "Marill (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Marill (Promo).png"))); break;
    case "Marill (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Marill (SI).png"))); break;
    case "Meowth (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Meowth (Promo).png"))); break;
    case "Meowth (Team Rocket's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Meowth (Team Rocket's).png"))); break;
    case "Mew (Ancient)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Mew (Ancient).png"))); break;
    case "Mew (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Mew (Promo).png"))); break;
    case "Mew (Promo 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Mew (Promo 2).png"))); break;
    case "Mew (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Mew (SI).png"))); break;
    case "Mewtwo (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Mewtwo (Promo).png"))); break;
    case "Mewtwo (Promo 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Mewtwo (Promo 2).png"))); break;
    case "Misdreavus (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Misdreavous (Promo).png"))); break;
    case "Moltres (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Moltres (Promo).png"))); break;
    case "Onix (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Onix (SI).png"))); break;
    case "Pichu (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Pichu (Promo).png"))); break;
    case "Pidgeot (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Pidgeot (SI).png"))); break;
    case "Pikachu (Flying)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Pikachu (Flying).png"))); break;
    case "Pikachu (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Pikachu (Promo).png"))); break;
    case "Pikachu (Promo 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Pikachu (Promo 2).png"))); break;
    case "Pikachu (Promo 3)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Pikachu (Promo 3).png"))); break;
    case "Pikachu (Promo 4)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Pikachu (Promo 4).png"))); break;
    case "Pikachu (Surfing)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Pikachu (Surfing).png"))); break;
    case "Pikachu (___'s)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Pikachu (___'s).png"))); break;
    case "Porygon (Cool)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Porygon (Cool).png"))); break;
    case "Primeape (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Primeape (SI).png"))); break;
    case "Raticate (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Raticate (SI).png"))); break;
    case "Scizor (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Scizor (Promo).png"))); break;
    case "Scyther (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Scyther (Promo).png"))); break;
    case "Slowking (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Slowking (SI).png"))); break;
    case "Smeargle (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Smeargle (Promo).png"))); break;
    case "Snorlax (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Snorlax (Promo).png"))); break;
    case "Tentacruel (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Tentacruel (SI).png"))); break;
    case "Togepi (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Togepi (Promo).png"))); break;
    case "Togepi (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Togepi (SI).png"))); break;
    case "Unown J (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Unown J (Promo).png"))); break;
    case "Unown R (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Unown R (Promo).png"))); break;    
    case "Venusaur (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Venusaur (Promo).png"))); break;
    case "Vileplume (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Vileplume (SI).png"))); break;
    case "Wartortle (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Wartortle (SI).png"))); break;
    case "Zapdos (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Promos/Zapdos (Promo).png"))); break;
    
    
    default: Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back.png"))); break;
    
}// TODO add your handling code here:
    }

    private void TogglePrize(JLabel Prize) {
        if (Prize.getIcon()==null){
            Prize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackSmall.png")));
        }
        else{
            Prize.setIcon(null);
        }
    }

    private void ResetEnergies(JButton En1, JButton En2, JButton En3, JButton En4) {
    En4.setBackground(Color.LIGHT_GRAY);
    En3.setBackground(Color.LIGHT_GRAY);
    En2.setBackground(Color.LIGHT_GRAY);
    En1.setBackground(Color.LIGHT_GRAY);       //To change body of generated methods, choose Tools | Templates.
    }

    private void ResetStatuses(JButton BR, JButton PO, JButton PZ, JButton SL, JButton CN) {
    BR.setBackground(Color.LIGHT_GRAY);
    PO.setBackground(Color.LIGHT_GRAY);
    PZ.setBackground(Color.LIGHT_GRAY);
    SL.setBackground(Color.LIGHT_GRAY);
    CN.setBackground(Color.LIGHT_GRAY);     //To change body of generated methods, choose Tools | Templates.
    }
}

