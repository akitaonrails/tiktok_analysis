package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.AbstractC1586250rNf;
import X.C01GW;
import X.C093Y;
import X.C09R3;
import X.C0CXC;
import X.C0CXE;
import X.C0QSJ;
import X.C0S78;
import X.C0X35;
import X.C1074300e3w;
import X.C1157804fw;
import X.C1203904nN;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1558730qfH;
import X.C1559140qfw;
import X.C1561700qk4;
import X.C1561720qk6;
import X.C1564220qo8;
import X.C1564660qoq;
import X.C1570890qyt;
import X.C1570910qyv;
import X.C1570920qyw;
import X.C1570930qyx;
import X.C1570940qyy;
import X.C1570970qz1;
import X.C1571040qz8;
import X.C1581510rG1;
import X.C1601090rlb;
import X.C1620910sHZ;
import X.C1697810uHb;
import X.C19EG;
import X.C1ER1;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C704270Rjt;
import X.C724240Sb0;
import X.EnumC1571190qzN;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1570900qyu;
import X.InterfaceC1570980qz2;
import X.InterfaceC1571000qz4;
import X.InterfaceC1571010qz5;
import X.InterfaceC1581600rGA;
import X.InterfaceC1581610rGB;
import X.InterfaceC1583870rJp;
import X.InterfaceC1617760sCU;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.IMFIconsProtocol;
import com.bytedance.tiktok.homepage.mainfragment.MFLeftIconPriority;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFShopAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.ITabAnimationAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFBizIconsAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.aweme.search.service.ISearchIconOutService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class MFBizIconsAssem extends UIContentAssem implements InterfaceC1581610rGB, InterfaceC1581600rGA, IMFIconsProtocol, IMFShopAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public InterfaceC1570900qyu LLJILJIL;
    public InterfaceC1570980qz2 LLJJ;
    public List<InterfaceC1570980qz2> LLJJIJI;
    public volatile HomeTabAbility LLJJIJIL;
    public volatile HomeViewPagerAbility LLJJJ;
    public InterfaceC665370Q7z LLJJJIL;
    public C0QSJ LLJJJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1564660qoq());
    public final C01GW LLJ = C452501pT.LIZIZ(new C1558730qfH(this));
    public final C01GW LLJI = C452501pT.LIZIZ(new C1570910qyv(this));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C1561700qk4(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C1570930qyx(this));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C1559140qfw(this));
    public final C1570920qyw LLJJI = new InterfaceC1570980qz2() { // from class: X.0qyw
        @Override // X.InterfaceC1570980qz2
        public final void LIZ() {
            InterfaceC1570900qyu interfaceC1570900qyuNo = this.LL.No();
            if (interfaceC1570900qyuNo != null) {
                interfaceC1570900qyuNo.LIZ();
            }
        }

        @Override // X.InterfaceC1570980qz2
        public final InterfaceC1570900qyu LIZJ() {
            return this.LL.No();
        }

        @Override // X.InterfaceC1570980qz2
        public final String LIZLLL() {
            return EnumC1584350rKb.SEARCH.getTag();
        }

        @Override // X.InterfaceC1570980qz2
        public final void T1() {
            InterfaceC1570900qyu interfaceC1570900qyuNo = this.LL.No();
            if (interfaceC1570900qyuNo != null) {
                interfaceC1570900qyuNo.T1();
            }
        }

        @Override // X.InterfaceC1570980qz2
        public final void j6() {
            InterfaceC1570900qyu interfaceC1570900qyuNo = this.LL.No();
            if (interfaceC1570900qyuNo != null) {
                interfaceC1570900qyuNo.T1();
            }
        }

        @Override // X.InterfaceC1570980qz2
        public final MFLeftIconPriority LJ() {
            return MFLeftIconPriority.DEFAULT;
        }
    };
    public final C01GW LLJJIII = C452501pT.LIZIZ(new C1570890qyt(this));
    public final C1570940qyy LLJJIJIIJIL = new Observer() { // from class: X.0qyy
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            C740360T2k c740360T2k = (C740360T2k) obj;
            MFBizIconsAssem mFBizIconsAssem = this.LL;
            mFBizIconsAssem.getClass();
            C1030680cva.LJIILJJIL(c740360T2k.LIZIZ, c740360T2k.LIZ, mFBizIconsAssem.LJJIJL().findViewById(R.id.y0b));
            ((InterfaceC1570990qz3) mFBizIconsAssem.LLJILJILJ.getValue()).LJFF(c740360T2k.LIZ, c740360T2k.LIZIZ);
            InterfaceC1570900qyu interfaceC1570900qyuNo = mFBizIconsAssem.No();
            if (interfaceC1570900qyuNo != null) {
                interfaceC1570900qyuNo.X1(c740360T2k.LIZ);
            }
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MFBizIconsAssem.class, "homeTabAbility", "getHomeTabAbility()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MFBizIconsAssem.class, "knitHomeViewPageAbility", "getKnitHomeViewPageAbility()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1581610rGB
    public final void Ae(int i, Fragment fragment) {
    }

    @Override // X.InterfaceC1581600rGA
    public final void LLZLLLL(View view, Bundle bundle) {
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.IMFIconsProtocol
    public final void Pm1() {
        this.LLJJIJI = null;
        this.LLJILJIL = null;
        Iterator<InterfaceC1570980qz2> it2 = Lo().iterator();
        while (it2.hasNext()) {
            InterfaceC1570900qyu interfaceC1570900qyuLIZJ = it2.next().LIZJ();
            if (interfaceC1570900qyuLIZJ != null) {
                interfaceC1570900qyuLIZJ.onCreate();
            }
        }
        InterfaceC1570900qyu interfaceC1570900qyuNo = No();
        if (interfaceC1570900qyuNo != null) {
            interfaceC1570900qyuNo.onCreate();
        }
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.IMFIconsProtocol
    public final List<InterfaceC1570980qz2> gD2() {
        Set setLJ = C093Y.LJ(this.LLJJI);
        setLJ.addAll(Lo());
        List<? extends InterfaceC1570980qz2> listLIZ = ((C1571040qz8) this.LLJI.getValue()).LIZ(false);
        if (listLIZ != null && !((ArrayList) listLIZ).isEmpty()) {
            for (InterfaceC1570980qz2 interfaceC1570980qz2 : (ArrayList) listLIZ) {
                String strLIZLLL = interfaceC1570980qz2.LIZLLL();
                if (strLIZLLL == null) {
                    strLIZLLL = "";
                }
                if (Intrinsics.LJFF(strLIZLLL, "USER")) {
                    this.LLJJ = interfaceC1570980qz2;
                }
                setLJ.add(interfaceC1570980qz2);
            }
        }
        return new ArrayList(setLJ);
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1573931489) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC1581610rGB
    public final void u5(int i, boolean z) {
    }

    @Override // X.InterfaceC1581600rGA
    public final void xh(Fragment fragment, Bundle bundle) {
    }

    public final C0QSJ Go() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJJJ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJJIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLJJJJ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final HomeTabAbility Jo() {
        return (HomeTabAbility) this.LLJIJIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0qz2[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1570980qz2> Lo() {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.mainfragment.MFBizIconsAssem.Lo():java.util.List");
    }

    public final InterfaceC1570900qyu No() {
        if (this.LLJILJIL == null) {
            ISearchIconOutService iSearchIconOutService = (ISearchIconOutService) this.LLIZLLLIL.getValue();
            AbstractC1586250rNf abstractC1586250rNfLIZ = null;
            if (iSearchIconOutService != null) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                ITabStrip iTabStripT60 = ((IMFAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), IMFAbility.class)).t60();
                InterfaceC1617760sCU interfaceC1617760sCU = (InterfaceC1617760sCU) this.LLJ.getValue();
                HomeTabAbility homeTabAbilityJo = Jo();
                abstractC1586250rNfLIZ = iSearchIconOutService.LIZ(c19egLIZ, iTabStripT60, interfaceC1617760sCU, homeTabAbilityJo != null ? homeTabAbilityJo.pI() : null);
            }
            this.LLJILJIL = abstractC1586250rNfLIZ;
        }
        return this.LLJILJIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.tiktok.homepage.mainfragment.IMFIconsProtocol
    public final List<InterfaceC1570980qz2> Ji0() {
        List<InterfaceC1570980qz2> listLo = Lo();
        C0CXE.LIZ.getClass();
        if (!C0CXE.LIZ()) {
            C0CXC.LIZ.getClass();
            C0CXC.LIZIZ();
        }
        listLo.add(this.LLJJI);
        List<? extends InterfaceC1570980qz2> listLIZ = ((C1571040qz8) this.LLJI.getValue()).LIZ(true);
        if (listLIZ != null && !((ArrayList) listLIZ).isEmpty()) {
            Iterator it2 = ((ArrayList) listLIZ).iterator();
            while (it2.hasNext()) {
                listLo.add(it2.next());
            }
        }
        return listLo;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IMFIconsProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        InterfaceC1570900qyu interfaceC1570900qyuLIZJ;
        super.onDestroy();
        InterfaceC1570980qz2 interfaceC1570980qz2 = this.LLJJ;
        if (interfaceC1570980qz2 != null && (interfaceC1570900qyuLIZJ = interfaceC1570980qz2.LIZJ()) != null) {
            interfaceC1570900qyuLIZJ.onCreate();
        }
        Oo(AFwS264S0000000_24.get$arr$(201));
        InterfaceC1570900qyu interfaceC1570900qyuNo = No();
        if (interfaceC1570900qyuNo != null) {
            interfaceC1570900qyuNo.Z1();
        }
        ISearchIconOutService iSearchIconOutService = (ISearchIconOutService) this.LLIZLLLIL.getValue();
        if (iSearchIconOutService != null) {
            iSearchIconOutService.LIZLLL();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        InterfaceC1570900qyu interfaceC1570900qyuLIZJ;
        super.onPause();
        InterfaceC1570980qz2 interfaceC1570980qz2 = this.LLJJ;
        if (interfaceC1570980qz2 != null && (interfaceC1570900qyuLIZJ = interfaceC1570980qz2.LIZJ()) != null) {
            interfaceC1570900qyuLIZJ.onCreate();
        }
        Oo(AFwS264S0000000_24.get$arr$(202));
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        InterfaceC1570900qyu interfaceC1570900qyuLIZJ;
        super.onResume();
        InterfaceC1570980qz2 interfaceC1570980qz2 = this.LLJJ;
        if (interfaceC1570980qz2 != null && (interfaceC1570900qyuLIZJ = interfaceC1570980qz2.LIZJ()) != null) {
            interfaceC1570900qyuLIZJ.onCreate();
        }
        Oo(new C1570970qz1());
        InterfaceC1570900qyu interfaceC1570900qyuNo = No();
        if (interfaceC1570900qyuNo != null) {
            interfaceC1570900qyuNo.onResume();
        }
    }

    public final void Ho(View view) {
        InterfaceC1570900qyu interfaceC1570900qyuLIZJ;
        InterfaceC1570980qz2 interfaceC1570980qz2 = this.LLJJ;
        if (interfaceC1570980qz2 != null && (interfaceC1570900qyuLIZJ = interfaceC1570980qz2.LIZJ()) != null) {
            interfaceC1570900qyuLIZJ.onCreate();
        }
        Oo(AFwS264S0000000_24.get$arr$(200));
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1074300e3w.LIZ(c19egLIZ).LLILLJJLI.observe(this, this.LLJJIJIIJIL);
        }
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LLJILLL.getValue();
        if (homeViewPagerAbility != null) {
            homeViewPagerAbility.LLJJI(new C1564220qo8() { // from class: X.0qxi
                @Override // X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    String strUf;
                    HomeViewPagerAbility homeViewPagerAbility2 = (HomeViewPagerAbility) this.LL.LLJILLL.getValue();
                    if (homeViewPagerAbility2 == null || (strUf = homeViewPagerAbility2.uf(i, false)) == null) {
                        strUf = "";
                    }
                    this.LL.So(strUf);
                }
            });
        }
        C0S78.LJFF(((Boolean) C1203904nN.LIZ.getValue()).booleanValue(), new AwS405S0200000_4(this, view, 21));
        C0S78.LJFF(true, new AwS546S0100000_2(this, 673));
        ITabAnimationAbility iTabAnimationAbility = (ITabAnimationAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITabAnimationAbility.class, null);
        if (iTabAnimationAbility != null) {
            iTabAnimationAbility.WF0(new C1620910sHZ(this, 16));
        }
    }

    public final void Oo(Function1<? super InterfaceC1570900qyu, Unit> function1) {
        Iterator<InterfaceC1570980qz2> it2 = Lo().iterator();
        while (it2.hasNext()) {
            InterfaceC1570900qyu interfaceC1570900qyuLIZJ = it2.next().LIZJ();
            if (interfaceC1570900qyuLIZJ != null) {
                function1.invoke(interfaceC1570900qyuLIZJ);
            }
        }
    }

    public final void So(String str) {
        IMFToolBarAbility iMFToolBarAbilityLJ;
        IMFToolBarAbility iMFToolBarAbilityLJ2;
        InterfaceC1583870rJp interfaceC1583870rJpVR1;
        EnumC1571190qzN enumC1571190qzNLJIIJJI;
        EnumC1571190qzN enumC1571190qzNLJIIJJI2;
        InterfaceC1583870rJp interfaceC1583870rJpVR12;
        boolean zShouldShowMallTopTab = ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).shouldShowMallTopTab();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (zShouldShowMallTopTab && fragmentLJI != null) {
            if (TextUtils.equals("Shop", str)) {
                IMFShopAbility iMFShopAbilityLIZLLL = C1561720qk6.LIZLLL(fragmentLJI);
                if (iMFShopAbilityLIZLLL != null) {
                    iMFShopAbilityLIZLLL.ly(str);
                    return;
                }
                return;
            }
            if (!TextUtils.equals("homepage_explore", str) && !TextUtils.equals("Activity", str)) {
                IMFToolBarAbility iMFToolBarAbilityLJ3 = C1561720qk6.LJ(fragmentLJI);
                if (iMFToolBarAbilityLJ3 == null) {
                    return;
                }
                HomeTabAbility homeTabAbilityJo = Jo();
                if (homeTabAbilityJo != null && (interfaceC1583870rJpVR12 = homeTabAbilityJo.vR1(str)) != null) {
                    enumC1571190qzNLJIIJJI2 = interfaceC1583870rJpVR12.LJIIJJI();
                } else {
                    enumC1571190qzNLJIIJJI2 = null;
                }
                iMFToolBarAbilityLJ3.F72(enumC1571190qzNLJIIJJI2);
                return;
            }
            if (C1581510rG1.LJ() && (iMFToolBarAbilityLJ2 = C1561720qk6.LJ(fragmentLJI)) != null) {
                iMFToolBarAbilityLJ2.j6();
                HomeTabAbility homeTabAbilityJo2 = Jo();
                if (homeTabAbilityJo2 != null && (interfaceC1583870rJpVR1 = homeTabAbilityJo2.vR1(str)) != null && (enumC1571190qzNLJIIJJI = interfaceC1583870rJpVR1.LJIIJJI()) != null) {
                    if (enumC1571190qzNLJIIJJI == EnumC1571190qzN.LIGHT) {
                        iMFToolBarAbilityLJ2.Rt2(null, true);
                    } else {
                        iMFToolBarAbilityLJ2.ae0(null, true);
                    }
                }
            }
            if (!TextUtils.equals("homepage_explore", str) || (iMFToolBarAbilityLJ = C1561720qk6.LJ(fragmentLJI)) == null) {
                return;
            }
            iMFToolBarAbilityLJ.DS();
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFShopAbility
    public final void ly(String str) {
        if (TextUtils.equals("Shop", str)) {
            IMFToolBarAbility iMFToolBarAbility = (IMFToolBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMFToolBarAbility.class, null);
            if (iMFToolBarAbility != null) {
                iMFToolBarAbility.Uu((InterfaceC1571000qz4) this.LLJJIII.getValue());
            }
            IMFToolBarAbility iMFToolBarAbility2 = (IMFToolBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMFToolBarAbility.class, null);
            if (iMFToolBarAbility2 != null) {
                iMFToolBarAbility2.DS();
            }
        }
    }

    @Override // X.InterfaceC1581610rGB
    public final void onNodeHide(Bundle bundle) {
        InterfaceC1570900qyu interfaceC1570900qyuLIZJ;
        C1ER1.LIZIZ.LJIIL(false);
        InterfaceC1570980qz2 interfaceC1570980qz2 = this.LLJJ;
        if (interfaceC1570980qz2 != null && (interfaceC1570900qyuLIZJ = interfaceC1570980qz2.LIZJ()) != null) {
            interfaceC1570900qyuLIZJ.e2();
        }
        InterfaceC1570900qyu interfaceC1570900qyuNo = No();
        if (interfaceC1570900qyuNo != null) {
            interfaceC1570900qyuNo.e2();
        }
    }

    @Override // X.InterfaceC1581610rGB
    public final void onNodeShow(Bundle bundle) {
        Object service;
        InterfaceC1570900qyu interfaceC1570900qyuLIZJ;
        if (C1157804fw.LIZ()) {
            service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchMFBizIconsPartial");
            }
        } else {
            service = ServiceManager.get().getService(ISearchService.class);
            if (service == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchMFBizIconsPartial");
            }
        }
        ((InterfaceC1571010qz5) service).LJIIL(true);
        InterfaceC1570980qz2 interfaceC1570980qz2 = this.LLJJ;
        if (interfaceC1570980qz2 != null && (interfaceC1570900qyuLIZJ = interfaceC1570980qz2.LIZJ()) != null) {
            interfaceC1570900qyuLIZJ.a2();
        }
        InterfaceC1570900qyu interfaceC1570900qyuNo = No();
        if (interfaceC1570900qyuNo != null) {
            interfaceC1570900qyuNo.a2();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(final View view) {
        super.onViewCreated(view);
        if (C1601090rlb.LIZJ() && C0X35.LJIIL("optimize_boot_perf_delay_tab_ui_bizicons")) {
            C704270Rjt.LIZ(new Runnable() { // from class: X.057N
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MFBizIconsAssem@703b.onViewCreated$1");
                    try {
                        this.LL.Ho(view);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MFBizIconsAssem@703b.onViewCreated$1");
                }
            });
        } else {
            Ho(view);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFShopAbility
    public final void uy0(EnumC1571190qzN enumC1571190qzN) {
        if (enumC1571190qzN == EnumC1571190qzN.LIGHT) {
            ((InterfaceC1570900qyu) this.LLJJIII.getValue()).LIZ();
        } else {
            ((InterfaceC1570900qyu) this.LLJJIII.getValue()).T1();
        }
    }
}
