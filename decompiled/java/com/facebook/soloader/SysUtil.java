package com.facebook.soloader;

import X.C09NU;
import X.C0VSJ;
import X.C2167708eR;
import X.C2188811AlT;
import X.EnumC2422609eS;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;
import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes4.dex */
public final class SysUtil {

    public static class Api14Utils {
        public static String LIZ() {
            ClassLoader classLoader = C2167708eR.class.getClassLoader();
            if (classLoader == null || (classLoader instanceof BaseDexClassLoader)) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ClassLoader ");
            sbLIZ.append(classLoader.getClass().getName());
            sbLIZ.append(" should be of type BaseDexClassLoader");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final class LollipopSysdeps {
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (is64Bit()) {
                    treeSet.add(EnumC2422609eS.AARCH64.toString());
                    treeSet.add(EnumC2422609eS.X86_64.toString());
                } else {
                    treeSet.add(EnumC2422609eS.ARM.toString());
                    treeSet.add(EnumC2422609eS.X86.toString());
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e) {
                TryCatchGuardChecker.doCheck(e);
                return Build.SUPPORTED_ABIS;
            }
        }

        public static boolean is64Bit() {
            return Os.readlink("/proc/self/exe").contains("64");
        }

        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) throws IOException {
            int i;
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j);
            } catch (ErrnoException e) {
                TryCatchGuardChecker.doCheck(e);
                if (e.errno != OsConstants.EOPNOTSUPP && (i = e.errno) != OsConstants.ENOSYS && i != OsConstants.EINVAL) {
                    throw new IOException(e.toString(), e);
                }
            }
        }
    }

    public static final class MarshmallowSysdeps {
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (Process.is64Bit()) {
                treeSet.add(EnumC2422609eS.AARCH64.toString());
                treeSet.add(EnumC2422609eS.X86_64.toString());
            } else {
                treeSet.add(EnumC2422609eS.ARM.toString());
                treeSet.add(EnumC2422609eS.X86.toString());
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        public static boolean is64Bit() {
            return Process.is64Bit();
        }
    }

    public static void LIZ(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                LIZ(file2);
            }
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite()) {
            parentFile.setWritable(true);
        }
        if (!file.delete() && file.exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Could not delete file ");
            sbLIZ.append(file);
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZIZ(File file) throws IOException {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    LIZIZ(file2);
                }
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cannot list directory ");
            sbLIZ.append(file);
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!file.getPath().endsWith("_lock")) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
    }

    public static boolean LIZJ(int i, Context context) throws IOException {
        boolean z = true;
        if (i == 2) {
            C09NU c09nu = new C09NU((File) new C0VSJ(context.getApplicationInfo().sourceDir));
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = c09nu.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    if (zipEntryNextElement != null && zipEntryNextElement.getName().endsWith(".so") && zipEntryNextElement.getName().contains("/lib")) {
                        if (zipEntryNextElement.getMethod() != 0) {
                            z = false;
                        }
                        c09nu.close();
                        return z;
                    }
                }
                c09nu.close();
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    c09nu.close();
                    throw th;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        if (context != null && (context.getApplicationInfo().flags & 268435456) == 0) {
            return true;
        }
        return false;
    }
}
