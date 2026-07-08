package com.ss.android.ugc.aweme.commercialize.router.impl;

import X.C01GW;
import X.C0PEM;
import X.C1021060cg4;
import X.C1025520cnG;
import X.C1025880cnq;
import X.C1026440cok;
import X.C1026450col;
import X.C1026490cop;
import X.C1026500coq;
import X.C1026550cov;
import X.C1026560cow;
import X.C1026730cpD;
import X.C1026840cpO;
import X.C1026850cpP;
import X.C1026900cpU;
import X.C1026910cpV;
import X.C13014057k;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23118094a;
import X.C23250099c;
import X.C452501pT;
import X.InterfaceC1025840cnm;
import X.InterfaceC1026740cpE;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterAppModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterPhoneModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterWebModel;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.invoke.ICRouter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouterManager implements ICRouterManager {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(207));

    public final ICRouter LJFF() {
        return (ICRouter) this.LIZ.getValue();
    }

    public final void LJI() {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZIZ(C2296808zG.LIZ(C2107308Nj.LIZ.plus(C23118094a.LIZ())), null, null, new C13014057k(this, null), 3);
    }

    public final boolean LJII() {
        return LJFF().LIZLLL();
    }

    public final CRouterManager LJ(InterfaceC1026740cpE interfaceC1026740cpE) {
        LJFF().LIZJ(interfaceC1026740cpE);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0cp6] */
    public final void LJIIIIZZ(final boolean z) {
        CRouter cRouterLIZJ = LJFF().LIZJ(new C1026550cov(z));
        cRouterLIZJ.LIZJ(new InterfaceC1026740cpE() { // from class: X.0cpF
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(379));

            @Override // X.InterfaceC1026740cpE
            public final void LIZJ(C1026830cpN c1026830cpN, C1026670cp7 c1026670cp7) {
            }

            @Override // X.InterfaceC1026740cpE
            public final void LIZLLL(C1026830cpN c1026830cpN) {
            }

            public static void LJ(C1025880cnq c1025880cnq, C1025520cnG c1025520cnG) {
                InterfaceC1028660csK<C443120HZe<String, String, String>> interfaceC1028660csK;
                if (c1025880cnq != null && c1025520cnG != null) {
                    C1026760cpG c1026760cpG = c1025520cnG.LIZJ;
                    GMTBaseModel gMTBaseModel = c1025880cnq.LJ;
                    Object obj = c1025880cnq.LIZLLL;
                    if (c1026760cpG != null && c1026760cpG.LIZIZ != null && gMTBaseModel != null && (interfaceC1028660csK = c1026760cpG.LIZIZ) != null) {
                        if (Intrinsics.LJFF(interfaceC1028660csK.getEventId().getSecond(), "realtime_click")) {
                            C1028730csR.LJIIIZ.getValue().LJIIIZ(obj);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[sendEvent] event = ");
                        sbLIZ.append(interfaceC1028660csK);
                        C2188811AlT.LIZIZ(sbLIZ);
                        new C1028730csR(new Object[0]).LJII(interfaceC1028660csK, new C1029040csw(gMTBaseModel, null, null, null, 14), new AwS382S0200000_16(c1026760cpG, c1025880cnq, 62));
                    }
                }
            }

            @Override // X.InterfaceC1026740cpE
            public final void LIZ(C1026830cpN c1026830cpN, C1026670cp7 c1026670cp7) {
                boolean z2;
                C1025880cnq c1025880cnqLIZIZ;
                C1025880cnq c1025880cnqLIZIZ2;
                String str;
                C1025520cnG c1025520cnGLIZ;
                C1025520cnG c1025520cnGLIZ2;
                C1025520cnG c1025520cnGLIZ3;
                AbstractC1026880cpS abstractC1026880cpS = c1026830cpN.LIZIZ;
                if (abstractC1026880cpS != null && (c1025520cnGLIZ3 = abstractC1026880cpS.LIZ()) != null && c1025520cnGLIZ3.LJII) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C1025520cnG c1025520cnGLIZ4 = null;
                str = null;
                String str2 = null;
                C1025520cnG c1025520cnGLIZ5 = null;
                if (z2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onRouterResult(), don't track here，refer = ");
                    AbstractC1026880cpS abstractC1026880cpS2 = c1026830cpN.LIZIZ;
                    if (abstractC1026880cpS2 != null && (c1025520cnGLIZ2 = abstractC1026880cpS2.LIZ()) != null) {
                        str = c1025520cnGLIZ2.LIZLLL;
                    } else {
                        str = null;
                    }
                    sbLIZ.append(str);
                    sbLIZ.append(",tag = ");
                    AbstractC1026880cpS abstractC1026880cpS3 = c1026830cpN.LIZIZ;
                    if (abstractC1026880cpS3 != null && (c1025520cnGLIZ = abstractC1026880cpS3.LIZ()) != null) {
                        str2 = c1025520cnGLIZ.LJ;
                    }
                    sbLIZ.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return;
                }
                if (!C0C64.LJIILLIIL().LJIIIZ(31744, "jump_sdk_should_optimize_click_event", true, false)) {
                    return;
                }
                if (c1026670cp7.LIZJ) {
                    AbstractC1026880cpS abstractC1026880cpS4 = c1026830cpN.LIZIZ;
                    if (abstractC1026880cpS4 != null) {
                        c1025880cnqLIZIZ2 = abstractC1026880cpS4.LIZIZ();
                    } else {
                        c1025880cnqLIZIZ2 = null;
                    }
                    AbstractC1026880cpS abstractC1026880cpS5 = c1026830cpN.LIZIZ;
                    if (abstractC1026880cpS5 != null) {
                        c1025520cnGLIZ5 = abstractC1026880cpS5.LIZ();
                    }
                    LJ(c1025880cnqLIZIZ2, c1025520cnGLIZ5);
                    return;
                }
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "jump_sdk_should_correct_click_event", true, false)) {
                    return;
                }
                AbstractC1026880cpS abstractC1026880cpS6 = c1026830cpN.LIZIZ;
                if (abstractC1026880cpS6 != null) {
                    c1025880cnqLIZIZ = abstractC1026880cpS6.LIZIZ();
                } else {
                    c1025880cnqLIZIZ = null;
                }
                AbstractC1026880cpS abstractC1026880cpS7 = c1026830cpN.LIZIZ;
                if (abstractC1026880cpS7 != null) {
                    c1025520cnGLIZ4 = abstractC1026880cpS7.LIZ();
                }
                LJ(c1025880cnqLIZIZ, c1025520cnGLIZ4);
            }

            @Override // X.InterfaceC1026740cpE
            public final void LIZIZ(C1025880cnq c1025880cnq, C1025520cnG c1025520cnG) {
                if (c1025520cnG != null && c1025520cnG.LJII) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onRouterStart(), don't track here，refer = ");
                    sbLIZ.append(c1025520cnG.LIZLLL);
                    sbLIZ.append(",tag = ");
                    sbLIZ.append(c1025520cnG.LJ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return;
                }
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "jump_sdk_should_optimize_click_event", true, false)) {
                    return;
                }
                LJ(c1025880cnq, c1025520cnG);
            }
        });
        cRouterLIZJ.LIZJ(new C1026560cow());
        cRouterLIZJ.LJ(new InterfaceC1025840cnm(z) { // from class: X.0cp6
            public final boolean LIZ;

            {
                this.LIZ = z;
            }

            @Override // X.InterfaceC1025840cnm
            public final void LIZ(AbstractC1026640cp4 abstractC1026640cp4, AbstractC1026880cpS abstractC1026880cpS) {
                if (this.LIZ) {
                    ICRouterAdapterDelegate iCRouterAdapterDelegate = (ICRouterAdapterDelegate) PluggableExtentionKt.pluggableSpi$default(ICRouterAdapterDelegate.class, false, false, false, 14, null);
                    if (iCRouterAdapterDelegate != null && iCRouterAdapterDelegate.LJIIJJI(abstractC1026880cpS)) {
                        return;
                    }
                    C1440005kM.LIZ(new C1026770cpH(abstractC1026640cp4));
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager
    public final CRouterManager LIZIZ(C1026490cop c1026490cop, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initCustomRouter, pageToProfile:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        LJIIIIZZ(z);
        LJFF().LIZIZ(c1026490cop);
        return this;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager
    public final CRouterManager LIZ(C1025880cnq c1025880cnq, C1025520cnG c1025520cnG, C1021060cg4 c1021060cg4) {
        C1026840cpO c1026840cpO;
        C1026730cpD c1026730cpD;
        C1026490cop c1026490cop;
        String phoneNumber;
        String appID;
        String url;
        boolean z = false;
        CRouter cRouterLIZJ = LJFF().LIZJ(new C1026550cov(false));
        cRouterLIZJ.LIZJ(new C1026560cow());
        C1026450col c1026450col = new C1026450col();
        CRouterCoreModel cRouterCoreModel = c1021060cg4.LIZ;
        if (cRouterCoreModel == null) {
            c1026490cop = new C1026490cop(new C1026500coq());
        } else {
            C1026910cpV c1026910cpVLIZ = c1026450col.LIZ();
            C1026500coq c1026500coq = new C1026500coq();
            c1026500coq.LJIIJJI = c1026450col.LIZIZ().LJJIIJ(c1025880cnq, c1025520cnG);
            c1026500coq.LIZ = C1026440cok.LIZIZ(cRouterCoreModel, c1025880cnq, c1025520cnG);
            c1026500coq.LJI = C1026440cok.LIZJ(cRouterCoreModel, c1025880cnq, c1025520cnG, c1026910cpVLIZ);
            c1026500coq.LJFF = C1026440cok.LIZLLL(cRouterCoreModel, c1025880cnq, c1025520cnG, c1026910cpVLIZ);
            c1026500coq.LIZIZ = C1026440cok.LIZ(cRouterCoreModel, c1025880cnq, c1025520cnG, c1026450col.LIZJ());
            C1026850cpP c1026850cpP = null;
            c1026500coq.LJIIJ = c1026450col.LIZIZ().LJ(c1025880cnq, c1025520cnG, c1021060cg4, null);
            CRouterWebModel webModel = cRouterCoreModel.getWebModel();
            if (webModel != null && (url = webModel.getUrl()) != null) {
                c1026840cpO = new C1026840cpO(c1025880cnq, c1025520cnG, url);
            } else {
                c1026840cpO = null;
            }
            c1026500coq.LJIIIIZZ = c1026840cpO;
            c1026500coq.LJIIIZ = c1026450col.LIZIZ().LJJIJIIJIL(c1025880cnq, c1025520cnG, c1021060cg4, null);
            CRouterAppModel appModel = cRouterCoreModel.getAppModel();
            if (appModel != null && (appID = appModel.getAppID()) != null) {
                c1026730cpD = new C1026730cpD(c1025880cnq, c1025520cnG, appID, z);
            } else {
                c1026730cpD = null;
            }
            c1026500coq.LIZJ = c1026730cpD;
            c1026500coq.LIZLLL = new C1026900cpU(c1025880cnq, c1025520cnG);
            CRouterPhoneModel phoneModel = cRouterCoreModel.getPhoneModel();
            if (phoneModel != null && (phoneNumber = phoneModel.getPhoneNumber()) != null) {
                c1026850cpP = new C1026850cpP(c1025880cnq, c1025520cnG, phoneNumber);
            }
            c1026500coq.LJ = c1026850cpP;
            c1026490cop = new C1026490cop(c1026500coq);
        }
        cRouterLIZJ.LIZ = c1026490cop;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02e2 A[PHI: r1
      0x02e2: PHI (r1v23 X.0cnF) = (r1v6 X.0cnF), (r1v24 X.0cnF) binds: [B:15:0x004a, B:13:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0236  */
    @Override // com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.commercialize.router.impl.CRouterManager LIZLLL(X.C1025880cnq r19, X.C1025520cnG r20, X.C1021060cg4 r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.router.impl.CRouterManager.LIZLLL(X.0cnq, X.0cnG, X.0cg4, boolean):com.ss.android.ugc.aweme.commercialize.router.impl.CRouterManager");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c1  */
    @Override // com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.commercialize.router.impl.CRouterManager LIZJ(X.C1025880cnq r25, X.C1025520cnG r26, X.C1026920cpW r27, final kotlin.jvm.functions.Function1 r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.router.impl.CRouterManager.LIZJ(X.0cnq, X.0cnG, X.0cpW, kotlin.jvm.functions.Function1, boolean):com.ss.android.ugc.aweme.commercialize.router.impl.CRouterManager");
    }
}
