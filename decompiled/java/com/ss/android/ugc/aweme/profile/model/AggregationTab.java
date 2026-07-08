package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class AggregationTab implements Serializable {

    @C09CT("show_tab")
    public boolean showTab;

    @C09CT("title")
    public String title;

    public String getTitle() {
        return this.title;
    }

    public boolean isShowTab() {
        return this.showTab;
    }

    public void setShowTab(boolean z) {
        this.showTab = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
