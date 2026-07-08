package com.ss.android.ugc.aweme.component.profilecomponent;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleProfileNativeCardModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("button_text")
    public final String button;

    @C09CT("direct_open_page")
    public final Boolean directOpenPage;

    @C09CT("image")
    public final String image;

    @C09CT("sub_title")
    public final String subtitle;

    @C09CT("title")
    public final String title;

    public final String getButton() {
        return this.button;
    }

    public final Boolean getDirectOpenPage() {
        return this.directOpenPage;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public AnoleProfileNativeCardModel(Boolean bool, String str, String str2, String str3, String str4) {
        this.directOpenPage = bool;
        this.title = str;
        this.subtitle = str2;
        this.button = str3;
        this.image = str4;
    }
}
