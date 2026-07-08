package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class JudgeActivityPermissionResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("apply_type")
        public int applyType;

        @C09CT("hit_activity_rule")
        public boolean hitActivityRule;

        @C09CT("activity_url")
        public String activityUrl = "";

        @C09CT("activity_id")
        public String activityId = "";
    }
}
