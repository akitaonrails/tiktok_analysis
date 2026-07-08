package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GoalData {

    @C09CT("goal_progress")
    public Map<Long, Progress> goalProgress = new LinkedHashMap();

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    public static final class Progress {

        @C09CT("current_progress")
        public long currentProgress;

        @C09CT("expired_timestamp_in_ms")
        public long expiredTimestampInMs;

        @C09CT("target")
        public long target;
    }
}
