package com.ss.android.ugc.feed.platform.panel.adaption.impl;

import X.C0T9X;
import X.C339190DRl;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.screenadaption.adaptionparams.ScreenAdaptionResult;
import com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent;

/* JADX INFO: loaded from: classes13.dex */
public final class FriendsSimpleDetailScreenAdaptionComponent extends ScreenAdaptionComponent {
    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent
    public final String Ho() {
        return "friends_detail_adaption_component";
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1570964940) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent, com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final boolean xa0() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent
    public final C0T9X Go() {
        return new C0T9X(super.Go().getContext(), Boolean.FALSE, null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent
    public final void No() {
        C339190DRl.LIZLLL(this.LLJILJILJ);
        C339190DRl.LIZLLL(this.LLJILLL);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent
    public final void Vo() {
        C339190DRl.LIZLLL(this.LLJILJILJ);
        C339190DRl.LIZLLL(this.LLJILLL);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent
    public final void Zo(ScreenAdaptionResult screenAdaptionResult) {
        View view = this.LLJILJILJ;
        if (view != null) {
            ap(screenAdaptionResult.getTopSpaceHeight(), view);
        }
        View view2 = this.LLJILLL;
        if (view2 != null) {
            ap(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), view2);
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJo = Jo();
        if (iFeedPanelPlatformAbilityJo != null) {
            iFeedPanelPlatformAbilityJo.y();
        }
    }
}
