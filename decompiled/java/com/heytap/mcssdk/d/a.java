package com.heytap.mcssdk.d;

import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.msp.push.mode.BaseMode;

/* JADX INFO: loaded from: classes14.dex */
public class a extends d {
    public static final String a = "a";

    @Override // com.heytap.mcssdk.d.e
    public BaseMode a(Context context, int i, Intent intent) {
        if (4105 == i) {
            return a(intent, i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.heytap.mcssdk.d.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.heytap.msp.push.mode.BaseMode a(android.content.Intent r10, int r11) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.mcssdk.d.a.a(android.content.Intent, int):com.heytap.msp.push.mode.BaseMode");
    }

    public static String INVOKEVIRTUAL_com_heytap_mcssdk_d_a_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
