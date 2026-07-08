package com.bytedance.android.livesdk.subscribe.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.TimerConfig;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;

/* JADX INFO: loaded from: classes29.dex */
public final class GetSubTimerDetailResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public ResponseExtra extra;

    public static final class Data {

        @C09CT("timer_config")
        public TimerConfig timerConfig;

        @C09CT("timer_detail")
        public TimerDetail timerDetail;
    }

    public static final class ResponseExtra {

        @C09CT("now")
        public long now;
    }
}
