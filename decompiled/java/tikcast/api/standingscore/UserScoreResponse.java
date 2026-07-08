package tikcast.api.standingscore;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class UserScoreResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("alarm_end_time")
        public long alarmEndTime;

        @C09CT("alarm_type")
        public int alarmType;

        @C09CT("latest_updated_time")
        public long latestUpdatedTime;

        @C09CT("user_score")
        public long userScore;
    }
}
