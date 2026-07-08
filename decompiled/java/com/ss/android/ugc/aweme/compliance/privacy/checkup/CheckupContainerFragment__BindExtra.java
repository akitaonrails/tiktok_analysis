package com.ss.android.ugc.aweme.compliance.privacy.checkup;

import X.C2188811AlT;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class CheckupContainerFragment__BindExtra {
    public static final int $stable = 0;

    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_checkup_CheckupContainerFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public CheckupContainerFragment__BindExtra(CheckupContainerFragment checkupContainerFragment, Intent intent) {
        Object objINVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_checkup_CheckupContainerFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_checkup_CheckupContainerFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_checkup_CheckupContainerFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_checkup_CheckupContainerFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null && (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_checkup_CheckupContainerFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_checkup_CheckupContainerFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_checkup_CheckupContainerFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "enter_from")) != null) {
            if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_checkup_CheckupContainerFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
                checkupContainerFragment.getClass();
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expecting ");
            sbLIZ.append(String.class);
            sbLIZ.append(" but get ");
            sbLIZ.append(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_checkup_CheckupContainerFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get.getClass());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_privacy_checkup_CheckupContainerFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
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
