package com.ss.android.ugc.effectmanager.common.utils;

import X.C0VSP;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public class MD5Utils {
    public static char[] sHexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String byteArrayToHex(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            char[] cArr2 = new char[bArr.length * 2];
            int i = 0;
            for (byte b : bArr) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        }
        return "";
    }

    public static String getFileMD5(File file) {
        return getFileMD5(file, null);
    }

    public static String getMD5String(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                stringBuffer.append(sHexDigits[(b & 240) >> 4]);
                stringBuffer.append(sHexDigits[b & 15]);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String getMD5String16Bit(String str) {
        String mD5String = getMD5String(str);
        if (!TextUtils.isEmpty(mD5String)) {
            return mD5String.substring(8, 24);
        }
        return null;
    }

    public static String getMD5String(String str) {
        if (str == null) {
            return null;
        }
        return getMD5String(str.getBytes());
    }

    public static String getFileMD5(File file, MonitorTrace monitorTrace) throws Throwable {
        if (!file.isFile()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MD5Utils#getFileMD5: failed, filePath = ");
            sbLIZ.append(file.getAbsolutePath());
            sbLIZ.append(", is not a file");
            EPMonitor.traceStep(monitorTrace, C2188811AlT.LIZIZ(sbLIZ));
            return "";
        }
        EPMonitor.traceStep(monitorTrace, "MD5Utils#getFileMD5: begin parse digest");
        byte[] bArr = new byte[1024];
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new C0VSP(file));
                while (true) {
                    try {
                        int i = bufferedInputStream2.read(bArr, 0, 1024);
                        if (i != -1) {
                            messageDigest.update(bArr, 0, i);
                        } else {
                            EPMonitor.traceStep(monitorTrace, "MD5Utils#getFileMD5: digest update success");
                            String strByteArrayToHex = byteArrayToHex(messageDigest.digest());
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("MD5Utils#getFileMD5: md5 result = ");
                            sbLIZ2.append(strByteArrayToHex);
                            EPMonitor.traceStep(monitorTrace, C2188811AlT.LIZIZ(sbLIZ2));
                            try {
                                bufferedInputStream2.close();
                                return strByteArrayToHex;
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                                return strByteArrayToHex;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bufferedInputStream = bufferedInputStream2;
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("MD5Utils#getFileMD5: exception occurred, cause = ");
                        sbLIZ3.append(e.getMessage());
                        EPMonitor.traceStep(monitorTrace, C2188811AlT.LIZIZ(sbLIZ3));
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                                return "";
                            } catch (IOException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                return "";
                            }
                        }
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        TryCatchGuardChecker.doCheck(th);
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                                throw th;
                            } catch (IOException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                throw th;
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }
}
