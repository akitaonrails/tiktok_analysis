package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1386160mAw;
import X.C1386470mBR;
import X.C13LE;
import X.C1400330mXn;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1589640rT8;
import X.C1637806bA;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PageViewModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3PageMobComponent extends BasePanelComponent implements InterfaceC724530SbT, IFriendsV3PageMobAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public long LLILZ;
    public long LLILZLL;
    public final AssemVMLazy LLIZ;
    public final C01GW LLIZLLLIL;
    public long LL = -1;
    public long LLILLJJLI = -1;
    public long LLILLL = -1;
    public long LLILZIL = -1;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3PageMobComponent.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3PageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3PageMobComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3PageViewModel.class);
        this.LLIZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 524), AFwS264S0000000_24.get$arr$(157), null, true);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 523));
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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IFriendsV3PageMobAbility.class, null, null);
        }
        C736680Sv4.LJIIIIZZ(this, bo(), new C2217381BqS() { // from class: X.0rGt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0O2L) obj).LL;
            }
        }, null, new AwS638S0100000_24(this, 34), 6);
        C736680Sv4.LJIIIIZZ(this, bo(), new C2217381BqS() { // from class: X.0rGu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0O2L) obj).LLILLJJLI;
            }
        }, null, new AwS638S0100000_24(this, 35), 6);
        C736680Sv4.LJIIIIZZ(this, bo(), new C2217381BqS() { // from class: X.0rGs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0O2L) obj).LLILLL;
            }
        }, null, new AwS638S0100000_24(this, 36), 6);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.IFriendsV3PageMobAbility
    public final FriendsV3PageMobComponent$getDetailLifecycleObserver$1 Or() {
        return new FriendsV3PageMobComponent$getDetailLifecycleObserver$1(this);
    }

    public final FriendsV3PageViewModel bo() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (FriendsV3PageViewModel) assemVMLazy.getValue();
    }

    public final void fo() {
        if (this.LL == -1) {
            this.LL = System.currentTimeMillis();
        }
        if (this.LLILLJJLI == -1) {
            this.LLILLJJLI = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IFriendsV3PageMobAbility.class, null);
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m220do(boolean z) {
        Boolean boolValueOf;
        if (this.LLILZIL != -1) {
            this.LLILZLL += System.currentTimeMillis() - this.LLILZIL;
            this.LLILZIL = -1L;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLJJLI;
        C1386470mBR c1386470mBR = new C1386470mBR();
        c1386470mBR.LJJLIIIJ = String.valueOf(jCurrentTimeMillis);
        c1386470mBR.LJJLJ = C1589640rT8.LIZIZ.S2();
        c1386470mBR.LJJIJL("homepage_friends");
        C1400330mXn.LIZ.getClass();
        C1400330mXn.LIZIZ(c1386470mBR, "homepage_friends");
        c1386470mBR.LJ("detail_page_duration_ms", String.valueOf(this.LLILZLL));
        c1386470mBR.LJ("friends_tab_version", "v3.0");
        FriendsV3FeedListAbility friendsV3FeedListAbility = (FriendsV3FeedListAbility) this.LLIZLLLIL.getValue();
        if (friendsV3FeedListAbility != null) {
            boolValueOf = Boolean.valueOf(friendsV3FeedListAbility.UQ());
        } else {
            boolValueOf = null;
        }
        c1386470mBR.LIZLLL(C1386160mAw.LJIIIIZZ(boolValueOf), "is_empty_page");
        c1386470mBR.LIZLLL(C1386160mAw.LJIIIIZZ(Boolean.valueOf(z)), "is_detail_page");
        c1386470mBR.LJIILJJIL();
        this.LLILLJJLI = -1L;
        this.LLILZIL = -1L;
        this.LLILZLL = 0L;
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
