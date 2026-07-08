package com.bytedance.router.monitor.page;

/* JADX INFO: loaded from: classes36.dex */
public final class RouterJumpInfo {
    public final String destContainer;
    public final String destPage;
    public final String destType;
    public final Float detailPageHeight;
    public final String detailPageType;
    public final Float detailPageWidth;
    public final String jumpSkipInfo;
    public final RouterInfo routerInfo;
    public final String sourceContainer;
    public final String sourcePage;
    public final String sourcePosition;
    public final String sourceType;
    public final String systemMethod;
    public final String systemParams;

    public RouterJumpInfo() {
        this(null, null, "", "", null, null, "", "", null, "", "", null, null, null);
    }

    public RouterJumpInfo(RouterInfo routerInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Float f, Float f2) {
        this.routerInfo = routerInfo;
        this.sourceContainer = str;
        this.sourcePage = str2;
        this.sourceType = str3;
        this.sourcePosition = str4;
        this.destContainer = str5;
        this.destPage = str6;
        this.destType = str7;
        this.jumpSkipInfo = str8;
        this.systemMethod = str9;
        this.systemParams = str10;
        this.detailPageType = str11;
        this.detailPageWidth = f;
        this.detailPageHeight = f2;
    }
}
