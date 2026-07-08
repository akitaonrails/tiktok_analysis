package com.ss.android.ugc.aweme.detail.component;

import X.C0RJN;
import X.C13IQ;
import X.C13LE;
import X.C723850SaN;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.CommonPanelConfiguration;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class DetailPanelConfiguration extends CommonPanelConfiguration {
    public void LIZJ(BasePanelUIComponent basePanelUIComponent) {
    }

    public C13IQ<? extends UIContentAssem> LIZLLL(C0RJN c0rjn) {
        return C13LE.LIZ(DetailPageComponent.class);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.CommonPanelConfiguration
    public final void LIZ(BasePanelUIComponent basePanelUIComponent) {
        C723850SaN.LIZLLL(basePanelUIComponent, new AwS390S0200000_24(this, basePanelUIComponent, 2));
        LIZJ(basePanelUIComponent);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public boolean Tl2(C0RJN c0rjn) {
        return Intrinsics.LJFF(c0rjn.LIZ, "DETAIL");
    }
}
