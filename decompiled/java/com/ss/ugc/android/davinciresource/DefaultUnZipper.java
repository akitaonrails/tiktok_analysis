package com.ss.ugc.android.davinciresource;

import X.C0VSJ;
import X.C0VSP;
import X.C0VSV;
import X.C2107108Nh;
import X.C2188811AlT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultUnZipper extends DAVUnZipFunc {
    public static final DefaultUnZipper INSTANCE = new DefaultUnZipper();

    private final boolean deleteFile(File file) {
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list != null) {
                new IntRange(0, list.length - 1);
                for (String str : list) {
                    if (!deleteFile(new C0VSJ(file, str))) {
                        return false;
                    }
                }
            } else {
                return true;
            }
        }
        return file.delete();
    }

    private final boolean isSafe(ZipEntry zipEntry) {
        String name;
        if (zipEntry == null || (name = zipEntry.getName()) == null || name.length() == 0) {
            return false;
        }
        String name2 = zipEntry.getName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("..");
        sbLIZ.append(File.separator);
        if (a0.LJJIIZI(name2, C2188811AlT.LIZIZ(sbLIZ), false)) {
            return false;
        }
        return true;
    }

    public static final boolean renameFile(String str, String str2) {
        C0VSJ c0vsj = new C0VSJ(str2);
        if (c0vsj.exists()) {
            INSTANCE.deleteFile(c0vsj);
        }
        C0VSJ c0vsj2 = new C0VSJ(str);
        C0VSJ c0vsj3 = new C0VSJ(str2);
        if (!c0vsj2.exists()) {
            return false;
        }
        return c0vsj2.renameTo(c0vsj3);
    }

    public static final String unzip(File file, File file2) throws Exception {
        try {
            C0VSP c0vsp = new C0VSP(file);
            String absolutePath = file2.getAbsolutePath();
            ZipInputStream zipInputStream = new ZipInputStream(c0vsp);
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        DefaultUnZipper defaultUnZipper = INSTANCE;
                        if (defaultUnZipper.isSafe(nextEntry)) {
                            if (nextEntry.isDirectory()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(absolutePath);
                                sbLIZ.append(File.separator);
                                sbLIZ.append(nextEntry.getName());
                                new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).mkdirs();
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(absolutePath);
                                sbLIZ2.append(File.separator);
                                sbLIZ2.append(nextEntry.getName());
                                C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
                                File parentFile = c0vsj.getParentFile();
                                if (parentFile != null && !parentFile.exists()) {
                                    parentFile.mkdirs();
                                } else if (c0vsj.exists()) {
                                    defaultUnZipper.deleteFile(c0vsj);
                                } else {
                                    c0vsj.createNewFile();
                                }
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV(c0vsj));
                                try {
                                    byte[] bArr = new byte[SpeechEngineDefines.ASR_WORK_MODE_OFFLINE];
                                    while (true) {
                                        int i = zipInputStream.read(bArr);
                                        if (i == -1) {
                                            break;
                                        }
                                        bufferedOutputStream.write(bArr, 0, i);
                                    }
                                    bufferedOutputStream.flush();
                                    C2107108Nh.LIZ(bufferedOutputStream, null);
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
                                            C2107108Nh.LIZ(bufferedOutputStream, th);
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            }
                        }
                    } else {
                        C2107108Nh.LIZ(zipInputStream, null);
                        return file2.getAbsolutePath();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th5) {
                            th = th5;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(zipInputStream, th);
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(zipInputStream, th);
                        throw th;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            INSTANCE.deleteFile(file2);
            if (!(e instanceof IOException)) {
                throw new IOException("Error when decompressing zip file.", e);
            }
            throw e;
        }
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc
    public boolean unZip(String str, String str2, boolean z) {
        boolean zRenameFile = false;
        if (str != null && !a0.LJJJIL(str) && str2 != null && !a0.LJJJIL(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append("_temp");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj.exists()) {
                deleteFile(c0vsj);
            }
            try {
                unzip(new C0VSJ(str), c0vsj);
                zRenameFile = renameFile(c0vsj.getAbsolutePath(), str2);
                if (z) {
                    deleteFile(new C0VSJ(str));
                    return zRenameFile;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                e.getMessage();
            }
        }
        return zRenameFile;
    }
}
