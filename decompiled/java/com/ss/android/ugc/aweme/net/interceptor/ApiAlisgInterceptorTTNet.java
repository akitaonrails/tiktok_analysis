package com.ss.android.ugc.aweme.net.interceptor;

import X.C0X52;
import X.C0XM1;
import X.C0XMB;
import X.C1494590ozp;
import X.C1697810uHb;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.net.interceptor.spi.IApiAlisgInterceptor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes24.dex */
public final class ApiAlisgInterceptorTTNet implements InterfaceC1904907d9 {
    public static final ArrayList<String> LL = C1697810uHb.LJ("/service/2/app_log/", "/api/ad/v1/setting/", "/api/ad/splash/", "/aweme/v1/ttregion/test/", "/aweme/v1/feed/", "/aweme/v2/feed/", "/aweme/v2/category/list/", "/aweme/v1/find/", "/aweme/v1/challenge/history/intervene/");
    public static final ArrayList<String> LLILLJJLI = C1697810uHb.LJ("IN", "NP", "PK", "LK");
    public static final ArrayList<String> LLILLL = C1697810uHb.LJ("US", "GB", "DE", "IT", "FR", "TR", "ES", "JP", "KR", "BR", "IQ");

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        String strLIZ;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request requestLIZ = c1494590ozp.LIZJ;
        IApiAlisgInterceptor iApiAlisgInterceptor = (IApiAlisgInterceptor) PluggableExtentionKt.pluggableSpiForReal(IApiAlisgInterceptor.class);
        if (iApiAlisgInterceptor != null && (strLIZ = iApiAlisgInterceptor.LIZ(requestLIZ.getPath(), requestLIZ.getUrl(), (String) C0XM1.LIZ().LJIIIZ.LIZ())) != null) {
            C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
            c0xmbNewBuilder.LIZJ(strLIZ);
            requestLIZ = c0xmbNewBuilder.LIZ();
        }
        return c1494590ozp.LIZ(requestLIZ);
    }
}
