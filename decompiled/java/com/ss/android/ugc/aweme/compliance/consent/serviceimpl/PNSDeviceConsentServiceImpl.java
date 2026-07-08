package com.ss.android.ugc.aweme.compliance.consent.serviceimpl;

import X.AbstractC1387200mCc;
import X.AbstractC826920WcE;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C052B;
import X.C0XQ7;
import X.C100C;
import X.C10WS;
import X.C1198904mZ;
import X.C11JF;
import X.C13LE;
import X.C15O7;
import X.C1876860ywO;
import X.C1906580ziK;
import X.C1913760ztu;
import X.C1914860zvg;
import X.C1915290zwN;
import X.C1915720zx4;
import X.C1915790zxB;
import X.C1915840zxG;
import X.C1915990zxV;
import X.C1916000zxW;
import X.C1916010zxX;
import X.C1916020zxY;
import X.C1916190zxp;
import X.C19241810Po;
import X.C19315910hZ;
import X.C19719912Dl;
import X.C19EG;
import X.C20660315sv;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2344009Gk;
import X.C294520BgY;
import X.C344480Dew;
import X.C452501pT;
import X.C683770Qrv;
import X.C844470XAv;
import X.EnumC1876780ywG;
import X.EnumC1915930zxP;
import X.EnumC1915980zxU;
import X.EnumC683800Qry;
import X.InterfaceC1519050pdH;
import X.InterfaceC1915190zwD;
import X.InterfaceC1915880zxK;
import X.InterfaceC1916060zxc;
import X.InterfaceC1916090zxf;
import Y.ACallableS420S0100000_13;
import Y.ARunnableS112S0100000_12;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountMainService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PNSDeviceConsentServiceImpl;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSDeviceConsentServiceImpl implements IPNSDeviceConsentService {
    public PthreadTimer LJII;
    public C11JF LJIIIIZZ;
    public C11JF LJIIIZ;
    public C11JF LJIIJ;
    public String LJIIL;
    public boolean LJIILIIL;
    public volatile boolean LJIIZILJ;
    public final C01GW LIZ = C452501pT.LIZIZ(new C1198904mZ());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1916000zxW());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1915290zwN());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1914860zvg(this));
    public final IAccountService LJ = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
    public final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());
    public final EnumC683800Qry LJI = EnumC683800Qry.DEVICE_CONSENT;
    public final List<InterfaceC1916060zxc> LJIIJJI = new ArrayList();
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new C1915990zxV());
    public final C01GW LJIILL = C452501pT.LIZIZ(new C1913760ztu());
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new C1916010zxX());
    public final ARunnableS112S0100000_12 LJIJ = new ARunnableS112S0100000_12(this, 158);

    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[PHI: r1 r4
      0x006d: PHI (r1v7 java.lang.String) = (r1v6 java.lang.String), (r1v9 java.lang.String) binds: [B:43:0x0098, B:28:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x006d: PHI (r4v5 java.lang.String) = (r4v3 java.lang.String), (r4v6 java.lang.String) binds: [B:43:0x0098, B:28:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r6 = this;
            java.util.List<X.0zxc> r0 = r6.LJIIJJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            X.0zxc r0 = (X.InterfaceC1916060zxc) r0
            r0.LIZ()
            goto L8
        L18:
            X.0zxP r5 = r6.LJIIL()
            int[] r1 = X.C1915960zxS.LIZ
            int r0 = r5.ordinal()
            r2 = r1[r0]
            r0 = 1
            if (r2 == r0) goto Lab
            r0 = 2
            java.lang.String r1 = "v1"
            if (r2 == r0) goto La3
            r0 = 3
            if (r2 == r0) goto L9b
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r0 = "row_dnu_consent_box"
            r2.<init>(r0, r1)
        L36:
            java.lang.Object r4 = r2.getFirst()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r2.getSecond()
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = X.C294580Bge.LIZ()
            if (r0 == 0) goto L6e
            com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService r1 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJIIIZ()
            X.0zxP r0 = X.EnumC1915930zxP.KR
            if (r5 != r0) goto L7d
            if (r1 == 0) goto L6e
            com.ss.android.ugc.aweme.compliance.api.services.consent.model.KRConsentConfig r2 = r1.LJIIJ()
            if (r2 == 0) goto L6e
            java.lang.String r1 = r2.business
            if (r1 == 0) goto L63
            int r0 = r1.length()
            if (r0 <= 0) goto L63
            r4 = r1
        L63:
            java.lang.String r1 = r2.policyVersion
            if (r1 == 0) goto L6e
            int r0 = r1.length()
            if (r0 <= 0) goto L6e
        L6d:
            r3 = r1
        L6e:
            X.100C r0 = X.C100C.LIZ
            X.0ztm r1 = r0.LIZIZ()
            X.0zts r0 = new X.0zts
            r0.<init>(r4, r3)
            r1.LIZ(r0)
            return
        L7d:
            if (r1 == 0) goto L6e
            com.ss.android.ugc.aweme.compliance.api.services.consent.model.ConsentBoxConfig r2 = r1.LJI()
            if (r2 == 0) goto L6e
            java.lang.String r1 = r2.business
            if (r1 == 0) goto L90
            int r0 = r1.length()
            if (r0 <= 0) goto L90
            r4 = r1
        L90:
            java.lang.String r1 = r2.policyVersion
            if (r1 == 0) goto L6e
            int r0 = r1.length()
            if (r0 <= 0) goto L6e
            goto L6d
        L9b:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r0 = "us_dnu_consent_box"
            r2.<init>(r0, r1)
            goto L36
        La3:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r0 = "eu_dnu_consent_box"
            r2.<init>(r0, r1)
            goto L36
        Lab:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "kr_dnu_consent_box"
            java.lang.String r0 = "v1803"
            r2.<init>(r1, r0)
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PNSDeviceConsentServiceImpl.LIZIZ():void");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final void LJIIJ() {
        PopupManager.LJIIJ(C344480Dew.class, C20660315sv.LL);
        PopupManager.LIZJ(C344480Dew.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final EnumC1915930zxP LJIIL() {
        String storeRegionUpperCase;
        IAccountService iAccountService = this.LJ;
        if (iAccountService == null || (storeRegionUpperCase = iAccountService.getStoreRegionUpperCase()) == null) {
            storeRegionUpperCase = "";
        }
        if (Intrinsics.LJFF(storeRegionUpperCase, "")) {
            return EnumC1915930zxP.UNKNOWN;
        }
        if (Intrinsics.LJFF(storeRegionUpperCase, "US")) {
            return EnumC1915930zxP.US;
        }
        C19315910hZ.LIZ.getClass();
        return C19315910hZ.LJIIIIZZ.contains(storeRegionUpperCase) ? EnumC1915930zxP.EU : Intrinsics.LJFF(storeRegionUpperCase, "KR") ? EnumC1915930zxP.KR : EnumC1915930zxP.ROW;
    }

    public final void LJIILL() {
        PthreadTimer pthreadTimer = this.LJII;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        this.LJII = null;
        C11JF c11jf = this.LJIIIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJIIIZ = null;
        this.LJIIZILJ = false;
        C11JF c11jf2 = this.LJIIJ;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        C11JF c11jf3 = this.LJIIIIZZ;
        if (c11jf3 != null) {
            c11jf3.dispose();
        }
    }

    public final void LJIILLIIL() {
        InterfaceC1915190zwD interfaceC1915190zwD = new InterfaceC1915190zwD() { // from class: X.0zxN
            @Override // X.InterfaceC1915190zwD
            public final void LIZ() {
            }

            @Override // X.InterfaceC1915190zwD
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1915190zwD
            public final void onError(String str) {
            }

            @Override // X.InterfaceC1915190zwD
            public final void LIZIZ() {
                PNSDeviceConsentServiceImpl pNSDeviceConsentServiceImpl = this.LIZ;
                Iterator<InterfaceC1916060zxc> it2 = pNSDeviceConsentServiceImpl.LJIIJJI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(pNSDeviceConsentServiceImpl.LJIIL);
                }
            }

            @Override // X.InterfaceC1915190zwD
            public final void LJ() {
                PNSDeviceConsentServiceImpl pNSDeviceConsentServiceImpl = this.LIZ;
                pNSDeviceConsentServiceImpl.getClass();
                boolean zLJI = MethodIDManager.LJI(196660);
                pNSDeviceConsentServiceImpl.LJIILL();
                Iterator it2 = ((ArrayList) pNSDeviceConsentServiceImpl.LJIIJJI).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1916060zxc) it2.next()).LIZ();
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }

            @Override // X.InterfaceC1915190zwD
            public final void LIZLLL(EnumC1876780ywG enumC1876780ywG, EnumC1876780ywG enumC1876780ywG2) {
                if (enumC1876780ywG2 == EnumC1876780ywG.APPROVE) {
                    this.LIZ.LJIJ().storeBoolean("have_passed_consent", true);
                    this.LIZ.LJIJ().storeBoolean("is_consent_accepted", true);
                    this.LIZ.LJIJ().storeInt("consent_reason", EnumC1915980zxU.CONSENT_BOX.getLegacyReasonValue());
                }
            }
        };
        IPolicyNoticeService iPolicyNoticeService = (IPolicyNoticeService) PluggableExtentionKt.pluggableSpi$default(IPolicyNoticeService.class, false, false, false, 14, null);
        if (iPolicyNoticeService != null) {
            iPolicyNoticeService.LIZ();
        }
        String key = this.LJI.getKey();
        EnumC1915980zxU enumC1915980zxU = EnumC1915980zxU.CONSENT_BOX;
        CollectConsentParam collectConsentParam = new CollectConsentParam(key, enumC1915980zxU.getFlow(), enumC1915980zxU.getFlow(), null, false);
        if (C294520BgY.LIZ()) {
            IPNSConsentCollectorService iPNSConsentCollectorService = (IPNSConsentCollectorService) this.LIZLLL.getValue();
            if (iPNSConsentCollectorService != null) {
                C844470XAv.LIZ.getClass();
                iPNSConsentCollectorService.LIZIZ(C844470XAv.LIZ(), new C683770Qrv(collectConsentParam), interfaceC1915190zwD);
                return;
            }
            return;
        }
        IPNSConsentCollectorService iPNSConsentCollectorService2 = (IPNSConsentCollectorService) this.LIZLLL.getValue();
        if (iPNSConsentCollectorService2 != null) {
            C844470XAv.LIZ.getClass();
            iPNSConsentCollectorService2.LJFF(C844470XAv.LIZ(), collectConsentParam, null, interfaceC1915190zwD);
        }
    }

    public final C1915720zx4 LJIIZILJ() {
        return (C1915720zx4) this.LIZJ.getValue();
    }

    public final Keva LJIJ() {
        return (Keva) this.LIZIZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void init() {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PNSDeviceConsentServiceImpl.init():void");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final boolean LIZJ() {
        boolean z = LJIJ().getBoolean("user_logged_in_atleast_once", false);
        C19241810Po.LIZ.getClass();
        boolean zLIZIZ = C19241810Po.LIZIZ();
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        return Intrinsics.LJFF(iAccountService != null ? iAccountService.getStoreRegionUpperCase() : null, "HU") && zLIZIZ && !z;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final boolean LIZLLL() {
        return LJIJ().getBoolean("consent_once_shown", false);
    }

    public static void LJIJJLI(String str) {
        String path;
        if (str != null && str.length() != 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "consent_skip");
            Uri uri = UriProtector.parse(str);
            if (u.LJJIIJZLJL(str, "aweme://webview?", false)) {
                path = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
            } else {
                path = uri.getPath();
            }
            if (path != null && path.length() != 0) {
                str = path;
            }
            c2344009Gk.LJIIIIZZ("description", str);
            C20684815ws.LJIILLIIL("pns_analysis_event", c2344009Gk.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final void LIZ(InterfaceC1916060zxc interfaceC1916060zxc) {
        ((ArrayList) this.LJIIJJI).add(interfaceC1916060zxc);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final void LJ(boolean z) {
        LJIJ().storeBoolean("user_logged_in_atleast_once", z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final void LJI(boolean z) {
        Object obj;
        InterfaceC1916090zxf interfaceC1916090zxf;
        String name;
        UniversalPopup universalPopup;
        String str;
        C19719912Dl c19719912DlLIZLLL;
        InterfaceC1916090zxf interfaceC1916090zxf2;
        String name2;
        String name3;
        Activity activityLIZIZ;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            Serializable serializable = null;
            if (!LJII(null)) {
                AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
                if (abstractC1387200mCcLJFF != null) {
                    obj = abstractC1387200mCcLJFF.LIZ;
                } else {
                    obj = null;
                }
                if (!(obj instanceof Fragment)) {
                    obj = null;
                }
                String str2 = "";
                if (z) {
                    LJIIJ();
                    this.LJIIZILJ = false;
                    this.LJIIL = null;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("forced: ");
                    if (abstractC1387200mCcLJFF == null || (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) == null || (name2 = activityLIZIZ.getClass().getName()) == null) {
                        name2 = "";
                    }
                    sbLIZ.append(name2);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("forced: ");
                    if (obj != null && (name3 = obj.getClass().getName()) != null) {
                        str2 = name3;
                    }
                    sbLIZ2.append(str2);
                    LJIJJ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
                    LJIILLIIL();
                    return;
                }
                Activity activityLJFF = C2214201BlK.LJFF();
                if (activityLJFF == 0) {
                    return;
                }
                if (activityLJFF instanceof InterfaceC1916090zxf) {
                    interfaceC1916090zxf = (InterfaceC1916090zxf) activityLJFF;
                } else {
                    interfaceC1916090zxf = null;
                }
                if (interfaceC1916090zxf != null && !interfaceC1916090zxf.getCanCollectConsent()) {
                    if (this.LJIIZILJ) {
                        LJIIJ();
                        this.LJIIZILJ = false;
                        return;
                    }
                    return;
                }
                if (activityLJFF.getIntent().getBooleanExtra("skip_consent", false)) {
                    LJIJJLI("intent_skip_consent");
                    return;
                }
                String strValueOf = String.valueOf(activityLJFF.getIntent().getData());
                if (u.LJJIIJZLJL(strValueOf, "aweme://webview?", false) && !LJIJI(strValueOf)) {
                    LJIJJLI(strValueOf);
                    return;
                }
                boolean z2 = activityLJFF instanceof SparkActivity;
                if (z2) {
                    SparkActivity sparkActivity = (SparkActivity) activityLJFF;
                    if (!LJIJI(sparkActivity.LLLLLZL())) {
                        LJIJJLI(sparkActivity.LLLLLZL());
                        return;
                    }
                }
                if (activityLJFF instanceof C19EG) {
                    for (Fragment fragment : ((C19EG) activityLJFF).getSupportFragmentManager().LJJLIIIJL()) {
                        if (fragment instanceof UniversalPopupUI) {
                            Bundle arguments = fragment.getArguments();
                            if (arguments != null) {
                                serializable = arguments.getSerializable("universal_popup");
                            }
                            if ((serializable instanceof UniversalPopup) && (universalPopup = (UniversalPopup) serializable) != null && (str = universalPopup.business) != null) {
                                str2 = str;
                            }
                            if (!Intrinsics.LJFF(str2, "eu_dnu_consent_box") && !Intrinsics.LJFF(str2, "row_dnu_consent_box") && !Intrinsics.LJFF(str2, "kr_dnu_consent_box") && !Intrinsics.LJFF(str2, "us_dnu_consent_box")) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("UniversalPopupUI business_name: ");
                                sbLIZ3.append(str2);
                                LJIJJLI(C2188811AlT.LIZIZ(sbLIZ3));
                                return;
                            }
                            return;
                        }
                        if (fragment instanceof C10WS) {
                            LJIJJLI("PNSAgeGateBaseFragment");
                            return;
                        }
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(fragment.getClass());
                        IAccountMainService iAccountMainService = (IAccountMainService) PluggableExtentionKt.pluggableSpi$default(IAccountMainService.class, false, false, false, 14, null);
                        if (iAccountMainService != null) {
                            c19719912DlLIZLLL = iAccountMainService.LIZLLL();
                        } else {
                            c19719912DlLIZLLL = null;
                        }
                        if (Intrinsics.LJFF(c19719912DlLIZ, c19719912DlLIZLLL)) {
                            LJIJJLI("SAFPNSAgeGateBaseFragment");
                            return;
                        } else if ((fragment instanceof InterfaceC1916090zxf) && (interfaceC1916090zxf2 = (InterfaceC1916090zxf) fragment) != null && !interfaceC1916090zxf2.getCanCollectConsent()) {
                            LJIJJLI("canNotCollectConsentFragment");
                            return;
                        }
                    }
                }
                this.LJIIL = activityLJFF.getLocalClassName();
                Iterator it2 = ((HashSet) this.LJIILJJIL.getValue()).iterator();
                while (it2.hasNext()) {
                    if (u.LJIJI(this.LJIIL, (String) it2.next(), false)) {
                        LJIJJLI(this.LJIIL);
                        return;
                    }
                }
                if (this.LJIIZILJ) {
                    LJIIJ();
                    this.LJIIZILJ = false;
                }
                LJIILLIIL();
                if (z2) {
                    strValueOf = ((SparkActivity) activityLJFF).LLLLLZL();
                } else if (!(activityLJFF instanceof CrossPlatformActivity)) {
                    strValueOf = this.LJIIL;
                }
                this.LJIIZILJ = true;
                if (obj != null && (name = obj.getClass().getName()) != null) {
                    str2 = name;
                }
                LJIJJ(strValueOf, str2);
                return;
            }
        }
        LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final boolean LJII(Map<String, String> map) {
        EnumC1876780ywG enumC1876780ywGLIZ;
        EnumC1876780ywG enumC1876780ywG = EnumC1876780ywG.APPROVE;
        if (LJIIZILJ() != null) {
            enumC1876780ywGLIZ = C1915720zx4.LIZ(this.LJI.getKey(), map);
        } else {
            enumC1876780ywGLIZ = null;
        }
        if (enumC1876780ywG == enumC1876780ywGLIZ) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final void LJIIIIZZ(String str) {
        boolean zLJI = MethodIDManager.LJI(137299);
        C1915720zx4 c1915720zx4LJIIZILJ = LJIIZILJ();
        if (c1915720zx4LJIIZILJ != null) {
            InterfaceC1915880zxK interfaceC1915880zxK = new InterfaceC1915880zxK() { // from class: X.0zxa
                @Override // X.InterfaceC1915880zxK
                public final void LIZ(int i, String str2) {
                }

                @Override // X.InterfaceC1915880zxK
                public final void onFailure(int i, String str2) {
                }
            };
            C1915790zxB c1915790zxB = (C1915790zxB) C1915720zx4.LJIIJ.getValue();
            c1915790zxB.getClass();
            C100C.LIZ.LIZIZ().LIZ(new C1915840zxG(c1915720zx4LJIIZILJ, interfaceC1915880zxK, c1915790zxB, str));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final void LJIIIZ(AbstractC826920WcE abstractC826920WcE) {
        if (LJIIZILJ() != null) {
            C15O7.LIZJ(new ACallableS420S0100000_13(abstractC826920WcE, 14));
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final void LJIIJJI(final AbstractC826920WcE abstractC826920WcE) {
        if (LJIIZILJ() != null) {
            C15O7.LIZJ(new Callable() { // from class: X.0WcF
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Boolean boolValueOf;
                    C1C7U.LIZ("PNSConsentClient@ddc1.registerConsentRecordsUpdateListener$1");
                    InterfaceC1915870zxJ interfaceC1915870zxJ = abstractC826920WcE;
                    synchronized (C1915720zx4.class) {
                        try {
                            boolValueOf = Boolean.valueOf(C1915720zx4.LJ.add(interfaceC1915870zxJ));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    C1C7U.LIZIZ("PNSConsentClient@ddc1.registerConsentRecordsUpdateListener$1");
                    return boolValueOf;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final void LJIILJJIL(C1916190zxp c1916190zxp) {
        ((ArrayList) this.LJIIJJI).remove(c1916190zxp);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJI(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = X.C703302op.LIZ(r5)
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            X.01GW r0 = r4.LJIILL
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L25
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L25
        L1a:
            r1 = 0
        L1b:
            r0 = 0
            boolean r0 = r4.LJII(r0)
            if (r0 != 0) goto L3d
            if (r1 != 0) goto L3d
            return r3
        L25:
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = kotlin.text.a0.LJJIIZI(r5, r0, r2)
            if (r0 == 0) goto L29
            r1 = 1
            goto L1b
        L3d:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PNSDeviceConsentServiceImpl.LJIJI(java.lang.String):boolean");
    }

    public static void LJIJJ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "consent_popup");
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("description", str);
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("fragment", str2);
        C20684815ws.LJIILLIIL("pns_analysis_event", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final void LJFF(String str, boolean z) {
        C1915720zx4 c1915720zx4LJIIZILJ = LJIIZILJ();
        if (c1915720zx4LJIIZILJ != null) {
            ((InterfaceC1519050pdH) ((C1916020zxY) C1915720zx4.LJIIIIZZ.getValue()).LIZ.getValue()).remove("CACHED_CONSENT_RECORDS_V2");
            C1915720zx4.LJFF.set(true);
            if (z) {
                C1915790zxB c1915790zxB = (C1915790zxB) C1915720zx4.LJIIJ.getValue();
                c1915790zxB.getClass();
                C100C.LIZ.LIZIZ().LIZ(new C1915840zxG(c1915720zx4LJIIZILJ, null, c1915790zxB, str));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService
    public final void LJIILIIL(EnumC1876780ywG enumC1876780ywG, EnumC1915980zxU enumC1915980zxU, String str, InterfaceC1915880zxK interfaceC1915880zxK) {
        boolean z;
        boolean zLJII = LJII(null);
        Keva kevaLJIJ = LJIJ();
        EnumC1876780ywG enumC1876780ywG2 = EnumC1876780ywG.APPROVE;
        boolean z2 = false;
        if (enumC1876780ywG2 == enumC1876780ywG) {
            z = true;
        } else {
            z = false;
        }
        kevaLJIJ.storeBoolean("have_passed_consent", z);
        Keva kevaLJIJ2 = LJIJ();
        if (enumC1876780ywG2 == enumC1876780ywG) {
            z2 = true;
        }
        kevaLJIJ2.storeBoolean("is_consent_accepted", z2);
        LJIJ().storeInt("consent_reason", enumC1915980zxU.getLegacyReasonValue());
        if (LJIIZILJ() != null) {
            C1915720zx4.LJIIIIZZ(interfaceC1915880zxK, str, Collections.singletonList(new C1876860ywO(this.LJI.getKey(), enumC1876780ywG, enumC1915980zxU.getFlow(), enumC1915980zxU.getCollectionPointId(), null, null, 112)));
        }
        if (!zLJII && enumC1876780ywG2 == enumC1876780ywG) {
            try {
                C052B.LIZ.getClass();
                C052B.LIZ(1, str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
