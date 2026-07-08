package com.ss.android.ugc.feed.platform.panel;

import X.AbstractC738140SxQ;
import X.C05K5;
import X.C05K6;
import X.C1367960lha;
import X.C1389300mG0;
import X.C1564890qpD;
import X.C1579150rCD;
import X.C1579160rCE;
import X.C1579190rCH;
import X.C1579250rCN;
import X.C1579260rCO;
import X.C1579270rCP;
import X.C1618440sDa;
import X.C723850SaN;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.ISearchDebugService;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS6S0020000_24;

/* JADX INFO: loaded from: classes25.dex */
public abstract class CommonPanelConfiguration implements IPanelConfigurationProtocol {
    public abstract void LIZ(BasePanelUIComponent basePanelUIComponent);

    @Override // com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final void cD1(AbstractC738140SxQ abstractC738140SxQ) {
        BasePanelUIComponent basePanelUIComponent = (BasePanelUIComponent) abstractC738140SxQ;
        C723850SaN.LIZLLL(basePanelUIComponent, new C1564890qpD(basePanelUIComponent));
        if (basePanelUIComponent instanceof RootPanelComponent) {
            RootPanelComponent rootPanelComponent = (RootPanelComponent) basePanelUIComponent;
            C05K6.LIZ(rootPanelComponent, new C1579250rCN());
            C1579150rCD c1579150rCD = new C1579150rCD();
            C05K5 c05k5 = rootPanelComponent.LLJJIJIL;
            if (c05k5 != null) {
                c05k5.LIZ(c1579150rCD);
            }
            C05K6.LIZ(rootPanelComponent, new C1579260rCO());
            C05K6.LIZ(rootPanelComponent, new C1579270rCP());
            C1579190rCH c1579190rCH = new C1579190rCH();
            C05K5 c05k52 = rootPanelComponent.LLJJIJIL;
            if (c05k52 != null) {
                c05k52.LIZ(c1579190rCH);
            }
            C1579160rCE c1579160rCE = new C1579160rCE();
            C05K5 c05k53 = rootPanelComponent.LLJJIJIL;
            if (c05k53 != null) {
                c05k53.LIZ(c1579160rCE);
            }
            AwS6S0020000_24 awS6S0020000_24 = new AwS6S0020000_24(C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(rootPanelComponent.getPanelContext().LJ), C1389300mG0.LJIILL(rootPanelComponent.getPanelContext()), 3);
            C05K5 c05k54 = rootPanelComponent.LLJJIJIL;
            if (c05k54 != null) {
                c05k54.LIZ(awS6S0020000_24);
            }
            C1367960lha.LIZ.getClass();
            Class<? extends AbstractC738140SxQ> clsLJJLIIIJ = C1367960lha.LIZ().LJJLIIIJ();
            if (clsLJJLIIIJ != null) {
                AwS603S0100000_24 awS603S0100000_24 = new AwS603S0100000_24(clsLJJLIIIJ, (Class<? extends AbstractC738140SxQ>) 422);
                C05K5 c05k55 = rootPanelComponent.LLJJIJIL;
                if (c05k55 != null) {
                    c05k55.LIZ(awS603S0100000_24);
                }
            }
            ISearchDebugService iSearchDebugService = (ISearchDebugService) PluggableExtentionKt.pluggableSpi$default(ISearchDebugService.class, false, false, false, 14, null);
            if (iSearchDebugService != null) {
                iSearchDebugService.LIZJ();
            }
            AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(552);
            C05K5 c05k56 = rootPanelComponent.LLJJIJIL;
            if (c05k56 != null) {
                c05k56.LIZ(aFwS264S0000000_24);
            }
        }
        LIZ(basePanelUIComponent);
    }
}
