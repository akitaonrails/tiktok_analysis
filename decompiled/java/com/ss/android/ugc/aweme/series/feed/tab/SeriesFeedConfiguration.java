package com.ss.android.ugc.aweme.series.feed.tab;

import X.C0RJN;
import X.C723850SaN;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.CommonPanelConfiguration;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SeriesFeedConfiguration extends CommonPanelConfiguration {
    @Override // com.ss.android.ugc.feed.platform.panel.CommonPanelConfiguration
    public final void LIZ(BasePanelUIComponent basePanelUIComponent) {
        C723850SaN.LIZLLL(basePanelUIComponent, new AwS598S0100000_19(basePanelUIComponent, 248));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final boolean Tl2(C0RJN c0rjn) {
        String str;
        if (c0rjn != null) {
            str = c0rjn.LIZ;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "Series");
    }
}
