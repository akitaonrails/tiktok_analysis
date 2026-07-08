package com.ss.android.ugc.tiktok.location.config;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class WifiConfigModel {

    @C09CT("connected_only")
    public final boolean connectedOnly;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("enabled_regions")
    public final List<String> enabledRegions;

    @C09CT("realtime_scan_certs")
    public final List<String> realtimeScanCerts;

    @C09CT("scan_timeout_ms")
    public final long scanTimeoutMs;

    public WifiConfigModel() {
        this(false, false, null, null, 0L, 31, null);
    }

    public WifiConfigModel(boolean z, boolean z2, List<String> list, List<String> list2, long j) {
        this.enabled = z;
        this.connectedOnly = z2;
        this.enabledRegions = list;
        this.realtimeScanCerts = list2;
        this.scanTimeoutMs = j;
    }

    public WifiConfigModel(boolean z, boolean z2, List list, List list2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? C1697810uHb.LJIIJJI("JP", "ID", "VN", "TH", "PH", "MY", "SG", "BD", "PK", "KH") : list, (i & 8) != 0 ? C13BV.INSTANCE : list2, (i & 16) != 0 ? TimeUnit.SECONDS.toMillis(10L) : j);
    }
}
