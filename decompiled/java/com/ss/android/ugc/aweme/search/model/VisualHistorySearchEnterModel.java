package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import X.C0C8S;
import com.ss.android.ugc.aweme.search.visualsearch.history.model.VisualSearchHistoryDataItem;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class VisualHistorySearchEnterModel implements Serializable {

    @C09CT("history_item")
    public final VisualSearchHistoryDataItem historyItem;

    @C09CT("pre_entry_source")
    public final C0C8S preEntrySource;

    @C09CT("previous_enter_from_type")
    public final Integer previousEnterFromType;

    public VisualHistorySearchEnterModel() {
        this(null, null, null);
    }

    public VisualHistorySearchEnterModel(C0C8S c0c8s, Integer num, VisualSearchHistoryDataItem visualSearchHistoryDataItem) {
        this.preEntrySource = c0c8s;
        this.previousEnterFromType = num;
        this.historyItem = visualSearchHistoryDataItem;
    }
}
