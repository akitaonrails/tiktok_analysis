package com.ss.pusher.core.params;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;

/* JADX INFO: loaded from: classes21.dex */
public final class LWReconnectCfg {

    @C09CT("lw_reconnect_close_abr_drop_frame")
    public final int lwReconnectCloseAbrDropFrame;

    @C09CT("lw_reconnect_enable_request_Iframe")
    public final int lwReconnectEnableRequestIFrame;

    @C09CT("enable_lw_reconnect")
    public final boolean enableLWReconnect = true;

    @C09CT("lw_reconnect_drop_frame_thresh")
    public final int lwReconnectDropFrameThresh = LivePreCreateNextRoomPlayer.ENABLE;

    @C09CT("lw_reconnect_enable_drop_frame")
    public final int lwReconnectEnableDropFrame = 1;

    @C09CT("lw_reconnect_open_timeout")
    public final int lwReconnectOpenTimeout = LivePreCreateNextRoomPlayer.ENABLE;

    @C09CT("lightWeightReconnectMaxExecTime")
    public final int lightWeightReconnectMaxExecTime = LivePreCreateNextRoomPlayer.ENABLE;

    @C09CT("lightWeightReconnectRetryThreshold")
    public final int lightWeightReconnectRetryThreshold = 100;

    @C09CT("lw_reconnect_request_Iframe_thresh")
    public final int lwReconnectRequestIFrameThresh = 2000;
}
