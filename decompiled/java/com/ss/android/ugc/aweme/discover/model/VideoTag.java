package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class VideoTag implements Serializable {

    @C09CT("background_color")
    public String backgroundColor;

    @C09CT("en_title")
    public String englishTitle;

    @C09CT("font_color")
    public String fontColor;

    @C09CT("url")
    public UrlModel iconUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public int id;

    @C09CT("opacity")
    public int opacity;

    @C09CT("left_right_padding")
    public int padding = 4;

    @C09CT("title")
    public String title;

    @C09CT("type")
    public String type;

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getEnglishTitle() {
        return this.englishTitle;
    }

    public final String getFontColor() {
        return this.fontColor;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.id;
    }

    public final int getOpacity() {
        return this.opacity;
    }

    public final int getPadding() {
        return this.padding;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setEnglishTitle(String str) {
        this.englishTitle = str;
    }

    public final void setFontColor(String str) {
        this.fontColor = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setOpacity(int i) {
        this.opacity = i;
    }

    public final void setPadding(int i) {
        this.padding = i;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
