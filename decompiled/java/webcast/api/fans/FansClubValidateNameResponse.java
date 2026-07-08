package webcast.api.fans;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class FansClubValidateNameResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("fans_club_validate_name_status")
        public int fansClubValidateNameStatus;

        @C09CT("next_allow_time")
        public long nextAllowTime;
    }
}
