package tikcast.api.fans;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class PolingSuperFanContractStatusResponse {

    @C09CT("data")
    public PolingSuperFanContractStatusResult data;

    @C09CT("extra")
    public SuperFanResponseExtra extra;

    public static final class SuperFanResponseExtra {

        @C09CT("now")
        public long now;
    }
}
