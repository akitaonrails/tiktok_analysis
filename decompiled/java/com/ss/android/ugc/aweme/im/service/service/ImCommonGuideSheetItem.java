package com.ss.android.ugc.aweme.im.service.service;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class ImCommonGuideSheetItem {

    @C09CT("des")
    public final String des;

    @C09CT("icon_res")
    public final String iconRes;

    @C09CT("title")
    public final String title;

    public ImCommonGuideSheetItem() {
        this("", "", "");
    }

    public ImCommonGuideSheetItem(String str, String str2, String str3) {
        this.title = str;
        this.iconRes = str2;
        this.des = str3;
    }
}
