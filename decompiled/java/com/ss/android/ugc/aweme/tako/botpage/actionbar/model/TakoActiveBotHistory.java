package com.ss.android.ugc.aweme.tako.botpage.actionbar.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoActiveBotHistory {

    @C09CT("active_bot_items")
    public final List<TakoActiveBotItem> items;

    public TakoActiveBotHistory() {
        this(new ArrayList());
    }

    public TakoActiveBotHistory(List<TakoActiveBotItem> list) {
        this.items = list;
    }
}
