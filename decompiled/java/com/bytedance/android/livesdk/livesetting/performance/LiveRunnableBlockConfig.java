package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import X.C1AWY;
import X.C2188811AlT;
import X.EnumC2184291AeB;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveRunnableBlockConfig {
    public static final TypeAdapter ADAPTER = new LiveRunnableBlockConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("block_mode")
    public int blockMode;

    @C09CT("block_time")
    public long blockTime;

    @C09CT("runnable_block_type")
    public int runnableBlockType;

    @C09CT("runnable_config_for_type_all")
    public List<String> runnableConfigForTypeAll;

    @C09CT("runnable_config_for_type_single")
    public List<String> runnableConfigForTypeSingle;

    @C09CT("scene_min_interval")
    public long sceneMinInterval;

    @C09CT("thread_block_once")
    public boolean threadBlockOnce;

    @C09CT("thread_block_type")
    public int threadBlockType;

    @C09CT("thread_config_for_type_all")
    public List<String> threadConfigForTypeAll;

    @C09CT("thread_config_for_type_single")
    public List<String> threadConfigForTypeSingle;

    public LiveRunnableBlockConfig() {
        this(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), EnumC2184291AeB.PARK.ordinal(), C1AWY.SINGLE.ordinal(), C1AWY.SINGLE.ordinal(), 3000L, 0L, false);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveRunnableBlockConfig(runnableConfigForTypeAll=");
        sbLIZ.append(this.runnableConfigForTypeAll);
        sbLIZ.append(", runnableConfigForTypeSingle=");
        sbLIZ.append(this.runnableConfigForTypeSingle);
        sbLIZ.append(", threadConfigForTypeAll=");
        sbLIZ.append(this.threadConfigForTypeAll);
        sbLIZ.append(", threadConfigForTypeSingle=");
        sbLIZ.append(this.threadConfigForTypeSingle);
        sbLIZ.append(", blockMode=");
        sbLIZ.append(this.blockMode);
        sbLIZ.append(", runnableBlockType=");
        sbLIZ.append(this.runnableBlockType);
        sbLIZ.append(", threadBlockType=");
        sbLIZ.append(this.threadBlockType);
        sbLIZ.append(", blockTime=");
        sbLIZ.append(this.blockTime);
        sbLIZ.append(", sceneMinInterval=");
        sbLIZ.append(this.sceneMinInterval);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LiveRunnableBlockConfig(List<String> list, List<String> list2, List<String> list3, List<String> list4, int i, int i2, int i3, long j, long j2, boolean z) {
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
    }
}
