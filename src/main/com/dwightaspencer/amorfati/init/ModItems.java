package com.dwightaspencer.amorfati.init;

import epicsquid.mysticallib.event.RegisterContentEvent;
import epicsquid.mysticallib.item.ItemBase;

import com.dwightaspencer.amorfati.AmorFati;
import com.dwightaspencer.amorfati.item.*;
import com.dwightaspencer.amorfati.item.cards.*;

import net.minecraft.block.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModItems {

  // All mod items

  public static Item mob_essence;
  public static Item camera_obscura;
  public static Item oraculum_fortuna;
  public static Item oraculum_fati;
  public static Item cart_blank;
  public static Item cart_minor_arcana;
  public static Item cart_major_arcana;
  public static List<Item> cards;

  // Auto-populated
  public static List<Item> knives = new ArrayList<>();
  
  /**
   * Register all items
   */
  public static void registerItems(@Nonnull RegisterContentEvent event) {
    // Tools
    event.addItem(camera_obscura = new itemBase("camera").setCreativeTab(AmorFati.tab).setMaxStackSize(1));
    event.addItem(oraculum_fortuna = new itemBase("holder").setCreativeTab(AmorFati.tab).setMaxStackSize(1));
    event.addItem(oraculum_fortuna = new itemBase("guide").setCreativeTab(AmorFati.tab).setMaxStackSize(1));
    
    // Crafting ingredients 
    event.addItem(mob_essence = newItemBae("essence").setCreativeTab(AmorFati.tab).setMaxStackSize(16));
    
    // Heart of the cards... mod
    event.addItem(card_blank = new ItemBase("card_blank").setCreativeTab(AmorFati.tab));
    event.addItem(card_major_arcana = new ItemBase("card_major_arcana").setCreativeTab(AmorFati.tab).setMaxStackSize(22));
    event.addItem(card_minor_arcana = new ItemBase("card_minor_arcana").setCreativeTab(AmorFati.tab).setMaxStackSize(56));

    cards = Arrays.asList(card_blank, card_major_arcana, card_minor_arcana); 
  }

  /**
   * Register item oredicts here
   */
  public static void registerOredict() {

    for (Item card : cards) {
      OreDictionary.registerOre("card", card);
    }
    
    OreDictionary.registerOre("mob_essence", ModItems.mob_essence);
  }
}
