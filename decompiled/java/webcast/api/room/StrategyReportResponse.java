package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class StrategyReportResponse {

    @C09CT("data")
    public StrategyReportData data;

    @C09CT("extra")
    public StrategyReportExtra extra;

    public static final class StrategyReportExtra {

        @C09CT("now")
        public long now;
    }
}
