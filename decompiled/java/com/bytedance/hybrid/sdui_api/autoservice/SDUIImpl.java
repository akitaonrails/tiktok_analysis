package com.bytedance.hybrid.sdui_api.autoservice;

import X.AbstractC1317190kNh;
import X.C04TD;
import X.C1315530kL1;
import X.C1317000kNO;
import X.C1490740otc;
import X.C1529360ptu;
import X.C1529370ptv;
import X.C1531020pwa;
import X.C1537480q70;
import X.C1539210q9n;
import X.C1539320q9y;
import X.C259800zU;
import X.EnumC1490770otf;
import X.InterfaceC1315110kKL;
import X.InterfaceC1529530puB;
import X.InterfaceC1531560pxS;
import X.InterfaceC1538750q93;
import X.InterfaceC1541990qEH;
import X.InterfaceC1542250qEh;
import com.bytedance.hybrid.common.autoservice.ISDUIAPI;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SDUIImpl implements ISDUIAPI {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0kL3] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.util.ArrayList] */
    @Override // com.bytedance.hybrid.common.autoservice.ISDUIAPI
    public void initSDUIKit() {
        InterfaceC1529530puB interfaceC1529530puB;
        C1531020pwa c1531020pwa;
        synchronized (C1539320q9y.LIZ) {
            C1529360ptu c1529360ptu = C1529360ptu.LIZ;
            C1529370ptv c1529370ptv = C1529360ptu.LIZIZ;
            if (c1529360ptu.LIZLLL(null)) {
                if (c1529370ptv == null || (interfaceC1529530puB = c1529370ptv.LJIIIZ) == null) {
                    C1490740otc.LIZ.LIZ("LynxConfig cannot be null, Please set value by HybridKit.setLynxConfig", EnumC1490770otf.E, "HybridSDUIKit");
                    return;
                }
                if ((interfaceC1529530puB instanceof C1531020pwa) && (c1531020pwa = (C1531020pwa) interfaceC1529530puB) != null) {
                    final C259800zU c259800zU = new C259800zU();
                    ?? arrayList = new ArrayList();
                    c259800zU.element = arrayList;
                    arrayList.addAll(c1531020pwa.LIZIZ);
                    C1315530kL1.LJ().LIZJ(c1531020pwa.LIZ, new InterfaceC1315110kKL() { // from class: X.0kL3
                        @Override // X.InterfaceC1315110kKL
                        public final List<C1313970kIV> create() {
                            return c259800zU.element;
                        }
                    });
                }
                C1539320q9y.LIZJ = true;
            }
        }
    }

    @Override // com.bytedance.hybrid.common.autoservice.ISDUIAPI
    public InterfaceC1538750q93<?> getSduiKitViewProvider() {
        return C1539320q9y.LIZIZ;
    }

    @Override // com.bytedance.hybrid.common.autoservice.ISDUIAPI
    public boolean sduiKitReady() {
        return C1539320q9y.LIZJ;
    }

    public static ISDUIAPI createISDUIAPIbyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ISDUIAPI.class, z);
        if (objLIZ != null) {
            return (ISDUIAPI) objLIZ;
        }
        if (C04TD.LJIL == null) {
            synchronized (ISDUIAPI.class) {
                if (C04TD.LJIL == null) {
                    C04TD.LJIL = new SDUIImpl();
                }
            }
        }
        return C04TD.LJIL;
    }

    @Override // com.bytedance.hybrid.common.autoservice.ISDUIAPI
    public boolean isSDUIView(InterfaceC1541990qEH interfaceC1541990qEH) {
        return interfaceC1541990qEH instanceof C1317000kNO;
    }

    @Override // com.bytedance.hybrid.common.autoservice.ISDUIAPI
    public void setHybridSchemaParams(InterfaceC1531560pxS interfaceC1531560pxS, HybridSchemaParam hybridSchemaParam) {
        boolean z = interfaceC1531560pxS instanceof C1539210q9n;
    }

    @Override // com.bytedance.hybrid.common.autoservice.ISDUIAPI
    public void setInitData(InterfaceC1531560pxS interfaceC1531560pxS, JSONObject jSONObject) {
        C1539210q9n c1539210q9n;
        if ((interfaceC1531560pxS instanceof C1539210q9n) && (c1539210q9n = (C1539210q9n) interfaceC1531560pxS) != null) {
            c1539210q9n.LJIIIIZZ = jSONObject;
        }
    }

    @Override // com.bytedance.hybrid.common.autoservice.ISDUIAPI
    public InterfaceC1531560pxS getOrCreateSDUIKitInitParams(C1537480q70 c1537480q70, String str, final InterfaceC1542250qEh interfaceC1542250qEh, final boolean z) {
        InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
        if (!(interfaceC1531560pxS instanceof C1539210q9n)) {
            C1539210q9n c1539210q9n = new C1539210q9n(UriProtector.parse(str));
            ((ArrayList) c1539210q9n.LIZLLL).add(new AbstractC1317190kNh() { // from class: X.0q9p
                @Override // X.AbstractC1317190kNh
                public final void LIZIZ() {
                }

                @Override // X.AbstractC1317190kNh
                public final void LIZLLL() {
                }

                @Override // X.AbstractC1317190kNh
                public final void LJ() {
                    InterfaceC1542250qEh interfaceC1542250qEh2 = interfaceC1542250qEh;
                    if (interfaceC1542250qEh2 != null) {
                        interfaceC1542250qEh2.LIZ(false);
                    }
                }

                @Override // X.AbstractC1317190kNh
                public final void LJFF(String str2) {
                    InterfaceC1542250qEh interfaceC1542250qEh2;
                    if (z && (interfaceC1542250qEh2 = interfaceC1542250qEh) != null) {
                        interfaceC1542250qEh2.LIZ(true);
                    }
                }
            });
            return c1539210q9n;
        }
        return interfaceC1531560pxS;
    }
}
