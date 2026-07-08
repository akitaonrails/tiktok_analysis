package tikcast.api.wallet.tiktok;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class UpdateABSStatusResponse {

    @C09CT("data")
    public ABSData data;

    public static final class ABSData {

        @C09CT("is_abs_on")
        public boolean isAbsOn;

        @C09CT("is_agreed")
        public boolean isAgreed;

        @C09CT("success")
        public boolean success;
    }
}
