package com.ss.android.ugc.aweme.paid.content.consumption;

import X.C1394910mP3;
import X.InterfaceC1393680mN4;
import com.ss.android.ugc.aweme.experiment.IPaidContentAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.IComponentStatus;

/* JADX INFO: loaded from: classes35.dex */
public final class PaidContentAnchorService implements IPaidContentAnchorService {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0mP3] */
    @Override // com.ss.android.ugc.aweme.experiment.IPaidContentAnchorService
    public final C1394910mP3 LIZ() {
        return new InterfaceC1393680mN4() { // from class: X.0mP3
            @Override // X.InterfaceC1393680mN4
            public final AbstractC707180Roa LIZIZ(InterfaceC1392640mLO interfaceC1392640mLO) {
                C1613880s6E c1613880s6E = new C1613880s6E(interfaceC1392640mLO.LIZIZ());
                ((IComponentStatus) ServiceManager.get().getService(IComponentStatus.class)).setComponentClickStatusExperimental(c1613880s6E, EnumC700430Rdh.POSITIVE);
                return c1613880s6E;
            }

            @Override // X.InterfaceC1393680mN4
            public final boolean LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z, int i) {
                if (anchorCommonStruct.getType() == EnumC1430380nKG.PAID_COLLECTION.getTYPE() && z) {
                    return true;
                }
                return false;
            }
        };
    }
}
