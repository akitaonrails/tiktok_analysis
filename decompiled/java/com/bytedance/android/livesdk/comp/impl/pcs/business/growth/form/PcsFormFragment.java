package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0KBP;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1217580hn2;
import X.C1218520hoY;
import X.C1218530hoZ;
import X.C1218580hoe;
import X.C1246060iWy;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1727140v2u;
import X.C1734700vF6;
import X.C1734710vF7;
import X.C1734820vFI;
import X.C1734890vFP;
import X.C1734920vFS;
import X.C1770850wBP;
import X.C1826730xdX;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C517520KRi;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1822080xW2;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC517590KRp;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormUxOptSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.vm.IPcsFormVmAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.vm.PcsFormVm;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PcsFormFragment extends BaseFragment implements InterfaceC724530SbT, InterfaceC1822080xW2 {
    public static final C1734920vFS LLILZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzHELIOS8wO2suPDw6JiA/OmE0Oio7PSd9Lio+JGEDKzYKJj0+DjctLiI2JjE=";
    public final AssemVMLazy LL;
    public FrameLayout LLILLJJLI;
    public boolean LLILLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0vFS] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsFormFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/form/vm/PcsFormVm;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZ = new Object() { // from class: X.0vFS
        };
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

    @Override // X.InterfaceC1822080xW2
    public final boolean mJ() {
        return false;
    }

    @Override // X.InterfaceC1822080xW2
    public final void yI() {
    }

    public PcsFormFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsFormVm.class);
        C1217580hn2 c1217580hn2 = new C1217580hn2(c19719912DlLIZ);
        C1734890vFP c1734890vFP = new C1734890vFP();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1217580hn2, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C1218520hoY(this), c1734890vFP, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1217580hn2, new C1218580hoe(this), c1734890vFP, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1217580hn2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1218530hoZ(this), c1734890vFP, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LL = assemVMLazy;
    }

    public final PcsFormVm NR() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        return (PcsFormVm) assemVMLazy.getValue();
    }

    public final void OR() {
        if (this.LLILLL) {
            return;
        }
        InterfaceC517590KRp interfaceC517590KRpLIZ = C1826730xdX.LIZ();
        if (interfaceC517590KRpLIZ != null) {
            interfaceC517590KRpLIZ.LJ(new C0KBP(NR().LL, C2097608Jq.LJIIJ(new Pair("enter_mode", NR().LLJIJIL.LIZLLL), new Pair("ux_opt", String.valueOf(LivePcsFormUxOptSetting.INSTANCE.getValue())))));
        }
        this.LLILLL = true;
    }

    @Override // X.InterfaceC1822080xW2
    public final boolean ad() {
        View view;
        C19EG activity = getActivity();
        if ((activity != null && (view = activity.getCurrentFocus()) != null) || (view = getView()) != null) {
            C1727140v2u.LIZ(view);
        }
        if (Intrinsics.LJFF(NR().getState().LLILLL, C1246060iWy.LIZ)) {
            C1734710vF7.LIZIZ(NR().LLJIJIL, "click", C2097908Jt.LIZJ(new Pair("click_position", "return")));
            return false;
        }
        C1734700vF6.LIZIZ(NR(), "return");
        return false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC517590KRp interfaceC517590KRpLIZ = C1826730xdX.LIZ();
        if (interfaceC517590KRpLIZ != null) {
            int i = NR().LL;
            PcsFormVm pcsFormVmNR = NR();
            C1734820vFI c1734820vFILIZ = C1734700vF6.LIZ(pcsFormVmNR);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("submit_status", pcsFormVmNR.LLJJL.toReportValue());
            linkedHashMap.put("field_count", String.valueOf(c1734820vFILIZ.LIZ));
            linkedHashMap.put("filled_field_count", String.valueOf(c1734820vFILIZ.LIZLLL));
            linkedHashMap.put("required_field_count", String.valueOf(c1734820vFILIZ.LIZIZ));
            linkedHashMap.put("prefilled_field_count", String.valueOf(c1734820vFILIZ.LIZJ));
            linkedHashMap.put("prefill_source", pcsFormVmNR.vQ2());
            linkedHashMap.put("was_edited", pcsFormVmNR.wQ2());
            linkedHashMap.put("enter_mode", pcsFormVmNR.LLJIJIL.LIZLLL);
            linkedHashMap.put("ux_opt", String.valueOf(LivePcsFormUxOptSetting.INSTANCE.getValue()));
            interfaceC517590KRpLIZ.LJIIJJI(new C517520KRi(i, linkedHashMap));
        }
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IPcsFormVmAbility.class, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008c A[PHI: r9
      0x008c: PHI (r9v6 java.lang.String) = (r9v0 java.lang.String), (r9v7 java.lang.String) binds: [B:10:0x008a, B:8:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094 A[PHI: r9
      0x0094: PHI (r9v5 java.lang.String) = (r9v0 java.lang.String), (r9v6 java.lang.String) binds: [B:10:0x008a, B:12:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097 A[PHI: r8 r9
      0x0097: PHI (r8v0 java.lang.String) = (r8v5 java.lang.String), (r8v6 java.lang.String) binds: [B:14:0x0095, B:12:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r9v1 java.lang.String) = (r9v5 java.lang.String), (r9v6 java.lang.String) binds: [B:14:0x0095, B:12:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009f A[PHI: r8 r9
      0x009f: PHI (r8v4 java.lang.String) = (r8v0 java.lang.String), (r8v5 java.lang.String) binds: [B:16:0x009d, B:14:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r9v4 java.lang.String) = (r9v1 java.lang.String), (r9v5 java.lang.String) binds: [B:16:0x009d, B:14:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad A[PHI: r6
      0x00ad: PHI (r6v7 java.lang.String) = (r6v0 java.lang.String), (r6v8 java.lang.String) binds: [B:23:0x00ab, B:21:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5 A[PHI: r6
      0x00b5: PHI (r6v6 java.lang.String) = (r6v0 java.lang.String), (r6v7 java.lang.String) binds: [B:23:0x00ab, B:25:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.PcsFormFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), R.style.zd)), R.layout.hfz, viewGroup, false);
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
