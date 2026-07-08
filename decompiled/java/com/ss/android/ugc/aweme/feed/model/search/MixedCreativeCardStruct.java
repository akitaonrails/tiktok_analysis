package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class MixedCreativeCardStruct implements Serializable {

    @C09CT("bottom_info_type")
    public final int bottomInfoType;

    @C09CT("show_desc")
    public final boolean showDesc;

    @C09CT("title")
    public final String title;

    @C09CT("view_more_text")
    public final String viewMoreText;

    @C09CT("display_card_type")
    public final int displayCardType = 1;
    public int creativeRank = -1;

    public final int getBottomInfoType() {
        return this.bottomInfoType;
    }

    public final int getCreativeRank() {
        return this.creativeRank;
    }

    public final int getDisplayCardType() {
        return this.displayCardType;
    }

    public final boolean getShowDesc() {
        return this.showDesc;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getViewMoreText() {
        return this.viewMoreText;
    }

    public final void setCreativeRank(int i) {
        this.creativeRank = i;
    }
}
