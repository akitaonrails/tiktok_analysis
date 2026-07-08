package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class BatchUnloadConfig {
    public static final TypeAdapter ADAPTER = new BatchUnloadConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("batchMs")
    public long batchMs;

    @C09CT("maxDelayMs")
    public long delayMs;

    @C09CT("enableOpt")
    public boolean enableBatchOpt;

    @C09CT("enableV2")
    public boolean enableV2;

    @C09CT("firstBatchSize")
    public int firstBatchSize;

    @C09CT("loadDelayInt")
    public int loadDelayInt;

    @C09CT("loop_interval_ms")
    public long loopInterval;

    @C09CT("quickScrollVelocity")
    public int quickScrollVelocity;

    @C09CT("ignore_list")
    public List<String> whiteListWidgets;

    public BatchUnloadConfig() {
        this(false, 0L, 0L, null, false, 0, 0, 0L, 0, 511, null);
    }

    public BatchUnloadConfig(boolean z, long j, long j2, List<String> list, boolean z2, int i, int i2, long j3, int i3) {
        this.enableBatchOpt = z;
        this.batchMs = j;
        this.delayMs = j2;
        this.whiteListWidgets = list;
        this.enableV2 = z2;
        this.loadDelayInt = i;
        this.quickScrollVelocity = i2;
        this.loopInterval = j3;
        this.firstBatchSize = i3;
    }

    public BatchUnloadConfig(boolean z, long j, long j2, List list, boolean z2, int i, int i2, long j3, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? 30L : j, (i4 & 4) != 0 ? 150L : j2, (i4 & 8) != 0 ? C13BV.INSTANCE : list, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? 32 : i, (i4 & 64) != 0 ? 800 : i2, (i4 & 128) != 0 ? 3L : j3, (i4 & 256) == 0 ? i3 : 0);
    }
}
