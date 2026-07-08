package com.ss.android.ugc.aweme.feed.landscape.cell.assem;

import X.C01GW;
import X.C0RQB;
import X.C13LE;
import X.C1558520qew;
import X.C452501pT;
import X.C737910Sx3;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.LandscapePanelStateViewModel;
import com.ss.android.ugc.aweme.abilities.LandscapePanelStateNotificationAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandScapeFeedIntroAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS119S0101000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapePanelStateNotificationAssem extends BaseCellLogicComponent<LandscapePanelStateNotificationAssem> implements LandscapePanelStateNotificationAbility, InterfaceC1554640qYg {
    public final C01GW LLJJIJI = C737910Sx3.LIZJ(this, C13LE.LIZ(LandscapePanelStateViewModel.class), AFwS243S0000000_11.get$arr$(183));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 388));

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2034101407) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.aweme.abilities.LandscapePanelStateNotificationAbility
    public final void tq1(int i, boolean z) {
        if ((C0RQB.SHOW_INTRO.getValue() & i) != 0) {
            if (z) {
                LandScapeFeedIntroAbility landScapeFeedIntroAbility = (LandScapeFeedIntroAbility) this.LLJJIJIIJIL.getValue();
                if (landScapeFeedIntroAbility != null) {
                    landScapeFeedIntroAbility.FV0();
                }
            } else {
                LandScapeFeedIntroAbility landScapeFeedIntroAbility2 = (LandScapeFeedIntroAbility) this.LLJJIJIIJIL.getValue();
                if (landScapeFeedIntroAbility2 != null) {
                    landScapeFeedIntroAbility2.iI();
                }
            }
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJJIJI.getValue();
        Boolean boolValueOf = Boolean.valueOf(z);
        assemViewModel.getClass();
        assemViewModel.setState(new AwS119S0101000_11(boolValueOf, i, 0));
    }
}
