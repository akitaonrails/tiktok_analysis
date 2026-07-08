package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdSuggestWordModel implements Serializable {

    @C09CT("search_ad_extra")
    public String searchAdExtra;

    @C09CT("bottom_bar_show_time")
    public Float showTime;

    public final String getSearchAdExtra() {
        return this.searchAdExtra;
    }

    public final Float getShowTime() {
        return this.showTime;
    }

    public final void setSearchAdExtra(String str) {
        this.searchAdExtra = str;
    }

    public final void setShowTime(Float f) {
        this.showTime = f;
    }
}
