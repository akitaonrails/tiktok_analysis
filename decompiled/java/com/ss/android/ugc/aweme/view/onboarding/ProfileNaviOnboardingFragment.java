package com.ss.android.ugc.aweme.view.onboarding;

import X.AbstractC1252750ihl;
import X.C004I;
import X.C01GW;
import X.C036E;
import X.C098200Yq;
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
import X.C19403610vi;
import X.C19404010vm;
import X.C19423210ys;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2217371BqR;
import X.C2344009Gk;
import X.C422660Ghk;
import X.C452501pT;
import X.C497820Jfg;
import X.C786410Ut5;
import X.InterfaceC1171660gay;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC19403810vk;
import X.InterfaceC2217241BqE;
import X.InterfaceC420801kM;
import X.InterfaceC874803bO;
import X.InterfaceC960503pD;
import Y.AAListenerS339S0100000_29;
import Y.ACListenerS163S0100000_29;
import Y.ARunnableS129S0100000_29;
import Y.AsS55S0100000_29;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviOnboardingFragment extends Fragment implements InterfaceC1171660gay, InterfaceC19403810vk {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMlLDh9JysuJi4hHELIOSLCwiLmEDOioqICM2BiQ6IAA9KiotOys6JiIKOy40JSAiPQ==";
    public TuxIconView LL;
    public SmartImageView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public RecyclerView LLILZIL;
    public ConstraintLayout LLILZLL;
    public TuxTextView LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 596));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 597));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 598));
    public boolean LLJIJIL;

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

    public final RecyclerView NR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p3c) : null;
            this.LLILZIL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final TuxTextView OR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.s54) : null;
            this.LLIZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ProfileNaviOnboardingViewModel PR() {
        return (ProfileNaviOnboardingViewModel) this.LLJI.getValue();
    }

    @Override // X.InterfaceC19403810vk
    public final void Nh() {
        C19EG activity = getActivity();
        if (activity != null) {
            try {
                if (C036E.LIZ.LIZIZ()) {
                    ProfileNaviOnboardingViewModel profileNaviOnboardingViewModelPR = PR();
                    profileNaviOnboardingViewModelPR.getClass();
                    profileNaviOnboardingViewModelPR.setStateImmediate(AFwS273S0000000_29.get$arr$(322));
                    profileNaviOnboardingViewModelPR.setStateImmediate(AFwS273S0000000_29.get$arr$(323));
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(R.string.m25);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        SharedPreferences preferences;
        super.onStart();
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p3b) : null;
            this.LL = (TuxIconView) viewFindViewById;
        }
        TuxIconView tuxIconView = (TuxIconView) viewFindViewById;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS163S0100000_29(this, 5));
        }
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/navi_starter_display_image.png"));
        View viewFindViewById2 = this.LLILLJJLI;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            viewFindViewById2 = view2 != null ? view2.findViewById(R.id.p3g) : null;
            this.LLILLJJLI = (SmartImageView) viewFindViewById2;
        }
        c1331670kl3LJI.LJJIJL(viewFindViewById2.getContext());
        View viewFindViewById3 = this.LLILLJJLI;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            viewFindViewById3 = view3 != null ? view3.findViewById(R.id.p3g) : null;
            this.LLILLJJLI = (SmartImageView) viewFindViewById3;
        }
        c1331670kl3LJI.LJJ((SmartImageView) viewFindViewById3);
        C786410Ut5.h3(c1331670kl3LJI);
        C11EA.LJII(this, PR(), new C2217371BqR() { // from class: X.10yz
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileNaviOnboardingState) obj).getOnboardingStepState();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviOnboardingState) obj).setOnboardingStepState((C19424210z2) obj2);
            }
        }, new AwS643S0100000_29(this, 6));
        C11EA.LJII(this, PR(), new C2217371BqR() { // from class: X.10z0
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ProfileNaviOnboardingState) obj).getStarterAvatarList();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviOnboardingState) obj).setStarterAvatarList((List) obj2);
            }
        }, new AwS643S0100000_29(this, 7));
        if (((ProfileNaviOnboardingState) PR().hR2()).getStarterAvatarList() == null) {
            ProfileNaviOnboardingViewModel profileNaviOnboardingViewModelPR = PR();
            C19EG activity = getActivity();
            if (activity == null || (preferences = activity.getPreferences(0)) == null) {
                return;
            }
            profileNaviOnboardingViewModelPR.getClass();
            if (preferences.getBoolean("profile_navi_onboarding_tutorial_shown", true)) {
                profileNaviOnboardingViewModelPR.setState(AFwS273S0000000_29.get$arr$(320));
                profileNaviOnboardingViewModelPR.withState(new AwS608S0100000_29(profileNaviOnboardingViewModelPR, 570));
            } else {
                profileNaviOnboardingViewModelPR.setState(AFwS273S0000000_29.get$arr$(324));
                profileNaviOnboardingViewModelPR.LLILZLL.removeCallbacksAndMessages(null);
                C786410Ut5.LJLIIL(profileNaviOnboardingViewModelPR.LLILZIL, profileNaviOnboardingViewModelPR.LLILZLL, new ARunnableS129S0100000_29(profileNaviOnboardingViewModelPR, 138));
            }
        }
    }

    public final void RR(List<C19404010vm> list) {
        C19403610vi c19403610vi;
        if (!(NR().getAdapter() instanceof C19403610vi) || (c19403610vi = (C19403610vi) NR().getAdapter()) == null) {
            c19403610vi = new C19403610vi(this, true);
            RecyclerView recyclerViewNR = NR();
            if (recyclerViewNR != null) {
                recyclerViewNR.setLayoutManager(new GridLayoutManager(getActivity(), 2));
            }
            RecyclerView recyclerViewNR2 = NR();
            if (recyclerViewNR2 != null) {
                recyclerViewNR2.addItemDecoration(new C422660Ghk(getResources().getDimensionPixelSize(R.dimen.ad6)));
            }
            RecyclerView recyclerViewNR3 = NR();
            if (recyclerViewNR3 != null) {
                recyclerViewNR3.setAdapter(c19403610vi);
            }
            RecyclerView recyclerViewNR4 = NR();
            if (recyclerViewNR4 != null) {
                recyclerViewNR4.addOnScrollListener(new AsS55S0100000_29(this, 5));
            }
            if (getActivity() != null) {
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(NR(), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, C497820Jfg.LIZ(r0), 0.0f));
                objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
                objectAnimatorOfPropertyValuesHolder.addListener(new AAListenerS339S0100000_29(this, 0));
                C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder);
            }
        }
        c19403610vi.LLILLJJLI = list;
        c19403610vi.notifyDataSetChanged();
    }

    public final void UR(boolean z) {
        if (z) {
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(OR(), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f - ((Number) this.LLJ.getValue()).floatValue(), 0.0f));
            objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateDecelerateInterpolator());
            objectAnimatorOfPropertyValuesHolder.setDuration(200L);
            objectAnimatorOfPropertyValuesHolder.addListener(new AAListenerS339S0100000_29(this, 7));
            C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder);
            return;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(OR(), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f, 0.0f - ((Number) this.LLJ.getValue()).floatValue()));
        objectAnimatorOfPropertyValuesHolder2.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfPropertyValuesHolder2.setDuration(200L);
        objectAnimatorOfPropertyValuesHolder2.addListener(new AAListenerS339S0100000_29(this, 8));
        C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder2);
    }

    @Override // X.InterfaceC19403810vk
    public final void rP(C19404010vm c19404010vm) {
        C19423210ys c19423210ys = C19423210ys.LIZ;
        String strValueOf = String.valueOf(c19404010vm.LIZ());
        c19423210ys.getClass();
        C19423210ys.LIZ(strValueOf);
        ProfileNaviOnboardingViewModel profileNaviOnboardingViewModelPR = PR();
        profileNaviOnboardingViewModelPR.getClass();
        profileNaviOnboardingViewModelPR.setState(new AwS608S0100000_29(c19404010vm, 574));
    }

    public static void MR(final TuxTextView tuxTextView, final String str) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(tuxTextView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, -50.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfPropertyValuesHolder.setDuration(300L);
        objectAnimatorOfPropertyValuesHolder.addListener(new Animator.AnimatorListener() { // from class: X.0GeC
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(tuxTextView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, 50.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f));
                objectAnimatorOfPropertyValuesHolder2.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfPropertyValuesHolder2.setDuration(200L);
                TextView textView = tuxTextView;
                if (textView != null) {
                    textView.setText(str);
                }
                C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder2);
            }
        });
        C786410Ut5.Pd(objectAnimatorOfPropertyValuesHolder);
    }

    public final void SR(String str, String str2) {
        View viewFindViewById = this.LLILLL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.p3d);
            } else {
                viewFindViewById = null;
            }
            this.LLILLL = (TuxTextView) viewFindViewById;
        }
        MR((TuxTextView) viewFindViewById, str);
        View view2 = this.LLILZ;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.p3e);
            }
            this.LLILZ = (TuxTextView) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        MR((TuxTextView) view2, str2);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19423210ys.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", C19423210ys.LIZIZ);
        C20684815ws.LJIILLIIL("show_avatar_edit_page", c2344009Gk.LIZ);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f901eha, viewGroup, false);
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
