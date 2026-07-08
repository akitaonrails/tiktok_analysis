package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import X.C0CHQ;
import X.C0X52;
import X.C0XLP;
import X.C0XLQ;
import X.C0XMB;
import X.C1494590ozp;
import X.C19221910Hx;
import X.C20186013yc;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;

/* JADX INFO: loaded from: classes31.dex */
public final class MvNetInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request requestLIZ = c1494590ozp.LIZJ;
        C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(requestLIZ.getUrl());
        if (c0xlqLJIIL != null) {
            C0XLP c0xlpLJIIJ = c0xlqLJIIL.LJIIJ();
            c0xlpLJIIJ.LIZJ("access_key", C0CHQ.LIZ().LJJJ().LIZLLL());
            C0CHQ.LIZ().getApplicationService();
            c0xlpLJIIJ.LIZJ("app_version", C19221910Hx.LIZIZ());
            c0xlpLJIIJ.LIZJ("app_language", ((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getAppLanguage());
            C0CHQ.LIZ().getRegionService();
            c0xlpLJIIJ.LIZJ("region", C20186013yc.LIZ());
            String str = c0xlpLJIIJ.LIZLLL().LJIIIIZZ;
            C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
            c0xmbNewBuilder.LIZJ(str);
            requestLIZ = c0xmbNewBuilder.LIZ();
        }
        return c1494590ozp.LIZ(requestLIZ);
    }
}
