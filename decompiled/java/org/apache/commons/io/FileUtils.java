package org.apache.commons.io;

import X.C0VSP;
import X.C0VSV;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public class FileUtils {
    public static final File[] EMPTY_FILE_ARRAY;
    public static final BigInteger ONE_EB_BI;
    public static final BigInteger ONE_GB_BI;
    public static final BigInteger ONE_KB_BI;
    public static final BigInteger ONE_MB_BI;
    public static final BigInteger ONE_PB_BI;
    public static final BigInteger ONE_TB_BI;
    public static final BigInteger ONE_YB;
    public static final BigInteger ONE_ZB;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1024L);
        ONE_KB_BI = bigIntegerValueOf;
        BigInteger bigIntegerMultiply = bigIntegerValueOf.multiply(bigIntegerValueOf);
        ONE_MB_BI = bigIntegerMultiply;
        BigInteger bigIntegerMultiply2 = bigIntegerValueOf.multiply(bigIntegerMultiply);
        ONE_GB_BI = bigIntegerMultiply2;
        BigInteger bigIntegerMultiply3 = bigIntegerValueOf.multiply(bigIntegerMultiply2);
        ONE_TB_BI = bigIntegerMultiply3;
        BigInteger bigIntegerMultiply4 = bigIntegerValueOf.multiply(bigIntegerMultiply3);
        ONE_PB_BI = bigIntegerMultiply4;
        ONE_EB_BI = bigIntegerValueOf.multiply(bigIntegerMultiply4);
        BigInteger bigIntegerMultiply5 = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L));
        ONE_ZB = bigIntegerMultiply5;
        ONE_YB = bigIntegerValueOf.multiply(bigIntegerMultiply5);
        EMPTY_FILE_ARRAY = new File[0];
    }

    public static void forceMkdir(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("File ");
                sbLIZ.append(file);
                sbLIZ.append(" exists and is not a directory. Unable to create directory.");
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return;
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Unable to create directory ");
            sbLIZ2.append(file);
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static FileInputStream openInputStream(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (file.canRead()) {
                    return new C0VSP(file);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("File '");
                sbLIZ.append(file);
                sbLIZ.append("' cannot be read");
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("File '");
            sbLIZ2.append(file);
            sbLIZ2.append("' exists but is a directory");
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("File '");
        sbLIZ3.append(file);
        sbLIZ3.append("' does not exist");
        throw new FileNotFoundException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static FileOutputStream openOutputStream(File file, boolean z) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.canWrite()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("File '");
                    sbLIZ.append(file);
                    sbLIZ.append("' cannot be written to");
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("File '");
                sbLIZ2.append(file);
                sbLIZ2.append("' exists but is a directory");
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Directory '");
                sbLIZ3.append(parentFile);
                sbLIZ3.append("' could not be created");
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return new C0VSV(file, z);
    }

    public static String readFileToString(File file, Charset charset) throws Throwable {
        FileInputStream fileInputStreamOpenInputStream = openInputStream(file);
        try {
            String string = IOUtils.toString(fileInputStreamOpenInputStream, Charsets.toCharset(charset));
            if (fileInputStreamOpenInputStream != null) {
                fileInputStreamOpenInputStream.close();
            }
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
                    if (fileInputStreamOpenInputStream != null) {
                        if (th != null) {
                            try {
                                fileInputStreamOpenInputStream.close();
                                throw th;
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                th.addSuppressed(th3);
                                throw th;
                            }
                        }
                        fileInputStreamOpenInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void writeStringToFile(File file, String str, Charset charset) throws Throwable {
        writeStringToFile(file, str, charset, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void writeStringToFile(java.io.File r0, java.lang.String r1, java.nio.charset.Charset r2, boolean r3) throws java.lang.Throwable {
        /*
            java.io.FileOutputStream r0 = openOutputStream(r0, r3)
            org.apache.commons.io.IOUtils.write(r1, r0, r2)     // Catch: java.lang.Throwable -> L8
            goto L29
        L8:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> Ld
            throw r2     // Catch: java.lang.Throwable -> L13
        Ld:
            r1 = move-exception
            r2 = 0
        Lf:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto Lf
        L15:
            if (r0 == 0) goto L28
            if (r2 == 0) goto L1d
            r0.close()     // Catch: java.lang.Throwable -> L21
            throw r1
        L1d:
            r0.close()
            throw r1
        L21:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r2.addSuppressed(r0)
        L28:
            throw r1
        L29:
            if (r0 == 0) goto L2e
            r0.close()
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.FileUtils.writeStringToFile(java.io.File, java.lang.String, java.nio.charset.Charset, boolean):void");
    }
}
