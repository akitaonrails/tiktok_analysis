package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed;

import X.C0RJN;
import X.C13IQ;
import X.C13LE;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class SeaPdpCreatorVideoDetailPanelConfiguration extends DetailPanelConfiguration {
    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    public final C13IQ<? extends UIContentAssem> LIZLLL(C0RJN c0rjn) {
        return C13LE.LIZ(SeaPdpCreatorVideoDetailPageComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration
    /* JADX INFO: renamed from: LJ */
    public final boolean Tl2(C0RJN c0rjn) {
        return Intrinsics.LJFF(c0rjn.LIZ, "DETAIL_ECOM_SEA_PDP_CREATOR_VIDEO");
    }

    @Override // com.ss.android.ugc.aweme.detail.component.DetailPanelConfiguration, com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final /* bridge */ /* synthetic */ boolean Tl2(C0RJN c0rjn) {
        return Tl2(c0rjn);
    }
}
