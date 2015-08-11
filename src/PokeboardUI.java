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
import javax.swing.*;
import javax.imageio.*;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;



/**
 *
 * @author Collin
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
    
    String[] PokemonList = { " ", "Abra", "Abra (R)", "Abra (Sabrina's)", "Abra (Sabrina's 2)", "Abra (Sabrina's 3)", "Aerodactyl", "Aerodactyl (NR)", "Aipom (NG)", "Aipom (NR)", "Alakazam", "Alakazam (Dark)", "Alakazam (Sabrina's)", "Ampharos (NG)", "Ampharos (NR)", "Ampharos (Dark)", "Arbok", "Arbok (Dark)", "Arbok (Koga's)", "Arcanine", "Arcanine (Blaine's)", "Arcanine (Light)", "Arcanine (Promo)", "Ariados (NG)", "Ariados (Dark)", "Articuno", "Articuno (Promo)", "Articuno (Promo 2)", "Azumarill (NG)", "Azumarill (Light)", "Bayleef (NG)", "Bayleef (NG 2)", "Beedrill", "Beedrill (Koga's)", "Beedrill (ND)", "Bellossom (NG)", "Bellsprout", "Bellsprout (Erika's)", "Bellsprout (Erika's 2)", "Bellsprout (Erika's 3)", "Blastoise", "Blastoise (Dark)", "Blissey (NR)", "Bulbasaur", "Bulbasaur (Erika's)", "Butterfree", "Butterfree (ND)", "Butterfree (SI)", "Caterpie", "Caterpie (ND)", "Celebi (NR)", "Celebi (NR 2)", "Celebi (Shining)", "Chansey", "Chansey (NDe)", "Charizard", "Charizard (Dark)", "Charizard (Blaine's)", "Charizard (Shining)", "Charizard (Premium)", "Charmander", "Charmander (R)", "Charmander (Blaine's)", "Charmander (Blaine's 2)", "Charmeleon", "Charmeleon (Dark)", "Charmeleon (Blaine's)", "Chikorita (NG)", "Chikorita (NG 2)", "Chinchou (NG)", "Chinchou (NR)", "Clefable", "Clefable (Erika's)", "Clefairy", "Clefairy (Erika's)", "Clefairy (Erika's 2)", "Clefairy (NG)", "Cleffa (NG)", "Cleffa (Promo)", "Cloyster", "Cloyster (Misty's)", "Corsola (ND)", "Crobat (NR)", "Crobat (Dark)", "Croconaw (NG)", "Croconaw (NG 2)", "Croconaw (Dark)", "Cubone", "Cyndaquil (NG)", "Cyndaquil (NG 2)", "Cyndaquil (NDe)", "Delibird (NR)", "Dewgong", "Dewgong (Misty's)", "Dewgong (Light)", "Diglett", "Diglett (R)", "Diglett (Brock's)", "Ditto", "Ditto (Koga's)", "Dodrio", "Dodrio (Blaine's)", "Doduo", "Doduo (Blaine's)", "Donphan (NG)", "Donphan (Dark)", "Dragonair", "Dragonair (Dark)", "Dragonair (Erika's)", "Dragonair (Light)", "Dragonite", "Dragonite (Dark)", "Dragonite (Light)", "Dragonite (Promo)", "Dratini", "Dratini (R)", "Dratini (Erika's)", "Dratini (NDe)", "Drowzee", "Drowzee (R)", "Drowzee (Sabrina's)", "Drowzee (Sabrina's 2)", "Dugtrio", "Dugtrio (Dark)", "Dugtrio (Brock's)", "Dunsparce (ND)", "Eevee", "Eevee (R)", "Eevee (Lt. Surge's)", "Eevee (ND)", "Eevee (Promo)", "Ekans", "Ekans (R)", "Ekans (Koga's)", "Electabuzz", "Electabuzz (Lt. Surge's)", "Electabuzz (Lt. Surge's 2)", "Electabuzz (NG)", "Electabuzz (Promo)", "Electabuzz (Promo 2)", "Electrode", "Electrode (Jungle)", "Electrode (Dark)", "Electrode (Lt. Surge's)", "Elekid (NG)", "Entei (NR)", "Entei (NR 2)", "Entei (Promo)", "Espeon (ND)", "Espeon (ND 2)", "Espeon (Dark)", "Exeggcute", "Exeggcute (Erika's)", "Exeggcute (Erika's 2)", "Exeggcute (NDe)", "Exeggutor", "Exeggutor (Erika's)", "Exeggutor (Dark)", "Exeggutor (SI)", "Farfetch'd", "Farfetch'd (NR)", "Fearow", "Fearow (Lt. Surge's)", "Feraligatr (NG)", "Feraligatr (NG 2)", "Feraligatr (Dark)", "Flaaffy (NG)", "Flaaffy (NR)", "Flaaffy (Dark)", "Flareon", "Flareon (Dark)", "Flareon (Light)", "Forretress (ND)", "Forretress (Dark)", "Furret (NG)", "Gastly", "Gastly (Fossil)", "Gastly (Sabrina's)", "Gastly (Sabrina's 2)", "Gastly (Sabrina's 3)", "Gastly (NDe)", "Gengar", "Gengar (Sabrina's)", "Gengar (Sabrina's 2)", "Gengar (Dark)", "Geodude", "Geodude (Brock's)", "Geodude (Brock's 2)", "Geodude (Brock's 3)", "Geodude (NR)", "Girafarig (NG)", "Girafarig (NDe)", "Gligar (NG)", "Gligar (NDe)", "Gloom", "Gloom (Dark)", "Gloom (Erika's)", "Gloom (Erika's 2)", "Gloom (NG)", "Golbat", "Golbat (Dark)", "Golbat (Brock's)", "Golbat (Koga's)", "Golbat (NR)", "Goldeen", "Goldeen (Misty's)", "Goldeen (Misty's 2)", "Goldeen (NR)", "Golduck", "Golduck (Dark)", "Golduck (Misty's)", "Golduck (Sabrina's)", "Golduck (Light)", "Golem", "Golem (Brock's)", "Granbull (NG)", "Graveler", "Graveler (Brock's)", "Graveler (Brock's 2)", "Graveler (NR)", "Grimer", "Grimer (R)", "Grimer (Koga's)", "Growlithe", "Growlithe (Blaine's)", "Growlithe (Blaine's 2)", "Growlithe (Blaine's 3)", "Growlithe (NDe)", "Gyarados", "Gyarados (Dark)", "Gyarados (Giovanni's)", "Gyarados (Misty's)", "Gyarados (Shining)", "Haunter", "Haunter (Fossil)", "Haunter (Sabrina's)", "Haunter (Sabrina's 2)", "Haunter (Dark)", "Heracross (NG)", "Heracross (NDe)", "Hitmonchan", "Hitmonchan (Rocket's)", "Hitmonchan (NDe)", "Hitmonlee", "Hitmonlee (NDe)", "Hitmontop (ND)", "Hitmontop (Promo)", "Ho-Oh (NR)", "Ho-Oh (NR 2)", "Hoothoot (NG)", "Hoppip (NG)", "Hoppip (ND)", "Horsea", "Horsea (Misty's)", "Horsea (Misty's 2)", "Horsea (NG)", "Houndoom (ND)", "Houndoom (NR)", "Houndoom (Dark)", "Houndour (ND)", "Houndour (ND 2)", "Houndour (NDe)", "Hypno", "Hypno (Dark)", "Hypno (Sabrina's)", "Igglybuff (ND)", "Igglybuff (Promo)", "Ivysaur", "Ivysaur (Erika's)", "Ivysaur (SI)", "Jigglypuff", "Jigglypuff (Erika's)", "Jigglypuff (NDe)", "Jigglypuff (Promo)", "Jigglypuff (SI)", "Jolteon", "Jolteon (Dark)", "Jolteon (Lt. Surge's)", "Jolteon (Light)", "Jumpluff (NG)", "Jumpluff (NR)", "Jynx", "Jynx (Sabrina's)", "Jynx (Sabrina's 2)", "Jynx (NR)", "Kabuto", "Kabuto (ND)", "Kabutops", "Kabutops (ND)", "Kabutops (Shining)", "Kadabra", "Kadabra (Dark)", "Kadabra (Sabrina's)", "Kakuna", "Kakuna (Koga's)", "Kakuna (ND)", "Kangaskhan", "Kangaskhan (Blaine's)", "Kingdra (NG)", "Kingdra (NR)", "Kingler", "Koffing", "Koffing (R)", "Koffing (Koga's)", "Koffing (Koga's 2)", "Krabby", "Lanturn (NG)", "Lanturn (NR)", "Lanturn (Light)", "Lapras", "Lapras (SI)", "Larvitar (ND)", "Larvitar (NDe)", "Ledian (NG)", "Ledian (Light)", "Ledyba (NG)", "Ledyba (NDe)", "Ledyba (SI)", "Lickitung", "Lickitung (Brock's)", "Lickitung (SI)", "Lugia (NG)", "Lugia (NR)", "Machamp", "Machamp (Dark)", "Machamp (Giovanni's)", "Machamp (Light)", "Machamp (Promo)", "Machoke", "Machoke (Dark)", "Machoke (Giovanni's)", "Machoke (Light)", "Machop", "Machop (R)", "Machop (Giovanni's)", "Machop (NDe)", "Magby (NG)", "Magcargo (NR)", "Magcargo (Dark)", "Magikarp", "Magikarp (R)", "Magikarp (Giovanni's)", "Magikarp (Misty's)", "Magikarp (Shining)", "Magmar", "Magmar (Fossil)", "Magmar (Blaine's)", "Magmar (NG)", "Magmar (Promo)", "Magnemite", "Magnemite (R)", "Magnemite (Lt. Surge's)", "Magnemite (Lt. Surge's 2)", "Magnemite (ND)", "Magneton", "Magneton (Fossil)", "Magneton (Dark)", "Magneton (Lt. Surge's)", "Magneton (NR)", "Mankey", "Mankey (R)", "Mankey (Brock's)", "Mankey (Brock's 2)", "Mankey (Blaine's)", "Mantine (NG)", "Mantine (NDe)", "Mareep (NG)", "Mareep (ND)", "Mareep (NDe)", "Marill (NG)", "Marill (Promo)", "Marill (SI)", "Marowak", "Meganium (NG)", "Meganium (NG 2)", "Meowth", "Meowth (R)", "Meowth (Giovanni's)", "Meowth (Giovanni's 2)", "Meowth (Promo)", "Meowth (Team Rocket's)", "Metapod", "Metapod (ND)", "Mew (Promo)", "Mew (Promo 2)", "Mew (SI)", "Mew (Shining)", "Mew (Ancient)", "Mewtwo", "Mewtwo (Rocket's)", "Mewtwo (Shining)", "Mewtwo (Promo)", "Mewtwo (Promo 2)", "Miltank (NG)", "Misdreavus (NR)", "Misdreavus (Promo)", "Moltres", "Moltres (Blaine's)", "Moltres (Rocket's)", "Moltres (Promo)", "Mr. Mime", "Mr. Mime (Sabrina's)", "Mr. Mime (Sabrina's 2)", "Muk", "Muk (Dark)", "Muk (Koga's)", "Murkrow (NG)", "Murkrow (NR)", "Mysterious Fossil", "Natu (NG)", "Natu (ND)", "Nidoking", "Nidoking (Giovanni's)", "Nidoqueen", "Nidoqueen (Giovanni's)", "Nidoran Female", "Nidoran Female (Giovanni's)", "Nidoran Male", "Nidoran Male (Giovanni's)", "Nidorina", "Nidorina (Giovanni's)", "Nidorino", "Nidorino (Giovanni's)", "Ninetales", "Ninetales (Brock's)", "Ninetales (Blaine's)", "Ninetales (Light)", "Noctowl (NG)", "Noctowl (Shining)", "Octillery (NR)", "Octillery (Dark)", "Oddish", "Oddish (R)", "Oddish (Erika's)", "Oddish (Erika's 2)", "Oddish (Erika's 3)", "Oddish (NG)", "Omanyte", "Omanyte (ND)", "Omanyte (Dark)", "Omastar", "Omastar (ND)", "Omastar (Dark)", "Onix", "Onix (Brock's)", "Onix (Brock's 2)", "Onix (NG)", "Onix (SI)", "Paras", "Paras (Erika's)", "Paras (NR)", "Parasect", "Parasect (NR)", "Persian", "Persian (Dark)", "Persian (Giovanni's)", "Phanpy (NG)", "Phanpy (NDe)", "Pichu (NG)", "Pichu (Promo)", "Pidgeot", "Pidgeot (SI)", "Pidgeotto", "Pidgeotto (Koga's)", "Pidgey", "Pidgey (Koga's)", "Pidgey (Koga's 2)", "Pikachu", "Pikachu (Jungle)", "Pikachu (Lt. Surge's)", "Pikachu (Lt. Surge's 2)", "Pikachu (NG)", "Pikachu (Promo)", "Pikachu (Promo 2)", "Pikachu (Promo 3)", "Pikachu (Promo 4)", "Pikachu (___'s)", "Pikachu (Flying)", "Pikachu (Surfing)", "Piloswine (NG)", "Piloswine (NR)", "Piloswine (Light)", "Pineco (ND)", "Pineco (NDe)", "Pinsir", "Pinsir (Giovanni's)", "Politoed (ND)", "Poliwag", "Poliwag (Misty's)", "Poliwag (Misty's 2)", "Poliwag (ND)", "Poliwhirl", "Poliwhirl (Misty's)", "Poliwhirl (ND)", "Poliwrath", "Poliwrath (Misty's)", "Poliwrath (ND)", "Ponyta", "Ponyta (R)", "Ponyta (Blaine's)", "Ponyta (Blaine's 2)", "Porygon", "Porygon (R)", "Porygon (NDe)", "Porygon (Sabrina's)", "Porygon (Cool)", "Porygon2 (NR)", "Porygon2 (Dark)", "Primeape", "Primeape (Dark)", "Primeape (Brock's)", "Primeape (SI)", "Psyduck", "Psyduck (R)", "Psyduck (Misty's)", "Psyduck (Misty's 2)", "Psyduck (Sabrina's)", "Psyduck (NDe)", "Pupitar (ND)", "Pupitar (Dark)", "Quagsire (NG)", "Quagsire (NR)", "Quilava (NG)", "Quilava (NG 2)", "Quilava (Dark)", "Qwilfish (NR)", "Raichu", "Raichu (Fossil)", "Raichu (Dark)", "Raichu (Lt. Surge's)", "Raichu (Lt. Surge's 2)", "Raichu (NR)", "Raichu (Shining)", "Raikou (NR)", "Raikou (NR 2)", "Rapidash", "Rapidash (Dark)", "Rapidash (Blaine's)", "Raticate", "Raticate (Dark)", "Raticate (Lt. Surge's)", "Raticate (Lt. Surge's 2)", "Raticate (SI)", "Rattata", "Rattata (R)", "Rattata (Lt. Surge's)", "Rattata (Lt. Surge's 2)", "Remoraid (NR)", "Remoraid (NDe)", "Rhydon", "Rhydon (Brock's)", "Rhyhorn", "Rhyhorn (Brock's)", "Rhyhorn (Brock's 2)", "Rhyhorn (Blaine's)", "Sandshrew", "Sandshrew (Brock's)", "Sandshrew (Brock's 2)", "Sandslash", "Sandslash (Brock's)", "Sandslash (Brock's 2)", "Scizor (ND)", "Scizor (Dark)", "Scizor (Promo)", "Scyther", "Scyther (Rocket's)", "Scyther (ND)", "Scyther (NDe)", "Scyther (Promo)", "Seadra", "Seadra (Misty's)", "Seadra (NG)", "Seaking", "Seaking (Misty's)", "Seaking (NR)", "Seel", "Seel (Misty's)", "Seel (Misty's 2)", "Seel (NDe)", "Sentret (NG)", "Sentret (ND)", "Shellder", "Shellder (Misty's)", "Shuckle (NG)", "Shuckle (NR)", "Skarmory (NG)", "Skarmory (NR)", "Skiploom (NG)", "Skiploom (NR)", "Slowbro", "Slowbro (Dark)", "Slowbro (Sabrina's)", "Slowbro (Light)", "Slowking (NG)", "Slowking (Dark)", "Slowking (SI)", "Slowpoke", "Slowpoke (R)", "Slowpoke (Sabrina's)", "Slowpoke (NG)", "Slugma (NR)", "Slugma (NDe)", "Smeargle (ND)", "Smeargle (Promo)", "Smoochum (NR)", "Sneasel (NG)", "Sneasel (NR)", "Snorlax", "Snorlax (Rocket's)", "Snorlax (Promo)", "Snubbull (NG)", "Snubbull (NR)", "Spearow", "Spearow (Lt. Surge's)", "Spearow (Lt. Surge's 2)", "Spinarak (NG)", "Spinarak (ND)", "Squirtle", "Squirtle (R)", "Stantler (NG)", "Stantler (NR)", "Starmie", "Starmie (Misty's)", "Starmie (NR)", "Staryu", "Staryu (Misty's)", "Staryu (Misty's 2)", "Staryu (NR)", "Steelix (NG)", "Steelix (Shining)", "Sudowoodo (NG)", "Sudowoodo (NR)", "Suicune (NR)", "Suicune (NR 2)", "Sunflora (NG)", "Sunflora (Light)", "Sunkern (NG)", "Sunkern (NDe)", "Swinub (NG)", "Swinub (NR)", "Swinub (NDe)", "Tangela", "Tangela (Erika's)", "Tangela (Koga's)", "Tauros", "Tauros (Blaine's)", "Teddiursa (ND)", "Tentacool", "Tentacool (Misty's)", "Tentacool (Misty's 2)", "Tentacruel", "Tentacruel (Misty's)", "Tentacruel (SI)", "Togepi (NG)", "Togepi (NDe)", "Togepi (Promo)", "Togepi (SI)", "Togetic (NG)", "Togetic (Light)", "Totodile (NG)", "Totodile (NG 2)", "Totodile (NDe)", "Typhlosion (NG)", "Typhlosion (NG 2)", "Typhlosion (Dark)", "Tyranitar (ND)", "Tyranitar (Dark)", "Tyranitar (Shining)", "Tyrogue (ND)", "Umbreon (ND)", "Unown A", "Unown B", "Unown C", "Unown D", "Unown E", "Unown F", "Unown G", "Unown H", "Unown I", "Unown J (Promo)", "Unown K", "Unown L", "Unown M", "Unown N", "Unown O", "Unown P", "Unown Q", "Unown R (Promo)", "Unown S", "Unown T", "Unown U", "Unown V", "Unown W", "Unown X", "Unown Y", "Unown Z", "Ursaring (ND)", "Ursaring (Dark)", "Vaporeon", "Vaporeon (Dark)", "Vaporeon (Light)", "Venomoth", "Venomoth (Sabrina's)", "Venomoth (Light)", "Venonat", "Venonat (Sabrina's)", "Venonat (NDe)", "Venusaur", "Venusaur (Erika's)", "Venusaur (Promo)", "Victreebel", "Victreebel (Erika's)", "Vileplume", "Vileplume (Dark)", "Vileplume (Erika's)", "Vileplume (SI)", "Voltorb", "Voltorb (R)", "Voltorb (Lt. Surge's)", "Voltorb (Lt. Surge's 2)", "Vulpix", "Vulpix (Blaine's)", "Vulpix (Blaine's 2)", "Vulpix (Brock's)", "Vulpix (Brock's 2)", "Vulpix (NDe)", "Wartortle", "Wartortle (Dark)", "Wartortle (SI)", "Weedle", "Weedle (Koga's)", "Weedle (ND)", "Weepinbell", "Weepinbell (Erika's)", "Weepinbell (Erika's 2)", "Weezing", "Weezing (Dark)", "Weezing (Koga's)", "Wigglytuff", "Wigglytuff (Dark)", "Wigglytuff (Light)", "Wobbuffet (ND)", "Wooper (NG)", "Wooper (ND)", "Xatu (NG)", "Xatu (ND)", "Yanma (ND)", "Zapdos", "Zapdos (Fossil)", "Zapdos (Rocket's)", "Zapdos (Promo)", "Zubat", "Zubat (R)", "Zubat (Brock's)", "Zubat (Brock's 2)", "Zubat (Koga's)", "Zubat (NR)" };


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JohtoActiveCard = new javax.swing.JFrame();
        JohtoActiveZoom = new javax.swing.JLabel();
        KantoActiveCard = new javax.swing.JFrame();
        KantoActiveZoom = new javax.swing.JLabel();
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

        JohtoActiveCard.setAlwaysOnTop(true);
        JohtoActiveCard.setMinimumSize(new java.awt.Dimension(425, 575));
        JohtoActiveCard.setPreferredSize(new java.awt.Dimension(425, 575));
        JohtoActiveCard.setSize(new java.awt.Dimension(425, 575));
        JohtoActiveCard.setType(java.awt.Window.Type.UTILITY);

        JohtoActiveZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Back.png"))); // NOI18N
        JohtoActiveZoom.setMaximumSize(new java.awt.Dimension(400, 551));
        JohtoActiveZoom.setMinimumSize(new java.awt.Dimension(400, 551));
        JohtoActiveZoom.setPreferredSize(new java.awt.Dimension(400, 551));

        javax.swing.GroupLayout JohtoActiveCardLayout = new javax.swing.GroupLayout(JohtoActiveCard.getContentPane());
        JohtoActiveCard.getContentPane().setLayout(JohtoActiveCardLayout);
        JohtoActiveCardLayout.setHorizontalGroup(
            JohtoActiveCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(JohtoActiveCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JohtoActiveCardLayout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(JohtoActiveZoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(191, Short.MAX_VALUE)))
        );
        JohtoActiveCardLayout.setVerticalGroup(
            JohtoActiveCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(JohtoActiveCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JohtoActiveCardLayout.createSequentialGroup()
                    .addComponent(JohtoActiveZoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 30, Short.MAX_VALUE)))
        );

        KantoActiveCard.setAlwaysOnTop(true);
        KantoActiveCard.setMinimumSize(new java.awt.Dimension(425, 575));
        KantoActiveCard.setPreferredSize(new java.awt.Dimension(425, 575));
        KantoActiveCard.setSize(new java.awt.Dimension(425, 575));
        KantoActiveCard.setType(java.awt.Window.Type.UTILITY);

        KantoActiveZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Back.png"))); // NOI18N
        KantoActiveZoom.setMaximumSize(new java.awt.Dimension(400, 551));
        KantoActiveZoom.setMinimumSize(new java.awt.Dimension(400, 551));
        KantoActiveZoom.setPreferredSize(new java.awt.Dimension(400, 551));

        javax.swing.GroupLayout KantoActiveCardLayout = new javax.swing.GroupLayout(KantoActiveCard.getContentPane());
        KantoActiveCard.getContentPane().setLayout(KantoActiveCardLayout);
        KantoActiveCardLayout.setHorizontalGroup(
            KantoActiveCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(KantoActiveCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KantoActiveCardLayout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(KantoActiveZoom, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(191, Short.MAX_VALUE)))
        );
        KantoActiveCardLayout.setVerticalGroup(
            KantoActiveCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(KantoActiveCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(KantoActiveCardLayout.createSequentialGroup()
                    .addComponent(KantoActiveZoom, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Stadium.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Stadium", "Broken Ground Gym", "Celadon City Gym", "Cerulean City Gym", "Chaos Gym", "Cinnabar City Gym", "Ecogym", "Energy Stadium", "Fuchsia City Gym", "Healing Field", "Lucky Stadium", "No Removal Gym", "Narrow Gym", "Pewter City Gym", "Pokemon Tower", "Radio Tower", "Resistance Gym", "Rocket's Hideout", "Rocket's Minefield Gym", "Saffron City Gym", "Speed Stadium", "Sprout Tower", "The Rocket's Training Gym", "Vermillion City Gym" }));
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

        JohtoPrize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png"))); // NOI18N
        JohtoPrize1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JohtoPrize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoPrize1MouseClicked(evt);
            }
        });
        Background.add(JohtoPrize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 21, 30));

        JohtoPrize2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png"))); // NOI18N
        JohtoPrize2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JohtoPrize2.setPreferredSize(new java.awt.Dimension(14, 20));
        JohtoPrize2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoPrize2MouseClicked(evt);
            }
        });
        Background.add(JohtoPrize2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 21, 30));

        JohtoPrize3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png"))); // NOI18N
        JohtoPrize3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JohtoPrize3.setPreferredSize(new java.awt.Dimension(21, 30));
        JohtoPrize3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoPrize3MouseClicked(evt);
            }
        });
        Background.add(JohtoPrize3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 21, 30));

        JohtoPrize4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png"))); // NOI18N
        JohtoPrize4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JohtoPrize4.setMaximumSize(new java.awt.Dimension(21, 30));
        JohtoPrize4.setMinimumSize(new java.awt.Dimension(21, 30));
        JohtoPrize4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoPrize4MouseClicked(evt);
            }
        });
        Background.add(JohtoPrize4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 21, 30));

        JohtoPrize5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png"))); // NOI18N
        JohtoPrize5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JohtoPrize5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoPrize5MouseClicked(evt);
            }
        });
        Background.add(JohtoPrize5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 20, 30));

        JohtoPrize6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png"))); // NOI18N
        JohtoPrize6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        JohtoPrize6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoPrize6MouseClicked(evt);
            }
        });
        Background.add(JohtoPrize6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 20, 30));

        KantoPrize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png"))); // NOI18N
        KantoPrize1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        KantoPrize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoPrize1MouseClicked(evt);
            }
        });
        Background.add(KantoPrize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 21, 30));

        KantoPrize2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png"))); // NOI18N
        KantoPrize2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        KantoPrize2.setPreferredSize(new java.awt.Dimension(14, 20));
        KantoPrize2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoPrize2MouseClicked(evt);
            }
        });
        Background.add(KantoPrize2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 21, 30));

        KantoPrize3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png"))); // NOI18N
        KantoPrize3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        KantoPrize3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoPrize3MouseClicked(evt);
            }
        });
        Background.add(KantoPrize3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 21, 30));

        KantoPrize4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png"))); // NOI18N
        KantoPrize4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        KantoPrize4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoPrize4MouseClicked(evt);
            }
        });
        Background.add(KantoPrize4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 21, 30));

        KantoPrize5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png"))); // NOI18N
        KantoPrize5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        KantoPrize5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoPrize5MouseClicked(evt);
            }
        });
        Background.add(KantoPrize5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 20, 30));

        KantoPrize6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png"))); // NOI18N
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

        JohtoCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Back.png"))); // NOI18N
        JohtoCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JohtoCardMouseClicked(evt);
            }
        });
        Background.add(JohtoCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 134, 190));

        KantoCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Back.png"))); // NOI18N
        KantoCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KantoCardMouseClicked(evt);
            }
        });
        Background.add(KantoCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 134, 190));

        mid.setBackground(new java.awt.Color(0, 0, 0));
        mid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/boackground2-1.png"))); // NOI18N
        mid.setAlignmentY(0.0F);
        mid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        mid.setMaximumSize(new java.awt.Dimension(750, 469));
        mid.setMinimumSize(new java.awt.Dimension(750, 469));
        mid.setPreferredSize(new java.awt.Dimension(750, 469));
        Background.add(mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 750, 430));
        mid.getAccessibleContext().setAccessibleName("mid");

        Kanto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Kanto copy.png"))); // NOI18N
        Kanto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Background.add(Kanto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 750, 170));

        Johto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Johto copy.png"))); // NOI18N
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
        KantoBench5Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/switch.png"))); // NOI18N
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
        KantoBench4Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/switch.png"))); // NOI18N
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
        KantoBench3Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/switch.png"))); // NOI18N
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
        KantoBench2Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/switch.png"))); // NOI18N
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
        KantoBench1Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/switch.png"))); // NOI18N
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
        JohtoBench5Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/switch.png"))); // NOI18N
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
        JohtoBench4Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/switch.png"))); // NOI18N
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
        JohtoBench3Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/switch.png"))); // NOI18N
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
        JohtoBench2Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/switch.png"))); // NOI18N
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
        JohtoBench1Switch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/switch.png"))); // NOI18N
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
DisplayCard(KantoString, KantoCard, KantoActiveZoom);

    }//GEN-LAST:event_KantoActiveItemStateChanged

    private void StadiumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_StadiumItemStateChanged
String StadiumString = (String)Stadium.getSelectedItem();
switch(StadiumString){
    case "Stadium": StadiumCard.setIcon(null); break;
    case "No Removal Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/No Removal Gym.png"))); break;
    case "The Rocket's Training Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/The Rocket's Training Gym.png"))); break;
    case "Celadon City Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Celadon City Gym.png"))); break;
    case "Cerulean City Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Cerulean City Gym.png"))); break;
    case "Pewter City Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Pewter City Gym.png"))); break;
    case "Vermillion City Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Vermillion City Gym.png"))); break;
    case "Narrow Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Narrow Gym.png"))); break;
    case "Chaos Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Chaos Gym.png"))); break;
    case "Resistance Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Resistance Gym.png"))); break;
    case "Cinnabar City Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Cinnabar City Gym.png"))); break;        
    case "Fuchsia City Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Fuchsia City Gym.png"))); break;        
    case "Rocket's Minefield Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Rocket's Minefield Gym.png"))); break;        
    case "Saffron City Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Saffron City Gym.png"))); break;        
    case "Viridian City Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Viridian City Gym.png"))); break;        
    case "Ecogym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Ecogym.png"))); break;        
    case "Sprout Tower": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Sprout Tower.png"))); break;        
    case "Healing Field": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Healing Field.png"))); break;        
    case "Rocket's Hideout": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Rocket's Hideout.png"))); break;        
    case "Lucky Stadium": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Lucky Stadium.png"))); break;        
    case "Pokemon Tower": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Pokemon Tower.png"))); break;        
    case "Broken Ground Gym": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Broken Ground Gym.png"))); break;        
    case "Radio Tower": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Radio Tower.png"))); break;        
    case "Energy Stadium": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Energy Stadium.png"))); break; 
    case "Speed Stadium": StadiumCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/stadiums/Speed Stadium.png"))); break;
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
DisplayCard(JohtoString, JohtoCard, JohtoActiveZoom);        // TODO add your handling code here:
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

    private void KantoCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KantoCardMouseClicked
        KantoActiveCard.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_KantoCardMouseClicked

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
    private javax.swing.JLabel JohtoActiveZoom;
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
    private javax.swing.JFrame KantoActiveCard;
    private javax.swing.JButton KantoActiveEnergy1;
    private javax.swing.JButton KantoActiveEnergy2;
    private javax.swing.JButton KantoActiveEnergy3;
    private javax.swing.JButton KantoActiveEnergy4;
    private javax.swing.JLabel KantoActiveZoom;
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
JohtoPrize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png")));
JohtoPrize2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png")));
JohtoPrize3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png")));
JohtoPrize4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png")));
JohtoPrize5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png")));
JohtoPrize6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png")));
KantoPrize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png")));
KantoPrize2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png")));
KantoPrize3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png")));
KantoPrize4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png")));
KantoPrize5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png")));
KantoPrize6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png")));
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
    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("pokeball.png")));
    }
        
    private void DisplayCard(String NameString, JLabel Card, JLabel CardZoom) {
                switch (NameString){
//Base Set
    case "Active": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Back.png"))); break;
    case "Abra": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Abra.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/AbraZoom.png")));break;
    case "Abra (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Abra.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/AbraZoom.png"))); break;
    case "Alakazam": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Alakazam.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/AlakazamZoom.png")));break;    
    case "Arcanine": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Arcanine.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/ArcanineZoom.png")));break;
    case "Beedrill": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Beedrill.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/BeedrillZoom.png")));break;
    case "Blastoise": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Blastoise.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/BlastoiseZoom.png")));break;
    case "Bulbasaur": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Bulbasaur.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/BulbasaurZoom.png")));break;
    case "Caterpie": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Caterpie.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/CaterpieZoom.png")));break;
    case "Chansey": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Chansey.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/ChanseyZoom.png")));break;
    case "Charizard": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Charizard.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/CharizardZoom.png")));break;
    case "Charmander": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Charmander.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/CharmanderZoom.png")));break;
    case "Charmeleon": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Charmeleon.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/CharmeleonZoom.png")));break;
    case "Clefairy": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Clefairy.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/ClefairyZoom.png")));break;
    case "Dewgong": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Dewgong.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/DewgongZoom.png")));break;
    case "Diglett": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Diglett.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/DiglettZoom.png")));break;
    case "Doduo":  Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Doduo.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/DoduoZoom.png")));break;
    case "Dragonair":  Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Dragonair.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/DragonairZoom.png")));break;
    case "Dratini": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Dratini.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/DratiniZoom.png")));break;
    case "Drowzee": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Drowzee.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/DrowzeeZoom.png")));break;
    case "Dugtrio": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Dugtrio.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/DugtrioZoom.png")));break;
    case "Electabuzz": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Electabuzz.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/ElectabuzzZoom.png")));break;
    case "Electrode": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Electrode.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/ElectrodeZoom.png")));break;
    case "Farfetch'd": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Farfetch'd.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Farfetch'dZoom.png")));break;
    case "Gastly": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Gastly.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/GastlyZoom.png")));break;
    case "Growlithe": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Growlithe.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/GrowlitheZoom.png")));break;
    case "Gyarados": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Gyarados.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/GyaradosZoom.png")));break;    
    case "Haunter": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Haunter.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/HaunterZoom.png")));break; 
    case "Hitmonchan": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Hitmonchan.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/HitmonchanZoom.png")));break;    
    case "Ivysaur": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Ivysaur.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/IvysaurZoom.png")));break;    
    case "Jynx": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Jynx.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/JynxZoom.png")));break;    
    case "Kadabra": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Kadabra.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/KadabraZoom.png")));break; 
    case "Kakuna": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Kakuna.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/KakunaZoom.png")));break;    
    case "Koffing": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Koffing.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/KoffingZoom.png")));break;
    case "Machamp": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Machamp.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/MachampZoom.png")));break;    
    case "Machoke": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Machoke.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/MachokeZoom.png")));break;
    case "Machop": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Machop.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/MachopZoom.png")));break;
    case "Magikarp": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Magikarp.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/MagikarpZoom.png")));break;
    case "Magmar": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Magmar.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/MagmarZoom.png")));break;
    case "Magnemite": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Magnemite.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/MagnemiteZoom.png")));break;
    case "Magneton": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Magneton.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/MagnetonZoom.png")));break;    
    case "Metapod": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Metapod.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/MetapodZoom.png")));break;    
    case "Mewtwo": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Mewtwo.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/MewtwoZoom.png")));break;
    case "Nidoking": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Nidoking.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/NidokingZoom.png")));break;
    case "Nidoran Male": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Nidoran_male.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Nidoran_maleZoom.png")));break;    
    case "Nidorino": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Nidorino.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/NidorinoZoom.png")));break;
    case "Ninetales": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Ninetales.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/NinetalesZoom.png")));break;    
    case "Onix": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Onix.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/OnixZoom.png")));break;    
    case "Pidgeotto": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Pidgeotto.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/PidgeottoZoom.png")));break;    
    case "Pidgey": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Pidgey.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/PidgeyZoom.png")));break;    
    case "Pikachu": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Pikachu.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/PikachuZoom.png")));break;  
    case "Poliwag": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Poliwag.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/PoliwagZoom.png")));break;
    case "Poliwhirl": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Poliwhirl.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/PoliwhirlZoom.png")));break;
    case "Poliwrath": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Poliwrath.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/PoliwrathZoom.png")));break;    
    case "Ponyta": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Ponyta.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/PonytaZoom.png")));break;
    case "Porygon": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Porygon.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/PorygonZoom.png")));break;
    case "Raichu": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Raichu.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/RaichuZoom.png")));break;
    case "Raticate": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Raticate.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/RaticateZoom.png")));break;
    case "Rattata": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Rattata.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/RattataZoom.png")));break;
    case "Sandshrew": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Sandshrew.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/SandshrewZoom.png")));break;    
    case "Seel": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Seel.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/SeelZoom.png")));break;   
    case "Squirtle": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Squirtle.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/SquirtleZoom.png")));break;
    case "Starmie": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Starmie.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/StarmieZoom.png")));break;
    case "Staryu": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Staryu.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/StaryuZoom.png")));break;  
    case "Tangela": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Tangela.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/TangelaZoom.png")));break;
    case "Venusaur": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Venusaur.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/VenusaurZoom.png")));break;
    case "Voltorb": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Voltorb.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/VoltorbZoom.png")));break;
    case "Vulpix": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Vulpix.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/VulpixZoom.png")));break; 
    case "Wartortle": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Wartortle.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/WartortleZoom.png")));break;
    case "Weedle": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Weedle.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/WeedleZoom.png")));break;
    case "Zapdos": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/Zapdos.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/base/ZapdosZoom.png")));break;

//Jungle
    case "Bellsprout": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Bellsprout.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/BellsproutZoom.png")));break;    
    case "Butterfree": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Butterfree.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/ButterfreeZoom.png")));break; 
    case "Clefable": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Clefable.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/ClefableZoom.png")));break;    
    case "Cubone": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Cubone.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/CuboneZoom.png")));break;    
    case "Dodrio": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Dodrio.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/DodrioZoom.png")));break;    
    case "Electrode (Jungle)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Electrode.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/ElectrodeZoom.png")));break;    
    case "Exeggcute": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Exeggcute.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/ExeggcuteZoom.png")));break;    
    case "Exeggutor": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Exeggutor.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/ExeggutorZoom.png")));break;    
    case "Fearow": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Fearow.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/FearowZoom.png")));break;
    case "Flareon": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Flareon.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/FlareonZoom.png")));break;    
    case "Gloom": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Gloom.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/GloomZoom.png")));break;    
    case "Goldeen": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Goldeen.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/GoldeenZoom.png")));break;    
    case "Jigglypuff": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Jigglypuff.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/JigglypuffZoom.png")));break;    
    case "Jolteon": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Jolteon.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/JolteonZoom.png")));break;
    case "Kangaskhan": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Kangaskhan.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/KangaskhanZoom.png")));break;    
    case "Lickitung": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Lickitung.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/LickitungZoom.png")));break;    
    case "Mankey": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Mankey.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/MankeyZoom.png")));break;    
    case "Marowak": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Marowak.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/MarowakZoom.png")));break;    
    case "Meowth": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Meowth.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/MeowthZoom.png")));break; 
    case "Mr. Mime": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/MrMime.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/MrMimeZoom.png")));break;    
    case "Nidoqueen": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Nidoqueen.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/NidoqueenZoom.png")));break;    
    case "Nidoran Female": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Nidoran(Female).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/NidoranZoom.png")));break; 
    case "Nidorina": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Nidorina.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/NidorinaZoom.png")));break;    
    case "Oddish": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Oddish(Stun_Spore).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/OddishZoom.png")));break;    
    case "Paras": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Paras.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/ParasZoom.png")));break;    
    case "Parasect": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Parasect.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/ParasectZoom.png")));break;    
    case "Persian": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Persian.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/PersianZoom.png")));break;
    case "Pidgeot": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Pidgeot.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/PidgeotZoom.png")));break;    
    case "Pikachu (Jungle)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Pikachu(Spark).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/PikachuZoom.png")));break;    
    case "Pinsir": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Pinsir.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/PinsirZoom.png")));break;    
    case "Primeape": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Primeape.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/PrimeapeZoom.png")));break;    
    case "Rapidash": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Rapidash.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/RapidashZoom.png")));break;    
    case "Rhydon": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Rhydon.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/RhydonZoom.png")));break;
    case "Rhyhorn": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Rhyhorn.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/RhyhornZoom.png")));break;    
    case "Seaking": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Seaking.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/SeakingZoom.png")));break;    
    case "Snorlax": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Snorlax.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/SnorlaxZoom.png")));break;    
    case "Spearow": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Spearow.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/SpearowZoom.png")));break;    
    case "Tauros": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Tauros.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/TaurosZoom.png")));break;    
    case "Vaporeon": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Vaporeon.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/VaporeonZoom.png")));break;
    case "Venomoth": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Venemoth.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/VenemothZoom.png")));break;    
    case "Venonat": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Venonat.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/VenonatZoom.png")));break;    
    case "Victreebel": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Victreebel.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/VictreebelZoom.png")));break;    
    case "Vileplume": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Vileplume.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/VileplumeZoom.png")));break;    
    case "Weepinbell": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Weepinbell.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/WeepinbellZoom.png")));break;
    case "Wigglytuff": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Wigglytuff.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/WigglytuffZoom.png")));break;
    case "Eevee": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Eevee.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/EeveeZoom.png")));break;
    case "Scyther": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/Scyther.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/jungle/ScytherZoom.png")));break;    
        
//Fossil   
    case "Aerodactyl": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Aerodactyl.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/AerodactylZOOM.jpg")));break;
    case "Arbok": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Arbok.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/ArbokZOOM.jpg")));break;
    case "Articuno": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Articuno.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/ArticunoZOOM.jpg")));break;
    case "Cloyster": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Cloyster.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/CloysterZOOM.jpg")));break;
    case "Ditto": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Ditto.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/DittoZOOM.jpg")));break;
    case "Dragonite": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Dragonite.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/DragoniteZOOM.jpg")));break;
    case "Ekans": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Ekans.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/EkansZOOM.jpg")));break;    
    case "Gastly (Fossil)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Gastly.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/GastlyZOOM.jpg")));break;
    case "Gengar": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Gengar.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/GengarZOOM.jpg")));break;
    case "Geodude": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Geodude.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/GeodudeZOOM.jpg")));break;
    case "Golbat": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Golbat.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/GolbatZOOM.jpg")));break;
    case "Golduck": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Golduck.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/GolduckZOOM.jpg")));break;
    case "Golem": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Golem.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/GolemZOOM.jpg")));break;
    case "Graveler": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Graveler.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/GravelerZOOM.jpg")));break;
    case "Grimer": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Grimer.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/GrimerZOOM.jpg")));break;
    case "Haunter (Fossil)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Haunter.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/HaunterZOOM.jpg")));break;    
    case "Hitmonlee": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Hitmonlee.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/HitmonleeZOOM.jpg")));break;    
    case "Horsea": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Horsea.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/HorseaZOOM.jpg")));break;    
    case "Hypno": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Hypno.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/HypnoZOOM.jpg")));break;    
    case "Kabuto": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Kabuto.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/KabutoZOOM.jpg")));break;    
    case "Kabutops": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Kabutops.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/KabutopsZOOM.jpg")));break;    
    case "Kingler": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Kingler.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/KinglerZOOM.jpg")));break;    
    case "Krabby": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Krabby.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/KrabbyZOOM.jpg")));break;
    case "Lapras": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Lapras.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/LaprasZOOM.jpg")));break;    
    case "Magmar (Fossil)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Magmar.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/MagmarZOOM.jpg")));break;    
    case "Magneton (Fossil)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Magneton.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/MagnetonZOOM.jpg")));break;    
    case "Moltres": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Moltres.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/MoltresZOOM.jpg")));break;    
    case "Muk": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Muk.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/MukZOOM.jpg")));break;
    case "Mysterious Fossil": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Mysterious Fossil.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Mysterious Fossil Zoom.png")));break;    
    case "Omanyte": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Omanyte.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/OmanyteZOOM.jpg")));break;    
    case "Omastar": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Omastar.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/OmastarZOOM.jpg")));break;    
    case "Psyduck": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Psyduck.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/PsyduckZOOM.jpg")));break;    
    case "Raichu (Fossil)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Raichu.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/RaichuZOOM.jpg")));break;
    case "Sandslash": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Sandslash.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/SandslashZOOM.jpg")));break;    
    case "Seadra": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Seadra.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/SeadraZOOM.jpg")));break; 
    case "Shellder": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Shellder.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/ShellderZOOM.jpg")));break;    
    case "Slowbro": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Slowbro.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/SlowbroZOOM.jpg")));break;    
    case "Slowpoke": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Slowpoke.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/SlowpokeZOOM.jpg")));break;    
    case "Tentacool": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Tentacool.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/TentacoolZOOM.jpg")));break;    
    case "Tentacruel": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Tentacruel.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/TentacruelZOOM.jpg")));break;    
    case "Weezing": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Weezing.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/WeezingZOOM.jpg")));break; 
    case "Zapdos (Fossil)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Zapdos.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/ZapdosZOOM.jpg")));break;    
    case "Zubat": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/Zubat.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/fossil/ZubatZOOM.jpg")));break;    
        
//Team Rocket
    case "Charmander (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Charmander.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/CharmanderZoom.png"))); break;
    case "Alakazam (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Alakazam.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark AlakazamZoom.png"))); break;
    case "Arbok (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Arbok.png")));         
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark ArbokZoom.png"))); break;
    case "Blastoise (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Blastoise.png")));        
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark BlastoiseZoom.png"))); break;
    case "Charizard (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Charizard.png")));        
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark CharizardZoom.png"))); break;
    case "Charmeleon (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Charmeleon.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark CharmeleonZoom.png"))); break;
    case "Dragonair (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Dragonair.png")));     
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark DragonairZoom.png"))); break;
    case "Dragonite (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Dragonite.png")));     
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark DragoniteZoom.png"))); break;
    case "Dugtrio (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Dugtrio.png")));     
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark DugtrioZoom.png"))); break;
    case "Electrode (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Electrode.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark ElectrodeZoom.png"))); break;
    case "Flareon (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Flareon.png")));    
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark FlareonZoom.png"))); break;
    case "Gloom (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Gloom.png")));    
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark GloomZoom.png"))); break;
    case "Golbat (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Golbat.png")));    
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark GolbatZoom.png"))); break;
    case "Golduck (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Golduck.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark GolduckZoom.png"))); break;
    case "Gyarados (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Gyarados.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark GyaradosZoom.png"))); break;    
    case "Hypno (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Hypno.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark HypnoZoom.png")));break;    
    case "Jolteon (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Jolteon.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark JolteonZoom.png")));break;    
    case "Kadabra (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Kadabra.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark KadabraZoom.png")));break;    
    case "Machamp (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Machamp.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark MachampZoom.png")));break;    
    case "Machoke (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Machoke.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark MachokeZoom.png")));break;    
    case "Magneton (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Magneton.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark MagnetonZoom.png")));break;
    case "Muk (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Muk.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark MukZoom.png")));break;    
    case "Persian (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Persian.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark PersianZoom.png")));break;    
    case "Primeape (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Primeape.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark PrimeapeZoom.png")));break;    
    case "Raichu (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Raichu.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark RaichuZoom.png")));break;    
    case "Rapidash (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Rapidash.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark RapidashZoom.png")));break;    
    case "Raticate (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Raticate.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark RaticateZoom.png")));break;    
    case "Slowbro (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Slowbro.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark SlowbroZoom.png")));break;    
    case "Vaporeon (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Vaporeon.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark VaporeonZoom.png")));break;
    case "Vileplume (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Vileplume.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark VileplumeZoom.png")));break;    
    case "Wartortle (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Wartortle.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark WartortleZoom.png")));break;    
    case "Weezing (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark Weezing.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dark WeezingZoom.png")));break;    
    case "Diglett (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Diglett.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/DiglettZoom.png")));break;
    case "Dratini (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Dratini.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/DratiniZoom.png")));break;    
    case "Drowzee (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Drowzee.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/DrowzeeZoom.png")));break;    
    case "Eevee (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Eevee.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/EeveeZoom.png")));break;    
    case "Ekans (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Ekans.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/EkansZoom.png")));break;
    case "Grimer (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Grimer.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/GrimerZoom.png")));break;    
    case "Koffing (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Koffing.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/KoffingZoom.png")));break;    
    case "Machop (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Machop.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/MachopZoom.png")));break;    
    case "Magikarp (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Magikarp.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/MagikarpZoom.png")));break;    
    case "Magnemite (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Magnemite.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/MagnemiteZoom.png")));break;    
    case "Mankey (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Mankey.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/MankeyZoom.png")));break;
    case "Meowth (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Meowth.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/MeowthZoom.png")));break;    
    case "Oddish (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Oddish.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/OddishZoom.png")));break;    
    case "Ponyta (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Ponyta.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/PonytaZoom.png")));break;    
    case "Porygon (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Porygon.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/PorygonZoom.png")));break;
    case "Psyduck (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Psyduck.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/PsyduckZoom.png")));break;    
    case "Rattata (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Rattata.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/RattataZoom.png")));break;    
    case "Slowpoke (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Slowpoke.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/SlowpokeZoom.png")));break;    
    case "Squirtle (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Squirtle.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/SquirtleZoom.png")));break;
    case "Voltorb (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Voltorb.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/VoltorbZoom.png")));break;    
    case "Zubat (R)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/Zubat.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/team_rocket/ZubatZoom.png")));break;    
        
//Gym Challenge
    case "Arcanine (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Blaine's Arcanine.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BlaineArcanineZOOM.jpg")));break;    
    case "Charizard (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Blaine's Charizard.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BlaineCharizardZOOM.jpg")));break;    
    case "Charmander (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Blaine's Charmander.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BlaineCharmanderZOOM.jpg")));break;
    case "Charmeleon (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Blaine's Charmeleon.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BlaineCharmeleonZOOM.jpg")));break;    
    case "Dodrio (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Blaine's Dodrio.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BlaineDodrioZOOM.jpg")));break;    
    case "Doduo (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Blaine's Doduo.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BlaineDoduoZOOM.jpg")));break;    
    case "Growlithe (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Blaine's Growlithe.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BlaineGrowlitheZOOM.jpg")));break;    
    case "Mankey (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Blaine's Mankey.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BlaineMankeyZOOM.jpg")));break;
    case "Ninetales (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Blaine's Ninetales.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BlaineNinetalesZOOM.jpg")));break;    
    case "Ponyta (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Blaine's Ponyta.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BlainePonytaZOOM.jpg")));break;   
    case "Rapidash (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Blaine's Rapidash.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BlaineRapidashZOOM.jpg")));break;    
    case "Rhyhorn (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Blaine's Rhyhorn.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BlaineRhyhornZOOM.jpg")));break;    
    case "Vulpix (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Blaine's Vulpix.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BlaineVulpixZOOM.jpg")));break;  
    case "Diglett (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Brock's Diglett.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BrockDiglettZOOM.jpg")));break;
    case "Dugtrio (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Brock's Dugtrio.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BrockDugtrioZOOM.jpg")));break;
    case "Geodude (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Brock's Geodude.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BrockGeodudeZOOM.jpg")));break;    
    case "Graveler (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Brock's Graveler.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BrockGravelerZOOM.jpg")));break;    
    case "Ninetales (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Brock's Ninetales.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BrockNinetalesZOOM.jpg")));break;    
    case "Primeape (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Brock's Primeape.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BrockPrimeapeZOOM.jpg")));break;    
    case "Sandslash (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Brock's Sandslash.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BrockSandslashZOOM.jpg")));break;
    case "Vulpix (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Brock's Vulpix.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/BrockVulpixZOOM.jpg")));break;    
    case "Bellsprout (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Erika's Bellsprout.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/ErikaBellsproutZOOM.jpg")));break; 
    case "Bulbasaur (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Erika's Bulbasaur.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/ErikaBulbasaurZOOM.jpg")));break;    
    case "Clefairy (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Erika's Clefairy.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/ErikaClefairyZOOM.jpg")));break;
    case "Ivysaur (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Erika's Ivysaur.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/ErikaIvysaurZOOM.jpg")));break;    
    case "Jigglypuff (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Erika's Jigglypuff.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/ErikaJigglypuffZOOM.jpg")));break;    
    case "Oddish (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Erika's Oddish.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/ErikaOddishZOOM.jpg")));break;    
    case "Paras (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Erika's Paras.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/ErikaParasZOOM.jpg")));break;
    case "Venusaur (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Erika's Venusaur.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/ErikaVenusaurZOOM.jpg")));break;    
    case "Gyarados (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Giovanni's Gyarados.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/GiovanniGyaradosZOOM.jpg")));break;
    case "Machamp (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Giovanni's Machamp.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/GiovanniMachampZOOM.jpg")));break;
    case "Machoke (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Giovanni's Machoke.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/GiovanniMachokeZOOM.jpg")));break;
    case "Machop (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Giovanni's Machop.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/GiovanniMachopZOOM.jpg")));break;    
    case "Magikarp (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Giovanni's Magikarp.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/GiovanniMagikarpZOOM.jpg")));break;    
    case "Meowth (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Giovanni's Meowth Lv17.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/GiovanniMeowth2ZOOM.jpg")));break;    
    case "Meowth (Giovanni's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Giovanni's Meowth.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/GiovanniMeowthZOOM.jpg")));break;    
    case "Nidoking (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Giovanni's Nidoking.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/GiovanniNidokingZOOM.jpg")));break;    
    case "Nidoqueen (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Giovanni's Nidoqueen.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/GiovanniNidoqueenZOOM.jpg")));break;    
    case "Nidoran Female (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Giovanni's Nidoran Female.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/GiovanniNidoranFemaleZOOM.jpg")));break;    
    case "Nidoran Male (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Giovanni's Nidoran Male.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/GiovanniNidoranMaleZOOM.jpg")));break;   
    case "Nidorina (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Giovanni's Nidorina.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/GiovanniNidorinaZOOM.jpg")));break;    
    case "Nidorino (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Giovanni's Nidorino.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/GiovanniNidorinoZOOM.jpg")));break;
    case "Persian (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Giovanni's Persian.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/GiovanniPersianZOOM.jpg")));break;    
    case "Pinsir (Giovanni's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Giovanni's Pinsir.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/GiovanniPinsirZOOM.jpg")));break;    
    case "Arbok (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Arbok.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaArbokZOOM.jpg")));break;
    case "Beedrill (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Beedrill.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaBeedrillZOOM.jpg")));break;    
    case "Ditto (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Ditto.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaDittoZOOM.jpg")));break;    
    case "Ekans (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Ekans.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaEkansZOOM.jpg")));break;
    case "Golbat (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Golbat.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaGolbatZOOM.jpg")));break;    
    case "Grimer (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Grimer.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaGrimerZOOM.jpg")));break;    
    case "Kakuna (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Kakuna.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaKakunaZOOM.jpg")));break;    
    case "Koffing (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Koffing Lv10.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaKoffing2ZOOM.jpg")));break;
    case "Koffing (Koga's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Koffing.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaKoffingZOOM.jpg")));break;    
    case "Muk (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Muk.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaMukZOOM.jpg")));break;    
    case "Pidgeotto (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Pidgeotto.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaPidgeottoZOOM.jpg")));break;    
    case "Pidgey (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Pidgey Lv15.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaPidgey2ZOOM.jpg")));break;    
    case "Pidgey (Koga's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Pidgey.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaPidgeyZOOM.jpg")));break;    
    case "Tangela (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Tangela.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaTangelaZOOM.jpg")));break;
    case "Weedle (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Weedle.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaWeedleZOOM.jpg")));break;    
    case "Weezing (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Weezing.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaWeezingZOOM.jpg")));break;    
    case "Zubat (Koga's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Koga's Zubat.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/KogaZubatZOOM.jpg")));break;    
    case "Eevee (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Lt Surge's Eevee.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/LtSurgeEeveeZOOM.jpg")));break;    
    case "Electrode (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Lt Surge's Electrode.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/LtSurgeElectrodeZOOM.jpg")));break;    
    case "Jolteon (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Lt Surge's Jolteon.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/LtSurgeJolteonZOOM.png")));break;
    case "Pikachu (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Lt Surge's Pikachu.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/LtSurgePikachuZOOM.png")));break;    
    case "Raichu (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Lt Surge's Raichu.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/LtSurgeRaichuZOOM.jpg")));break;    
    case "Raticate (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Lt Surge's Raticate.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/LtSurgeRaticateZOOM.jpg")));break;    
    case "Rattata (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Lt Surge's Rattata.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/LtSurgeRattataZOOM.jpg")));break;    
    case "Voltorb (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Lt Surge's Voltorb.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/LtSurgeVoltorbZOOM.jpg")));break;    
    case "Dewgong (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Misty's Dewgong.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/MistyDewgongZOOM.jpg")));break;
    case "Golduck (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Misty's Golduck.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/MistyGolduckZOOM.jpg")));break;    
    case "Gyarados (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Misty's Gyarados.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/MistyGyaradosZOOM.jpg")));break;    
    case "Horsea (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Misty's Horsea.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/MistyHorseaZOOM.jpg")));break;
    case "Magikarp (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Misty's Magikarp.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/MistyMagikarpZOOM.jpg")));break;    
    case "Poliwag (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Misty's Poliwag.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/MistyPoliwagZOOM.jpg")));break;    
    case "Psyduck (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Misty's Psyduck.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/MistyPsyduckZOOM.jpg")));break;    
    case "Seel (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Misty's Seel.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/MistySeelZOOM.jpg")));break;    
    case "Staryu (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Misty's Staryu.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/MistyStaryuZOOM.jpg")));break;    
    case "Mewtwo (Rocket's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Rocket's Mewtwo.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/RocketMewtwoZOOM.jpg")));break;
    case "Zapdos (Rocket's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Rocket's Zapdos.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/RocketZapdosZOOM.jpg")));break;    
    case "Abra (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Sabrina's Abra Lv18.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/SabrinaAbra2ZOOM.jpg")));break;    
    case "Abra (Sabrina's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Sabrina's Abra.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/SabrinaAbraZOOM.jpg")));break;    
    case "Alakazam (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Sabrina's Alakazam.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/SabrinaAlakazamZOOM.jpg")));break;    
    case "Drowzee (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Sabrina's Drowzee.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/SabrinaDrowzeeZOOM.jpg")));break;    
    case "Gastly (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Sabrina's Gastly Lv10.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/SabrinaGastly2ZOOM.jpg")));break;
    case "Gastly (Sabrina's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Sabrina's Gastly.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/SabrinaGastlyZOOM.jpg")));break;    
    case "Gengar (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Sabrina's Gengar.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/SabrinaGengarZOOM.jpg")));break;    
    case "Golduck (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Sabrina's Golduck.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/SabrinaGolduckZOOM.jpg")));break;    
    case "Haunter (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Sabrina's Haunter.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/SabrinaHaunterZOOM.jpg")));break;    
    case "Hypno (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Sabrina's Hypno.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/SabrinaHypnoZOOM.jpg")));break; 
    case "Jynx (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Sabrina's Jynx.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/SabrinaJynxZOOM.jpg")));break;    
    case "Kadabra (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Sabrina's Kadabra.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/SabrinaKadabraZOOM.jpg")));break;    
    case "Mr. Mime (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Sabrina's Mr.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/SabrinaMrMimeZOOM.jpg")));break;    
    case "Porygon (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Sabrina's Porygon.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/SabrinaPorygonZOOM.jpg")));break;    
    case "Psyduck (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/Sabrina's Psyduck.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_challenge/SabrinaPsyduckZOOM.jpg")));break;    
   
//Gym Heroes
    case "Charmander (Blaine's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Blaine's Charmander.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BlaineCharmanderZOOM.jpg")));break;
    case "Growlithe (Blaine's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Blaine's Growlithe Lv15.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BlaineGrowlithe2ZOOM.jpg")));break;    
    case "Growlithe (Blaine's 3)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Blaine's Growlithe.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BlaineGrowlitheZOOM.jpg")));break;    
    case "Kangaskhan (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Blaine's Kangaskhan.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BlaineKangaskhanZOOM.jpg")));break;
    case "Magmar (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Blaine's Magmar.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BlaineMagmarZOOM.jpg")));break;
    case "Moltres (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Blaine's Moltres.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BlaineMoltresZOOM.jpg")));break;
    case "Ponyta (Blaine's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Blaine's Ponyta.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BlainePonytaZOOM.jpg")));break;
    case "Tauros (Blaine's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Blaine's Tauros.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BlaineTaurosZOOM.jpg")));break;
    case "Vulpix (Blaine's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Blaine's Vulpix.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BlaineVulpixZOOM.jpg")));break;
    case "Geodude (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Geodude Lv13.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockGeodude2ZOOM.jpg")));break;
    case "Geodude (Brock's 3)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Geodude.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockGeodudeZOOM.jpg")));break;
    case "Golbat (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Golbat.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockGolbatZOOM.jpg")));break;
    case "Golem (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Golem.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockGolemZOOM.jpg")));break;    
    case "Graveler (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Graveler.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockGravelerZOOM.jpg")));break;    
    case "Lickitung (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Lickitung.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockLickitungZOOM.jpg")));break;    
    case "Mankey (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Mankey Lv12.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockMankey2ZOOM.jpg")));break;
    case "Mankey (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Mankey.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockMankeyZOOM.jpg")));break;
    case "Onix (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Onix Lv41.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockOnix2ZOOM.jpg")));break;
    case "Onix (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Onix.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockOnixZOOM.jpg")));break;
    case "Rhyhorn (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Rhyhorn.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockRhyhornZOOM.jpg")));break;
    case "Rhydon (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Rhydon.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockRhydonZOOM.jpg")));break;    
    case "Rhyhorn (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Rhyhorn Lv29.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockRhyhorn2ZOOM.jpg")));break;
    case "Sandshrew (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Sandshrew.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockSandshrewZOOM.jpg")));break;
    case "Sandshrew (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Sandshrew Lv20.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockSandshrew2ZOOM.jpg")));break;
    case "Sandslash (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Sandslash.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockSandslashZOOM.jpg")));break;
    case "Vulpix (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Vulpix.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockVulpixZOOM.jpg")));break;
    case "Zubat (Brock's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Zubat.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockZubatZOOM.jpg")));break;
    case "Zubat (Brock's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Brock's Zubat Lv11.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/BrockZubat2ZOOM.jpg")));break;
    case "Bellsprout (Erika's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Bellsprout.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaBellsproutZOOM.jpg")));break;
    case "Bellsprout (Erika's 3)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Bellsprout Lv15.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaBellsprout2ZOOM.jpg")));break;
    case "Clefable (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Clefable.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaClefableZOOM.jpg")));break;
    case "Clefairy (Erika's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Clefairy.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaClefairyZOOM.jpg")));break;
    case "Dragonair (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Dragonair.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaDragonairZOOM.jpg")));break;
    case "Dratini (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Dratini.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaDratiniZOOM.jpg")));break;
    case "Exeggcute (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Exeggcute Lv12.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaExeggcute2ZOOM.jpg")));break;
    case "Exeggcute (Erika's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Exeggcute.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaExeggcuteZOOM.jpg")));break;
    case "Exeggutor (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Exeggutor.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaExeggutorZOOM.jpg")));break;
    case "Gloom (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Gloom Lv28.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaGloom2ZOOM.jpg")));break;
    case "Gloom (Erika's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Gloom.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaGloomZOOM.jpg")));break;
    case "Oddish (Erika's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Oddish Lv15.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaOddish2ZOOM.jpg")));break;
    case "Oddish (Erika's 3)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Oddish.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaOddishZOOM.jpg")));break;
    case "Tangela (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Tangela.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaTangelaZOOM.jpg")));break;
    case "Victreebel (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Victreebel.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaVictreebelZOOM.jpg")));break;
    case "Vileplume (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Vileplume.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaVileplumeZOOM.jpg")));break;
    case "Weepinbell (Erika's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Weepinbell.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaWeepinbellZOOM.jpg")));break;
    case "Weepinbell (Erika's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Erika's Weepinbell Lv30.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/ErikaWeepinbell2ZOOM.jpg")));break;
    case "Electabuzz (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Lt Surge's Electabuzz Lv22.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/LtSurgeElectabuzz2ZOOM.jpg")));break;
    case "Electabuzz (Lt. Surge's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Lt Surge's Electabuzz.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/LtSurgeElectabuzzZOOM.jpg")));break;
    case "Fearow (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Lt Surge's Fearow.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/LtSurgeFearowZOOM.jpg")));break;
    case "Magnemite (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Lt Surge's Magnemite.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/LtSurgeMagnemiteZOOM.jpg")));break;
    case "Magnemite (Lt. Surge's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Lt Surge's Magnemite Lv12.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/LtSurgeMagnemite2ZOOM.jpg")));break;
    case "Magneton (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Lt Surge's Magneton.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/LtSurgeMagnetonZOOM.jpg")));break;    
    case "Pikachu (Lt. Surge's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Lt Surge's Pikachu.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/LtSurgePikachuZOOM.jpg")));break;
    case "Raichu (Lt. Surge's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Lt Surge's Raichu.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/LtSurgeRaichuZOOM.jpg")));break;
    case "Raticate (Lt. Surge's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Lt Surge's Raticate.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/LtSurgeRaticateZOOM.jpg")));break;
    case "Rattata (Lt. Surge's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Lt Surge's Rattata.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/LtSurgeRattataZOOM.jpg")));break;
    case "Spearow (Lt. Surge's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Lt Surge's Spearow Lv17.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/LtSurgeSpearow2ZOOM.jpg")));break;
    case "Spearow (Lt. Surge's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Lt Surge's Spearow.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/LtSurgeSpearowZOOM.jpg")));break;
    case "Voltorb (Lt. Surge's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Lt Surge's Voltorb.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/LtSurgeVoltorbZOOM.jpg")));break;
    case "Cloyster (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Cloyster.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistyCloysterZOOM.jpg")));break;
    case "Goldeen (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Goldeen.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistyGoldeenZOOM.jpg")));break;
    case "Goldeen (Misty's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Goldeen Lv10.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistyGoldeen2ZOOM.jpg")));break;
    case "Horsea (Misty's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Horsea.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistyHorseaZOOM.jpg")));break;    
    case "Poliwag (Misty's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Poliwag.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistyPoliwagZOOM.jpg")));break;    
    case "Poliwhirl (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Poliwhirl.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistyPoliwhirlZOOM.jpg")));break;    
    case "Poliwrath (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Poliwrath.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistyPoliwrathZOOM.jpg")));break;
    case "Psyduck (Misty's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Psyduck.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistyPsyduckZOOM.jpg")));break;
    case "Seadra (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Seadra.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistySeadraZOOM.jpg")));break;
    case "Seaking (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Seaking.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistySeakingZOOM.jpg")));break;
    case "Seel (Misty's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Seel.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistySeelZOOM.jpg")));break;
    case "Shellder (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Shellder.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistyShellderZOOM.jpg")));break;
    case "Starmie (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Starmie.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistyStarmieZOOM.jpg")));break;
    case "Staryu (Misty's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Staryu.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistyStaryuZOOM.jpg")));break;
    case "Tentacool (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Tentacool.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistyTentacoolZOOM.jpg")));break;
    case "Tentacool (Misty's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Tentacool Lv16.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistyTentacool2ZOOM.jpg")));break;    
    case "Tentacruel (Misty's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Misty's Tentacruel.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/MistyTentacruelZOOM.jpg")));break;    
    case "Hitmonchan (Rocket's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Rocket's Hitmonchan.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/RocketHitmonchanZOOM.jpg")));break;  
    case "Moltres (Rocket's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Rocket's Moltres.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/RocketMoltresZOOM.jpg")));break;    
    case "Scyther (Rocket's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Rocket's Scyther.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/RocketScytherZOOM.jpg")));break;    
    case "Snorlax (Rocket's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Rocket's Snorlax.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/RocketSnorlaxZOOM.jpg")));break;
    case "Abra (Sabrina's 3)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Sabrina's Abra.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/SabrinaAbraZOOM.jpg")));break;    
    case "Drowzee (Sabrina's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Sabrina's Drowzee.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/SabrinaDrowzeeZOOM.jpg")));break;    
    case "Gastly (Sabrina's 3)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Sabrina's Gastly.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/SabrinaGastlyZOOM.jpg")));break;    
    case "Gengar (Sabrina's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Sabrina's Gengar.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/SabrinaGengarZOOM.jpg")));break;    
    case "Haunter (Sabrina's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Sabrina's Haunter.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/SabrinaHaunterZOOM.jpg")));break;
    case "Jynx (Sabrina's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Sabrina's Jynx.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/SabrinaJynxZOOM.jpg")));break;
    case "Mr. Mime (Sabrina's 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Sabrina's Mr.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/SabrinaMrMimeZOOM.jpg")));break;
    case "Slowbro (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Sabrina's Slowbro.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/SabrinaSlowbroZOOM.jpg")));break;
    case "Slowpoke (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Sabrina's Slowpoke.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/SabrinaSlowpokeZOOM.jpg")));break;
    case "Venomoth (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Sabrina's Venomoth.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/SabrinaVenomothZOOM.jpg")));break;
    case "Venonat (Sabrina's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/Sabrina's Venonat.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/gym_heroes/SabrinaVenonatZOOM.jpg")));break;
    
    //Neo Genesis
    case "Aipom (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Aipom_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/AipomZOOM.jpg")));break;
    case "Ampharos (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Ampharos_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/AmpharosZOOM.jpg")));break;
    case "Ariados (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Ariados_NG.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/AriadosZOOM.jpg")));break;
    case "Azumarill (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Azumarill.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/AzumarillZOOM.jpg")));break;
    case "Bayleef (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Bayleef1_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/BayleefZOOM.jpg")));break;
    case "Bayleef (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Bayleef2_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Bayleef2ZOOM.jpg")));break;
    case "Bellossom (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Bellossom_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/BellossomZOOM.jpg")));break;
    case "Chikorita (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Chikorita1_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/ChikoritaZOOM.jpg")));break;
    case "Chikorita (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Chikorita2_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Chikorita2ZOOM.jpg")));break;
    case "Chinchou (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Chinchou_NG.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/ChinchouZOOM.jpg")));break;
    case "Clefairy (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Clefairy_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/ClefairyZOOM.jpg")));break;
    case "Cleffa (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/CleffaBROKEN_ng.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/CleffaBANNEDZOOM.jpg")));break;
    case "Croconaw (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/CroconawGOOD_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Croconaw2ZOOM.jpg")));break;
    case "Croconaw (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Croconaw_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/CroconawZOOM.jpg")));break;
    case "Cyndaquil (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Cyndaquil1_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/CyndaquilZOOM.jpg")));break;
    case "Cyndaquil (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Cyndaquil2_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Cyndaquil2ZOOM.jpg")));break;
    case "Donphan (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Donphan_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/DonphanZOOM.jpg")));break;
    case "Electabuzz (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Electabuzz_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/ElectabuzzZOOM.jpg")));break;
    case "Elekid (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Elekid_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/ElekidZOOM.jpg")));break;
    case "Feraligatr (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/FeraligatrBERSERK_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/FeraligatrZOOM.jpg")));break;
    case "Feraligatr (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/FeraligatrRIPTIDE_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Feraligatr2ZOOM.jpg")));break;
    case "Flaaffy (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Flaaffy_NG.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/FlaaffyZOOM.jpg")));break;
    case "Furret (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Furret_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/FurretZOOM.jpg")));break;
    case "Girafarig (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Girafarig_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/GirafarigZOOM.jpg")));break;
    case "Gligar (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Gligar_NG.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/GligarZOOM.jpg")));break;
    case "Gloom (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Gloom_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/GloomZOOM.jpg")));break;
    case "Granbull (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Granbull_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/GranbullZOOM.jpg")));break;
    case "Heracross (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Heracross_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/HeracrossZOOM.jpg")));break;
    case "Hoothoot (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Hoothoot_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/HoothootZOOM.jpg")));break;
    case "Hoppip (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Hoppip_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/HoppipZOOM.jpg")));break;
    case "Horsea (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Horsea_NG.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/HorseaZOOM.jpg")));break;
    case "Jumpluff (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Jumpluff.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/JumpluffZOOM.jpg")));break;
    case "Kingdra (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Kingdra_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/KingdraZOOM.jpg")));break;
    case "Lanturn (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Lanturn_NG.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/LanturnZOOM.jpg")));break;
    case "Ledian (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Ledian_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/LedianZOOM.jpg")));break;
    case "Ledyba (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Ledyba_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/LedybaZOOM.jpg")));break;
    case "Lugia (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Lugia_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/LugiaZOOM.jpg")));break;
    case "Magby (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Magby_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/MagbyZOOM.jpg")));break;
    case "Magmar (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Magmar_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/MagmarZOOM.jpg")));break;
    case "Mantine (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Mantine_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/MantineZOOM.jpg")));break;
    case "Mareep (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Mareep_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/MareepZOOM.jpg")));break;
    case "Marill (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Marill_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/MarillZOOM.jpg")));break;
    case "Meganium (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/MeganiumHERBALSCENT_NG.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/MeganiumZOOM.jpg")));break;
    case "Meganium (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/MeganiumWILDGROWTH_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Meganium2ZOOM.jpg")));break;
    case "Miltank (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Miltank_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/MiltankZOOM.jpg")));break;
    case "Murkrow (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Murkrow_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/MurkrowZOOM.jpg")));break;
    case "Natu (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Natu_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/NatuZOOM.jpg")));break;
    case "Noctowl (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Noctowl_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/NoctowlZOOM.jpg")));break;
    case "Oddish (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Oddish_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/OddishZOOM.jpg")));break;
    case "Onix (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Onix_NG.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/OnixZOOM.jpg")));break;
    case "Phanpy (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Phanpy_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/PhanpyZOOM.jpg")));break;
    case "Pichu (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Pichu_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/PichuZOOM.jpg")));break;
    case "Pikachu (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Pikachu_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/PikachuZOOM.png")));break;
    case "Piloswine (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Piloswine_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/PiloswineZOOM.jpg")));break;
    case "Quagsire (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Quagsire_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/QuagsireZOOM.jpg")));break;
    case "Quilava (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Quilava1_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/QuilavaZOOM.jpg")));break;
    case "Quilava (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Quilava2_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Quilava2ZOOM.jpg")));break;
    case "Seadra (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Seadra_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/SeadraZOOM.jpg")));break;
    case "Sentret (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Sentret_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/SentretZOOM.jpg")));break;
    case "Shuckle (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Shuckle_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/ShuckleZOOM.jpg")));break;
    case "Skarmory (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Skarmory_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/SkarmoryZOOM.jpg")));break;
    case "Skiploom (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Skiploom_NG.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/SkiploomZOOM.jpg")));break;
    case "Slowking (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Slowking_NG.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/SlowkingZOOM.jpg")));break;
    case "Slowpoke (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Slowpoke_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/SlowpokeZOOM.jpg")));break;
    case "Sneasel (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/SneaselBANNED_NG.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/SneaselZOOM.jpg")));break;
    case "Snubbull (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Snubbull_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/SnubbullZOOM.jpg")));break;
    case "Spinarak (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Spinarak_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/SpinarakZOOM.jpg")));break;
    case "Stantler (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Stantler_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/StantlerZOOM.jpg")));break;
    case "Steelix (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Steelix_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/SteelixZOOM.jpg")));break;
    case "Sudowoodo (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Sudowoodo_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/SudowoodoZOOM.jpg")));break;
    case "Sunflora (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Sunflora_NG.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/SunfloraZOOM.jpg")));break;
    case "Sunkern (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Sunkern_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/SunkernZOOM.jpg")));break;
    case "Swinub (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Swinub_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/SwinubZOOM.jpg")));break;
    case "Togepi (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Togepi_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/TogepiZOOM.jpg")));break;
    case "Togetic (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Togetic.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/TogeticZOOM.jpg")));break;
    case "Totodile (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Totodile1_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/TotodileZOOM.jpg")));break;
    case "Totodile (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Totodile2_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Totodile2ZOOM.jpg")));break;
    case "Typhlosion (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/TyphlosionFIREBOOST_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Typhlosion2ZOOM.jpg")));break;
    case "Typhlosion (NG 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Typhlosion_FIRERECHARGE.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/TyphlosionZOOM.jpg")));break;    
    case "Wooper (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Wooper_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/WooperZOOM.jpg")));break;    
    case "Xatu (NG)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/Xatu_NG.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_genesis/XatuZOOM.jpg")));break;
    
    //Neo Discovery
    case "Beedrill (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Beedrill_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/BeedrillZOOM.jpg")));break;
    case "Butterfree (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Butterfree_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/ButterfreeZOOM.jpg")));break;
    case "Caterpie (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Caterpie_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/CaterpieZOOM.jpg")));break;
    case "Corsola (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Corsola_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/CorsolaZOOM.jpg")));break;
    case "Dunsparce (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Dunsparce_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/DunsparceZOOM.jpg")));break;
    case "Eevee (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Eevee_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/EeveeZOOM.jpg")));break;
    case "Espeon (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Espeon_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/EspeonZOOM.jpg")));break;
    case "Espeon (ND 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Espeon2_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Espeon2ZOOM.jpg")));break;
    case "Forretress (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Forretress.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/ForretressZOOM.jpg")));break;
    case "Hitmontop (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Hitmontop.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/HitmontopZOOM.jpg")));break;    
    case "Hoppip (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Hoppip_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/HoppipZOOM.jpg")));break;    
    case "Houndoom (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Houndoom_NDISC.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/HoundoomZOOM.jpg")));break;    
    case "Houndour (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Houndour_DARKNESS_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Houndour2ZOOM.jpg")));break;    
    case "Houndour (ND 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Houndour_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/HoundourZOOM.jpg")));break;
    case "Igglybuff (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Igglybuff.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/IgglybuffZOOM.jpg")));break;
    case "Kabuto (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Kabuto_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/KabutoZOOM.jpg")));break;
    case "Kabutops (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Kabutops_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/KabutopsZOOM.jpg")));break;
    case "Kakuna (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Kakuna_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/KakunaZOOM.jpg")));break;
    case "Larvitar (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Larvitar_NDISC.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/LarvitarZOOM.jpg")));break;
    case "Magnemite (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Magnemite_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/MagnemiteZOOM.jpg")));break;
    case "Mareep (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Mareep_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/MareepZOOM.png")));break;
    case "Metapod (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Metapod_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/MetapodZOOM.jpg")));break;
    case "Natu (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Natu_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/NatuZOOM.jpg")));break;
    case "Omanyte (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Omanyte_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/OmanyteZOOM.jpg")));break;
    case "Omastar (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Omastar_NDISC.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/OmastarZOOM.jpg")));break;
    case "Pineco (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Pineco_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/PinecoZOOM.jpg")));break;
    case "Politoed (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Politoed.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/PolitoedZOOM.jpg")));break;
    case "Poliwag (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Poliwag_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/PoliwagZOOM.jpg")));break;
    case "Poliwhirl (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Poliwhirl_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/PoliwhirlZOOM.jpg")));break;
    case "Poliwrath (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Poliwrath_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/PoliwrathZOOM.jpg")));break;
    case "Pupitar (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Pupitar_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/PupitarZOOM.jpg")));break;
    case "Scizor (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Scizor_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/ScizorZOOM.jpg")));break; 
    case "Scyther (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Scyther_NDISC.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/ScytherZOOM.jpg")));break;
    case "Sentret (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Sentret_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/SentretZOOM.jpg")));break;
    case "Smeargle (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Smeargle_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/SmeargleZOOM.jpg")));break;
    case "Spinarak (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Spinarak_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/SpinarakZOOM.jpg")));break;
    case "Teddiursa (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Teddiursa_NDISC.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/TeddiursaZOOM.jpg")));break;
    case "Tyranitar (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Tyranitar_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/TyranitarZOOM.jpg")));break;
    case "Tyrogue (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Tyrogue_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/TyrogueZOOM.jpg")));break;
    case "Umbreon (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Umbreon_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UmbreonZOOM.jpg")));break;
    case "Unown A": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownA_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownAZOOM.jpg")));break;
    case "Unown D": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownD_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownDZOOM.jpg")));break;
    case "Unown E": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownE_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownEZOOM.jpg")));break;
    case "Unown F": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownF_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownFZOOM.jpg")));break;
    case "Unown I": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownI_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownIZOOM.jpg")));break;
    case "Unown M": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownM_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownMZOOM.jpg")));break;
    case "Unown N": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownN_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownNZOOM.jpg")));break;
    case "Unown O": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownO_NDISC.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownOZOOM.jpg")));break;
    case "Unown U": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownU_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UnownUZOOM.jpg")));break; 
    case "Ursaring (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Ursaring_NDISC.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/UrsaringZOOM.jpg")));break;
    case "Weedle (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Weedle_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/WeedleZOOM.jpg")));break;
    case "Wobbuffet (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Wobbuffet_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/WobbuffetZOOM.jpg")));break;
    case "Wooper (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Wooper_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/WooperZOOM.jpg")));break;
    case "Xatu (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Xatu_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/XatuZOOM.jpg")));break;
    case "Yanma (ND)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/Yanma_NDISC.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_discovery/YanmaZOOM.jpg")));break;
    
    //Neo Revelations
    case "Aerodactyl (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Aerodactyl_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/AerodactylNRzoom.png")));break;    
    case "Aipom (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Aipom_NR.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/AipomZOOM.png")));break;
    case "Ampharos (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Ampharos_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/AmpharosNRZOOM.png")));break;
    case "Blissey (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Blissey.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/BlissyZoom.png")));break;
    case "Celebi (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Celebi_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/CelebiZOOM.png")));break;
    case "Celebi (NR 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Celebi_NRgrass.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/CelebiNONHOLOzoom.png")));break;
    case "Chinchou (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Chinchou_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/ChinchouZOOM.png")));break;
    case "Crobat (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Crobat_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/CrobatZOOM.png")));break;
    case "Delibird (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Delibird.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/DelibirdZOOM.png")));break;
    case "Entei (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Entei_LegendaryBody.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/EnteigabargeZOOM.png")));break;
    case "Entei (NR 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Entei_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/EnteiZOOM.png")));break;
    case "Farfetch'd (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Farfetch'd_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/FarfetchdZOOM.png")));break;
    case "Flaaffy (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Flaaffy_NR.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/FlaaffyZOOM.png")));break;
    case "Geodude (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Geodude_NR.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/GeodudeZOOM.png")));break;
    case "Golbat (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Golbat_NR.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/GolbatNRZOOM.png")));break;
    case "Goldeen (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Goldeen_NR.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/GoldeenNRZOOM.png")));break;
    case "Graveler (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Graveler_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/GravelerNRZOOM.png")));break;
    case "Ho-Oh (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Ho-oh_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/HoOhNRZOOM.png")));break;
    case "Ho-Oh (NR 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Ho-oh_colorless.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/HoOhverpoweredZOOM.png")));break;
    case "Houndoom (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Houndoom.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/HoundoomDOOMboomZOOM.png")));break;
    case "Jumpluff (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Jumpluff.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/JumpluffZOOM.png")));break;
    case "Jynx (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Jynx_NRwater.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/JynxNRZOOM.png")));break;
    case "Kingdra (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Kingdra.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/KingdraZOOM.png")));break;
    case "Lanturn (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Lanturn_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/LanturnNRZOOM.png")));break;
    case "Lugia (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Lugia.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/LugiaZOOM.png")));break;
    case "Magcargo (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Magcargo.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/MagcargoNRZOOM.png")));break;
    case "Magneton (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Magneton_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/MagnetonNRmetalZOOM.png")));break;
    case "Misdreavus (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Misdreavus.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/MisdreavusZOOM.png")));break;
    case "Murkrow (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Murkrow.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/MurkrowNRZOOM.png")));break;
    case "Octillery (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Octillery.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/OctilleryZOOM.png")));break;
    case "Paras (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Paras_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/ParasNRZOOM.png")));break;
    case "Parasect (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Parasect_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/ParasectNRZOOM.png")));break;
    case "Piloswine (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Piloswine_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/PiloswineNRZOOM.png")));break;
    case "Porygon2 (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Porygon2.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Porygon2ZOOM.png")));break;
    case "Quagsire (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Quagsire_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/QuagsireZOOM.png")));break;
    case "Qwilfish (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Qwilfish.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/QwilfishZOOM.png")));break;
    case "Raichu (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Raichu_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/RaichuNRZOOM.png")));break;
    case "Raikou (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Raikou_NR.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/RaikouZOOM.png")));break;
    case "Raikou (NR 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Raikou_Legendarybody.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/RaikouLegendaryBodyZOOM.png")));break;
    case "Remoraid (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Remoraid_NR.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/RemoraidNRZOOM.png")));break;    
    case "Seaking (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Seaking_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/SeakingNRZOOM.png")));break;
    case "Shuckle (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Shuckle_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/ShuckleZOOM.png")));break;
    case "Skarmory (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Skarmory.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/SkarmoryZOOM.png")));break;
    case "Skiploom (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Skiploom_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/SkiploomdoomloomboomZOOM.png")));break;
    case "Slugma (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Slugma_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/SlugmaZOOM.png")));break;
    case "Smoochum (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Smoochum_NR.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/SmoochumZOOM.png")));break;
    case "Sneasel (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Sneasel.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/SneaselZOOM.png")));break;
    case "Snubbull (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Snubbull.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/SnubbullZOOM.png")));break;
    case "Stantler (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Stantler.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/StantlerNRZOOM.png")));break;
    case "Starmie (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Starmie_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/StarmieNRZOOM.png")));break;
    case "Staryu (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Staryu_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/StaryuZOOM.png")));break;
    case "Sudowoodo (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Sudowoodo_NRmimic.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/SudowoodoZOOM.png")));break;
    case "Suicune (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Suicune_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/SuicuneZOOM.png")));break;
    case "Suicune (NR 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Suicune_legendarybody.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/SuicuneLEGENDARYBODYZOOM.png")));break;
    case "Swinub (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Swinub_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/SwinubZOOM.png")));break;
    case "Unown B": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/UnownB.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/UnownBZOOM.png")));break;
    case "Unown K": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/UnownK.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/UNownKZOOM.png")));break;
    case "Unown Y": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/UnownY.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/UnownYZOOM.png")));break;
    case "Zubat (NR)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Zubat_NR.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/ZubatZOOM.png")));break;
    case "Magikarp (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Magikarp (Shining).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Magikarp (Shining)Zoom.png")));break;    
    case "Gyarados (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Gyarados (Shining).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_revelation/Gyarados (Shining)Zoom.png")));break;
    
        //Neo Destiny
    case "Ampharos (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Ampharos.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkAmpharosZOOM.jpg")));break;    
    case "Cyndaquil (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Cyndaquil_ND.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/CyndaquilZOOM.jpg")));break;
    case "Chansey (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Chansey_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/ChanseyZOOM.jpg")));break;    
    case "Ariados (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Ariados.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkAriadosZOOM.jpg")));break;
    case "Crobat (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Crobat.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkCrobatZOOM.jpg")));break;
    case "Croconaw (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Croconaw.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkCroconawZOOM.jpg")));break;    
    case "Donphan (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Donphan.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkDonphanZOOM.jpg")));break;    
    case "Espeon (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Espeon.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkEspeonZOOM.jpg")));break;    
    case "Exeggutor (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Exeggutor.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkExeggutorZOOM.jpg")));break;
    case "Feraligatr (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Feraligatr.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkFeraligatrZOOM.jpg")));break;    
    case "Flaaffy (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Flaaffy.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkFlaaffyZOOM.jpg")));break;
    case "Forretress (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Forretress.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkForretressZOOM.jpg")));break;
    case "Gengar (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Gengar.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkGengarZOOM.jpg")));break;    
    case "Haunter (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Haunter.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkHaunterZOOM.jpg")));break;    
    case "Houndoom (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Houndoom.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkHoundoomZOOM.jpg")));break;
    case "Magcargo (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Magcargo.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkMagcargoZOOM.jpg")));break;
    case "Octillery (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Octillery.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkOctilleryZOOM.jpg")));break;
    case "Omanyte (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Omanyte.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkOmanyteZOOM.jpg")));break;
    case "Omastar (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Omastar.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkOmastarZOOM.jpg")));break;
    case "Porygon2 (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Porygon2.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkPorygon2ZOOM.jpg")));break;
    case "Pupitar (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Pupitar.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkPupitarZOOM.jpg")));break;
    case "Quilava (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Quilava.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkQuilavaZOOM.jpg")));break;
    case "Scizor (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Scizor.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkScizorZOOM.jpg")));break;
    case "Slowking (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Slowking.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkSlowkingZOOM.jpg")));break;
    case "Typhlosion (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Typhlosion.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkTyphlosionZOOM.jpg")));break;
    case "Tyranitar (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Tyranitar.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkTyranitarZOOM.jpg")));break;
    case "Ursaring (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Ursaring.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkUrsaringZOOM.jpg")));break;
    case "Wigglytuff (Dark)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dark_Wigglytuff.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DarkWigglytuffZOOM.jpg")));break;
    case "Dratini (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Dratini_NDshed.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/DratiniZOOM.jpg")));break;
    case "Exeggcute (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Exeggcute_ND.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/ExeggcuteZOOM.jpg")));break;
    case "Gastly (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Gastly_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/GastlyZOOM.jpg")));break;
    case "Girafarig (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Girafarig_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/GirafarigZOOM.jpg")));break;
    case "Gligar (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Gligar_NDstunpoison.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/GligarZOOM.jpg")));break;
    case "Growlithe (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Growlithe_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/GrowlitheZOOM.jpg")));break;
    case "Heracross (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Heracross.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/HeracrossZOOM.jpg")));break;
    case "Hitmonchan (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Hitmonchan_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/HitmonchanZOOM.jpg")));break;
    case "Hitmonlee (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Hitmonlee_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/HitmonleeZOOM.jpg")));break;
    case "Houndour (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Houndour_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/HoundourZOOM.jpg")));break;
    case "Jigglypuff (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Jigglypuff_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/JigglypuffZOOM.jpg")));break;
    case "Vaporeon (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LIght_Vaporeon.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightVaporeonZOOM.jpg")));break;
    case "Larvitar (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Larvitar_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LarvitarZOOM.jpg")));break;
    case "Ledyba (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Ledyba_ND.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LedybaZOOM.jpg")));break;
    case "Arcanine (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Arcanine.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightArcanineZOOM.jpg")));break;
    case "Azumarill (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Azumarill.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightAzumarillZOOM.jpg")));break;
    case "Dewgong (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Dewgong.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightDewgongZOOM.jpg")));break;
    case "Dragonair (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Dragonair.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightDragonairZOOM.jpg")));break;
    case "Dragonite (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Dragonite.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightDragoniteZOOM.jpg")));break;
    case "Flareon (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Flareon.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightFlareonZOOM.jpg")));break;
    case "Golduck (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Golduck.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightGolduckZOOM.jpg")));break;
    case "Jolteon (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Jolteon.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightJolteonZOOM.jpg")));break;
    case "Lanturn (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Lanturn.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightLanturnZOOM.jpg")));break;
    case "Ledian (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Ledian.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightLedianZOOM.jpg")));break;
    case "Machamp (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Machamp.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightMachampZOOM.jpg")));break;
    case "Machoke (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Machoke.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightMachokeZOOM.jpg")));break;
    case "Ninetales (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Ninetales.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightNinetalesZOOM.jpg")));break;
    case "Piloswine (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Piloswine.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightPiloswineZOOM.jpg")));break;
    case "Slowbro (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Slowbro.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightSlowbroZOOM.jpg")));break;
    case "Sunflora (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Sunflora.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightSunfloraZOOM.jpg")));break;
    case "Togetic (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Togetic.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightTogeticZOOM.jpg")));break;
    case "Venomoth (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Venomoth.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightVenomothZOOM.jpg")));break;
    case "Wigglytuff (Light)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Light_Wigglytuff.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/LightWigglytuffZOOM.jpg")));break;
    case "Machop (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Machop_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/MachopZOOM.jpg")));break;
    case "Mantine (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Mantine_ND.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/MantineZOOM.jpg")));break;
    case "Mareep (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Mareep_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/MareepZOOM.jpg")));break;
    case "Phanpy (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Phanpy_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/PhanpyZOOM.jpg")));break;
    case "Pineco (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Pineco_ND.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/PinecoZOOM.jpg")));break;
    case "Porygon (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Porygon_ND.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/PorygonZOOM.jpg")));break;
    case "Psyduck (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Psyduck_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/PsyduckZOOM.jpg")));break;
    case "Remoraid (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Remoraid_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/RemoraidZOOM.jpg")));break;
    case "Scyther (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Scyther_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/ScytherZOOM.jpg")));break;
    case "Seel (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Seel_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/SeelZOOM.jpg")));break;
    case "Celebi (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Shining_Celebi.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/ShiningCelebiZOOM.jpg")));break;
    case "Charizard (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Shining_Charizard.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/ShiningCharizardZOOM.jpg")));break;
    case "Kabutops (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Shining_Kabutops.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/ShiningKabutopsZOOM.jpg")));break;
    case "Mewtwo (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Shining_Mewtwo.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/ShiningMewtwoZOOM.jpg")));break;
    case "Noctowl (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Shining_Noctowl.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/ShiningNoctowlZOOM.jpg")));break;
    case "Raichu (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Shining_Raichu.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/ShiningRaichuZOOM.jpg")));break;
    case "Steelix (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Shining_Steelix.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/ShiningSteelixZOOM.jpg")));break;
    case "Tyranitar (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Shining_Tyranitar.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/ShiningTyranitarZOOM.jpg")));break;
    case "Slugma (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Slugma_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/SlugmaZOOM.jpg")));break;
    case "Sunkern (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Sunkern_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/SunkernZOOM.jpg")));break;
    case "Swinub (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Swinub_ND.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/SwinubZOOM.jpg")));break;
    case "Togepi (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Togepi_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/TogepiZOOM.jpg")));break;
    case "Totodile (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Totodile_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/TotodileZOOM.jpg")));break;
    case "Venonat (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Venonat_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/VenonatZOOM.jpg")));break;
    case "Vulpix (NDe)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/Vulpix_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/VulpixZOOM.jpg")));break;
    case "Unown C": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownC_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownCZOOM.jpg")));break;
    case "Unown G": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownG_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownGZOOM.jpg")));break;    
    case "Unown H": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownH_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownHZOOM.jpg")));break;
    case "Unown L": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownL_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownLZOOM.jpg")));break;
    case "Unown P": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownP_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownPZOOM.jpg")));break;
    case "Unown Q": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownQ_ND.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownQZOOM.jpg")));break;
    case "Unown S": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownS_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownSZOOM.jpg")));break;
    case "Unown T": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownT_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownTZOOM.jpg")));break;
    case "Unown V": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownV_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownVZOOM.jpg")));break;
    case "Unown W": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownW_ND.png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownWZOOM.jpg")));break;
    case "Unown X": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownX_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownXZOOM.jpg")));break;
    case "Unown Z": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownZ_ND.png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/neo_destiny/UnownZZOOM.jpg")));break;
    
    //Promo's and Southern Islands
    case "Arcanine (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Arcanine (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Arcanine (Promo)Zoom.png")));break;
    case "Articuno (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Articuno (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Articuno (Promo)Zoom.png")));break;
    case "Articuno (Promo 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Articuno (Promo 2).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Articuno (Promo 2)Zoom.png")));break;
    case "Butterfree (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Butterfree (SI).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Butterfree (SI)Zoom.png")));break;
    case "Cleffa (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Cleffa (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Cleffa (Promo)Zoom.png")));break;
    case "Charizard (Premium)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Charizard (Premium).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Charizard (Premium)Zoom.png")));break;    
    case "Dragonite (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Dragonite (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Dragonite (Promo)Zoom.png")));break;
    case "Eevee (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Eevee (Promo).png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Eevee (Promo)Zoom.png")));break;
    case "Electabuzz (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Electabuzz (Promo).png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Electabuzz (Promo)Zoom.png")));break;
    case "Electabuzz (Promo 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Electabuzz (Promo 2).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Electabuzz (Promo 2)Zoom.png")));break;
    case "Entei (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Entei (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Entei (Promo)Zoom.png")));break;
    case "Exeggutor (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Exeggutor (SI).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Exeggutor (SI)Zoom.png")));break;
    case "Hitmontop (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Hitmontop (Promo).png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Hitmontop (Promo)Zoom.png")));break;
    case "Igglybuff (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Igglybuff (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Igglybuff (Promo)Zoom.png")));break;
    case "Ivysaur (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Ivysaur (SI).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Ivysaur (SI)Zoom.png")));break;
    case "Jigglypuff (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Jigglypuff (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Jigglypuff (Promo)Zoom.png")));break;
    case "Jigglypuff (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Jigglypuff (SI).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Jigglypuff (SI)Zoom.png")));break;
    case "Lapras (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Lapras (SI).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Lapras (SI)Zoom.png")));break;
    case "Ledyba (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Ledyba (SI).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Ledyba (SI)Zoom.png")));break;
    case "Lickitung (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Lickitung (SI).png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Lickitung (SI)Zoom.png")));break;
    case "Machamp (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Machamp (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Machamp (Promo)Zoom.png")));break;
    case "Magmar (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Magmar (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Magmar (Promo)Zoom.png")));break;
    case "Marill (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Marill (Promo).png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Marill (Promo)Zoom.png")));break;
    case "Marill (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Marill (SI).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Marill (SI)Zoom.png")));break;
    case "Meowth (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Meowth (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Meowth (Promo)Zoom.png")));break;
    case "Meowth (Team Rocket's)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Meowth (Team Rocket's).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Meowth (Team Rocket's)Zoom.png")));break;
    case "Mew (Ancient)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Mew (Ancient).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Mew (Ancient)Zoom.png")));break;
    case "Mew (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Mew (Promo).png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Mew (Promo)Zoom.png")));break;
    case "Mew (Promo 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Mew (Promo 2).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Mew (Promo 2)Zoom.png")));break;
    case "Mew (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Mew (SI).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Mew (SI)Zoom.png")));break;
    case "Mew (Shining)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Mew (Shining).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Mew (Shining)Zoom.png")));break;
    case "Mewtwo (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Mewtwo (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Mewtwo (Promo)Zoom.png")));break;
    case "Mewtwo (Promo 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Mewtwo (Promo 2).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Mewtwo (Promo 2)Zoom.png")));break;
    case "Misdreavus (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Misdreavus (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Misdreavus (Promo)Zoom.png")));break;
    case "Moltres (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Moltres (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Moltres (Promo)Zoom.png")));break;
    case "Onix (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Onix (SI).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Onix (SI)Zoom.png")));break;
    case "Pichu (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pichu (Promo).png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pichu (Promo)Zoom.png")));break;
    case "Pidgeot (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pidgeot (SI).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pidgeot (SI)Zoom.png")));break;
    case "Pikachu (Flying)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pikachu (Flying).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pikachu (Flying)Zoom.png")));break;
    case "Pikachu (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pikachu (Promo).png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pikachu (Promo)Zoom.png")));break;
    case "Pikachu (Promo 2)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pikachu (Promo 2).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pikachu (Promo 2)Zoom.png")));break;
    case "Pikachu (Promo 3)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pikachu (Promo 3).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pikachu (Promo 3)Zoom.png")));break;
    case "Pikachu (Promo 4)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pikachu (Promo 4).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pikachu (Promo 4)Zoom.png")));break;
    case "Pikachu (Surfing)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pikachu (Surfing).png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pikachu (Surfing)Zoom.png")));break;
    case "Pikachu (___'s)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pikachu (___'s).png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Pikachu (___'s)Zoom.png")));break;
    case "Porygon (Cool)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Porygon (Cool).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Porygon (Cool)Zoom.png")));break;
    case "Primeape (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Primeape (SI).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Primeape (SI)Zoom.png")));break;
    case "Raticate (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Raticate (SI).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Raticate (SI)Zoom.png")));break;
    case "Scizor (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Scizor (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Scizor (Promo)Zoom.png")));break;
    case "Scyther (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Scyther (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Scyther (Promo)Zoom.png")));break;
    case "Slowking (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Slowking (SI).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Slowking (SI)Zoom.png")));break;
    case "Smeargle (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Smeargle (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Smeargle (Promo)Zoom.png")));break;
    case "Snorlax (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Snorlax (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Snorlax (Promo)Zoom.png")));break;
    case "Tentacruel (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Tentacruel (SI).png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Tentacruel (SI)Zoom.png")));break;
    case "Togepi (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Togepi (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Togepi (Promo)Zoom.png")));break;
    case "Togepi (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Togepi (SI).png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Togepi (SI)Zoom.png")));break;
    case "Unown J (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Unown J (Promo).png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Unown J (Promo)Zoom.png")));break;
    case "Unown R (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Unown R (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Unown R (Promo)Zoom.png")));break;    
    case "Venusaur (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Venusaur (Promo).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Venusaur (Promo)Zoom.png")));break;
    case "Vileplume (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Vileplume (SI).png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Vileplume (SI)Zoom.png")));break;
    case "Wartortle (SI)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Wartortle (SI).png")));
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Wartortle (SI)Zoom.png")));break;
    case "Zapdos (Promo)": Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Zapdos (Promo).png"))); 
    CardZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Promos/Zapdos (Promo)Zoom.png")));break;
    
    
    default: Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/Back.png"))); break;
    
}// TODO add your handling code here:
    }

    private void TogglePrize(JLabel Prize) {
        if (Prize.getIcon()==null){
            Prize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/pokeboard/BackSmall.png")));
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

