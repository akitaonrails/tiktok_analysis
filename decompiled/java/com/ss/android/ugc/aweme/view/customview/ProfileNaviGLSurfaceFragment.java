package com.ss.android.ugc.aweme.view.customview;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C01GW;
import X.C087J;
import X.C098200Yq;
import X.C0CNO;
import X.C11DL;
import X.C11E6;
import X.C11EA;
import X.C11EC;
import X.C11EF;
import X.C11NJ;
import X.C13P5;
import X.C1634100scq;
import X.C1644460stY;
import X.C1685300txQ;
import X.C1765020w20;
import X.C189200o6;
import X.C19425610zG;
import X.C19426710zR;
import X.C19429110zp;
import X.C19EG;
import X.C19GS;
import X.C20010313Rd;
import X.C201955140j;
import X.C20296414bK;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1635410sex;
import X.InterfaceC1685420txc;
import X.InterfaceC19429510zt;
import X.InterfaceC2032907xn;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import android.R;
import android.os.Bundle;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import com.ss.android.ugc.gamora.recorder.navi.core.MessageReceiverLifecycleImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public abstract class ProfileNaviGLSurfaceFragment extends Fragment implements InterfaceC1171660gay, MessageCenter.Listener {
    public C11NJ LLILLJJLI;
    public C087J LLILLL;
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 579));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 580));

    public abstract C20296414bK NR();

    public abstract int OR();

    public abstract void PR();

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

    public final ProfileNaviEditorViewModel MR() {
        return (ProfileNaviEditorViewModel) this.LLILZ.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C11NJ c11nj = this.LLILLJJLI;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LLILLJJLI = null;
        MessageCenter.removeListener(this);
        MessageCenter.destroy();
        C087J c087j = this.LLILLL;
        if (c087j != null) {
            c087j.LLILLL.g9(c087j);
            C11NJ c11nj2 = c087j.LLILZIL;
            if (c11nj2 != null) {
                c11nj2.dispose();
            }
            c087j.LLILZIL = null;
        }
        this.LLILLL = null;
        super.onDestroyView();
    }

    public final void SR() {
        MR().getClass();
        if (C19429110zp.LIZIZ == null) {
            return;
        }
        String sceneStickerPath = ((ProfileNaviEditorState) MR().hR2()).getSceneStickerPath();
        if (sceneStickerPath == null || sceneStickerPath.length() == 0) {
            MR().nR2(false);
        } else {
            VR(sceneStickerPath);
        }
    }

    public final void UR() {
        InterfaceC19429510zt naviManager;
        C20296414bK c20296414bKNR = NR();
        if (c20296414bKNR != null && (naviManager = c20296414bKNR.getNaviManager()) != null) {
            naviManager.LIZIZ("");
        }
        ProfileNaviEditorViewModel profileNaviEditorViewModelMR = MR();
        profileNaviEditorViewModelMR.getClass();
        profileNaviEditorViewModelMR.setStateImmediate(new AwS41S0010000_29(false, 47));
        C19425610zG.LIZ.clear();
        C19425610zG.LIZIZ = null;
        C20296414bK c20296414bKNR2 = NR();
        if (c20296414bKNR2 != null) {
            c20296414bKNR2.setCamera(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        UR();
        C20296414bK c20296414bKNR = NR();
        if (c20296414bKNR != null) {
            c20296414bKNR.onPause();
        }
        this.LL.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C20296414bK c20296414bKNR = NR();
        if (c20296414bKNR != null) {
            c20296414bKNR.onResume();
        }
        SR();
    }

    public void RR(C11NJ c11nj) {
        c11nj.LIZ(C11EA.LJII(this, MR(), new C2217381BqS() { // from class: X.10zb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileNaviEditorState) obj).getCurrentMessage();
            }
        }, new AwS643S0100000_29(this, 45)));
        c11nj.LIZ(C11EA.LJII(this, MR(), new C2217381BqS() { // from class: X.10ze
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileNaviEditorState) obj).getSceneStickerPath();
            }
        }, new AwS640S0100000_26(this, 68)));
        c11nj.LIZ(C11EA.LJII(this, MR(), new C2217381BqS() { // from class: X.10zZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((ProfileNaviEditorState) obj).getFps());
            }
        }, new AwS643S0100000_29(this, 46)));
        c11nj.LIZ(C11EA.LJII(this, (JediViewModel) this.LLILZIL.getValue(), new C2217371BqR() { // from class: X.0R10
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviSwitcherState) obj).getHasNaviChanged());
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviSwitcherState) obj).setHasNaviChanged(((Boolean) obj2).booleanValue());
            }
        }, new AwS640S0100000_26(this, 69)));
    }

    public final void VR(String str) {
        InterfaceC19429510zt naviManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setting scene sticker path ");
        sbLIZ.append(str);
        C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ));
        C20296414bK c20296414bKNR = NR();
        if (c20296414bKNR != null && (naviManager = c20296414bKNR.getNaviManager()) != null) {
            naviManager.LIZIZ(str);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.10zg] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        final InterfaceC19429510zt naviManager;
        super.onViewCreated(view, bundle);
        C11NJ c11nj = new C11NJ();
        RR(c11nj);
        this.LLILLJJLI = c11nj;
        PR();
        MR().init(requireContext());
        MessageCenter.removeListener(this);
        MessageCenter.setListener(this);
        C20296414bK c20296414bKNR = NR();
        if (c20296414bKNR != null && (naviManager = c20296414bKNR.getNaviManager()) != null) {
            MessageReceiverLifecycleImpl messageReceiverLifecycleImpl = new MessageReceiverLifecycleImpl(getLifecycle());
            ?? r3 = new InterfaceC2032907xn(naviManager) { // from class: X.10zg
                public final InterfaceC19429510zt LIZ;

                {
                    this.LIZ = naviManager;
                }

                @Override // X.InterfaceC2032907xn
                public final void LIZ(int i, long j, long j2, String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sendMessage msgID=");
                    sbLIZ.append(i);
                    sbLIZ.append(", arg1=");
                    sbLIZ.append(j);
                    sbLIZ.append(", arg2=");
                    sbLIZ.append(j2);
                    sbLIZ.append(", msg=");
                    sbLIZ.append(str);
                    C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ));
                    this.LIZ.LJIIL(i, (int) j, (int) j2, str);
                }
            };
            C20010313Rd.LIZ.getClass();
            C087J c087j = new C087J(new C13P5(((InterfaceC1635410sex) C20010313Rd.LIZJ.getValue()).LLJILJILJ()), r3, messageReceiverLifecycleImpl);
            this.LLILLL = c087j;
            c087j.LLILLL.Kq(c087j);
            c087j.LLILZIL = new C11NJ();
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(new ContextThemeWrapper(getActivity(), R.style.Theme.DeviceDefault.NoActionBar.Fullscreen)), OR(), viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(com.zhiliaoapp.musically.R.id.view_tree_saved_state_registry_owner, this);
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
        C0CNO.LIZLLL(0L, new C19426710zR(i, i2, i3, str, this));
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
