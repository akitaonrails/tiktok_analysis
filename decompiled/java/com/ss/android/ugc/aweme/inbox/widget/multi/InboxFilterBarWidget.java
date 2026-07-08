package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC1903430zdF;
import X.C019F;
import X.C03H5;
import X.C05RV;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1591220rVg;
import X.C1637806bA;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2187701Ajg;
import X.C2217381BqS;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C877920YcI;
import X.C880720Ygo;
import X.C889840YvW;
import X.C889910Yvd;
import X.C889930Yvf;
import X.C890540Ywe;
import X.C890590Ywj;
import X.C914220Ztk;
import X.EnumC880480YgQ;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737790Swr;
import X.ViewTreeObserverOnDrawListenerC890520Ywc;
import X.ViewTreeObserverOnScrollChangedListenerC890530Ywd;
import Y.AObserverS218S0100000_14;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IMessageInboxWidgetAbility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class InboxFilterBarWidget extends InboxWidget implements InterfaceC724530SbT, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public boolean LLJ;
    public C890540Ywe LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InboxFilterBarWidget.class, "filterBarVM", "getFilterBarVM()Lcom/ss/android/ugc/aweme/inbox/widget/multi/InboxFilterBarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InboxFilterBarWidget() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InboxFilterBarViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 1057), AFwS248S0000000_14.get$arr$(298), null, true);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{InboxFragmentScope.class}).unbindAbility(Ho(), InboxAbilityCenter$IInboxImFilterAbility.class);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{InboxFragmentScope.class});
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
        arrayList.add(InboxFragmentScope.class);
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

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void lo() {
        InboxFilterBarViewModel inboxFilterBarViewModelHo = Ho();
        selectSubscribe(inboxFilterBarViewModelHo, new C2217381BqS() { // from class: X.0Yw5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C889840YvW) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0Yw6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C889840YvW) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0Yw3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C889840YvW) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0Yw4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C889840YvW) obj).LLILZ;
            }
        }, C736820SvI.LIZIZ(inboxFilterBarViewModelHo.usedInReusedScene), null, new C914220Ztk(this, 0));
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0Yvb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C889840YvW) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 67), 4);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{InboxFragmentScope.class}).bindAbility(Ho(), InboxAbilityCenter$IInboxImFilterAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        NextLiveData nextLiveDataWc2;
        boolean z = true;
        if (!this.LLJ) {
            this.LLJ = true;
            InboxAbilityCenter$IMessageInboxWidgetAbility inboxAbilityCenter$IMessageInboxWidgetAbility = (InboxAbilityCenter$IMessageInboxWidgetAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InboxAbilityCenter$IMessageInboxWidgetAbility.class, null);
            if (inboxAbilityCenter$IMessageInboxWidgetAbility != null && (nextLiveDataWc2 = inboxAbilityCenter$IMessageInboxWidgetAbility.wc2()) != null) {
                nextLiveDataWc2.observe(this, new AObserverS218S0100000_14(this, 10));
            }
        }
        C889930Yvf c889930Yvf = C889930Yvf.LIZ;
        if (!c889930Yvf.LJIIJJI()) {
            return C13BV.INSTANCE;
        }
        C889840YvW state = Ho().getState();
        C05RV c05rvLIZJ = c889930Yvf.LIZJ();
        List<C889910Yvd> list = state.LL;
        List<C880720Ygo> list2 = state.LLILLJJLI;
        FilterTabType first = state.LLILLL.getFirst();
        boolean zBooleanValue = state.LLILLL.getSecond().booleanValue();
        Set<EnumC880480YgQ> set = state.LLILZ;
        int size = state.LL.size();
        if (C877920YcI.LIZ() && size < 7) {
            z = false;
        }
        return Collections.singletonList(new C890590Ywj(c05rvLIZJ, list, list2, first, set, zBooleanValue, z, false, false));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        return Collections.singletonList(C13LE.LIZ(C890590Ywj.class));
    }

    public final InboxFilterBarViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (InboxFilterBarViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onDestroy() {
        C890540Ywe c890540Ywe;
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        if (C1591220rVg.LIZLLL() && (c890540Ywe = this.LLJI) != null && C1591220rVg.LIZLLL() && (viewTreeObserver = c890540Ywe.LLJI) != null && viewTreeObserver.isAlive()) {
            ViewTreeObserver viewTreeObserver2 = c890540Ywe.LLJI;
            if (viewTreeObserver2 != null) {
                ViewTreeObserverOnScrollChangedListenerC890530Ywd viewTreeObserverOnScrollChangedListenerC890530Ywd = c890540Ywe.LLJILJIL;
                viewTreeObserver2.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC890530Ywd);
                C2187701Ajg.LIZIZ(viewTreeObserver2, viewTreeObserverOnScrollChangedListenerC890530Ywd, ViewTreeObserver.OnScrollChangedListener.class);
            }
            ViewTreeObserver viewTreeObserver3 = c890540Ywe.LLJI;
            if (viewTreeObserver3 != null) {
                ViewTreeObserverOnDrawListenerC890520Ywc viewTreeObserverOnDrawListenerC890520Ywc = c890540Ywe.LLJILJILJ;
                viewTreeObserver3.removeOnDrawListener(viewTreeObserverOnDrawListenerC890520Ywc);
                C2187701Ajg.LIZIZ(viewTreeObserver3, viewTreeObserverOnDrawListenerC890520Ywc, ViewTreeObserver.OnDrawListener.class);
            }
            c890540Ywe.LLJIJIL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void xo(RecyclerView.ViewHolder viewHolder) {
        AbstractC1903430zdF abstractC1903430zdF;
        if ((viewHolder instanceof C890540Ywe) && (abstractC1903430zdF = (AbstractC1903430zdF) viewHolder) != null) {
            abstractC1903430zdF.onAttach();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final RecyclerView.ViewHolder uo(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        InboxFragmentV2 inboxFragmentV2 = null;
        if (!Intrinsics.LJFF(c13iq, C13LE.LIZ(C890590Ywj.class))) {
            return null;
        }
        C890540Ywe c890540Ywe = new C890540Ywe(new ConstraintLayout(viewGroup.getContext()));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI instanceof InboxFragmentV2) {
            inboxFragmentV2 = (InboxFragmentV2) fragmentLJI;
        }
        c890540Ywe.LLILZ = inboxFragmentV2;
        this.LLJI = c890540Ywe;
        return c890540Ywe;
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
