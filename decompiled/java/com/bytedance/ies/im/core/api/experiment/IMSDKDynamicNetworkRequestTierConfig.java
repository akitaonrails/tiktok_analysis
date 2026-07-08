package com.bytedance.ies.im.core.api.experiment;

import X.C09CT;
import X.C0YIY;
import X.C13BV;
import X.C13LZ;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSDKDynamicNetworkRequestTierConfig {

    @C09CT("cmds")
    public final List<Integer> cmds;

    @C09CT("enable_composite")
    public final boolean enableComposite;

    @C09CT("http_max_trial")
    public final int httpMaxTrial;

    @C09CT("http_retry_interval_millis")
    public final long httpRetryIntervalMillis;

    @C09CT("ws_max_trial")
    public final int wsMaxTrial;

    @C09CT("ws_request_timeout_millis")
    public final long wsRequestTimeoutMillis;

    @C09CT("ws_retry_interval_millis")
    public final long wsRetryIntervalMillis;

    public IMSDKDynamicNetworkRequestTierConfig() {
        this(null, 0, 0L, 0L, 0, 0L, false, 127, null);
    }

    public final C0YIY toSDKModel() {
        int iLJ = C13LZ.LJ(this.wsMaxTrial, 0, 10);
        int iLJ2 = C13LZ.LJ(this.httpMaxTrial - 1, 0, 10);
        boolean z = this.enableComposite;
        long j = this.wsRetryIntervalMillis;
        if (j < 0) {
            j = 0;
        }
        long j2 = this.httpRetryIntervalMillis;
        if (j2 < 0) {
            j2 = 0;
        }
        return new C0YIY(iLJ, j, iLJ2, j2, z);
    }

    public IMSDKDynamicNetworkRequestTierConfig(List<Integer> list, int i, long j, long j2, int i2, long j3, boolean z) {
        this.cmds = list;
        this.wsMaxTrial = i;
        this.wsRetryIntervalMillis = j;
        this.wsRequestTimeoutMillis = j2;
        this.httpMaxTrial = i2;
        this.httpRetryIntervalMillis = j3;
        this.enableComposite = z;
    }

    public IMSDKDynamicNetworkRequestTierConfig(List list, int i, long j, long j2, int i2, long j3, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? C13BV.INSTANCE : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? Mp4ScreenVideoLoadTimeout.CONTROL : j, (i3 & 8) != 0 ? 0L : j2, (i3 & 16) != 0 ? 1 : i2, (i3 & 32) != 0 ? 2000L : j3, (i3 & 64) == 0 ? z : false);
    }
}
