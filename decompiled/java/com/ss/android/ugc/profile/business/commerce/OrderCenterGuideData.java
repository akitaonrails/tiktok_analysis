package com.ss.android.ugc.profile.business.commerce;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class OrderCenterGuideData implements Serializable {
    public static final int $stable = 8;

    @C09CT("button_jump_schema")
    public String buttonJumpSchema;

    @C09CT("button_text")
    public String buttonText;

    @C09CT("description")
    public String description;

    @C09CT("image_url")
    public String imageUrl;

    @C09CT("image_url_dark")
    public String imageUrlDark;

    @C09CT("title")
    public String title;

    public final String getButtonJumpSchema() {
        return this.buttonJumpSchema;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getImageUrlDark() {
        return this.imageUrlDark;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setButtonJumpSchema(String str) {
        this.buttonJumpSchema = str;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setImageUrlDark(String str) {
        this.imageUrlDark = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
