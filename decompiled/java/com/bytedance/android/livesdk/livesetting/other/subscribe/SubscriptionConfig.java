package com.bytedance.android.livesdk.livesetting.other.subscribe;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class SubscriptionConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("subscription_community_enable")
    public int communityEnable;

    @C09CT("live_sub_emote_enable_edit")
    public int emoteEditEnable;

    @C09CT("live_sub_emote_enable_preview")
    public int emotePreviewEnable;

    static {
        NormalGson.singleton();
        ADAPTER = new SubscriptionConfig_OptTypeAdapter();
    }

    public SubscriptionConfig() {
        this(0, 0, 0);
    }

    public SubscriptionConfig(int i, int i2, int i3) {
        this.communityEnable = i;
        this.emoteEditEnable = i2;
        this.emotePreviewEnable = i3;
    }
}
