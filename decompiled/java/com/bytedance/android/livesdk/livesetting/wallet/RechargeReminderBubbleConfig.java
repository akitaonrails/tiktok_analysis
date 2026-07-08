package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public class RechargeReminderBubbleConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("recharge_reminder_bubble_delay")
    public long bubbleShowDelaySec = 1;

    static {
        NormalGson.singleton();
        ADAPTER = new RechargeReminderBubbleConfig_OptTypeAdapter();
    }
}
