package com.bytedance.android.livesdk.shorttouch.ui;

import X.AbstractC1101760emE;
import X.C0GY9;
import X.C1078580eAq;
import X.C1100170ejf;
import X.C1101610elz;
import X.C1101640em2;
import X.C1101690em7;
import X.C1101750emD;
import X.C1101820emK;
import X.C1101840emM;
import X.C1101970emZ;
import X.C1102000emc;
import X.C1161920gLG;
import X.C1954807lC;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC1101430elh;
import X.EnumC1101860emO;
import X.InterfaceC1101890emR;
import X.InterfaceC1101940emW;
import X.InterfaceC1294060jmO;
import X.InterfaceC1749600vd8;
import X.InterfaceC482090IvP;
import Y.AAListenerS274S0200000_26;
import Y.ALAdapterS0S0310000_17;
import Y.ALAdapterS12S0200000_17;
import Y.ALAdapterS7S0300000_17;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.unityanimation.service.IUnityAnimationService;
import com.bytedance.android.livesdk.dataChannel.ShortTouchPreviewViewAddedEvent;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchBigCardMarginSetting;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchBigCardOptExitTimeSetting;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchBigCardOptSetting;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchBigCardOptTimeSetting;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchBigCardOptWhiteListSetting;
import com.bytedance.android.livesdk.shorttouch.ui.PortraitShortTouchPreviewWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public final class PortraitShortTouchPreviewWidget extends ShortTouchPreviewWidget {
    public ViewGroup LL;
    public InterfaceC1101940emW LLILLJJLI;
    public Animator LLILLL;
    public int LLILZ = -1;
    public boolean LLILZIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hme;
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchPreviewWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchPreviewWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        IPTFService iPTFService;
        Animator animator;
        super.onUnload();
        InterfaceC1101940emW interfaceC1101940emW = this.LLILLJJLI;
        if (interfaceC1101940emW != null && interfaceC1101940emW.isRunning()) {
            interfaceC1101940emW.LIZIZ();
        }
        Animator animator2 = this.LLILLL;
        if (animator2 != null && animator2.isRunning() && (animator = this.LLILLL) != null) {
            animator.cancel();
        }
        hide();
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        if (!LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getEnableShortTouchAnim() || C500260Jjc.LJIIZILJ(this.dataChannel) || (iPTFService = (IPTFService) C1161920gLG.LIZJ(IPTFService.class)) == null) {
            return;
        }
        iPTFService.ph1(EnumC1101430elh.SHORT_TOUCH_ANIM);
    }

    public final void A1(int i) {
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (i >= 0 && LiveShortTouchBigCardOptSetting.INSTANCE.enable() && (view = getView()) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = i;
            }
            C786410Ut5.W5(view, layoutParams);
        }
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchPreviewWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        ViewGroup viewGroup;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = getView();
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        this.LL = viewGroup;
        View view2 = getView();
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i = marginLayoutParams.topMargin;
            } else {
                i = -1;
            }
            this.LLILZ = i;
        }
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchPreviewWidget, com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IPTFService iPTFService;
        super.onLoad(objArr);
        if (!LiveShortTouchBigCardOptSetting.INSTANCE.enable()) {
            hide();
        }
        if (LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getEnableShortTouchAnim() && !C500260Jjc.LJIIZILJ(this.dataChannel) && (iPTFService = (IPTFService) C1161920gLG.LIZJ(IPTFService.class)) != null) {
            iPTFService.FA2(EnumC1101430elh.SHORT_TOUCH_ANIM, new InterfaceC482090IvP() { // from class: X.0emV
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC482090IvP
                public final void LIZ(C0IS4 c0is4) {
                    boolean z;
                    PortraitShortTouchPreviewWidget portraitShortTouchPreviewWidget = this.LIZ;
                    if (((Number) c0is4.LIZ).intValue() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    portraitShortTouchPreviewWidget.LLILZIL = z;
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchPreviewWidget, X.InterfaceC1101990emb
    @InterfaceC1294060jmO
    public final void p1(final C1101970emZ c1101970emZ) {
        Room roomLJJLIIIIJ;
        Function1<Animator.AnimatorListener, Unit> function1LIZ;
        Function1<Animator.AnimatorListener, Unit> function1LIZ2;
        C1101610elz c1101610elz = C1102000emc.LIZ;
        final C1101640em2 c1101640em2LIZJ = c1101610elz.LIZJ(EnumC1101860emO.ID, c1101970emZ.LIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMessage");
        sbLIZ.append(c1101640em2LIZJ);
        C20441214yg.LIZIZ("MainFrame#Short", C2188811AlT.LIZIZ(sbLIZ));
        if (c1101640em2LIZJ != null) {
            int i = C1101690em7.LIZ[c1101970emZ.LIZ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    x1(c1101970emZ);
                    return;
                }
                throw new C1954807lC();
            }
            if (this.LLILZIL) {
                x1(c1101970emZ);
                return;
            }
            if (c1101640em2LIZJ.LIZIZ == null) {
                x1(c1101970emZ);
                return;
            }
            String str = c1101640em2LIZJ.LJ;
            DataChannel dataChannel = this.dataChannel;
            int[] iArrR = null;
            if (dataChannel != null) {
                roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
            } else {
                roomLJJLIIIIJ = null;
            }
            if (C1078580eAq.LIZJ(roomLJJLIIIIJ, dataChannel, str) && z1(c1101640em2LIZJ.LJ)) {
                ViewGroup viewGroup = this.LL;
                if (viewGroup != null) {
                    C786410Ut5.LJJJJI(viewGroup);
                }
                c1101640em2LIZJ.LIZIZ.LJLJL();
                x1(c1101970emZ);
                return;
            }
            attachAndShow();
            View viewLLLILZJ = c1101640em2LIZJ.LIZIZ.LLLILZJ();
            final ViewGroup viewGroup2 = this.LL;
            if (viewGroup2 == null) {
                return;
            }
            try {
                C786410Ut5.LJJJJI(viewGroup2);
                int iVr = c1101640em2LIZJ.LIZIZ.Vr();
                ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                if (iVr > 0) {
                    layoutParams.height = iVr;
                } else {
                    layoutParams.height = -2;
                }
                C786410Ut5.X5(layoutParams, viewGroup2);
                viewGroup2.addView(viewLLLILZJ);
                C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(c1101640em2LIZJ.LIZ.Sr());
                if (c1101820emKLIZIZ != null) {
                    c1101820emKLIZIZ.LJIJI = true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1101820emK c1101820emKLIZIZ2 = C1101750emD.LIZIZ(c1101640em2LIZJ.LIZ.Sr());
            if (c1101820emKLIZIZ2 != null) {
                c1101820emKLIZIZ2.LJ = System.currentTimeMillis();
            }
            InterfaceC1101890emR interfaceC1101890emR = C1102000emc.LIZ.LJIIIZ;
            if (interfaceC1101890emR != null) {
                iArrR = interfaceC1101890emR.r(c1101640em2LIZJ.LJ);
            }
            if (LiveShortTouchBigCardOptSetting.INSTANCE.enable() && c1101640em2LIZJ.LIZIZ.Ur() && iArrR != null && LiveShortTouchBigCardOptWhiteListSetting.contains(c1101640em2LIZJ.LJ)) {
                final boolean zShowWhenStartExit = LiveShortTouchBigCardOptExitTimeSetting.INSTANCE.showWhenStartExit();
                A1((int) C497740JfY.LIZIZ(LiveShortTouchBigCardMarginSetting.INSTANCE.marginDp()));
                InterfaceC1101940emW interfaceC1101940emWTr = c1101640em2LIZJ.LIZIZ.Tr(viewGroup2, true);
                this.LLILLJJLI = interfaceC1101940emWTr;
                if (interfaceC1101940emWTr != null && (function1LIZ2 = interfaceC1101940emWTr.LIZ()) != null) {
                    function1LIZ2.invoke(new AnimatorListenerAdapter() { // from class: X.0emF
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                            Room roomLJJLIIIIJ2;
                            super.onAnimationCancel(animator);
                            C1101820emK c1101820emKLIZIZ3 = C1101750emD.LIZIZ(c1101640em2LIZJ.LIZ.Sr());
                            if (c1101820emKLIZIZ3 != null) {
                                PortraitShortTouchPreviewWidget portraitShortTouchPreviewWidget = this.LL;
                                C1101640em2 c1101640em2 = c1101640em2LIZJ;
                                c1101820emKLIZIZ3.LJFF = System.currentTimeMillis();
                                c1101820emKLIZIZ3.LJIIJJI = -1L;
                                c1101820emKLIZIZ3.LJIILLIIL = -1;
                                DataChannel dataChannel2 = portraitShortTouchPreviewWidget.dataChannel;
                                if (dataChannel2 != null) {
                                    roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(dataChannel2);
                                } else {
                                    roomLJJLIIIIJ2 = null;
                                }
                                C1101750emD.LIZJ(c1101820emKLIZIZ3, dataChannel2, roomLJJLIIIIJ2, null);
                                C1101750emD.LJI(c1101640em2);
                            }
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            PortraitShortTouchPreviewWidget portraitShortTouchPreviewWidget = this.LL;
                            C1101640em2 c1101640em2 = c1101640em2LIZJ;
                            portraitShortTouchPreviewWidget.LLILLL = portraitShortTouchPreviewWidget.y1(c1101640em2.LJ, new ALAdapterS0S0310000_17(c1101640em2, zShowWhenStartExit, portraitShortTouchPreviewWidget, c1101970emZ, 0));
                            Animator animator2 = this.LL.LLILLL;
                            if (animator2 != null) {
                                animator2.start();
                            }
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            super.onAnimationStart(animator);
                            viewGroup2.setPivotX(0.0f);
                            viewGroup2.setPivotY(0.0f);
                        }
                    });
                }
            } else {
                A1(this.LLILZ);
                InterfaceC1101940emW interfaceC1101940emWTr2 = c1101640em2LIZJ.LIZIZ.Tr(viewGroup2, false);
                this.LLILLJJLI = interfaceC1101940emWTr2;
                if (interfaceC1101940emWTr2 != null && (function1LIZ = interfaceC1101940emWTr2.LIZ()) != null) {
                    function1LIZ.invoke(new ALAdapterS7S0300000_17(c1101970emZ, this, c1101640em2LIZJ, 1));
                }
            }
            ((IUnityAnimationService) C1161920gLG.LIZJ(IUnityAnimationService.class)).lN1(this.dataChannel, c1101640em2LIZJ.LJ, new InterfaceC1749600vd8() { // from class: X.0emU
                @Override // X.InterfaceC1749600vd8
                public final void LIZ() {
                    this.LIZ.show();
                    InterfaceC1101940emW interfaceC1101940emW = this.LIZ.LLILLJJLI;
                    if (interfaceC1101940emW != null) {
                        interfaceC1101940emW.LIZJ();
                    }
                }

                @Override // X.InterfaceC1749600vd8
                public final void LIZIZ(AAListenerS274S0200000_26 aAListenerS274S0200000_26) {
                    Function1<Animator.AnimatorListener, Unit> function1LIZ3;
                    InterfaceC1101940emW interfaceC1101940emW = this.LIZ.LLILLJJLI;
                    if (interfaceC1101940emW != null && (function1LIZ3 = interfaceC1101940emW.LIZ()) != null) {
                        function1LIZ3.invoke(aAListenerS274S0200000_26);
                    }
                }
            });
            this.dataChannel.LC0(ShortTouchPreviewViewAddedEvent.class, viewGroup2);
            return;
        }
        c1101610elz.LJ();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ba, code lost:
    
        if (r17.equals("shortTouchEcommerceLuckyBag") != false) goto L62;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z1(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.shorttouch.ui.PortraitShortTouchPreviewWidget.z1(java.lang.String):boolean");
    }

    @Override // X.InterfaceC1102010emd
    public final void O0(AbstractC1101760emE abstractC1101760emE, final C1101840emM c1101840emM) {
        Function1<Animator.AnimatorListener, Unit> function1LIZ;
        Function1<Animator.AnimatorListener, Unit> function1LIZ2;
        attachAndShow();
        View viewLJFF = abstractC1101760emE.LJFF();
        if (viewLJFF != null) {
            if (this.LLILZIL) {
                c1101840emM.LIZIZ(false, this.isDestroyed);
                c1101840emM.LIZLLL(this.isDestroyed);
                return;
            }
            String strLJIILL = abstractC1101760emE.LJIILL();
            DataChannel dataChannel = this.dataChannel;
            Room roomLJJLIIIIJ = null;
            if (dataChannel != null) {
                roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
            }
            if (C1078580eAq.LIZJ(roomLJJLIIIIJ, dataChannel, strLJIILL)) {
                String strLJIILL2 = abstractC1101760emE.LJIILL();
                if (strLJIILL2 == null) {
                    strLJIILL2 = "";
                }
                if (z1(strLJIILL2)) {
                    ViewGroup viewGroup = this.LL;
                    if (viewGroup != null) {
                        C786410Ut5.LJJJJI(viewGroup);
                    }
                    c1101840emM.LIZIZ(false, this.isDestroyed);
                    c1101840emM.LIZLLL(this.isDestroyed);
                    return;
                }
            }
            ViewGroup viewGroup2 = this.LL;
            if (viewGroup2 != null) {
                try {
                    C786410Ut5.LJJJJI(viewGroup2);
                    int iLJIIL = abstractC1101760emE.LJIIL();
                    ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                    if (iLJIIL > 0) {
                        layoutParams.height = iLJIIL;
                    } else {
                        layoutParams.height = -2;
                    }
                    if (abstractC1101760emE instanceof C1100170ejf) {
                        layoutParams.height = (int) C497740JfY.LIZIZ(72.0f);
                        layoutParams.width = (int) C497740JfY.LIZIZ(72.0f);
                    }
                    C786410Ut5.X5(layoutParams, viewGroup2);
                    viewGroup2.addView(viewLJFF);
                    C1101820emK c1101820emKLIZIZ = C1101750emD.LIZIZ(abstractC1101760emE.LJII());
                    if (c1101820emKLIZIZ != null) {
                        c1101820emKLIZIZ.LJIJI = true;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1101820emK c1101820emKLIZIZ2 = C1101750emD.LIZIZ(abstractC1101760emE.LJII());
                if (c1101820emKLIZIZ2 != null) {
                    c1101820emKLIZIZ2.LJ = System.currentTimeMillis();
                }
                if (LiveShortTouchBigCardOptSetting.INSTANCE.enable() && abstractC1101760emE.LIZLLL() && LiveShortTouchBigCardOptWhiteListSetting.contains(abstractC1101760emE.LJIILL())) {
                    this.LLILLJJLI = abstractC1101760emE.LIZ(viewGroup2, true);
                    A1((int) C497740JfY.LIZIZ(LiveShortTouchBigCardMarginSetting.INSTANCE.marginDp()));
                    InterfaceC1101940emW interfaceC1101940emW = this.LLILLJJLI;
                    if (interfaceC1101940emW != null && (function1LIZ2 = interfaceC1101940emW.LIZ()) != null) {
                        function1LIZ2.invoke(new ALAdapterS7S0300000_17(c1101840emM, this, abstractC1101760emE, 9));
                    }
                } else {
                    this.LLILLJJLI = abstractC1101760emE.LIZ(viewGroup2, false);
                    A1(this.LLILZ);
                    InterfaceC1101940emW interfaceC1101940emW2 = this.LLILLJJLI;
                    if (interfaceC1101940emW2 != null && (function1LIZ = interfaceC1101940emW2.LIZ()) != null) {
                        function1LIZ.invoke(new ALAdapterS7S0300000_17(c1101840emM, this, abstractC1101760emE, 10));
                    }
                }
                ((IUnityAnimationService) C1161920gLG.LIZJ(IUnityAnimationService.class)).lN1(this.dataChannel, abstractC1101760emE.LJIILL(), new InterfaceC1749600vd8() { // from class: X.0emT
                    @Override // X.InterfaceC1749600vd8
                    public final void LIZ() {
                        this.LIZ.show();
                        c1101840emM.LIZ();
                        InterfaceC1101940emW interfaceC1101940emW3 = this.LIZ.LLILLJJLI;
                        if (interfaceC1101940emW3 != null) {
                            interfaceC1101940emW3.LIZJ();
                        }
                    }

                    @Override // X.InterfaceC1749600vd8
                    public final void LIZIZ(AAListenerS274S0200000_26 aAListenerS274S0200000_26) {
                        Function1<Animator.AnimatorListener, Unit> function1LIZ3;
                        InterfaceC1101940emW interfaceC1101940emW3 = this.LIZ.LLILLJJLI;
                        if (interfaceC1101940emW3 != null && (function1LIZ3 = interfaceC1101940emW3.LIZ()) != null) {
                            function1LIZ3.invoke(aAListenerS274S0200000_26);
                        }
                    }
                });
                return;
            }
        }
        c1101840emM.LIZIZ(false, this.isDestroyed);
        c1101840emM.LIZLLL(this.isDestroyed);
    }

    public final Animator y1(String str, AnimatorListenerAdapter animatorListenerAdapter) {
        int[] iArrR;
        InterfaceC1101890emR interfaceC1101890emR = C1102000emc.LIZ.LJIIIZ;
        if (interfaceC1101890emR != null && (iArrR = interfaceC1101890emR.r(str)) != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            long jDuration = LiveShortTouchBigCardOptTimeSetting.INSTANCE.duration();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.SCALE_X, 1.0f, 0.3f);
            objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.25f, 1.0f, 0.5f, 1.0f));
            objectAnimatorOfFloat.setDuration(jDuration);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.SCALE_Y, 1.0f, 0.3f);
            objectAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.25f, 1.0f, 0.5f, 1.0f));
            objectAnimatorOfFloat2.setDuration(jDuration);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.25f, 1.0f, 0.5f, 1.0f));
            objectAnimatorOfFloat3.setDuration(jDuration);
            int[] iArr = new int[2];
            ViewGroup viewGroup = this.LL;
            if (viewGroup != null) {
                viewGroup.getLocationOnScreen(iArr);
            }
            iArrR[0] = iArrR[0] - iArr[0];
            iArrR[1] = -((int) C497740JfY.LIZIZ(LiveShortTouchBigCardMarginSetting.INSTANCE.marginDp() + 12.0f));
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.TRANSLATION_X, 0.0f, iArrR[0]);
            objectAnimatorOfFloat4.setInterpolator(C0GY9.LIZIZ(0.25f, 1.0f, 0.5f, 1.0f));
            objectAnimatorOfFloat4.setDuration(jDuration);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.LL, (Property<ViewGroup, Float>) View.TRANSLATION_Y, 0.0f, iArrR[1]);
            objectAnimatorOfFloat5.setInterpolator(C0GY9.LIZIZ(0.25f, 1.0f, 0.5f, 1.0f));
            objectAnimatorOfFloat5.setDuration(jDuration);
            animatorSet.addListener(new ALAdapterS12S0200000_17(this, animatorListenerAdapter, 11));
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat3);
            return animatorSet;
        }
        return null;
    }
}
