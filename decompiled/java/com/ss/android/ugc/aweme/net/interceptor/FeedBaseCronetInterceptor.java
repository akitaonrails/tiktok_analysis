package com.ss.android.ugc.aweme.net.interceptor;

import X.C0X52;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;

/* JADX INFO: loaded from: classes14.dex */
public class FeedBaseCronetInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
        Request request = interfaceC841770X0l.request();
        if (request != null && request.getUrl() != null) {
            String url = request.getUrl();
            if (!TextUtils.isEmpty(url) && (url.contains("/aweme/v1/feed/") || url.contains("/aweme/v2/feed/"))) {
                return interfaceC841770X0l.LIZ(interfaceC841770X0l.request());
            }
        }
        return interfaceC841770X0l.LIZ(interfaceC841770X0l.request());
    }
}
