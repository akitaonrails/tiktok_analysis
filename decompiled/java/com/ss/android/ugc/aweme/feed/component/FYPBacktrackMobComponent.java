package com.ss.android.ugc.aweme.feed.component;

import X.C01GW;
import X.C1558520qew;
import X.C1563570qn5;
import X.C1564280qoE;
import X.C1566140qrE;
import X.C1620830sHR;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1563590qn7;
import X.InterfaceC1565950qqv;
import X.InterfaceC606860NrA;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.component.FYPBacktrackMobComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FYPBacktrackMobComponent extends BasePanelComponent {
    public final C01GW LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public final C1563570qn5 LLILZLL;
    public final C1620830sHR LLIZ;

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IFeedPanelPlatformAbility.class, null);
        if (iFeedPanelPlatformAbility != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) != null) {
            iViewPagerComponentAbilityMb.Bv0(this.LLIZ);
        }
        C1563570qn5 c1563570qn5 = this.LLILZLL;
        CopyOnWriteArrayList<InterfaceC1563590qn7> copyOnWriteArrayList = C1564280qoE.LIZIZ;
        if (!copyOnWriteArrayList.contains(c1563570qn5)) {
            copyOnWriteArrayList.add(c1563570qn5);
        }
        DataLayerAbility dataLayerAbility = (DataLayerAbility) this.LL.getValue();
        if (dataLayerAbility != null) {
            dataLayerAbility.kh0(new InterfaceC606860NrA() { // from class: X.0qn4
                @Override // X.InterfaceC606860NrA
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LIZJ() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LJ() {
                }

                @Override // X.InterfaceC606860NrA
                public final void LJFF() {
                }

                @Override // X.InterfaceC606860NrA
                public final void fn() {
                }

                @Override // X.InterfaceC606860NrA
                public final void fr(List<? extends Aweme> list) {
                }

                @Override // X.InterfaceC606860NrA
                public final void LIZ(List<? extends Aweme> list) {
                    FYPBacktrackMobComponent fYPBacktrackMobComponent = this.LIZ;
                    fYPBacktrackMobComponent.LLILLL = 0;
                    fYPBacktrackMobComponent.LLILLJJLI = 0;
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0qn5] */
    public FYPBacktrackMobComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 392), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 4));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = -1;
        this.LLILLL = -1;
        this.LLILZLL = new InterfaceC1563590qn7() { // from class: X.0qn5
            @Override // X.InterfaceC1563590qn7
            public final void LIZ(C1563580qn6 c1563580qn6) {
                int i = c1563580qn6.LIZ;
                FYPBacktrackMobComponent fYPBacktrackMobComponent = this.LIZ;
                int i2 = fYPBacktrackMobComponent.LLILLL - i;
                int i3 = 0;
                if (i2 < 0) {
                    i2 = 0;
                }
                fYPBacktrackMobComponent.LLILLL = i2;
                int i4 = fYPBacktrackMobComponent.LLILLJJLI - i;
                if (i4 >= 0) {
                    i3 = i4;
                }
                fYPBacktrackMobComponent.LLILLJJLI = i3;
            }
        };
        this.LLIZ = new C1620830sHR(this, 3);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1564280qoE.LIZIZ.remove(this.LLILZLL);
    }
}
