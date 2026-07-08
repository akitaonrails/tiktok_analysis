package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class SpecialSticker implements Serializable {

    @C09CT("icon_url")
    public UrlModel iconUrl;

    @C09CT("link")
    public String linkUrl;

    @C09CT("open_url")
    public String openUrl;

    @C09CT("sticker_id")
    public String stickerId;

    @C09CT("sticker_type")
    public int stickerType;

    @C09CT("title")
    public String title;

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getStickerType() {
        return this.stickerType;
    }

    public String getTitle() {
        return this.title;
    }

    public void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setStickerType(int i) {
        this.stickerType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
