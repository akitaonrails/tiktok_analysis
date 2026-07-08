package tikcast.api.epiphron;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class UploadFeatureResponse {

    @C09CT("data")
    public UploadControl data;

    @C09CT("extra")
    public Extra extra;

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class UploadControl {

        @C09CT("new_duration")
        public long newDuration;

        /* JADX INFO: renamed from: switch, reason: not valid java name */
        @C09CT("switch")
        public boolean f92switch;
    }
}
