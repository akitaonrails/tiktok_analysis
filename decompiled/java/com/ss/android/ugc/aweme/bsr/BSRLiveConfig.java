package com.ss.android.ugc.aweme.bsr;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class BSRLiveConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("live_bad_vv_ratio")
    public final float liveBadVVRatio;

    @C09CT("live_continuous_bad_vv_count")
    public final int liveContinuousBadVVCount;

    @C09CT("live_enter_event")
    public final List<String> liveEnterEvent;

    public BSRLiveConfig() {
        this(false, 2, 0.2f, C1697810uHb.LJIIJJI("livesdk_live_show", "livesdk_live_take", "livesdk_live_enter_room_full_link", "livesdk_live_client_applog_monitor_log", "livesdk_go_live_push_stream", "ttls_push_event"));
    }

    public BSRLiveConfig(boolean z, int i, float f, List<String> list) {
        this.enable = z;
        this.liveContinuousBadVVCount = i;
        this.liveBadVVRatio = f;
        this.liveEnterEvent = list;
    }
}
