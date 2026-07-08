package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class JudgeActivityPermissionV2Response {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("apply_type")
        public int applyType;

        @C09CT("config")
        public PermissionApplyForUIConfig config;

        @C09CT("hit_activity_rule")
        public boolean hitActivityRule;

        @C09CT("is_country_ban")
        public boolean isCountryBan;

        @C09CT("quota_limit")
        public boolean quotaLimit;

        @C09CT("activity_url")
        public String activityUrl = "";

        @C09CT("activity_id")
        public String activityId = "";

        @C09CT("user_id")
        public String userId = "";

        @C09CT("country")
        public String country = "";

        @C09CT("user_type")
        public String userType = "";
    }
}
