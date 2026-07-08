package com.bytedance.realx.base;

import X.C08RN;
import X.C0VSJ;
import X.C0VSP;
import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C786450Ut9;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceInfoAndroid {
    public static final FileFilter CPU_FILTER = new FileFilter() { // from class: com.bytedance.realx.base.DeviceInfoAndroid.1
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
    public static String RomVersion = "";
    public static String sCpuModel = "";

    public static int getCPUMaxFrequency() {
        int i;
        int i2 = -1;
        int iIntValue = -1;
        for (int i3 = 0; i3 < getNumberOfCPUCores(); i3++) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("/sys/devices/system/cpu/cpu");
                sbLIZ.append(i3);
                sbLIZ.append("/cpufreq/cpuinfo_max_freq");
                C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                if (c0vsj.exists() && c0vsj.canRead()) {
                    byte[] bArr = new byte[128];
                    C0VSP c0vsp = new C0VSP(c0vsj);
                    try {
                        try {
                            i = c0vsp.read(bArr);
                        } catch (NumberFormatException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (i == -1 || i > 128) {
                            throw new NumberFormatException();
                        }
                        int i4 = 0;
                        while (Character.isDigit(bArr[i4]) && i4 < 128) {
                            i4++;
                        }
                        Integer numValueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i4, "UTF-8")));
                        if (numValueOf.intValue() > iIntValue) {
                            iIntValue = numValueOf.intValue();
                        }
                        c0vsp.close();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c0vsp.close();
                        throw th;
                    }
                }
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (iIntValue == -1) {
            C0VSP c0vsp2 = new C0VSP("/proc/cpuinfo");
            try {
                int fileForValue = parseFileForValue("cpu MHz", c0vsp2) * LSPassThroughRecordSizeConfig.DEFAULT;
                if (fileForValue > iIntValue) {
                    iIntValue = fileForValue;
                }
                c0vsp2.close();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c0vsp2.close();
                throw th2;
            }
        }
        i2 = iIntValue;
        return i2 / LSPassThroughRecordSizeConfig.DEFAULT;
    }

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
            java.lang.String r0 = com.bytedance.realx.base.DeviceInfoAndroid.sCpuModel
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb
            java.lang.String r0 = com.bytedance.realx.base.DeviceInfoAndroid.sCpuModel
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
            com.bytedance.realx.base.DeviceInfoAndroid.sCpuModel = r5
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.base.DeviceInfoAndroid.GetCpuModel():java.lang.String");
    }

    public static String GetDeviceBrand() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str;
    }

    public static String GetDeviceModel() {
        String str = Build.MODEL;
        return str == null ? "" : str;
    }

    public static String getAppRootPath() {
        String absolutePath = "";
        try {
            Context applicationContext = ContextUtils.getApplicationContext();
            if (applicationContext == null) {
                return "";
            }
            absolutePath = INVOKEVIRTUAL_com_bytedance_realx_base_DeviceInfoAndroid_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(applicationContext).getAbsolutePath();
            return absolutePath;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return absolutePath;
        }
    }

    public static String getRomVersionName() {
        if (TextUtils.isEmpty(RomVersion)) {
            RomVersion = DeviceUtil.getPhoneSystem(Build.BRAND);
        }
        return RomVersion;
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

    public static int getCpuThreads() {
        return getNumberOfCPUCores();
    }

    public static String getGpuName() throws Throwable {
        String gPURenderer = GPUUtil.getGPURenderer();
        return gPURenderer == null ? "null-null" : gPURenderer;
    }

    public static String getSystemDefaultLanguage() {
        return C786410Ut5.t2(Locale.getDefault());
    }

    public static int getMemSize() {
        try {
            try {
                Context applicationContext = ContextUtils.getApplicationContext();
                if (applicationContext == null) {
                    return -1;
                }
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(applicationContext, "activity");
                if (activityManager == null) {
                    return -1;
                }
                C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyWY7qJUjhlW4WN8rR2hcGHMXr8SiYYp8U2RN6P", null));
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

    public static String getAndroidBuildId() {
        return Build.ID;
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getBuildRelease() {
        return Build.VERSION.RELEASE;
    }

    public static String getBuildType() {
        return Build.TYPE;
    }

    public static String getDevice() {
        return Build.DEVICE;
    }

    public static String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getProduct() {
        return Build.PRODUCT;
    }

    public static File INVOKEVIRTUAL_com_bytedance_realx_base_DeviceInfoAndroid_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
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

    public static int extractValue(byte[] bArr, int i) {
        byte b;
        while (i < bArr.length && (b = bArr[i]) != 10) {
            if (Character.isDigit(b)) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return CastIntegerProtector.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        r7 = r2[1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getValueFromCpuInfoFile(java.lang.String r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            java.lang.String r5 = ":"
            r2 = 0
            X.0VSP r3 = new X.0VSP     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            java.lang.String r0 = "/proc/cpuinfo"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4e
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L6b
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L6b
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L6b
            r1.<init>(r3, r0)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L6b
            r4.<init>(r1)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L6b
        L18:
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            if (r1 == 0) goto L37
            boolean r0 = r1.contains(r5)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            if (r0 == 0) goto L18
            java.lang.String[] r2 = r1.split(r5)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            int r0 = r2.length     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            r1 = 1
            if (r0 <= r1) goto L18
            r0 = 0
            r0 = r2[r0]     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            boolean r0 = r0.contains(r6)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            if (r0 == 0) goto L18
            r7 = r2[r1]     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
        L37:
            r4.close()     // Catch: java.lang.Exception -> L3b
            goto L3f
        L3b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3f:
            r3.close()     // Catch: java.lang.Exception -> L66
            return r7
        L43:
            r1 = move-exception
            r2 = r4
            goto L6c
        L46:
            r0 = move-exception
            r2 = r4
            goto L50
        L49:
            r0 = move-exception
            goto L50
        L4b:
            r1 = move-exception
            r3 = r2
            goto L6c
        L4e:
            r0 = move-exception
            r3 = r2
        L50:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L5d
            r2.close()     // Catch: java.lang.Exception -> L59
            goto L5d
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5d:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.lang.Exception -> L63
            goto L65
        L63:
            r0 = move-exception
            goto L67
        L65:
            return r7
        L66:
            r0 = move-exception
        L67:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6a:
            return r7
        L6b:
            r1 = move-exception
        L6c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L79
            r2.close()     // Catch: java.lang.Exception -> L75
            goto L79
        L75:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L79:
            if (r3 == 0) goto L83
            r3.close()     // Catch: java.lang.Exception -> L7f
            throw r1
        L7f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L83:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.base.DeviceInfoAndroid.getValueFromCpuInfoFile(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[Catch: IOException -> 0x0037, NumberFormatException -> 0x003c, TryCatch #2 {IOException -> 0x0037, NumberFormatException -> 0x003c, blocks: (B:3:0x0004, B:5:0x000b, B:12:0x001a, B:14:0x0024, B:16:0x002c, B:18:0x0031, B:19:0x0034, B:9:0x0015), top: B:26:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015 A[Catch: IOException -> 0x0037, NumberFormatException -> 0x003c, TryCatch #2 {IOException -> 0x0037, NumberFormatException -> 0x003c, blocks: (B:3:0x0004, B:5:0x000b, B:12:0x001a, B:14:0x0024, B:16:0x002c, B:18:0x0031, B:19:0x0034, B:9:0x0015), top: B:26:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int parseFileForValue(java.lang.String r7, java.io.FileInputStream r8) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r0]
            int r5 = r8.read(r6)     // Catch: java.io.IOException -> L37 java.lang.NumberFormatException -> L3c
            r4 = 0
        L9:
            if (r4 >= r5) goto L40
            r1 = r6[r4]     // Catch: java.io.IOException -> L37 java.lang.NumberFormatException -> L3c
            r0 = 10
            if (r1 == r0) goto L15
            if (r4 != 0) goto L34
            if (r1 != r0) goto L17
        L15:
            int r4 = r4 + 1
        L17:
            r3 = r4
        L18:
            if (r3 >= r5) goto L34
            int r2 = r3 - r4
            r1 = r6[r3]     // Catch: java.io.IOException -> L37 java.lang.NumberFormatException -> L3c
            char r0 = r7.charAt(r2)     // Catch: java.io.IOException -> L37 java.lang.NumberFormatException -> L3c
            if (r1 != r0) goto L34
            int r0 = r7.length()     // Catch: java.io.IOException -> L37 java.lang.NumberFormatException -> L3c
            int r0 = r0 + (-1)
            if (r2 != r0) goto L31
            int r0 = extractValue(r6, r3)     // Catch: java.io.IOException -> L37 java.lang.NumberFormatException -> L3c
            return r0
        L31:
            int r3 = r3 + 1
            goto L18
        L34:
            int r4 = r4 + 1
            goto L9
        L37:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L40
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L40:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.base.DeviceInfoAndroid.parseFileForValue(java.lang.String, java.io.FileInputStream):int");
    }
}
