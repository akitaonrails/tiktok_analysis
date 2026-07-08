package com.ss.android.ugc.feed.platform.panel.pagestate.protorol.impl.detail;

import X.C01GW;
import X.C1209530ha3;
import X.C1235870iGX;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC494301wD;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public class DetailPageStateImp extends PageStateCommonComponent {
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1615));

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, X.InterfaceC1554640qYg
    public InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -721105229) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent
    public C1235870iGX Go() {
        ILoadMoreAbility iLoadMoreAbilityEw0;
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null || this.LLJJI.getValue() == null) {
            return null;
        }
        if (this.LLJIJIL == null) {
            Context context = fragment.getContext();
            if (context == null) {
                return null;
            }
            C1235870iGX c1235870iGX = new C1235870iGX(context, null);
            this.LLJIJIL = c1235870iGX;
            C786410Ut5.LLLLIILL(c1235870iGX, 8);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            IFeedFragmentAbility iFeedFragmentAbility = (IFeedFragmentAbility) this.LLJJI.getValue();
            if (iFeedFragmentAbility != null && (iLoadMoreAbilityEw0 = iFeedFragmentAbility.Ew0()) != null) {
                iLoadMoreAbilityEw0.addView(this.LLJIJIL, layoutParams);
            }
            C1235870iGX c1235870iGX2 = this.LLJIJIL;
            if (c1235870iGX2 != null) {
                c1235870iGX2.setBuilder(C1209530ha3.LIZ(fragment.getActivity()));
            }
            C1235870iGX c1235870iGX3 = this.LLJIJIL;
            if (c1235870iGX3 != null) {
                c1235870iGX3.setBackgroundColor(0);
            }
        }
        return this.LLJIJIL;
    }
}
