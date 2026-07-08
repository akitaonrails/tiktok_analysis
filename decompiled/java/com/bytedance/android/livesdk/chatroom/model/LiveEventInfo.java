package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class LiveEventInfo {

    @C09CT("disable_warn_tips")
    public boolean disableWarnTips;

    @C09CT("host")
    public EventHost host;

    @C09CT("live_room_registration_count")
    public String liveRoomRegistrationCount = "";

    @C09CT("non_performance_event")
    public NonPerformanceEvent nonPerformanceEvent;

    public static final class EventHost {

        @C09CT("max_non_performance_times")
        public long maxNonPerformanceTimes;

        @C09CT("non_performance_times")
        public long nonPerformanceTimes;

        @C09CT("suspend_time")
        public long suspendTime;
    }

    public static final class NonPerformanceEvent {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("id_str")
        public String idStr = "";

        @C09CT("is_late")
        public boolean isLate;
    }
}
