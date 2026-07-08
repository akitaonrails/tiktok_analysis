package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.configuration;

import X.AbstractC738140SxQ;
import X.C0RJN;
import X.C13LP;
import X.C1554610qYd;
import X.C1558520qew;
import X.C723850SaN;
import com.ss.android.ugc.aweme.protocol.IFriendsFeedSkylightProtocol;
import com.ss.android.ugc.aweme.protocol.SkylightProtocol;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.IPanelConfigurationProtocol;
import java.util.List;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3PanelConfiguration implements IPanelConfigurationProtocol {
    @Override // com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final boolean Tl2(C0RJN c0rjn) {
        return Intrinsics.LJFF("Friends_v3", c0rjn.LIZ);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final void cD1(AbstractC738140SxQ abstractC738140SxQ) {
        SkylightProtocol skylightProtocol;
        BasePanelUIComponent basePanelUIComponent = (BasePanelUIComponent) abstractC738140SxQ;
        C723850SaN.LIZLLL(basePanelUIComponent, new AwS603S0100000_24(basePanelUIComponent, 478));
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(basePanelUIComponent), IFriendsFeedSkylightProtocol.class, false);
        if (listLIZIZ != null && (skylightProtocol = (SkylightProtocol) C13LP.LJJJLL(listLIZIZ)) != null) {
            skylightProtocol.PA0(basePanelUIComponent);
        }
    }
}
