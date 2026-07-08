package com.ss.android.utils;

import X.C0VSF;
import X.C0WZX;
import X.C2204961BRm;
import X.C2484209oO;
import X.C786410Ut5;
import android.app.ActivityManager;
import android.os.Build;
import android.os.Debug;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEContentProviderUtils;
import java.io.BufferedReader;

/* JADX INFO: loaded from: classes4.dex */
public class TEDeviceInformation {
    public static String getCPUModel() {
        String strTrim;
        if (Build.VERSION.SDK_INT >= 31) {
            return Build.SOC_MODEL;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new C0VSF("/proc/cpuinfo"));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return null;
                }
                String[] strArrSplit = line.split(":");
                if (strArrSplit.length > 1) {
                    String strReplace = strArrSplit[0].trim().replace(" ", "_");
                    strTrim = strArrSplit[1].trim();
                    if (strReplace.equals("Processor") || strTrim.contains("ARMv")) {
                        break;
                    }
                }
            }
            return strTrim;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LIZLLL("TEUtil", e.getLocalizedMessage(), e);
            return null;
        }
    }

    public static Integer gpuUsed() {
        return CastIntegerProtector.valueOf(new Debug.MemoryInfo().getMemoryStat("summary.graphics"));
    }

    public static Integer memNative() {
        return CastIntegerProtector.valueOf(new Debug.MemoryInfo().getMemoryStat("summary.native-heap"));
    }

    public static long availMemMemory() {
        ActivityManager activityManager = (ActivityManager) C786410Ut5.G2(TEContentProviderUtils.getApplicationContext(), "activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEhEpEcvSUUUuTBbKc8BtVWt3SEIXY/yhYJrn0jT12okunx4kFA==", null));
        return memoryInfo.availMem;
    }

    public static long memThreshold() {
        ActivityManager activityManager = (ActivityManager) C786410Ut5.G2(TEContentProviderUtils.getApplicationContext(), "activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEhEpEcvSUUUuTBbKc8BtVWt3SEIXY/yhYJrn0jT12okunx4kFA==", null));
        return memoryInfo.threshold;
    }

    public static long memTotal() {
        ActivityManager activityManager = (ActivityManager) C786410Ut5.G2(TEContentProviderUtils.getApplicationContext(), "activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEhEpEcvSUUUuTBbKc8BtVWt3SEIXY/yhYJrn0jT12okunx4kFA==", null));
        return memoryInfo.totalMem;
    }
}
