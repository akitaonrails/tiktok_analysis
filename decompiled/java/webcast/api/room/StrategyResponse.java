package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class StrategyResponse {

    @C09CT("data")
    public List<StrategyData> data = new ArrayList();

    @C09CT("extra")
    public StrategyExtra extra;

    public static final class StrategyExtra {

        @C09CT("now")
        public long now;
    }
}
