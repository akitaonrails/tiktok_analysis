package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ForceFetchRecommendationsMessage extends AbstractC1136060ffY {

    @C09CT("fetch_within_ms")
    public long fetchWithinMs;

    @C09CT("reasons")
    public List<Long> reasons;

    @C09CT("strategy_context")
    public String strategyContext;

    public ForceFetchRecommendationsMessage() {
        this.type = C001A.FORCE_FETCH_RECOMMENDATIONS_MESSAGE;
        this.reasons = new ArrayList();
        this.strategyContext = "";
    }
}
