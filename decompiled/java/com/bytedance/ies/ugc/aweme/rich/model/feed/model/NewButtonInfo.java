package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class NewButtonInfo implements Serializable {

    @C09CT("app_data")
    public final AppRawData appData;

    @C09CT("apple_id")
    public final String appleId;

    @C09CT("button_background_color")
    public final String buttonBackgroundColor;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("image_url_list")
    public final AwemeUrl imageUrlList;

    @C09CT("show_text_link")
    public final Integer showTextLink;

    @C09CT("source")
    public final String source;

    @C09CT("style_type")
    public final Integer styleType;

    @C09CT("title")
    public final String title;

    public NewButtonInfo() {
        this(0, null, null, null, null, null, null, null, 0);
    }

    public NewButtonInfo(Integer num, String str, String str2, AppRawData appRawData, String str3, String str4, String str5, AwemeUrl awemeUrl, Integer num2) {
        this.styleType = num;
        this.buttonText = str;
        this.buttonBackgroundColor = str2;
        this.appData = appRawData;
        this.appleId = str3;
        this.source = str4;
        this.title = str5;
        this.imageUrlList = awemeUrl;
        this.showTextLink = num2;
    }
}
