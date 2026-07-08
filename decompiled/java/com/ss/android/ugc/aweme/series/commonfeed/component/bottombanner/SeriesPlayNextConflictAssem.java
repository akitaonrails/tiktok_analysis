package com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner;

import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C0SGS;
import X.C0SHN;
import X.C13LE;
import X.C1558520qew;
import X.C2217381BqS;
import X.C360660ECa;
import X.C452501pT;
import X.C687700QyG;
import X.C737910Sx3;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class SeriesPlayNextConflictAssem extends BaseCellLogicComponent<SeriesPlayNextConflictAssem> implements ISeriesPlayNextConflictAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final C01GW LLJJIJI = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(304));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 528));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 524));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 525));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(132));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 526));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 527));
    public final C0SHN LLJJJJLIIL = new C360660ECa() { // from class: X.0SHN
        @Override // X.C360660ECa, X.InterfaceC469360Ias
        public final void onPageScrollStateChanged(int i) {
            this.LL.getClass();
        }
    };
    public volatile HomePageViewPagerAbility LLJJL;
    public volatile HomeViewPagerAbility LLJJLIIIJLLLLLLLZ;
    public InterfaceC665370Q7z LLJL;
    public C0QSJ LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeriesPlayNextConflictAssem.class, "homePageViewPagerAbilityByDI", "getHomePageViewPagerAbilityByDI()Lcom/ss/android/ugc/aweme/base/HomePageViewPagerAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SeriesPlayNextConflictAssem.class, "homeViewPagerAbilityByDI", "getHomeViewPagerAbilityByDI()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0);
        c09r3.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1578047387) {
            return null;
        }
        return this;
    }

    public final C0QSJ Bo() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJLIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLJLIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) this.LLJJJJ.getValue();
        if (homePageViewPagerAbility != null) {
            homePageViewPagerAbility.yT(this.LLJJJJLIIL);
        }
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LLJJJJJIL.getValue();
        if (homeViewPagerAbility != null) {
            homeViewPagerAbility.b3(this.LLJJJJLIIL);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) this.LLJJJJ.getValue();
        if (homePageViewPagerAbility != null) {
            homePageViewPagerAbility.yT(this.LLJJJJLIIL);
        }
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LLJJJJJIL.getValue();
        if (homeViewPagerAbility != null) {
            homeViewPagerAbility.b3(this.LLJJJJLIIL);
        }
        HomePageViewPagerAbility homePageViewPagerAbility2 = (HomePageViewPagerAbility) this.LLJJJJ.getValue();
        if (homePageViewPagerAbility2 != null) {
            homePageViewPagerAbility2.Jk1(this.LLJJJJLIIL);
        }
        HomeViewPagerAbility homeViewPagerAbility2 = (HomeViewPagerAbility) this.LLJJJJJIL.getValue();
        if (homeViewPagerAbility2 != null) {
            homeViewPagerAbility2.LLJJI(this.LLJJJJLIIL);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent
    /* JADX INFO: renamed from: zo */
    public final boolean ur(VideoItemParams videoItemParams) {
        int i = SeriesBannerInteractTriggerAssem.LLJJLIIIJLLLLLLLZ;
        return C0SGS.LIZ(videoItemParams);
    }
}
