package com.ss.android.ugc.aweme.mix.mixdetail;

import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0TNT;
import X.C0TNV;
import X.C0ZP4;
import X.C118300cf;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1250250idj;
import X.C1250300ido;
import X.C1251150ifB;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C338490DOt;
import X.C446780HfY;
import X.C452070Ho5;
import X.C616540OGe;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C985403tE;
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
import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS661S0100000_12;

/* JADX INFO: loaded from: classes19.dex */
public final class MixFeedManagerFragment extends AmeBaseFragment implements InterfaceC724530SbT {
    public static final C446780HfY LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglMWE+ITHELIOS0oLDsyISliBCYrDiApLQIyJiQrLD0VOiQrJCo9PA==";
    public TuxNavBar LL;
    public C0TNT LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public boolean LLILZLL;
    public final long LLIZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0HfY] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixFeedManagerFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mix/mixdetail/viewmodel/MixVideosManageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZLLLIL = new Object() { // from class: X.0HfY
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

    public final MixVideosManageViewModel MR() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (MixVideosManageViewModel) assemVMLazy.getValue();
    }

    public final void OR() {
        C1397580mTM c1397580mTM = new C1397580mTM(getContext());
        c1397580mTM.LJFF(2131830690);
        c1397580mTM.LIZ(2131830689);
        C985403tE.LIZ(c1397580mTM, new AwS597S0100000_18(this, 159));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public MixFeedManagerFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixVideosManageViewModel.class);
        this.LLILLL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS550S0100000_6(c19719912DlLIZ, 481), new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 482), AFwS256S0000000_18.get$arr$(170));
        this.LLILZ = "";
        this.LLILZIL = "";
        this.LLIZ = 300L;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(MixFeedManagerFragment.class.getName());
        }
        super.onResume();
        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new View.OnKeyListener() { // from class: X.0gOO
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 0 && i == 4) {
                    C736680Sv4.LJIJJ(this.LL.MR(), new AwS597S0100000_18(this.LL, 158));
                    return true;
                }
                return false;
            }
        });
    }

    public final void NR(boolean z) {
        Resources resources;
        Resources resources2;
        MR().setState(new AwS32S0010000_18(z, 16));
        C0TNT c0tnt = null;
        if (z) {
            TuxNavBar tuxNavBar = this.LL;
            if (tuxNavBar == null) {
                tuxNavBar = null;
            }
            tuxNavBar.LJJ(AFwS256S0000000_18.get$arr$(195), "cancel_text");
            Context context = getContext();
            if (context != null && (resources2 = context.getResources()) != null) {
                TuxNavBar tuxNavBar2 = this.LL;
                if (tuxNavBar2 == null) {
                    tuxNavBar2 = null;
                }
                C1250250idj c1250250idj = new C1250250idj();
                c1250250idj.LIZJ = resources2.getString(2131833248);
                tuxNavBar2.LJIJJ(c1250250idj);
            }
            TuxNavBar tuxNavBar3 = this.LL;
            if (tuxNavBar3 == null) {
                tuxNavBar3 = null;
            }
            tuxNavBar3.LJJ(AFwS256S0000000_18.get$arr$(196), "done_text");
            TuxNavBar tuxNavBar4 = this.LL;
            if (tuxNavBar4 == null) {
                tuxNavBar4 = null;
            }
            tuxNavBar4.LJJ(AFwS256S0000000_18.get$arr$(175), "back_btn");
        } else {
            TuxNavBar tuxNavBar5 = this.LL;
            if (tuxNavBar5 == null) {
                tuxNavBar5 = null;
            }
            tuxNavBar5.LJJ(AFwS256S0000000_18.get$arr$(176), "cancel_text");
            Context context2 = getContext();
            if (context2 != null && (resources = context2.getResources()) != null) {
                TuxNavBar tuxNavBar6 = this.LL;
                if (tuxNavBar6 == null) {
                    tuxNavBar6 = null;
                }
                C1250250idj c1250250idj2 = new C1250250idj();
                c1250250idj2.LIZJ = resources.getString(2131846232);
                tuxNavBar6.LJIJJ(c1250250idj2);
            }
            TuxNavBar tuxNavBar7 = this.LL;
            if (tuxNavBar7 == null) {
                tuxNavBar7 = null;
            }
            tuxNavBar7.LJJ(AFwS256S0000000_18.get$arr$(177), "done_text");
            TuxNavBar tuxNavBar8 = this.LL;
            if (tuxNavBar8 == null) {
                tuxNavBar8 = null;
            }
            tuxNavBar8.LJJ(AFwS256S0000000_18.get$arr$(178), "back_btn");
        }
        if (z) {
            C0TNT c0tnt2 = this.LLILLJJLI;
            if (c0tnt2 == null) {
                c0tnt2 = null;
            }
            LinearLayout editMixLayout = c0tnt2.getEditMixLayout();
            if (editMixLayout != null) {
                C786410Ut5.LJZL(0, editMixLayout);
            }
            C0TNT c0tnt3 = this.LLILLJJLI;
            if (c0tnt3 != null) {
                c0tnt = c0tnt3;
            }
            TextView removeConfirmView = c0tnt.getRemoveConfirmView();
            if (removeConfirmView != null) {
                C786410Ut5.LLIL(removeConfirmView, 8);
                return;
            }
            return;
        }
        C0TNT c0tnt4 = this.LLILLJJLI;
        if (c0tnt4 == null) {
            c0tnt4 = null;
        }
        LinearLayout editMixLayout2 = c0tnt4.getEditMixLayout();
        if (editMixLayout2 != null) {
            C786410Ut5.LJZL(8, editMixLayout2);
        }
        C0TNT c0tnt5 = this.LLILLJJLI;
        if (c0tnt5 != null) {
            c0tnt = c0tnt5;
        }
        TextView removeConfirmView2 = c0tnt.getRemoveConfirmView();
        if (removeConfirmView2 == null) {
            return;
        }
        C786410Ut5.LLIL(removeConfirmView2, 0);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.ohu);
        this.LL = tuxNavBar;
        C0TNT c0tnt = null;
        if (tuxNavBar == null) {
            tuxNavBar = null;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = false;
        c1251150ifB.LIZIZ = "back_btn";
        c1251150ifB.LJI = false;
        c1251150ifB.LIZJ(new AwS562S0100000_18(this, 581));
        c0om1.LJ(c1251150ifB);
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZJ = getContext().getResources().getString(R.string.f1_);
        c1250300ido.LIZIZ = "cancel_text";
        c1250300ido.LJ = true;
        c1250300ido.LIZ(new AwS562S0100000_18(this, 583));
        c0om1.LJ(c1250300ido);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getContext().getResources().getString(2131833248);
        c1250250idj.LIZIZ = "edit_playlist_text";
        c0om1.LIZJ = c1250250idj;
        C1250300ido c1250300ido2 = new C1250300ido();
        c1250300ido2.LIZJ = getContext().getResources().getString(R.string.hz2);
        c1250300ido2.LJ = false;
        c1250300ido2.LIZIZ = "done_text";
        c0om1.LIZIZ(c1250300ido2);
        tuxNavBar.setNavActions(c0om1);
        TuxNavBar tuxNavBar2 = this.LL;
        if (tuxNavBar2 == null) {
            tuxNavBar2 = null;
        }
        View viewLJII = tuxNavBar2.LJII("done_text");
        if (viewLJII != null && viewLJII.getVisibility() == 0) {
            C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.0gOG
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1163820gOK) obj).LLILZIL;
                }
            }, null, new AwS632S0100000_18(this, 55), 6);
        }
        TuxNavBar tuxNavBar3 = this.LL;
        if (tuxNavBar3 == null) {
            tuxNavBar3 = null;
        }
        View viewLJII2 = tuxNavBar3.LJII("done_text");
        if (viewLJII2 != null) {
            viewLJII2.isEnabled();
        }
        TuxNavBar tuxNavBar4 = this.LL;
        if (tuxNavBar4 == null) {
            tuxNavBar4 = null;
        }
        tuxNavBar4.LJJ(new AwS597S0100000_18(this, 171), "done_text");
        C723850SaN.LIZ(this, false, null, new AwS597S0100000_18(this, 173), 3);
        C0TNT c0tnt2 = (C0TNT) view.findViewById(R.id.oht);
        this.LLILLJJLI = c0tnt2;
        if (c0tnt2 == null) {
            c0tnt2 = null;
        }
        C197039127h removeView = c0tnt2.getRemoveView();
        if (removeView != null) {
            C786410Ut5.U8(removeView, new ACListenerS153S0100000_18(this, 36));
        }
        C0TNT c0tnt3 = this.LLILLJJLI;
        if (c0tnt3 == null) {
            c0tnt3 = null;
        }
        TextView removeConfirmView = c0tnt3.getRemoveConfirmView();
        if (removeConfirmView != null) {
            C786410Ut5.T7(removeConfirmView, new ACListenerS153S0100000_18(this, 37));
        }
        C0TNT c0tnt4 = this.LLILLJJLI;
        if (c0tnt4 != null) {
            c0tnt = c0tnt4;
        }
        C197039127h addVideoView = c0tnt.getAddVideoView();
        if (addVideoView != null) {
            C786410Ut5.U8(addVideoView, new ACListenerS153S0100000_18(this, 38));
        }
        C736680Sv4.LJIIIZ(this, MR(), new C2217381BqS() { // from class: X.0gSr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163820gOK) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0gOI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163820gOK) obj).LL;
            }
        }, null, new AwS661S0100000_12(this, 3), 12);
        C118300cf c118300cf = new C118300cf();
        ((IMixFeedService) ServiceManager.get().getService(IMixFeedService.class)).LJJII();
        c118300cf.element = 100;
        C736680Sv4.LJIIIZ(this, MR(), new C2217381BqS() { // from class: X.0gOP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163820gOK) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0gSs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163820gOK) obj).LLILLJJLI;
            }
        }, null, new C0TNV(this, c118300cf), 12);
        C736680Sv4.LJIIIIZZ(this, MR(), new C2217381BqS() { // from class: X.0gOJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163820gOK) obj).LL;
            }
        }, null, new AwS626S0100000_12(this, 30), 6);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("key_mix_id");
            String str = "";
            if (string == null) {
                string = "";
            }
            this.LLILZ = string;
            String string2 = arguments.getString("enter_from");
            if (string2 != null) {
                str = string2;
            }
            this.LLILZIL = str;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c90, viewGroup, false);
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
