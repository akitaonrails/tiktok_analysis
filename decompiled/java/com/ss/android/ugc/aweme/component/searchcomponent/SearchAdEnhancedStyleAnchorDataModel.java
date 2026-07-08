package com.ss.android.ugc.aweme.component.searchcomponent;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchAdEnhancedStyleAnchorDataModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("anchor_style")
    public final int anchorStyle;

    @C09CT("desc")
    public final String desc;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("is_desc_primary")
    public final boolean isDescPrimary;

    @C09CT("title")
    public final String title;

    public SearchAdEnhancedStyleAnchorDataModel() {
        this(0, "", "", "", false);
    }

    public final int getAnchorStyle() {
        return this.anchorStyle;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isDescPrimary() {
        return this.isDescPrimary;
    }

    public SearchAdEnhancedStyleAnchorDataModel(int i, String str, String str2, String str3, boolean z) {
        this.anchorStyle = i;
        this.imageUrl = str;
        this.title = str2;
        this.desc = str3;
        this.isDescPrimary = z;
    }
}
