package com.ss.android.ugc.aweme.relation.auth;

import X.C2041307z9;
import X.C2188811AlT;
import X.EnumC1070410dxf;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class SuggestAuthPage__BindExtra {
    public static final int $stable = 0;

    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_relation_auth_SuggestAuthPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public SuggestAuthPage__BindExtra(SuggestAuthPage suggestAuthPage, Intent intent) {
        Object objINVOKEVIRTUAL_com_ss_android_ugc_aweme_relation_auth_SuggestAuthPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        Bundle bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_relation_auth_SuggestAuthPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_ss_android_ugc_aweme_relation_auth_SuggestAuthPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_relation_auth_SuggestAuthPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null && (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_relation_auth_SuggestAuthPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_ss_android_ugc_aweme_relation_auth_SuggestAuthPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundleINVOKEVIRTUAL_com_ss_android_ugc_aweme_relation_auth_SuggestAuthPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "auth_platform")) != null) {
            if (!(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_relation_auth_SuggestAuthPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof EnumC1070410dxf)) {
                if (objINVOKEVIRTUAL_com_ss_android_ugc_aweme_relation_auth_SuggestAuthPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
                    objINVOKEVIRTUAL_com_ss_android_ugc_aweme_relation_auth_SuggestAuthPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get = C2041307z9.LIZ(EnumC1070410dxf.class, (String) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_relation_auth_SuggestAuthPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Expecting ");
                    sbLIZ.append(EnumC1070410dxf.class);
                    sbLIZ.append(" but get ");
                    sbLIZ.append(objINVOKEVIRTUAL_com_ss_android_ugc_aweme_relation_auth_SuggestAuthPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get.getClass());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            suggestAuthPage.LLJJI = (EnumC1070410dxf) objINVOKEVIRTUAL_com_ss_android_ugc_aweme_relation_auth_SuggestAuthPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        }
    }

    public static Object INVOKEVIRTUAL_com_ss_android_ugc_aweme_relation_auth_SuggestAuthPage__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
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
