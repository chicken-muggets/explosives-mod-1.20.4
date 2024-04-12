package com.verbiox.grenades;

import com.verbiox.ExplosivesMod;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;

public class GrenadeEntity extends ThrownItemEntity {

    public GrenadeEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }
    public GrenadeEntity(World world, LivingEntity owner) {
        super(ModEntitys.GRENADE_ENTITY, owner, world);
    }

    @Override
    protected Item getDefaultItem() {
        return GrenadeItem.GRENADE_ITEM;
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        if (!this.getWorld().isClient()) {
            this.getWorld().createExplosion(this, this.getX(), this.getY(), this.getZ(), 4, false, World.ExplosionSourceType.TNT);
        }
        super.onBlockHit(blockHitResult);
    }

    public static void registerModEntities() {
        // Register the entity
        ExplosivesMod.LOGGER.info("registering mod entities for " + ExplosivesMod.MOD_ID);
    }
}
