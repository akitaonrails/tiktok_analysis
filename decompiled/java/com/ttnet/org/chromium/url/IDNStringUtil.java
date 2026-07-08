package com.ttnet.org.chromium.url;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.IDN;

/* JADX INFO: loaded from: classes3.dex */
public class IDNStringUtil {
    public static String idnToASCII(String str) {
        try {
            return IDN.toASCII(str, 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
