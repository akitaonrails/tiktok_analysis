package com.ss.android.ugc.aweme.verify;

import X.C1697810uHb;
import X.C1713490ugt;
import X.C1713520ugw;
import X.C1713540ugy;
import X.C1713570uh1;
import X.C1713590uh3;
import X.C1713600uh4;
import X.C1713620uh6;
import X.C1713710uhF;
import X.C1713750uhJ;
import X.C1713840uhS;
import X.C1713860uhU;
import X.C1713920uha;
import X.C1713980uhg;
import X.C1714040uhm;
import X.C1714280uiA;
import X.C1717770unn;
import X.C1719290uqF;
import X.C1719880urC;
import X.C19EG;
import X.C1AF0;
import X.EnumC1714450uiR;
import X.EnumC925903jd;
import X.InterfaceC1063710dmr;
import X.InterfaceC1713470ugr;
import X.InterfaceC1713480ugs;
import X.InterfaceC1713510ugv;
import X.InterfaceC1713610uh5;
import X.InterfaceC1713650uh9;
import X.InterfaceC1713820uhQ;
import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pipo.verify.base.model.SchemaComposer;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.verify.PipoVerifyCenterService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS141S1200000_26;
import kotlin.jvm.internal.AwS204S1100000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoVerifyCenterService implements IPipoVerifyCenterService {
    public static final Map<String, String> LIZIZ = new ConcurrentHashMap();
    public final List<String> LIZ = C1697810uHb.LJIIJJI("rd_pipo_veri_center_init", "rd_pipo_veri_center_finish", "rd_pipo_veri_center_error_report");

    @Override // com.ss.android.ugc.aweme.verify.IPipoVerifyCenterService
    public final List<Class<? extends InterfaceC1063710dmr>> LIZIZ() {
        return C1697810uHb.LJ(C1713980uhg.class, C1713920uha.class, C1719880urC.class, C1714280uiA.class);
    }

    public final void LJFF() {
        ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LIZJ();
        AtomicBoolean atomicBoolean = C1713600uh4.LIZ;
        if (atomicBoolean.get()) {
            return;
        }
        AFwS215S0000000_26 aFwS215S0000000_26 = AFwS215S0000000_26.get$arr$(269);
        AFwS215S0000000_26 aFwS215S0000000_262 = AFwS215S0000000_26.get$arr$(268);
        String strValueOf = String.valueOf(C1717770unn.LIZJ().getAppId());
        C1717770unn.LIZJ().isDebug();
        C1713710uhF c1713710uhF = new C1713710uhF(strValueOf, aFwS215S0000000_26, aFwS215S0000000_262, false);
        InterfaceC1713820uhQ interfaceC1713820uhQ = new InterfaceC1713820uhQ() { // from class: X.0uhX
            @Override // X.InterfaceC1713820uhQ
            public final void onEventV3(String str, Map<String, String> map) {
                ((InterfaceC1713880uhW) ((InterfaceC1547650qNP) C1954707lB.LIZLLL(InterfaceC1713880uhW.class))).onEventV3(str, map);
                PipoVerifyCenterService pipoVerifyCenterService = this.LIZ;
                pipoVerifyCenterService.getClass();
                C1714230ui5.LIZLLL(new AwS141S1200000_26(pipoVerifyCenterService, (PipoVerifyCenterService) str, (String) map, (Map<String, String>) 5));
            }
        };
        InterfaceC1713610uh5 interfaceC1713610uh5 = new InterfaceC1713610uh5() { // from class: X.0uhG
            @Override // X.InterfaceC1713610uh5
            public final void LIZ(Throwable th) {
                C1AF0.LJ(th);
            }
        };
        InterfaceC1713510ugv interfaceC1713510ugv = new InterfaceC1713510ugv() { // from class: X.0uhT
            /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
            @Override // X.InterfaceC1713510ugv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LIZ(X.C1713570uh1 r12) {
                /*
                    r11 = this;
                    com.bytedance.pipo.verify.base.model.VerifyInfo r0 = r12.LJIIIZ()
                    com.bytedance.pipo.verify.base.model.VerifyDetail r0 = r0.verifyDetail
                    r8 = 0
                    if (r0 == 0) goto L25
                    java.lang.String r5 = r0.bizType
                    java.lang.String r4 = r0.paymentMethod
                    java.lang.String r3 = r0.pipoProductCat
                    java.lang.String r2 = r0.enterFrom
                L11:
                    com.bytedance.ies.abmock.SettingsManager r6 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
                    java.lang.Class<com.ss.android.ugc.aweme.verify.ab.PipoVerifySdkHybridConfigSettings$PipoVerifySdkHybridConfigModel> r1 = com.ss.android.ugc.aweme.verify.ab.PipoVerifySdkHybridConfigSettings.PipoVerifySdkHybridConfigModel.class
                    com.ss.android.ugc.aweme.verify.ab.PipoVerifySdkHybridConfigSettings$PipoVerifySdkHybridConfigModel r7 = com.ss.android.ugc.aweme.verify.ab.PipoVerifySdkHybridConfigSettings.LIZ
                    java.lang.String r0 = "pipo_verify_sdk_hybrid_config"
                    java.lang.Object r0 = r6.LJIIIIZZ(r0, r1, r7)
                    com.ss.android.ugc.aweme.verify.ab.PipoVerifySdkHybridConfigSettings$PipoVerifySdkHybridConfigModel r0 = (com.ss.android.ugc.aweme.verify.ab.PipoVerifySdkHybridConfigSettings.PipoVerifySdkHybridConfigModel) r0
                    if (r0 == 0) goto L2a
                    r7 = r0
                    goto L2a
                L25:
                    r5 = r8
                    r4 = r8
                    r3 = r8
                    r2 = r8
                    goto L11
                L2a:
                    X.0ugw r0 = r12.LIZ     // Catch: java.lang.Throwable -> L61
                    X.0uh3 r0 = r0.LIZ     // Catch: java.lang.Throwable -> L61
                    X.0uhS r0 = r0.LIZ     // Catch: java.lang.Throwable -> L61
                    com.google.gson.n r1 = r0.LIZ     // Catch: java.lang.Throwable -> L61
                    if (r1 == 0) goto L5f
                    java.lang.String r0 = "client_config_from_web"
                    com.google.gson.k r0 = r1.LJJIIZ(r0)     // Catch: java.lang.Throwable -> L61
                    if (r0 == 0) goto L5f
                    java.lang.String r1 = r0.LJIL()     // Catch: java.lang.Throwable -> L61
                    if (r1 == 0) goto L5f
                    com.google.gson.p r0 = new com.google.gson.p     // Catch: java.lang.Throwable -> L61
                    r0.<init>()     // Catch: java.lang.Throwable -> L61
                    com.google.gson.k r0 = com.google.gson.p.LIZJ(r1)     // Catch: java.lang.Throwable -> L61
                    com.google.gson.n r1 = r0.LJIILIIL()     // Catch: java.lang.Throwable -> L61
                    java.lang.String r0 = "enter_from"
                    com.google.gson.k r0 = r1.LJJIIZ(r0)     // Catch: java.lang.Throwable -> L61
                    if (r0 == 0) goto L5f
                    java.lang.String r6 = r0.LJIL()     // Catch: java.lang.Throwable -> L61
                L5b:
                    X.C189200o6.m2constructorimpl(r6)     // Catch: java.lang.Throwable -> L61
                    goto L6d
                L5f:
                    r6 = r8
                    goto L5b
                L61:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    X.00Yq r6 = new X.00Yq
                    r6.<init>(r0)
                    X.C189200o6.m2constructorimpl(r6)
                L6d:
                    boolean r0 = X.C189200o6.m7isFailureimpl(r6)
                    if (r0 == 0) goto L74
                    r6 = r8
                L74:
                    java.lang.String r6 = (java.lang.String) r6
                    java.util.List<com.ss.android.ugc.aweme.verify.ab.PipoVerifySdkHybridConfigSettings$HybridConfigModel> r7 = r7.sourceList
                    r10 = 0
                    if (r7 == 0) goto Lc4
                    boolean r0 = r7.isEmpty()
                    r0 = r0 ^ 1
                    if (r0 == 0) goto Lc4
                    com.ss.android.ugc.aweme.verify.PipoVerifyCenterService r1 = r11.LIZ
                    java.util.Iterator r9 = r7.iterator()
                L89:
                    boolean r0 = r9.hasNext()
                    if (r0 == 0) goto Lc4
                    java.lang.Object r8 = r9.next()
                    r7 = r8
                    com.ss.android.ugc.aweme.verify.ab.PipoVerifySdkHybridConfigSettings$HybridConfigModel r7 = (com.ss.android.ugc.aweme.verify.ab.PipoVerifySdkHybridConfigSettings.HybridConfigModel) r7
                    java.lang.String r0 = r7.bizType
                    r1.getClass()
                    boolean r0 = com.ss.android.ugc.aweme.verify.PipoVerifyCenterService.LJI(r0, r5)
                    if (r0 == 0) goto L89
                    java.lang.String r0 = r7.paymentMethod
                    boolean r0 = com.ss.android.ugc.aweme.verify.PipoVerifyCenterService.LJI(r0, r4)
                    if (r0 == 0) goto L89
                    java.lang.String r0 = r7.pipoProductCat
                    boolean r0 = com.ss.android.ugc.aweme.verify.PipoVerifyCenterService.LJI(r0, r3)
                    if (r0 == 0) goto L89
                    java.lang.String r0 = r7.enterFrom
                    boolean r0 = com.ss.android.ugc.aweme.verify.PipoVerifyCenterService.LJI(r0, r2)
                    if (r0 != 0) goto Lc1
                    java.lang.String r0 = r7.enterFrom
                    boolean r0 = com.ss.android.ugc.aweme.verify.PipoVerifyCenterService.LJI(r0, r6)
                    if (r0 == 0) goto L89
                Lc1:
                    if (r8 == 0) goto Lc4
                    r10 = 1
                Lc4:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1713850uhT.LIZ(X.0uh1):boolean");
            }
        };
        final String strValueOf2 = String.valueOf(C1717770unn.LIZJ().getAppId());
        InterfaceC1713470ugr interfaceC1713470ugr = new InterfaceC1713470ugr() { // from class: X.0uhp
            @Override // X.InterfaceC1713470ugr
            public final Map<String, String> getParams() {
                String strValueOf3;
                Pair[] pairArr = new Pair[6];
                int iIntValue = 0;
                pairArr[0] = new Pair("aid", strValueOf2);
                pairArr[1] = new Pair("device_platform", "android");
                this.getClass();
                try {
                    C1717770unn.LIZJ().getVersionInfo();
                    try {
                        Iterator it2 = a0.LJJLIIIJILLIZJL(C1717770unn.LIZJ().getVersionInfo().LIZ, new String[]{e3.d}, 0, 6).iterator();
                        while (it2.hasNext()) {
                            iIntValue = CastIntegerProtector.valueOf((String) it2.next()).intValue() + (iIntValue * 100);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJFF(th, "cv get_version1");
                    }
                    strValueOf3 = String.valueOf(iIntValue);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1AF0.LJFF(th2, "cv get_version2");
                    strValueOf3 = "";
                }
                pairArr[2] = new Pair("version_code", strValueOf3);
                pairArr[3] = new Pair("version_name", C1717770unn.LIZJ().getVersionInfo().LIZ);
                pairArr[4] = new Pair("os_version", Build.VERSION.RELEASE);
                pairArr[5] = new Pair("os_api", String.valueOf(Build.VERSION.SDK_INT));
                return C2097608Jq.LJIIIIZZ(pairArr);
            }
        };
        InterfaceC1713480ugs interfaceC1713480ugs = new InterfaceC1713480ugs() { // from class: X.0uiG
            public String LIZ = "";
            public String LIZIZ = "'";
            public final Map<String, String> LIZJ;
            public final Map<String, C1714370uiJ> LIZLLL;

            {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme:");
                sbLIZ.append("//verify_center/verify_otp");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("aweme:");
                sbLIZ2.append("//verify_center/verify_pin");
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("aweme:");
                sbLIZ3.append("//verify_center/verify_id");
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("aweme:");
                sbLIZ4.append("//verify_center/verify_pi");
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("aweme:");
                sbLIZ5.append("//verify_center/verify_bio");
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("aweme:");
                sbLIZ6.append("//verify_center/verify_ocr");
                this.LIZJ = C2097608Jq.LJIIIIZZ(new Pair(C2188811AlT.LIZIZ(sbLIZ), "OTP"), new Pair(C2188811AlT.LIZIZ(sbLIZ2), "PIN"), new Pair(C2188811AlT.LIZIZ(sbLIZ3), "ID-C"), new Pair(C2188811AlT.LIZIZ(sbLIZ4), "PI"), new Pair(C2188811AlT.LIZIZ(sbLIZ5), "BIO"), new Pair(C2188811AlT.LIZIZ(sbLIZ6), "OCR"));
                this.LIZLLL = C2097608Jq.LJIIIIZZ(new Pair("OTP", new C1714370uiJ("//verify_center/verify_otp", null, false, AFwS215S0000000_26.get$arr$(453), true, 6)), new Pair("PIN", new C1714370uiJ("//verify_center/verify_pin", null, false, AFwS215S0000000_26.get$arr$(454), true, 6)), new Pair("ID-C", new C1714370uiJ("//verify_center/verify_id", AFwS268S0000000_26.get$arr$(634), false, AFwS215S0000000_26.get$arr$(455), false, 20)), new Pair("PI", new C1714370uiJ("//verify_center/verify_pi", AFwS268S0000000_26.get$arr$(635), false, AFwS215S0000000_26.get$arr$(456), true, 4)), new Pair("BIO", new C1714370uiJ("//verify_center/verify_bio", null, true, AFwS215S0000000_26.get$arr$(457), false, 18)), new Pair("OCR", new C1714370uiJ("//verify_center/verify_ocr", null, true, AFwS215S0000000_26.get$arr$(458), false, 18)));
            }

            @Override // X.InterfaceC1713480ugs
            public final Activity LIZJ() {
                AbstractC1387200mCc abstractC1387200mCcLIZJ = C1717770unn.LIZIZ().LIZJ();
                Object obj = abstractC1387200mCcLIZJ != null ? abstractC1387200mCcLIZJ.LIZ : null;
                if (obj instanceof Activity) {
                    return (Activity) obj;
                }
                return null;
            }

            @Override // X.InterfaceC1713480ugs
            public final void LIZ(C19EG c19eg, C1713570uh1 c1713570uh1) {
                String str = c1713570uh1.LJIIIZ().verifyType;
                if (str == null) {
                    str = "";
                }
                LJ(c19eg, c1713570uh1, str);
            }

            @Override // X.InterfaceC1713480ugs
            public final void LIZIZ(C19EG c19eg, final C1713570uh1 c1713570uh1) {
                SchemaComposer schemaComposer;
                SchemaComposer schemaComposer2;
                final String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                VerifyDetail verifyDetail = c1713570uh1.LJIIIZ().verifyDetail;
                if (verifyDetail != null && (schemaComposer = verifyDetail.schemaList) != null) {
                    String str9 = schemaComposer.f47native;
                    if (str9 != null && str9.length() != 0) {
                        String str10 = this.LIZJ.get(C01CL.LIZIZ(UriProtector.parse(schemaComposer.f47native)));
                        if (str10 == null) {
                            c1713570uh1.LJIILIIL.LIZ(C1713490ugt.LIZIZ(null));
                            return;
                        } else {
                            LJ(c19eg, c1713570uh1, str10);
                            return;
                        }
                    }
                    VerifyDetail verifyDetail2 = c1713570uh1.LJIIIZ().verifyDetail;
                    if (verifyDetail2 != null && (schemaComposer2 = verifyDetail2.schemaList) != null && (((str = schemaComposer2.lynx) != null && str.length() > 0) || ((str = schemaComposer2.web) != null && str.length() > 0))) {
                        C1714260ui8.LIZ.getClass();
                        try {
                            Uri uri = UriProtector.parse(str);
                            Uri.Builder builderAppendQueryParameter = UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url")).buildUpon().appendQueryParameter("verify_id", c1713570uh1.LJIIIZ().verifyId);
                            VerifyDetail verifyDetailLJIIIIZZ = c1713570uh1.LJIIIIZZ();
                            if (verifyDetailLJIIIIZZ == null || (str2 = verifyDetailLJIIIIZZ.merchantId) == null) {
                                str2 = "";
                            }
                            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("merchant_id", str2);
                            VerifyDetail verifyDetailLJIIIIZZ2 = c1713570uh1.LJIIIIZZ();
                            if (verifyDetailLJIIIIZZ2 == null || (str3 = verifyDetailLJIIIIZZ2.fpToken) == null) {
                                str3 = "";
                            }
                            Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("fp_token", str3);
                            VerifyDetail verifyDetailLJIIIIZZ3 = c1713570uh1.LJIIIIZZ();
                            if (verifyDetailLJIIIIZZ3 == null || (str4 = verifyDetailLJIIIIZZ3.merchantUserId) == null) {
                                str4 = "";
                            }
                            Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("merchant_user_id", str4).appendQueryParameter("locale", C1717770unn.LIZLLL().getCurrentLocaleStr(C786410Ut5.P3(c19eg))).appendQueryParameter("tux_theme", c1713570uh1.LIZ.LIZIZ.LIZLLL);
                            if (c1713570uh1.LIZ.LIZIZ.LIZ == EnumC1714450uiR.HALF_PAGE) {
                                str5 = "BOTTOM_SHEET";
                            } else {
                                str5 = "FULL_SCREEN";
                            }
                            Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("page_style", str5);
                            String str11 = c1713570uh1.LIZLLL.LIZJ;
                            if (str11 != null && (!a0.LJJJIL(str11))) {
                                builderAppendQueryParameter5.appendQueryParameter("switched_from", str11);
                            }
                            String str12 = c1713570uh1.LIZLLL.LIZLLL;
                            if (str12 != null && (!a0.LJJJIL(str12))) {
                                builderAppendQueryParameter5.appendQueryParameter("switched_to", str12);
                            }
                            Integer numLIZ = C1714260ui8.LIZ(c1713570uh1);
                            if (numLIZ != null) {
                                builderAppendQueryParameter5.appendQueryParameter("height", String.valueOf(numLIZ.intValue()));
                            }
                            String string = C1714260ui8.LIZJ(builderAppendQueryParameter5.build().toString(), uri, c1713570uh1).toString();
                            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                            SparkContext sparkContext = new SparkContext();
                            sparkContext.LJJLIIJ(string);
                            Pair[] pairArr = new Pair[6];
                            String str13 = c1713570uh1.LJIIIZ().verifyId;
                            if (str13 == null) {
                                str13 = "";
                            }
                            pairArr[0] = new Pair("verify_id", str13);
                            String strLIZIZ = c1713570uh1.LJ().LIZIZ();
                            if (strLIZIZ == null) {
                                strLIZIZ = "";
                            }
                            pairArr[1] = new Pair("session", strLIZIZ);
                            VerifyDetail verifyDetailLJIIIIZZ4 = c1713570uh1.LJIIIIZZ();
                            if (verifyDetailLJIIIIZZ4 == null || (str6 = verifyDetailLJIIIIZZ4.merchantId) == null) {
                                str6 = "";
                            }
                            pairArr[2] = new Pair("merchant_id", str6);
                            VerifyDetail verifyDetailLJIIIIZZ5 = c1713570uh1.LJIIIIZZ();
                            if (verifyDetailLJIIIIZZ5 == null || (str7 = verifyDetailLJIIIIZZ5.merchantUserId) == null) {
                                str7 = "";
                            }
                            pairArr[3] = new Pair("merchant_user_id", str7);
                            pairArr[4] = new Pair("locale", C1717770unn.LIZLLL().getCurrentLocaleStr(C786410Ut5.P3(c19eg)));
                            VerifyDetail verifyDetailLJIIIIZZ6 = c1713570uh1.LJIIIIZZ();
                            if (verifyDetailLJIIIIZZ6 == null || (str8 = verifyDetailLJIIIIZZ6.fpToken) == null) {
                                str8 = "";
                            }
                            pairArr[5] = new Pair("fp_token", str8);
                            sparkContext.LJJLIIIJILLIZJL(C2097608Jq.LJIIIIZZ(pairArr));
                            sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0uiH
                                @Override // X.AbstractC1542100qES
                                public final void LJLL(SparkContext sparkContext2) {
                                    InterfaceC1141530foN interfaceC1141530foN;
                                    if (sparkContext2 != null) {
                                        C1713570uh1 c1713570uh12 = c1713570uh1;
                                        C1714260ui8 c1714260ui8 = C1714260ui8.LIZ;
                                        String str14 = sparkContext2.containerId;
                                        c1714260ui8.getClass();
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("subscriber_");
                                        sbLIZ.append(str14);
                                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                                        Object obj = ((Map) c1713570uh12.LJFF.getValue()).get(strLIZIZ2);
                                        if ((obj instanceof InterfaceC1141530foN) && (interfaceC1141530foN = (InterfaceC1141530foN) obj) != null) {
                                            C1548820qPI.LJIIIIZZ("HYBRID_LAYOUT_MODULES_EVENTS", interfaceC1141530foN);
                                        }
                                        ((Map) c1713570uh12.LJFF.getValue()).remove(strLIZIZ2);
                                    }
                                    c1713570uh1.LJIILIIL.LIZ(new C1713690uhD((Fragment) null, "REJECT", str, (String) null, (String) null, (C1708530uYt) null, (Map) null, 249));
                                }

                                @Override // X.AbstractC1537870q7d
                                public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str14, String str15) {
                                    C1713680uhC c1713680uhC = c1713570uh1.LJIILIIL;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("web load failed: [");
                                    sbLIZ.append(str14);
                                    sbLIZ.append("]-[");
                                    sbLIZ.append(str15);
                                    sbLIZ.append(']');
                                    c1713680uhC.LIZ(C1713490ugt.LIZ(C2188811AlT.LIZIZ(sbLIZ), null, 6));
                                }
                            });
                            sparkContext.sendEventListener = new AwS204S1100000_26(c1713570uh1, str, 2);
                            String str14 = sparkContext.containerId;
                            C1776080wJq c1776080wJq = new C1776080wJq(c1713570uh1, 1);
                            C1548820qPI.LJFF("HYBRID_LAYOUT_MODULES_EVENTS", c1776080wJq, str14);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("subscriber_");
                            sbLIZ.append(str14);
                            c1713570uh1.LJIILJJIL(c1776080wJq, C2188811AlT.LIZIZ(sbLIZ));
                            c1537900q7g.getClass();
                            new C1541950qED(c19eg, sparkContext).LIZIZ();
                            return;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1AF0.LJFF(th, "vc open url");
                            C1713680uhC c1713680uhC = c1713570uh1.LJIILIIL;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("web load failed: [");
                            sbLIZ2.append(str);
                            sbLIZ2.append("]-[");
                            sbLIZ2.append(th);
                            sbLIZ2.append(']');
                            c1713680uhC.LIZ(C1713490ugt.LIZ(C2188811AlT.LIZIZ(sbLIZ2), null, 6));
                            return;
                        }
                    }
                    C1AF0.LIZJ("verifycenter schemalist no web and lynx");
                    return;
                }
                c1713570uh1.LJIILIIL.LIZ(C1713490ugt.LIZIZ("Null schema list"));
            }

            @Override // X.InterfaceC1713480ugs
            public final void LIZLLL(C19EG c19eg, C1713570uh1 c1713570uh1) {
                C1715530ukB c1715530ukB = C1715530ukB.LIZ;
                AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(c1713570uh1, 678);
                c1715530ukB.getClass();
                C1714230ui5.LIZLLL(new AwS270S0300000_26(c19eg, c1713570uh1, awS605S0100000_26, 150));
            }

            /* JADX WARN: Removed duplicated region for block: B:105:0x0229  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJ(X.C19EG r12, X.C1713570uh1 r13, java.lang.String r14) {
                /*
                    Method dump skipped, instruction units count: 582
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1714340uiG.LJ(X.19EG, X.0uh1, java.lang.String):void");
            }
        };
        if (atomicBoolean.compareAndSet(false, true)) {
            C1713600uh4.LIZLLL = c1713710uhF;
            C1713600uh4.LJ = interfaceC1713480ugs;
            C1713600uh4.LIZJ = interfaceC1713820uhQ;
            C1713600uh4.LJI = interfaceC1713610uh5;
            C1713600uh4.LJII = interfaceC1713510ugv;
            C1713600uh4.LJFF = interfaceC1713470ugr;
        }
    }

    public static void LJ(C1713570uh1 c1713570uh1) {
        k kVarLJJIIZ;
        String strLJIL;
        try {
            n nVar = c1713570uh1.LIZLLL().LIZ;
            if (nVar != null) {
                kVarLJJIIZ = nVar.LJJIIZ("priority_region");
            } else {
                kVarLJJIIZ = null;
            }
            String str = "";
            if (kVarLJJIIZ == null || (kVarLJJIIZ instanceof m)) {
                strLJIL = "";
            } else {
                strLJIL = kVarLJJIIZ.LJIL();
            }
            if (strLJIL.length() == 0) {
                strLJIL = C1717770unn.LJIIIIZZ().getCurrentRegionCode();
            }
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("priority_region", strLJIL);
            String str2 = c1713570uh1.LJIIIZ().verifyId;
            if (str2 != null) {
                str = str2;
            }
            pairArr[1] = new Pair("verify_id", str);
            c1713570uh1.LJIIJ = C1697810uHb.LJIIJJI(pairArr);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.verify.IPipoVerifyCenterService
    public final void LIZJ(String str) {
        if (str.length() > 0) {
            C1719290uqF.LIZIZ = str;
            C1719290uqF.LIZJ = System.currentTimeMillis();
        }
    }

    public static boolean LJI(String str, String str2) {
        if (Intrinsics.LJFF(str, str2)) {
            return true;
        }
        if (str != null) {
            if (u.LJIJI(str, str2, true)) {
                return true;
            }
        } else if (Intrinsics.LJFF(str2, "")) {
            return true;
        }
        if (Intrinsics.LJFF(str, "*")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.verify.IPipoVerifyCenterService
    public final boolean LIZ(C19EG c19eg, C1713520ugw c1713520ugw, InterfaceC1713650uh9 interfaceC1713650uh9) {
        int i;
        C1713750uhJ c1713750uhJ = new C1713750uhJ(0);
        c1713750uhJ.LJIIJ();
        c1713750uhJ.LIZJ = c1713520ugw;
        try {
            c1713750uhJ.LJIIIZ("init_verify_manager");
            LJFF();
            C1713750uhJ.LJIIIIZZ(c1713750uhJ, "init_verify_manager", 0, 6);
            c1713750uhJ.LJIIIZ("build_verify_context");
            C1713570uh1 c1713570uh1LIZ = C1713620uh6.LIZ(c1713520ugw, interfaceC1713650uh9);
            if (c1713570uh1LIZ != null) {
                i = 1;
            } else {
                i = 0;
            }
            C1713750uhJ.LJIIIIZZ(c1713750uhJ, "build_verify_context", i, 4);
            if (c1713570uh1LIZ != null) {
                c1713750uhJ.LIZIZ = c1713570uh1LIZ;
                c1713570uh1LIZ.LJIILJJIL(c1713750uhJ, "PIPO_VERIFICATION_TECH_TRACKER");
                c1713750uhJ.LJIIIZ("append_tracking_data");
                LJ(c1713570uh1LIZ);
                C1713750uhJ.LJIIIIZZ(c1713750uhJ, "append_tracking_data", 0, 6);
                c1713570uh1LIZ.LJIIZILJ(c19eg);
                return true;
            }
            C1713750uhJ.LJII(c1713750uhJ, false, null, false, 6);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC1713650uh9.LIZ(C1713490ugt.LIZ("verify Failed Unknown", th, 4));
            C1AF0.LJ(th);
            C1713750uhJ.LJII(c1713750uhJ, false, th.toString(), false, 2);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.verify.IPipoVerifyCenterService
    public final boolean LIZLLL(C19EG c19eg, String str, String str2, String str3, String str4, EnumC1714450uiR enumC1714450uiR, String str5, String str6, String str7, EnumC925903jd enumC925903jd, Float f, String str8, C1713860uhU c1713860uhU) {
        n nVar = new n();
        nVar.LJJIIJ("source_id", str2);
        nVar.LJJIIJ(Scene.SCENE_SERVICE, "BNPL");
        nVar.LJJIIJ("busi_type", "BNPL");
        nVar.LJJIIJ("country_code", str5);
        nVar.LJJIIJ("priority_region", str5);
        nVar.LJJIIJ("merchant_id", str3);
        nVar.LJJIIJ("merchant_user_id", str4);
        return LIZ(c19eg, new C1713520ugw(new C1713590uh3(new C1713840uhS(nVar, 2), str8, str), new C1714040uhm(enumC1714450uiR, f, enumC925903jd, str7, null, false, null, 112), new C1713540ugy(str6, 6)), c1713860uhU);
    }
}
