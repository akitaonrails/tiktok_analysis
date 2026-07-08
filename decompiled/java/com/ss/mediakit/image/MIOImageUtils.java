package com.ss.mediakit.image;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
public class MIOImageUtils {
    public static String encodeUrl(String str) {
        try {
            return URLEncoder.encode(str, StandardCharsets.UTF_8.name());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AVMDLLog.d("MIO_IMG", e.toString());
            return null;
        }
    }

    public static boolean isNullOrEmpty(Collection<?> collection) {
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    public static String md5(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AVMDLLog.d("MIO_IMG", e.toString());
            return null;
        }
    }
}
