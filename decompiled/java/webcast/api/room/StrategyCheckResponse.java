package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class StrategyCheckResponse {

    @C09CT("data")
    public StrategyCheckData data;

    @C09CT("extra")
    public StrategyCheckExtra extra;

    public static final class StrategyCheckExtra {

        @C09CT("now")
        public long now;
    }
}
