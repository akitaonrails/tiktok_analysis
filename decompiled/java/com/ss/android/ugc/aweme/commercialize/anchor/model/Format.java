package com.ss.android.ugc.aweme.commercialize.anchor.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class Format implements Serializable {

    @C09CT("description")
    public String description;

    @C09CT("style_template")
    public String styleTemplate;

    @C09CT("subtitle")
    public String subtitle;

    @C09CT("title")
    public String title;

    public final String getDescription() {
        return this.description;
    }

    public final String getStyleTemplate() {
        return this.styleTemplate;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setStyleTemplate(String str) {
        this.styleTemplate = str;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
