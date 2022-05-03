package net.Zorro00141.chefsmod;

import net.Zorro00141.chefsmod.ChefsMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
           DeferredRegister.create(ForgeRegistries.ITEMS, ChefsMod.MOD_ID);

    public static final RegistryObject<Item> Bread_knife = ITEMS.register("bread_knife",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> Chef_Knife = ITEMS.register("chef_knife",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    /*TODO Items to add
    French bread
    French toast
    baguette
    croissant
    banana bread
    sourdough bread
    yeast
    bread starter
    onion
    garlic
    pepperoni
    ham
    sausage
    pizza dough
    mozzarella
    cheddar
    marble cheese
    cook book

    raspberry
    blueberry
    strawberry
    and respective jams and jellies

    rye seeds
    rye
    bananas
    olives
    oil oil
    butter

    */

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
