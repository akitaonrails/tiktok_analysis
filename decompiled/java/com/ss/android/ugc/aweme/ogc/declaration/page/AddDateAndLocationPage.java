package com.ss.android.ugc.aweme.ogc.declaration.page;

import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1576150r7N;
import X.C1576160r7O;
import X.C1576270r7Z;
import X.C1620690sHD;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1576290r7b;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC21503819Do;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
@InterfaceC836760Ws6
public final class AddDateAndLocationPage extends BaseFragment implements InterfaceC724530SbT, InterfaceC21503819Do {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiorKmE3LSYgKDHELIOS0yPCwjJ2EjKSIpZw43LAEtPSoSJiEAJiwyPCwjJx8yLyA=";
    public final AssemVMLazy LLIZ;
    public C1576270r7Z LLIZLLLIL;
    public C1576270r7Z LLJ;
    public C197039127h LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddDateAndLocationPage.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ogc/declaration/page/AddDateAndLocationVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
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

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final AddDateAndLocationVM SR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (AddDateAndLocationVM) assemVMLazy.getValue();
    }

    public AddDateAndLocationPage() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddDateAndLocationVM.class);
        this.LLIZ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS568S0100000_24(c19719912DlLIZ, 823), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 824), AFwS264S0000000_24.get$arr$(244));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS264S0000000_24.get$arr$(243));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object c098200Yq;
        float fFloatValue;
        Object c098200Yq2;
        Serializable serializable;
        super.onViewCreated(view, bundle);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS568S0100000_24(this, 1734));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131838654);
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zn, tuxNavBar.getContext());
        if (numLIZJ != null) {
            tuxNavBar.setNavBackground(numLIZJ.intValue());
        }
        View viewFindViewById = view.findViewById(R.id.dlh);
        Object obj = null;
        if (viewFindViewById != null) {
            try {
                c098200Yq = Float.valueOf(viewFindViewById.getContext().getResources().getDimension(R.dimen.b5));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Float f = (Float) c098200Yq;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zq, viewFindViewById.getContext());
            if (numLIZJ2 != null) {
                gradientDrawable.setColor(numLIZJ2.intValue());
            }
            gradientDrawable.setCornerRadius(fFloatValue);
            viewFindViewById.setBackground(gradientDrawable);
        }
        C1576270r7Z c1576270r7Z = (C1576270r7Z) view.findViewById(R.id.dli);
        c1576270r7Z.setStartIconRes(R.raw.icon_calendar);
        c1576270r7Z.setSubTitle(getString(2131838649));
        c1576270r7Z.setCallback(new InterfaceC1576290r7b() { // from class: X.0r7K
            @Override // X.InterfaceC1576290r7b
            public final void LIZ() {
                this.LIZ.SR().wQ2(C1576210r7T.LIZ);
            }

            @Override // X.InterfaceC1576290r7b
            public final void LJJJLIIL() {
                this.LIZ.SR().wQ2(C1576220r7U.LIZ);
            }
        });
        this.LLIZLLLIL = c1576270r7Z;
        C1576270r7Z c1576270r7Z2 = (C1576270r7Z) view.findViewById(R.id.dln);
        c1576270r7Z2.setStartIconRes(R.raw.icon_map_pin);
        c1576270r7Z2.setSubTitle(getString(2131838651));
        c1576270r7Z2.setCallback(new InterfaceC1576290r7b() { // from class: X.0r7L
            @Override // X.InterfaceC1576290r7b
            public final void LIZ() {
                this.LIZ.SR().wQ2(C1576230r7V.LIZ);
            }

            @Override // X.InterfaceC1576290r7b
            public final void LJJJLIIL() {
                this.LIZ.SR().wQ2(C1576240r7W.LIZ);
            }
        });
        this.LLJ = c1576270r7Z2;
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.cuk);
        C786410Ut5.I7(new C1620690sHD(this, 0), c197039127h);
        this.LLJI = c197039127h;
        AddDateAndLocationVM addDateAndLocationVMSR = SR();
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1735);
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("add_date_and_location_page_enter_param_key");
            } else {
                serializable = null;
            }
            if (serializable instanceof PageEnterParams) {
                c098200Yq2 = (PageEnterParams) serializable;
            } else {
                c098200Yq2 = null;
            }
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj = c098200Yq2;
        }
        addDateAndLocationVMSR.wQ2(new C1576160r7O(new C1576150r7N(awS568S0100000_24, (PageEnterParams) obj)));
        C736680Sv4.LJIIIIZZ(this, addDateAndLocationVMSR, new C2217381BqS() { // from class: X.0r7Q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1576190r7R) obj2).LL;
            }
        }, null, new AwS638S0100000_24(this, 55), 6);
        C736680Sv4.LJIIIIZZ(this, addDateAndLocationVMSR, new C2217381BqS() { // from class: X.0r7S
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1576190r7R) obj2).LLILLJJLI;
            }
        }, null, new AwS638S0100000_24(this, 56), 6);
        C736680Sv4.LJIIIIZZ(this, addDateAndLocationVMSR, new C2217381BqS() { // from class: X.0r7P
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1576190r7R) obj2).LLILLL;
            }
        }, null, new AwS638S0100000_24(this, 167), 6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c8s, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
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
