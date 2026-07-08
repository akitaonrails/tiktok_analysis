package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class CommerceStickerInfo implements Serializable {

    @C09CT("commerce_sticker_id")
    public long commerceStickerId;

    @C09CT("icon_url")
    public UrlModel iconUrl;

    @C09CT("letters")
    public String letters;

    @C09CT("open_url")
    public String openUrl;

    @C09CT("web_url")
    public String webUrl;

    @C09CT("web_url_title")
    public String webUrlTitle;

    public boolean enable() {
        if (this.iconUrl == null || TextUtils.isEmpty(this.letters)) {
            return false;
        }
        return (TextUtils.isEmpty(this.webUrl) && TextUtils.isEmpty(this.openUrl)) ? false : true;
    }

    public long getCommerceStickerId() {
        return this.commerceStickerId;
    }

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getLetters() {
        return this.letters;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public String getWebUrlTitle() {
        return this.webUrlTitle;
    }

    public void setCommerceStickerId(long j) {
        this.commerceStickerId = j;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setLetters(String str) {
        this.letters = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public void setWebUrlTitle(String str) {
        this.webUrlTitle = str;
    }
}
