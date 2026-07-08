package com.ss.android.ugc.aweme.detail.component.biz;

import X.C0RJN;
import X.C1346440l8s;
import X.C13IQ;
import X.C723850SaN;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration;
import com.ss.android.ugc.aweme.service.ICreativeAppDiffService;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicPanelConfiguration extends DetailPanelConfiguration {
    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final C13IQ<? extends UIContentAssem> LIZLLL(C0RJN c0rjn) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final void LIZJ(BasePanelUIComponent basePanelUIComponent) {
        ICreativeAppDiffService.LIZ.getClass();
        C1346440l8s.LIZ().LIZIZ();
        C723850SaN.LIZLLL(basePanelUIComponent, new AwS600S0100000_21(basePanelUIComponent, 110));
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    /* JADX INFO: renamed from: LJ */
    public final boolean Tl2(C0RJN c0rjn) {
        return Intrinsics.LJFF(c0rjn.LIZ, "DETAIL_MUSIC");
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration, com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final /* bridge */ /* synthetic */ boolean Tl2(C0RJN c0rjn) {
        return Tl2(c0rjn);
    }
}
