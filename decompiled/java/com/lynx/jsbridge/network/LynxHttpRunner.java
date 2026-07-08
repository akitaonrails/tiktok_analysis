package com.lynx.jsbridge.network;

import X.AbstractC1338850kwd;
import X.C1285920jZG;
import com.lynx.jsbridge.network.HttpResponse;
import com.lynx.react.bridge.Callback;
import com.lynx.tasm.service.ILynxHttpService;

/* JADX INFO: loaded from: classes21.dex */
public class LynxHttpRunner {
    public static boolean isHttpServiceRegistered() {
        return C1285920jZG.LIZJ().LIZ(ILynxHttpService.class) != null;
    }

    public static void request(HttpRequest httpRequest, final Callback callback) {
        ILynxHttpService iLynxHttpService = (ILynxHttpService) C1285920jZG.LIZJ().LIZ(ILynxHttpService.class);
        if (iLynxHttpService == null) {
            HttpResponse httpResponse = new HttpResponse();
            httpResponse.LIZ = 499;
            httpResponse.LIZIZ = "Lynx Http Service not registered";
            callback.invoke(httpResponse);
            return;
        }
        iLynxHttpService.request(httpRequest, new AbstractC1338850kwd() { // from class: X.0kwc
            @Override // X.AbstractC1338850kwd
            public final void LIZ(HttpResponse httpResponse2) {
                callback.invoke(httpResponse2);
            }
        });
    }
}
