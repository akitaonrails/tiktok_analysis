package com.ss.android.ugc.aweme.feed.component.newuser;

import X.C01GW;
import X.C0CNO;
import X.C128Y;
import X.C1514430pVp;
import X.C1566140qrE;
import X.C299750Boz;
import X.C452501pT;
import X.C590950NFt;
import X.C590980NFw;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC1566480qrm;
import X.InterfaceC590970NFv;
import X.InterfaceC590990NFx;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS127S0110000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class NewUserJourneyFeedComponent extends BasePanelComponent implements InterfaceC590970NFv, InterfaceC590990NFx {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public boolean LLILLL;

    @Override // X.InterfaceC590990NFx
    public final void n0() {
        Aweme awemeLIZ;
        if (C590980NFw.LIZJ.get() && C590980NFw.LJI.get() && C590980NFw.LJFF.get() && (awemeLIZ = C590980NFw.LIZ()) != null) {
            C0CNO.LIZLLL(0L, new AwS410S0200000_9(this, awemeLIZ, 19));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        if (this.LLILLL) {
            C590980NFw.LJII.remove(this);
        }
        super.onDestroy();
    }

    public NewUserJourneyFeedComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 151), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS127S0110000_9(false, (InterfaceC1565950qqv) this, 1));
        }
        this.LL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 152), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS127S0110000_9(false, (InterfaceC1565950qqv) this, 2));
        }
        this.LLILLJJLI = c01gwLIZIZ2;
    }

    public final int bo() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        C128Y c128y = getPanelContext().LJ;
        if (c128y instanceof InterfaceC1566480qrm) {
            return ((InterfaceC1566480qrm) c128y).Ig().LIZIZ;
        }
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LLILLJJLI.getValue();
        if (iFeedPanelPlatformAbility == null || (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) == null) {
            return 0;
        }
        return iViewPagerComponentAbilityMb.LJIL();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        if (C1514430pVp.LIZLLL().booleanValue()) {
            CopyOnWriteArrayList<InterfaceC590990NFx> copyOnWriteArrayList = C590980NFw.LJII;
            if (!copyOnWriteArrayList.contains(this)) {
                copyOnWriteArrayList.add(this);
            }
            if (C590980NFw.LIZJ.get() || C590980NFw.LJFF.get() || C590980NFw.LIZ.get() != null) {
                n0();
            }
            this.LLILLL = true;
            C590950NFt.LJIIL = this;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
    }

    @Override // X.InterfaceC590970NFv
    public final void Ob(List list) {
        if (!list.isEmpty()) {
            C0CNO.LIZLLL(0L, new AwS410S0200000_9(this, (NewUserJourneyFeedComponent) list, (List<? extends Aweme>) 113));
        }
    }
}
