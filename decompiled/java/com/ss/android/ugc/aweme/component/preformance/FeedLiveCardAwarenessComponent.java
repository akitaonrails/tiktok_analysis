package com.ss.android.ugc.aweme.component.preformance;

import X.C01GW;
import X.C0RUJ;
import X.C1266030j3B;
import X.C452501pT;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class FeedLiveCardAwarenessComponent extends BasePanelComponent implements C0RUJ {
    public final C01GW LL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 964));
    public C1266030j3B LLILLJJLI;

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "feed_live_card_awareness_component";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        super.onDestroy();
        C1266030j3B c1266030j3B = this.LLILLJJLI;
        if (c1266030j3B == null || (iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue()) == null) {
            return;
        }
        iViewPagerComponentAbility.Xl0(c1266030j3B);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        C1266030j3B c1266030j3B = new C1266030j3B(this, 0);
        this.LLILLJJLI = c1266030j3B;
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LL.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(c1266030j3B);
        }
    }
}
