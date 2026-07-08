package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ResumeResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("channel_id")
        public long channelId;

        @C09CT("is_resume")
        public boolean isResume;

        @C09CT("total_position_count")
        public long totalPositionCount;

        @C09CT("rtc_ext_info")
        public String rtcExtInfo = "";

        @C09CT("users")
        public List<CohostListUser> users = new ArrayList();
    }
}
