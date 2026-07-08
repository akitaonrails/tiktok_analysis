package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.lynx.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class MusicSearchHistoryData implements Serializable {
    public static final int $stable = 8;

    @C09CT("historyList")
    public final List<MusicSearchHistoryItem> historyList;

    public MusicSearchHistoryData(List<MusicSearchHistoryItem> list) {
        this.historyList = list;
    }
}
