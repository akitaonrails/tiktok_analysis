package com.ss.android.ugc.aweme.feed.features;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SessionUnconsumptionItemList {

    @C09CT("items")
    public final List<SessionUnconsumptionItem> items;

    @C09CT("timestamp")
    public final long timestamp;

    public SessionUnconsumptionItemList(List<SessionUnconsumptionItem> list, long j) {
        this.items = list;
        this.timestamp = j;
    }
}
