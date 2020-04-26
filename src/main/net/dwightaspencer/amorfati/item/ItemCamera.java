package com.dwightaspencer.amorfati.item;

import epicsquid.mysticallib.item.ItemBase;
import epicsquid.mysticallib.util.ItemUtil;
import com.dwightaspencer.amorfati.AmorFati;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.IItemHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class itemCamera extends ItemBase implements iItemCamera  {
  public itemCamera(@Nonnull String name) {
    super(name);
    this.setMaxStackSize(1);
  }

  public itemCamera(@Nonnull String name, PouchType type) {
    this(name);
    this.type = type;
  }
}
