
# Eagler Context Redacted Diff
# Copyright (c) 2025 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> CHANGE  2 : 4  @  2 : 6

~ import net.lax1dude.eaglercraft.v1_8.EaglercraftRandom;
~ 

> CHANGE  33 : 34  @  33 : 34

~ 	public void randomTick(World var1, BlockPos var2, IBlockState var3, EaglercraftRandom var4) {

> CHANGE  2 : 3  @  2 : 3

~ 	public void updateTick(World world, BlockPos blockpos, IBlockState iblockstate, EaglercraftRandom var4) {

> CHANGE  43 : 47  @  43 : 45

~ 			EnumFacing[] facings = EnumFacing._VALUES;
~ 			BlockPos tmp = new BlockPos(0, 0, 0);
~ 			for (int i = 0; i < facings.length; ++i) {
~ 				world.notifyNeighborsOfStateChange(blockpos.offsetEvenFaster(facings[i], tmp), this);

> CHANGE  93 : 97  @  93 : 95

~ 			EnumFacing[] facings = EnumFacing._VALUES;
~ 			BlockPos tmp = new BlockPos(0, 0, 0);
~ 			for (int i = 0; i < facings.length; ++i) {
~ 				world.notifyNeighborsOfStateChange(blockpos.offsetEvenFaster(facings[i], tmp), this);

> EOF
