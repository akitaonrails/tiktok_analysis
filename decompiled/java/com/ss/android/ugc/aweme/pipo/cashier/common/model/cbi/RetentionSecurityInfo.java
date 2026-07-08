package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes27.dex */
public final class RetentionSecurityInfo {

    @C09CT("button_no_text")
    public final String buttonNoText;

    @C09CT("button_save_text")
    public final String buttonSaveText;

    @C09CT("content_items")
    public final ArrayList<SecurityInfoItem> contentItems;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("title")
    public final String title;

    public RetentionSecurityInfo() {
        this(null, null, null, null, null);
    }

    public RetentionSecurityInfo(String str, String str2, String str3, String str4, ArrayList<SecurityInfoItem> arrayList) {
        this.title = str;
        this.subTitle = str2;
        this.buttonSaveText = str3;
        this.buttonNoText = str4;
        this.contentItems = arrayList;
    }
}
