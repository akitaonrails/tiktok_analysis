package com.bytedance.i18n.location.api.internal;

import X.C1490700otY;
import X.C1798490wtz;
import X.C1798620wuC;
import X.C2188811AlT;
import X.EnumC1778890wON;
import X.InterfaceC1780400wQo;
import com.bytedance.i18n.location.api.WifiClient;

/* JADX INFO: loaded from: classes28.dex */
public final class DefaultWifiClient implements WifiClient {
    @Override // com.bytedance.i18n.location.api.WifiClient
    public final C1490700otY LJ() {
        return null;
    }

    @Override // com.bytedance.i18n.location.api.WifiClient
    public final void LIZIZ(C1798490wtz c1798490wtz, C1490700otY c1490700otY) {
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init: ");
        sbLIZ.append(c1798490wtz);
        C1798620wuC.LIZJ("FakeWifiClient", C2188811AlT.LIZIZ(sbLIZ), null);
    }

    @Override // com.bytedance.i18n.location.api.WifiClient
    public final void LJIJJ(long j, long j2, long j3, String str, InterfaceC1780400wQo interfaceC1780400wQo) {
        interfaceC1780400wQo.LIZ(null, 0L, 0L, EnumC1778890wON.PASSIVE);
    }
}
