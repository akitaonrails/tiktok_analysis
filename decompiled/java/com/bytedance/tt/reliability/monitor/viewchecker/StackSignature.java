package com.bytedance.tt.reliability.monitor.viewchecker;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class StackSignature {
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    public static String shortHash(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(UTF_8));
            StringBuilder sb = new StringBuilder(16);
            for (int i = 0; i < 8; i++) {
                int i2 = bArrDigest[i] & 255;
                if (i2 < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(i2));
            }
            return sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return Integer.toHexString(str.hashCode());
        }
    }

    public static String shortenClassName(String str) {
        if (str != null && !str.isEmpty()) {
            String[] strArrSplit = str.split("\\.");
            if (strArrSplit.length <= 2) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str.length());
            for (int i = 0; i < strArrSplit.length - 2; i++) {
                if (!strArrSplit[i].isEmpty()) {
                    sb.append(strArrSplit[i].charAt(0));
                    sb.append('.');
                }
            }
            sb.append(strArrSplit[strArrSplit.length - 2]);
            sb.append('.');
            sb.append(strArrSplit[strArrSplit.length - 1]);
            return sb.toString();
        }
        return "";
    }

    public static String compute(StackTraceElement[] stackTraceElementArr, int i) {
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            int iMax = Math.max(1, i);
            StringBuilder sb = new StringBuilder(256);
            int i2 = 0;
            for (int i3 = 0; i3 < stackTraceElementArr.length && i2 < iMax; i3++) {
                StackTraceElement stackTraceElement = stackTraceElementArr[i3];
                sb.append(stackTraceElement.getClassName());
                sb.append('#');
                sb.append(stackTraceElement.getMethodName());
                sb.append('|');
                i2++;
            }
            if (i2 == 0) {
                return "noframe";
            }
            return shortHash(sb.toString());
        }
        return "empty";
    }

    public static StackTraceElement[] filter(StackTraceElement[] stackTraceElementArr, List<String> list) {
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0 && list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet(2);
            ArrayList arrayList = new ArrayList(stackTraceElementArr.length);
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (matchesFilterKeyword(stackTraceElement, list)) {
                    hashSet.add(stackTraceElement.getClassName());
                } else {
                    arrayList.add(stackTraceElement);
                }
            }
            if (arrayList.size() == stackTraceElementArr.length) {
                return stackTraceElementArr;
            }
            return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
        }
        return stackTraceElementArr;
    }

    public static boolean matchesFilterKeyword(StackTraceElement stackTraceElement, List<String> list) {
        String methodName;
        if (list == null || list.isEmpty() || (methodName = stackTraceElement.getMethodName()) == null) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            String str = (String) ListProtector.get(list, i);
            if (str != null && !str.isEmpty() && methodName.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
