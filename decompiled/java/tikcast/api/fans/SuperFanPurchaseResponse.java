package tikcast.api.fans;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class SuperFanPurchaseResponse {

    @C09CT("data")
    public CreateSuperFanContractResult data;

    @C09CT("extra")
    public ResponseExtra extra;

    public static final class ResponseExtra {

        @C09CT("now")
        public long now;
    }
}
