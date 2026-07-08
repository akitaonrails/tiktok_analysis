package com.ss.android.ugc.aweme.friendstab.text.panel;

import X.AbstractC738140SxQ;
import X.C0RJN;
import X.C723850SaN;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.IPanelConfigurationProtocol;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3TextPanelConfiguration implements IPanelConfigurationProtocol {
    @Override // com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final boolean Tl2(C0RJN c0rjn) {
        String str;
        if (c0rjn != null) {
            str = c0rjn.LIZ;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "SCENE_FRIENDS_V3_TEXT");
    }

    @Override // com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final void cD1(AbstractC738140SxQ abstractC738140SxQ) {
        BasePanelUIComponent basePanelUIComponent = (BasePanelUIComponent) abstractC738140SxQ;
        C723850SaN.LIZLLL(basePanelUIComponent, new AwS581S0100000_2(basePanelUIComponent, 646));
    }
}
