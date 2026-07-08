package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveHostApplogOptConfig {
    public static final TypeAdapter ADAPTER = new LiveHostApplogOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("opt_time")
    public long optTime = 10000;

    @C09CT("white_list")
    public String[] whiteList = {"livesdk_go_live_push_stream", "livesdk_create_room", "livesdk_live_take", "livesdk_anchor_heartbeat", "livesdk_live_action"};

    @C09CT("max_count")
    public int maxCount = 20;

    @C09CT("max_interval")
    public int maxInterval = 250;
}
