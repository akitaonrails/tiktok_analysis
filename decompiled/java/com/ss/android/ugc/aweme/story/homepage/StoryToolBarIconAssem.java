package com.ss.android.ugc.aweme.story.homepage;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03IT;
import X.C09JN;
import X.C09R3;
import X.C0CWS;
import X.C0QSJ;
import X.C118300cf;
import X.C11JF;
import X.C1246110iX3;
import X.C1331660kl2;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1581510rG1;
import X.C1585060rLk;
import X.C1591220rVg;
import X.C1595530rcd;
import X.C1595540rce;
import X.C1595550rcf;
import X.C1595620rcm;
import X.C1595630rcn;
import X.C1595720rcw;
import X.C1595730rcx;
import X.C1595800rd4;
import X.C1595910rdF;
import X.C1596000rdO;
import X.C1600640rks;
import X.C1600650rkt;
import X.C1602160rnK;
import X.C1620910sHZ;
import X.C1620930sHb;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1954807lC;
import X.C19719912Dl;
import X.C1AV2;
import X.C1AV3;
import X.C2177241AIw;
import X.C2177251AIx;
import X.C2180521AVm;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C259800zU;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C444960Hcc;
import X.C452070Ho5;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.ChoreographerFrameCallbackC1620780sHM;
import X.EnumC1595610rcl;
import X.EnumC2180541AVo;
import X.InterfaceC1146704e9;
import X.InterfaceC1331910klR;
import X.InterfaceC1595810rd5;
import X.InterfaceC1595830rd7;
import X.InterfaceC1600660rku;
import X.InterfaceC1602300rnY;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC665370Q7z;
import Y.ACListenerS126S0200000_24;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS35S0101000_24;
import Y.AfS38S1300000_24;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility;
import com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS107S1200000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryToolBarIconAssem extends UIContentAssem implements StoryToolBarIconAbility, InterfaceC1595810rd5, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public View LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public View LLJIJIL;
    public Choreographer LLJILJIL;
    public ChoreographerFrameCallbackC1620780sHM LLJILJILJ;
    public ARunnableS35S0101000_24 LLJILLL;
    public ARunnableS124S0100000_24 LLJJ;
    public Runnable LLJJI;
    public Boolean LLJJIII;
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1161));
    public final AssemVMLazy LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C630740Ooa LLJJJ;
    public boolean LLJJJIL;
    public final C630740Ooa LLJJJJ;
    public final C630740Ooa LLJJJJJIL;
    public final C630740Ooa LLJJJJLIIL;
    public final C630740Ooa LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public boolean LLJLLIL;
    public final List<InterfaceC1595830rd7> LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public Pair<Float, Float> LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public final C01GW LLLI;
    public volatile HomeTabAbility LLLII;
    public volatile HomePageViewPagerAbility LLLIIII;
    public InterfaceC665370Q7z LLLIIIIL;
    public C0QSJ LLLIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryToolBarIconAssem.class, "storyToolBarIconVM", "getStoryToolBarIconVM()Lcom/ss/android/ugc/aweme/story/homepage/StoryToolBarIconViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(StoryToolBarIconAssem.class, "homeTabAbilityByDI", "getHomeTabAbilityByDI()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(StoryToolBarIconAssem.class, "homePageViewPagerAbility", "getHomePageViewPagerAbility()Lcom/ss/android/ugc/aweme/base/HomePageViewPagerAbility;", 0);
        c09r3.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility
    public final int[] QQ() {
        int[] iArr = new int[2];
        View view = this.LLJ;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
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

    public final C0QSJ Ho() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLIIIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLIIIIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLIIIIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLLIIIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final boolean Jo() {
        if (this.LLJ != null) {
            return true;
        }
        View viewFindViewById = LJJIJL().findViewById(R.id.w_e);
        ViewParent parent = viewFindViewById != null ? viewFindViewById.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewFindViewById == null || viewGroup == null) {
            return false;
        }
        this.LLJ = viewFindViewById;
        C786410Ut5.K7(viewGroup, new ACListenerS126S0200000_24(this, viewGroup, 36));
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        C427690Gpr.LJI(viewGroup, null);
        this.LLJIJIL = viewGroup;
        ARunnableS124S0100000_24 aRunnableS124S0100000_24 = this.LLJJ;
        if (aRunnableS124S0100000_24 != null) {
            aRunnableS124S0100000_24.run();
            this.LLJJ = null;
        }
        Runnable runnable = this.LLJJI;
        if (runnable != null) {
            runnable.run();
            this.LLJJI = null;
        }
        return true;
    }

    public final boolean Lo() {
        if (this.LLIZLLLIL != null) {
            return true;
        }
        View viewFindViewById = LJJIJL().findViewById(R.id.w_d);
        Object parent = viewFindViewById != null ? viewFindViewById.getParent() : null;
        View view = parent instanceof View ? (View) parent : null;
        if (viewFindViewById == null || view == null) {
            return false;
        }
        this.LLIZLLLIL = viewFindViewById;
        C786410Ut5.I7(new ACListenerS126S0200000_24(this, view, 37), view);
        C427690Gpr.LJI(view, null);
        this.LLJI = view;
        ARunnableS35S0101000_24 aRunnableS35S0101000_24 = this.LLJILLL;
        if (aRunnableS35S0101000_24 != null) {
            aRunnableS35S0101000_24.run();
            this.LLJILLL = null;
        }
        return true;
    }

    public final boolean No() {
        return ((Boolean) this.LLLI.getValue()).booleanValue();
    }

    public final StoryToolBarIconViewModel So() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIL;
        return (StoryToolBarIconViewModel) assemVMLazy.getValue();
    }

    public StoryToolBarIconAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryToolBarIconViewModel.class);
        AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(c19719912DlLIZ, 241);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(400);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS548S0100000_4, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((AbstractC738140SxQ) this, 1167), aFwS264S0000000_24, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJIJIIJIL = assemVMLazy;
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(354));
        this.LLJJJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 1168));
        this.LLJJJJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 1171));
        this.LLJJJJJIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 1170));
        this.LLJJJJLIIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 1163));
        this.LLJJL = C628500Oky.LIZ(new AwS568S0100000_24(this, 1164));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1989));
        this.LLJL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1172));
        this.LLJLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1174));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1175));
        this.LLJLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1169));
        this.LLJLLIL = true;
        this.LLJLLL = new ArrayList();
        this.LLJZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(353));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1173));
        this.LLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1162));
        this.LLLF = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1166));
        this.LLLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1165));
    }

    @Override // X.InterfaceC1595810rd5
    public final void I4() {
        So().setState(AFwS264S0000000_24.get$arr$(716));
    }

    public final void Vo() {
        IMFToolBarAbility iMFToolBarAbility;
        if (No() && (iMFToolBarAbility = (IMFToolBarAbility) this.LLJJJJ.getValue()) != null) {
            iMFToolBarAbility.bv(false, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility
    public final void YN() {
        StoryToolBarIconViewModel storyToolBarIconViewModelSo = So();
        boolean z = So().LLJ;
        StoryToolBarIconViewModel storyToolBarIconViewModelSo2 = So();
        storyToolBarIconViewModelSo.yQ2(z, !Intrinsics.LJFF(storyToolBarIconViewModelSo2.LLILLL.get(storyToolBarIconViewModelSo2.getState().LLILLJJLI), Boolean.TRUE));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Choreographer choreographer;
        super.onDestroy();
        ChoreographerFrameCallbackC1620780sHM choreographerFrameCallbackC1620780sHM = this.LLJILJILJ;
        if (choreographerFrameCallbackC1620780sHM != null && (choreographer = this.LLJILJIL) != null) {
            choreographer.removeFrameCallback(choreographerFrameCallbackC1620780sHM);
        }
        this.LLJILJILJ = null;
        if (C1591220rVg.LIZLLL()) {
            ((C1595800rd4) this.LLJJIJI.getValue()).cancel();
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), StoryToolBarIconAbility.class, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unloadAbility from ");
            sbLIZ.append(fragmentLJI);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLJJJ.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.tx0((C1620910sHZ) this.LLJZIJLIL.getValue());
        }
        HomeTabAbility homeTabAbility2 = (HomeTabAbility) this.LLJJJ.getValue();
        if (homeTabAbility2 != null) {
            homeTabAbility2.Ik0((C1620910sHZ) this.LLL.getValue());
        }
        HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) this.LLJJJJJIL.getValue();
        if (homePageViewPagerAbility != null) {
            homePageViewPagerAbility.yT((C1620930sHb) this.LLLF.getValue());
        }
        ((ArrayList) this.LLJLLL).clear();
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        this.LLLFFI = true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (this.LLLFFI && this.LLJLLIL) {
            So().yQ2(true, true);
        }
        this.LLLFFI = false;
    }

    @Override // X.InterfaceC1595810rd5
    public final Pair<Float, Float> Vb() {
        return this.LLLFF;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility
    public final View aq0() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1595810rd5
    public final View getView() {
        return this.LLJ;
    }

    public static int Oo(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1525083535) {
            if (iHashCode != -1309089240) {
                if (iHashCode == 984907784 && str.equals("For You")) {
                    return 1;
                }
                return -1;
            }
            if (str.equals("FRIENDS_FEED")) {
                return 0;
            }
            return -1;
        }
        if (str.equals("Following")) {
            return 2;
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility
    public final void D51(C1595720rcw c1595720rcw) {
        synchronized (this.LLJLLL) {
            try {
                ((ArrayList) this.LLJLLL).remove(c1595720rcw);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility
    public final void Ts2(Pair<Float, Float> pair) {
        this.LLLFF = pair;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility
    public final void Ws1(C1595720rcw c1595720rcw) {
        synchronized (this.LLJLLL) {
            try {
                if (((ArrayList) this.LLJLLL).contains(c1595720rcw)) {
                    return;
                }
                ((ArrayList) this.LLJLLL).add(c1595720rcw);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void Zo(View view) {
        super.onViewCreated(view);
        boolean zLo = Lo();
        boolean zJo = Jo();
        if (!zLo || !zJo) {
            this.LLJILJILJ = new ChoreographerFrameCallbackC1620780sHM(this, 2);
            Choreographer choreographerV2 = C786410Ut5.v2();
            this.LLJILJIL = choreographerV2;
            if (choreographerV2 != null) {
                choreographerV2.postFrameCallback(this.LLJILJILJ);
            }
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, StoryToolBarIconAbility.class, null, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadAbility to ");
            sbLIZ.append(fragmentLJI);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0rcr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1595530rcd) obj).LLILZLL);
            }
        }, null, new AwS638S0100000_24(this, 108), 6);
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0rco
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1595530rcd) obj).LLIZ);
            }
        }, null, new AwS638S0100000_24(this, 102), 6);
        if (C1595910rdF.LIZ().mainEnable) {
            C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0rcs
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1595530rcd) obj).LLJ;
                }
            }, null, new AwS638S0100000_24(this, 103), 6);
        } else {
            C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0rct
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1595530rcd) obj).LLIZLLLIL;
                }
            }, null, new AwS638S0100000_24(this, 104), 6);
        }
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0rcp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1595530rcd) obj).LLJI);
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 105), 4);
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0rcu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1595530rcd) obj).LLJILJIL;
            }
        }, null, new C1595540rce(this), 6);
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0rcv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1595530rcd) obj).LL;
            }
        }, null, new AwS638S0100000_24(this, 106), 6);
        if (So().wQ2() == 1) {
            C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0rcq
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1595530rcd) obj).LLILZIL);
                }
            }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 107), 4);
        }
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLJJJ.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.ao((C1620910sHZ) this.LLJZIJLIL.getValue());
        }
        HomeTabAbility homeTabAbility2 = (HomeTabAbility) this.LLJJJ.getValue();
        if (homeTabAbility2 != null) {
            homeTabAbility2.UC1((C1620910sHZ) this.LLL.getValue());
        }
        HomePageViewPagerAbility homePageViewPagerAbility = (HomePageViewPagerAbility) this.LLJJJJJIL.getValue();
        if (homePageViewPagerAbility != null) {
            homePageViewPagerAbility.Jk1((C1620930sHb) this.LLLF.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ap(final C1595550rcf c1595550rcf) {
        final C1600650rkt c1600650rkt;
        final boolean z;
        T t;
        List<String> urlList;
        List<String> urlList2;
        final InterfaceC1600660rku interfaceC1600660rku;
        if (c1595550rcf != null) {
            View view = this.LLJ;
            if ((view instanceof C1600650rkt) && (c1600650rkt = (C1600650rkt) view) != null) {
                C1595630rcn c1595630rcn = c1595550rcf.LJII;
                if (c1595630rcn.LIZ == null) {
                    return;
                }
                int i = c1595630rcn.LIZJ;
                boolean z2 = c1595630rcn.LIZIZ;
                boolean z3 = false;
                if (z2 && this.LLJJJIL && i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                final C259800zU c259800zU = new C259800zU();
                C1595630rcn c1595630rcn2 = c1595550rcf.LJII;
                if (c1595630rcn2.LJI == EnumC1595610rcl.DOUBLE_LIVE_REFRESH) {
                    t = c1595630rcn2.LIZ;
                } else {
                    t = 0;
                }
                c259800zU.element = t;
                final C118300cf c118300cf = new C118300cf();
                c118300cf.element = c1595550rcf.LIZIZ.size();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("received avatar bitmap, avatar icon view: ");
                sbLIZ.append(this.LLJ);
                sbLIZ.append(" refreshAnimator:");
                sbLIZ.append(z);
                sbLIZ.append("  liveIndex :");
                sbLIZ.append(i);
                sbLIZ.append("  refreshType: ");
                sbLIZ.append(c1595550rcf.LJII.LJI);
                sbLIZ.append("  bean.liveUrlModel?.urlList：");
                UrlModel urlModel = c1595550rcf.LJII.LJ;
                if (urlModel != null) {
                    urlList = urlModel.getUrlList();
                } else {
                    urlList = null;
                }
                sbLIZ.append(urlList);
                C2188811AlT.LIZIZ(sbLIZ);
                int i2 = C1595620rcm.LIZ[c1595550rcf.LJII.LJI.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            UrlModel urlModel2 = c1595550rcf.LJII.LJ;
                            if (urlModel2 != null && (urlList2 = urlModel2.getUrlList()) != null && (interfaceC1600660rku = c1595550rcf.LJII.LJFF) != null) {
                                C1331660kl2.LJIIJ(new C03IT(urlList2)).LJJII(new InterfaceC1331910klR() { // from class: X.0rci
                                    @Override // X.InterfaceC1331910klR
                                    public final void onCanceled() {
                                    }

                                    @Override // X.InterfaceC1331910klR
                                    public final void onFailed(Throwable th) {
                                    }

                                    @Override // X.InterfaceC1331910klR
                                    public final void onProgress(float f) {
                                    }

                                    @Override // X.InterfaceC1331910klR
                                    public final void LIZ(Bitmap bitmap) {
                                        this.LL.Go(c1600650rkt, interfaceC1600660rku, c118300cf.element, z, c259800zU.element, bitmap, c1595550rcf.LJII.LIZLLL);
                                    }
                                });
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        C1595630rcn c1595630rcn3 = c1595550rcf.LJII;
                        InterfaceC1600660rku interfaceC1600660rku2 = c1595630rcn3.LJFF;
                        if (interfaceC1600660rku2 != null) {
                            Go(c1600650rkt, interfaceC1600660rku2, c118300cf.element, z, (Bitmap) c259800zU.element, c1595630rcn3.LIZ, c1595630rcn3.LIZLLL);
                        }
                    }
                } else {
                    c1600650rkt.LIZ(null, c1595550rcf.LJII.LIZ);
                    c1600650rkt.LIZJ(null, c118300cf.element);
                }
                if (i != -1) {
                    z3 = true;
                }
                this.LLJJJIL = z3;
                withState(So(), new AwS603S0100000_24(this, 303));
            }
        }
    }

    public final void bp(C1595530rcd c1595530rcd) {
        View view;
        View view2;
        View view3;
        C1AV2 c1av2LIZ = C1AV3.LIZ("1", "Social", null, "story_toolbar");
        int i = c1595530rcd.LLJI;
        if (i == 0) {
            View view4 = this.LLJIJIL;
            if ((view4 == null || view4.getVisibility() != c1595530rcd.LLIZ) && (view = this.LLJIJIL) != null) {
                C2180521AVm.LIZLLL(view, c1595530rcd.LLIZ, c1av2LIZ);
            }
            if (No() && (((view2 = this.LLJI) == null || view2.getVisibility() != c1595530rcd.LLILZLL) && (view3 = this.LLJI) != null)) {
                C2180521AVm.LIZLLL(view3, c1595530rcd.LLILZLL, c1av2LIZ);
            }
            View view5 = this.LLJIJIL;
            if (view5 != null) {
                C2180521AVm.LIZJ(view5, 1.0f, c1av2LIZ);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("avatar icon frame ");
            sbLIZ.append(this.LLJIJIL);
            sbLIZ.append(" visibility change to ");
            sbLIZ.append(c1595530rcd.LLIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            if (i == 1 && C1585060rLk.LIZJ() && C1596000rdO.LIZ()) {
                View view6 = this.LLJIJIL;
                if (view6 != null) {
                    C2180521AVm.LIZLLL(view6, 8, c1av2LIZ);
                }
            } else {
                View view7 = this.LLJIJIL;
                if (view7 != null) {
                    C2180521AVm.LIZLLL(view7, 0, c1av2LIZ);
                }
            }
            View view8 = this.LLJIJIL;
            if (view8 != null) {
                C2180521AVm.LIZJ(view8, 1.0f, c1av2LIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("avatar icon frame visibility set to 0 due to avatar animation, state is ");
            sbLIZ2.append(c1595530rcd.LLJI);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        Vo();
    }

    public final void cp(int i) {
        final boolean z;
        long j;
        C1AV2 c1av2LIZ = C1AV3.LIZ(2, "Social", null, "story_toolbar");
        if (((Boolean) this.LLJL.getValue()).booleanValue()) {
            if (!C1596000rdO.LIZ() && !C1600640rks.LIZ() && !C1581510rG1.LJ()) {
                final View view = this.LLJI;
                if (view != null) {
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    final C1AV2 c1av2LIZ2 = C1AV3.LIZ(3, "Social", null, "story_toolbar");
                    float f = 0.0f;
                    if (z) {
                        C2180521AVm.LIZJ(view, 0.0f, c1av2LIZ2);
                        if (!((Boolean) this.LLJLIL.getValue()).booleanValue()) {
                            C2180521AVm.LIZLLL(view, 0, c1av2LIZ2);
                        }
                        if (No() && view.getVisibility() != 0) {
                            C2180521AVm.LIZLLL(view, 0, c1av2LIZ2);
                        }
                    }
                    C2180521AVm.LIZ(view, EnumC2180541AVo.V_ALPHA, C1AV3.LIZ(4, "Social", Boolean.TRUE, "story_toolbar"));
                    C2180521AVm.LIZ(view, EnumC2180541AVo.V_ANIMATE, c1av2LIZ2);
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    if (z) {
                        f = 1.0f;
                    }
                    ViewPropertyAnimator listener = viewPropertyAnimatorAnimate.alpha(f).setDuration(100L).setListener(new Animator.AnimatorListener() { // from class: X.0rcj
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            View view2;
                            float f2;
                            int i2 = 8;
                            if (!((Boolean) this.LL.LLJLIL.getValue()).booleanValue()) {
                                View view3 = view;
                                if (z) {
                                    i2 = 0;
                                }
                                C2180521AVm.LIZLLL(view3, i2, c1av2LIZ2);
                            } else if (!this.LL.No() || ((view2 = this.LL.LLJIJIL) != null && view2.getVisibility() == 0)) {
                                view.setClickable(z);
                            } else {
                                View view4 = view;
                                if (z) {
                                    i2 = 0;
                                }
                                C2180521AVm.LIZLLL(view4, i2, c1av2LIZ2);
                                view.setClickable(z);
                            }
                            View view5 = view;
                            if (z) {
                                f2 = 1.0f;
                            } else {
                                f2 = 0.0f;
                            }
                            C2180521AVm.LIZJ(view5, f2, c1av2LIZ2);
                            this.LL.Vo();
                        }
                    });
                    if (this.LLLFZ) {
                        j = 150;
                    } else {
                        j = 0;
                    }
                    listener.setStartDelay(j).start();
                    return;
                }
                return;
            }
            View view2 = this.LLJI;
            if (view2 != null) {
                C2180521AVm.LIZLLL(view2, i, c1av2LIZ);
            }
            Vo();
            return;
        }
        View view3 = this.LLJI;
        if (view3 != null) {
            C2180521AVm.LIZLLL(view3, i, c1av2LIZ);
        }
        Vo();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1578630rBN.LJIIJJI(this, new C0CWS(this, view, null));
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility
    public final void Hk1(String str, String str2) {
        So().Hk1("pull_down", str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    @Override // com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer Mx2(X.EnumC1584350rKb r19, java.lang.String r20) {
        /*
            r18 = this;
            X.19EG r3 = X.C724240Sb0.LIZ(r18)
            r6 = 0
            if (r3 == 0) goto L4d
            com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconViewModel r2 = r18.So()
            r7 = r20
            int r1 = Oo(r7)
            X.002o r5 = r2.getState()
            X.0rcd r5 = (X.C1595530rcd) r5
            X.0O9j r0 = X.C614770O9j.LIZIZ
            com.ss.android.ugc.aweme.service.IFeedSkylightCommonService r0 = r0.LJ()
            X.0rd1 r4 = r0.LJJI(r1, r3)
            java.lang.String r1 = r4.LIZIZ
            java.lang.String r0 = "publish_landing"
            boolean r3 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            int r1 = r7.hashCode()
            r0 = -1525083535(0xffffffffa5191271, float:-1.3276883E-16)
            if (r1 == r0) goto L8d
            r0 = -1309089240(0xffffffffb1f8e228, float:-7.243461E-9)
            if (r1 == r0) goto L82
            r0 = 984907784(0x3ab48008, float:0.0013771066)
            if (r1 != r0) goto L98
            java.lang.String r0 = "For You"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L98
            boolean r1 = r5.LLILLL
        L46:
            boolean r0 = r4.LIZ
            r4 = 1
            if (r0 == r1) goto L4e
            if (r3 == 0) goto L4e
        L4d:
            return r6
        L4e:
            X.002o r5 = r2.getState()
            X.0rcd r5 = (X.C1595530rcd) r5
            r8 = 0
            r17 = 4093(0xffd, float:5.736E-42)
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r6
            r14 = r6
            r15 = r8
            r16 = r6
            X.0rcd r3 = X.C1595530rcd.LIZ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            int[] r1 = X.C1584380rKe.LIZ
            int r0 = r19.ordinal()
            r1 = r1[r0]
            if (r1 == r4) goto L9a
            r0 = 2
            if (r1 != r0) goto L4d
            X.01GW r0 = r2.LLILZ
            java.lang.Object r0 = r0.getValue()
            X.0rd0 r0 = (X.InterfaceC1595760rd0) r0
            int r0 = r0.LIZIZ(r3)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            return r6
        L82:
            java.lang.String r0 = "FRIENDS_FEED"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L98
            boolean r1 = r5.LLILZIL
            goto L46
        L8d:
            java.lang.String r0 = "Following"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L98
            boolean r1 = r5.LLILZ
            goto L46
        L98:
            r1 = 0
            goto L46
        L9a:
            X.01GW r0 = r2.LLILZ
            java.lang.Object r0 = r0.getValue()
            X.0rd0 r0 = (X.InterfaceC1595760rd0) r0
            int r0 = r0.LIZ(r3)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconAssem.Mx2(X.0rKb, java.lang.String):java.lang.Integer");
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility
    public final void fe2(final C1595550rcf c1595550rcf, final String str) {
        final boolean z;
        int i;
        View view = this.LLJ;
        if (view == null || str.length() == 0) {
            return;
        }
        final StoryToolBarIconViewModel storyToolBarIconViewModelSo = So();
        Context context = view.getContext();
        if (c1595550rcf.LIZIZ.isEmpty()) {
            storyToolBarIconViewModelSo.setState(new AwS107S1200000_24(str, c1595550rcf, storyToolBarIconViewModelSo, 4));
            return;
        }
        if (C1595910rdF.LIZ().mainEnable) {
            final C1595550rcf c1595550rcf2 = storyToolBarIconViewModelSo.getState().LLJ;
            C1595630rcn c1595630rcn = c1595550rcf.LJII;
            int i2 = c1595630rcn.LIZJ;
            if (c1595630rcn.LIZIZ && i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (c1595550rcf2 != null && c1595550rcf.LIZIZ(c1595550rcf2) && Intrinsics.LJFF(c1595550rcf.LJIIIZ, c1595550rcf2.LJIIIZ) && !z) {
                if (c1595550rcf.LJIIIIZZ != 0) {
                    return;
                }
                storyToolBarIconViewModelSo.setState(new AwS603S0100000_24(c1595550rcf, 618));
                storyToolBarIconViewModelSo.yQ2(true, true);
                return;
            }
            C11JF c11jf = storyToolBarIconViewModelSo.LLIZLLLIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            ArrayList arrayList = new ArrayList(c1595550rcf.LIZIZ);
            ArrayList arrayList2 = new ArrayList(c1595550rcf.LIZJ);
            int size = arrayList.size();
            int size2 = arrayList2.size();
            boolean z2 = C1595910rdF.LIZ().mainEnable;
            c1595550rcf.LJII.LJI = EnumC1595610rcl.NO_REFRESH;
            final C259800zU c259800zU = new C259800zU();
            final C259800zU c259800zU2 = new C259800zU();
            int iLIZIZ = C1596000rdO.LIZIZ();
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d)));
            if (z2) {
                if (size == 1 && size2 == 1 && i2 == 0) {
                    c1595550rcf.LJII.LJI = EnumC1595610rcl.SINGLE_LIVE_REFRESH;
                    i = 0;
                    iLIZIZ = 0;
                    iLIZIZ2 = 0;
                } else {
                    i = 0;
                }
                c259800zU2.element = ListProtector.get(arrayList2, i);
                c259800zU.element = ListProtector.get(arrayList, i);
                if (size > 1 && size2 > 1) {
                    ListProtector.remove(arrayList2, i);
                    ListProtector.remove(arrayList, i);
                    c1595550rcf.LJII.LJI = EnumC1595610rcl.DOUBLE_LIVE_REFRESH;
                }
            } else {
                i = 0;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : arrayList2) {
                int i3 = i + 1;
                if (i >= 0) {
                    linkedHashMap.put(Integer.valueOf(i), obj);
                    i = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            InterfaceC420801kM interfaceC420801kMLJJLL = new C2177241AIw(context, new C1246110iX3(arrayList, arrayList.size()), new C2177251AIx((int) C1596000rdO.LIZJ(), iLIZIZ, null, iLIZIZ2, 0, 0.76f, 0.0f, 0, 0, Boolean.valueOf(C444960Hcc.LIZIZ()), null, true, false, false, linkedHashMap, 38772)).LIZLLL().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0rcg
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    C1C7U.LIZ("StoryToolBarIconViewModel@8781.drawAvatarBitmapWithRefresh$2");
                    Bitmap bitmap = (Bitmap) obj2;
                    C1595550rcf c1595550rcf3 = c1595550rcf;
                    C1595630rcn c1595630rcn2 = c1595550rcf3.LJII;
                    c1595630rcn2.LIZ = bitmap;
                    c1595630rcn2.LJ = c259800zU.element;
                    c1595630rcn2.LJFF = c259800zU2.element;
                    StoryToolBarIconViewModel storyToolBarIconViewModel = storyToolBarIconViewModelSo;
                    storyToolBarIconViewModel.setState(new C1595570rch(str, bitmap, c1595550rcf3, storyToolBarIconViewModel, c1595550rcf2, z));
                    C1C7U.LIZIZ("StoryToolBarIconViewModel@8781.drawAvatarBitmapWithRefresh$2");
                }
            }, new C09JN() { // from class: X.00PC
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                    C1C7U.LIZ("StoryToolBarIconViewModel@8781.drawAvatarBitmapWithRefresh$3");
                    C1C7U.LIZIZ("StoryToolBarIconViewModel@8781.drawAvatarBitmapWithRefresh$3");
                }
            });
            storyToolBarIconViewModelSo.disposeOnClear(interfaceC420801kMLJJLL);
            storyToolBarIconViewModelSo.LLIZLLLIL = (C11JF) interfaceC420801kMLJJLL;
            return;
        }
        int i4 = 0;
        C1595550rcf c1595550rcf3 = storyToolBarIconViewModelSo.getState().LLJ;
        if (c1595550rcf3 != null && c1595550rcf.LIZIZ(c1595550rcf3) && Intrinsics.LJFF(c1595550rcf.LJIIIZ, c1595550rcf3.LJIIIZ)) {
            if (c1595550rcf.LJIIIIZZ != 0) {
                return;
            }
            storyToolBarIconViewModelSo.setState(new AwS603S0100000_24(c1595550rcf, 617));
            storyToolBarIconViewModelSo.yQ2(true, true);
            return;
        }
        C11JF c11jf2 = storyToolBarIconViewModelSo.LLIZLLLIL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        List<UrlModel> list = c1595550rcf.LIZIZ;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (InterfaceC1600660rku interfaceC1600660rku : c1595550rcf.LIZJ) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                linkedHashMap2.put(Integer.valueOf(i4), interfaceC1600660rku);
                i4 = i5;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        InterfaceC420801kM interfaceC420801kMLJJLL2 = new C2177241AIw(context, new C1246110iX3(list, list.size()), new C2177251AIx((int) C1596000rdO.LIZJ(), C1596000rdO.LIZIZ(), null, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))), 0, 0.76f, 0.0f, 0, 0, Boolean.valueOf(C444960Hcc.LIZIZ()), null, true, false, false, linkedHashMap2, 38772)).LIZLLL().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS38S1300000_24(storyToolBarIconViewModelSo, str, c1595550rcf, c1595550rcf3, 1), new C09JN() { // from class: X.00PD
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                C1C7U.LIZ("StoryToolBarIconViewModel@8781.drawAvatarBitmap$3");
                C1C7U.LIZIZ("StoryToolBarIconViewModel@8781.drawAvatarBitmap$3");
            }
        });
        storyToolBarIconViewModelSo.disposeOnClear(interfaceC420801kMLJJLL2);
        storyToolBarIconViewModelSo.LLIZLLLIL = (C11JF) interfaceC420801kMLJJLL2;
    }

    @Override // com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility
    public final void u81(String str, String str2, boolean z, boolean z2) {
        boolean z3;
        So().setState(new AwS603S0100000_24(new C1595730rcx(str, z, z2, str2), 613));
        if (!z) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLLFZ = z3;
    }

    public final void Go(C1600650rkt c1600650rkt, InterfaceC1600660rku interfaceC1600660rku, int i, boolean z, Bitmap bitmap, Bitmap bitmap2, String str) {
        int visibility = c1600650rkt.getVisibility();
        c1600650rkt.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c1600650rkt);
        c1600650rkt.LIZJ(interfaceC1600660rku, i);
        if (z) {
            if (c1600650rkt.getLiveAvatarBitmap() != null) {
                c1600650rkt.setStoryAvatarBitmap(bitmap);
                c1600650rkt.LIZLLL(bitmap2);
                ((InterfaceC1602300rnY) this.LLJJIJIL.getValue()).LIZ(c1600650rkt.getAnimationDuration(), str);
                return;
            }
            c1600650rkt.LIZ(bitmap2, bitmap);
            return;
        }
        c1600650rkt.LIZ(bitmap2, bitmap);
    }
}
