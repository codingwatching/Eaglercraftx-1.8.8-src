
# Eagler Context Redacted Diff
# Copyright (c) 2025 lax1dude. All rights reserved.

# Version: 1.0
# Author: lax1dude

> DELETE  2  @  2 : 5

> INSERT  4 : 9  @  4

+ 
+ import com.google.common.base.Objects;
+ import com.google.common.collect.Maps;
+ import com.google.common.collect.Sets;
+ 

> DELETE  2  @  2 : 4

> CHANGE  3 : 4  @  3 : 4

~ 	public Map<Block, IStateMapper> blockStateMap = Maps.newIdentityHashMap();

> EOF
