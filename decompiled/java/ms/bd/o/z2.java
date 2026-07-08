package ms.bd.o;

import X.C786410Ut5;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class z2 {
    public static volatile z2 LIZJ;
    public final Context LIZ;
    public List<Integer> LIZIZ = new ArrayList();

    public z2(Context context) {
        this.LIZ = null;
        this.LIZ = context;
    }

    public static z2 LIZ(Context context) {
        if (LIZJ == null) {
            synchronized (z2.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new z2(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final int LIZIZ() throws Exception {
        if (C786410Ut5.LJIJJ(this.LIZ, null, new IntentFilter((String) k.a(16777217, 0, 0L, "1d5603", new byte[]{33, 104, 66, 80, 0, 45, 54, 11, 109, 104, 52, 99, 72, 86, 65, 37, 49, 81, 109, 105, 46, 40, 100, 99, 59, 16, 23, 119, 93, 89, 3, 78, 103, 108, 40, 1, 22}))) == null) {
            return -1;
        }
        return Math.round(((r2.getIntExtra((String) k.a(16777217, 0, 0L, "955fae", new byte[]{36, 50, 80, 23, 82}), -1) / r2.getIntExtra((String) k.a(16777217, 0, 0L, "af00c5", new byte[]{99, 103, 66, 72, 89}), -1)) * 100.0f) * 10.0f) / 10;
    }

    public final int LIZJ() throws Exception {
        Intent intentLJIJJ = C786410Ut5.LJIJJ(this.LIZ, null, new IntentFilter((String) k.a(16777217, 0, 0L, "587340", new byte[]{37, 52, 64, 85, 4, 46, 50, 87, 111, 109, 48, 63, 74, 83, 69, 38, 53, 13, 111, 108, 42, 116, 102, 102, 63, 19, 19, 43, 95, 92, 7, 18, 101, 105, 44, 2, 18})));
        if (intentLJIJJ == null) {
            return -1;
        }
        return intentLJIJJ.getIntExtra((String) k.a(16777217, 0, 0L, "af87a8", new byte[]{96, 104, 94, 68, 89, 42, 102}), -1);
    }
}
