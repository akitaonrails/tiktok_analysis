package com.bytedance.realx.base;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class JniHelper {
    public static Object getStringClass() {
        return String.class;
    }

    public static Object getKey(Map.Entry entry) {
        return entry.getKey();
    }

    public static byte[] getStringBytes(String str) {
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("utf-8 is unsupported");
        }
    }

    public static Object getValue(Map.Entry entry) {
        return entry.getValue();
    }
}
