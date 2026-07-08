package com.ss.android.ugc.aweme.commercialize.router.impl;

import X.AbstractC1026580coy;
import X.AbstractC1026640cp4;
import X.AbstractC1026880cpS;
import X.C01GW;
import X.C099R;
import X.C1026490cop;
import X.C1026520cos;
import X.C1026530cot;
import X.C1026540cou;
import X.C1026630cp3;
import X.C1026660cp6;
import X.C1026680cp8;
import X.C1026730cpD;
import X.C1026780cpI;
import X.C1026790cpJ;
import X.C1026800cpK;
import X.C1026810cpL;
import X.C1026840cpO;
import X.C1026850cpP;
import X.C1026900cpU;
import X.C2188811AlT;
import X.C23250099c;
import X.C23271099x;
import X.C452501pT;
import X.InterfaceC1025840cnm;
import X.InterfaceC1026720cpC;
import X.InterfaceC1026740cpE;
import X.InterfaceC1364105Vn;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.delegate.ICRouterMainDelegate;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.invoke.ICRouter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes17.dex */
public final class CRouter implements ICRouter {
    public static final /* synthetic */ int LJFF = 0;
    public C1026490cop LIZ;
    public final List<InterfaceC1026740cpE> LIZIZ = new ArrayList();
    public final List<InterfaceC1025840cnm> LIZJ = new ArrayList();
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(145));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(144));

    public final List<InterfaceC1026720cpC> LJFF() {
        AbstractC1026880cpS abstractC1026880cpS;
        AbstractC1026640cp4<?> abstractC1026640cp4LJIIIIZZ;
        final C1026840cpO c1026840cpO;
        C1026680cp8 c1026680cp8;
        C1026780cpI c1026780cpI;
        AbstractC1026880cpS abstractC1026880cpS2;
        AbstractC1026640cp4<?> abstractC1026640cp4LJIIIIZZ2;
        final C1026730cpD c1026730cpD;
        final C1026800cpK c1026800cpK;
        final C1026810cpL c1026810cpL;
        final C1026790cpJ c1026790cpJ;
        final C1026850cpP c1026850cpP;
        final C1026900cpU c1026900cpU;
        AbstractC1026880cpS abstractC1026880cpS3;
        AbstractC1026640cp4<?> abstractC1026640cp4LJIIIIZZ3;
        ArrayList arrayList = new ArrayList();
        C1026490cop c1026490cop = this.LIZ;
        if (c1026490cop != null && (abstractC1026880cpS3 = c1026490cop.LJIIJJI) != null && (abstractC1026640cp4LJIIIIZZ3 = ((ICRouterAdapterDelegate) this.LJ.getValue()).LJIIIIZZ("live", abstractC1026880cpS3)) != null) {
            arrayList.add(abstractC1026640cp4LJIIIIZZ3);
        }
        C1026490cop c1026490cop2 = this.LIZ;
        if (c1026490cop2 != null && (c1026900cpU = c1026490cop2.LJ) != null) {
            arrayList.add(new AbstractC1026640cp4<C1026900cpU>(c1026900cpU) { // from class: X.0con
                public final C1026900cpU LJIILL;

                @Override // X.AbstractC1026640cp4
                public final String LJIILLIIL() {
                    return "message";
                }

                @Override // X.InterfaceC1026870cpR
                public final String getUrl() {
                    return null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
                
                    if (kotlin.jvm.internal.Intrinsics.LJFF(r4 != null ? r4.getType() : null, "message") == false) goto L28;
                 */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
                @Override // X.InterfaceC1026720cpC
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean LJ() {
                    /*
                        r14 = this;
                        X.01GW r0 = r14.LJI
                        java.lang.Object r0 = r0.getValue()
                        java.lang.String r2 = "message"
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
                        r7 = 0
                        if (r0 != 0) goto L10
                        return r7
                    L10:
                        int r1 = r14.LJIIIIZZ()
                        com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate r0 = r14.LJIILIIL()
                        int r0 = r0.LJI()
                        if (r1 != r0) goto L30
                        com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate r8 = r14.LJIILIIL()
                        java.lang.String r9 = "homepage_ad"
                        java.lang.String r10 = "message_click"
                        java.lang.String r11 = "button"
                        com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel r12 = r14.LJIIJJI()
                        r13 = 0
                        r8.LJIILLIIL(r9, r10, r11, r12, r13)
                    L30:
                        com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel r4 = r14.LJIIJJI()
                        java.lang.Object r3 = r14.LJIIL()
                        com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                        java.lang.Class<com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate> r0 = com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate.class
                        java.lang.Object r0 = r1.getService(r0)
                        com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate r0 = (com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate) r0
                        boolean r0 = r0.LJIILJJIL(r3)
                        r6 = 1
                        r5 = 0
                        if (r0 != 0) goto L72
                        if (r4 == 0) goto L70
                        java.lang.String r0 = r4.getType()
                    L52:
                        boolean r0 = android.text.TextUtils.equals(r0, r2)
                        if (r0 == 0) goto L72
                        if (r4 == 0) goto L72
                        int r1 = r4.getSystemOrigin()
                        r0 = 51
                        if (r1 != r0) goto L72
                    L62:
                        com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate r0 = r14.LJIILIIL()
                        boolean r0 = r0.LIZIZ()
                        if (r0 == 0) goto L99
                        r14.LJI()
                        return r7
                    L70:
                        r0 = r5
                        goto L52
                    L72:
                        com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel r4 = r14.LJIIJJI()
                        java.lang.Object r3 = r14.LJIIL()
                        com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                        java.lang.Class<com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate> r0 = com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate.class
                        java.lang.Object r0 = r1.getService(r0)
                        com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate r0 = (com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate) r0
                        boolean r0 = r0.LJIILJJIL(r3)
                        if (r0 != 0) goto L98
                        if (r4 == 0) goto L92
                        java.lang.String r5 = r4.getType()
                    L92:
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r2)
                        if (r0 != 0) goto L62
                    L98:
                        return r7
                    L99:
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1026470con.LJ():boolean");
                }

                @Override // X.AbstractC1026640cp4
                public final /* bridge */ /* synthetic */ AbstractC1026880cpS LJIILL() {
                    return this.LJIILL;
                }

                {
                    this.LJIILL = c1026900cpU;
                }

                @Override // X.InterfaceC1026720cpC
                public final Object LIZLLL(C1026650cp5 c1026650cp5) {
                    if (LJIILJJIL().LJIIIIZZ(LJIIJ(), LJIIIIZZ(), LJIIL())) {
                        return C1026670cp7.LIZLLL;
                    }
                    return new C1026670cp7(-1, "dm_page_jump_failed");
                }
            });
        }
        C1026490cop c1026490cop3 = this.LIZ;
        if (c1026490cop3 != null && (c1026850cpP = c1026490cop3.LJFF) != null) {
            arrayList.add(new AbstractC1026640cp4<C1026850cpP>(c1026850cpP) { // from class: X.0coz
                public final C1026850cpP LJIILL;

                @Override // X.AbstractC1026640cp4
                public final String LJIILLIIL() {
                    return "phone";
                }

                @Override // X.InterfaceC1026870cpR
                public final String getUrl() {
                    return null;
                }

                @Override // X.InterfaceC1026720cpC
                public final boolean LJ() {
                    GMTBaseModel gMTBaseModelLJIIJJI = LJIIJJI();
                    return Intrinsics.LJFF(gMTBaseModelLJIIJJI != null ? gMTBaseModelLJIIJJI.getType() : null, "phone") && !TextUtils.isEmpty(gMTBaseModelLJIIJJI.getPhoneNumber());
                }

                @Override // X.AbstractC1026640cp4
                public final /* bridge */ /* synthetic */ AbstractC1026880cpS LJIILL() {
                    return this.LJIILL;
                }

                {
                    this.LJIILL = c1026850cpP;
                }

                @Override // X.InterfaceC1026720cpC
                public final Object LIZLLL(C1026650cp5 c1026650cp5) {
                    String str;
                    if (!LJIILJJIL().LIZIZ(LJIIIIZZ()) && LJIIIIZZ() != LJIILIIL().LJJIJL()) {
                        if (LJIILJJIL().LJIJJLI(LJIIIIZZ())) {
                            str = "homepage_ad";
                        } else {
                            str = "draw_ad";
                        }
                    } else {
                        str = "background_ad";
                    }
                    if (LJIILJJIL().LJIILLIIL(LJIIJ(), LJIIL(), str, this.LJIILL.LIZJ)) {
                        return C1026670cp7.LIZLLL;
                    }
                    return new C1026670cp7(-1, "phone_sheet_call_failed");
                }
            });
        }
        C1026490cop c1026490cop4 = this.LIZ;
        if (c1026490cop4 != null && (c1026790cpJ = c1026490cop4.LIZ) != null) {
            arrayList.add(new AbstractC1026640cp4<C1026790cpJ>(c1026790cpJ) { // from class: X.0com
                public final C1026790cpJ LJIILL;
                public String LJIILLIIL;

                @Override // X.AbstractC1026640cp4
                public final String LJIILLIIL() {
                    return "in_app";
                }

                public final boolean LJIJJ() {
                    boolean z = (a0.LJJJIL(this.LJIILLIIL) ^ true) && Intrinsics.LJFF(UriProtector.parse(this.LJIILLIIL).getScheme(), "aweme");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("isInAppAwemeUrl = ");
                    sbLIZ.append(z);
                    sbLIZ.append(",currentUrl = ");
                    sbLIZ.append(this.LJIILLIIL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return z;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean LJIJJLI() {
                    /*
                        r3 = this;
                        java.lang.String r0 = r3.LJIILLIIL
                        boolean r0 = kotlin.text.a0.LJJJIL(r0)
                        r2 = 1
                        r0 = r0 ^ 1
                        if (r0 == 0) goto L3d
                        com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate r1 = r3.LJIILIIL()
                        java.lang.String r0 = r3.LJIILLIIL
                        android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
                        java.lang.String r0 = r0.getScheme()
                        if (r0 != 0) goto L1d
                        java.lang.String r0 = ""
                    L1d:
                        boolean r0 = r1.LJIIL(r0)
                        if (r0 == 0) goto L3d
                    L23:
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "isInAppCommonUrl = "
                        r1.append(r0)
                        r1.append(r2)
                        java.lang.String r0 = ",currentUrl = "
                        r1.append(r0)
                        java.lang.String r0 = r3.LJIILLIIL
                        r1.append(r0)
                        X.C2188811AlT.LIZIZ(r1)
                        return r2
                    L3d:
                        r2 = 0
                        goto L23
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1026460com.LJIJJLI():boolean");
                }

                @Override // X.InterfaceC1026870cpR
                public final String getUrl() {
                    String str = this.LJIILLIIL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getUrl() = ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return str;
                }

                @Override // X.InterfaceC1026720cpC
                public final boolean LJ() {
                    return LJIJJLI() || LJIJJ();
                }

                @Override // X.AbstractC1026640cp4
                public final /* bridge */ /* synthetic */ AbstractC1026880cpS LJIILL() {
                    return this.LJIILL;
                }

                {
                    this.LJIILL = c1026790cpJ;
                    String str = c1026790cpJ.LIZJ;
                    this.LJIILLIIL = str == null ? "" : str;
                }

                @Override // X.InterfaceC1026720cpC
                public final Object LIZLLL(C1026650cp5 c1026650cp5) {
                    String openUrl;
                    Long creativeId;
                    Integer numValueOf;
                    Object c098200Yq;
                    String creativeIdStr;
                    String logExtra;
                    Long adId;
                    String string;
                    String strLJII = LJIILIIL().LJII(LJIIIIZZ(), LJIIJ(), LJIIL(), this.LJIILLIIL);
                    if (strLJII != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("jointCloseLoopECommercePlpParam(),open url replaced currentUrl = ");
                        sbLIZ.append(this.LJIILLIIL);
                        C2188811AlT.LIZIZ(sbLIZ);
                        this.LJIILLIIL = strLJII;
                    }
                    String strLIZ = C2631010b.LIZ(this.LJIILLIIL, "source_aid", LJIIIZ().LIZIZ);
                    this.LJIILLIIL = strLIZ;
                    String str = this.LJIILL.LIZLLL;
                    if (str != null) {
                        this.LJIILLIIL = C2631010b.LIZ(strLIZ, "source_btm_token", str);
                    }
                    this.LJIILLIIL = LJIILIIL().LJIILIIL(LJIIIIZZ(), LJIIL(), this.LJIILLIIL);
                    if (LJIJJLI()) {
                        Uri uri = UriProtector.parse(this.LJIILLIIL);
                        String path = uri.getPath();
                        if (path != null && u.LJJIIJZLJL(path, "/detail", false)) {
                            this.LJIILLIIL = uri.buildUpon().appendQueryParameter("video_detail", "1").build().toString();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("jointInAppCommonParam(),currentUrl = ");
                            sbLIZ2.append(this.LJIILLIIL);
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        LJIILJJIL().LJJIFFI(LJIIJ(), this.LJIILLIIL);
                        LJIILJJIL().LJIILJJIL(LJIIIIZZ(), LJIIL());
                        LJIILJJIL().LIZ(this.LJIILLIIL);
                        return C1026670cp7.LIZLLL;
                    }
                    if (LJIJJ()) {
                        if (Intrinsics.LJFF(this.LJI.getValue(), "paid_content") && !this.LJIILL.LIZIZ.LJIIJ) {
                            this.LJIILLIIL = UriProtector.parse(this.LJIILLIIL).buildUpon().appendQueryParameter("enter_from", "ads_button").toString();
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("jointAdPaidParam(),currentUrl = ");
                            sbLIZ3.append(this.LJIILLIIL);
                            C2188811AlT.LIZIZ(sbLIZ3);
                        }
                        if (LJIILJJIL().LIZJ(this.LJIILLIIL)) {
                            Uri.Builder builderBuildUpon = UriProtector.parse(this.LJIILLIIL).buildUpon();
                            GMTBaseModel gMTBaseModelLJIIJJI = LJIIJJI();
                            String str2 = "";
                            if (gMTBaseModelLJIIJJI == null || (creativeIdStr = gMTBaseModelLJIIJJI.getCreativeIdStr()) == null) {
                                creativeIdStr = "";
                            }
                            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("creative_id", creativeIdStr);
                            GMTBaseModel gMTBaseModelLJIIJJI2 = LJIIJJI();
                            if (gMTBaseModelLJIIJJI2 == null || (logExtra = gMTBaseModelLJIIJJI2.getLogExtra()) == null) {
                                logExtra = "";
                            }
                            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("log_extra", logExtra);
                            GMTBaseModel gMTBaseModelLJIIJJI3 = LJIIJJI();
                            if (gMTBaseModelLJIIJJI3 != null && (adId = gMTBaseModelLJIIJJI3.getAdId()) != null && (string = adId.toString()) != null) {
                                str2 = string;
                            }
                            this.LJIILLIIL = builderAppendQueryParameter2.appendQueryParameter("ad_id", str2).appendQueryParameter("live.intent.extra.ENTER_AWEME_ID", LJIIIZ().LIZIZ).toString();
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("jointLiveParam(),currentUrl = ");
                            sbLIZ4.append(this.LJIILLIIL);
                            C2188811AlT.LIZIZ(sbLIZ4);
                        }
                        if (Intrinsics.LJFF(this.LJI.getValue(), "paid_content") && u.LJJIIJZLJL(this.LJIILLIIL, "aweme://paidcontent/innerfeed", false)) {
                            try {
                                Uri.Builder builderBuildUpon2 = UriProtector.parse(this.LJIILLIIL).buildUpon();
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("ad_");
                                sbLIZ5.append(LJII().LIZLLL);
                                c098200Yq = builderBuildUpon2.appendQueryParameter("series_enter_entrance", C2188811AlT.LIZIZ(sbLIZ5)).toString();
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            String str3 = this.LJIILLIIL;
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = str3;
                            }
                            this.LJIILLIIL = (String) c098200Yq;
                        }
                        GMTBaseModel gMTBaseModelLJIIJJI4 = LJIIJJI();
                        if (gMTBaseModelLJIIJJI4 != null && gMTBaseModelLJIIJJI4.getAdUrlType() == 1 && (openUrl = gMTBaseModelLJIIJJI4.getOpenUrl()) != null && u.LJJIIJZLJL(openUrl, "aweme://minis", false)) {
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("ads_");
                            sbLIZ6.append(LJII().LIZLLL);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                            ICRouterAdapterDelegate iCRouterAdapterDelegateLJIILIIL = LJIILIIL();
                            String openUrl2 = gMTBaseModelLJIIJJI4.getOpenUrl();
                            GMTBaseModel gMTBaseModelLJIIJJI5 = LJIIJJI();
                            String logExtra2 = null;
                            if (gMTBaseModelLJIIJJI5 != null) {
                                creativeId = gMTBaseModelLJIIJJI5.getCreativeId();
                            } else {
                                creativeId = null;
                            }
                            GMTBaseModel gMTBaseModelLJIIJJI6 = LJIIJJI();
                            if (gMTBaseModelLJIIJJI6 != null) {
                                numValueOf = Integer.valueOf(gMTBaseModelLJIIJJI6.getSystemOrigin());
                            } else {
                                numValueOf = null;
                            }
                            GMTBaseModel gMTBaseModelLJIIJJI7 = LJIIJJI();
                            if (gMTBaseModelLJIIJJI7 != null) {
                                logExtra2 = gMTBaseModelLJIIJJI7.getLogExtra();
                            }
                            String strLJJIIZ = iCRouterAdapterDelegateLJIILIIL.LJJIIZ(numValueOf, openUrl2, strLIZIZ, creativeId, logExtra2);
                            if (strLJJIIZ != null) {
                                this.LJIILLIIL = strLJJIIZ;
                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                sbLIZ7.append("jointMiniAdsParam(),currentUrl = ");
                                sbLIZ7.append(gMTBaseModelLJIIJJI4.getOpenUrl());
                                C2188811AlT.LIZIZ(sbLIZ7);
                            }
                        }
                        SmartRouter.buildRoute(LJIIJ(), this.LJIILLIIL).open();
                        return C1026670cp7.LIZLLL;
                    }
                    return C1026670cp7.LJ;
                }
            });
        }
        C1026490cop c1026490cop5 = this.LIZ;
        if (c1026490cop5 != null && (c1026810cpL = c1026490cop5.LJI) != null) {
            arrayList.add(new AbstractC1026580coy<C1026810cpL>(c1026810cpL) { // from class: X.0cp1
                public final C1026810cpL LJIIZILJ;
                public final String LJIJ;

                @Override // X.AbstractC1026580coy
                public final boolean LJIJJLI() {
                    return false;
                }

                @Override // X.InterfaceC1026870cpR
                public final String getUrl() {
                    C1026810cpL c1026810cpL2 = this.LJIIZILJ;
                    String str = c1026810cpL2.LJ ? c1026810cpL2.LIZLLL : null;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getUrl() = ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return str;
                }

                @Override // X.AbstractC1026580coy, X.InterfaceC1026720cpC
                public final boolean LJ() {
                    return Intrinsics.LJFF(LJIJJ(), C1026940cpY.LIZ);
                }

                @Override // X.AbstractC1026640cp4
                public final /* bridge */ /* synthetic */ AbstractC1026880cpS LJIILL() {
                    return this.LJIIZILJ;
                }

                @Override // X.AbstractC1026640cp4
                public final String LJIILLIIL() {
                    return this.LJIJ;
                }

                {
                    super(c1026810cpL);
                    this.LJIIZILJ = c1026810cpL;
                    this.LJIJ = "universal_link";
                }
            });
        }
        C1026490cop c1026490cop6 = this.LIZ;
        if (c1026490cop6 != null && (c1026800cpK = c1026490cop6.LJII) != null) {
            arrayList.add(new AbstractC1026580coy<C1026800cpK>(c1026800cpK) { // from class: X.0cox
                public final C1026800cpK LJIIZILJ;
                public String LJIJ;
                public final String LJIJI;

                @Override // X.AbstractC1026580coy
                public final boolean LJIJJLI() {
                    return true;
                }

                @Override // X.InterfaceC1026870cpR
                public final String getUrl() {
                    String str = this.LJIJ;
                    if (str == null) {
                        str = this.LJIIZILJ.LIZLLL;
                        if (a0.LJJIIZI(str, "__back_url__", false)) {
                            int i = this.LJIIZILJ.LIZJ.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("snssdk");
                            sbLIZ.append(i);
                            sbLIZ.append("://adx");
                            u.LJJIFFI(str, "__back_url__", Uri.encode(C2188811AlT.LIZIZ(sbLIZ)), false);
                        }
                    }
                    this.LJIJ = str;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getUrl() = ");
                    sbLIZ2.append(this.LJIJ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    String str2 = this.LJIJ;
                    if (str2 != null) {
                        return (str2.length() == 0 || C815510Vyv.LIZIZ(UriProtector.parse(str2))) ? str2 : C2631010b.LIZ(str2, "source_aid", LJIIIZ().LIZIZ);
                    }
                    return null;
                }

                @Override // X.AbstractC1026640cp4
                public final /* bridge */ /* synthetic */ AbstractC1026880cpS LJIILL() {
                    return this.LJIIZILJ;
                }

                @Override // X.AbstractC1026640cp4
                public final String LJIILLIIL() {
                    return this.LJIJI;
                }

                {
                    super(c1026800cpK);
                    this.LJIIZILJ = c1026800cpK;
                    this.LJIJI = "schema_link";
                }
            });
        }
        C1026490cop c1026490cop7 = this.LIZ;
        if (c1026490cop7 != null && (c1026730cpD = c1026490cop7.LIZLLL) != null) {
            arrayList.add(new AbstractC1026640cp4<C1026730cpD>(c1026730cpD) { // from class: X.0cor
                public final C1026730cpD LJIILL;
                public final String LJIILLIIL;
                public final String LJIIZILJ;
                public String LJIJ = "gp_store";

                @Override // X.AbstractC1026640cp4
                public final String LJIILLIIL() {
                    return "google_play";
                }

                @Override // X.InterfaceC1026870cpR
                public final String getUrl() {
                    return null;
                }

                @Override // X.AbstractC1026640cp4, X.InterfaceC1026720cpC
                public final C1026830cpN LIZ() {
                    return new C1026830cpN("google_play", this.LJIILL, false, this.LJIJ);
                }

                @Override // X.InterfaceC1026720cpC
                public final boolean LJ() {
                    String str;
                    if (!Intrinsics.LJFF(this.LJI.getValue(), "app")) {
                        return false;
                    }
                    String str2 = this.LJIILLIIL;
                    return (str2 != null && (a0.LJJJIL(str2) ^ true)) || ((str = this.LJIIZILJ) != null && (a0.LJJJIL(str) ^ true));
                }

                @Override // X.AbstractC1026640cp4
                public final /* bridge */ /* synthetic */ AbstractC1026880cpS LJIILL() {
                    return this.LJIILL;
                }

                {
                    this.LJIILL = c1026730cpD;
                    this.LJIILLIIL = c1026730cpD.LIZJ;
                    this.LJIIZILJ = c1026730cpD.LJ;
                }

                @Override // X.InterfaceC1026720cpC
                public final Object LIZLLL(C1026650cp5 c1026650cp5) {
                    GMTBaseModel gMTBaseModelLJIIJJI;
                    String clickId;
                    if (LJIILJJIL().LJIILL(LJIIJ(), LJIIIIZZ(), LJIIL())) {
                        return C1026670cp7.LIZLLL;
                    }
                    if (LJIILJJIL().LJFF(LJIIIIZZ())) {
                        ICRouterMainDelegate iCRouterMainDelegateLJIILJJIL = LJIILJJIL();
                        Context contextLJIIJ = LJIIJ();
                        Object objLJIIL = LJIIL();
                        int iLJIIIIZZ = LJIIIIZZ();
                        ((Boolean) this.LJIILJJIL.getValue()).booleanValue();
                        if (iCRouterMainDelegateLJIILJJIL.LJJII(contextLJIIJ, objLJIIL, iLJIIIIZZ)) {
                            this.LJIJ = "gp_card";
                            return C1026670cp7.LIZLLL;
                        }
                        ICRouterMainDelegate iCRouterMainDelegateLJIILJJIL2 = LJIILJJIL();
                        Context contextLJIIJ2 = LJIIJ();
                        String str = this.LJIILL.LIZIZ.LIZLLL;
                        Object objLJIIL2 = LJIIL();
                        ((Boolean) this.LJIILJJIL.getValue()).booleanValue();
                        if (iCRouterMainDelegateLJIILJJIL2.LJIIZILJ(LJIIIIZZ(), contextLJIIJ2, objLJIIL2, str)) {
                            this.LJIJ = "xiaomi_card";
                            return C1026670cp7.LIZLLL;
                        }
                    }
                    if (LJIILJJIL().LJIIIZ(LJIIIIZZ()) && LJIILJJIL().LJIIL(LJIIJ(), LJIIIIZZ(), LJIIL())) {
                        this.LJIJ = "samsung";
                        return C1026670cp7.LIZLLL;
                    }
                    String str2 = this.LJIILL.LJ;
                    if (LJII().LJIIJ && str2 != null && str2.length() > 0) {
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(UriProtector.parse(str2));
                            LJIILIIL().LJIILL(intent, EnumC1025640cnS.APP_STORE);
                            return LJIJI(intent);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return new C1026670cp7(-1, "unknown_exception");
                        }
                    }
                    if (!LJIILIIL().LJJIJIL(LJIIL()) && (gMTBaseModelLJIIJJI = LJIIJJI()) != null && gMTBaseModelLJIIJJI.allowJumpToPlayStore()) {
                        ICRouterMainDelegate iCRouterMainDelegateLJIILJJIL3 = LJIILJJIL();
                        Context contextLJIIJ3 = LJIIJ();
                        String str3 = this.LJIILLIIL;
                        GMTBaseModel gMTBaseModelLJIIJJI2 = LJIIJJI();
                        if (gMTBaseModelLJIIJJI2 != null) {
                            clickId = gMTBaseModelLJIIJJI2.getClickId();
                        } else {
                            clickId = null;
                        }
                        boolean zLJIJI = iCRouterMainDelegateLJIILJJIL3.LJIJI(contextLJIIJ3, str3, clickId);
                        if (zLJIJI) {
                            LJIILIIL().LJIILLIIL(LJIIZILJ(), "open_store", LJII().LIZLLL, LJIIJJI(), null);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("openGooglePage() result = ");
                        sbLIZ.append(zLJIJI);
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (!zLJIJI) {
                            return new C1026670cp7(-1, "gp_uninstall");
                        }
                    } else {
                        LJI();
                    }
                    return C1026670cp7.LIZLLL;
                }
            });
        }
        C1026490cop c1026490cop8 = this.LIZ;
        if (c1026490cop8 != null && (abstractC1026880cpS2 = c1026490cop8.LJIIJ) != null && (abstractC1026640cp4LJIIIIZZ2 = ((ICRouterAdapterDelegate) this.LJ.getValue()).LJIIIIZZ("lynx", abstractC1026880cpS2)) != null) {
            arrayList.add(abstractC1026640cp4LJIIIIZZ2);
        }
        C1026490cop c1026490cop9 = this.LIZ;
        if (c1026490cop9 != null && (c1026780cpI = c1026490cop9.LIZIZ) != null) {
            arrayList.add(new C1026540cou(c1026780cpI));
        }
        C1026490cop c1026490cop10 = this.LIZ;
        if (c1026490cop10 != null && (c1026680cp8 = c1026490cop10.LIZJ) != null) {
            arrayList.add(new C1026520cos(c1026680cp8));
        }
        C1026490cop c1026490cop11 = this.LIZ;
        if (c1026490cop11 != null && (c1026840cpO = c1026490cop11.LJIIIIZZ) != null) {
            arrayList.add(new AbstractC1026640cp4<C1026840cpO>(c1026840cpO) { // from class: X.0cp0
                public final C1026840cpO LJIILL;

                @Override // X.AbstractC1026640cp4
                public final String LJIILLIIL() {
                    return "apk_file";
                }

                @Override // X.InterfaceC1026870cpR
                public final String getUrl() {
                    return null;
                }

                @Override // X.InterfaceC1026720cpC
                public final boolean LJ() {
                    return u.LJIIZILJ(this.LJIILL.LIZJ, ".apk", false);
                }

                @Override // X.AbstractC1026640cp4
                public final /* bridge */ /* synthetic */ AbstractC1026880cpS LJIILL() {
                    return this.LJIILL;
                }

                {
                    this.LJIILL = c1026840cpO;
                }

                @Override // X.InterfaceC1026720cpC
                public final Object LIZLLL(C1026650cp5 c1026650cp5) {
                    if (LJIILJJIL().LJIIJ(LJIIJ(), LJIIL())) {
                        return C1026670cp7.LIZLLL;
                    }
                    return new C1026670cp7(-1, "handle_apk_failed");
                }
            });
        }
        C1026490cop c1026490cop12 = this.LIZ;
        if (c1026490cop12 != null && (abstractC1026880cpS = c1026490cop12.LJIIIZ) != null && (abstractC1026640cp4LJIIIIZZ = ((ICRouterAdapterDelegate) this.LJ.getValue()).LJIIIIZZ("iab", abstractC1026880cpS)) != null) {
            arrayList.add(abstractC1026640cp4LJIIIIZZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getAllProcessors() end,processors = ");
        sbLIZ.append(arrayList);
        C2188811AlT.LIZIZ(sbLIZ);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.invoke.ICRouter
    public final boolean LIZLLL() {
        List<InterfaceC1026720cpC> listLJFF = LJFF();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJFF) {
            if (!((InterfaceC1026720cpC) obj).LJFF()) {
                arrayList.add(obj);
            }
        }
        return ((Boolean) C23250099c.LJ(C23271099x.INSTANCE, new C1026530cot(arrayList, this, null))).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.invoke.ICRouter
    public final Object LIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZ = new C1026630cp3(LJFF(), this.LIZ, this.LIZIZ, this.LIZJ).LIZ(interfaceC1364105Vn);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.invoke.ICRouter
    public final CRouter LIZIZ(C1026490cop c1026490cop) {
        this.LIZ = c1026490cop;
        return this;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.router.api.openapi.invoke.ICRouter
    public final CRouter LIZJ(InterfaceC1026740cpE interfaceC1026740cpE) {
        ((ArrayList) this.LIZIZ).add(interfaceC1026740cpE);
        return this;
    }

    public final CRouter LJ(C1026660cp6 c1026660cp6) {
        ((ArrayList) this.LIZJ).add(c1026660cp6);
        return this;
    }
}
