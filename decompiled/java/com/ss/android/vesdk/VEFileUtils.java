package com.ss.android.vesdk;

import X.C0VSF;
import X.C0VSJ;
import X.C0WZX;
import X.C1966107n1;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C794210VDn;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public class VEFileUtils {
    public static boolean canWrite(File file) {
        if (file != null && file.exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e3.d);
            sbLIZ.append(System.currentTimeMillis());
            C0VSJ c0vsj = new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ));
            boolean zMkdir = c0vsj.mkdir();
            if (zMkdir) {
                return c0vsj.delete();
            }
            return zMkdir;
        }
        return false;
    }

    public static void clearPath(String str) {
        String strLIZIZ;
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            for (String str2 : c0vsj.list()) {
                String str3 = File.separator;
                if (str.endsWith(str3)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(str3);
                    sbLIZ2.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                C0VSJ c0vsj2 = new C0VSJ(strLIZIZ);
                if (c0vsj2.isFile()) {
                    c0vsj2.delete();
                }
                if (c0vsj2.isDirectory()) {
                    deletePath(strLIZIZ);
                }
            }
        }
    }

    public static void close(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void deleteFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists() && c0vsj.isFile()) {
            c0vsj.delete();
        }
    }

    public static void deletePath(String str) {
        String strLIZIZ;
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            return;
        }
        if (c0vsj.isFile()) {
            c0vsj.delete();
            return;
        }
        String[] list = c0vsj.list();
        if (list == null) {
            return;
        }
        for (String str2 : list) {
            if (str2 != null) {
                String str3 = File.separator;
                if (str.endsWith(str3)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(str3);
                    sbLIZ2.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                C0VSJ c0vsj2 = new C0VSJ(strLIZIZ);
                if (c0vsj2.isFile()) {
                    c0vsj2.delete();
                }
                if (c0vsj2.isDirectory()) {
                    deletePath(strLIZIZ);
                }
            }
        }
        c0vsj.delete();
    }

    public static boolean exists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new C0VSJ(str).exists();
    }

    public static long getAllBytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            if (!TextUtils.isEmpty(str) && new C0VSJ(str).exists()) {
                StatFs statFs = new StatFs(str);
                return ((long) C2204961BRm.LLI(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKcGrIihdWmTvcivcQYVDPrhM=", null))) * ((long) C2204961BRm.LLFII(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKcGrIihdWmTvcivcQYVDPrhM=", null)));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return 0L;
    }

    public static long getAvailableBytes(String str) {
        try {
            if (!TextUtils.isEmpty(str) && new C0VSJ(str).exists()) {
                StatFs statFs = new StatFs(str);
                return ((long) C2204961BRm.LLI(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKcGrIihdWmTvcivcQYVDPrhM=", null))) * ((long) C2204961BRm.LLF(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKcGrIihdWmTvcivcQYVDPrhM=", null)));
            }
            return 0L;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    public static String getFileExtension(String str) {
        int iLastIndexOf = str.lastIndexOf(e3.d);
        if (iLastIndexOf >= 0 && iLastIndexOf < str.length() - 1) {
            return str.substring(iLastIndexOf + 1).toUpperCase();
        }
        return "";
    }

    public static String getFileName(String str) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf > 0 && iLastIndexOf < str.length() - 1) {
            return str.substring(iLastIndexOf + 1);
        }
        return str;
    }

    public static String getFileNameWithoutExtension(String str) {
        int iLastIndexOf;
        String fileName = getFileName(str);
        if (fileName != null && fileName.length() > 0 && (iLastIndexOf = fileName.lastIndexOf(46)) > 0) {
            return fileName.substring(0, iLastIndexOf);
        }
        return fileName;
    }

    public static String getFilePathWithoutExtension(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf > 0) {
            return str.substring(0, iLastIndexOf);
        }
        return str;
    }

    public static long getFileSize(String str) {
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            return 0L;
        }
        long length = c0vsj.length();
        if (c0vsj.isDirectory() && (fileArrListFiles = c0vsj.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                try {
                    length += getFileSize(file.getAbsolutePath());
                } catch (OutOfMemoryError e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.printStackTrace();
                    return 0L;
                } catch (StackOverflowError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.printStackTrace();
                    return 0L;
                }
            }
        }
        return length;
    }

    public static String getParentFilePath(String str) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf >= 0) {
            return str.substring(0, iLastIndexOf);
        }
        return null;
    }

    public static boolean isAndroidUriPath(String str) {
        if (str != null) {
            if (str.startsWith("content:") || str.startsWith("file:")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean mkdir(String str) {
        return new C0VSJ(str).mkdirs();
    }

    public static String readFileFirstLine(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new C0VSF(str));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            String line = bufferedReader.readLine();
            bufferedReader.close();
            try {
                bufferedReader.close();
                return line;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return line;
            }
        } catch (Exception e3) {
            e = e3;
            bufferedReader2 = bufferedReader;
            TryCatchGuardChecker.doCheck(e);
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                    return "";
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    return "";
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            TryCatchGuardChecker.doCheck(th);
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                    throw th;
                } catch (IOException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static void close(ZipFile zipFile) {
        if (zipFile == null) {
            return;
        }
        try {
            zipFile.close();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean copyFile(java.io.File r7, java.io.File r8) throws java.lang.Throwable {
        /*
            boolean r0 = r7.exists()
            r6 = 0
            if (r0 == 0) goto L98
            boolean r0 = r7.isFile()
            if (r0 == 0) goto L98
            boolean r0 = r8.isDirectory()
            if (r0 == 0) goto L14
            return r6
        L14:
            boolean r0 = r8.exists()
            if (r0 == 0) goto L1d
            r8.delete()
        L1d:
            r0 = 2048(0x800, float:2.87E-42)
            r5 = 0
            byte[] r4 = new byte[r0]     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L66
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L66
            X.0VSP r0 = new X.0VSP     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L66
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L66
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L66
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5d
            X.0VSV r0 = new X.0VSV     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5d
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5d
        L36:
            int r1 = r3.read(r4)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L60
            r0 = -1
            if (r1 != r0) goto L41
            r2.flush()     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L60
            goto L45
        L41:
            r2.write(r4, r6, r1)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L60
            goto L36
        L45:
            r3.close()     // Catch: java.io.IOException -> L49
            goto L4d
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4d:
            r2.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L55:
            r0 = 1
            return r0
        L57:
            r1 = move-exception
            r2 = r5
            goto L5b
        L5a:
            r1 = move-exception
        L5b:
            r5 = r3
            goto L7c
        L5d:
            r0 = move-exception
            r2 = r5
            goto L61
        L60:
            r0 = move-exception
        L61:
            r5 = r3
            goto L68
        L63:
            r1 = move-exception
            r2 = r5
            goto L7c
        L66:
            r0 = move-exception
            r2 = r5
        L68:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7b
            if (r5 == 0) goto L75
            r5.close()     // Catch: java.io.IOException -> L71
            goto L75
        L71:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L75:
            if (r2 == 0) goto L98
            r2.close()     // Catch: java.io.IOException -> L94
            return r6
        L7b:
            r1 = move-exception
        L7c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L7b
            if (r5 == 0) goto L89
            r5.close()     // Catch: java.io.IOException -> L85
            goto L89
        L85:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L89:
            if (r2 == 0) goto L93
            r2.close()     // Catch: java.io.IOException -> L8f
            throw r1
        L8f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L93:
            throw r1
        L94:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L98:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEFileUtils.copyFile(java.io.File, java.io.File):boolean");
    }

    public static boolean renameFile(String str, String str2) {
        C0VSJ c0vsj = new C0VSJ(str);
        C0VSJ c0vsj2 = new C0VSJ(str2);
        if (!c0vsj.exists()) {
            return false;
        }
        return c0vsj.renameTo(c0vsj2);
    }

    public static void setPermissions(String str, int i) {
        try {
            C1966107n1.LIZJ(Class.forName("android.os.FileUtils"), str, Integer.valueOf(i), -1, -1);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static boolean copyFile(String str, String str2) {
        return copyFile(new C0VSJ(str), new C0VSJ(str2));
    }

    public static void write(String str, String str2, boolean z) {
        C794210VDn c794210VDn = null;
        try {
            try {
                try {
                    C0VSJ c0vsj = new C0VSJ(str);
                    if (!c0vsj.exists()) {
                        c0vsj.getParentFile().mkdirs();
                        c0vsj.createNewFile();
                    }
                    C794210VDn c794210VDn2 = new C794210VDn(str, z);
                    try {
                        c794210VDn2.write(str2);
                        c794210VDn2.close();
                    } catch (IOException e) {
                        e = e;
                        c794210VDn = c794210VDn2;
                        TryCatchGuardChecker.doCheck(e);
                        if (c794210VDn != null) {
                            c794210VDn.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        c794210VDn = c794210VDn2;
                        TryCatchGuardChecker.doCheck(th);
                        if (c794210VDn != null) {
                            c794210VDn.close();
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (c794210VDn != null) {
                        try {
                            c794210VDn.close();
                            throw th2;
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            throw th2;
                        }
                    }
                    throw th2;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }
}
