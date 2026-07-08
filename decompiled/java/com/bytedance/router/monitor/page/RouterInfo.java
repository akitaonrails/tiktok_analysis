package com.bytedance.router.monitor.page;

/* JADX INFO: loaded from: classes36.dex */
public final class RouterInfo {
    public final String routeId;
    public final String routerCaller;
    public String routerInterceptor;
    public final String routerMethod;
    public String routerParams;
    public int routerStatus;
    public final String traceId;
    public final String urlHost;
    public final String urlParams;
    public final String urlPath;
    public final String urlSchema;

    public final void setRouterInterceptor(String str) {
        this.routerInterceptor = str;
    }

    public final void setRouterParams(String str) {
        this.routerParams = str;
    }

    public final void setRouterStatus(int i) {
        this.routerStatus = i;
    }

    public RouterInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10) {
        this.traceId = str;
        this.routeId = str2;
        this.urlSchema = str3;
        this.urlHost = str4;
        this.urlPath = str5;
        this.urlParams = str6;
        this.routerMethod = str7;
        this.routerCaller = str8;
        this.routerParams = str9;
        this.routerStatus = i;
        this.routerInterceptor = str10;
    }
}
