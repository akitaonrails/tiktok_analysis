package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CppSafetyEducationResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("exam_status")
        public int examStatus;
    }

    public static final class Extra {

        @C09CT("now")
        public long now;
    }
}
