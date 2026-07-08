package com.ss.android.ugc.aweme.ecommerce.network;

import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C1976807ok;
import X.C1AQS;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: loaded from: classes4.dex */
public final class SaasParamsRequestHandler implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Uri.Builder builderBuildUpon = UriProtector.parse(c1494590ozp.LIZJ.getUrl()).buildUpon();
        C1976807ok.LIZIZ(builderBuildUpon, C1AQS.LIZ());
        String string = builderBuildUpon.build().toString();
        C0XMB c0xmbNewBuilder = c1494590ozp.LIZJ.newBuilder();
        c0xmbNewBuilder.LIZJ(string);
        return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
    }
}
