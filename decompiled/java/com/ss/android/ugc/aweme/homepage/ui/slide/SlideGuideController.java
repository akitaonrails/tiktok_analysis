package com.ss.android.ugc.aweme.homepage.ui.slide;

import X.AnonymousClass0956;
import X.C1295960jpS;
import X.C1569860qxE;
import X.C1580330rE7;
import X.C1600560rkk;
import X.C1600570rkl;
import X.C1720106oR;
import X.C19EG;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C486860J7k;
import X.C743690TFf;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1600580rkm;
import X.InterfaceC1600600rko;
import X.InterfaceC20658015sY;
import X.InterfaceC469360Ias;
import X.ViewOnAttachStateChangeListenerC1620720sHG;
import Y.AObserverS185S0200000_24;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS88S0200000_19;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideController;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS173S1100000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS72S0100100_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SlideGuideController implements InterfaceC469360Ias {
    public final Fragment LL;
    public final LinearLayout LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public View LLILZIL;
    public C1295960jpS LLILZLL;
    public View LLIZ;
    public SlideGuideViewModel LLIZLLLIL;
    public C743690TFf LLJ;
    public C1600560rkk LLJI;
    public boolean LLJIJIL;
    public boolean LLJILLL;
    public Long LLJJ;
    public final ARunnableS119S0100000_19 LLJILJIL = new ARunnableS119S0100000_19(this, 66);
    public final AwS598S0100000_19 LLJILJILJ = new AwS598S0100000_19(this, 168);
    public final C1600570rkl LLJJI = new InterfaceC1600600rko() { // from class: X.0rkl
        @Override // X.InterfaceC1600600rko
        public final void LIZ(AbstractC20656215sG abstractC20656215sG) {
            SlideGuideController slideGuideController = this.LIZ;
            slideGuideController.LIZJ(new AwS568S0100000_24(slideGuideController, 567));
        }
    };
    public final ViewOnAttachStateChangeListenerC1620720sHG LLJJIII = new ViewOnAttachStateChangeListenerC1620720sHG(this, 2);
    public final SlideGuideController$revisitEduLifecycleObserver$1 LLJJIJI = new SlideGuideController$revisitEduLifecycleObserver$1(this);

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public final void LIZIZ() {
        C19EG activity = this.LL.getActivity();
        if (activity == null) {
            LIZJ(new AwS568S0100000_24(this, 566));
            return;
        }
        ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(activity);
        scrollSwitchStateManagerLIZIZ.LL.observe(this.LL, new AObserverS185S0200000_24(scrollSwitchStateManagerLIZIZ, this, 2));
    }

    public final void LIZLLL() {
        LinearLayout linearLayout = this.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(296));
        C786410Ut5.W5(linearLayout, layoutParams);
        View view = this.LLIZ;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(256));
            C786410Ut5.W5(view, layoutParams3);
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.LJLLLLLL(0, tuxTextView);
        TuxTextView tuxTextView2 = this.LLILLL;
        TuxTextView tuxTextView3 = tuxTextView2 != null ? tuxTextView2 : null;
        ViewGroup.LayoutParams layoutParams4 = tuxTextView3.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        layoutParams5.gravity = 49;
        layoutParams5.setMarginStart(0);
        layoutParams5.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        C786410Ut5.W5(tuxTextView3, layoutParams5);
    }

    public final void LJ() {
        HandlerHook.viewRemoveCallbacks(this.LLILLJJLI, this.LLJILJIL);
        this.LLJIJIL = false;
        this.LLILLJJLI.setClickable(true);
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C1295960jpS c1295960jpS = this.LLILZLL;
        if (c1295960jpS != null) {
            c1295960jpS.removeAllAnimatorListeners();
        }
        C1295960jpS c1295960jpS2 = this.LLILZLL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.cancelAnimation();
        }
        C1295960jpS c1295960jpS3 = this.LLILZLL;
        if (c1295960jpS3 != null) {
            C786410Ut5.LJLLLLLL(8, c1295960jpS3);
        }
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            C786410Ut5.LJLLLLLL(8, tuxTextView);
        }
        LIZLLL();
        this.LLJI = null;
    }

    public final void LJFF() {
        if (this.LL.getActivity() == null && this.LLIZLLLIL == null) {
            HandlerHook.viewPost(this.LLILLJJLI, new ARunnableS119S0100000_19(this, 67));
            return;
        }
        final SlideGuideViewModel slideGuideViewModelLIZ = C1569860qxE.LIZ(this.LL.requireActivity());
        slideGuideViewModelLIZ.LLIZLLLIL.observe(this.LL, new Observer() { // from class: X.0rkj
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                boolean z;
                Boolean bool = (Boolean) obj;
                SlideGuideController slideGuideController = this.LL;
                if (!slideGuideController.LLJIJIL) {
                    if (slideGuideController.LLILLJJLI.getVisibility() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!Intrinsics.LJFF(Boolean.valueOf(z), bool)) {
                        if (bool.booleanValue()) {
                            SlideGuideController slideGuideController2 = this.LL;
                            C1600560rkk c1600560rkk = slideGuideController2.LLJI;
                            if (c1600560rkk != null) {
                                c1600560rkk.LLILZLL = false;
                                C786410Ut5.LJLLLLLL(8, c1600560rkk.LL);
                                c1600560rkk.LLILLL.invoke();
                                PopupManager.LIZJ(C1600560rkk.class);
                            } else {
                                slideGuideController2.LJ();
                            }
                            slideGuideController2.LIZLLL();
                            C743690TFf c743690TFf = this.LL.LLJ;
                            if (c743690TFf != null) {
                                c743690TFf.LLILZ = false;
                                C786410Ut5.LJLLLLLL(8, c743690TFf.LL);
                                PopupManager.LIZJ(C743690TFf.class);
                            }
                            SlideGuideController slideGuideController3 = this.LL;
                            String str = slideGuideViewModelLIZ.LLJI;
                            slideGuideController3.getClass();
                            C743690TFf c743690TFf2 = new C743690TFf((InterfaceC20658015sY) slideGuideController3.LL, slideGuideController3.LLILLJJLI, new AwS173S1100000_24(slideGuideController3, str, 19));
                            PopupManager.LJIJI(c743690TFf2, true);
                            slideGuideController3.LLJ = c743690TFf2;
                            return;
                        }
                        C743690TFf c743690TFf3 = this.LL.LLJ;
                        if (c743690TFf3 != null) {
                            if (slideGuideViewModelLIZ.LLJ) {
                                C786410Ut5.LJLLLLLL(8, c743690TFf3.LL);
                                c743690TFf3.getStateWrapper().LIZ();
                            } else {
                                C743690TFf.LJIIL(c743690TFf3.LL, new AwS568S0100000_24(c743690TFf3, 1892), false);
                            }
                        }
                        slideGuideViewModelLIZ.LLJ = false;
                    }
                }
            }
        });
        slideGuideViewModelLIZ.LLILZLL.observe(this.LL, new Observer() { // from class: X.0hh5
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Integer num = (Integer) obj;
                SlideGuideController slideGuideController = this.LL;
                if (!slideGuideController.LLJIJIL) {
                    TuxTextView tuxTextView = slideGuideController.LLILLL;
                    if (tuxTextView == null) {
                        tuxTextView = null;
                    }
                    tuxTextView.setText(num.intValue());
                }
            }
        });
        this.LLIZLLLIL = slideGuideViewModelLIZ;
        LIZJ(new AwS568S0100000_24(this, 568));
    }

    public final void LJII() {
        if (this.LLJILLL) {
            this.LLJILLL = false;
            PopupManager.LJIILL.remove(this.LLJJI);
        }
    }

    public final void LIZ(boolean z) {
        C1600560rkk c1600560rkk = this.LLJI;
        if (c1600560rkk != null) {
            if (z) {
                C786410Ut5.LJLLLLLL(8, c1600560rkk.LL);
                c1600560rkk.LLILLL.invoke();
                c1600560rkk.getStateWrapper().LIZ();
                return;
            }
            C1600560rkk.LJIIL(c1600560rkk.LL, new AwS568S0100000_24(c1600560rkk, 1891), false);
            return;
        }
        LJ();
    }

    public final void LIZJ(Function0<Unit> function0) {
        HandlerHook.viewPost(this.LLILLJJLI, new ARunnableS88S0200000_19(this, function0, 16));
    }

    public final void LJI(EnumC1600580rkm enumC1600580rkm) {
        Long l;
        C19EG activity;
        if (this.LLJI != null) {
            return;
        }
        synchronized (C1580330rE7.LIZ) {
            l = C1580330rE7.LIZJ;
            if (!C1580330rE7.LIZIZ) {
                l = null;
            }
        }
        if (l != null) {
            long jLongValue = l.longValue();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("try show revisit edu guide from ");
            sbLIZ.append(enumC1600580rkm);
            C1720106oR.LJI("SlideGuide", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLILLJJLI.isAttachedToWindow() && this.LL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED) && this.LLILZ != null && this.LLILZIL != null && this.LLILZLL != null && this.LLIZ != null && (activity = this.LL.getActivity()) != null && C486860J7k.LIZIZ(activity).FQ2("page_feed")) {
                SlideGuideViewModel slideGuideViewModel = this.LLIZLLLIL;
                if (slideGuideViewModel != null) {
                    slideGuideViewModel.setVisible(false);
                }
                C743690TFf c743690TFf = this.LLJ;
                if (c743690TFf != null) {
                    c743690TFf.LLILZ = false;
                    C786410Ut5.LJLLLLLL(8, c743690TFf.LL);
                    PopupManager.LIZJ(C743690TFf.class);
                }
                this.LLJ = null;
                C1600560rkk c1600560rkk = new C1600560rkk((InterfaceC20658015sY) this.LL, this.LLILLJJLI, new AwS72S0100100_24(jLongValue, this, 1), new AwS568S0100000_24(this, 569), new AwS72S0100100_24(jLongValue, this, 2));
                this.LLJI = c1600560rkk;
                PopupManager.LJIJI(c1600560rkk, true);
                return;
            }
            return;
        }
        LJII();
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        SlideGuideViewModel slideGuideViewModel = this.LLIZLLLIL;
        if (slideGuideViewModel != null) {
            if (i != 0) {
                if (i == 1) {
                    slideGuideViewModel.LLJILLL = true;
                    return;
                }
                return;
            }
            slideGuideViewModel.LLJILLL = false;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        SlideGuideViewModel slideGuideViewModel = this.LLIZLLLIL;
        if (slideGuideViewModel != null && i >= 0 && i < ((ArrayList) slideGuideViewModel.LLJJI).size()) {
            String str = (String) ListProtector.get(slideGuideViewModel.LLJJI, i);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("observe ");
            sbLIZ.append(str);
            sbLIZ.append(" show!");
            C1720106oR.LJI("SlideGuide", C2188811AlT.LIZIZ(sbLIZ));
            slideGuideViewModel.LLJI = str;
            AnonymousClass0956 anonymousClass0956 = slideGuideViewModel.LLJIJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            AnonymousClass0956 anonymousClass09562 = slideGuideViewModel.LLJILJIL;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            slideGuideViewModel.setVisible(false);
            if (slideGuideViewModel.LLJJIII.contains(str)) {
                if (Intrinsics.LJFF(str, "Following") && slideGuideViewModel.LLJJ == null) {
                    slideGuideViewModel.LLJJ = Boolean.valueOf(slideGuideViewModel.LLJILLL);
                }
                if (slideGuideViewModel.LLJILLL) {
                    slideGuideViewModel.LLJILLL = false;
                    slideGuideViewModel.xQ2(500L, str);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0rkl] */
    public SlideGuideController(Fragment fragment, LinearLayout linearLayout) {
        this.LL = fragment;
        this.LLILLJJLI = linearLayout;
    }
}
