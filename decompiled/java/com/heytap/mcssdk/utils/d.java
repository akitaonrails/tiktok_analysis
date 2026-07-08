package com.heytap.mcssdk.utils;

import android.content.Context;
import android.provider.Settings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static final boolean a() {
        try {
            String strA = h.a("ro.build.characteristics");
            if (strA != null) {
                return strA.contains("tablet");
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static final boolean a(Context context) {
        return -1 != b(context);
    }

    public static final int b(Context context) {
        int i = -1;
        try {
            i = Settings.Global.getInt(context.getContentResolver(), "oplus_system_folding_mode", -1);
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }
}
