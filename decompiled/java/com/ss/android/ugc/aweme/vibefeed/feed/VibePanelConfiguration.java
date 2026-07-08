package com.ss.android.ugc.aweme.vibefeed.feed;

import X.C0RJN;
import X.C1389300mG0;
import X.C13IQ;
import X.C13LE;
import X.C723850SaN;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class VibePanelConfiguration extends DetailPanelConfiguration {
    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final void LIZJ(BasePanelUIComponent basePanelUIComponent) {
        C723850SaN.LIZLLL(basePanelUIComponent, new AwS390S0200000_24(basePanelUIComponent, this, 55));
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final C13IQ<? extends UIContentAssem> LIZLLL(C0RJN c0rjn) {
        Class cls;
        String strLIZ = C1389300mG0.LIZ(c0rjn);
        if (Intrinsics.LJFF(strLIZ, "shared_feed")) {
            return C13LE.LIZ(VibeFeedDetailPageComponent.class);
        }
        if (Intrinsics.LJFF(strLIZ, "shared_feed_like_history")) {
            cls = VibeLikeHistoryPageComponent.class;
        } else {
            cls = SimpleVibeDetailPageComponent.class;
        }
        return C13LE.LIZ(cls);
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    /* JADX INFO: renamed from: LJ */
    public final boolean Tl2(C0RJN c0rjn) {
        return Intrinsics.LJFF(c0rjn.LIZ, "DETAIL_VIBE_FEED");
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration, com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final /* bridge */ /* synthetic */ boolean Tl2(C0RJN c0rjn) {
        return Tl2(c0rjn);
    }
}
