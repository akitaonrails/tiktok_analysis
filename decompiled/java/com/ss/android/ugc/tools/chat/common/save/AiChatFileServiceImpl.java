package com.ss.android.ugc.tools.chat.common.save;

import X.C054G;
import X.C0PEM;
import X.C1157450gE3;
import X.C1157780gEa;
import X.C1910960zpO;
import X.C1BNE;
import X.C21290818Tq;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C570490MZb;
import X.InterfaceC1157570gEF;
import X.InterfaceC332260D0u;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes29.dex */
public final class AiChatFileServiceImpl implements IAiChatFileService {
    public final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final ConcurrentHashMap<String, InterfaceC332260D0u<InterfaceC1157570gEF<String>>> LIZIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.tools.chat.common.save.IAiChatFileService
    public final InterfaceC332260D0u oo(String str, String str2, int i) {
        InterfaceC332260D0u<InterfaceC1157570gEF<String>> interfaceC332260D0uPutIfAbsent;
        ConcurrentHashMap<String, InterfaceC332260D0u<InterfaceC1157570gEF<String>>> concurrentHashMap = this.LIZIZ;
        InterfaceC332260D0u<InterfaceC1157570gEF<String>> interfaceC332260D0uLIZ = concurrentHashMap.get(str);
        if (interfaceC332260D0uLIZ == null && (interfaceC332260D0uPutIfAbsent = concurrentHashMap.putIfAbsent(str, (interfaceC332260D0uLIZ = C1BNE.LIZ(C1157780gEa.LIZ)))) != null) {
            interfaceC332260D0uLIZ = interfaceC332260D0uPutIfAbsent;
        }
        InterfaceC332260D0u<InterfaceC1157570gEF<String>> interfaceC332260D0u = interfaceC332260D0uLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadToCache, begin: url = ");
        sbLIZ.append(str);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(i);
        C21290818Tq.LIZJ("AiChatFileServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC332260D0u.getValue() instanceof C1157450gE3) {
            String str3 = (String) ((C1157450gE3) interfaceC332260D0u.getValue()).LIZ;
            if (!C570490MZb.LJ(str3)) {
                interfaceC332260D0u.setValue(C1157780gEa.LIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("downloadToCache, cache invalid: url = ");
                sbLIZ2.append(str);
                sbLIZ2.append(", path=");
                sbLIZ2.append(str3);
                C21290818Tq.LIZJ("AiChatFileServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        if (interfaceC332260D0u.getValue() instanceof C1157780gEa) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("downloadToCache, startDownload: url = ");
            sbLIZ3.append(str);
            sbLIZ3.append(", retryCount=");
            sbLIZ3.append(i);
            C21290818Tq.LIZJ("AiChatFileServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
            C23250099c.LIZLLL(this.LIZ, null, null, new C1910960zpO(this, str, interfaceC332260D0u, i, str2, null), 3);
        }
        return interfaceC332260D0u;
    }
}
