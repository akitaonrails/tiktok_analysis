package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class FavoriteTab implements Serializable {

    @C09CT("sub_tab_name")
    public String subTabName;

    public FavoriteTab() {
        this(null);
    }

    public final String getSubTabName() {
        return this.subTabName;
    }

    public FavoriteTab(String str) {
        this.subTabName = str;
    }

    public final void setSubTabName(String str) {
        this.subTabName = str;
    }
}
