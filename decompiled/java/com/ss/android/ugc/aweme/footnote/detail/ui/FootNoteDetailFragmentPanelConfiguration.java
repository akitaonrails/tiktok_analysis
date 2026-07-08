package com.ss.android.ugc.aweme.footnote.detail.ui;

import X.C0RJN;
import X.C13IQ;
import X.C13LE;
import X.C723850SaN;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class FootNoteDetailFragmentPanelConfiguration extends DetailPanelConfiguration {
    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final C13IQ<? extends UIContentAssem> LIZLLL(C0RJN c0rjn) {
        return C13LE.LIZ(FootNoteDetailPageComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final void LIZJ(BasePanelUIComponent basePanelUIComponent) {
        C723850SaN.LIZLLL(basePanelUIComponent, new AwS597S0100000_18(basePanelUIComponent, 112));
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    /* JADX INFO: renamed from: LJ */
    public final boolean Tl2(C0RJN c0rjn) {
        return Intrinsics.LJFF(c0rjn.LIZ, "DETAIL_FOOTNOTE");
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration, com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final /* bridge */ /* synthetic */ boolean Tl2(C0RJN c0rjn) {
        return Tl2(c0rjn);
    }
}
