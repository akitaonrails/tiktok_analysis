package com.ss.android.ugc.effectmanager.common.utils;

import X.C08QA;
import X.C0VSF;
import X.C0VSJ;
import X.C0VSP;
import X.C0VSV;
import X.C13LN;
import X.C2107108Nh;
import X.C2188811AlT;
import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.cachemanager.TotalLengthOutputStream;
import com.ss.android.ugc.effectmanager.common.download.DownloadListener;
import com.ss.android.ugc.effectmanager.common.exception.UnzipException;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class FileUtils {
    public static final FileUtils INSTANCE = new FileUtils();
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final int BUFFER_SIZE = 8192;

    public final boolean isSdcardWritable() {
        try {
            return Intrinsics.LJFF("mounted", C786410Ut5.X3());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final boolean isSdcardAvailable() {
        String strX3 = C786410Ut5.X3();
        return Intrinsics.LJFF("mounted", strX3) || Intrinsics.LJFF("mounted_ro", strX3);
    }

    public final int getBUFFER_SIZE() {
        return BUFFER_SIZE;
    }

    public final Charset getUS_ASCII() {
        return US_ASCII;
    }

    public final Charset getUTF_8() {
        return UTF_8;
    }

    public final boolean checkFileExists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new C0VSJ(str).exists();
    }

    public final void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public final void deleteContents(File file) throws IOException {
        if (file == null) {
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    deleteContents(file2);
                }
                if (!file2.delete()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("failed to delete file: ");
                    sbLIZ.append(file2);
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("not a readable directory: ");
        sbLIZ2.append(file);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final boolean deleteDir(File file) {
        try {
            deleteContents(file);
            if (file == null) {
                return false;
            }
            return file.delete();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final boolean ensureDirExists(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.exists();
    }

    public final String getFileContent(String str) throws Throwable {
        C0VSF c0vsf;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        C0VSJ c0vsj = new C0VSJ(str);
        String strLIZIZ = "";
        if (!checkFileExists(c0vsj.getPath())) {
            return "";
        }
        try {
            try {
                c0vsf = new C0VSF(c0vsj);
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedReader2 = new BufferedReader(c0vsf);
                try {
                    for (String line = bufferedReader2.readLine(); line != null; line = bufferedReader2.readLine()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append(line);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    try {
                        c0vsf.close();
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    try {
                        bufferedReader2.close();
                        return strLIZIZ;
                    } catch (IOException e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        return strLIZIZ;
                    }
                } catch (Exception e3) {
                    e = e3;
                    TryCatchGuardChecker.doCheck(e);
                    if (c0vsf != null) {
                        try {
                            c0vsf.close();
                        } catch (IOException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    }
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                            return strLIZIZ;
                        } catch (IOException e5) {
                            e = e5;
                            TryCatchGuardChecker.doCheck(e);
                            return strLIZIZ;
                        }
                    }
                    return strLIZIZ;
                }
            } catch (Exception e6) {
                e = e6;
                bufferedReader2 = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                TryCatchGuardChecker.doCheck(th);
                if (c0vsf != null) {
                    try {
                        c0vsf.close();
                    } catch (IOException e7) {
                        TryCatchGuardChecker.doCheck(e7);
                    }
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (IOException e8) {
                        TryCatchGuardChecker.doCheck(e8);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            c0vsf = null;
            bufferedReader2 = null;
        } catch (Throwable th3) {
            th = th3;
            c0vsf = null;
            bufferedReader = null;
        }
    }

    public final OutputStream getFileOutputStream(String str) {
        if (str == null) {
            return null;
        }
        File parentFile = new C0VSJ(str).getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            return new C0VSV(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final InputStream getFileStream(String str) {
        if (str == null) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (checkFileExists(c0vsj.getPath())) {
            try {
                return new C0VSP(c0vsj);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public final long getFolderSize(File file) {
        File[] fileArrListFiles;
        long folderSize;
        long j = 0;
        if (file == null || (fileArrListFiles = file.listFiles()) == null) {
            return 0L;
        }
        int length = fileArrListFiles.length;
        for (int i = 0; i < length; i++) {
            if (fileArrListFiles[i].isFile()) {
                folderSize = fileArrListFiles[i].length();
            } else {
                folderSize = getFolderSize(fileArrListFiles[i]);
            }
            j += folderSize;
        }
        return j;
    }

    public final String joinSeparator(String str) {
        String str2 = File.separator;
        if (!u.LJIIZILJ(str, str2, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public final String readFully(Reader reader) throws Throwable {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            int i = reader.read(cArr);
            while (i != -1) {
                stringWriter.write(cArr, 0, i);
                i = reader.read(cArr);
            }
            String string = stringWriter.toString();
            C2107108Nh.LIZ(reader, null);
            return string;
        } catch (Throwable th) {
            th = th;
            try {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    th = null;
                    TryCatchGuardChecker.doCheck(th);
                    C2107108Nh.LIZ(reader, th);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void removeDir(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        if (fileArrListFiles.length == 0) {
            file.delete();
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                removeDir(file2);
            } else {
                file2.delete();
            }
        }
        file.delete();
    }

    public final boolean removeFile(String str) {
        if (str == null) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || !c0vsj.canWrite() || !c0vsj.delete()) {
            return false;
        }
        return true;
    }

    public final synchronized void removeDir(String str) {
        if (str == null) {
            return;
        }
        removeDir(new C0VSJ(str));
    }

    public final String addPathSuffix(String str, String str2) {
        if (str == null) {
            return null;
        }
        String str3 = File.separator;
        if (u.LJIIZILJ(str, str3, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C13LN.LJLL(1, str));
            sbLIZ.append(str2);
            sbLIZ.append(str3);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final String combineFilePath(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        sbLIZ.append(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long copyStream(InputStream inputStream, OutputStream outputStream) {
        return copyStream(inputStream, outputStream, 0L, null);
    }

    public final File createFile(String str, boolean z) {
        C0VSJ c0vsj = null;
        if (str == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            c0vsj = new C0VSJ(str);
            if (!c0vsj.exists()) {
                if (!z) {
                    c0vsj.mkdirs();
                } else {
                    try {
                        File parentFile = c0vsj.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        c0vsj.createNewFile();
                        return c0vsj;
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return c0vsj;
                    }
                }
            }
        }
        return c0vsj;
    }

    public final void unZip(String str, String str2) throws Throwable {
        File c0vsj;
        String canonicalPath;
        ZipInputStream zipInputStream;
        if (str != null && str2 != null) {
            Closeable closeable = null;
            try {
                try {
                    c0vsj = new C0VSJ(str2);
                    if (c0vsj.exists()) {
                        removeDir(c0vsj);
                    }
                    canonicalPath = c0vsj.getCanonicalPath();
                    zipInputStream = new ZipInputStream(new BufferedInputStream(new C0VSP(str)));
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                while (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (a0.LJJIIZI(name, "../", false)) {
                        EPLog.e("FileUtils", "file name contains illegal pattern with ..!");
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        C0VSJ c0vsj2 = new C0VSJ(c0vsj, name);
                        if (u.LJJIIJZLJL(c0vsj2.getCanonicalPath(), canonicalPath, false)) {
                            if (nextEntry.isDirectory()) {
                                if (!c0vsj2.mkdirs()) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("mkdir failed! file name:");
                                    sbLIZ.append(c0vsj2.getName());
                                    EPLog.e("FileUtils", C2188811AlT.LIZIZ(sbLIZ));
                                }
                                zipInputStream.closeEntry();
                                nextEntry = zipInputStream.getNextEntry();
                            } else {
                                File parentFile = c0vsj2.getParentFile();
                                if (parentFile != null && !parentFile.exists()) {
                                    if (!parentFile.mkdirs()) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("parent mkdir failed! file name:");
                                        sbLIZ2.append(parentFile.getName());
                                        EPLog.e("FileUtils", C2188811AlT.LIZIZ(sbLIZ2));
                                    }
                                } else if (c0vsj2.exists() && !c0vsj2.delete()) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("delete file failed! file name:");
                                    sbLIZ3.append(c0vsj2.getName());
                                    EPLog.e("FileUtils", C2188811AlT.LIZIZ(sbLIZ3));
                                }
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV(c0vsj2));
                                byte[] bArr = new byte[BUFFER_SIZE];
                                while (true) {
                                    int i = zipInputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    } else {
                                        bufferedOutputStream.write(bArr, 0, i);
                                    }
                                }
                                bufferedOutputStream.flush();
                                bufferedOutputStream.close();
                                zipInputStream.closeEntry();
                                nextEntry = zipInputStream.getNextEntry();
                            }
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("Entry is outside of the target dir: ");
                            sbLIZ4.append(nextEntry.getName());
                            throw new UnzipException(C2188811AlT.LIZIZ(sbLIZ4));
                        }
                    }
                }
                closeQuietly(zipInputStream);
            } catch (Exception e2) {
                e = e2;
                closeable = zipInputStream;
                TryCatchGuardChecker.doCheck(e);
                String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                throw new UnzipException(message);
            } catch (Throwable th2) {
                th = th2;
                closeable = zipInputStream;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        closeQuietly(closeable);
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
    }

    public final long writeToExternal(String str, String str2) {
        long length;
        C0VSV c0vsv;
        synchronized (FileUtils.class) {
            try {
                C0VSJ c0vsj = new C0VSJ(str2);
                if (!c0vsj.exists()) {
                    INSTANCE.createFile(c0vsj.getPath(), true);
                }
                C0VSV c0vsv2 = null;
                try {
                    try {
                        c0vsv = new C0VSV(c0vsj);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Exception e) {
                    e = e;
                }
                try {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(c0vsv);
                    try {
                        outputStreamWriter.write(str);
                        outputStreamWriter.flush();
                        C2107108Nh.LIZ(outputStreamWriter, null);
                        length = str.length();
                        try {
                            c0vsv.close();
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(outputStreamWriter, th);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            th = null;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(outputStreamWriter, th);
                            throw th;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    c0vsv2 = c0vsv;
                    TryCatchGuardChecker.doCheck(e);
                    if (c0vsv2 != null) {
                        try {
                            c0vsv2.close();
                        } catch (IOException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    }
                    length = 0;
                } catch (Throwable th5) {
                    th = th5;
                    c0vsv2 = c0vsv;
                    TryCatchGuardChecker.doCheck(th);
                    if (c0vsv2 != null) {
                        try {
                            c0vsv2.close();
                        } catch (IOException e5) {
                            TryCatchGuardChecker.doCheck(e5);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                TryCatchGuardChecker.doCheck(th6);
                throw th6;
            }
        }
        return length;
    }

    public final long writeToExternal(InputStream inputStream, String str) {
        C0VSV c0vsv;
        long length = 0;
        if (str == null) {
            return 0L;
        }
        synchronized (FileUtils.class) {
            try {
                C0VSJ c0vsj = new C0VSJ(str);
                if (!c0vsj.exists()) {
                    INSTANCE.createFile(c0vsj.getPath(), true);
                }
                C0VSV c0vsv2 = null;
                try {
                    try {
                        c0vsv = new C0VSV(c0vsj);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Exception e) {
                    e = e;
                }
                try {
                    TotalLengthOutputStream totalLengthOutputStream = new TotalLengthOutputStream(c0vsv);
                    INSTANCE.copyStream(inputStream, totalLengthOutputStream);
                    totalLengthOutputStream.flush();
                    totalLengthOutputStream.close();
                    length = totalLengthOutputStream.getLength();
                    try {
                        c0vsv.close();
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                } catch (Exception e3) {
                    e = e3;
                    c0vsv2 = c0vsv;
                    TryCatchGuardChecker.doCheck(e);
                    if (c0vsv2 != null) {
                        try {
                            c0vsv2.close();
                        } catch (IOException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0vsv2 = c0vsv;
                    TryCatchGuardChecker.doCheck(th);
                    if (c0vsv2 != null) {
                        try {
                            c0vsv2.close();
                        } catch (IOException e5) {
                            TryCatchGuardChecker.doCheck(e5);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
        return length;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x001c A[Catch: all -> 0x004c, TRY_ENTER, TryCatch #0 {, blocks: (B:10:0x000b, B:12:0x0011, B:13:0x0014, B:17:0x001c, B:18:0x004b), top: B:22:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void rename(java.io.File r4, java.io.File r5, boolean r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 != 0) goto L5
            monitor-exit(r3)
            return
        L5:
            if (r5 != 0) goto L9
            monitor-exit(r3)
            return
        L9:
            if (r6 == 0) goto L14
            boolean r0 = r5.exists()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L14
            X.C08QA.LJIIZILJ(r5)     // Catch: java.lang.Throwable -> L4c
        L14:
            boolean r0 = r4.renameTo(r5)     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L1c
            monitor-exit(r3)
            return
        L1c:
            java.lang.String r2 = "FileUtils"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "rename "
            r1.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r4.getName()     // Catch: java.lang.Throwable -> L4c
            r1.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r5.getName()     // Catch: java.lang.Throwable -> L4c
            r1.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = " failed!"
            r1.append(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L4c
            com.ss.android.ugc.effectmanager.common.logger.EPLog.e(r2, r0)     // Catch: java.lang.Throwable -> L4c
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L4c
            r0.<init>()     // Catch: java.lang.Throwable -> L4c
            throw r0     // Catch: java.lang.Throwable -> L4c
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.utils.FileUtils.rename(java.io.File, java.io.File, boolean):void");
    }

    public final synchronized void rename(String str, String str2, boolean z) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            return;
        }
        rename((File) new C0VSJ(str), (File) new C0VSJ(str2), true);
    }

    public final long copyStream(InputStream inputStream, OutputStream outputStream, long j, DownloadListener downloadListener) throws IOException {
        byte[] bArr = new byte[BUFFER_SIZE];
        int i = inputStream.read(bArr);
        long j2 = 0;
        while (i > 0) {
            if (outputStream != null) {
                outputStream.write(bArr, 0, i);
            }
            j2 += (long) i;
            if (j2 < j && j > 0 && downloadListener != null) {
                downloadListener.onProgress((int) ((j2 / j) * 100), j);
            }
            i = inputStream.read(bArr);
        }
        if (downloadListener != null) {
            downloadListener.onProgress(100, j);
        }
        return j2;
    }

    public final synchronized void rename(File file, File file2, boolean z, boolean z2) {
        if (file == null) {
            return;
        }
        if (file2 == null) {
            return;
        }
        if (z && !z2) {
            if (file2.exists()) {
                C08QA.LJIIZILJ(file2);
            }
        }
        if (!file.renameTo(file2)) {
            if (z2 && z) {
                C08QA.LJIIZILJ(file2);
                if (!file.renameTo(file2)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("rename ");
                    sbLIZ.append(file.getName());
                    sbLIZ.append(" to ");
                    sbLIZ.append(file2.getName());
                    sbLIZ.append(" failed!");
                    EPLog.e("FileUtils", C2188811AlT.LIZIZ(sbLIZ));
                    throw new IOException();
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("rename ");
                sbLIZ2.append(file.getName());
                sbLIZ2.append(" to ");
                sbLIZ2.append(file2.getName());
                sbLIZ2.append(" failed!");
                EPLog.e("FileUtils", C2188811AlT.LIZIZ(sbLIZ2));
                throw new IOException();
            }
        }
    }

    public final synchronized void rename(String str, String str2, boolean z, boolean z2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            return;
        }
        rename(new C0VSJ(str), new C0VSJ(str2), z, z2);
    }
}
