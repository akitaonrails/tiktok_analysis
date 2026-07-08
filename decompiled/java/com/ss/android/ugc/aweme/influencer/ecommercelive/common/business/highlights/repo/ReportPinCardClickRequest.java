package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.repo;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class ReportPinCardClickRequest {

    @C09CT("event")
    public final HighLightReportEvent event;

    @C09CT("room_id")
    public final String roomId;

    @C09CT("type")
    public final int type;

    public ReportPinCardClickRequest(String str, int i, HighLightReportEvent highLightReportEvent) {
        this.roomId = str;
        this.type = i;
        this.event = highLightReportEvent;
    }
}
