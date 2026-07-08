package com.ss.android.ugc.aweme.net.partner;

import X.C0XM9;
import X.C1499330p7T;
import X.C1697810uHb;
import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.net.interceptor.spi.IApiAlisgInterceptor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes24.dex */
public final class ApiAlisgTTNetHandler implements NetworkPartner.RequestHandler {
    public static final ApiAlisgTTNetHandler LIZ = new ApiAlisgTTNetHandler();
    public static final ArrayList<String> LIZIZ = C1697810uHb.LJ("/api/ad/v1/setting/", "/api/ad/splash/", "/aweme/v1/ttregion/test/", "/aweme/v1/feed/", "/aweme/v2/feed/", "/aweme/v2/category/list/", "/aweme/v1/find/", "/aweme/v1/challenge/history/intervene/");

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.RequestHandler
    public final void LJIIIIZZ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        IApiAlisgInterceptor iApiAlisgInterceptor = (IApiAlisgInterceptor) PluggableExtentionKt.pluggableSpiForReal(IApiAlisgInterceptor.class);
        if (iApiAlisgInterceptor != null) {
            iApiAlisgInterceptor.LIZIZ(c0xm9);
        }
    }
}
