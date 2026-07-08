package webcast.api.sub;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class DebugGetAnchorStatusResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_opt_in")
        public boolean hasOptIn;

        @C09CT("is_mocked")
        public boolean isMocked;
    }
}
