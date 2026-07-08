package com.ss.android.ugc.aweme.ml.utils;

import X.C099M;
import X.C099Q;
import X.C099R;
import X.C189200o6;
import X.C2252611DEt;
import X.C443120HZe;
import X.C844470XAv;
import X.C892820Z0u;
import X.InterfaceC1364105Vn;
import X.InterfaceC20236714Gf;
import X.InterfaceC882520Yji;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYRequestConfig;
import kotlin.Pair;

/* JADX INFO: loaded from: classes24.dex */
public final class PitayaResourceHelper {
    public static final PitayaResourceHelper LIZ = new PitayaResourceHelper();

    public static void LIZ(String str, final InterfaceC882520Yji interfaceC882520Yji) {
        C844470XAv.LIZ.getClass();
        PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ)).downloadPackage(str, new PTYPackageCallback() { // from class: com.ss.android.ugc.aweme.ml.utils.PitayaResourceHelper$downloadResource$1
            @Override // com.bytedance.pitaya.api.PTYPackageCallback
            public void onResult(boolean z, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
                String summary;
                if (z) {
                    InterfaceC882520Yji interfaceC882520Yji2 = interfaceC882520Yji;
                    if (interfaceC882520Yji2 != null) {
                        interfaceC882520Yji2.onSuccess(pTYPackageInfo);
                        return;
                    }
                    return;
                }
                InterfaceC882520Yji interfaceC882520Yji3 = interfaceC882520Yji;
                if (interfaceC882520Yji3 == null) {
                    return;
                }
                if (pTYError == null || (summary = pTYError.getSummary()) == null) {
                    summary = "";
                }
                interfaceC882520Yji3.LIZ(new C892820Z0u(summary, "runtime"));
            }
        });
    }

    public static Object LIZJ(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C844470XAv.LIZ.getClass();
        PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ)).queryPackage(str, new PTYPackageCallback() { // from class: com.ss.android.ugc.aweme.ml.utils.PitayaResourceHelper$queryPackage$2$1
            @Override // com.bytedance.pitaya.api.PTYPackageCallback
            public void onResult(boolean z, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
                InterfaceC20236714Gf<C443120HZe<Boolean, PTYError, PTYPackageInfo>> interfaceC20236714Gf = c2252611DEt;
                C443120HZe c443120HZe = new C443120HZe(Boolean.valueOf(z), pTYError, pTYPackageInfo);
                C189200o6.m2constructorimpl(c443120HZe);
                interfaceC20236714Gf.resumeWith(c443120HZe);
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static Object LIZLLL(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C844470XAv.LIZ.getClass();
        PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ)).requestUpdate(str, new PTYRequestConfig(true, null), new PTYPackageCallback() { // from class: com.ss.android.ugc.aweme.ml.utils.PitayaResourceHelper$updatePackage$2$1
            @Override // com.bytedance.pitaya.api.PTYPackageCallback
            public void onResult(boolean z, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
                InterfaceC20236714Gf<Pair<Boolean, PTYError>> interfaceC20236714Gf = c2252611DEt;
                Pair pair = new Pair(Boolean.valueOf(z), pTYError);
                C189200o6.m2constructorimpl(pair);
                interfaceC20236714Gf.resumeWith(pair);
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r11, boolean r12, X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.Boolean, ? extends java.lang.Throwable>> r13) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.utils.PitayaResourceHelper.LIZIZ(java.lang.String, boolean, X.05Vn):java.lang.Object");
    }
}
