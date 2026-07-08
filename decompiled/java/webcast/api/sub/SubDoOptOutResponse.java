package webcast.api.sub;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class SubDoOptOutResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("operation_status")
        public int operationStatus;

        @C09CT("opt_out_type")
        public int optOutType;
    }
}
