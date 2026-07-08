package com.ttnet.org.chromium.base;

import X.AbstractC2161208dO;
import X.C0WZX;
import X.C2161308dP;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C787230UuP;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class SysUtils {
    public static Boolean LIZ;
    public static Integer LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r1 <= 1024) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        android.os.StrictMode.setThreadPolicy(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r1 = java.lang.Integer.parseInt(r1.group(1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ() {
        /*
            java.lang.String r0 = "^MemTotal:\\s+([0-9]+) kB$"
            java.util.regex.Pattern r5 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
            android.os.StrictMode$ThreadPolicy r4 = android.os.StrictMode.allowThreadDiskReads()
            X.0VSF r3 = new X.0VSF     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5d
            java.lang.String r0 = "/proc/meminfo"
            r3.<init>(r0)     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5d
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4c
        L16:
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L3d
            java.util.regex.Matcher r1 = r5.matcher(r0)     // Catch: java.lang.Throwable -> L44
            boolean r0 = r1.find()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L16
            r0 = 1
            java.lang.String r0 = r1.group(r0)     // Catch: java.lang.Throwable -> L44
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L44
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 <= r0) goto L3d
            r2.close()     // Catch: java.lang.Throwable -> L4c
            r3.close()     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5d
            android.os.StrictMode.setThreadPolicy(r4)
            return r1
        L3d:
            r2.close()     // Catch: java.lang.Throwable -> L4c
            r3.close()     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5d
            goto L58
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L44
            r2.close()     // Catch: java.lang.Throwable -> L4c
            throw r0     // Catch: java.lang.Throwable -> L4c
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4c
            r3.close()     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5d
            throw r0     // Catch: java.lang.Exception -> L54 java.lang.Throwable -> L5d
        L54:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5d
        L58:
            android.os.StrictMode.setThreadPolicy(r4)
            r0 = 0
            return r0
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5d
            android.os.StrictMode.setThreadPolicy(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.SysUtils.LIZ():int");
    }

    public static int amountOfPhysicalMemoryKB() {
        if (LIZIZ == null) {
            LIZIZ = Integer.valueOf(LIZ());
        }
        return LIZIZ.intValue();
    }

    public static boolean isCurrentlyLowMemory() {
        ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(C787230UuP.LIZ, "activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb7UzFo87lLyM+ss3RS", null));
        return memoryInfo.lowMemory;
    }

    public static boolean isLowEndDevice() {
        if (LIZ == null) {
            AtomicReference<AbstractC2161208dO> atomicReference = AbstractC2161208dO.LIZ;
            boolean z = true;
            if (!atomicReference.get().LIZ()) {
                if (atomicReference.get().LIZ()) {
                    z = false;
                } else {
                    Integer numValueOf = Integer.valueOf(LIZ());
                    LIZIZ = numValueOf;
                    boolean z2 = numValueOf.intValue() > 0 && (Build.VERSION.SDK_INT < 26 ? LIZIZ.intValue() / 1024 <= 512 : LIZIZ.intValue() / 1024 <= 1024);
                    Context context = C787230UuP.LIZ;
                    C2161308dP.LIZ.LIZIZ(1, z2 == (context != null ? ((ActivityManager) C786410Ut5.H2(context, "activity")).isLowRamDevice() : false) ? 1 : 0, 0, 0, 0, "Android.SysUtilsLowEndMatches");
                    z = z2;
                }
            }
            LIZ = Boolean.valueOf(z);
        }
        return LIZ.booleanValue();
    }
}
