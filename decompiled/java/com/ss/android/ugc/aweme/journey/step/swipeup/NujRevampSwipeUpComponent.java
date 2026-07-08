package com.ss.android.ugc.aweme.journey.step.swipeup;

import X.C10TH;
import X.C10U0;
import X.C12ES;
import X.C1303280k1G;
import X.C1308910kAL;
import X.C1619980sG4;
import X.C1735430vGH;
import X.C1911400zq6;
import X.C1911410zq7;
import X.C1912310zrZ;
import X.C1913090zsp;
import X.C19233310Mh;
import X.C19233810Mm;
import X.C19247010Ro;
import X.C19253210Ty;
import X.C19EG;
import X.C2187451AjH;
import X.C23250099c;
import X.C341901Uj;
import X.C418440Gaw;
import X.C420060GdY;
import X.C426750GoL;
import X.C616540OGe;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC19253310Tz;
import X.InterfaceC1913100zsq;
import Y.AAListenerS338S0100000_28;
import Y.ACListenerS162S0100000_28;
import Y.AObserverS188S0200000_28;
import Y.ARunnableS73S0200000_4;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.BounceInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.step.swipeup.NujRevampViewModel;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class NujRevampSwipeUpComponent extends BaseSwipeUpComponent {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiOjs2HELIOSOGs/PiYjLTA8ZwEmIhcpPy4+OBY7ID82HTUPJiIjJyspJzs=";
    public ConstraintLayout LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public C1303280k1G LLJJIJIL;
    public C1303280k1G LLJJJ;
    public NujRevampViewModel LLJJJIL;
    public AnimatorSet LLJJJJ;
    public AnimatorSet LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public int LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent
    public final void VR() {
    }

    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent
    public final String aS() {
        return "guided_slide_up";
    }

    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent
    public final int getLayoutId() {
        return R.layout.czi;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent
    public final void cS() {
        String strLJ;
        final NujRevampViewModel nujRevampViewModel = (NujRevampViewModel) ViewModelProviders.of(this).get(NujRevampViewModel.class);
        this.LLJJJIL = nujRevampViewModel;
        nujRevampViewModel.getClass();
        C10TH c10thLIZ = C19247010Ro.LIZ();
        if ((c10thLIZ == null || !c10thLIZ.LJIIIIZZ()) && !C1912310zrZ.LIZ()) {
            nujRevampViewModel.vQ2(EnumC19253310Tz.ENTER_PAGE, false);
            return;
        }
        C1911410zq7.LIZ("NujRevampSwipeUp", "Init waiting screen");
        C1913090zsp c1913090zsp = C1913090zsp.LIZ;
        InterfaceC1913100zsq interfaceC1913100zsq = new InterfaceC1913100zsq() { // from class: X.10Tx
            @Override // X.InterfaceC1913100zsq
            public final void LIZIZ() {
                C1911410zq7.LIZ("NujRevampSwipeUp", "Feed ready callback");
                NujRevampViewModel nujRevampViewModel2 = nujRevampViewModel;
                nujRevampViewModel2.getClass();
                C1911410zq7.LIZ("NujRevampSwipeUp", "Timer cancelled");
                C1735430vGH c1735430vGH = nujRevampViewModel2.LLILLJJLI;
                if (c1735430vGH != null) {
                    c1735430vGH.LIZ();
                }
                nujRevampViewModel2.LLILLJJLI = null;
                C1913090zsp.LIZ.getClass();
                ((ArrayList) C1913090zsp.LJIIJJI).clear();
                if (((IPluginService) ServiceManager.get().getService(IPluginService.class)).getDeviceCheckResult().getValue() == 1) {
                    nujRevampViewModel.LL.setValue(new C19253210Ty(null, null, false, true, false, false, false, true, false, false, false, 1911));
                } else {
                    nujRevampViewModel.vQ2(EnumC19253310Tz.SWITCH_PAGE, true);
                }
            }
        };
        c1913090zsp.getClass();
        ((ArrayList) C1913090zsp.LJIIJJI).add(interfaceC1913100zsq);
        MutableLiveData<C19253210Ty> mutableLiveData = nujRevampViewModel.LL;
        C10TH c10thLIZ2 = C19247010Ro.LIZ();
        if (c10thLIZ2 == null || (strLJ = c10thLIZ2.LJ()) == null) {
            strLJ = "";
        }
        mutableLiveData.setValue(new C19253210Ty(strLJ, EnumC19253310Tz.ENTER_PAGE, false, false, false, false, true, false, false, false, C1912310zrZ.LIZ(), 952));
        C10TH c10thLIZ3 = C19247010Ro.LIZ();
        long jLIZ = (c10thLIZ3 != null ? c10thLIZ3.LIZ() : 0L) + 0;
        C1735430vGH c1735430vGH = new C1735430vGH(jLIZ, 100L, new C10U0(jLIZ, nujRevampViewModel, new AwS572S0100000_28(nujRevampViewModel, 283)));
        c1735430vGH.LJFF();
        nujRevampViewModel.LLILLJJLI = c1735430vGH;
    }

    public final void kS() {
        View rootView;
        Integer numLIZJ;
        AnimatorSet animatorSet = this.LLJJJJJIL;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            AnimatorSet animatorSet2 = this.LLJJJJJIL;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            View view = this.LLJI;
            if (view != null) {
                view.clearAnimation();
            }
            this.LLJJJJJIL = null;
            View view2 = this.LLJI;
            if (view2 == null || (rootView = view2.getRootView()) == null) {
                return;
            }
            Context context = getContext();
            rootView.setBackgroundColor((context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) == null) ? 0 : numLIZJ.intValue());
        }
    }

    public final ConstraintLayout mS() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wso) : null;
            this.LLJJIJI = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final C1303280k1G nS() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wsq) : null;
            this.LLJJIJIL = (C1303280k1G) viewFindViewById;
        }
        return (C1303280k1G) viewFindViewById;
    }

    public final TuxTextView oS() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wsu) : null;
            this.LLJJIJIIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        AnimatorSet animatorSet3 = this.LLJJJJ;
        if (animatorSet3 != null && animatorSet3.isRunning() && (animatorSet2 = this.LLJJJJ) != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet4 = this.LLJJJJJIL;
        if (animatorSet4 != null && animatorSet4.isRunning() && (animatorSet = this.LLJJJJJIL) != null) {
            animatorSet.cancel();
        }
        View view = this.LLJI;
        if (view != null) {
            view.clearAnimation();
        }
        super.onDestroyView();
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
    }

    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent
    public final void WR() {
        kS();
        super.WR();
    }

    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent
    public final View ZR() {
        return (View) mS().getParent();
    }

    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent
    public final void dS() {
        kS();
        if (!this.LLJJI && this.LLJJJJLIIL && this.LLJJL) {
            hS(mS(), "click", "c3690", "d9848");
            this.LLJJI = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C1735430vGH c1735430vGH;
        boolean z;
        C1735430vGH c1735430vGH2;
        super.onPause();
        NujRevampViewModel nujRevampViewModel = this.LLJJJIL;
        if (nujRevampViewModel == null || (c1735430vGH = nujRevampViewModel.LLILLJJLI) == null) {
            return;
        }
        synchronized (c1735430vGH) {
            z = c1735430vGH.LLILZLL;
        }
        if (z || (c1735430vGH2 = nujRevampViewModel.LLILLJJLI) == null) {
            return;
        }
        c1735430vGH2.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C1735430vGH c1735430vGH;
        boolean z;
        C1735430vGH c1735430vGH2;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(NujRevampSwipeUpComponent.class.getName());
        }
        super.onResume();
        NujRevampViewModel nujRevampViewModel = this.LLJJJIL;
        if (nujRevampViewModel == null || (c1735430vGH = nujRevampViewModel.LLILLJJLI) == null) {
            return;
        }
        synchronized (c1735430vGH) {
            z = c1735430vGH.LLILZLL;
        }
        if (z || (c1735430vGH2 = nujRevampViewModel.LLILLJJLI) == null) {
            return;
        }
        c1735430vGH2.LJ();
    }

    @Override // com.ss.android.ugc.aweme.journey.step.swipeup.BaseSwipeUpComponent
    public final void gS(View view) {
        float f;
        MutableLiveData<C19253210Ty> mutableLiveData;
        TuxTextView tuxTextViewOS;
        C19233810Mm c19233810Mm = C19233810Mm.LIZ;
        c19233810Mm.getClass();
        if (Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip") && (tuxTextViewOS = oS()) != null) {
            C426750GoL.LJIIIZ(tuxTextViewOS, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76))), null, null, false, 29);
            tuxTextViewOS.setTuxFont(13);
            tuxTextViewOS.LJJJJI(32.0f);
        }
        if (C1911400zq6.LIZ(getContext())) {
            c19233810Mm.getClass();
            if (Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip")) {
                TuxTextView tuxTextViewOS2 = oS();
                if (tuxTextViewOS2 != null) {
                    C426750GoL.LJIIIZ(tuxTextViewOS2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, false, 24);
                    tuxTextViewOS2.setTuxFont(13);
                    tuxTextViewOS2.LJJJJI(24.0f);
                    HandlerHook.viewPost(tuxTextViewOS2, new ARunnableS73S0200000_4(tuxTextViewOS2, nS(), 29));
                }
            } else {
                TuxTextView tuxTextViewOS3 = oS();
                if (tuxTextViewOS3 != null) {
                    C1911400zq6.LIZJ(tuxTextViewOS3, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68))), null);
                    tuxTextViewOS3.setTuxFont(13);
                }
                C1303280k1G c1303280k1GNS = nS();
                if (c1303280k1GNS != null) {
                    C1911400zq6.LJFF(c1303280k1GNS, null, null, -1, Integer.valueOf(R.id.wsu), -1, -1, 15);
                    C1911400zq6.LIZJ(c1303280k1GNS, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(87))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(87))));
                }
            }
        }
        ConstraintLayout constraintLayoutMS = mS();
        c19233810Mm.getClass();
        if (Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip")) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        C786410Ut5.c5(constraintLayoutMS, f);
        C786410Ut5.Y7(mS(), new ACListenerS162S0100000_28(this, 97));
        NujRevampViewModel nujRevampViewModel = this.LLJJJIL;
        if (nujRevampViewModel != null && (mutableLiveData = nujRevampViewModel.LL) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS188S0200000_28(this, view, (ViewPagerBottomSheetBehavior<View>) 8));
        }
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(this, 281);
        c19233810Mm.getClass();
        if (Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip")) {
            awS572S0100000_28.invoke();
        } else {
            C420060GdY.LIZ(mS(), null, true, new AwS572S0100000_28(awS572S0100000_28, 706), 26);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C341901Uj(this, null), 3);
    }

    public final void iS(long j) {
        float f = -C12ES.LIZJ(60.0f, getContext());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJI, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJI());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLJI, (Property<View, Float>) View.TRANSLATION_Y, f, 0.0f);
        objectAnimatorOfFloat2.setDuration(900L);
        objectAnimatorOfFloat2.setInterpolator(new BounceInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(j);
        animatorSet.play(objectAnimatorOfFloat2).after(objectAnimatorOfFloat);
        animatorSet.start();
        int i = this.LLJJLIIIJLLLLLLLZ + 1;
        this.LLJJLIIIJLLLLLLLZ = i;
        if (i < 3) {
            animatorSet.addListener(new AAListenerS338S0100000_28(this, 1));
        }
        this.LLJJJJJIL = animatorSet;
    }

    public final void rS(boolean z) {
        if (!isDetached() && !this.mStatusDestroyed) {
            View viewFindViewById = this.LLJJJ;
            if (viewFindViewById == null) {
                View view = getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.wsj);
                } else {
                    viewFindViewById = null;
                }
                this.LLJJJ = (C1303280k1G) viewFindViewById;
            }
            C1303280k1G c1303280k1G = (C1303280k1G) viewFindViewById;
            if (!z) {
                C786410Ut5.i(c1303280k1G, 8);
                return;
            }
            c1303280k1G.setAnimation("ug_nuj_arrow_tux_lottie.json");
            C786410Ut5.i(c1303280k1G, 0);
            c1303280k1G.setRepeatMode(1);
            c1303280k1G.setRepeatCount(-1);
            c1303280k1G.playAnimation();
        }
    }

    public final void qS(C19253210Ty c19253210Ty, long j) {
        View rootView;
        if (c19253210Ty.LJFF) {
            View view = this.LLJI;
            if (view != null && (rootView = view.getRootView()) != null) {
                rootView.setBackgroundColor(-16777216);
                C19EG activity = getActivity();
                if (activity != null) {
                    TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(activity, ImmersionBar.LJIILJJIL(activity));
                    tuxImmersionBar.LIZJ(true, false);
                    tuxImmersionBar.LIZLLL();
                }
            }
            iS(j);
        }
    }
}
