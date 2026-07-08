package com.ss.android.ugc.feed.platform.panel.adaption.impl;

import X.C1565420qq4;
import X.C1565460qq8;
import X.C1565470qq9;
import X.C628500Oky;
import X.C630740Ooa;
import X.C786410Ut5;
import X.InterfaceC494301wD;
import android.view.View;
import com.ss.android.ugc.aweme.ability.FeedRecommendSkylightDrawerAbility;
import com.ss.android.ugc.aweme.ability.FeedSkylightDrawerLogicAbility;
import com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedRecommendScreenAdaptionComponent extends ScreenAdaptionComponent {
    public final C630740Ooa LLJLIL = C628500Oky.LIZ(new C1565470qq9(this));
    public final C630740Ooa LLJLILLLLZIIL = C628500Oky.LIZ(new C1565420qq4(this));
    public final C1565460qq8 LLJLL = new C1565460qq8(this);
    public boolean LLJLLIL = true;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1570964940) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent, com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final void CG() {
        FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbility = (FeedRecommendSkylightDrawerAbility) this.LLJLIL.getValue();
        if (feedRecommendSkylightDrawerAbility == null || !feedRecommendSkylightDrawerAbility.yw0()) {
            super.CG();
            return;
        }
        View view = this.LLJILJILJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent
    public final boolean bp() {
        if (!super.bp()) {
            return false;
        }
        FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbility = (FeedRecommendSkylightDrawerAbility) this.LLJLIL.getValue();
        return feedRecommendSkylightDrawerAbility == null || !feedRecommendSkylightDrawerAbility.yw0();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent, com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbility = (FeedRecommendSkylightDrawerAbility) this.LLJLIL.getValue();
        if (feedRecommendSkylightDrawerAbility != null) {
            feedRecommendSkylightDrawerAbility.Km(this.LLJLL);
        }
        FeedSkylightDrawerLogicAbility feedSkylightDrawerLogicAbility = (FeedSkylightDrawerLogicAbility) this.LLJLILLLLZIIL.getValue();
        if (feedSkylightDrawerLogicAbility != null) {
            feedSkylightDrawerLogicAbility.Km(this.LLJLL);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (this.LLJLLIL) {
            FeedRecommendSkylightDrawerAbility feedRecommendSkylightDrawerAbility = (FeedRecommendSkylightDrawerAbility) this.LLJLIL.getValue();
            if (feedRecommendSkylightDrawerAbility != null) {
                feedRecommendSkylightDrawerAbility.lh(this.LLJLL);
            }
            FeedSkylightDrawerLogicAbility feedSkylightDrawerLogicAbility = (FeedSkylightDrawerLogicAbility) this.LLJLILLLLZIIL.getValue();
            if (feedSkylightDrawerLogicAbility != null) {
                feedSkylightDrawerLogicAbility.lh(this.LLJLL);
            }
            this.LLJLLIL = false;
        }
    }
}
