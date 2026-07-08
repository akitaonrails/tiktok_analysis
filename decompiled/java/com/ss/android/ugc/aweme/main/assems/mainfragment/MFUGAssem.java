package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C0RSR;
import X.C0T44;
import X.C0T4F;
import X.C13LE;
import X.C1440005kM;
import X.C1558150qeL;
import X.C1559150qfx;
import X.C1561690qk3;
import X.C1564220qo8;
import X.C1595060rbs;
import X.C15O7;
import X.C19EG;
import X.C2217381BqS;
import X.C452501pT;
import X.C680080Qly;
import X.C687700QyG;
import X.C724240Sb0;
import X.C751930TeZ;
import X.InterfaceC1146704e9;
import X.InterfaceC1385905bd;
import X.InterfaceC1581920rGg;
import X.InterfaceC1585190rLx;
import X.InterfaceC21613819iK;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2385309Wh;
import X.InterfaceC665370Q7z;
import X.InterfaceC752360TfG;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.api.IFeedModuleService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFUGAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class MFUGAssem extends AbstractC738140SxQ implements InterfaceC21613819iK, InterfaceC1385905bd, C0T44, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public HomePageDataViewModel LL;
    public InterfaceC752360TfG LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1559150qfx(this));
    public final C01GW LLILZ = C452501pT.LIZIZ(new C0T4F(this));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1561690qk3(this));
    public volatile HomeViewPagerAbility LLILZLL;
    public volatile HomeTabAbility LLIZ;
    public InterfaceC665370Q7z LLIZLLLIL;
    public C0QSJ LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MFUGAssem.class, "knitHomeViewPageAbility", "getKnitHomeViewPageAbility()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MFUGAssem.class, "homeTabAbilityByDI", "getHomeTabAbilityByDI()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC21613819iK
    public final void FC() {
        C1440005kM.LIZ(new C0RSR(3, null));
    }

    public final void bo() {
        final InterfaceC752360TfG interfaceC752360TfG = this.LLILLJJLI;
        if (interfaceC752360TfG != null) {
            C15O7.LJIIIIZZ(300L).LJ(new InterfaceC2385309Wh() { // from class: X.0TP4
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    C1C7U.LIZ("MFUGAssem@141a.closeSplitContainer$1$1");
                    Boolean boolValueOf = Boolean.valueOf(interfaceC752360TfG.LJIILL());
                    C1C7U.LIZIZ("MFUGAssem@141a.closeSplitContainer$1$1");
                    return boolValueOf;
                }
            }, C15O7.LJIIIIZZ, null);
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final C0QSJ m261do() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLIZLLLIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLIZLLLIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLJ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    @Override // X.InterfaceC1385905bd
    public final boolean onBackPress() {
        InterfaceC752360TfG interfaceC752360TfG = this.LLILLJJLI;
        if (interfaceC752360TfG != null) {
            return interfaceC752360TfG.LJIILL();
        }
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        IRefreshAbility iRefreshAbility = (IRefreshAbility) this.LLILZ.getValue();
        if (iRefreshAbility != null) {
            iRefreshAbility.Ku0(new InterfaceC1581920rGg() { // from class: X.0qwS
                @Override // X.InterfaceC1581920rGg
                public final void LJFF() {
                    ISpecActService iSpecActService = (ISpecActService) ServiceManager.get().getService(ISpecActService.class);
                    if (iSpecActService != null) {
                        iSpecActService.LJJIIZ();
                    }
                }
            });
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        InterceptHomeBackPressService interceptHomeBackPressService = (InterceptHomeBackPressService) ServiceManager.get().getService(InterceptHomeBackPressService.class);
        if (interceptHomeBackPressService != null) {
            interceptHomeBackPressService.LIZ(this);
        }
        ISpecActService iSpecActService = (ISpecActService) ServiceManager.get().getService(ISpecActService.class);
        if (iSpecActService != null) {
            iSpecActService.LJJIZ();
        }
        InterfaceC752360TfG interfaceC752360TfG = this.LLILLJJLI;
        if (interfaceC752360TfG != null) {
            interfaceC752360TfG.LJIIL(this);
        }
        InterfaceC752360TfG interfaceC752360TfG2 = this.LLILLJJLI;
        if (interfaceC752360TfG2 != null) {
            interfaceC752360TfG2.LIZJ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            this.LL = C680080Qly.LIZIZ(c19egLIZ);
        }
        InterceptHomeBackPressService interceptHomeBackPressService = (InterceptHomeBackPressService) ServiceManager.get().getService(InterceptHomeBackPressService.class);
        if (interceptHomeBackPressService != null) {
            interceptHomeBackPressService.LIZJ(this);
        }
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLILZIL.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.ao(new InterfaceC1585190rLx() { // from class: X.0T40
                @Override // X.InterfaceC1585190rLx
                public final void p1(String str, String str2) {
                    ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJIJL(str2);
                    ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
                    if (iSpecActService != null) {
                        iSpecActService.LIZIZ(str, str2);
                    }
                    C1898110zUf.LL.getClass();
                    C01U6.LIZIZ(new C740080T1i(str, str2));
                }
            });
        }
        HomeTabAbility homeTabAbility2 = (HomeTabAbility) this.LLILZIL.getValue();
        if (homeTabAbility2 != null) {
            homeTabAbility2.UC1(new InterfaceC1585190rLx() { // from class: X.0T49
                @Override // X.InterfaceC1585190rLx
                public final void p1(String str, String str2) {
                    ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
                    if (iSpecActService != null) {
                        iSpecActService.LJJIIJZLJL(str, str2);
                    }
                }
            });
        }
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LLILLL.getValue();
        if (homeViewPagerAbility != null) {
            homeViewPagerAbility.LLJJI(new C1564220qo8() { // from class: X.0qwT
                @Override // X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    MFUGAssem mFUGAssem = this.LL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MFUGAssem.LLJI;
                    mFUGAssem.fo(i, true);
                }
            });
        }
        C1558150qeL.LIZIZ(this, new C751930TeZ(this, null));
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        ISpecActService iSpecActService = (ISpecActService) ServiceManager.get().getService(ISpecActService.class);
        if (iSpecActService != null) {
            iSpecActService.LJJJJJ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        ISpecActService iSpecActService = (ISpecActService) ServiceManager.get().getService(ISpecActService.class);
        if (iSpecActService != null) {
            iSpecActService.LJJZ();
        }
    }

    @Override // X.InterfaceC21613819iK
    public final void iG(int i) {
        LiveData liveData;
        MutableLiveData<Integer> mutableLiveDataXQ2;
        HomePageDataViewModel homePageDataViewModel = this.LL;
        if (homePageDataViewModel != null && (mutableLiveDataXQ2 = homePageDataViewModel.xQ2()) != null) {
            mutableLiveDataXQ2.postValue(Integer.valueOf(i));
        }
        HomePageDataViewModel homePageDataViewModel2 = this.LL;
        if (homePageDataViewModel2 != null && (liveData = (LiveData) homePageDataViewModel2.LLJJIJIL.getValue()) != null) {
            liveData.postValue(Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC21613819iK
    public final void xv(boolean z) {
        LiveData liveData;
        MutableLiveData<Integer> mutableLiveDataXQ2;
        HomePageDataViewModel homePageDataViewModel = this.LL;
        if (homePageDataViewModel != null && (mutableLiveDataXQ2 = homePageDataViewModel.xQ2()) != null) {
            mutableLiveDataXQ2.postValue(0);
        }
        HomePageDataViewModel homePageDataViewModel2 = this.LL;
        if (homePageDataViewModel2 != null && (liveData = (LiveData) homePageDataViewModel2.LLJJIJIL.getValue()) != null) {
            liveData.postValue(Boolean.valueOf(!z));
        }
        C1440005kM.LIZ(new C0RSR(2, null));
    }

    public final void fo(int i, boolean z) {
        Integer numValueOf;
        Fragment fragmentNk;
        InterfaceC752360TfG interfaceC752360TfG;
        InterfaceC752360TfG interfaceC752360TfG2;
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LLILLL.getValue();
        Fragment fragmentNk2 = null;
        if (homeViewPagerAbility != null && (numValueOf = Integer.valueOf(homeViewPagerAbility.Vd(i, false))) != null) {
            if (numValueOf.intValue() == 0) {
                if (!z || ((interfaceC752360TfG2 = this.LLILLJJLI) != null && interfaceC752360TfG2.LJII())) {
                    IFeedModuleService iFeedModuleService = (IFeedModuleService) ServiceManager.get().getService(IFeedModuleService.class);
                    HomeViewPagerAbility homeViewPagerAbility2 = (HomeViewPagerAbility) this.LLILLL.getValue();
                    if (homeViewPagerAbility2 != null) {
                        fragmentNk2 = homeViewPagerAbility2.Nk(i, false);
                    }
                    iFeedModuleService.refreshComment(fragmentNk2);
                    return;
                }
                return;
            }
            if (numValueOf.intValue() == 1) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    C1595060rbs c1595060rbs = C1595060rbs.LIZIZ;
                    if (!c1595060rbs.LJFF(c19egLIZ).jF()) {
                        HomeViewPagerAbility homeViewPagerAbility3 = (HomeViewPagerAbility) this.LLILLL.getValue();
                        if (homeViewPagerAbility3 == null || (fragmentNk = homeViewPagerAbility3.Nk(i, false)) == null) {
                            return;
                        }
                        if (z && ((interfaceC752360TfG = this.LLILLJJLI) == null || !interfaceC752360TfG.LJII())) {
                            return;
                        }
                        c1595060rbs.refreshComment(fragmentNk);
                        return;
                    }
                }
                bo();
                return;
            }
            if (numValueOf.intValue() == 33) {
                bo();
                return;
            }
        }
        bo();
    }

    @Override // X.InterfaceC21613819iK
    public final void lQ(float f, int i) {
        MutableLiveData<Integer> mutableLiveDataXQ2;
        HomePageDataViewModel homePageDataViewModel = this.LL;
        if (homePageDataViewModel != null && (mutableLiveDataXQ2 = homePageDataViewModel.xQ2()) != null) {
            mutableLiveDataXQ2.postValue(Integer.valueOf((int) (f * i)));
        }
    }
}
