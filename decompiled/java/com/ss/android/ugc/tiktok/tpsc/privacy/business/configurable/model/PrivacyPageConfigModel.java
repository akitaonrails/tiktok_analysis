package com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacyPageConfigModel {

    @C09CT("contents")
    public final List<PrivacySectionConfigModel> contents;

    @C09CT("page_category")
    public final int pageCategory;

    @C09CT("page_tag")
    public final String pageTag;

    @C09CT("page_title")
    public final String pageTitle;

    @C09CT("page_style")
    public final int pageType;

    public PrivacyPageConfigModel() {
        this(null, null, 0, 0, null);
    }

    public PrivacyPageConfigModel(String str, String str2, int i, int i2, List<PrivacySectionConfigModel> list) {
        this.pageTitle = str;
        this.pageTag = str2;
        this.pageType = i;
        this.pageCategory = i2;
        this.contents = list;
    }
}
