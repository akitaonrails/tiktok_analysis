package duo;

import X.C0WZX;
import X.C20644086w;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static BatteryManager LIZ;

    static {
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public static BatteryManager LIZ(Context context) {
        if (LIZ == null) {
            synchronized (b.class) {
                try {
                    if (LIZ == null) {
                        LIZ = (BatteryManager) C786410Ut5.H2(context, "batterymanager");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static long LIZIZ(Context context) {
        BatteryManager batteryManagerLIZ;
        if (context == null || (batteryManagerLIZ = LIZ(context)) == null) {
            return -1L;
        }
        return C2204961BRm.LLD(batteryManagerLIZ, 4, new C0WZX("dzBzEhEpEd7UWkVvcRqLdNhewgBO", null));
    }

    public static float LIZJ(Context context) {
        BatteryManager batteryManagerLIZ;
        if (context == null || (batteryManagerLIZ = LIZ(context)) == null) {
            return -1.0f;
        }
        float fLLD = C2204961BRm.LLD(batteryManagerLIZ, 2, new C0WZX("dzBzEhEpEd7UWkVvcRqLdNhewgBO", null));
        if (fLLD < -1.0E7f || fLLD > 1.0E7f) {
            return -1.0f;
        }
        if (!C20644086w.LIZJ() && !C20644086w.LIZIZ()) {
            if (C20644086w.LIZ()) {
                if (fLLD > 10000.0f) {
                    return fLLD / 1000.0f;
                }
                return fLLD;
            }
            return fLLD / 1000.0f;
        }
        if (fLLD < -10000.0f) {
            fLLD /= 1000.0f;
        }
        return -fLLD;
    }

    public static float LIZLLL(Context context) {
        Intent intentLJIJJ;
        if (context == null || (intentLJIJJ = C786410Ut5.LJIJJ(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1.0f;
        }
        return intentLJIJJ.getIntExtra("voltage", -1) / 1000.0f;
    }
}
