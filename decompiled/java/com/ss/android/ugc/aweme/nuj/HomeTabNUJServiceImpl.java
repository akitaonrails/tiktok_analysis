package com.ss.android.ugc.aweme.nuj;

import X.C0C5P;
import X.C0CTN;
import X.C0CTO;
import X.C0CUA;
import X.C0CUI;
import X.C1514430pVp;
import X.C1720106oR;
import X.C19EG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C279440AxK;
import X.C311800CKc;
import X.InterfaceC304970BxP;
import X.InterfaceC308010C5n;
import X.InterfaceC308020C5o;
import Y.ARunnableS84S0000000_4;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.spi.HomeTabNUJService;
import java.util.HashSet;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes5.dex */
public final class HomeTabNUJServiceImpl implements HomeTabNUJService {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0BxP] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0CTO] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0C5P] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.0CTN] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // com.ss.android.ugc.aweme.spi.HomeTabNUJService
    public final void LIZ() {
        C0CUA c0cua = C0CUA.LIZ;
        boolean z = !C0CUA.LIZJ();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init registered: ");
        sbLIZ.append(C0CUA.LJIIJ);
        sbLIZ.append(", isNujEnd: ");
        sbLIZ.append(z);
        C1720106oR.LJI("HomeTabNujLaunchHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (C0CUA.LJIIJ || z) {
            return;
        }
        C0CUA.LJIIJ = true;
        EventBus.LIZLLL().LJIJJ(c0cua);
        ?? LIZJ = C0C5P.LIZJ();
        C0CTO c0cto = C0CUA.LJIIIIZZ;
        ?? r1 = c0cto;
        if (c0cto == null) {
            ?? r12 = new InterfaceC304970BxP() { // from class: X.0CTO
                @Override // X.InterfaceC304970BxP
                public final void LIZ() {
                    C0CUA c0cua2 = C0CUA.LIZ;
                    boolean zLIZJ = C0CUA.LIZJ();
                    boolean zLIZ = C307020C1s.LIZ();
                    int i2 = C2187451AjH.LIZ;
                    C1720106oR.LJI("HomeTabNujLaunchHelper", "ConfigurationSaveCallback save, hitTabNUJExp: " + zLIZ + ", inNuj: " + zLIZJ);
                    if (zLIZJ && zLIZ) {
                        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                        TabConfig tabConfig = C0CXN.LIZIZ;
                        TabConfig tabConfig2 = (TabConfig) c0c64LJIILLIIL.LJJIIJ(false, "tab_fcp_config_v2", 31744, TabConfig.class, tabConfig, 2);
                        if (tabConfig2 != null) {
                            tabConfig = tabConfig2;
                        }
                        C1720106oR.LJI("HomeTabNujLaunchHelper", "ConfigurationCallbacks: tab_fcp_config_v2 onChanged: " + tabConfig);
                        C0CUA.LJ(tabConfig);
                    }
                }
            };
            C0CUA.LJIIIIZZ = r12;
            r1 = r12;
        }
        LIZJ.LJIIJJI("tab_fcp_config_v2", r1);
        C0C5P c0c5pLIZJ = C0C5P.LIZJ();
        C0CTN c0ctn = C0CUA.LJIIIZ;
        ?? r2 = c0ctn;
        if (c0ctn == null) {
            ?? r22 = new InterfaceC308020C5o() { // from class: X.0CTN
                @Override // X.InterfaceC308020C5o
                public final void LIZ(C307980C5k c307980C5k) {
                    C0CUA c0cua2 = C0CUA.LIZ;
                    boolean zLIZJ = C0CUA.LIZJ();
                    boolean zLIZ = C307020C1s.LIZ();
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ConfigurationSaveCallback save, hitTabNUJExp: ");
                    sbLIZ2.append(zLIZ);
                    sbLIZ2.append(", inNuj: ");
                    sbLIZ2.append(zLIZJ);
                    C1720106oR.LJI("HomeTabNujLaunchHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    if (zLIZJ) {
                        if (zLIZ) {
                            C23250099c.LIZLLL(C0CUA.LJII, null, null, new C0CTQ(c307980C5k, null), 3);
                        }
                    } else {
                        C1720106oR.LJI("HomeTabNujLaunchHelper", "ConfigurationSaveCallback save but nuj finished");
                        C0CUA.LIZLLL(false, C0CTS.LLILZIL);
                    }
                }
            };
            C0CUA.LJIIIZ = r22;
            r2 = r22;
        }
        synchronized (c0c5pLIZJ.LJI) {
            try {
                ((HashSet) c0c5pLIZJ.LJI).add(r2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C0CUA.LIZJ = System.currentTimeMillis();
        C1720106oR.LJI("HomeTabNujLaunchHelper", "init finished");
    }

    @Override // com.ss.android.ugc.aweme.spi.HomeTabNUJService
    public final void LIZJ() {
        if (C311800CKc.LIZIZ || !((Boolean) C279440AxK.LIZ.getValue()).booleanValue()) {
            return;
        }
        C0C5P c0c5pLIZJ = C0C5P.LIZJ();
        c0c5pLIZJ.LJFF.add(new InterfaceC308010C5n() { // from class: X.0CB2
            @Override // X.InterfaceC308010C5n
            public final void LIZ(C0C7N c0c7n, C0C7W c0c7w) {
                if (((Boolean) C279440AxK.LIZ.getValue()).booleanValue() && c0c7n == C0C7N.HIGH_PRIORITY_DATA && c0c7w == C0C7W.CHUNK_ALL_UPDATE) {
                    C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS84S0000000_4(this, 8));
                }
            }

            @Override // X.InterfaceC308010C5n
            public final void LIZIZ(C0C7N c0c7n, C0C7W c0c7w) {
                if (((Boolean) C279440AxK.LIZ.getValue()).booleanValue() && c0c7n == C0C7N.HIGH_PRIORITY_DATA && c0c7w == C0C7W.CHUNK_ALL_UPDATE) {
                    C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS84S0000000_4(this, 9));
                }
            }
        });
        C311800CKc.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.spi.HomeTabNUJService
    public final void LIZIZ(C19EG c19eg) {
        if (!C1514430pVp.LIZLLL().booleanValue()) {
            C0CUI.LIZ.getClass();
            C0CUI.LIZIZ(c19eg);
            return;
        }
        C0CUI c0cui = C0CUI.LIZ;
        c0cui.getClass();
        if (!C0CUI.LIZJ) {
            return;
        }
        c0cui.getClass();
        C0CUI.LIZIZ(c19eg);
    }
}
