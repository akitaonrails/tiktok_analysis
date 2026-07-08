package tikcast.api.user_level;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class GetGradeGameplayBannerResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("end_time_ms")
        public long endTimeMs;

        @C09CT("has_upgraded")
        public boolean hasUpgraded;

        @C09CT("is_activated")
        public boolean isActivated;

        @C09CT("is_eligible")
        public boolean isEligible;

        @C09CT("num_gifts_left")
        public int numGiftsLeft;

        @C09CT("start_time_ms")
        public long startTimeMs;

        @C09CT("user_blast_status")
        public int userBlastStatus;

        @C09CT("user_grade")
        public UserGrade userGrade;
    }
}
