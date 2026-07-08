package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public class CoHostSuggestionToolTip {
    public static final TypeAdapter ADAPTER;

    @C09CT("tooltip_delay")
    public int tooltipDelay = 60;

    static {
        NormalGson.singleton();
        ADAPTER = new CoHostSuggestionToolTip_OptTypeAdapter();
    }
}
