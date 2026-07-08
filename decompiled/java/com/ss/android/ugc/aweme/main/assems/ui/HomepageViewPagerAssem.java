package com.ss.android.ugc.aweme.main.assems.ui;

import X.C01GW;
import X.C086I;
import X.C0BU8;
import X.C0J5E;
import X.C0QSJ;
import X.C0S4G;
import X.C1017070cZd;
import X.C1150504el;
import X.C13LE;
import X.C1558520qew;
import X.C1559340qgG;
import X.C1570840qyo;
import X.C1590400rUM;
import X.C1590430rUP;
import X.C1590510rUX;
import X.C1590590rUf;
import X.C1591010rVL;
import X.C1591390rVx;
import X.C199Y;
import X.C19EG;
import X.C19EH;
import X.C1A5L;
import X.C20629915o1;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2344809Gs;
import X.C2550209z2;
import X.C261140ALg;
import X.C296200BjG;
import X.C452501pT;
import X.C486860J7k;
import X.C680080Qly;
import X.C687700QyG;
import X.C690970R8l;
import X.C724240Sb0;
import X.InterfaceC1146704e9;
import X.InterfaceC1209250hZb;
import X.InterfaceC1554640qYg;
import X.InterfaceC1577800rA2;
import X.InterfaceC1590450rUR;
import X.InterfaceC1591420rW0;
import X.InterfaceC1711206n0;
import X.InterfaceC20622815ms;
import X.InterfaceC21604319gn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC469360Ias;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.InterfaceC739890T0p;
import Y.ARunnableS124S0100000_24;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.BaseMainContainerUIAssem;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.slide.IMainPageSlide;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.spi.IHomeSidebarService;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class HomepageViewPagerAssem extends BaseMainContainerUIAssem implements InterfaceC1591420rW0, HomePageViewPagerAbility, InterfaceC739890T0p, InterfaceC1554640qYg, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public C1591390rVx LLJIJIL;
    public C1590400rUM LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public C1590590rUf LLJJ;
    public C1590510rUX LLJJIJI;
    public C1591010rVL LLJJIJIIJIL;
    public volatile HomeViewPagerAbility LLJJJ;
    public InterfaceC665370Q7z LLJJJIL;
    public C0QSJ LLJJJJ;
    public final HomepageViewPagerAssem LLJI = this;
    public boolean LLJJI = true;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new C1559340qgG(this));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new C1570840qyo(this));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HomepageViewPagerAssem.class, "knitHomeViewPageAbility", "getKnitHomeViewPageAbility()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC739890T0p
    public final void F4(float f, float f2) {
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

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1953082163) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.main.FlingGestureAbility
    public final void EN1() {
        C1591390rVx c1591390rVx = this.LLJIJIL;
        if (c1591390rVx != null) {
            c1591390rVx.setFlingEnabled(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Go() {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.ui.HomepageViewPagerAssem.Go():void");
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final Integer LJIL() {
        C1591390rVx c1591390rVx = this.LLJIJIL;
        if (c1591390rVx != null) {
            return Integer.valueOf(c1591390rVx.getCurrentItem());
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final boolean O82() {
        return this.LLJJ != null;
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final int Va2() {
        C1590400rUM c1590400rUM = this.LLJILJIL;
        if (c1590400rUM != null) {
            return ((ArrayList) c1590400rUM.LLJ).size();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.main.FlingGestureAbility
    public final void eE1() {
        C1591390rVx c1591390rVx = this.LLJIJIL;
        if (c1591390rVx != null) {
            c1591390rVx.setFlingEnabled(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void sm() {
        C1591390rVx c1591390rVx = this.LLJIJIL;
        if (c1591390rVx != null) {
            c1591390rVx.LLILLJJLI.LIZIZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void Vf1() {
        boolean zLJI = MethodIDManager.LJI(71881);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            C486860J7k.LIZIZ(c19egLIZ).kE0("page_profile", false);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        IHomeSidebarService iHomeSidebarService;
        super.onDestroy();
        C1591010rVL c1591010rVL = this.LLJJIJIIJIL;
        if (c1591010rVL == null || (iHomeSidebarService = (IHomeSidebarService) c1591010rVL.LIZLLL.getValue()) == null) {
            return;
        }
        iHomeSidebarService.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerUIAssem, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        if (C296200BjG.LIZ()) {
            return;
        }
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final InterfaceC1209250hZb w8() {
        return this.LLJJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager, com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.19EG] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public static void Ho(C19EG c19eg) {
        ?? r1;
        if (c19eg == 0) {
            return;
        }
        final HomePageDataViewModel homePageDataViewModelLIZIZ = C680080Qly.LIZIZ(c19eg);
        final ?? LIZIZ = C486860J7k.LIZIZ(c19eg);
        homePageDataViewModelLIZIZ.setEventType("homepage_hot");
        if (C2550209z2.LIZ && LIZIZ.EQ2("page_feed") != 0) {
            LIZIZ.LLJJJ = true;
        }
        LIZIZ.kE0("page_feed", false);
        ?? r4 = c19eg;
        if (((Boolean) C261140ALg.LIZ.getValue()).booleanValue()) {
            if ((c19eg instanceof C199Y) && (c19eg instanceof InterfaceC1711206n0)) {
                Object objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) c19eg);
                r4 = c19eg;
                if (objLIZ != null) {
                    r4 = c19eg;
                    if (objLIZ instanceof C0J5E) {
                        Fragment fragment = (Fragment) objLIZ;
                        r1 = fragment;
                        r4 = c19eg;
                        if (fragment != null) {
                        }
                    }
                }
            } else {
                r1 = c19eg;
            }
            r4 = r1;
        }
        LIZIZ.IQ2(r4, new Observer() { // from class: X.0dYq
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String aid;
                if (Intrinsics.LJFF("page_profile", LIZIZ.CQ2(((Integer) obj).intValue()))) {
                    HomePageDataViewModel homePageDataViewModel = homePageDataViewModelLIZIZ;
                    String str = homePageDataViewModel.LLILZ;
                    Aweme aweme = homePageDataViewModel.LLILZIL;
                    String str2 = "";
                    if (aweme == null) {
                        aid = "";
                    } else {
                        aid = aweme.getAid();
                    }
                    C1054950dYj.LIZIZ = str;
                    if (aid != null) {
                        str2 = aid;
                    }
                    C1054950dYj.LIZJ = str2;
                    C1054950dYj.LIZ = SystemClock.uptimeMillis();
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void A6(InterfaceC21604319gn interfaceC21604319gn) {
        C1591390rVx c1591390rVx = this.LLJIJIL;
        if (c1591390rVx != null) {
            c1591390rVx.LLILLJJLI.LIZLLL(interfaceC21604319gn);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void As(String str) {
        C1590590rUf c1590590rUf = this.LLJJ;
        if (c1590590rUf != null) {
            c1590590rUf.As(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void F9(boolean z) {
        C1591390rVx c1591390rVx = this.LLJIJIL;
        if (c1591390rVx != null) {
            c1591390rVx.setEnableTouchSlopMultiple(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void Jk1(InterfaceC469360Ias interfaceC469360Ias) {
        C1591390rVx c1591390rVx = this.LLJIJIL;
        if (c1591390rVx != null) {
            c1591390rVx.LIZLLL(interfaceC469360Ias);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void LLIFFJFJJ(boolean z) {
        C1591390rVx c1591390rVx = this.LLJIJIL;
        if (c1591390rVx != null) {
            c1591390rVx.LLZILL = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void Mw2(boolean z) {
        C1591390rVx c1591390rVx = this.LLJIJIL;
        if (c1591390rVx != null) {
            c1591390rVx.setEnableDispatchTouchEventCheck(z);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).unbindAbility(this.LLJI, HomePageViewPagerAbility.class);
    }

    @Override // X.InterfaceC1591420rW0
    public final void dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        C1591010rVL c1591010rVL;
        HomeViewPagerAbility homeViewPagerAbility;
        HomeViewPagerAbility homeViewPagerAbility2;
        if (motionEvent == null) {
            return;
        }
        C1591010rVL c1591010rVL2 = this.LLJJIJIIJIL;
        boolean z3 = true;
        if (c1591010rVL2 != null && c1591010rVL2.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (C0BU8.LIZIZ || z) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if ((action != 1 && action != 3) || (homeViewPagerAbility2 = (HomeViewPagerAbility) this.LLJJIII.getValue()) == null) {
                    return;
                }
                homeViewPagerAbility2.LLIFFJFJJ(this.LLJJI);
                return;
            }
            HomeViewPagerAbility homeViewPagerAbility3 = (HomeViewPagerAbility) this.LLJJIII.getValue();
            if (homeViewPagerAbility3 != null && homeViewPagerAbility3.Wk()) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LLJJI = z2;
            if (!z) {
                return;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            HomeViewPagerAbility homeViewPagerAbility4 = (HomeViewPagerAbility) this.LLJJIII.getValue();
            if ((homeViewPagerAbility4 != null && homeViewPagerAbility4.kL1()) || (c1591010rVL = this.LLJJIJIIJIL) == null || !c1591010rVL.LIZIZ()) {
                return;
            }
            C1590590rUf c1590590rUf = this.LLJJ;
            if (c1590590rUf == null || !c1590590rUf.LIZLLL.FQ2("page_sidebar")) {
                z3 = false;
            }
            if ((!c1591010rVL.LIZ(rawX, rawY) && !z3) || (homeViewPagerAbility = (HomeViewPagerAbility) this.LLJJIII.getValue()) == null) {
                return;
            }
            homeViewPagerAbility.LLIFFJFJJ(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void ju(int i) {
        C1591390rVx c1591390rVx = this.LLJIJIL;
        if (c1591390rVx != null) {
            c1591390rVx.setSlideAngle(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void l8(InterfaceC21604319gn interfaceC21604319gn) {
        C1591390rVx c1591390rVx = this.LLJIJIL;
        if (c1591390rVx != null) {
            c1591390rVx.LLILLJJLI.LIZIZ(interfaceC21604319gn);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) throws Exception {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HomepageViewPagerAssem Init: ");
            sbLIZ.append(this);
            C2344809Gs.LJFF("saf-init", C2188811AlT.LIZIZ(sbLIZ));
            PrintStream printStream = System.err;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("saf-init:HomepageViewPagerAssem Init: ");
            sbLIZ2.append(this);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
            C1591390rVx c1591390rVx = (C1591390rVx) view;
            c1591390rVx.getOnInterceptTouchEventListeners().add(this);
            c1591390rVx.getOnActionDownListeners().add(this);
            this.LLJIJIL = c1591390rVx;
            C2271391DvN.LIZ(c1591390rVx, (C1A5L) C2271381DvM.LJJJIL.getValue());
            C1150504el.LIZ().LIZLLL("method_main_init_pager_duration", false);
            Go();
            C1150504el.LIZ().LJI("method_main_init_pager_duration", false);
            Ho(C724240Sb0.LIZ(this));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
            PrintStream printStream2 = System.err;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("saf-init:");
            sbLIZ3.append(this);
            sbLIZ3.append(' ');
            sbLIZ3.append(Log.getStackTraceString(e));
            printStream2.println(C2188811AlT.LIZIZ(sbLIZ3));
            throw e;
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).bindAbility(this.LLJI, HomePageViewPagerAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void qC2(String str) {
        C1590430rUP c1590430rUP;
        long jIndexOf;
        C1590400rUM c1590400rUM = this.LLJILJIL;
        if (c1590400rUM != null && !C086I.LIZIZ(c1590400rUM.LLIZ) && !C086I.LIZIZ(c1590400rUM.LLJ) && !TextUtils.isEmpty(str) && (c1590430rUP = c1590400rUM.LLIZLLLIL.get(str)) != null) {
            int size = ((ArrayList) c1590400rUM.LLJ).size();
            int i = c1590430rUP.LJ;
            if (size > i && !str.equals(((C1590430rUP) ListProtector.get(c1590400rUM.LLJ, i)).LIZIZ)) {
                Object obj = ListProtector.get(c1590400rUM.LLJ, c1590430rUP.LJ);
                C19EH c19ehLJIIJ = c1590400rUM.LLJI.LJIIJ();
                FragmentManager fragmentManager = c1590400rUM.LLJI;
                if (obj == null) {
                    jIndexOf = -1;
                } else {
                    jIndexOf = c1590400rUM.LLIZ.indexOf(obj);
                }
                Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI(C1590400rUM.LJJIZ(c1590400rUM.LLJIJIL, jIndexOf));
                if (fragmentLJJJJZI != null) {
                    c19ehLJIIJ.LJIILL(fragmentLJJJJZI);
                }
                Fragment fragmentLJJJJZI2 = c1590400rUM.LLJI.LJJJJZI(C1590400rUM.LJJIZ(c1590400rUM.LLJIJIL, c1590400rUM.LLIZ.indexOf(c1590430rUP)));
                if (fragmentLJJJJZI2 != null && fragmentLJJJJZI2.isAdded()) {
                    c19ehLJIIJ.LJJIFFI(fragmentLJJJJZI2);
                }
                c19ehLJIIJ.LJIIJ();
                ListProtector.remove(c1590400rUM.LLJ, c1590430rUP.LJ);
                ListProtector.add(c1590400rUM.LLJ, c1590430rUP.LJ, c1590430rUP);
                InterfaceC1590450rUR interfaceC1590450rUR = c1590400rUM.LLJILJIL;
                if (interfaceC1590450rUR != null) {
                    interfaceC1590450rUR.LIZJ(c1590400rUM.LLJ);
                }
                c1590400rUM.notifyDataSetChanged();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void rj0(boolean z) {
        C1591390rVx c1591390rVx = this.LLJIJIL;
        if (c1591390rVx != null) {
            c1591390rVx.setInProfileOtherPage(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final String sr2(int i) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return null;
        }
        return C486860J7k.LIZIZ(c19egLIZ).CQ2(i);
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void yT(InterfaceC469360Ias interfaceC469360Ias) {
        C1591390rVx c1591390rVx = this.LLJIJIL;
        if (c1591390rVx != null) {
            c1591390rVx.LJJIIJZLJL(interfaceC469360Ias);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void IX(float f, boolean z) {
        C1590400rUM c1590400rUM = this.LLJILJIL;
        if (c1590400rUM != null) {
            for (int i = 0; i < ((ArrayList) c1590400rUM.LLJ).size(); i++) {
                C1590430rUP c1590430rUP = (C1590430rUP) ListProtector.get(c1590400rUM.LLJ, i);
                if (c1590430rUP != null && TextUtils.equals("page_setting", c1590430rUP.LIZIZ) && c1590430rUP.LIZLLL != f) {
                    c1590430rUP.LIZLLL = Math.max(0.0f, Math.min(1.0f, f));
                    if (i != -1) {
                        if (z) {
                            C1590400rUM c1590400rUM2 = this.LLJILJIL;
                            if (c1590400rUM2 != null) {
                                c1590400rUM2.notifyDataSetChanged();
                                return;
                            }
                            return;
                        }
                        C1591390rVx c1591390rVx = this.LLJIJIL;
                        if (c1591390rVx == null) {
                            return;
                        }
                        HandlerHook.viewPostDelay(c1591390rVx, new ARunnableS124S0100000_24(this, 154), 100L);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void LLFFF(int i, boolean z) {
        C1591390rVx c1591390rVx = this.LLJIJIL;
        if (c1591390rVx != null) {
            c1591390rVx.LLFFF(i, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final boolean Ta0(boolean z, Boolean bool) {
        C1590590rUf c1590590rUf = this.LLJJ;
        if (c1590590rUf != null) {
            return c1590590rUf.LJ(z, bool);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("use helper before init: ");
        sbLIZ.append(this);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final boolean eO1(MotionEvent motionEvent, float f, float f2) {
        InterfaceC1577800rA2 interfaceC1577800rA2;
        Aweme aweme;
        if (!C0S4G.LIZ()) {
            return false;
        }
        if (C0BU8.LIZJ && (interfaceC1577800rA2 = (InterfaceC1577800rA2) this.LLJJIJIL.getValue()) != null && interfaceC1577800rA2.Bx0(f, f2)) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                aweme = C680080Qly.LIZIZ(c19egLIZ).LLJILJILJ;
            } else {
                aweme = null;
            }
            if (!((IMainPageSlide) ServiceManager.get().getService(IMainPageSlide.class)).LIZIZ(aweme).LIZ || (aweme != null && C1017070cZd.LLIIL(aweme))) {
                HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) this.LLJJIII.getValue();
                if (homeViewPagerAbility != null) {
                    homeViewPagerAbility.LLIFFJFJJ(false);
                }
                return false;
            }
        }
        InterfaceC1577800rA2 interfaceC1577800rA22 = (InterfaceC1577800rA2) this.LLJJIJIL.getValue();
        if (interfaceC1577800rA22 == null || !interfaceC1577800rA22.Bx0(f, f2)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1591420rW0
    public final boolean k2(MotionEvent motionEvent, float f, float f2) {
        if (motionEvent.getAction() == 2) {
            motionEvent.getX();
        }
        return eO1(motionEvent, f, f2);
    }

    @Override // com.ss.android.ugc.aweme.base.HomePageViewPagerAbility
    public final void ph(Bundle bundle, Aweme aweme, String str) {
        boolean zLJI = MethodIDManager.LJI(71881);
        C1590590rUf c1590590rUf = this.LLJJ;
        if (c1590590rUf == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("use helper before init: ");
            sbLIZ.append(this);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(strLIZIZ);
            if (zLJI) {
                MethodIDManager.LJ();
                throw illegalArgumentException;
            }
            throw illegalArgumentException;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C680080Qly.LIZIZ(c19egLIZ).LLIZ = str;
        }
        if (C690970R8l.LIZ()) {
            c1590590rUf.ph(bundle, aweme, str);
        } else {
            c1590590rUf.ph(null, aweme, str);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
