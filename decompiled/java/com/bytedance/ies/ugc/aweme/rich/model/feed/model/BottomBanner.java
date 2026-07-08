package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class BottomBanner implements Serializable {

    @C09CT("enable_open_system_browser")
    public final boolean enableOpenSystemBrowser;

    @C09CT("home_page_button_text")
    public final String homePageButtonText;

    @C09CT("need_use_author_nickname")
    public final boolean needUseAuthorNickName;

    @C09CT("recommend_text")
    public final String recommendText;

    @C09CT("show_button_color_seconds")
    public final int showButtonColorSeconds;

    @C09CT("version")
    public final int version;

    public BottomBanner() {
        this(2, 0, "", false, "", false);
    }

    public BottomBanner(int i, int i2, String str, boolean z, String str2, boolean z2) {
        this.showButtonColorSeconds = i;
        this.version = i2;
        this.recommendText = str;
        this.needUseAuthorNickName = z;
        this.homePageButtonText = str2;
        this.enableOpenSystemBrowser = z2;
    }
}
