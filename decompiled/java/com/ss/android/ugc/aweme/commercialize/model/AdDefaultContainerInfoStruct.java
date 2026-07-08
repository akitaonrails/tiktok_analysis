package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdDefaultContainerInfoStruct implements Serializable {

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("button_icon_url")
    public final String buttonIconUrl;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("change_color_seconds")
    public final int changeColorSeconds;

    public AdDefaultContainerInfoStruct() {
        this("#", "", 0, "");
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getButtonIconUrl() {
        return this.buttonIconUrl;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final int getChangeColorSeconds() {
        return this.changeColorSeconds;
    }

    public AdDefaultContainerInfoStruct(String str, String str2, int i, String str3) {
        this.backgroundColor = str;
        this.buttonIconUrl = str2;
        this.changeColorSeconds = i;
        this.buttonText = str3;
    }
}
