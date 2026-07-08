package com.lynx.tasm.utils;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxEnv;

/* JADX INFO: loaded from: classes21.dex */
public class DeviceUtils {
    public static boolean LIZ = false;
    public static boolean LIZIZ = false;
    public static int LIZJ = -1;
    public static String LIZLLL;
    public static Typeface LJ;
    public static boolean LJFF;

    public static synchronized Typeface LIZ() {
        if (!LIZIZ()) {
            return null;
        }
        if (LJFF) {
            return LJ;
        }
        try {
            TextPaint paint = new TextView(LynxEnv.inst().getAppContext()).getPaint();
            if (paint != null) {
                LJ = paint.getTypeface();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("Lynx", "get default typeface failed");
        }
        LJFF = true;
        return LJ;
    }

    public static synchronized boolean LIZIZ() {
        if (LIZ) {
        } else {
            try {
                Class.forName("miui.os.Build");
                LIZIZ = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LIZ = true;
        }
        return LIZIZ;
    }

    public static boolean is64BitDevice() {
        if (LIZJ == -1) {
            if (LIZLLL == null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    if (Build.SUPPORTED_ABIS.length > 0) {
                        int i = 0;
                        while (true) {
                            String[] strArr = Build.SUPPORTED_ABIS;
                            if (i >= strArr.length) {
                                break;
                            }
                            sb.append(strArr[i]);
                            if (i != strArr.length - 1) {
                                sb.append(", ");
                            }
                            i++;
                        }
                    } else {
                        sb = new StringBuilder(Build.CPU_ABI);
                    }
                    if (android.text.TextUtils.isEmpty(sb.toString())) {
                        LIZLLL = "unknown";
                    }
                    LIZLLL = sb.toString();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    LynxLog.e("DeviceUtils", "Lynx get unknown CPU ABIs");
                    LIZLLL = "unknown";
                }
            }
            LIZJ = LIZLLL.contains("64") ? 1 : 0;
        }
        return LIZJ == 1;
    }
}
