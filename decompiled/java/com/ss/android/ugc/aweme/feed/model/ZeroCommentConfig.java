package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ZeroCommentConfig implements Serializable {

    @C09CT("zero_comment_button_text")
    public String buttonText;

    @C09CT("zero_comment_button_enable")
    public Boolean enabled;

    @C09CT("image_type")
    public Integer iconType;

    @C09CT("background_url")
    public UrlModel iconUrl;

    @C09CT("background_url_for_black")
    public UrlModel iconUrlDark;

    @C09CT("zero_comment_button_main_text")
    public String titleText;

    public ZeroCommentConfig() {
    }

    public ZeroCommentConfig(UrlModel urlModel, UrlModel urlModel2, String str, String str2, Boolean bool, Integer num) {
        this.iconUrl = urlModel;
        this.iconUrlDark = urlModel2;
        this.titleText = str;
        this.buttonText = str2;
        this.enabled = bool;
        this.iconType = num;
    }
}
