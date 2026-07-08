package com.ss.android.ugc.aweme.runnable;

import X.C09CT;
import X.C1AWY;
import X.EnumC2184291AeB;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class RunnableBlockConfig {

    @C09CT("block_mode")
    public final int blockMode;

    @C09CT("block_time")
    public final long blockTime;

    @C09CT("bypass_staggered_release")
    public final boolean bypassStaggeredRelease;

    @C09CT("runnable_block_type")
    public final int runnableBlockType;

    @C09CT("runnable_config_for_type_all")
    public final List<String> runnableConfigForTypeAll;

    @C09CT("runnable_config_for_type_single")
    public final List<String> runnableConfigForTypeSingle;

    @C09CT("scene_min_interval")
    public final long sceneMinInterval;

    @C09CT("thread_block_once")
    public final boolean threadBlockOnce;

    @C09CT("thread_block_type")
    public final int threadBlockType;

    @C09CT("thread_config_for_type_all")
    public final List<String> threadConfigForTypeAll;

    @C09CT("thread_config_for_type_single")
    public final List<String> threadConfigForTypeSingle;

    public RunnableBlockConfig() {
        this(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), EnumC2184291AeB.PARK.ordinal(), C1AWY.SINGLE.ordinal(), C1AWY.SINGLE.ordinal(), 3000L, 0L, false, false);
    }

    public RunnableBlockConfig(List<String> list, List<String> list2, List<String> list3, List<String> list4, int i, int i2, int i3, long j, long j2, boolean z, boolean z2) {
        this.runnableConfigForTypeAll = list;
        this.runnableConfigForTypeSingle = list2;
        this.threadConfigForTypeAll = list3;
        this.threadConfigForTypeSingle = list4;
        this.blockMode = i;
        this.runnableBlockType = i2;
        this.threadBlockType = i3;
        this.blockTime = j;
        this.sceneMinInterval = j2;
        this.threadBlockOnce = z;
        this.bypassStaggeredRelease = z2;
    }
}
