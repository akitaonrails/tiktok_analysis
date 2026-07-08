package com.ss.android.ugc.aweme.offlinemode.ui.bottom;

import X.C01D1;
import X.C03H5;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C12ES;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C19319410i8;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C624670Oen;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC0148002o;
import X.InterfaceC1554640qYg;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.RunnableC514801zW;
import Y.ACListenerS144S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeDetailBottomComponent extends BasePanelComponent implements IDetailBottomProtocol, InterfaceC724530SbT, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final C19319410i8 LLILZLL;
    public final AssemVMLazy LL;
    public View LLILLJJLI;
    public TuxTextView LLILLL;
    public View LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OfflineModeDetailBottomComponent.class, "managerVM", "getManagerVM()Lcom/ss/android/ugc/aweme/offlinemode/viewmodel/OfflineModeManagerVM;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = new C19319410i8("OfflineModeDetailBottomComponent");
    }

    public OfflineModeDetailBottomComponent() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OfflineModeManagerVM.class);
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1380), AFwS240S0000000_9.get$arr$(575), null, true);
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
    public final void onParentViewCreated() {
        View view;
        super.onParentViewCreated();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        this.LLILLJJLI = (fragmentLJI == null || (view = fragmentLJI.getView()) == null) ? null : view.findViewById(R.id.cb7);
        m299do(bo().getState().LLILLJJLI);
        fo(false);
        C736680Sv4.LJIIIIZZ(this, bo(), new C2217381BqS() { // from class: X.0OEY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C616100OEm) obj).LLJILLL;
            }
        }, null, new AwS623S0100000_9(this, 125), 6);
        C736680Sv4.LJIIIIZZ(this, bo(), new C2217381BqS() { // from class: X.0OEX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C616100OEm) obj).LLILLJJLI);
            }
        }, null, new AwS623S0100000_9(this, 126), 6);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        str.getClass();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final void bi2() {
        View view = this.LLILLJJLI;
        if (view == null) {
            return;
        }
        HandlerHook.viewPost(view, new RunnableC514801zW(view, 123));
    }

    public final OfflineModeManagerVM bo() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        return (OfflineModeManagerVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IDetailBottomProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX INFO: renamed from: do, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m299do(int r4) {
        /*
            r3 = this;
            android.view.View r2 = r3.LLILLJJLI
            if (r2 == 0) goto L1e
            if (r4 <= 0) goto L1f
            X.01GW<X.0RGG> r0 = X.C0RGG.LJ
            X.0RGG r1 = X.C586380MzE.LIZ()
            X.0RJN r0 = r3.getPanelContext()
            java.lang.String r0 = X.C1389300mG0.LIZ(r0)
            boolean r0 = r1.LIZIZ(r0)
            if (r0 != 0) goto L1f
            r0 = 0
        L1b:
            X.C786410Ut5.LJLLLLLL(r0, r2)
        L1e:
            return
        L1f:
            r0 = 8
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.offlinemode.ui.bottom.OfflineModeDetailBottomComponent.m299do(int):void");
    }

    public final void fo(boolean z) {
        int i;
        C19319410i8 c19319410i8 = LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchNetMode: ");
        sbLIZ.append(z);
        c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null) {
            c2189821An6.setGoToFypButtonShow(z);
        }
        String string = null;
        if (z) {
            View view = this.LLILZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    string = c19egLIZ.getString(2131838552);
                }
                tuxTextView.setText(string);
                return;
            }
            return;
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            if (C624670Oen.LIZIZ()) {
                i = 4;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 == null) {
            return;
        }
        C19EG c19egLIZ2 = C724240Sb0.LIZ(this);
        if (c19egLIZ2 != null) {
            string = c19egLIZ2.getString(2131838551);
        }
        tuxTextView2.setText(string);
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final View pE2(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dtv, viewGroup, false);
        View viewFindViewById = viewTd.findViewById(R.id.pix);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.width = -2;
        C786410Ut5.W5(viewFindViewById, layoutParams);
        C786410Ut5.I7(new ACListenerS144S0100000_9(this, 82), viewFindViewById);
        this.LLILZ = viewFindViewById;
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.piy);
        tuxTextView.setMaxWidth(((C12ES.LJIIJ(tuxTextView.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) / 2) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, false, 26);
        tuxTextView.setText(2131838548);
        tuxTextView.setTuxFont(102);
        tuxTextView.setMinTextSize(12.0f);
        TuxTextView tuxTextView2 = (TuxTextView) viewTd.findViewById(R.id.pj0);
        String string = null;
        if (tuxTextView2 != null) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            if (c19egLIZ != null) {
                string = c19egLIZ.getString(2131838552);
            }
            tuxTextView2.setText(string);
            tuxTextView2.setMinTextSize(12.0f);
        } else {
            tuxTextView2 = null;
        }
        this.LLILLL = tuxTextView2;
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
