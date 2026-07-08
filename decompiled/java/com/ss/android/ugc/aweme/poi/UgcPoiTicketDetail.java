package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class UgcPoiTicketDetail implements Serializable {

    @C09CT("result_status")
    public final Integer resultStatus;

    @C09CT("ticket_id")
    public final String ticketId;

    public UgcPoiTicketDetail() {
        this(null, null);
    }

    public final PoiData trans2PoiData() {
        return new PoiData(null, null, 0.0d, 0.0d, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.resultStatus, null, null, null, null);
    }

    public UgcPoiTicketDetail(String str, Integer num) {
        this.ticketId = str;
        this.resultStatus = num;
    }
}
