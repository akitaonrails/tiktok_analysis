package com.ss.android.ugc.aweme.offlinemode.ui;

import X.C0RJN;
import X.C13IQ;
import X.C13LE;
import X.C19319410i8;
import X.C723850SaN;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeDetailPanelConfiguration extends DetailPanelConfiguration {
    public static final C19319410i8 LL = new C19319410i8("Configuration");

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final void LIZJ(BasePanelUIComponent basePanelUIComponent) {
        LL.LIZ("applyDetailComponent", null);
        C723850SaN.LIZLLL(basePanelUIComponent, new AwS588S0100000_9(basePanelUIComponent, 358));
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final C13IQ<? extends UIContentAssem> LIZLLL(C0RJN c0rjn) {
        OfflineModeListVM.LLJJIII = System.currentTimeMillis();
        return C13LE.LIZ(OfflineModeDetailPageComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    /* JADX INFO: renamed from: LJ */
    public final boolean Tl2(C0RJN c0rjn) {
        return Intrinsics.LJFF(c0rjn.LIZ, "SCENE_DETAIL_OFFLINE_MODE");
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration, com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final /* bridge */ /* synthetic */ boolean Tl2(C0RJN c0rjn) {
        return Tl2(c0rjn);
    }
}
