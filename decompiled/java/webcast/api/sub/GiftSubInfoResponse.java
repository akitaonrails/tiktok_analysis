package webcast.api.sub;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GiftSubInfoResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("education_info")
        public GiftSubEducation educationInfo;

        @C09CT("info")
        public GiftSubInfoData info;
    }
}
