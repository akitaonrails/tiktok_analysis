package com.bytedance.sysoptimizer;

import X.C08PL;
import X.C0VSF;
import X.C2112108Pf;
import android.content.Context;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class ArtMProtectOpt {
    public static String TAG = "ArtMProtectOpt";

    public static native int nMemmapSetDebugNameOpt();

    public static native int nStartPharse1(int i, int i2);

    public static native int nStartPharse2();

    public static int memmapSetDebugNameOpt(Context context) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            C2112108Pf c2112108Pf = new C2112108Pf();
            c2112108Pf.LIZ = C08PL.SHARED.value;
            c2112108Pf.LIZIZ = true;
            ShadowHook.init(c2112108Pf.LIZ());
            return nMemmapSetDebugNameOpt();
        }
        return -1;
    }

    public static int startPharse1(Context context) {
        String strSubstring;
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            String strSubstring2 = null;
            try {
                BufferedReader bufferedReader = new BufferedReader(new C0VSF("/proc/self/maps"));
                strSubstring = null;
                boolean z = false;
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.contains("dalvik-main space")) {
                            String[] strArrSplit = line.split("\\s+")[0].split("-");
                            if (!z) {
                                strSubstring2 = strArrSplit[0];
                                z = true;
                            }
                            strSubstring = strArrSplit[1];
                        } else if (z) {
                            break;
                        }
                    } catch (IOException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                bufferedReader.close();
            } catch (IOException e2) {
                e = e2;
                strSubstring = null;
            }
            ByteHook.init();
            if (strSubstring2 != null && strSubstring != null) {
                if (strSubstring2.startsWith("0x")) {
                    strSubstring2 = strSubstring2.substring(2);
                }
                if (strSubstring.startsWith("0x")) {
                    strSubstring = strSubstring.substring(2);
                }
                return nStartPharse1((int) CastLongProtector.parseLong(strSubstring2, 16), (int) CastLongProtector.parseLong(strSubstring, 16));
            }
        }
        return -1;
    }

    public static int startPharse2(Context context) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            return nStartPharse2();
        }
        return -1;
    }

    public static int startPharse1(Context context, int i, int i2) {
        if (SysOptimizer.loadOptimizerLibrary(context)) {
            ByteHook.init();
            return nStartPharse1(i, i2);
        }
        return -1;
    }
}
