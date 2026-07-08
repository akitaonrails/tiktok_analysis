package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class DelayWidgetLoadConfig {
    public static final TypeAdapter ADAPTER = new DelayWidgetLoadConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("delay_time_gift_in_second")
    public int delayTimeGiftInSecond;

    @C09CT("delay_time_in_second")
    public int delayTimeInSecond;

    @C09CT("delay_time_like_in_second")
    public int delayTimeLikeInSecond;

    @C09CT("enable_delay")
    public boolean enableDelay;
}
