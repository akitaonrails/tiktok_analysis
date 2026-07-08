package com.ss.android.ugc.aweme.mob.event;

import X.AnonymousClass0073;
import X.C07ZI;
import X.C1554960qZC;
import X.InterfaceC1282004zy;
import X.InterfaceC1555100qZQ;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveHomePageMobProvider implements IHomePageMobProvider<AnonymousClass0073> {
    public static AnonymousClass0073 LIZ() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(null, "source_default_key", C07ZI.class, null);
        C07ZI c07zi = interfaceC1555100qZQLIZIZ != null ? (C07ZI) interfaceC1555100qZQLIZIZ.getSource() : null;
        AnonymousClass0073 anonymousClass0073 = new AnonymousClass0073(null);
        anonymousClass0073.LL = c07zi != null ? c07zi.LL : null;
        anonymousClass0073.LLILLJJLI = c07zi != null ? c07zi.LLILLJJLI : null;
        return anonymousClass0073;
    }

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final /* bridge */ /* synthetic */ InterfaceC1282004zy getParam() {
        return LIZ();
    }
}
