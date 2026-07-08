package com.ss.android.ugc.aweme.base.ui.assem;

import X.AbstractC738140SxQ;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1388190mED;
import X.C13LE;
import X.C1559260qg8;
import X.C1564490qoZ;
import X.C1572090r0p;
import X.C1572230r13;
import X.C1575610r6V;
import X.C1575790r6n;
import X.C1581460rFw;
import X.C1620910sHZ;
import X.C1620930sHb;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C305290Bxv;
import X.C343710Ddh;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C687700QyG;
import X.C723580SZw;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1576350r7h;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1575760r6k;
import X.InterfaceC1575770r6l;
import X.InterfaceC1575850r6t;
import X.InterfaceC1586360rNq;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS124S0100000_24;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightToolbarIconBridgeViewModel;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.story.ability.StoryToolBarIconAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedSkylightToolbarIconBridgeAssem extends AbstractC738140SxQ implements InterfaceC724530SbT, InterfaceC1575850r6t, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C1564490qoZ.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
    public final C630740Ooa LLILLJJLI = C628500Oky.LIZ(new AwS568S0100000_24(this, 102));
    public final C630740Ooa LLILLL = C628500Oky.LIZ(new AwS568S0100000_24(this, 98));
    public final C630740Ooa LLILZ = C628500Oky.LIZ(new AwS568S0100000_24(this, 91));
    public final C630740Ooa LLILZIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 92));
    public final C630740Ooa LLILZLL = C628500Oky.LIZ(new AwS568S0100000_24(this, 93));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 96));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(74));
    public final C630740Ooa LLJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 97));
    public final AssemVMLazy LLJI;
    public final C736950SvV LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final C630740Ooa LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public volatile HomeTabAbility LLJJIJI;
    public volatile HomeViewPagerAbility LLJJIJIIJIL;
    public InterfaceC665370Q7z LLJJIJIL;
    public C0QSJ LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedSkylightToolbarIconBridgeAssem.class, "homeTabAbilityByDI", "getHomeTabAbilityByDI()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FeedSkylightToolbarIconBridgeAssem.class, "homeViewPagerAbilityByDI", "getHomeViewPagerAbilityByDI()Lcom/ss/android/ugc/aweme/base/mainfragment/HomeViewPagerAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(FeedSkylightToolbarIconBridgeAssem.class, "containerVM", "getContainerVM()Lcom/ss/android/ugc/aweme/base/vm/FeedSkylightContainerViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(FeedSkylightToolbarIconBridgeAssem.class, "bridgeVM", "getBridgeVM()Lcom/ss/android/ugc/aweme/base/vm/FeedSkylightToolbarIconBridgeViewModel;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        new Object() { // from class: X.0qfk
        };
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        HomeViewPagerAbility homeViewPagerAbility;
        Context context;
        C19EG c19egLIZIZ;
        super.onCreate();
        if (so() != 0 || FriendsTabTopExperiment.LIZIZ() || oo()) {
            ((List) this.LLIZLLLIL.getValue()).add(C736680Sv4.LJIIIIZZ(this, ko(), new C2217381BqS() { // from class: X.0r6W
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1575830r6r) obj).LLILLL;
                }
            }, null, new AwS638S0100000_24(this, 142), 6));
        }
        ((List) this.LLIZLLLIL.getValue()).add(AssemViewModel.asyncSubscribe$default(mo(), new C2217381BqS() { // from class: X.0r0t
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1573030r2L c1573030r2L = (C1573030r2L) obj;
                c1573030r2L.getClass();
                return C627260Oiy.LIZLLL(c1573030r2L);
            }
        }, this, null, new AwS603S0100000_24(this, 466), null, new AwS603S0100000_24(this, 468), 20, null));
        ((List) this.LLIZLLLIL.getValue()).add(AssemViewModel.asyncSubscribe$default(mo(), new C2217381BqS() { // from class: X.0r0v
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1573030r2L c1573030r2L = (C1573030r2L) obj;
                c1573030r2L.getClass();
                return C627260Oiy.LIZJ(c1573030r2L);
            }
        }, this, null, null, null, new AwS603S0100000_24(this, 471), 28, null));
        C736680Sv4.LJIIIIZZ(this, mo(), new C2217381BqS() { // from class: X.0r6X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1573030r2L) obj).LLILLL;
            }
        }, null, new AwS638S0100000_24(this, 148), 6);
        FeedSkylightListViewModel feedSkylightListViewModelMo = mo();
        AwS603S0100000_24 awS603S0100000_24 = new AwS603S0100000_24(this, 474);
        feedSkylightListViewModelMo.getClass();
        AssemViewModel.selectSubscribe$default(feedSkylightListViewModelMo, C1572090r0p.LL, C736820SvI.LIZLLL(), null, null, new AwS603S0100000_24(awS603S0100000_24, (Function1<? super C1575790r6n, Unit>) 527), 12, null);
        C736680Sv4.LJIIIIZZ(this, mo(), new C2217381BqS() { // from class: X.0r6b
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1573030r2L) obj).LLJ;
            }
        }, null, new AwS638S0100000_24(this, 144), 6);
        C736680Sv4.LJIIIIZZ(this, ho(), new C2217381BqS() { // from class: X.0r6e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1575720r6g) obj).LLILLJJLI;
            }
        }, null, new AwS638S0100000_24(this, 139), 6);
        C736680Sv4.LJIIIIZZ(this, ho(), new C2217381BqS() { // from class: X.0r6i
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1575720r6g) obj).LLILZIL;
            }
        }, null, new AwS628S0100000_14(this, 44), 6);
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLILZIL.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.ao((C1620910sHZ) this.LLJJ.getValue());
        }
        if (oo() && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C343710Ddh.LIZ(c19egLIZIZ).wQ2((InterfaceC1586360rNq) this.LLJJIII.getValue());
        }
        if (!C305290Bxv.LIZIZ() || (homeViewPagerAbility = (HomeViewPagerAbility) this.LLILZLL.getValue()) == null) {
            return;
        }
        homeViewPagerAbility.LLJJI((C1620930sHb) this.LLJJI.getValue());
    }

    public FeedSkylightToolbarIconBridgeAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightContainerViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 90);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, awS568S0100000_24, AFwS264S0000000_24.get$arr$(28), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedSkylightListViewModel.class);
        AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24(this, 95);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(30);
        AwS568S0100000_24 awS568S0100000_243 = new AwS568S0100000_24((AbstractC738140SxQ) this, 101);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJIJIL = new C736950SvV(c19719912DlLIZ2, awS568S0100000_242, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS264S0000000_24, awS568S0100000_243, c451610HnL, c723700Sa8);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(FeedSkylightToolbarIconBridgeViewModel.class);
        AwS568S0100000_24 awS568S0100000_244 = new AwS568S0100000_24(c19719912DlLIZ3, 99);
        AFwS264S0000000_24 aFwS264S0000000_242 = AFwS264S0000000_24.get$arr$(29);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ3);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS568S0100000_244, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((AbstractC738140SxQ) this, 100), aFwS264S0000000_242, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJILJIL = assemVMLazy;
        this.LLJILJILJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 94));
        this.LLJILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(73));
        this.LLJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 103));
        this.LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 104));
        this.LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 89));
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m162do() {
        Iterator it2 = ((Set) this.LLJILLL.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1575770r6l) it2.next()).cancel();
        }
        ((Set) this.LLJILLL.getValue()).clear();
    }

    public final C0QSJ fo() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJJ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJIJIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJIJIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{MainActivityScope.class});
        this.LLJJJ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final FeedSkylightToolbarIconBridgeViewModel ho() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (FeedSkylightToolbarIconBridgeViewModel) assemVMLazy.getValue();
    }

    public final FeedSkylightContainerViewModel ko() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (FeedSkylightContainerViewModel) assemVMLazy.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv lo() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILJILJ.getValue();
    }

    public final FeedSkylightListViewModel mo() {
        return (FeedSkylightListViewModel) this.LLJIJIL.getValue();
    }

    public final boolean oo() {
        return ((Boolean) this.LLIZ.getValue()).booleanValue();
    }

    public final int so() {
        return ((Number) this.LLJ.getValue()).intValue();
    }

    public final StoryToolBarIconAbility uo() {
        return (StoryToolBarIconAbility) this.LLILLJJLI.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        HomeViewPagerAbility homeViewPagerAbility;
        Context context;
        C19EG c19egLIZIZ;
        super.onDestroy();
        m162do();
        C1572230r13.LIZ((List) this.LLIZLLLIL.getValue());
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLILZIL.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.tx0((C1620910sHZ) this.LLJJ.getValue());
        }
        if (oo() && (context = getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C343710Ddh.LIZ(c19egLIZIZ).HQ2((InterfaceC1586360rNq) this.LLJJIII.getValue());
        }
        if (!C305290Bxv.LIZIZ() || (homeViewPagerAbility = (HomeViewPagerAbility) this.LLILZLL.getValue()) == null) {
            return;
        }
        homeViewPagerAbility.b3((C1620930sHb) this.LLJJI.getValue());
    }

    public final boolean vo() {
        String strCt0;
        if (oo()) {
            return true;
        }
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLILZIL.getValue();
        if (homeTabAbility == null || (strCt0 = homeTabAbility.Ct0()) == null) {
            return false;
        }
        return (Intrinsics.LJFF(strCt0, "For You") && so() == 1) || (Intrinsics.LJFF(strCt0, "Following") && so() == 2) || (Intrinsics.LJFF(strCt0, "FRIENDS_FEED") && so() == 0);
    }

    @Override // X.InterfaceC1575850r6t
    public final void Wn(String str, int i, Integer num, EnumC1576350r7h enumC1576350r7h) {
        if (!vo()) {
            return;
        }
        C736680Sv4.LJIJJ(mo(), new AwS603S0100000_24(this, 26));
    }

    public final void bo(String str, String str2, boolean z, boolean z2) {
        HomeTabAbility homeTabAbility;
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        int i;
        InterfaceC1575760r6k interfaceC1575760r6k;
        Pair<Float, Float> pair;
        int[] iArrQQ;
        View view;
        int[] iArrT0;
        String strCt0 = str;
        m162do();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvLo = lo();
        if (viewOnAttachStateChangeListenerC20604515jvLo != null) {
            RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jvLo.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) != -1) {
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                    i = iFindFirstVisibleItemPosition;
                } else {
                    i = iFindFirstVisibleItemPosition + 1;
                }
                Object objFindViewHolderForAdapterPosition = viewOnAttachStateChangeListenerC20604515jvLo.findViewHolderForAdapterPosition(i);
                if (objFindViewHolderForAdapterPosition instanceof InterfaceC1575760r6k) {
                    interfaceC1575760r6k = (InterfaceC1575760r6k) objFindViewHolderForAdapterPosition;
                } else {
                    interfaceC1575760r6k = null;
                }
                int i2 = 0;
                if (interfaceC1575760r6k != null && (iArrT0 = interfaceC1575760r6k.T0()) != null) {
                    pair = new Pair<>(Float.valueOf(iArrT0[0]), Float.valueOf(iArrT0[1]));
                } else {
                    pair = null;
                }
                StoryToolBarIconAbility storyToolBarIconAbilityUo = uo();
                if (storyToolBarIconAbilityUo != null) {
                    storyToolBarIconAbilityUo.Ts2(pair);
                }
                ArrayList arrayList = new ArrayList();
                if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                    while (true) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = viewOnAttachStateChangeListenerC20604515jvLo.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                        if (viewHolderFindViewHolderForAdapterPosition != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                            if (z) {
                                ListProtector.add(arrayList, 0, view);
                            } else {
                                arrayList.add(view);
                            }
                        }
                        if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                            break;
                        } else {
                            iFindFirstVisibleItemPosition++;
                        }
                    }
                }
                StoryToolBarIconAbility storyToolBarIconAbilityUo2 = uo();
                if (storyToolBarIconAbilityUo2 == null || (iArrQQ = storyToolBarIconAbilityUo2.QQ()) == null) {
                    iArrQQ = new int[2];
                }
                long j = ko().getState().LLILLL.LIZ.LJ;
                for (Object obj : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        View view2 = (View) obj;
                        C1581460rFw c1581460rFw = new C1581460rFw(view2, iArrQQ);
                        long j2 = ((long) i3) * 25;
                        if (z) {
                            C786410Ut5.T4(view2, 0.0f);
                            HandlerHook.viewPostDelay(c1581460rFw.LIZIZ, new ARunnableS124S0100000_24(c1581460rFw, 108), j2);
                        } else {
                            HandlerHook.viewPostDelay(c1581460rFw.LIZIZ, new ARunnableS124S0100000_24(c1581460rFw, 107), j2);
                        }
                        ((Set) this.LLJILLL.getValue()).add(c1581460rFw);
                        c1581460rFw.LIZJ = new C1575610r6V(this, c1581460rFw, z, i2, arrayList, j);
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        StoryToolBarIconAbility storyToolBarIconAbilityUo3 = uo();
        if (storyToolBarIconAbilityUo3 != null) {
            if (strCt0 == null && ((homeTabAbility = (HomeTabAbility) this.LLILZIL.getValue()) == null || (strCt0 = homeTabAbility.Ct0()) == null)) {
                strCt0 = "For You";
            }
            storyToolBarIconAbilityUo3.u81(strCt0, str2, z, z2);
            if (!z) {
                storyToolBarIconAbilityUo3.YN();
            }
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
