package com.ss.android.ugc.aweme.feed.component;

import X.C05K5;
import X.C05K6;
import X.C0RJN;
import X.C1389300mG0;
import X.C13IQ;
import X.C1579170rCF;
import X.C1579180rCG;
import X.C1579200rCI;
import X.C1579220rCK;
import X.C1579230rCL;
import X.C1579240rCM;
import X.C1579280rCQ;
import X.C19719912Dl;
import X.C723850SaN;
import X.InterfaceC713890RzP;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.CommonPanelConfiguration;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class RecommendFeedConfiguration extends CommonPanelConfiguration {
    @Override // com.ss.android.ugc.feed.platform.panel.CommonPanelConfiguration
    public final void LIZ(BasePanelUIComponent basePanelUIComponent) {
        InterfaceC713890RzP interfaceC713890RzPLJJIII;
        C19719912Dl c19719912DlLJFF;
        C723850SaN.LIZLLL(basePanelUIComponent, new AwS390S0200000_24(basePanelUIComponent, this, 8));
        if (basePanelUIComponent instanceof RootPanelComponent) {
            RootPanelComponent rootPanelComponent = (RootPanelComponent) basePanelUIComponent;
            C1579180rCG c1579180rCG = new C1579180rCG();
            C05K5 c05k5 = rootPanelComponent.LLJJIJIL;
            if (c05k5 != null) {
                c05k5.LIZ(c1579180rCG);
            }
            C1579220rCK c1579220rCK = new C1579220rCK();
            C05K5 c05k52 = rootPanelComponent.LLJJIJIL;
            if (c05k52 != null) {
                c05k52.LIZ(c1579220rCK);
            }
            C05K6.LIZ(rootPanelComponent, new C1579280rCQ());
            C1579170rCF c1579170rCF = new C1579170rCF();
            C05K5 c05k53 = rootPanelComponent.LLJJIJIL;
            if (c05k53 != null) {
                c05k53.LIZ(c1579170rCF);
            }
            C1579230rCL c1579230rCL = new C1579230rCL();
            C05K5 c05k54 = rootPanelComponent.LLJJIJIL;
            if (c05k54 != null) {
                c05k54.LIZ(c1579230rCL);
            }
            C1579240rCM c1579240rCM = new C1579240rCM();
            C05K5 c05k55 = rootPanelComponent.LLJJIJIL;
            if (c05k55 != null) {
                c05k55.LIZ(c1579240rCM);
            }
            C1579200rCI c1579200rCI = new C1579200rCI();
            C05K5 c05k56 = rootPanelComponent.LLJJIJIL;
            if (c05k56 != null) {
                c05k56.LIZ(c1579200rCI);
            }
            AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(703);
            C05K5 c05k57 = rootPanelComponent.LLJJIJIL;
            if (c05k57 != null) {
                c05k57.LIZ(aFwS264S0000000_24);
            }
            AFwS264S0000000_24 aFwS264S0000000_242 = AFwS264S0000000_24.get$arr$(704);
            C05K5 c05k58 = rootPanelComponent.LLJJIJIL;
            if (c05k58 != null) {
                c05k58.LIZ(aFwS264S0000000_242);
            }
            IMinisApiService iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
            if (iMinisApiService != null && (interfaceC713890RzPLJJIII = iMinisApiService.LJJIII()) != null && (c19719912DlLJFF = interfaceC713890RzPLJJIII.LJFF()) != null) {
                AwS603S0100000_24 awS603S0100000_24 = new AwS603S0100000_24(c19719912DlLJFF, (C13IQ<? extends BaseMainContainerAssem>) 601);
                C05K5 c05k59 = rootPanelComponent.LLJJIJIL;
                if (c05k59 != null) {
                    c05k59.LIZ(awS603S0100000_24);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final boolean Tl2(C0RJN c0rjn) {
        return C1389300mG0.LJIL(c0rjn);
    }
}
