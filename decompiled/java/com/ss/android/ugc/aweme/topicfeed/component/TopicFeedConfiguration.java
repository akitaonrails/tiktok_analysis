package com.ss.android.ugc.aweme.topicfeed.component;

import X.C0RJN;
import X.C723850SaN;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.CommonPanelConfiguration;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class TopicFeedConfiguration extends CommonPanelConfiguration {
    @Override // com.ss.android.ugc.feed.platform.panel.CommonPanelConfiguration
    public final void LIZ(BasePanelUIComponent basePanelUIComponent) {
        C723850SaN.LIZLLL(basePanelUIComponent, new AwS603S0100000_24(basePanelUIComponent, 334));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final boolean Tl2(C0RJN c0rjn) {
        String str;
        if (c0rjn != null) {
            str = c0rjn.LIZ;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "Topic");
    }
}
