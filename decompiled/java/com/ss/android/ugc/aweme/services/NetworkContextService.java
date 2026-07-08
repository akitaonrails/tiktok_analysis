package com.ss.android.ugc.aweme.services;

import X.C04TD;
import X.C807280Vle;
import X.C807350Vll;
import X.C807390Vlp;
import com.ss.android.ugc.aweme.network.spi.INetworkContextService;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkContextService implements INetworkContextService {
    public final ConcurrentHashMap<String, C807390Vlp> contextMap = new ConcurrentHashMap<>();

    public static INetworkContextService createINetworkContextServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(INetworkContextService.class, z);
        if (objLIZ != null) {
            return (INetworkContextService) objLIZ;
        }
        if (C04TD.B4 == null) {
            synchronized (INetworkContextService.class) {
                if (C04TD.B4 == null) {
                    C04TD.B4 = new NetworkContextService();
                }
            }
        }
        return C04TD.B4;
    }

    public String bindSpan(String str) {
        if (str == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strLIZIZ = C807350Vll.LIZIZ.LIZIZ(null);
        this.contextMap.put(str, new C807390Vlp(strLIZIZ, jCurrentTimeMillis));
        return strLIZIZ;
    }

    public C807390Vlp getNetworkContext(String str) {
        if (str == null) {
            return null;
        }
        return this.contextMap.get(str);
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkContextService
    public C807390Vlp removeNetworkContext(String str) {
        if (str == null) {
            return null;
        }
        return this.contextMap.remove(str);
    }

    public String bindSubSpan(String str, String str2) {
        if (str == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strLJIIJ = C807280Vle.LIZIZ.LJIIJ(str2);
        this.contextMap.put(str, new C807390Vlp(strLJIIJ, jCurrentTimeMillis));
        return strLJIIJ;
    }
}
