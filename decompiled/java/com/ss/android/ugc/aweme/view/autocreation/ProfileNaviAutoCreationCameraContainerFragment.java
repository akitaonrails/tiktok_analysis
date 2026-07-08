package com.ss.android.ugc.aweme.view.autocreation;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C01GW;
import X.C098200Yq;
import X.C0CNO;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1389890mGx;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1765020w20;
import X.C189200o6;
import X.C19428710zl;
import X.C19EG;
import X.C19GS;
import X.C20010313Rd;
import X.C20296414bK;
import X.C2217381BqS;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1338240kve;
import X.EnumC1448830no1;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1649610t1r;
import X.InterfaceC1685420txc;
import X.InterfaceC19429510zt;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import X.ViewOnTouchListenerC1649580t1o;
import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviAutoCreationCameraContainerFragment extends Fragment implements InterfaceC1171660gay, InterfaceC1649610t1r, MessageCenter.Listener {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMlLDh9KTA4JiwhLSQ4ICA9ZhU+HELIOSJik6JCACKDk6CTA4JgwhLSQ4ICA9CyQhLD0yCyoiPS46JiA+Dz0yLygpJzs=";
    public C20296414bK LL;
    public SmartImageView LLILLJJLI;
    public ViewOnTouchListenerC1649580t1o LLILLL;
    public TuxIconView LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 574));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 575));

    @Override // X.InterfaceC1649610t1r
    public final /* synthetic */ void Kf() {
    }

    @Override // X.InterfaceC1649610t1r
    public final void Lk() {
    }

    @Override // X.InterfaceC1649610t1r
    public final boolean O0() {
        return false;
    }

    @Override // X.InterfaceC1649610t1r
    public final void Q2() {
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.InterfaceC1649610t1r
    public final boolean ja() {
        return false;
    }

    @Override // X.InterfaceC1649610t1r
    public final void oH() {
    }

    @Override // X.InterfaceC1649610t1r
    public final void p2() {
    }

    @Override // X.InterfaceC1649610t1r
    public final void rO(float f) {
    }

    @Override // X.InterfaceC1649610t1r
    public final /* synthetic */ void y2(EnumC1448830no1 enumC1448830no1) {
    }

    public final ViewOnTouchListenerC1649580t1o MR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.s3d) : null;
            this.LLILLL = (ViewOnTouchListenerC1649580t1o) viewFindViewById;
        }
        return (ViewOnTouchListenerC1649580t1o) viewFindViewById;
    }

    public final C20296414bK NR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.s3f) : null;
            this.LL = (C20296414bK) viewFindViewById;
        }
        return (C20296414bK) viewFindViewById;
    }

    @Override // X.InterfaceC1649610t1r
    public final void bw() {
        InterfaceC19429510zt naviManager;
        InterfaceC19429510zt naviManager2;
        InterfaceC19429510zt naviManager3;
        C20296414bK c20296414bKNR = NR();
        if (c20296414bKNR != null && (naviManager3 = c20296414bKNR.getNaviManager()) != null) {
            naviManager3.LJIIL(66671, 1, 0, "");
        }
        C20296414bK c20296414bKNR2 = NR();
        if (c20296414bKNR2 != null && (naviManager2 = c20296414bKNR2.getNaviManager()) != null) {
            naviManager2.LJIIL(66672, 1, 0, "");
        }
        C20296414bK c20296414bKNR3 = NR();
        if (c20296414bKNR3 == null || (naviManager = c20296414bKNR3.getNaviManager()) == null) {
            return;
        }
        naviManager.LJIIL(66673, 2, 0, "");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        MessageCenter.removeListener(this);
        InterfaceC19429510zt naviManager = NR().getNaviManager();
        if (naviManager != null) {
            naviManager.LIZIZ("");
        }
        InterfaceC19429510zt naviManager2 = NR().getNaviManager();
        if (naviManager2 != null) {
            naviManager2.LJIJI(false);
        }
        NR().setCamera(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        InterfaceC19429510zt naviManager;
        super.onStart();
        MessageCenter.setListener(this);
        if (getContext() != null && (naviManager = NR().getNaviManager()) != null) {
            C20010313Rd c20010313Rd = C20010313Rd.LIZ;
            Context context = getContext();
            c20010313Rd.getClass();
            naviManager.LJIIJ(C20010313Rd.LIZIZ(context).getResourceFinder());
        }
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/navi_avatar_outline.png"));
        c1331670kl3LJI.LJJIJL(getContext());
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.s3b) : null;
            this.LLILLJJLI = (SmartImageView) viewFindViewById;
        }
        c1331670kl3LJI.LJJ((SmartImageView) viewFindViewById);
        c1331670kl3LJI.LJJ = EnumC1338240kve.FIT_CENTER;
        C786410Ut5.h3(c1331670kl3LJI);
        MR().LL = true;
        MR().LJIIJJI(1, true);
        MR().LJIIL();
        MR().setRecordListener(this);
        View view2 = this.LLILZ;
        if (view2 == null) {
            View view3 = getView();
            View viewFindViewById2 = view3 != null ? view3.findViewById(R.id.s3a) : null;
            this.LLILZ = (TuxIconView) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        C786410Ut5.a9((TuxIconView) view2, new ACListenerS163S0100000_29(this, 322));
        C11EA.LJII(this, (JediViewModel) this.LLILZLL.getValue(), new C2217381BqS() { // from class: X.10zU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileNaviEditorState) obj).getScanStickerPath();
            }
        }, new AwS643S0100000_29(this, 183));
    }

    public final void OR(int i) {
        C19EG activity = getActivity();
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ProfileNaviEditorViewModel) this.LLILZLL.getValue()).nR2(true);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.egs, viewGroup, false);
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

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        C0CNO.LIZLLL(0L, new C19428710zl(i, i2, this, str));
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
