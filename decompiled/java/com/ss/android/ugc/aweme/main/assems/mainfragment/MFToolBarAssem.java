package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.C01GW;
import X.C0CN5;
import X.C0CUJ;
import X.C0CXC;
import X.C0CXE;
import X.C0CXL;
import X.C0QSJ;
import X.C0S4U;
import X.C0SHX;
import X.C0T3B;
import X.C0X35;
import X.C1372310lob;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C1554610qYd;
import X.C1557820qdo;
import X.C1558150qeL;
import X.C1558240qeU;
import X.C1558520qew;
import X.C1558710qfF;
import X.C1561710qk5;
import X.C1564150qo1;
import X.C1564160qo2;
import X.C1566310qrV;
import X.C1570700qya;
import X.C1571150qzJ;
import X.C1571240qzS;
import X.C1581510rG1;
import X.C1582020rGq;
import X.C1584300rKW;
import X.C1585060rLk;
import X.C1590970rVH;
import X.C1592450rXf;
import X.C1592810rYF;
import X.C1601090rlb;
import X.C1620050sGB;
import X.C1954807lC;
import X.C19EG;
import X.C1AV2;
import X.C1AV3;
import X.C2180521AVm;
import X.C2211621BhA;
import X.C2211631BhB;
import X.C2211641BhC;
import X.C2217381BqS;
import X.C2517309tj;
import X.C285090BFj;
import X.C341940Daq;
import X.C343710Ddh;
import X.C343780Ddo;
import X.C452501pT;
import X.C486860J7k;
import X.C497820Jfg;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C704270Rjt;
import X.C709070Rrd;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1571190qzN;
import X.EnumC2180541AVo;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1570900qyu;
import X.InterfaceC1570980qz2;
import X.InterfaceC1571000qz4;
import X.InterfaceC1571080qzC;
import X.InterfaceC1571160qzK;
import X.InterfaceC1583600rJO;
import X.InterfaceC1602790roL;
import X.InterfaceC1740760vOs;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS93S0200000_24;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.IMFIconsProtocol;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFDialogAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.IHomePageToolbar;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.TabIconCustomLayoutProtocol;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public class MFToolBarAssem extends UIContentAssem implements IMFDialogAbility, IMFToolBarAbility, InterfaceC1583600rJO, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public C1620050sGB LLIZLLLIL;
    public boolean LLJ;
    public InterfaceC1571080qzC LLJJIII;
    public List<InterfaceC1570980qz2> LLJJIJIIJIL;
    public List<InterfaceC1570980qz2> LLJJIJIL;
    public volatile HomeTabAbility LLJJJ;
    public InterfaceC665370Q7z LLJJJIL;
    public C0QSJ LLJJJJ;
    public boolean LLJI = true;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C1564160qo2(this));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C1561710qk5(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C1558710qfF(this));
    public final C630740Ooa LLJILLL = C628500Oky.LIZ(new C1557820qdo(this));
    public final C01GW LLJJ = C452501pT.LIZIZ(new C1558240qeU(this));
    public final C01GW LLJJI = C452501pT.LIZIZ(new C1564150qo1(this));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new C1570700qya(this));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MFToolBarAssem.class, "homeTabAbility", "getHomeTabAbility()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void j6() {
        F72(null);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -103993180 || iHashCode == 1142664397) {
            return this;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0181  */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0SxQ, X.0rJO, com.ss.android.ugc.aweme.main.assems.mainfragment.MFToolBarAssem] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go() {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.mainfragment.MFToolBarAssem.Go():void");
    }

    public final HomeTabAbility Ho() {
        return (HomeTabAbility) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC1583600rJO
    public final void Ja() {
        C0CXE.LIZ.getClass();
        if (C0CXE.LIZ()) {
            return;
        }
        C0CXC.LIZ.getClass();
        if (C0CXC.LIZIZ()) {
            return;
        }
        C0CXL.LIZ.getClass();
        if (C0CXL.LIZIZ() || !C343780Ddo.LIZIZ()) {
            return;
        }
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
        if (interfaceC1571080qzC != null) {
            interfaceC1571080qzC.LJIIIZ();
        }
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), IMFIconsProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (it2.hasNext()) {
                ((IMFIconsProtocol) it2.next()).Pm1();
            }
        }
        Jo();
        No();
        Go();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1570980qz2> Jo() {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.mainfragment.MFToolBarAssem.Jo():java.util.List");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final ViewGroup Lh1() {
        InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
        if (interfaceC1571080qzC != null) {
            return interfaceC1571080qzC.LJIIL("NOTIFICATION");
        }
        return null;
    }

    public final InterfaceC1571160qzK Lo() {
        return (InterfaceC1571160qzK) this.LLJJIJI.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1570980qz2> No() {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.mainfragment.MFToolBarAssem.No():java.util.List");
    }

    public final View Oo() {
        return (View) this.LLJJI.getValue();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFDialogAbility
    public final boolean Q6() {
        C1620050sGB c1620050sGB = this.LLIZLLLIL;
        return c1620050sGB != null && c1620050sGB.LJI();
    }

    public final View So() {
        return (View) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFDialogAbility
    public final boolean Wm() {
        C1620050sGB c1620050sGB = this.LLIZLLLIL;
        return c1620050sGB != null && c1620050sGB.LIZLLL();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final View Yp() {
        C0CXE.LIZ.getClass();
        if (!C0CXE.LIZ()) {
            C0CXC.LIZ.getClass();
            if (!C0CXC.LIZIZ()) {
                InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
                if (interfaceC1571080qzC != null) {
                    return interfaceC1571080qzC.Yp();
                }
                return null;
            }
        }
        InterfaceC1571080qzC interfaceC1571080qzC2 = this.LLJJIII;
        if (interfaceC1571080qzC2 != null) {
            return interfaceC1571080qzC2.LIZJ();
        }
        return null;
    }

    public final void ap() {
        InterfaceC1571080qzC interfaceC1571080qzCLIZ = IHomePageToolbar.LIZ.LIZ((FrameLayout) LJJIJL().findViewById(R.id.tpm));
        this.LLJJIII = interfaceC1571080qzCLIZ;
        if (interfaceC1571080qzCLIZ != null) {
            interfaceC1571080qzCLIZ.LIZIZ(Lo());
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final View pr() {
        C0CXE.LIZ.getClass();
        if (!C0CXE.LIZ()) {
            C0CXC.LIZ.getClass();
            if (!C0CXC.LIZIZ()) {
                InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
                if (interfaceC1571080qzC != null) {
                    return interfaceC1571080qzC.pr();
                }
                return null;
            }
        }
        InterfaceC1571080qzC interfaceC1571080qzC2 = this.LLJJIII;
        if (interfaceC1571080qzC2 != null) {
            return interfaceC1571080qzC2.LJIILJJIL();
        }
        return null;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final C0CUJ ro2() {
        InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
        if (interfaceC1571080qzC == null) {
            return null;
        }
        return new C0CUJ(interfaceC1571080qzC.LJIIJ(), interfaceC1571080qzC.LJIILLIIL(), interfaceC1571080qzC.LIZ(), interfaceC1571080qzC.LJ());
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void DS() {
        C786410Ut5.LJLLLLLL(8, So());
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void M90() {
        Lo().LIZJ(true);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final Integer P21() {
        View viewFindViewById = LJJIJL().findViewById(R.id.tpm);
        if (viewFindViewById != null) {
            return Integer.valueOf(viewFindViewById.getBottom());
        }
        return null;
    }

    public final void Vo() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        C1620050sGB c1620050sGBLIZ = C0SHX.LIZ(c19egLIZ, C1590970rVH.LIZ(this));
        c1620050sGBLIZ.LJIIIZ("swipe_up_guide", new C0T3B() { // from class: X.0qzG
            @Override // X.C0T3B
            public final void LIZ() {
                C786410Ut5.T4(this.LIZ.Oo(), 1.0f);
            }

            @Override // X.C0T3B
            public final void LIZIZ() {
                C786410Ut5.T4(this.LIZ.Oo(), 0.5f);
            }
        });
        c1620050sGBLIZ.LJIIIZ("not_interested_tutorial", new C0T3B() { // from class: X.0qzH
            @Override // X.C0T3B
            public final void LIZ() {
                C786410Ut5.T4(this.LIZ.Oo(), 1.0f);
            }

            @Override // X.C0T3B
            public final void LIZIZ() {
                C786410Ut5.T4(this.LIZ.Oo(), 0.5f);
            }
        });
        this.LLIZLLLIL = c1620050sGBLIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final boolean Yu() {
        return Lo().Yu();
    }

    public final void Zo() {
        Context context = getContext();
        int iLIZJ = context != null ? C497820Jfg.LIZJ(context) : C341940Daq.LIZ(99);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) So().getLayoutParams();
        layoutParams.height = iLIZJ;
        C786410Ut5.W5(So(), layoutParams);
        C786410Ut5.LJLLLLLL(0, So());
    }

    public final void cp() {
        Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>> pairPI;
        MainActivityScope mainActivityScopeLIZLLL;
        InterfaceC665370Q7z interfaceC665370Q7z;
        List listLIZIZ;
        C709070Rrd c709070RrdLIZJ;
        C709070Rrd c709070RrdLJIILJJIL;
        IMFAbility iMFAbility;
        ITabStrip iTabStripT60;
        C1592450rXf c1592450rXfLV0;
        if (C1581510rG1.LIZIZ() && !C1581510rG1.LIZJ()) {
            if (!C1585060rLk.LIZJ() || (iMFAbility = (IMFAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMFAbility.class, null)) == null || (iTabStripT60 = iMFAbility.t60()) == null || (c1592450rXfLV0 = iTabStripT60.LV0()) == null) {
                return;
            }
            HandlerHook.viewPost(c1592450rXfLV0, new ARunnableS93S0200000_24(this, iTabStripT60, 17));
            return;
        }
        HomeTabAbility homeTabAbilityHo = Ho();
        if (homeTabAbilityHo == null || (pairPI = homeTabAbilityHo.pI()) == null || (mainActivityScopeLIZLLL = C0S4U.LIZLLL(this)) == null || (interfaceC665370Q7z = mainActivityScopeLIZLLL.LL) == null || (listLIZIZ = C1554610qYd.LIZIZ(interfaceC665370Q7z, TabIconCustomLayoutProtocol.class, false)) == null) {
            return;
        }
        ArrayList<TabIconCustomLayoutProtocol> arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLIZIZ) {
            if (((TabIconCustomLayoutProtocol) obj).eJ(pairPI)) {
                arrayList.add(obj);
            }
        }
        for (TabIconCustomLayoutProtocol tabIconCustomLayoutProtocol : arrayList) {
            InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
            if (interfaceC1571080qzC != null && (c709070RrdLJIILJJIL = interfaceC1571080qzC.LJIILJJIL()) != null) {
                tabIconCustomLayoutProtocol.Yv2(c709070RrdLJIILJJIL);
            }
            InterfaceC1571080qzC interfaceC1571080qzC2 = this.LLJJIII;
            if (interfaceC1571080qzC2 != null && (c709070RrdLIZJ = interfaceC1571080qzC2.LIZJ()) != null) {
                tabIconCustomLayoutProtocol.WT0(c709070RrdLIZJ);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        HomeTabAbility homeTabAbilityHo = Ho();
        if (homeTabAbilityHo != null) {
            homeTabAbilityHo.Ci2(this);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        CommonPageFragment commonPageFragmentZQ2;
        Fragment fragmentBQ2;
        super.onResume();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (commonPageFragmentZQ2 = C486860J7k.LIZIZ(c19egLIZ).zQ2()) != null && a0.LJJIIZI(commonPageFragmentZQ2.getClass().getSimpleName(), "MainPageFragment", false) && (fragmentBQ2 = C343710Ddh.LIZ(c19egLIZ).BQ2()) != null && (this.LLJJ.getValue() instanceof InterfaceC1740760vOs) && fragmentBQ2 == this.LLJJ.getValue()) {
            InterfaceC1740760vOs interfaceC1740760vOs = (InterfaceC1740760vOs) ((Fragment) this.LLJJ.getValue());
            if (!c19egLIZ.getIntent().getBooleanExtra("pre_mainactivity_first_enter", false)) {
                C2211621BhA.LIZ.getClass();
                C2211641BhC c2211641BhC = C2211621BhA.LIZJ;
                if (c2211641BhC == null || !C1571240qzS.LIZ().fixBack2MainTopPageWhiteList.contains(c2211641BhC.LIZIZ()) || !C1571240qzS.LIZ().fixBack2MainTabPageWhiteList.contains(interfaceC1740760vOs.getBtmPageCode())) {
                    C2211631BhB.LJIIL(interfaceC1740760vOs, c19egLIZ);
                }
            }
        }
        if (this.LLJI) {
            this.LLJI = false;
            View viewFindViewById = LJJIJL().findViewById(R.id.tpm);
            if (viewFindViewById != null) {
                HandlerHook.viewPostDelay(viewFindViewById, new Runnable() { // from class: X.0qzE
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("MFToolBarAssem@9976.onResume$1");
                        try {
                            this.LL.Lo().LIZIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("MFToolBarAssem@9976.onResume$1");
                    }
                }, 3000L);
            }
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void A1(String str) {
        InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
        if (interfaceC1571080qzC != null) {
            interfaceC1571080qzC.A1(str);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void B5(Integer num) {
        InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
        if (interfaceC1571080qzC != null) {
            interfaceC1571080qzC.B5(num);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void E40(C1592810rYF c1592810rYF) {
        InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
        if (interfaceC1571080qzC != null) {
            interfaceC1571080qzC.LJIIJJI(c1592810rYF);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void F72(EnumC1571190qzN enumC1571190qzN) {
        int i;
        InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
        if (interfaceC1571080qzC != null) {
            interfaceC1571080qzC.LJIIIIZZ();
            for (InterfaceC1570980qz2 interfaceC1570980qz2 : (ArrayList) C13LP.LJLIL(No(), Jo())) {
                if (enumC1571190qzN != null && (i = C1571150qzJ.LIZ[enumC1571190qzN.ordinal()]) != -1) {
                    if (i != 1) {
                        if (i == 2) {
                            interfaceC1570980qz2.LIZ();
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        interfaceC1570980qz2.T1();
                    }
                } else {
                    interfaceC1570980qz2.j6();
                }
            }
            C786410Ut5.LJLLLLLL(0, So());
            cp();
            bv(false, false);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final boolean IX1(String str) {
        InterfaceC1602790roL interfaceC1602790roLLIZ = Lo().LIZ(str);
        if (interfaceC1602790roLLIZ != null) {
            return Lo().LJ(interfaceC1602790roLLIZ);
        }
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final boolean Iv(String str) {
        InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
        if (interfaceC1571080qzC == null || !interfaceC1571080qzC.Iv(str)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final boolean Tf(String str) {
        InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
        if (interfaceC1571080qzC == null || !interfaceC1571080qzC.Tf(str)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void Uu(InterfaceC1571000qz4 interfaceC1571000qz4) {
        String tag;
        LinkedHashMap linkedHashMap = (LinkedHashMap) C1584300rKW.LIZLLL;
        if (linkedHashMap.get("Shop") != null) {
            Object obj = linkedHashMap.get("Shop");
            if (interfaceC1571000qz4 != null) {
                tag = interfaceC1571000qz4.getTag();
            } else {
                tag = null;
            }
            if (Intrinsics.LJFF(obj, tag)) {
                InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
                if (interfaceC1571080qzC != null) {
                    interfaceC1571080qzC.Uu(interfaceC1571000qz4);
                }
                bv(false, false);
            }
        }
    }

    public final String bp(List<String> list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            int i2 = i + 1;
            sb.append(it2.next());
            if (i != list.size() - 1) {
                sb.append(",");
            }
            i = i2;
        }
        return sb.toString();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void m(String str) {
        InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
        if (interfaceC1571080qzC != null) {
            interfaceC1571080qzC.m(str);
        }
    }

    @C14EU
    public final void onDislikeAwemeEvent(C1372310lob c1372310lob) {
        if (c1372310lob.LIZIZ == 1) {
            Lo().LIZJ(c1372310lob.LIZ);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (C1601090rlb.LIZIZ() && !C2517309tj.LIZ && C0X35.LJIIL("optimize_boot_perf_delay_tab_ui_leftright")) {
            if (C1601090rlb.LIZJ()) {
                C704270Rjt.LIZ(new ARunnableS124S0100000_24(this, 47));
            } else {
                ap();
                C704270Rjt.LIZ(new ARunnableS124S0100000_24(this, 48));
                Zo();
                Vo();
            }
        } else if (C1601090rlb.LIZLLL() && !C2517309tj.LIZ) {
            ap();
            C0CN5.LIZJ(15000L, new ARunnableS124S0100000_24(this, 49), false);
            Zo();
            Vo();
        } else {
            ap();
            if (!C285090BFj.LIZJ()) {
                C1558150qeL.LIZIZ(this, new C1566310qrV(this, null));
            } else {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS124S0100000_24(this, 50));
            }
            Zo();
            Vo();
        }
        C1582020rGq.LIZIZ("stage_top_icon_assem_on_create");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void z2(String str) {
        InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
        if (interfaceC1571080qzC != null) {
            interfaceC1571080qzC.z2(str);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void N11(long j, final boolean z) {
        float f;
        final C1AV2 c1av2LIZ = C1AV3.LIZ(1, "Feed", null, "mf_toolbar");
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
            f2 = 1.0f;
        } else {
            f = 1.0f;
        }
        C2180521AVm.LIZ(Oo(), EnumC2180541AVo.V_ALPHA, C1AV3.LIZ(2, "Feed", Boolean.TRUE, "mf_toolbar"));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(Oo(), "alpha", f, f2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0qzI
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i;
                View viewOo = this.Oo();
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                C2180521AVm.LIZLLL(viewOo, i, c1av2LIZ);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (z) {
                    C2180521AVm.LIZLLL(this.Oo(), 0, c1av2LIZ);
                }
            }
        });
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void Rt2(String str, boolean z) {
        Iterator it2 = ((ArrayList) C13LP.LJLIL(No(), Jo())).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1570980qz2) it2.next()).LIZ();
        }
        TopTabAbility topTabAbility = (TopTabAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TopTabAbility.class, null);
        if (topTabAbility != null) {
            topTabAbility.AD2(str, false, z);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void ae0(String str, boolean z) {
        Iterator it2 = ((ArrayList) C13LP.LJLIL(No(), Jo())).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1570980qz2) it2.next()).T1();
        }
        TopTabAbility topTabAbility = (TopTabAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TopTabAbility.class, null);
        if (topTabAbility != null) {
            topTabAbility.e01(str, false, z);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void bv(boolean z, boolean z2) {
        IMFAbility iMFAbility;
        ITabStrip iTabStripT60;
        if (C1581510rG1.LIZJ() && (iMFAbility = (IMFAbility) this.LLJILLL.getValue()) != null && (iTabStripT60 = iMFAbility.t60()) != null) {
            iTabStripT60.bv(z, z2);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void dP(int i, String str) {
        InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
        if (interfaceC1571080qzC != null) {
            interfaceC1571080qzC.LJI(i, str, true);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void ta(int i, String str) {
        InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
        if (interfaceC1571080qzC != null) {
            interfaceC1571080qzC.LJI(i, str, false);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility
    public final void rn0(String str, int i, boolean z, C1AV2 c1av2) {
        InterfaceC1571080qzC interfaceC1571080qzC = this.LLJJIII;
        if (interfaceC1571080qzC != null) {
            interfaceC1571080qzC.LJFF(str, i, c1av2);
        }
    }
}
