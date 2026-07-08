package com.ss.android.ugc.feed.platform.panel.live;

import X.C01GW;
import X.C0RD6;
import X.C1067550dt3;
import X.C1067590dt7;
import X.C1067600dt8;
import X.C452501pT;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;

/* JADX INFO: loaded from: classes17.dex */
public final class GamePartnershipComponent extends BasePanelComponent {
    public long LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public C1067600dt8 LLILZLL;
    public String LL = "";
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1067590dt7(this));

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLILZLL != null) {
            IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILZIL.getValue();
            if (iViewPagerComponentAbility != null) {
                iViewPagerComponentAbility.Xl0(this.LLILZLL);
            }
            this.LLILZLL = null;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_on_play_progress_change", new C1067550dt3(this));
    }
}
