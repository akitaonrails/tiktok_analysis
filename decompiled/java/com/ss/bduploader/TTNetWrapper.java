package com.ss.bduploader;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import java.net.InetAddress;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class TTNetWrapper {
    public static List<InetAddress> dnsLookup(String str) {
        try {
            return TTNetInit.dnsLookup(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
