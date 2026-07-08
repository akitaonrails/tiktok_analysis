package com.ss.android.ugc.aweme.classopt;

import X.C0VSF;
import X.C0VSJ;
import X.C2115308Ql;
import X.C2188811AlT;
import X.C794210VDn;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.otis.art.ArtLogVerbosity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class ColdBootClassPreloader {
    public static C0VSJ LIZ;
    public static C0VSJ LIZJ;
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static C0VSJ LIZLLL = null;
    public static C0VSJ LJ = null;
    public static C0VSJ LJFF = null;
    public static String LJI = null;
    public static int LJII = 0;
    public static boolean LJIIIIZZ = false;
    public static final List<String> LJIIIZ = new LinkedList();
    public static volatile Field LJIIJ = null;
    public static int sClassNotInitializedStatusThreshold = 10;

    public static void LJII() {
        File[] fileArrListFiles;
        if (LIZIZ.compareAndSet(true, false)) {
            C0VSJ c0vsj = LJFF;
            C0VSJ c0vsj2 = LIZLLL;
            C0VSJ c0vsj3 = LJ;
            String str = LJI;
            if (str == null || c0vsj == null || c0vsj2 == null || c0vsj3 == null || !c0vsj2.isFile() || c0vsj2.length() <= 0) {
                return;
            }
            int i = LJII;
            String absolutePath = c0vsj3.getAbsolutePath();
            boolean z = i > 0;
            String[] strArr = LJIIIIZZ ? new String[]{"split_df_a_dex.apk"} : null;
            int i2 = ArtLogVerbosity.LIZ;
            int i3 = Build.VERSION.SDK_INT;
            ArtLogVerbosity.dumpLoadedClassInApkInternal(str, absolutePath, z, null, strArr);
            if (!c0vsj3.isFile() || c0vsj3.length() <= 0) {
                return;
            }
            try {
                LinkedHashSet<String> linkedHashSetLIZIZ = LIZIZ(c0vsj2, c0vsj3, i);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c0vsj.getAbsolutePath());
                sbLIZ.append("_tmp");
                C0VSJ c0vsj4 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                BufferedWriter bufferedWriter = new BufferedWriter(new C794210VDn(c0vsj4));
                try {
                    boolean z2 = true;
                    for (String str2 : linkedHashSetLIZIZ) {
                        if (!(str2.startsWith("!") ? str2.substring(1) : str2).startsWith("com.appsflyer")) {
                            if (!z2) {
                                bufferedWriter.newLine();
                            }
                            bufferedWriter.write(str2);
                            z2 = false;
                        }
                    }
                    bufferedWriter.close();
                    c0vsj4.renameTo(c0vsj);
                    linkedHashSetLIZIZ.clear();
                    c0vsj2.delete();
                    c0vsj3.delete();
                    try {
                        C0VSJ c0vsj5 = LIZ;
                        if (c0vsj5 != null && (fileArrListFiles = c0vsj5.listFiles()) != null) {
                            for (File file : fileArrListFiles) {
                                if (!TextUtils.equals(file.getName(), c0vsj.getName())) {
                                    file.delete();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    ((LinkedList) LJIIIZ).clear();
                } finally {
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public static long LIZ(ApplicationInfo applicationInfo) {
        String str;
        long j = 0;
        try {
            C0VSJ c0vsj = new C0VSJ(applicationInfo.sourceDir);
            if (Build.SUPPORTED_64_BIT_ABIS.length == 0) {
                str = "oat/arm/base.art";
            } else {
                str = "oat/arm64/base.art";
            }
            C0VSJ c0vsj2 = new C0VSJ(c0vsj.getParentFile(), str);
            if (c0vsj2.isFile()) {
                long length = c0vsj2.length();
                if (length <= 0) {
                    return 0L;
                }
                j = length / 1024;
                return j;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return j;
    }

    public static C0VSJ LIZJ(ApplicationInfo applicationInfo) {
        try {
            C0VSJ c0vsj = new C0VSJ(applicationInfo.sourceDir);
            long jLIZ = LIZ(applicationInfo);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0vsj.length());
            sbLIZ.append("_");
            sbLIZ.append(c0vsj.lastModified());
            sbLIZ.append("_");
            sbLIZ.append(jLIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C0VSJ c0vsj2 = LIZ;
            if (c0vsj2 == null) {
                c0vsj2 = new C0VSJ(applicationInfo.dataDir, "files/ClassPreloader/ColdBoot");
                LIZ = c0vsj2;
                C0VSJ c0vsj3 = LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("dont_do_mark_");
                sbLIZ2.append(strLIZIZ);
                LIZJ = new C0VSJ(c0vsj3, C2188811AlT.LIZIZ(sbLIZ2));
            }
            return new C0VSJ(c0vsj2, strLIZIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(java.lang.ClassLoader r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "com.appsflyer"
            boolean r0 = r6.startsWith(r0)
            r4 = 0
            if (r0 == 0) goto La
            return r4
        La:
            java.lang.Class r5 = java.lang.Class.forName(r6, r4, r5)     // Catch: java.lang.Throwable -> L46
            java.lang.Class r1 = r5.getSuperclass()     // Catch: java.lang.Throwable -> L46
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 != r0) goto L4a
            java.lang.reflect.Field r3 = com.ss.android.ugc.aweme.classopt.ColdBootClassPreloader.LJIIJ     // Catch: java.lang.Throwable -> L46
            r2 = 1
            if (r3 != 0) goto L2f
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            java.lang.String r0 = "status"
            java.lang.reflect.Field r3 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L29
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L29
            com.ss.android.ugc.aweme.classopt.ColdBootClassPreloader.LJIIJ = r3     // Catch: java.lang.Throwable -> L29
            goto L2f
        L29:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L4a
        L2f:
            java.lang.Object r0 = r3.get(r5)     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L41
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L41
            int r1 = r0 >>> 28
            int r0 = com.ss.android.ugc.aweme.classopt.ColdBootClassPreloader.sClassNotInitializedStatusThreshold     // Catch: java.lang.Throwable -> L41
            if (r1 > r0) goto L4a
            r4 = 1
            return r4
        L41:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L46
            return r4
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.classopt.ColdBootClassPreloader.LIZLLL(java.lang.ClassLoader, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.LinkedHashSet LIZIZ(X.C0VSJ r9, X.C0VSJ r10, int r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.classopt.ColdBootClassPreloader.LIZIZ(X.0VSJ, X.0VSJ, int):java.util.LinkedHashSet");
    }

    public static void LJ(ClassLoader classLoader, boolean z, String str, AtomicInteger atomicInteger) throws ClassNotFoundException {
        boolean zStartsWith = str.startsWith("!");
        boolean z2 = true;
        if (zStartsWith) {
            str = str.substring(1);
        }
        if (!z || !zStartsWith || atomicInteger.getAndDecrement() <= 0) {
            z2 = false;
        }
        Class.forName(str, z2, classLoader);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF(final java.lang.ClassLoader r15, android.content.pm.ApplicationInfo r16, int r17, X.C2115308Ql r18) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.classopt.ColdBootClassPreloader.LJFF(java.lang.ClassLoader, android.content.pm.ApplicationInfo, int, X.08Ql):boolean");
    }

    public static void LJI(ApplicationInfo applicationInfo, C2115308Ql c2115308Ql, int i, boolean z, boolean z2) {
        String str;
        String[] strArr;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && i2 <= 36 && applicationInfo != null && (str = applicationInfo.packageName) != null) {
            LJI = str;
            boolean z3 = false;
            if (!LIZIZ.compareAndSet(false, true)) {
                return;
            }
            LJII = i;
            ((LinkedList) LJIIIZ).clear();
            C0VSJ c0vsjLIZJ = LIZJ(applicationInfo);
            if (c0vsjLIZJ != null) {
                c0vsjLIZJ.getParentFile().mkdirs();
                C0VSJ c0vsj = LIZJ;
                if (c0vsj != null && c0vsj.exists()) {
                    return;
                }
                try {
                    c0vsj.createNewFile();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                LJFF = c0vsjLIZJ;
                LIZLLL = new C0VSJ(c0vsjLIZJ.getParentFile(), "snapshot_begin");
                LJ = new C0VSJ(c0vsjLIZJ.getParentFile(), "snapshot_end");
                LJIIIIZZ = z2;
                ArtLogVerbosity.init(false, Build.VERSION.SDK_INT, false);
                String str2 = applicationInfo.packageName;
                String absolutePath = LIZLLL.getAbsolutePath();
                if (i > 0) {
                    z3 = true;
                }
                if (z2) {
                    strArr = new String[]{"split_df_a_dex.apk"};
                } else {
                    strArr = null;
                }
                ArtLogVerbosity.dumpLoadedClassInApkInternal(str2, absolutePath, z3, null, strArr);
                if (i > 0 && z && c0vsjLIZJ.isFile()) {
                    try {
                        ClassLoader classLoader = ColdBootClassPreloader.class.getClassLoader();
                        BufferedReader bufferedReader = new BufferedReader(new C0VSF(c0vsjLIZJ));
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line != null) {
                                    if (line.startsWith("!") && LIZLLL(classLoader, line.substring(1))) {
                                        ((LinkedList) LJIIIZ).add(line);
                                    }
                                } else {
                                    bufferedReader.close();
                                    return;
                                }
                            } finally {
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        }
    }
}
