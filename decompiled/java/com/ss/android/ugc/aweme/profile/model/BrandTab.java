package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class BrandTab implements Serializable {

    @C09CT("industry_type")
    public int industryType;

    @C09CT("show_brand_tab")
    public boolean showBrandTab;

    @C09CT("title")
    public String title;

    public int getIndustryType() {
        return this.industryType;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isShowBrandTab() {
        return this.showBrandTab;
    }

    public void setIndustryType(int i) {
        this.industryType = i;
    }

    public void setShowBrandTab(boolean z) {
        this.showBrandTab = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
