package com.bytedance.codecx.base;

import X.C0VSJ;
import X.C0VSP;
import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes4.dex */
public class CodecXDeviceInfoAndroid {
    public static final FileFilter CPU_FILTER = new FileFilter() { // from class: com.bytedance.codecx.base.CodecXDeviceInfoAndroid.1
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };
    public static String sCpuModel = "";

    public static int getNumberOfCPUCores() throws Throwable {
        int length = -1;
        try {
            int coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/possible");
            if (coresFromFileInfo == -1) {
                coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/present");
            }
            if (coresFromFileInfo != -1) {
                return coresFromFileInfo;
            }
            File[] fileArrListFiles = new C0VSJ("/sys/devices/system/cpu/").listFiles(CPU_FILTER);
            if (fileArrListFiles != null) {
                length = fileArrListFiles.length;
                return length;
            }
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (SecurityException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return length;
        }
        return length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.InputStream, java.lang.Process] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0076 -> B:65:0x0079). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String GetCpuModel() throws java.lang.Throwable {
        /*
            java.lang.String r0 = com.bytedance.codecx.base.CodecXDeviceInfoAndroid.sCpuModel
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb
            java.lang.String r0 = com.bytedance.codecx.base.CodecXDeviceInfoAndroid.sCpuModel
            return r0
        Lb:
            java.lang.String r5 = ""
            r4 = 0
            java.lang.ProcessBuilder r2 = new java.lang.ProcessBuilder     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L60
            java.lang.String r1 = "/system/bin/cat"
            java.lang.String r0 = "/proc/cpuinfo"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L60
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L60
            java.lang.Process r3 = r2.start()     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L60
            java.io.InputStream r4 = r3.getInputStream()     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L8a
            if (r4 == 0) goto L4d
            java.util.Scanner r2 = new java.util.Scanner     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L8a
            java.lang.String r0 = "UTF-8"
            r2.<init>(r4, r0)     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L8a
            java.lang.String r1 = "Hardware[\\s]*:[\\s]*([\\S\\s]*)\n"
            r0 = 3000(0xbb8, float:4.204E-42)
            java.lang.String r0 = r2.findWithinHorizon(r1, r0)     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L8a
            if (r0 == 0) goto L4a
            java.util.regex.MatchResult r1 = r2.match()     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L8a
            int r0 = r1.groupCount()     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L8a
            if (r0 <= 0) goto L4a
            r0 = 1
            java.lang.String r5 = r1.group(r0)     // Catch: java.lang.NumberFormatException -> L46 java.io.IOException -> L5b java.lang.Throwable -> L8a
            goto L4a
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L8a
        L4a:
            r2.close()     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L8a
        L4d:
            if (r4 == 0) goto L57
            r4.close()     // Catch: java.lang.Exception -> L53
            goto L57
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L57:
            r3.destroy()     // Catch: java.lang.Exception -> L75
            goto L79
        L5b:
            r0 = move-exception
            goto L62
        L5d:
            r1 = move-exception
            r3 = r4
            goto L8b
        L60:
            r0 = move-exception
            r3 = r4
        L62:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto L6f
            r4.close()     // Catch: java.lang.Exception -> L6b
            goto L6f
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6f:
            if (r3 == 0) goto L79
            r3.destroy()     // Catch: java.lang.Exception -> L75
            goto L79
        L75:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L79:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L87
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L87
            java.lang.String r5 = android.os.Build.SOC_MODEL
        L87:
            com.bytedance.codecx.base.CodecXDeviceInfoAndroid.sCpuModel = r5
            return r5
        L8a:
            r1 = move-exception
        L8b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto L98
            r4.close()     // Catch: java.lang.Exception -> L94
            goto L98
        L94:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L98:
            if (r3 == 0) goto La2
            r3.destroy()     // Catch: java.lang.Exception -> L9e
            throw r1
        L9e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La2:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.codecx.base.CodecXDeviceInfoAndroid.GetCpuModel():java.lang.String");
    }

    public static String GetDeviceBrand() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str;
    }

    public static String GetDeviceModel() {
        String str = Build.MODEL;
        return str == null ? "" : str;
    }

    public static String getSdkVersion() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String getCpuName() throws Throwable {
        String strGetCpuModel = GetCpuModel();
        if (strGetCpuModel != null && !strGetCpuModel.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strGetCpuModel);
            sbLIZ.append(";");
            sbLIZ.append(Build.HARDWARE);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (Build.VERSION.SDK_INT < 31) {
            return Build.HARDWARE;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(Build.SOC_MODEL);
        sbLIZ2.append(";");
        sbLIZ2.append(Build.HARDWARE);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static String getGpuName() throws Throwable {
        String gPURenderer = GPUUtil.getGPURenderer();
        return gPURenderer == null ? "null-null" : gPURenderer;
    }

    public static int getMemSize() {
        try {
            try {
                Context applicationContext = CodecXContextUtils.getApplicationContext();
                if (applicationContext == null) {
                    return -1;
                }
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(applicationContext, "activity");
                if (activityManager == null) {
                    return -1;
                }
                C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyHacK+RyAe6KnJh9DXgYFKp8HUIaAJAkhR54VnLkpa2tQfkA==", null));
                return (int) Math.ceil((((memoryInfo.totalMem * 1.024d) / 1024.0d) / 1024.0d) / 1024.0d);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return (int) Math.ceil(((((-1) * 1.024d) / 1024.0d) / 1024.0d) / 1024.0d);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    public static String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    public static int getCoresFromFileInfo(String str) throws Throwable {
        C0VSP c0vsp;
        C0VSP c0vsp2 = null;
        try {
            try {
                c0vsp = new C0VSP(str);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c0vsp, "UTF-8"));
            String line = bufferedReader.readLine();
            bufferedReader.close();
            int coresFromFileString = getCoresFromFileString(line);
            try {
                c0vsp.close();
                return coresFromFileString;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return coresFromFileString;
            }
        } catch (IOException e3) {
            e = e3;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(e);
            if (c0vsp2 != null) {
                try {
                    c0vsp2.close();
                    return -1;
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th2) {
            th = th2;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(th);
            if (c0vsp2 != null) {
                try {
                    c0vsp2.close();
                    throw th;
                } catch (IOException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static int getCoresFromFileString(String str) {
        if (str != null && str.matches("0-[\\d]+$")) {
            return CastIntegerProtector.valueOf(str.substring(2)).intValue() + 1;
        }
        return -1;
    }
}
