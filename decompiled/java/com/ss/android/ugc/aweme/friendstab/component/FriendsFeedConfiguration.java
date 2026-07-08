package com.ss.android.ugc.aweme.friendstab.component;

import X.C0RJN;
import X.C1389300mG0;
import X.C13LP;
import X.C1554610qYd;
import X.C1558520qew;
import X.C723850SaN;
import com.ss.android.ugc.aweme.protocol.IFriendsFeedSkylightProtocol;
import com.ss.android.ugc.aweme.protocol.SkylightProtocol;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.CommonPanelConfiguration;
import java.util.List;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsFeedConfiguration extends CommonPanelConfiguration {
    @Override // com.ss.android.ugc.feed.platform.panel.CommonPanelConfiguration
    public final void LIZ(BasePanelUIComponent basePanelUIComponent) {
        SkylightProtocol skylightProtocol;
        C723850SaN.LIZLLL(basePanelUIComponent, new AwS603S0100000_24(basePanelUIComponent, 73));
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(basePanelUIComponent), IFriendsFeedSkylightProtocol.class, false);
        if (listLIZIZ != null && (skylightProtocol = (SkylightProtocol) C13LP.LJJJLL(listLIZIZ)) != null) {
            skylightProtocol.PA0(basePanelUIComponent);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.ConfigurationProtocol
    public final boolean Tl2(C0RJN c0rjn) {
        return C1389300mG0.LJIIIZ(c0rjn);
    }
}
