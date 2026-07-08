package com.ss.android.ugc.aweme.notification.v2.widget;

import X.AnonymousClass0021;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1770850wBP;
import X.C1869670ykn;
import X.C1889530zGp;
import X.C1900870zZ7;
import X.C1900970zZH;
import X.C1900980zZI;
import X.C1901600zaI;
import X.C19252910Tv;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C291001Au;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.EnumC1599580rjA;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
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
import com.ss.android.ugc.aweme.notification.v2.NotificationFragmentV2;
import com.ss.android.ugc.aweme.notification.v2.cell.CreatorSortAndFilterCell;
import com.ss.android.ugc.aweme.notification.v2.cell.CreatorSplitTitleCell;
import com.ss.android.ugc.aweme.notification.v2.cell.NoticePriorityTitleCell;
import com.ss.android.ugc.aweme.notification.v2.cell.NotificationErrorStatusCell;
import com.ss.android.ugc.aweme.notification.v2.cell.TemplateNotificationCell;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.BaseNotificationResultViewModel;
import com.ss.android.ugc.aweme.notification.v2.viewmodel.NotificationFragmentV2ViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationWidget extends InboxWidget implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1869670ykn.class, "notification_result_fragment_model"), checkSupervisorPrepared());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 450));
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NotificationWidget.class, "notificationViewModel", "getNotificationViewModel()Lcom/ss/android/ugc/aweme/notification/v2/viewmodel/NotificationFragmentV2ViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(NotificationWidget.class, "resultViewModel", "getResultViewModel()Lcom/ss/android/ugc/aweme/notification/v2/viewmodel/BaseNotificationResultViewModel;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public NotificationWidget() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NotificationFragmentV2ViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS572S0100000_28(c19719912DlLIZ, 448), AFwS271S0000000_28.get$arr$(194), null, true);
        C019F c019f = C019F.LIZ;
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 447);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BaseNotificationResultViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS572S0100000_28(c19719912DlLIZ2, 449), AFwS271S0000000_28.get$arr$(195), awS572S0100000_28, true);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        return C1697810uHb.LJIIJJI(C13LE.LIZ(C1900970zZH.class), C13LE.LIZ(C1901600zaI.class), C13LE.LIZ(AnonymousClass0021.class), C13LE.LIZ(C1900980zZI.class));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends PowerCell<?>>> fo() {
        return C1697810uHb.LJIIJJI(C13LE.LIZ(TemplateNotificationCell.class), C13LE.LIZ(CreatorSortAndFilterCell.class), C13LE.LIZ(CreatorSplitTitleCell.class), C13LE.LIZ(NotificationErrorStatusCell.class), C13LE.LIZ(NoticePriorityTitleCell.class));
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

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void lo() {
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        String str = (String) this.LLJ.getValue();
        c1889530zGp.getClass();
        C1889530zGp.LIZ(str, "onCreate()");
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0zHH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1900430zYP) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS642S0100000_28(this, 25), 4);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        List<InterfaceC1891350zJl> list;
        List<InterfaceC1891350zJl> list2;
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        String str = (String) this.LLJ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("provideDataList(), itemList = ");
        C291001Au<List<InterfaceC1891350zJl>> c291001Au = Ho().getState().LL;
        sbLIZ.append((c291001Au == null || (list2 = c291001Au.LIZ) == null) ? null : Integer.valueOf(list2.size()));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1889530zGp.getClass();
        C1889530zGp.LIZ(str, strLIZIZ);
        C291001Au<List<InterfaceC1891350zJl>> c291001Au2 = Ho().getState().LL;
        return (c291001Au2 == null || (list = c291001Au2.LIZ) == null) ? C13BV.INSTANCE : list;
    }

    public final BaseNotificationResultViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (BaseNotificationResultViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void LJJIIJ() {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI((String) this.LLJ.getValue(), "onLoadMore()");
        Ho().AQ2();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIL().LJI()) {
            return;
        }
        C1900870zZ7.LIZIZ = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIL().LJI()) {
            return;
        }
        C1900870zZ7.LIZIZ = "new_activities";
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void vo(EnumC1599580rjA enumC1599580rjA) {
        C1889530zGp c1889530zGp = NotificationFragmentV2.LLJILJIL;
        String str = (String) this.LLJ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefresh(), from = ");
        sbLIZ.append(enumC1599580rjA.getDetail());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1889530zGp.getClass();
        C1889530zGp.LIZ(str, strLIZIZ);
        Ho().BQ2(enumC1599580rjA);
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
