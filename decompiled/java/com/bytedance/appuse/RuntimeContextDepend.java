package com.bytedance.appuse;

/* JADX INFO: loaded from: classes36.dex */
public interface RuntimeContextDepend {
    String getElement();

    String getPageInfo();

    Object getRetrofit(String str);

    void onInjectNetworkHook(Object obj);
}
