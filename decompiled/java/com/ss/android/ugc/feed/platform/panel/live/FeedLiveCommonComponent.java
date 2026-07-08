package com.ss.android.ugc.feed.platform.panel.live;

import X.C01GW;
import X.C1389300mG0;
import X.C14EU;
import X.C1566140qrE;
import X.C1697810uHb;
import X.C2189821An6;
import X.C299750Boz;
import X.C452501pT;
import X.C492230JSb;
import X.C606130Npz;
import X.C606150Nq1;
import X.C606500Nqa;
import X.C628500Oky;
import X.C630740Ooa;
import X.EnumC1570580qyO;
import X.EnumC452301pR;
import X.InterfaceC1564370qoN;
import X.InterfaceC1565950qqv;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS140S0110000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedLiveCommonComponent extends BasePanelComponent {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C630740Ooa LLILLL;
    public final C01GW LLILZ;

    public FeedLiveCommonComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1538), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 25));
        }
        this.LL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 1539), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS140S0110000_24(false, (InterfaceC1565950qqv) this, 26));
        }
        this.LLILLJJLI = c01gwLIZIZ2;
        this.LLILLL = C628500Oky.LIZ(new AwS568S0100000_24(this, 1540));
        this.LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(410));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC1564370qoN interfaceC1564370qoN = (InterfaceC1564370qoN) this.LLILZ.getValue();
        if (interfaceC1564370qoN != null) {
            interfaceC1564370qoN.release();
        }
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        InterfaceC1564370qoN interfaceC1564370qoN = (InterfaceC1564370qoN) this.LLILZ.getValue();
        if (interfaceC1564370qoN != null) {
            interfaceC1564370qoN.init();
        }
        if (C1389300mG0.LJIL(getPanelContext())) {
            EventBus.LIZLLL().LJIJJ(this);
        }
    }

    @C14EU
    public final void onInsertAwemeEvent(C492230JSb c492230JSb) {
        String eventType;
        int iLJIL;
        c492230JSb.getClass();
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        if (Intrinsics.LJFF("homepage_hot", eventType)) {
            IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) this.LLILLL.getValue();
            if (iViewPagerAbility != null) {
                iLJIL = iViewPagerAbility.LJIL();
            } else {
                iLJIL = 0;
            }
            int i = iLJIL + 1;
            DataLayerAbility dataLayerAbility = (DataLayerAbility) this.LL.getValue();
            if (dataLayerAbility != null) {
                List<? extends Aweme> listLJIILJJIL = C1697810uHb.LJIILJJIL(c492230JSb.LIZ);
                C606150Nq1 c606150Nq1 = C606500Nqa.LIZLLL;
                dataLayerAbility.V32(listLJIILJJIL, i, C606130Npz.LIZ("pgc_drama_dnu_card"));
            }
            IViewPagerAbility iViewPagerAbility2 = (IViewPagerAbility) this.LLILLL.getValue();
            if (iViewPagerAbility2 != null) {
                iViewPagerAbility2.LLFFF(i, false);
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "//main");
            smartRouteBuildRoute.addFlags(67108864);
            smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            smartRouteBuildRoute.withParam("tab", EnumC1570580qyO.FOR_YOU.getValue());
            smartRouteBuildRoute.open();
        }
    }
}
