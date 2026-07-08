package com.ss.android.ugc.aweme.inbox.followerv2;

import X.C019F;
import X.C03H5;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1273804ye;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C1869660ykm;
import X.C1900970zZH;
import X.C1900980zZI;
import X.C1900990zZJ;
import X.C1901070zZR;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C897970ZKp;
import X.EnumC1599580rjA;
import X.EnumC1889520zGo;
import X.EnumC1900750zYv;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1889460zGi;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.FollowerPageAbilityCenter$IFollowerFragmentAbility;
import com.ss.android.ugc.aweme.notification.v2.cell.FollowRequestCell;
import com.ss.android.ugc.aweme.notification.v2.cell.NoticePriorityTitleCell;
import com.ss.android.ugc.aweme.notification.v2.cell.NotificationEmptyStatusCell;
import com.ss.android.ugc.aweme.notification.v2.cell.NotificationErrorStatusCell;
import com.ss.android.ugc.aweme.notification.v2.cell.TemplateNotificationCell;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowerWidget extends InboxWidget implements InterfaceC724530SbT, InterfaceC1889460zGi {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1869660ykm.class, "notification_follower_fragment_model"), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public EnumC1889520zGo LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FollowerWidget.class, "followerViewModel", "getFollowerViewModel()Lcom/ss/android/ugc/aweme/inbox/followerv2/FollowerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FollowerWidget() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FollowerViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 676), AFwS271S0000000_28.get$arr$(106), null, true);
        this.LLJI = EnumC1889520zGo.COMPLETE;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        return C1697810uHb.LJIIJJI(C13LE.LIZ(C1900970zZH.class), C13LE.LIZ(C1900990zZJ.class), C13LE.LIZ(C1273804ye.class), C13LE.LIZ(C897970ZKp.class), C13LE.LIZ(C1900980zZI.class));
    }

    @Override // X.InterfaceC1889460zGi
    public final void LLLILZLLLI() {
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends PowerCell<?>>> fo() {
        return C1697810uHb.LJIIJJI(C13LE.LIZ(TemplateNotificationCell.class), C13LE.LIZ(FollowRequestCell.class), C13LE.LIZ(NoticePriorityTitleCell.class), C13LE.LIZ(NotificationEmptyStatusCell.class), C13LE.LIZ(NotificationErrorStatusCell.class));
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

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void lo() throws JSONException {
        Integer num;
        Integer num2;
        Ho().asyncSubscribe(new C2217381BqS() { // from class: X.0zYB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900300zYC) obj).LLILLL;
            }
        }, this, C736820SvI.LIZLLL(), new AwS607S0100000_28(this, 79), new AwS572S0100000_28(this, 243), new AwS607S0100000_28(this, 80));
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0zYA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900300zYC) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS642S0100000_28(this, 15), 4);
        FollowerViewModel followerViewModelHo = Ho();
        C1869660ykm c1869660ykm = (C1869660ykm) this.LLIZLLLIL.getValue();
        EnumC1900750zYv enumC1900750zYv = (c1869660ykm == null || (num2 = c1869660ykm.LL) == null || num2.intValue() != 22) ? EnumC1900750zYv.FIRST_REFRESH : EnumC1900750zYv.CHANGE_TAB;
        FollowerPageAbilityCenter$IFollowerFragmentAbility followerPageAbilityCenter$IFollowerFragmentAbility = (FollowerPageAbilityCenter$IFollowerFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FollowerPageAbilityCenter$IFollowerFragmentAbility.class, null);
        followerViewModelHo.zQ2(enumC1900750zYv, followerPageAbilityCenter$IFollowerFragmentAbility != null ? followerPageAbilityCenter$IFollowerFragmentAbility.x70() : Integer.MIN_VALUE);
        FollowerViewModel followerViewModelHo2 = Ho();
        C1869660ykm c1869660ykm2 = (C1869660ykm) this.LLIZLLLIL.getValue();
        followerViewModelHo2.LLJILLL = (c1869660ykm2 == null || (num = c1869660ykm2.LL) == null) ? 21 : num.intValue();
    }

    @Override // X.InterfaceC1889460zGi
    public final void onPageSelected(int i) {
    }

    public final FollowerViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (FollowerViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        return Ho().getState().LL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void LJJIIJ() {
        FollowerViewModel followerViewModelHo = Ho();
        EnumC1900750zYv enumC1900750zYv = EnumC1900750zYv.LOAD_MORE;
        C1901070zZR c1901070zZR = C1901070zZR.LJI;
        c1901070zZR.LIZLLL();
        if (c1901070zZR.LIZ.compareAndSet(0, 1)) {
            C1901070zZR.LJII = false;
            C1901070zZR.LJIIIIZZ = true;
        }
        followerViewModelHo.BQ2(enumC1900750zYv);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final EnumC1889520zGo bo() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void vo(EnumC1599580rjA enumC1599580rjA) throws JSONException {
        EnumC1900750zYv enumC1900750zYv;
        int iX70;
        if (Intrinsics.LJFF(enumC1599580rjA.getDetail(), "change_tab")) {
            enumC1599580rjA.setDetail("");
            enumC1900750zYv = EnumC1900750zYv.CHANGE_TAB;
        } else if (Intrinsics.LJFF(enumC1599580rjA.getDetail(), "update_model")) {
            enumC1599580rjA.setDetail("");
            enumC1900750zYv = EnumC1900750zYv.UPDATE_MODEL;
        } else {
            enumC1900750zYv = EnumC1900750zYv.REFRESH;
        }
        FollowerViewModel followerViewModelHo = Ho();
        FollowerPageAbilityCenter$IFollowerFragmentAbility followerPageAbilityCenter$IFollowerFragmentAbility = (FollowerPageAbilityCenter$IFollowerFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), FollowerPageAbilityCenter$IFollowerFragmentAbility.class, null);
        if (followerPageAbilityCenter$IFollowerFragmentAbility != null) {
            iX70 = followerPageAbilityCenter$IFollowerFragmentAbility.x70();
        } else {
            iX70 = Integer.MIN_VALUE;
        }
        followerViewModelHo.zQ2(enumC1900750zYv, iX70);
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
