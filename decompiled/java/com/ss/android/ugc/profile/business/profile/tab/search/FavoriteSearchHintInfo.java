package com.ss.android.ugc.profile.business.profile.tab.search;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class FavoriteSearchHintInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("header_text")
    public String headerText;

    public final String getHeaderText() {
        return this.headerText;
    }

    public final void setHeaderText(String str) {
        this.headerText = str;
    }
}
