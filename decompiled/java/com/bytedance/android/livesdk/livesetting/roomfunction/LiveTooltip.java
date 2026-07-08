package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public class LiveTooltip {
    public static final TypeAdapter ADAPTER;

    @C09CT("share_toolbar_behavior_delay")
    public int shareToolbarBehaviorDelay;

    @C09CT("tooltip_activity_check")
    public int tooltipActivityCheck;

    @C09CT("tooltip_alog_control")
    public int tooltipAlogControl;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveTooltip_OptTypeAdapter();
    }
}
