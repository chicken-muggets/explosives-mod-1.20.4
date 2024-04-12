package com.verbiox.grenades;

import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModItemGenerator {
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(GrenadeItem.GRENADE_ITEM, Models.GENERATED);
    }
}
