package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class BottomBanner implements Serializable {

    @C09CT("app_icon")
    public final String appIcon;

    @C09CT("enable_open_system_browser")
    public final boolean enableOpenSystemBrowser;

    @C09CT("enable_redirect_live_banner")
    public final boolean enableRedirectLiveBanner;

    @C09CT("home_page_button_text")
    public final String homePageButtonText;

    @C09CT("home_page_cip_open_button_text")
    public final String homePageCipOpenButtonText;

    @C09CT("need_use_author_nickname")
    public final boolean needUseAuthorNickName;

    @C09CT("recommend_text")
    public final String recommendText;

    @C09CT("samsung_app_sell_point")
    public final SamsungAppSellPoint samsungAppSellPoint;

    @C09CT("show_button_color_seconds")
    public final int showButtonColorSeconds;

    @C09CT("version")
    public final int version;

    public BottomBanner() {
        this(2, 0, "", false, "", false, false, "", "", null);
    }

    public BottomBanner(int i, int i2, String str, boolean z, String str2, boolean z2, boolean z3, String str3, String str4, SamsungAppSellPoint samsungAppSellPoint) {
        this.showButtonColorSeconds = i;
        this.version = i2;
        this.recommendText = str;
        this.needUseAuthorNickName = z;
        this.homePageButtonText = str2;
        this.enableOpenSystemBrowser = z2;
        this.enableRedirectLiveBanner = z3;
        this.homePageCipOpenButtonText = str3;
        this.appIcon = str4;
        this.samsungAppSellPoint = samsungAppSellPoint;
    }
}
