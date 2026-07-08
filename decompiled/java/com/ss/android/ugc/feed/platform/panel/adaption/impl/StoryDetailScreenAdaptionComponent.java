package com.ss.android.ugc.feed.platform.panel.adaption.impl;

import X.C01GW;
import X.C0T9X;
import X.C339190DRl;
import X.C452501pT;
import X.C497820Jfg;
import X.C786410Ut5;
import X.InterfaceC494301wD;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.screenadaption.adaptionparams.ScreenAdaptionResult;
import com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class StoryDetailScreenAdaptionComponent extends ScreenAdaptionComponent {
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 641));

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent
    public final String Ho() {
        return "story_component";
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1570964940) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent
    public final C0T9X Go() {
        return new C0T9X(null, Boolean.valueOf(!((Boolean) this.LLJLIL.getValue()).booleanValue()), Boolean.valueOf(((Boolean) this.LLJLIL.getValue()).booleanValue()));
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

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent, com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility
    public final boolean xa0() {
        return ((Boolean) this.LLJLIL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent
    public final void Zo(ScreenAdaptionResult screenAdaptionResult) {
        View view = this.LLJILJILJ;
        if (view != null) {
            dp(screenAdaptionResult.getTopSpaceHeight(), view);
        }
        View view2 = this.LLJILLL;
        if (view2 != null) {
            dp(screenAdaptionResult.getBottomSpaceHeight(), view2);
        }
    }

    public static void dp(int i, View view) {
        int i2;
        if (i == 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        C786410Ut5.LJLLLLLL(i2, view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        C786410Ut5.W5(view, layoutParams);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent, X.InterfaceC743730TFj
    public final void LLZLLLL(View view, Bundle bundle) {
        int iLIZJ;
        View view2;
        super.LLZLLLL(view, bundle);
        Context context = getContext();
        if (context != null && (iLIZJ = C497820Jfg.LIZJ(context)) > 0 && (view2 = this.LLJILJILJ) != null) {
            dp(iLIZJ, view2);
        }
    }
}
