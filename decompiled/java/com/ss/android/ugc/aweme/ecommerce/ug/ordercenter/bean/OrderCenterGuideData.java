package com.ss.android.ugc.aweme.ecommerce.ug.ordercenter.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class OrderCenterGuideData {

    @C09CT("button_jump_schema")
    public final String buttonJumpSchema;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("description")
    public final String description;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("image_url_dark")
    public final String imageUrlDark;

    @C09CT("title")
    public final String title;

    public OrderCenterGuideData() {
        this(null, null, null, null, null, null);
    }

    public OrderCenterGuideData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.title = str;
        this.description = str2;
        this.imageUrl = str3;
        this.imageUrlDark = str4;
        this.buttonText = str5;
        this.buttonJumpSchema = str6;
    }
}
