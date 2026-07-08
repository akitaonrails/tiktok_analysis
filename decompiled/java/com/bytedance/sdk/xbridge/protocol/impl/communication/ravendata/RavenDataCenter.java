package com.bytedance.sdk.xbridge.protocol.impl.communication.ravendata;

import X.C1161780gL2;
import com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes19.dex */
public final class RavenDataCenter implements IRavenDataAbility {
    public final ConcurrentHashMap<String, HashMap<String, C1161780gL2>> LL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, RavenData<Object>> LLILLJJLI = new ConcurrentHashMap<>();

    @Override // com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility
    public final RavenData<Object> nH(String str) {
        return this.LLILLJJLI.get(str);
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility
    public final void Df2(String str, String str2) {
        HashMap<String, C1161780gL2> map = this.LL.get(str);
        if (map != null) {
            map.remove(str2);
        }
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility
    public final void kU0(String str, C1161780gL2 c1161780gL2) {
        if (!this.LL.containsKey(str)) {
            this.LL.put(str, new HashMap<>());
        }
        HashMap<String, C1161780gL2> map = this.LL.get(str);
        if (map != null) {
            map.put(c1161780gL2.LIZIZ, c1161780gL2);
        }
    }

    @Override // com.bytedance.sdk.xbridge.protocol.impl.communication.abilities.IRavenDataAbility
    public final void uJ(String str, RavenData<Object> ravenData) {
        if (ravenData.timestamp == -1) {
            ravenData.timestamp = System.currentTimeMillis();
        }
        synchronized (this) {
            try {
                RavenData<Object> ravenData2 = this.LLILLJJLI.get(str);
                if (ravenData2 != null && ravenData2.timestamp >= ravenData.timestamp) {
                    return;
                }
                this.LLILLJJLI.put(str, ravenData);
                HashMap<String, C1161780gL2> map = this.LL.get(str);
                if (map != null) {
                    Iterator<Map.Entry<String, C1161780gL2>> it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        it2.next().getValue().LIZ(ravenData);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
