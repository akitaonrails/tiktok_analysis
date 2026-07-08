package com.ss.android.ugc.feed.platform.panel.incentive;

import X.C1565330qpv;
import X.C628500Oky;
import X.C630740Ooa;
import X.InterfaceC1126704av;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.specact.api.IFeedPlayerService;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class IncentiveFeedComponent extends BasePanelComponent {
    public final C630740Ooa LL = C628500Oky.LIZ(new AwS568S0100000_24(this, 1533));
    public final C1565330qpv LLILLJJLI = new InterfaceC1126704av() { // from class: X.0qpv
        @Override // X.InterfaceC1126704av
        public final void LIZ() {
            IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LIZ.LL.getValue();
            if (iPlayerComponentAbility != null) {
                iPlayerComponentAbility.tryResumePlay();
            }
        }

        @Override // X.InterfaceC1126704av
        public final void LIZIZ() {
            IPlayerComponentAbility iPlayerComponentAbility = (IPlayerComponentAbility) this.LIZ.LL.getValue();
            if (iPlayerComponentAbility != null) {
                iPlayerComponentAbility.LLLLLLLLLL();
            }
        }
    };

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void bo() {
        IFeedPlayerService iFeedPlayerService = (IFeedPlayerService) PluggableExtentionKt.pluggableSpi$default(IFeedPlayerService.class, false, false, false, 14, null);
        if (iFeedPlayerService != null) {
            iFeedPlayerService.LIZIZ(this.LLILLJJLI);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        bo();
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        bo();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        IFeedPlayerService iFeedPlayerService = (IFeedPlayerService) PluggableExtentionKt.pluggableSpi$default(IFeedPlayerService.class, false, false, false, 14, null);
        if (iFeedPlayerService != null) {
            iFeedPlayerService.LIZ(this.LLILLJJLI);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPagePause(int i) {
        super.onPagePause(i);
        bo();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void onPageResume(int i) {
        super.onPageResume(i);
        IFeedPlayerService iFeedPlayerService = (IFeedPlayerService) PluggableExtentionKt.pluggableSpi$default(IFeedPlayerService.class, false, false, false, 14, null);
        if (iFeedPlayerService != null) {
            iFeedPlayerService.LIZ(this.LLILLJJLI);
        }
    }
}
