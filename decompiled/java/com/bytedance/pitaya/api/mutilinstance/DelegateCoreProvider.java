package com.bytedance.pitaya.api.mutilinstance;

import com.bytedance.pitaya.api.CoreProvider;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class DelegateCoreProvider implements CoreProvider {
    public static final DelegateCoreProvider INSTANCE = new DelegateCoreProvider();
    public static final Map<String, IPitayaCore> cores = new LinkedHashMap();
    public static CoreProvider realProvider;

    public final CoreProvider getRealProvider() {
        return realProvider;
    }

    @Override // com.bytedance.pitaya.api.CoreProvider
    public IPitayaCore getCore(String str) {
        IPitayaCore delegateCore;
        Map<String, IPitayaCore> map = cores;
        synchronized (map) {
            try {
                delegateCore = map.get(str);
                if (delegateCore == null) {
                    CoreProvider coreProvider = realProvider;
                    if (coreProvider == null || (delegateCore = coreProvider.getCore(str)) == null) {
                        delegateCore = new DelegateCore(str);
                    }
                    map.put(str, delegateCore);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return delegateCore;
    }

    public final void setRealProvider(CoreProvider coreProvider) {
        IPitayaCore core;
        Map<String, IPitayaCore> map = cores;
        synchronized (map) {
            if (coreProvider != null) {
                try {
                    if (realProvider == null) {
                        realProvider = coreProvider;
                        for (Map.Entry<String, IPitayaCore> entry : map.entrySet()) {
                            if (entry.getValue() instanceof DelegateCore) {
                                DelegateCore delegateCore = (DelegateCore) entry.getValue();
                                CoreProvider coreProvider2 = realProvider;
                                if (coreProvider2 != null) {
                                    core = coreProvider2.getCore(entry.getKey());
                                } else {
                                    core = null;
                                }
                                delegateCore.setRealCore$pitayacore_release(core);
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
