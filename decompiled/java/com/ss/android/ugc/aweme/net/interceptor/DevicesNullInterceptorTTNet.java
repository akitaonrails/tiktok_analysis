package com.ss.android.ugc.aweme.net.interceptor;

import X.C0X52;
import X.C0XLP;
import X.C0XLQ;
import X.C0XMB;
import X.C1494590ozp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;

/* JADX INFO: loaded from: classes14.dex */
public class DevicesNullInterceptorTTNet implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(request.getUrl());
        C0XLP c0xlpLJIIJ = c0xlqLJIIL.LJIIJ();
        if (TextUtils.equals("", c0xlqLJIIL.LJIILLIIL("device_id"))) {
            c0xlpLJIIJ.LJIIIZ("device_id");
            c0xlqLJIIL = c0xlpLJIIJ.LIZLLL();
        }
        C0XMB c0xmbNewBuilder = request.newBuilder();
        c0xmbNewBuilder.LIZJ(c0xlqLJIIL.LJIIIIZZ);
        return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
    }
}
