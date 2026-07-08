package com.ss.android.ugc.aweme.template.datamodel;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class TemplateBannerModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("background_url")
    public final String backgroundUrl;

    @C09CT("height")
    public final Integer height;

    @C09CT("icon")
    public final Integer icon;

    @C09CT("icon_color")
    public final String iconColor;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("text_color")
    public final String textColor;

    @C09CT("title")
    public final String title;

    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getIcon() {
        return this.icon;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getTitle() {
        return this.title;
    }
}
