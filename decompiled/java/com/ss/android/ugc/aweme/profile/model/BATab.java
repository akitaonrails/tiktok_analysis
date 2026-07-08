package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class BATab implements Serializable {

    @C09CT("show_biz_page_tab")
    public Boolean showBATab;

    public BATab() {
        this(Boolean.FALSE);
    }

    public final Boolean getShowBATab() {
        return this.showBATab;
    }

    public BATab(Boolean bool) {
        this.showBATab = bool;
    }

    public final void setShowBATab(Boolean bool) {
        this.showBATab = bool;
    }
}
