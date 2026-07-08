package com.ss.android.ugc.aweme.component.searchcomponent;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchAdSingleCardNativeCTA implements Serializable {
    public static final int $stable = 0;

    @C09CT("default_text")
    public final String defaultText;

    @C09CT("icon")
    public final String icon;

    @C09CT("title")
    public final String title;

    public SearchAdSingleCardNativeCTA() {
        this("", null, "View More");
    }

    public final String getDefaultText() {
        return this.defaultText;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public SearchAdSingleCardNativeCTA(String str, String str2, String str3) {
        this.icon = str;
        this.title = str2;
        this.defaultText = str3;
    }
}
