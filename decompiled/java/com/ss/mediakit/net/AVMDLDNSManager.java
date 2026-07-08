package com.ss.mediakit.net;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class AVMDLDNSManager {
    public static Map<Integer, CreateConstructor> dnsMap;
    public static volatile AVMDLDNSManager mInstance;

    public static AVMDLDNSManager getInstance() {
        if (mInstance == null) {
            synchronized (AVMDLDNSManager.class) {
                try {
                    if (mInstance == null) {
                        try {
                            mInstance = new AVMDLDNSManager();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            mInstance = null;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return mInstance;
    }

    private void initDnsMap() {
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        dnsMap.put(1, defaultConstructor);
        dnsMap.put(2, defaultConstructor);
        dnsMap.put(3, defaultConstructor);
    }

    public AVMDLDNSManager() {
        dnsMap = new HashMap();
        initDnsMap();
    }

    public synchronized CreateConstructor getCreateConstructor(int i) {
        if (dnsMap.containsKey(Integer.valueOf(i))) {
            return dnsMap.get(Integer.valueOf(i));
        }
        return null;
    }

    public synchronized void registerDnsConstructor(int i, CreateConstructor createConstructor) {
        try {
            dnsMap.put(Integer.valueOf(i), createConstructor);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
