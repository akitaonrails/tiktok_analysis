package com.ss.android.ugc.aweme.im.service.service;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class ImCommonGuideSheetConfig {

    @C09CT("btn_txt")
    public final String btnTxt;

    @C09CT("first_row")
    public final ImCommonGuideSheetItem firstRow;

    @C09CT("img_res")
    public final String imgRes;

    @C09CT("main_title")
    public final String mainTitle;

    @C09CT("second_row")
    public final ImCommonGuideSheetItem secondRow;

    public ImCommonGuideSheetConfig() {
        this("", "", "", new ImCommonGuideSheetItem("", "", ""), new ImCommonGuideSheetItem("", "", ""));
    }

    public ImCommonGuideSheetConfig(String str, String str2, String str3, ImCommonGuideSheetItem imCommonGuideSheetItem, ImCommonGuideSheetItem imCommonGuideSheetItem2) {
        this.imgRes = str;
        this.mainTitle = str2;
        this.btnTxt = str3;
        this.firstRow = imCommonGuideSheetItem;
        this.secondRow = imCommonGuideSheetItem2;
    }
}
