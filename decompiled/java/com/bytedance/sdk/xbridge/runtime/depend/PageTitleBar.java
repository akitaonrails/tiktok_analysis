package com.bytedance.sdk.xbridge.runtime.depend;

/* JADX INFO: loaded from: classes29.dex */
public final class PageTitleBar {
    public final Integer disableNavBarBackButton;
    public final Boolean hideNavBar;
    public final String navBarColor;
    public final String navBtnType;
    public final String title;
    public final String titleColor;

    public PageTitleBar() {
        this(null, null, null, null, null, null);
    }

    public PageTitleBar(String str, String str2, String str3, Integer num, String str4, Boolean bool) {
        this.title = str;
        this.titleColor = str2;
        this.navBarColor = str3;
        this.disableNavBarBackButton = num;
        this.navBtnType = str4;
        this.hideNavBar = bool;
    }
}
