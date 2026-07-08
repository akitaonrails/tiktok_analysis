package com.ss.android.ugc.aweme.detail.ui.friends;

import X.C0RJN;
import X.C1389300mG0;
import X.C13IQ;
import X.C13LE;
import X.C723850SaN;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailPanelConfiguration extends DetailPanelConfiguration {
    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final C13IQ<? extends UIContentAssem> LIZLLL(C0RJN c0rjn) {
        return C13LE.LIZ(FriendsDetailPageComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final void LIZJ(BasePanelUIComponent basePanelUIComponent) {
        C723850SaN.LIZLLL(basePanelUIComponent, new AwS590S0100000_11(basePanelUIComponent, 64));
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    /* JADX INFO: renamed from: LJ */
    public final boolean Tl2(C0RJN c0rjn) {
        return C1389300mG0.LJIIJJI(c0rjn);
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration, com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final boolean Tl2(C0RJN c0rjn) {
        return C1389300mG0.LJIIJJI(c0rjn);
    }
}
