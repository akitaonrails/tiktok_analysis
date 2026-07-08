package com.bytedance.geckox.interceptors.zstd.compress;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class GeckoCompressConfig {

    @C09CT("aks")
    public final List<String> aks;

    @C09CT("compress_interval")
    public final int compress_interval;

    @C09CT("compress_throttle")
    public final int compress_throttle;

    @C09CT("cpu_usage_level")
    public final int cpu_usage_level;

    @C09CT("decompress_trigger_count")
    public final int decompress_trigger_count;

    @C09CT("enable")
    public final boolean enabled;

    @C09CT("opt_objective")
    public final List<String> opt_objective;

    @C09CT("patch_recompress")
    public final boolean patch_recompress;

    @C09CT("record_local_channel_to_compress_record")
    public final boolean record_local_channel_to_compress_record;

    @C09CT("skip_channel_list")
    public final List<String> skip_channel_list;

    public GeckoCompressConfig() {
        this(false, null, null, 0, 0, 0, false, null, 0, false, 1023, null);
    }

    public GeckoCompressConfig(boolean z, List<String> list, List<String> list2, int i, int i2, int i3, boolean z2, List<String> list3, int i4, boolean z3) {
        this.enabled = z;
        this.skip_channel_list = list;
        this.aks = list2;
        this.decompress_trigger_count = i;
        this.compress_interval = i2;
        this.compress_throttle = i3;
        this.patch_recompress = z2;
        this.opt_objective = list3;
        this.cpu_usage_level = i4;
        this.record_local_channel_to_compress_record = z3;
    }

    public GeckoCompressConfig(boolean z, List list, List list2, int i, int i2, int i3, boolean z2, List list3, int i4, boolean z3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? false : z, (i5 & 2) != 0 ? C13BV.INSTANCE : list, (i5 & 4) != 0 ? C13BV.INSTANCE : list2, (i5 & 8) != 0 ? 5 : i, (i5 & 16) != 0 ? 2 : i2, (i5 & 32) == 0 ? i3 : 5, (i5 & 64) != 0 ? true : z2, (i5 & 128) != 0 ? C13BV.INSTANCE : list3, (i5 & 256) != 0 ? 4 : i4, (i5 & 512) == 0 ? z3 : false);
    }
}
