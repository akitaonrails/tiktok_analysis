package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PaidContentLiveShoppingMessage extends AbstractC1136060ffY {

    @C09CT("action_type")
    public int actionType;

    @C09CT("live_series_number")
    public int liveSeriesNumber;

    @C09CT("pop_series")
    public PopSeries popSeries;

    @C09CT("time_tag")
    public TimeTag timeTag;

    public PaidContentLiveShoppingMessage() {
        this.type = C001A.PAID_CONTENT_LIVE_SHOPPING_MESSAGE;
    }
}
