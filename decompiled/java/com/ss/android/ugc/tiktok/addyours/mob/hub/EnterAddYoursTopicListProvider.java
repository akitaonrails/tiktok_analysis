package com.ss.android.ugc.tiktok.addyours.mob.hub;

import X.C0244006g;
import X.C0DLD;
import X.C0OB6;
import X.C13LP;
import X.C1554960qZC;
import X.C615560OCk;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class EnterAddYoursTopicListProvider implements IAddYoursHubProtocol<C0244006g> {
    public final InterfaceC665370Q7z LL;

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        C0OB6 c0ob6;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        C0DLD c0dld;
        List list;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ2 = C1554960qZC.LIZIZ(this.LL, "source_default_key", C0OB6.class, null);
        if (interfaceC1555100qZQLIZIZ2 == null || (c0ob6 = (C0OB6) interfaceC1555100qZQLIZIZ2.getSource()) == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(this.LL, "source_default_key", C0DLD.class, null)) == null || (c0dld = (C0DLD) interfaceC1555100qZQLIZIZ.getSource()) == null || (list = (List) c0dld.LL) == null) {
            return null;
        }
        C615560OCk c615560OCk = (C615560OCk) C13LP.LJJJLZIJ(0, list);
        int i = c615560OCk != null ? c615560OCk.LIZIZ : 0;
        C615560OCk c615560OCk2 = (C615560OCk) C13LP.LJJJLZIJ(1, list);
        Integer numValueOf = c615560OCk2 != null ? Integer.valueOf(c615560OCk2.LIZIZ) : null;
        return new C0244006g(c0ob6.LL, c0ob6.LLILLL, String.valueOf(i), numValueOf != null ? numValueOf.toString() : null);
    }

    public EnterAddYoursTopicListProvider(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
    }
}
