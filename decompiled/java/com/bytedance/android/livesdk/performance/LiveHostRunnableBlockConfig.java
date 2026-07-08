package com.bytedance.android.livesdk.performance;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveHostRunnableBlockConfig {
    public static final TypeAdapter ADAPTER = new LiveHostRunnableBlockConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("block_list")
    public List<String> blockList;

    @C09CT("block_time_in_mills")
    public long blockTimeInMills;

    @C09CT("enable")
    public boolean enable;

    public LiveHostRunnableBlockConfig() {
        this(false, 0L, null, 7, null);
    }

    public final List<String> getBlockList() {
        return this.blockList;
    }

    public final long getBlockTimeInMills() {
        return this.blockTimeInMills;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final void setBlockList(List<String> list) {
        this.blockList = list;
    }

    public final void setBlockTimeInMills(long j) {
        this.blockTimeInMills = j;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public LiveHostRunnableBlockConfig(boolean z, long j, List<String> list) {
        this.enable = z;
        this.blockTimeInMills = j;
        this.blockList = list;
    }

    public LiveHostRunnableBlockConfig(boolean z, long j, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 1500L : j, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
