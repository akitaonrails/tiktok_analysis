package com.ss.android.ugc.aweme.commercialize.routeradapter.invoke;

import X.C01GW;
import X.C1012780cSi;
import X.C1017070cZd;
import X.C1021060cg4;
import X.C1022290ci3;
import X.C1025430cn7;
import X.C1025520cnG;
import X.C1025880cnq;
import X.C1026420coi;
import X.C1026430coj;
import X.C1026490cop;
import X.C1026500coq;
import X.C1026730cpD;
import X.C1026760cpG;
import X.C1026790cpJ;
import X.C1026800cpK;
import X.C1026840cpO;
import X.C1026910cpV;
import X.C1028920csk;
import X.C2188811AlT;
import X.C2268421Dqa;
import X.C452501pT;
import X.C993370bxP;
import X.InterfaceC1021920chS;
import X.InterfaceC1026740cpE;
import android.content.Context;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdShoppingService;
import com.ss.android.ugc.aweme.commercialize.model.AiAgentConfig;
import com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate;
import com.ss.android.ugc.aweme.commercialize.router.impl.CRouterManager;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterAdapterService;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterComponentClick;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterModelTransform;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.temporary.ICRouterTemporaryDelegate;
import com.ss.android.ugc.aweme.commercialize.utils.crouter.CRouterMainService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouterComponentClick implements ICRouterComponentClick {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(147));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(209));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(208));

    public final ICRouterModelTransform LJIIIIZZ() {
        return (ICRouterModelTransform) this.LIZJ.getValue();
    }

    public static void LJIIIZ(ICRouterManager iCRouterManager, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" addObserver()");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterComponentClick
    public final boolean LIZ(Context context, Aweme aweme, String str, int i) {
        C1026420coi c1026420coi = new C1026420coi(context, aweme, LJIIIIZZ().LIZ(C1017070cZd.LJJIJLIJ(aweme)));
        ICRouterManager iCRouterManager = (ICRouterManager) ServiceManager.get().getService(ICRouterManager.class);
        C1026500coq c1026500coq = new C1026500coq();
        c1026500coq.LJFF = C1026420coi.LIZLLL(c1026420coi, i, str);
        CRouterManager cRouterManagerLIZIZ = iCRouterManager.LIZIZ(new C1026490cop(c1026500coq), false);
        LJIIIZ(cRouterManagerLIZIZ, "cRouterUniversalClick");
        return cRouterManagerLIZIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterComponentClick
    public final boolean LIZIZ(Context context, Aweme aweme, String str, int i) {
        GMTBaseModel gMTBaseModelLIZ = LJIIIIZZ().LIZ(C1017070cZd.LJJIJLIJ(aweme));
        ICRouterManager iCRouterManager = (ICRouterManager) ServiceManager.get().getService(ICRouterManager.class);
        C1026500coq c1026500coq = new C1026500coq();
        C1026840cpO c1026840cpO = null;
        if (gMTBaseModelLIZ != null) {
            C1025880cnq c1025880cnqLIZJ = C1026420coi.LIZJ(context, aweme, aweme.getAwemeRawAd(), gMTBaseModelLIZ);
            C1025520cnG c1025520cnGLIZIZ = C1026420coi.LIZIZ(i, "", str);
            String webUrl = gMTBaseModelLIZ.getWebUrl();
            if (webUrl != null) {
                c1026840cpO = new C1026840cpO(c1025880cnqLIZJ, c1025520cnGLIZIZ, webUrl);
            }
        }
        c1026500coq.LJIIIIZZ = c1026840cpO;
        CRouterManager cRouterManagerLIZIZ = iCRouterManager.LIZIZ(new C1026490cop(c1026500coq), false);
        LJIIIZ(cRouterManagerLIZIZ, "cRouterApkFile");
        return cRouterManagerLIZIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterComponentClick
    public final void LIZJ(Aweme aweme, String str, Context context, InterfaceC1021920chS interfaceC1021920chS) {
        if (context == null) {
            return;
        }
        if (!((ICRouterAdapterService) this.LIZ.getValue()).LIZJ(2, aweme, str)) {
            ((ICRouterTemporaryDelegate) this.LIZIZ.getValue()).LIZ(context, aweme, interfaceC1021920chS);
        } else {
            ((ICRouterTemporaryDelegate) this.LIZIZ.getValue()).LIZIZ(context, aweme, interfaceC1021920chS);
            LJI(aweme, 2, context, null, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterComponentClick
    public final void LIZLLL(final Aweme aweme, String str, Context context, Function0 function0) {
        String aid;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        AwemeRawAd awemeRawAdLJJIJLIJ2;
        IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
        if (iAdSceneService != null && iAdSceneService.LIZIZ() != null) {
            C1022290ci3.LJFF(context, aweme);
        }
        if (!((ICRouterAdapterService) this.LIZ.getValue()).LIZJ(64, aweme, str)) {
            function0.invoke();
            return;
        }
        if (!C1017070cZd.LL(aweme)) {
            function0.invoke();
            return;
        }
        if (context != null) {
            ICRouterManager iCRouterManager = (ICRouterManager) ServiceManager.get().getService(ICRouterManager.class);
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            if (aweme != null) {
                awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
            } else {
                awemeRawAdLJJIJLIJ = null;
            }
            ICRouterModelTransform iCRouterModelTransformLJIIIIZZ = LJIIIIZZ();
            if (aweme != null) {
                awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme);
            } else {
                awemeRawAdLJJIJLIJ2 = null;
            }
            CRouterManager cRouterManagerLIZLLL = iCRouterManager.LIZLLL(new C1025880cnq(context, aid, aweme, awemeRawAdLJJIJLIJ, iCRouterModelTransformLJIIIIZZ.LIZ(awemeRawAdLJJIJLIJ2)), new C1025520cnG(null, "fyp_avatar", null, "photo", "draw_ad", 64, null, null, 965), null, true);
            cRouterManagerLIZLLL.LJ(new InterfaceC1026740cpE(this) { // from class: X.0ca0
                @Override // X.InterfaceC1026740cpE
                public final void LIZ(C1026830cpN c1026830cpN, C1026670cp7 c1026670cp7) {
                }

                @Override // X.InterfaceC1026740cpE
                public final void LIZJ(C1026830cpN c1026830cpN, C1026670cp7 c1026670cp7) {
                }

                @Override // X.InterfaceC1026740cpE
                public final void LIZLLL(C1026830cpN c1026830cpN) {
                }

                @Override // X.InterfaceC1026740cpE
                public final void LIZIZ(C1025880cnq c1025880cnq, C1025520cnG c1025520cnG) {
                    if (C0BTI.LIZ()) {
                        ((IFeedAdShoppingService) ServiceManager.get().getService(IFeedAdShoppingService.class)).getShoppingCoupon(aweme, null);
                    }
                }
            });
            cRouterManagerLIZLLL.LJI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterComponentClick
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(android.content.Context r18, com.ss.android.ugc.aweme.feed.model.Aweme r19, java.lang.String r20, int r21) {
        /*
            r17 = this;
            X.0coi r6 = new X.0coi
            com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterModelTransform r1 = r17.LJIIIIZZ()
            r2 = r19
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = X.C1017070cZd.LJJIJLIJ(r2)
            com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel r7 = r1.LIZ(r0)
            r10 = r18
            r6.<init>(r10, r2, r7)
            java.lang.Class<com.ss.android.ugc.aweme.web.service.IAdWebUtils> r11 = com.ss.android.ugc.aweme.web.service.IAdWebUtils.class
            r12 = 0
            r15 = 14
            r16 = 0
            r13 = r12
            r14 = r12
            java.lang.Object r3 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.web.service.IAdWebUtils r3 = (com.ss.android.ugc.aweme.web.service.IAdWebUtils) r3
            r8 = r21
            if (r3 == 0) goto L65
            java.lang.String r1 = X.C1026350cob.LIZIZ(r8)
            java.lang.String r0 = X.C1026350cob.LIZ(r8)
            boolean r1 = r3.Tu(r2, r1, r0)
            r0 = 1
            if (r1 != r0) goto L65
        L37:
            java.lang.String r5 = "cRouterUseSystemBrowserOpenWebPage"
            r9 = r20
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager> r0 = com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager.class
            java.lang.Object r2 = r1.getService(r0)
            com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager r2 = (com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager) r2
            X.0coq r1 = new X.0coq
            r1.<init>()
            X.0cp8 r0 = X.C1026420coi.LIZ(r6, r8, r9)
            r1.LJII = r0
            X.0cop r0 = new X.0cop
            r0.<init>(r1)
            com.ss.android.ugc.aweme.commercialize.router.impl.CRouterManager r0 = r2.LIZIZ(r0, r12)
            LJIIIZ(r0, r5)
            boolean r0 = r0.LJII()
            return r0
        L65:
            r0 = 0
            goto L37
        L67:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager> r0 = com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager.class
            java.lang.Object r4 = r1.getService(r0)
            com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager r4 = (com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager) r4
            X.0coq r3 = new X.0coq
            r3.<init>()
            if (r7 == 0) goto La9
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r2.getAwemeRawAd()
            X.0cnq r2 = X.C1026420coi.LIZJ(r10, r2, r0, r7)
            java.lang.String r0 = ""
            X.0cnG r1 = X.C1026420coi.LIZIZ(r8, r0, r9)
            com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate r0 = com.ss.android.ugc.aweme.commercialize.utils.crouter.CRouterMainService.LJJIIZ()
            X.0cpI r0 = X.C1026430coj.LIZIZ(r7, r2, r1, r0)
        L90:
            r3.LIZIZ = r0
            X.0cp8 r0 = X.C1026420coi.LIZ(r6, r8, r9)
            r3.LJII = r0
            X.0cop r0 = new X.0cop
            r0.<init>(r3)
            com.ss.android.ugc.aweme.commercialize.router.impl.CRouterManager r0 = r4.LIZIZ(r0, r12)
            LJIIIZ(r0, r5)
            boolean r0 = r0.LJII()
            return r0
        La9:
            r0 = 0
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.routeradapter.invoke.CRouterComponentClick.LJ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, int):boolean");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterComponentClick
    public final boolean LJFF(Context context, Aweme aweme, String str, int i) {
        C1026800cpK c1026800cpKLIZLLL;
        GMTBaseModel gMTBaseModelLIZ = LJIIIIZZ().LIZ(C1017070cZd.LJJIJLIJ(aweme));
        C1026420coi c1026420coi = new C1026420coi(context, aweme, gMTBaseModelLIZ);
        ICRouterManager iCRouterManager = (ICRouterManager) ServiceManager.get().getService(ICRouterManager.class);
        C1026500coq c1026500coq = new C1026500coq();
        C1026790cpJ c1026790cpJLIZJ = null;
        if (gMTBaseModelLIZ != null) {
            C1025880cnq c1025880cnqLIZJ = C1026420coi.LIZJ(context, aweme, aweme.getAwemeRawAd(), gMTBaseModelLIZ);
            C1025520cnG c1025520cnGLIZIZ = C1026420coi.LIZIZ(i, "", str);
            ICRouterMainDelegate iCRouterMainDelegateLJJIIZ = CRouterMainService.LJJIIZ();
            c1026800cpKLIZLLL = C1026430coj.LIZLLL(gMTBaseModelLIZ, c1025880cnqLIZJ, c1025520cnGLIZIZ, new C1026910cpV(iCRouterMainDelegateLJJIIZ.LJJI(), iCRouterMainDelegateLJJIIZ.LJIJJ(), iCRouterMainDelegateLJJIIZ.LJJIIJ()));
        } else {
            c1026800cpKLIZLLL = null;
        }
        c1026500coq.LJI = c1026800cpKLIZLLL;
        c1026500coq.LJFF = C1026420coi.LIZLLL(c1026420coi, i, str);
        if (gMTBaseModelLIZ != null) {
            c1026790cpJLIZJ = C1026430coj.LIZJ(gMTBaseModelLIZ, C1026420coi.LIZJ(context, aweme, aweme.getAwemeRawAd(), gMTBaseModelLIZ), C1026420coi.LIZIZ(i, "", str));
        }
        c1026500coq.LIZ = c1026790cpJLIZJ;
        CRouterManager cRouterManagerLIZIZ = iCRouterManager.LIZIZ(new C1026490cop(c1026500coq), false);
        LJIIIZ(cRouterManagerLIZIZ, "cRouterSchemaClick");
        return cRouterManagerLIZIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterComponentClick
    public final boolean LJII(Context context, Aweme aweme, String str, int i) {
        AwemeRawAd awemeRawAdLJJIJLIJ;
        AwemeRawAd awemeRawAd;
        ICRouterModelTransform iCRouterModelTransformLJIIIIZZ = LJIIIIZZ();
        C1026730cpD c1026730cpD = null;
        if (aweme != null) {
            awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
        } else {
            awemeRawAdLJJIJLIJ = null;
        }
        GMTBaseModel gMTBaseModelLIZ = iCRouterModelTransformLJIIIIZZ.LIZ(awemeRawAdLJJIJLIJ);
        ICRouterManager iCRouterManager = (ICRouterManager) ServiceManager.get().getService(ICRouterManager.class);
        C1026500coq c1026500coq = new C1026500coq();
        if (gMTBaseModelLIZ != null) {
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C1025880cnq c1025880cnqLIZJ = C1026420coi.LIZJ(context, aweme, awemeRawAd, gMTBaseModelLIZ);
            C1025520cnG c1025520cnGLIZIZ = C1026420coi.LIZIZ(i, "", str);
            String packageName = gMTBaseModelLIZ.getPackageName();
            if (packageName != null) {
                c1026730cpD = new C1026730cpD(c1025880cnqLIZJ, c1025520cnGLIZIZ, packageName, false);
            }
        }
        c1026500coq.LIZJ = c1026730cpD;
        CRouterManager cRouterManagerLIZIZ = iCRouterManager.LIZIZ(new C1026490cop(c1026500coq), false);
        LJIIIZ(cRouterManagerLIZIZ, "cRouterGooglePlay");
        return cRouterManagerLIZIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterComponentClick
    public final void LJI(final Aweme aweme, final int i, Context context, Map map, CRouterCoreModel cRouterCoreModel, AiAgentConfig aiAgentConfig) {
        String aid;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        C1028920csk c1028920csk;
        Boolean boolValueOf;
        String str;
        AwemeRawAd awemeRawAd;
        if (context == null) {
            return;
        }
        C1012780cSi c1012780cSiLIZIZ = ((ICRouterAdapterService) this.LIZ.getValue()).LIZIZ(aweme, i);
        AwemeRawAd awemeRawAdLJJIJLIJ2 = null;
        C1021060cg4 c1021060cg4 = new C1021060cg4(cRouterCoreModel, new C1025430cn7(null, null, null, aiAgentConfig, 95), 4);
        ICRouterManager iCRouterManager = (ICRouterManager) ServiceManager.get().getService(ICRouterManager.class);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        String btmPageId = null;
        if (aweme != null) {
            awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
        } else {
            awemeRawAdLJJIJLIJ = null;
        }
        ICRouterModelTransform iCRouterModelTransformLJIIIIZZ = LJIIIIZZ();
        if (aweme != null) {
            awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme);
        }
        C1025880cnq c1025880cnq = new C1025880cnq(context, aid, aweme, awemeRawAdLJJIJLIJ, iCRouterModelTransformLJIIIIZZ.LIZ(awemeRawAdLJJIJLIJ2));
        if (C993370bxP.LIZ[c1012780cSiLIZIZ.LIZLLL.ordinal()] == 1) {
            c1028920csk = C2268421Dqa.LIZ;
        } else {
            c1028920csk = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c1012780cSiLIZIZ.LJ);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C1026760cpG c1026760cpG = new C1026760cpG(linkedHashMap, c1028920csk);
        String str2 = c1012780cSiLIZIZ.LIZJ;
        String str3 = c1012780cSiLIZIZ.LIZIZ;
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        AwemeRawAd awemeRawAdLJJIJLIJ3 = C1017070cZd.LJJIJLIJ(aweme);
        if (awemeRawAdLJJIJLIJ3 != null) {
            boolValueOf = Boolean.valueOf(awemeRawAdLJJIJLIJ3.isSponsored());
        } else {
            boolValueOf = null;
        }
        if (i != 1) {
            if (i != 8) {
                if (i != 70) {
                    str = "c0.d0";
                } else {
                    str = "c56482.d0";
                }
            } else {
                str = "c04171.d75792";
            }
        } else {
            Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
            str = "c6053.d2507";
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            btmPageId = awemeRawAd.getBtmPageId();
        }
        CRouterManager cRouterManagerLIZLLL = iCRouterManager.LIZLLL(c1025880cnq, new C1025520cnG(null, "fyp_cta", c1026760cpG, str2, str3, i, null, btmSDK.createJumpSourceBtmToken(str, PageFinder.via(btmPageId), null), 577), c1021060cg4, true);
        cRouterManagerLIZLLL.LJ(new InterfaceC1026740cpE(this) { // from class: X.0cSf
            @Override // X.InterfaceC1026740cpE
            public final void LIZ(C1026830cpN c1026830cpN, C1026670cp7 c1026670cp7) {
            }

            @Override // X.InterfaceC1026740cpE
            public final void LIZJ(C1026830cpN c1026830cpN, C1026670cp7 c1026670cp7) {
            }

            @Override // X.InterfaceC1026740cpE
            public final void LIZLLL(C1026830cpN c1026830cpN) {
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0230  */
            /* JADX WARN: Removed duplicated region for block: B:192:0x03fe  */
            @Override // X.InterfaceC1026740cpE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(X.C1025880cnq r19, X.C1025520cnG r20) {
                /*
                    Method dump skipped, instruction units count: 1168
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1012750cSf.LIZIZ(X.0cnq, X.0cnG):void");
            }
        });
        cRouterManagerLIZLLL.LJI();
    }
}
