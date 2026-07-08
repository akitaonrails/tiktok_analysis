package com.heytap.mcssdk.utils;

import X.C2188811AlT;
import X.C786410Ut5;
import X.C810670Vr7;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.PushService;

/* JADX INFO: loaded from: classes14.dex */
public class g {
    public Context e;
    public SharedPreferences f;
    public Object g;

    public static class a {
        public static g a = new g();
    }

    private Context a(Context context) {
        boolean zA = com.heytap.mcssdk.utils.a.a();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fbeVersion is ");
        sbLIZ.append(zA);
        e.b(C2188811AlT.LIZIZ(sbLIZ));
        return (!zA || Build.VERSION.SDK_INT < 24) ? C786410Ut5.N3(context) : context.createDeviceProtectedStorageContext();
    }

    public static g f() {
        return a.a;
    }

    private SharedPreferences g() {
        Context context;
        SharedPreferences sharedPreferences = this.f;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        synchronized (this.g) {
            try {
                SharedPreferences sharedPreferences2 = this.f;
                if (sharedPreferences2 != null || (context = this.e) == null) {
                    return sharedPreferences2;
                }
                SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "shared_msg_sdk");
                this.f = sharedPreferencesLIZJ;
                return sharedPreferencesLIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void a(String str) {
        SharedPreferences sharedPreferencesG = g();
        if (sharedPreferencesG != null) {
            sharedPreferencesG.edit().putString("decryptTag", str).commit();
        }
    }

    public void a(boolean z) {
        SharedPreferences sharedPreferencesG = g();
        if (sharedPreferencesG != null) {
            sharedPreferencesG.edit().putBoolean("hasDefaultChannelCreated", z).commit();
        }
    }

    public boolean a() {
        SharedPreferences sharedPreferencesG = g();
        if (sharedPreferencesG != null) {
            return sharedPreferencesG.getBoolean("hasDefaultChannelCreated", false);
        }
        return false;
    }

    public String b() {
        SharedPreferences sharedPreferencesG = g();
        return sharedPreferencesG != null ? sharedPreferencesG.getString("decryptTag", "DES") : "DES";
    }

    public int c() {
        SharedPreferences sharedPreferencesG = g();
        if (sharedPreferencesG != null) {
            return sharedPreferencesG.getInt("registerTimeoutCount", 0);
        }
        return 0;
    }

    public void d() {
        SharedPreferences sharedPreferencesG = g();
        if (sharedPreferencesG != null) {
            sharedPreferencesG.edit().putInt("registerTimeoutCount", c() + 1).commit();
        }
    }

    public void e() {
        SharedPreferences sharedPreferencesG = g();
        if (sharedPreferencesG != null) {
            sharedPreferencesG.edit().putInt("registerTimeoutCount", 0).commit();
        }
    }

    public g() {
        this.g = new Object();
        Context context = PushService.a.a.getContext();
        if (context != null) {
            this.e = a(context);
        }
        Context context2 = this.e;
        if (context2 != null) {
            this.f = C810670Vr7.LIZJ(context2, 0, "shared_msg_sdk");
        }
    }
}
