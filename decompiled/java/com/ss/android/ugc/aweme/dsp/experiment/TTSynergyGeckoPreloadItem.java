package com.ss.android.ugc.aweme.dsp.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes32.dex */
public final class TTSynergyGeckoPreloadItem {
    public boolean LIZ;

    @C09CT("enable_preload_predefined_gecko_channels")
    public final boolean enablePreloadChannels;

    @C09CT("enable_preload_gecko_channel_from_schema")
    public final boolean enablePreloadFromSchema;

    @C09CT("predefined_gecko_channels")
    public final List<String> predefinedGeckoChannels;

    public TTSynergyGeckoPreloadItem() {
        this(false, false, null, false, 15, null);
    }

    public TTSynergyGeckoPreloadItem(boolean z, boolean z2, List<String> list, boolean z3) {
        this.enablePreloadFromSchema = z;
        this.enablePreloadChannels = z2;
        this.predefinedGeckoChannels = list;
        this.LIZ = z3;
    }

    public TTSynergyGeckoPreloadItem(boolean z, boolean z2, List list, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? false : z3);
    }
}
