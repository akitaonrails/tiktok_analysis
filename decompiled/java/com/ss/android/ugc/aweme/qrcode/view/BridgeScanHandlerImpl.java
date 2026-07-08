package com.ss.android.ugc.aweme.qrcode.view;

import X.C04TD;
import X.C19273310ah;
import X.InterfaceC19271510aP;
import com.ss.android.ugc.aweme.qrcode.handler.IBridgeScanHandler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes29.dex */
public final class BridgeScanHandlerImpl implements IBridgeScanHandler {
    public static IBridgeScanHandler LIZJ() {
        Object objLIZ = C04TD.LIZ(IBridgeScanHandler.class, false);
        if (objLIZ != null) {
            return (IBridgeScanHandler) objLIZ;
        }
        if (C04TD.n3 == null) {
            synchronized (IBridgeScanHandler.class) {
                if (C04TD.n3 == null) {
                    C04TD.n3 = new BridgeScanHandlerImpl();
                }
            }
        }
        return C04TD.n3;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.handler.IBridgeScanHandler
    public final void LIZ(InterfaceC19271510aP interfaceC19271510aP) {
        ((ArrayList) C19273310ah.LIZIZ).remove(interfaceC19271510aP);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.handler.IBridgeScanHandler
    public final void LIZIZ(InterfaceC19271510aP interfaceC19271510aP) {
        ((ArrayList) C19273310ah.LIZIZ).add(interfaceC19271510aP);
    }
}
