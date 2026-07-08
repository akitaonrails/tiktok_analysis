package com.ss.android.ugc.aweme.feed.component;

import X.C01GW;
import X.C054G;
import X.C098200Yq;
import X.C09A1;
import X.C0PEM;
import X.C0RUJ;
import X.C1559710qgr;
import X.C1559740qgu;
import X.C1559750qgv;
import X.C1566140qrE;
import X.C1566440qri;
import X.C1566580qrw;
import X.C189200o6;
import X.C2296808zG;
import X.C23118094a;
import X.C299750Boz;
import X.C452501pT;
import X.C597500Nc4;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565950qqv;
import X.InterfaceC1566430qrh;
import X.InterfaceC1566460qrk;
import X.InterfaceC1566630qs1;
import X.InterfaceC494301wD;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.component.RecommendInstantFeedComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes25.dex */
public final class RecommendInstantFeedComponent extends BasePanelComponent implements C0RUJ, RecommendInstantFeedAbility, InterfaceC1554640qYg {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C1566580qrw LLILZ;
    public Function1<? super C189200o6<? extends List<? extends Aweme>>, Unit> LLILZIL;

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "recommend_instant_feed_component";
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

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 2067789642) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0qrg] */
    public RecommendInstantFeedComponent() {
        C01GW c01gwLIZIZ;
        C01GW c01gwLIZIZ2;
        C01GW c01gwLIZIZ3;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 398), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new C1559750qgv(false, this));
        }
        this.LL = c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa2 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 399), null);
            C1566140qrE.LIZJ(this, c630740Ooa2);
            c01gwLIZIZ2 = c630740Ooa2;
        } else {
            c01gwLIZIZ2 = C452501pT.LIZIZ(new C1559740qgu(false, this));
        }
        this.LLILLJJLI = c01gwLIZIZ2;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa3 = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS568S0100000_24((InterfaceC1565950qqv) this, 400), null);
            C1566140qrE.LIZJ(this, c630740Ooa3);
            c01gwLIZIZ3 = c630740Ooa3;
        } else {
            c01gwLIZIZ3 = C452501pT.LIZIZ(new C1559710qgr(false, this));
        }
        this.LLILLL = c01gwLIZIZ3;
        this.LLILZ = new C1566580qrw(new InterfaceC1566630qs1() { // from class: X.0qrg
            @Override // X.InterfaceC1566630qs1
            public final int LIZ() {
                IViewPagerComponentAbility iViewPagerComponentAbilityMb;
                RecommendInstantFeedComponent recommendInstantFeedComponent = this.LIZ;
                C128Y c128y = recommendInstantFeedComponent.getPanelContext().LJ;
                if (c128y instanceof InterfaceC1566480qrm) {
                    return ((InterfaceC1566480qrm) c128y).Ig().LIZIZ;
                }
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) recommendInstantFeedComponent.LLILLL.getValue();
                if (iFeedPanelPlatformAbility == null || (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) == null) {
                    return 0;
                }
                return iViewPagerComponentAbilityMb.LJIL();
            }

            @Override // X.InterfaceC1566630qs1
            public final String LIZIZ() {
                BaseListFragmentPanel baseListFragmentPanelYE;
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LIZ.LLILLL.getValue();
                if (iFeedPanelPlatformAbility == null || (baseListFragmentPanelYE = iFeedPanelPlatformAbility.yE()) == null) {
                    return null;
                }
                return baseListFragmentPanelYE.Zc();
            }

            @Override // X.InterfaceC1566630qs1
            public final String LIZJ() {
                IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LIZ.LLILLL.getValue();
                if (iFeedPanelPlatformAbility != null) {
                    return iFeedPanelPlatformAbility.xy2();
                }
                return null;
            }

            @Override // X.InterfaceC1566630qs1
            public final DataLayerAbility LIZLLL() {
                return (DataLayerAbility) this.LIZ.LLILLJJLI.getValue();
            }

            @Override // X.InterfaceC1566630qs1
            public final String getEventType() {
                return C1389300mG0.LIZ(this.LIZ.getPanelContext());
            }
        });
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1566580qrw c1566580qrw = this.LLILZ;
        Iterator it2 = ((LinkedHashMap) c1566580qrw.LIZIZ).values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1566430qrh) it2.next()).destroy();
        }
        c1566580qrw.LJ = null;
        C054G c054g = c1566580qrw.LJFF;
        if (c054g != null) {
            C2296808zG.LIZLLL(c054g, "Scope ended");
        }
        c1566580qrw.LJFF = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        if (getContext() != null) {
            C1566580qrw c1566580qrw = this.LLILZ;
            if (c1566580qrw.LJFF == null) {
                C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C23118094a.LIZ(), C0PEM.LIZ));
                c054gLIZ.LL.plus(new C597500Nc4(CoroutineExceptionHandler.LJJLIL));
                c1566580qrw.LJFF = c054gLIZ;
            }
            for (InterfaceC1566430qrh interfaceC1566430qrh : ((LinkedHashMap) c1566580qrw.LIZIZ).values()) {
                interfaceC1566430qrh.LIZIZ(new C1566440qri(c1566580qrw));
                interfaceC1566430qrh.LIZ();
            }
        }
        this.LLILZ.LJ = new InterfaceC1566460qrk() { // from class: X.0qsF
            @Override // X.InterfaceC1566460qrk
            public final void LIZ(AbstractC1566610qrz abstractC1566610qrz, AwS390S0200000_24 awS390S0200000_24) {
                C1255920ims<?> c1255920imsKB1;
                String str;
                RecommendInstantFeedComponent recommendInstantFeedComponent = this.LIZ;
                IFeedFetchDataAbility iFeedFetchDataAbility = (IFeedFetchDataAbility) recommendInstantFeedComponent.LL.getValue();
                if (iFeedFetchDataAbility != null) {
                    c1255920imsKB1 = iFeedFetchDataAbility.KB1();
                } else {
                    c1255920imsKB1 = null;
                }
                if (!(c1255920imsKB1 instanceof C1601390rm5)) {
                    c1255920imsKB1 = null;
                }
                C1601440rmA c1601440rmA = new C1601440rmA();
                c1601440rmA.LIZ = 0;
                c1601440rmA.LIZIZ = 14;
                c1601440rmA.LJJIZ = "auto_refresh";
                c1601440rmA.LJJIJIIJIL = abstractC1566610qrz.LIZIZ();
                if (abstractC1566610qrz instanceof C1566620qs0) {
                    c1601440rmA.LJJIJIL = ((C1566620qs0) abstractC1566610qrz).LJ;
                } else if (abstractC1566610qrz instanceof C1566670qs5) {
                    c1601440rmA.LJJIJL = true;
                    C1566670qs5 c1566670qs5 = (C1566670qs5) abstractC1566610qrz;
                    if (c1566670qs5.LJI) {
                        c1601440rmA.LJJIJLIJ = true;
                        String cdid = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCdid();
                        if (cdid != null) {
                            c1601440rmA.LJJ = cdid;
                        }
                    }
                    String str2 = c1566670qs5.LIZLLL;
                    if (Intrinsics.LJFF(str2, "nuj_after_did")) {
                        str = "after_did";
                    } else if (Intrinsics.LJFF(str2, "nuj_before_swipe_up")) {
                        str = "before_swipeup";
                    } else {
                        str = "";
                    }
                    C1953307kx.LIZ.getClass();
                    if (C1953307kx.LIZLLL(str)) {
                        c1601440rmA.LJJJJ = str;
                    }
                }
                if (c1255920imsKB1 != null && c1255920imsKB1.LIZJ(9, c1601440rmA.LIZ())) {
                    recommendInstantFeedComponent.LLILZIL = awS390S0200000_24;
                    return;
                }
                C098200Yq c098200Yq = new C098200Yq(new CancellationException());
                C189200o6.m2constructorimpl(c098200Yq);
                awS390S0200000_24.invoke(C189200o6.m1boximpl(c098200Yq));
                recommendInstantFeedComponent.LLILZIL = null;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.feed.component.RecommendInstantFeedAbility
    public final void Kh1(Exception exc) {
        Function1<? super C189200o6<? extends List<? extends Aweme>>, Unit> function1 = this.LLILZIL;
        if (function1 != null) {
            C098200Yq c098200Yq = new C098200Yq(exc);
            C189200o6.m2constructorimpl(c098200Yq);
            function1.invoke(C189200o6.m1boximpl(c098200Yq));
        }
        this.LLILZIL = null;
    }

    @Override // com.ss.android.ugc.aweme.feed.component.RecommendInstantFeedAbility
    public final void q02(List<? extends Aweme> list) {
        Function1<? super C189200o6<? extends List<? extends Aweme>>, Unit> function1 = this.LLILZIL;
        if (function1 != null) {
            C189200o6.m2constructorimpl(list);
            function1.invoke(C189200o6.m1boximpl(list));
        }
        this.LLILZIL = null;
    }
}
