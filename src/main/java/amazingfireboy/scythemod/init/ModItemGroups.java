package amazingfireboy.scythemod.init;

import java.util.function.Supplier;

import amazingfireboy.scythemod.ScytheMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(ScytheMod.MODID, () -> new ItemStack(ModItems.SCYTHE));

    public static class ModItemGroup extends ItemGroup {
        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> supplier){
            super(name);
            this.iconSupplier = supplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }
}