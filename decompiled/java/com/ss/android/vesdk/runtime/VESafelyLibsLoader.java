package com.ss.android.vesdk.runtime;

import X.C08RN;
import X.C09NU;
import X.C0VSJ;
import X.C0VSV;
import X.C2188811AlT;
import X.C786450Ut9;
import X.C971740bOW;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.vesdk.VEFileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public class VESafelyLibsLoader {
    public static List<String> sLoadedLibs = new ArrayList();

    public static void INVOKESTATIC_com_ss_android_vesdk_runtime_VESafelyLibsLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static File INVOKEVIRTUAL_com_ss_android_vesdk_runtime_VESafelyLibsLoader_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
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

    public static File getLibraryFolder(Context context) {
        if (context != null && INVOKEVIRTUAL_com_ss_android_vesdk_runtime_VESafelyLibsLoader_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context) != null) {
            C0VSJ c0vsj = new C0VSJ(INVOKEVIRTUAL_com_ss_android_vesdk_runtime_VESafelyLibsLoader_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context), "libso");
            if (!c0vsj.exists()) {
                VEFileUtils.mkdir(c0vsj.getAbsolutePath());
            }
            return c0vsj;
        }
        return null;
    }

    public static String getStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        return stringWriter.getBuffer().toString();
    }

    public static File getLibraryFile(Context context, String str) {
        String strMapLibraryName = System.mapLibraryName(str);
        File libraryFolder = getLibraryFolder(context);
        if (libraryFolder != null) {
            return new C0VSJ(libraryFolder, strMapLibraryName);
        }
        return null;
    }

    public static synchronized boolean loadLibrary(String str, Context context) {
        if (sLoadedLibs.contains(str)) {
            return true;
        }
        try {
            INVOKESTATIC_com_ss_android_vesdk_runtime_VESafelyLibsLoader_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
            sLoadedLibs.add(str);
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadLibrary ");
            sbLIZ.append(str);
            sbLIZ.append(" error.");
            sbLIZ.append(getStackTrace(e));
            C971740bOW.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
            File libraryFile = getLibraryFile(context, str);
            if (libraryFile == null) {
                return false;
            }
            if (libraryFile.exists()) {
                libraryFile.delete();
            }
            String strUnpackLibrary = unpackLibrary(context, str, libraryFile);
            if (strUnpackLibrary != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(e.getMessage());
                sbLIZ2.append(e3.e);
                sbLIZ2.append(strUnpackLibrary);
                sbLIZ2.append(e3.f);
                C971740bOW.LIZ(4, C2188811AlT.LIZIZ(sbLIZ2));
                return false;
            }
            try {
                System.load(libraryFile.getAbsolutePath());
                sLoadedLibs.add(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("loadLibrary ");
            sbLIZ3.append(str);
            sbLIZ3.append(" error,");
            sbLIZ3.append(Log.getStackTraceString(th2));
            C971740bOW.LIZ(4, C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
        return true;
    }

    public static String unpackLibrary(Context context, String str, File file) {
        InputStream inputStream;
        C09NU c09nu;
        String message;
        String str2;
        ZipEntry entry;
        C0VSV c0vsv = null;
        try {
            c09nu = new C09NU(new C0VSJ(context.getApplicationInfo().sourceDir));
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lib/");
                str2 = Build.CPU_ABI;
                sbLIZ.append(str2);
                sbLIZ.append("/");
                sbLIZ.append(System.mapLibraryName(str));
                entry = c09nu.getEntry(C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                th = th;
                inputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            c09nu = null;
        }
        if (entry == null) {
            int iIndexOf = str2.indexOf(45);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("lib/");
            if (iIndexOf <= 0) {
                iIndexOf = str2.length();
            }
            sbLIZ2.append(str2.substring(0, iIndexOf));
            sbLIZ2.append("/");
            sbLIZ2.append(System.mapLibraryName(str));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            entry = c09nu.getEntry(strLIZIZ);
            if (entry == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Library entry not found:");
                sbLIZ3.append(strLIZIZ);
                message = C2188811AlT.LIZIZ(sbLIZ3);
                VEFileUtils.close((Closeable) null);
                VEFileUtils.close((Closeable) null);
                VEFileUtils.close((ZipFile) c09nu);
                return message;
            }
        }
        file.createNewFile();
        inputStream = c09nu.getInputStream(entry);
        try {
            C0VSV c0vsv2 = new C0VSV(file);
            try {
                byte[] bArr = new byte[16384];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i > 0) {
                        c0vsv2.write(bArr, 0, i);
                    } else {
                        VEFileUtils.setPermissions(file.getAbsolutePath(), 493);
                        VEFileUtils.close(c0vsv2);
                        VEFileUtils.close(inputStream);
                        VEFileUtils.close((ZipFile) c09nu);
                        return null;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                c0vsv = c0vsv2;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    message = th.getMessage();
                    VEFileUtils.close(c0vsv);
                    VEFileUtils.close(inputStream);
                    VEFileUtils.close((ZipFile) c09nu);
                    return message;
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    VEFileUtils.close(c0vsv);
                    VEFileUtils.close(inputStream);
                    VEFileUtils.close((ZipFile) c09nu);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
