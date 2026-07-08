package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class StrategyV2Response {

    @C09CT("data")
    public StrategyContainer data;

    @C09CT("extra")
    public StrategyExtra extra;

    public static final class StrategyExtra {

        @C09CT("now")
        public long now;
    }
}
