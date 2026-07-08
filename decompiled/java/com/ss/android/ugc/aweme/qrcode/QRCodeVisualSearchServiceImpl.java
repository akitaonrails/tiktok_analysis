package com.ss.android.ugc.aweme.qrcode;

import X.C098200Yq;
import X.C0WOD;
import X.C0WR3;
import X.C0WZX;
import X.C10Z0;
import X.C10Z2;
import X.C10Z7;
import X.C10Z8;
import X.C10Z9;
import X.C1388190mED;
import X.C1701330uNH;
import X.C1879390z0T;
import X.C189200o6;
import X.C1893880zNq;
import X.C1893890zNr;
import X.C1893910zNt;
import X.C1909590znB;
import X.C19272310aX;
import X.C19276910bH;
import X.C2162308dZ;
import X.C2204961BRm;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.governance.tool.api.IControlService;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.qrcode.ICQrcodeService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
public final class QRCodeVisualSearchServiceImpl implements IQRCodeServiceForVisualSearch {
    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch
    public final void LIZJ() {
        C0WOD.LIZ.getClass();
        IControlService iControlServiceLIZ = C0WOD.LIZ();
        if (iControlServiceLIZ != null) {
            iControlServiceLIZ.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch
    public final boolean LIZ(String str) {
        Object c098200Yq;
        if (!URLUtil.isValidUrl(str)) {
            return false;
        }
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri == null) {
            return false;
        }
        return Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ttam_open_outside"), "true");
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch
    public final String LIZIZ(String str) {
        if (C0WR3.LIZ(str)) {
            return C10Z0.LIZIZ(str);
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch
    public final String LIZLLL(String str) {
        if (!u.LJJIIJZLJL(str, "sslocal://microapp", true) && !u.LJJIIJZLJL(str, "sslocal://microgame", true)) {
            return str;
        }
        String strLIZ = C10Z0.LIZ(str);
        if (!a0.LJJJIL(strLIZ)) {
            return strLIZ;
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch
    public final boolean LJII(String str) {
        return C0WR3.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch
    public final boolean LJIIIIZZ(String str) {
        return u.LJJIIJZLJL(str, "tt_deeplink:", true);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch
    public final boolean LJIIIZ(String str) {
        return C0WR3.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch
    public final boolean LJIIL(String str) {
        C0WOD.LIZ.getClass();
        return C0WOD.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch
    public final boolean LJFF(Context context, String str) {
        String strSubstring;
        String string;
        Object c098200Yq;
        Object c098200Yq2;
        if (!LJIIIIZZ(str)) {
            str = null;
        }
        if (str == null || (strSubstring = str.substring(12)) == null || (string = a0.LJLIIIL(strSubstring).toString()) == null) {
            return false;
        }
        try {
            c098200Yq = UriProtector.parse(string);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri == null) {
            return false;
        }
        Intent data = new Intent("android.intent.action.VIEW").setData(uri);
        if (C2162308dZ.LJ(context, data)) {
            try {
                if (C1388190mED.LIZ(context) == null) {
                    data.addFlags(268435456);
                }
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, data, "Context_startActivity_1");
                C1701330uNH.LIZ(data, context);
                C2204961BRm.LJJJJJL(context, data, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPu6YJDK2XxRQVG6DkHHE0eT6Sr3qVIGQTxkLlr9UjLyae2mHw==", null));
                c098200Yq2 = Boolean.TRUE;
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = bool;
            }
            return ((Boolean) c098200Yq2).booleanValue();
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ == null) {
            return false;
        }
        ICQrcodeService iCQrcodeService = (ICQrcodeService) PluggableExtentionKt.pluggableSpi$default(ICQrcodeService.class, false, false, false, 14, null);
        if (iCQrcodeService != null) {
            iCQrcodeService.LIZIZ(activityLIZ);
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch
    public final boolean LJIIJJI(Activity activity, String str) {
        String strDecode;
        Object c098200Yq;
        Object c098200Yq2;
        QrCodeScanService qrCodeScanService;
        Object obj = "";
        if (a0.LJJJIL(str) || (strDecode = Uri.decode(str)) == null || a0.LJJJIL(strDecode)) {
            return true;
        }
        try {
            c098200Yq = UriProtector.parse(strDecode);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri == null) {
            return true;
        }
        try {
            if (!uri.isHierarchical() || (c098200Yq2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "min_app_version")) == null) {
                c098200Yq2 = "";
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj = c098200Yq2;
        }
        if (((String) obj).length() == 0 || (qrCodeScanService = (QrCodeScanService) PluggableExtentionKt.pluggableSpi$default(QrCodeScanService.class, false, false, false, 14, null)) == null) {
            return true;
        }
        return !qrCodeScanService.checkIsMinAppVersionNotSatisfied(activity, r3, uri.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0097 A[PHI: r2
      0x0097: PHI (r2v6 android.content.Context) = (r2v0 android.content.Context), (r2v8 android.content.Context) binds: [B:10:0x0050, B:15:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(android.content.Context r30, java.lang.String r31) {
        /*
            r29 = this;
            android.app.Activity r2 = X.C1388190mED.LIZ(r30)
            r12 = 0
            if (r2 != 0) goto L8
            return r12
        L8:
            X.0WZX r1 = new X.0WZX     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPu6YJDK2XxRQVG6DkHHE0eT6Sr3qVIGQTxkLlr9UjLyae2mHw=="
            r8 = 0
            r1.<init>(r0, r8)     // Catch: java.lang.Throwable -> L9a
            X.0WST r4 = new X.0WST     // Catch: java.lang.Throwable -> L9a
            r4.<init>()     // Catch: java.lang.Throwable -> L9a
            r0 = 2
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L9a
            r9[r12] = r2     // Catch: java.lang.Throwable -> L9a
            r20 = 1
            r9[r20] = r31     // Catch: java.lang.Throwable -> L9a
            X.0WZW r11 = new X.0WZW     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "(Landroid/content/Context;Ljava/lang/String;)V"
            r11.<init>(r12, r0, r1)     // Catch: java.lang.Throwable -> L9a
            r5 = 11098(0x2b5a, float:1.5552E-41)
            java.lang.String r23 = "com/ss/android/ugc/aweme/qrcode/TextQRCodeActivity"
            java.lang.String r24 = "startActivity"
            java.lang.Class<com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity> r25 = com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity.class
            java.lang.String r27 = "void"
            r21 = r4
            r22 = r5
            r26 = r9
            r28 = r11
            X.0WSU r1 = r21.LIZIZ(r22, r23, r24, r25, r26, r27, r28)     // Catch: java.lang.Throwable -> L9a
            boolean r0 = r1.LIZ     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L4e
            java.lang.String r6 = "com/ss/android/ugc/aweme/qrcode/TextQRCodeActivity"
            java.lang.String r7 = "startActivity"
            java.lang.Class<com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity> r10 = com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity.class
            r4.LIZ(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9a
        L48:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L9a
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L9a
            goto La6
        L4e:
            java.lang.Object[] r1 = r1.LIZJ     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto L97
            r0 = r1[r12]     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L59
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Throwable -> L9a
        L59:
            r1 = r1[r20]     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto L97
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L9a
        L5f:
            java.lang.String r0 = com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity._pnsPageId     // Catch: java.lang.Throwable -> L9a
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L9a
            java.lang.Class<com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity> r0 = com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity.class
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "intent_extra_content"
            r3.putExtra(r0, r1)     // Catch: java.lang.Throwable -> L9a
            com.bytedance.router.monitor.RouterPageMonitor r0 = com.bytedance.router.monitor.RouterPageMonitor.INSTANCE     // Catch: java.lang.Throwable -> L9a
            com.bytedance.router.monitor.page.IRouterPageEventDispatcher r1 = r0.getDispatcher()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "Context_startActivity_1"
            r1.dispatchActivityOpReached(r2, r3, r0)     // Catch: java.lang.Throwable -> L9a
            X.C1701330uNH.LIZ(r3, r2)     // Catch: java.lang.Throwable -> L9a
            X.0WZX r1 = new X.0WZX     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPu6YJDK2XxUdmqhO3bSFVCDySXQpUUd9U0="
            r1.<init>(r0, r8)     // Catch: java.lang.Throwable -> L9a
            X.C2204961BRm.LJJJJJL(r2, r3, r1)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r14 = "com/ss/android/ugc/aweme/qrcode/TextQRCodeActivity"
            java.lang.String r15 = "startActivity"
            java.lang.Class<com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity> r18 = com.ss.android.ugc.aweme.qrcode.TextQRCodeActivity.class
            r12 = r4
            r13 = r5
            r16 = r8
            r17 = r9
            r19 = r11
            r12.LIZ(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L9a
            goto L48
        L97:
            r1 = r31
            goto L5f
        L9a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        La6:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto Laf
            r2 = r1
        Laf:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qrcode.QRCodeVisualSearchServiceImpl.LJIILIIL(android.content.Context, java.lang.String):boolean");
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch
    public final boolean LJ(Context context, int i, String str) {
        Object c098200Yq;
        try {
            new C1909590znB().LIZ(context, str);
            c098200Yq = Boolean.TRUE;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch
    public final boolean LJI(Context context, String str, int i, String str2) {
        if (new C10Z9().LIZIZ(i, str) || new C10Z7().LIZIZ(i, str) || new C10Z8().LIZIZ(i, str) || new C19276910bH(new C19272310aX(context, str2, this)).LIZIZ(i, str)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.IQRCodeServiceForVisualSearch
    public final boolean LJIIJ(Context context, String str, int i, String str2) {
        Object c098200Yq;
        if (C0WR3.LIZIZ(str)) {
            try {
                c098200Yq = UriProtector.parse(str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Uri uri = (Uri) c098200Yq;
            if (uri != null) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "app_effect_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                str = uri.buildUpon().appendQueryParameter("schema_type", "9").appendQueryParameter("object_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).build().toString();
            }
        }
        if (new C10Z9().LIZIZ(i, str) || ComplianceServiceProvider.LJIIJJI().LJIIJJI(str)) {
            return true;
        }
        C19272310aX c19272310aX = new C19272310aX(context, str2, this);
        if (new C1893910zNt(c19272310aX).LIZIZ(i, str) || new C1893890zNr(c19272310aX).LIZIZ(i, str) || new C1893880zNq(c19272310aX).LIZIZ(i, str) || new C10Z2(c19272310aX).LIZIZ(i, str) || new C1879390z0T(c19272310aX).LIZIZ(i, str)) {
            return true;
        }
        return false;
    }
}
