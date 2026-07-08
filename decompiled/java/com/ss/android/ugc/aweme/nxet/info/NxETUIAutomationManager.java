package com.ss.android.ugc.aweme.nxet.info;

import X.C1489040oqs;
import X.C1504880pGQ;
import X.C1847770yBT;
import X.C1847800yBW;
import X.C1848490yCd;
import X.C2097508Jp;
import X.C2188811AlT;
import X.InterfaceC1846590y9Z;
import X.InterfaceC1848550yCj;
import android.view.View;
import com.ss.android.ugc.aweme.nxet.event.EventDispatch;

/* JADX INFO: loaded from: classes28.dex */
public final class NxETUIAutomationManager implements InterfaceC1846590y9Z {
    public static final NxETUIAutomationManager INSTANCE = new NxETUIAutomationManager();
    public static boolean isInit;
    public static C1848490yCd uiAutomationInfo;

    private final void clearPageInfo() {
        uiAutomationInfo = null;
    }

    public final void init() {
        isInit = true;
        ((C1489040oqs) EventDispatch.LIZJ.getValue()).LIZ(this);
    }

    public final C1848490yCd getUiAutomationInfo() {
        return uiAutomationInfo;
    }

    public final boolean isInit() {
        return isInit;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0yCd] */
    @Override // X.InterfaceC1846590y9Z
    public void onVTreeChange(InterfaceC1848550yCj interfaceC1848550yCj) {
        C1847800yBW c1847800yBW;
        Object obj;
        Object obj2 = null;
        if ((interfaceC1848550yCj instanceof C1847800yBW) && (c1847800yBW = (C1847800yBW) interfaceC1848550yCj) != null) {
            C1847770yBT c1847770yBT = c1847800yBW.LIZJ;
            if (c1847770yBT == null) {
                clearPageInfo();
                return;
            }
            C2097508Jp params = c1847770yBT.getParams();
            c1847770yBT.LJI();
            View viewLJFF = c1847770yBT.LJFF();
            if (c1847770yBT.LIZ.LJIJI == null && viewLJFF != null) {
                C1504880pGQ.LIZ(viewLJFF, true);
            }
            if (params != null) {
                obj = params.get("s_url");
            } else {
                obj = null;
            }
            boolean z = obj instanceof String;
            if (params != null) {
                obj2 = params.get("nxet_page_name");
            }
            boolean z2 = obj2 instanceof String;
            uiAutomationInfo = new Object() { // from class: X.0yCd
            };
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Page info updated - ");
            sbLIZ.append(uiAutomationInfo);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        clearPageInfo();
    }
}
