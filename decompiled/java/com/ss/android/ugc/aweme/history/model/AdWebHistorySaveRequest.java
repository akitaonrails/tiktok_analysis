package com.ss.android.ugc.aweme.history.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AdWebHistorySaveRequest implements Serializable {
    public static final int $stable = 8;

    @C09CT("count")
    public final Long count;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("iab_history_save_details")
    public final List<IabHistorySaveDetail> iabHistorySaveDetails;

    @C09CT("with_query")
    public final Boolean withQuery;

    public AdWebHistorySaveRequest() {
        this(null, null, null, null);
    }

    public AdWebHistorySaveRequest(List<IabHistorySaveDetail> list, Boolean bool, Long l, Long l2) {
        this.iabHistorySaveDetails = list;
        this.withQuery = bool;
        this.cursor = l;
        this.count = l2;
    }
}
