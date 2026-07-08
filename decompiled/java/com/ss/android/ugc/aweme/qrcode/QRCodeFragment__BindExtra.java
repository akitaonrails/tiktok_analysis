package com.ss.android.ugc.aweme.qrcode;

import X.C2041307z9;
import X.C20697115yr;
import X.C2188811AlT;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class QRCodeFragment__BindExtra {
    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public QRCodeFragment__BindExtra(QRCodeFragment qRCodeFragment, Intent intent) {
        Object objINVOKEVIRTUAL_com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null && (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "extra_params")) != null) {
            if (!(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof C20697115yr)) {
                if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
                    objINVOKEVIRTUAL_com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get = C2041307z9.LIZ(C20697115yr.class, (String) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Expecting ");
                    sbLIZ.append(C20697115yr.class);
                    sbLIZ.append(" but get ");
                    sbLIZ.append(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get.getClass());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            qRCodeFragment.LLJ = (C20697115yr) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }
}
