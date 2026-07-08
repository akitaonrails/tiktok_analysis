package com.bytedance.android.livesdk.subscribe.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.TimerConfig;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;

/* JADX INFO: loaded from: classes29.dex */
public final class UpdateTimerResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("timer_config")
        public TimerConfig timerConfig;

        @C09CT("timer_detail")
        public TimerDetail timerDetail;
    }
}
