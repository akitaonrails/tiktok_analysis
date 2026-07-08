package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class RealTimePerformancePageMessage extends AbstractC1136060ffY {

    @C09CT("guide_text_starling")
    public String guideTextStarling;

    @C09CT("type")
    public int type;

    public RealTimePerformancePageMessage() {
        super.type = C001A.REAL_TIME_PERFORMANCE_PAGE_MESSAGE;
        this.guideTextStarling = "";
    }
}
