package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class EnterpriseTab implements Serializable {

    @C09CT("show_tab_settings")
    public boolean showTabSettings;

    @C09CT("tab_link")
    public String tabLink;

    @C09CT("tab_type")
    public int tabType;

    @C09CT("title")
    public String title;

    public String getTabLink() {
        return this.tabLink;
    }

    public int getTabType() {
        return this.tabType;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isShowTabSettings() {
        return this.showTabSettings;
    }

    public void setShowTabSettings(boolean z) {
        this.showTabSettings = z;
    }

    public void setTabLink(String str) {
        this.tabLink = str;
    }

    public void setTabType(int i) {
        this.tabType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
