package com.ss.android.ugc.gamora.editor.audioservice.common.net;

import X.C0W8M;
import X.C0WOT;
import X.C0X52;
import X.C0XLP;
import X.C0XLQ;
import X.C0XMB;
import X.C1494590ozp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class SamiRequestInterceptor implements InterfaceC1904907d9 {
    public final Map<String, String> LL;

    public SamiRequestInterceptor(Map<String, String> map) {
        this.LL = map;
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        if (!C0W8M.LIZJ("SamiRequestInterceptor", c1494590ozp.LIZJ.getUrl())) {
            return c1494590ozp.LIZ(c1494590ozp.LIZJ);
        }
        Request requestLIZ = c1494590ozp.LIZJ;
        C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(requestLIZ.getUrl());
        if (c0xlqLJIIL != null) {
            C0XLP c0xlpLJIIJ = c0xlqLJIIL.LJIIJ();
            for (Map.Entry<String, String> entry : this.LL.entrySet()) {
                c0xlpLJIIJ.LJIIL(entry.getKey(), entry.getValue());
            }
            C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
            c0xmbNewBuilder.LIZJ(c0xlpLJIIJ.LIZLLL().LJIIIIZZ);
            requestLIZ = c0xmbNewBuilder.LIZ();
        }
        C0WOT.LIZ(requestLIZ, c1494590ozp.LIZJ, "SamiRequestInterceptor");
        return c1494590ozp.LIZ(requestLIZ);
    }
}
