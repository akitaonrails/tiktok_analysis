package com.ss.android.ugc.aweme.poi.search.eventtrack;

import X.C0248006k;
import X.C1198010hHT;
import X.C1554960qZC;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiSearchMobProvider implements IPoiSearchProvider<C0248006k> {
    public final InterfaceC665370Q7z LL;

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        String str;
        Integer num = null;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(this.LL, "source_default_key", C1198010hHT.class, null);
        C1198010hHT c1198010hHT = interfaceC1555100qZQLIZIZ != null ? (C1198010hHT) interfaceC1555100qZQLIZIZ.getSource() : null;
        if (c1198010hHT != null) {
            str = c1198010hHT.LLILZIL;
            num = c1198010hHT.LLILZLL;
        } else {
            str = null;
        }
        return new C0248006k(str, num);
    }

    public PoiSearchMobProvider(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }
}
