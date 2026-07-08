package com.bytedance.ies.xelement.overlay;

import X.AbstractC1563340qmi;
import X.C1297760jsM;
import X.C1298530jtb;
import X.C1310360kCg;
import X.C1311380kEK;
import X.C1313040kH0;
import X.C1315080kKI;
import X.C1318820kQK;
import X.C1318830kQL;
import X.C1321740kV2;
import X.C1321780kV6;
import X.C1565730qqZ;
import X.C199Y;
import X.C19FO;
import X.C2187701Ajg;
import X.C785410UrT;
import X.C816490W1f;
import X.DialogC1321720kV0;
import X.EnumC1311640kEk;
import X.EnumC1311650kEl;
import X.EnumC682280QpW;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import X.InterfaceC1313090kH5;
import X.ViewTreeObserverOnDrawListenerC1304920k3u;
import X.ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ;
import X.ViewTreeObserverOnScrollChangedListenerC1304910k3t;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.bytedance.ies.xelement.overlay.LynxOverlayView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import j27.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxOverlayView extends UIGroup<AndroidView> {
    public static final /* synthetic */ int LLJJIJIL = 0;
    public final LynxOverlayViewProxy LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final DialogC1321720kV0 LLJ;
    public final C1313040kH0 LLJI;
    public final int[] LLJIJIL;
    public final C1311380kEK LLJILJIL;
    public boolean LLJILJILJ;
    public C1318820kQK LLJILLL;
    public C1318830kQL LLJJ;
    public ViewTreeObserver LLJJI;
    public ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ LLJJIII;
    public ViewTreeObserverOnScrollChangedListenerC1304910k3t LLJJIJI;
    public ViewTreeObserverOnDrawListenerC1304920k3u LLJJIJIIJIL;

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isUserInteractionEnabled() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0k3t] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0k3u] */
    public final void LJJIIZI() {
        Activity activityLIZ = C1298530jtb.LIZ(this.mContext);
        if (activityLIZ == null || activityLIZ.isFinishing()) {
            return;
        }
        String str = this.LLILZLL;
        if (str != null) {
            Iterator it2 = ((ArrayList) C1321740kV2.LIZ).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if (Intrinsics.LJFF(((C1321780kV6) next).LIZ, str)) {
                        if (next != null) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.LLILZLL = C1321740kV2.LIZ(this.LLILZLL, this.LLJ);
            DialogC1321720kV0 dialogC1321720kV0 = this.LLJ;
            dialogC1321720kV0.show();
            C785410UrT.LIZIZ(dialogC1321720kV0);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(dialogC1321720kV0);
            C816490W1f.LIZ(dialogC1321720kV0);
            LJJIJ("onShowOverlay");
            C1313040kH0 c1313040kH0 = this.LLJI;
            this.LLJJI = c1313040kH0 != null ? c1313040kH0.getViewTreeObserver() : null;
            this.LLJJIII = new ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ(this, 2);
            ViewTreeObserver viewTreeObserver = this.LLJJI;
            if (viewTreeObserver != null) {
                ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ viewTreeObserverOnGlobalLayoutListenerC1339270kxJ = this.LLJJIII;
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1339270kxJ);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1339270kxJ, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
            this.LLJJIJI = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0k3t
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    C1309670kBZ c1309670kBZ;
                    LynxOverlayView lynxOverlayView = this.LL;
                    int i = LynxOverlayView.LLJJIJIL;
                    s sVar = lynxOverlayView.mContext;
                    if (sVar == null || (c1309670kBZ = sVar.LLJJJJLIIL) == null) {
                        return;
                    }
                    c1309670kBZ.LJIIJ();
                }
            };
            ViewTreeObserver viewTreeObserver2 = this.LLJJI;
            if (viewTreeObserver2 != null) {
                ViewTreeObserverOnScrollChangedListenerC1304910k3t viewTreeObserverOnScrollChangedListenerC1304910k3t = this.LLJJIJI;
                viewTreeObserver2.addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC1304910k3t);
                C2187701Ajg.LIZ(viewTreeObserver2, viewTreeObserverOnScrollChangedListenerC1304910k3t, ViewTreeObserver.OnScrollChangedListener.class);
            }
            this.LLJJIJIIJIL = new ViewTreeObserver.OnDrawListener() { // from class: X.0k3u
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    C1309670kBZ c1309670kBZ;
                    LynxOverlayView lynxOverlayView = this.LL;
                    int i = LynxOverlayView.LLJJIJIL;
                    s sVar = lynxOverlayView.mContext;
                    if (sVar == null || (c1309670kBZ = sVar.LLJJJJLIIL) == null) {
                        return;
                    }
                    c1309670kBZ.LJIIJ();
                }
            };
            ViewTreeObserver viewTreeObserver3 = this.LLJJI;
            if (viewTreeObserver3 != null) {
                ViewTreeObserverOnDrawListenerC1304920k3u viewTreeObserverOnDrawListenerC1304920k3u = this.LLJJIJIIJIL;
                viewTreeObserver3.addOnDrawListener(viewTreeObserverOnDrawListenerC1304920k3u);
                C2187701Ajg.LIZ(viewTreeObserver3, viewTreeObserverOnDrawListenerC1304920k3u, ViewTreeObserver.OnDrawListener.class);
            }
        } catch (WindowManager.BadTokenException e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.w("x-overlay", e.toString());
        } catch (RuntimeException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LynxLog.w("x-overlay", e2.toString());
        }
    }

    public final void LJJIJIIJI() {
        Integer numLIZ;
        Context context = this.mContext;
        if (context == null) {
            LJJIIZI();
            return;
        }
        if (context instanceof C199Y) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) ((C19FO) context).getLifecycle();
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.IS_FINISHING;
            if (abstractC1563340qmi.LJI(enumC682280QpW) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), context)) != null) {
                LJJIIZI();
                C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                return;
            }
        }
        LJJIIZI();
    }

    public final void LJJIJIIJIL() {
        int iIntValue;
        int i;
        Window window;
        View decorView;
        Window window2;
        Window window3;
        Window window4;
        View decorView2;
        Window window5;
        View decorView3;
        Window window6;
        DialogC1321720kV0 dialogC1321720kV0 = this.LLJ;
        if (dialogC1321720kV0 != null && (window6 = dialogC1321720kV0.getWindow()) != null) {
            window6.addFlags(65792);
        }
        Integer numValueOf = null;
        if (Intrinsics.LJFF(this.LLILZIL, "lite")) {
            DialogC1321720kV0 dialogC1321720kV02 = this.LLJ;
            if (dialogC1321720kV02 != null && (window5 = dialogC1321720kV02.getWindow()) != null && (decorView3 = window5.getDecorView()) != null) {
                numValueOf = Integer.valueOf(decorView3.getSystemUiVisibility());
            }
            iIntValue = numValueOf.intValue();
            i = 9472;
        } else {
            DialogC1321720kV0 dialogC1321720kV03 = this.LLJ;
            if (dialogC1321720kV03 != null && (window = dialogC1321720kV03.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                numValueOf = Integer.valueOf(decorView.getSystemUiVisibility());
            }
            iIntValue = numValueOf.intValue();
            i = 1280;
        }
        int i2 = iIntValue | i;
        DialogC1321720kV0 dialogC1321720kV04 = this.LLJ;
        if (dialogC1321720kV04 != null && (window4 = dialogC1321720kV04.getWindow()) != null && (decorView2 = window4.getDecorView()) != null) {
            decorView2.setSystemUiVisibility(i2);
        }
        DialogC1321720kV0 dialogC1321720kV05 = this.LLJ;
        if (dialogC1321720kV05 != null && (window3 = dialogC1321720kV05.getWindow()) != null) {
            window3.addFlags(Integer.MIN_VALUE);
        }
        DialogC1321720kV0 dialogC1321720kV06 = this.LLJ;
        if (dialogC1321720kV06 == null || (window2 = dialogC1321720kV06.getWindow()) == null) {
            return;
        }
        window2.setStatusBarColor(0);
    }

    public final void LJJIJIL() {
        int[] iArr = {0, 0};
        int[] iArr2 = {0, 0};
        this.mContext.LLJILJILJ.LL.getLocationOnScreen(iArr);
        this.mView.getLocationOnScreen(iArr2);
        int[] iArr3 = this.LLJIJIL;
        iArr3[0] = iArr2[0] - iArr[0];
        iArr3[1] = iArr2[1] - iArr[1];
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        if (this.LLJ.isShowing()) {
            try {
                DialogC1321720kV0 dialogC1321720kV0 = this.LLJ;
                dialogC1321720kV0.dismiss();
                C785410UrT.LIZ(dialogC1321720kV0);
                C1321740kV2.LIZIZ(this.LLILZLL);
                ViewTreeObserver viewTreeObserver = this.LLJJI;
                if (viewTreeObserver != null) {
                    ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ viewTreeObserverOnGlobalLayoutListenerC1339270kxJ = this.LLJJIII;
                    viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1339270kxJ);
                    C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1339270kxJ, ViewTreeObserver.OnGlobalLayoutListener.class);
                }
                ViewTreeObserver viewTreeObserver2 = this.LLJJI;
                if (viewTreeObserver2 != null) {
                    ViewTreeObserverOnScrollChangedListenerC1304910k3t viewTreeObserverOnScrollChangedListenerC1304910k3t = this.LLJJIJI;
                    viewTreeObserver2.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC1304910k3t);
                    C2187701Ajg.LIZIZ(viewTreeObserver2, viewTreeObserverOnScrollChangedListenerC1304910k3t, ViewTreeObserver.OnScrollChangedListener.class);
                }
                ViewTreeObserver viewTreeObserver3 = this.LLJJI;
                if (viewTreeObserver3 != null) {
                    ViewTreeObserverOnDrawListenerC1304920k3u viewTreeObserverOnDrawListenerC1304920k3u = this.LLJJIJIIJIL;
                    viewTreeObserver3.removeOnDrawListener(viewTreeObserverOnDrawListenerC1304920k3u);
                    C2187701Ajg.LIZIZ(viewTreeObserver3, viewTreeObserverOnDrawListenerC1304920k3u, ViewTreeObserver.OnDrawListener.class);
                }
            } catch (WindowManager.BadTokenException e) {
                TryCatchGuardChecker.doCheck(e);
                LynxLog.w("x-overlay", e.toString());
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                LynxLog.w("x-overlay", e2.toString());
            }
        }
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final Rect getBoundingClientRect() {
        if (this.LLIZLLLIL && this.LLJIJIL[0] == Integer.MIN_VALUE) {
            LJJIJIL();
        }
        return super.getBoundingClientRect();
    }

    public final void hide() {
        if (this.LLJ.isShowing()) {
            try {
                DialogC1321720kV0 dialogC1321720kV0 = this.LLJ;
                dialogC1321720kV0.dismiss();
                C785410UrT.LIZ(dialogC1321720kV0);
                LJJIJ("onDismissOverlay");
                C1321740kV2.LIZIZ(this.LLILZLL);
                ViewTreeObserver viewTreeObserver = this.LLJJI;
                if (viewTreeObserver != null) {
                    ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ viewTreeObserverOnGlobalLayoutListenerC1339270kxJ = this.LLJJIII;
                    viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1339270kxJ);
                    C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1339270kxJ, ViewTreeObserver.OnGlobalLayoutListener.class);
                }
                ViewTreeObserver viewTreeObserver2 = this.LLJJI;
                if (viewTreeObserver2 != null) {
                    ViewTreeObserverOnScrollChangedListenerC1304910k3t viewTreeObserverOnScrollChangedListenerC1304910k3t = this.LLJJIJI;
                    viewTreeObserver2.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC1304910k3t);
                    C2187701Ajg.LIZIZ(viewTreeObserver2, viewTreeObserverOnScrollChangedListenerC1304910k3t, ViewTreeObserver.OnScrollChangedListener.class);
                }
                ViewTreeObserver viewTreeObserver3 = this.LLJJI;
                if (viewTreeObserver3 != null) {
                    ViewTreeObserverOnDrawListenerC1304920k3u viewTreeObserverOnDrawListenerC1304920k3u = this.LLJJIJIIJIL;
                    viewTreeObserver3.removeOnDrawListener(viewTreeObserverOnDrawListenerC1304920k3u);
                    C2187701Ajg.LIZIZ(viewTreeObserver3, viewTreeObserverOnDrawListenerC1304920k3u, ViewTreeObserver.OnDrawListener.class);
                }
            } catch (WindowManager.BadTokenException e) {
                TryCatchGuardChecker.doCheck(e);
                LynxLog.w("x-overlay", e.toString());
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                LynxLog.w("x-overlay", e2.toString());
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final boolean ignoreFocus() {
        return this.mIgnoreFocus == EnumC1311650kEl.Enable;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final EnumC1311640kEk pointerEvents() {
        EnumC1311640kEk enumC1311640kEk = this.mPointerEvents;
        EnumC1311640kEk enumC1311640kEk2 = EnumC1311640kEk.None;
        return enumC1311640kEk == enumC1311640kEk2 ? enumC1311640kEk2 : EnumC1311640kEk.Auto;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        super.layout();
        if (this.LLIZLLLIL) {
            LJJIJIL();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onDetach() {
        super.onDetach();
        if (this.LLIZ) {
            return;
        }
        hide();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.LLJILJILJ) {
            C1310360kCg c1310360kCg = this.mContext.LLJILJILJ.LLILZIL;
            if (c1310360kCg == null || !c1310360kCg.LJ()) {
                if (this.LLJJ == null) {
                    final C1318830kQL c1318830kQL = new C1318830kQL(this);
                    T t = this.mView;
                    if (t != 0) {
                        t.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: X.0kQU
                            @Override // android.view.View.AccessibilityDelegate
                            public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                                return c1318830kQL;
                            }
                        });
                    }
                    this.LLJJ = c1318830kQL;
                }
            } else if (this.LLJILLL == null) {
                C1318820kQK c1318820kQK = new C1318820kQK(this);
                this.LLJILLL = c1318820kQK;
                q0.LJIJ(this.mView, c1318820kQK);
            }
            setImportantForAccessibility(1);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1313090kH5
    public final void requestLayout() {
        super.requestLayout();
        if (this.LL.getTransitionAnimator() != null || this.LL.enableLayoutAnimation()) {
            invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int[] getOffsetDescendantRectToLynxView() {
        return this.LLJIJIL;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final C1311380kEK getTouchEventDispatcher() {
        return this.LLJILJIL;
    }

    public final void LJJIJ(String str) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("currentOverlayId", this.LLILZLL);
        JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
        Iterator it2 = ((ArrayList) C1321740kV2.LIZ).iterator();
        while (it2.hasNext()) {
            javaOnlyArray2.pushString(((C1321780kV6) it2.next()).LIZ);
        }
        javaOnlyMap.put("overlays", javaOnlyArray2);
        javaOnlyArray.pushMap(javaOnlyMap);
        this.mContext.LJJIII(str, javaOnlyArray);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(final Context context) {
        return new AndroidView(context) { // from class: X.0kDo
            @Override // android.view.ViewGroup, android.view.View
            public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
                boolean z;
                C1310360kCg c1310360kCg = this.mContext.LLJILJILJ.LLILZIL;
                if (c1310360kCg != null && c1310360kCg.LJ()) {
                    z = true;
                } else {
                    z = false;
                }
                LynxOverlayView lynxOverlayView = this;
                if (!lynxOverlayView.LLJILJILJ) {
                    return super.dispatchHoverEvent(motionEvent);
                }
                if (!z) {
                    C1318830kQL c1318830kQL = lynxOverlayView.LLJJ;
                    if (c1318830kQL != null && c1318830kQL.LJII(motionEvent)) {
                        return true;
                    }
                } else {
                    C1318820kQK c1318820kQK = this.LLJILLL;
                    if (c1318820kQK != null && c1318820kQK.LIZ(motionEvent)) {
                        return true;
                    }
                }
                return onHoverEvent(motionEvent);
            }

            {
                new LinkedHashMap();
            }

            @Override // android.view.ViewGroup, android.view.ViewParent
            public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                if (this.LLJILJILJ && accessibilityEvent.getEventType() == 2048) {
                    accessibilityEvent.setSource(this);
                }
                return super.requestSendAccessibilityEvent(view, accessibilityEvent);
            }
        };
    }

    @InterfaceC1312540kGC(name = "always-show")
    public final void setAlwaysShow(boolean z) {
        this.LLIZ = z;
    }

    @InterfaceC1312540kGC(name = "android-set-soft-input-mode")
    public final void setAndroidSetSoftInputMode(String str) {
        Window window;
        if ("unspecified".equals(str)) {
            Window window2 = this.LLJ.getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(0);
                return;
            }
            return;
        }
        if ("nothing".equals(str)) {
            Window window3 = this.LLJ.getWindow();
            if (window3 == null) {
                return;
            }
            window3.setSoftInputMode(48);
            return;
        }
        if ("pan".equals(str)) {
            Window window4 = this.LLJ.getWindow();
            if (window4 == null) {
                return;
            }
            window4.setSoftInputMode(32);
            return;
        }
        if (!"resize".equals(str) || (window = this.LLJ.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }

    @InterfaceC1312540kGC(name = "cut-out-mode")
    public final void setCutOutMode(boolean z) {
        DialogC1321720kV0 dialogC1321720kV0;
        Window window;
        WindowManager.LayoutParams attributes;
        if (z && (dialogC1321720kV0 = this.LLJ) != null && (window = dialogC1321720kV0.getWindow()) != null && (attributes = window.getAttributes()) != null && Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
    }

    @InterfaceC1312540kGC(name = "android-enable-accessibility")
    public final void setEnableAccessibility(boolean z) {
        this.LLJILJILJ = z;
        if (z) {
            this.mView.setFocusableInTouchMode(true);
        }
    }

    @InterfaceC1312540kGC(name = "events-pass-through")
    public final void setEventsPassThrough(InterfaceC1298070jsr interfaceC1298070jsr) {
        ReadableType type = interfaceC1298070jsr.getType();
        if (type != null) {
            int i = C1297760jsM.LIZ[type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LLILZ = interfaceC1298070jsr.asBoolean();
                    return;
                }
                return;
            }
            this.LLILZ = Boolean.parseBoolean(interfaceC1298070jsr.asString());
        }
    }

    @InterfaceC1312540kGC(name = "full-screen")
    public final void setFullScreen(boolean z) {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        if (z) {
            DialogC1321720kV0 dialogC1321720kV0 = this.LLJ;
            Integer numValueOf = null;
            if (dialogC1321720kV0 != null && (window2 = dialogC1321720kV0.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
                numValueOf = Integer.valueOf(decorView2.getSystemUiVisibility());
            }
            int iIntValue = numValueOf.intValue() | 5894;
            DialogC1321720kV0 dialogC1321720kV02 = this.LLJ;
            if (dialogC1321720kV02 != null && (window = dialogC1321720kV02.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setSystemUiVisibility(iIntValue);
            }
        }
    }

    @InterfaceC1312540kGC(name = "android-native-event-pass")
    public final void setNativeEventPass(boolean z) {
        if (z) {
            Window window = this.LLJ.getWindow();
            if (window != null) {
                window.addFlags(16);
                return;
            }
            return;
        }
        Window window2 = this.LLJ.getWindow();
        if (window2 == null) {
            return;
        }
        window2.clearFlags(16);
    }

    @InterfaceC1312540kGC(name = "overlay-id")
    public final void setOverlayId(String str) {
        this.LLILZLL = str;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setParent(InterfaceC1313090kH5 interfaceC1313090kH5) {
        super.setParent(interfaceC1313090kH5);
        if (interfaceC1313090kH5 == null) {
            hide();
        } else {
            if (!this.LLILLJJLI) {
                return;
            }
            LJJIJIIJI();
        }
    }

    @InterfaceC1312540kGC(name = "compat-bounding-rect")
    public final void setShouldOffsetBoundingRect(Boolean bool) {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLIZLLLIL = zBooleanValue;
        if (zBooleanValue) {
            LJJIJIL();
        }
    }

    @InterfaceC1312540kGC(name = "status-bar-translucent")
    public final void setStatusBarTranslucent(InterfaceC1298070jsr interfaceC1298070jsr) {
        ReadableType type = interfaceC1298070jsr.getType();
        if (type != null) {
            int i = C1297760jsM.LIZ[type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LLILLL = interfaceC1298070jsr.asBoolean();
                }
            } else {
                this.LLILLL = Boolean.parseBoolean(interfaceC1298070jsr.asString());
            }
        }
        if (this.LLILLL) {
            LJJIJIIJIL();
        }
    }

    @InterfaceC1312540kGC(name = "status-bar-translucent-style")
    public final void setStatusBarTranslucentStyle(String str) {
        if (str == null) {
            str = "dark";
        }
        this.LLILZIL = str;
        if (this.LLILLL) {
            LJJIJIIJIL();
        }
    }

    @InterfaceC1312540kGC(name = "visible")
    public final void setVisible(InterfaceC1298070jsr interfaceC1298070jsr) {
        ReadableType type = interfaceC1298070jsr.getType();
        if (type != null) {
            int i = C1297760jsM.LIZ[type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LLILLJJLI = interfaceC1298070jsr.asBoolean();
                }
            } else {
                this.LLILLJJLI = Boolean.parseBoolean(interfaceC1298070jsr.asString());
            }
        }
        if (this.LLILLJJLI) {
            LJJIJIIJI();
        } else {
            hide();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0kH0, android.view.View, android.view.ViewGroup] */
    public LynxOverlayView(final s sVar, LynxOverlayViewProxy lynxOverlayViewProxy) {
        super(sVar);
        this.LL = lynxOverlayViewProxy;
        this.LLILZ = true;
        this.LLILZIL = "dark";
        DialogC1321720kV0 dialogC1321720kV0 = new DialogC1321720kV0(sVar, this);
        this.LLJ = dialogC1321720kV0;
        ?? r2 = new AndroidView(sVar) { // from class: X.0kH0
            {
                new LinkedHashMap();
            }

            @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.View
            public final void onMeasure(int i, int i2) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                this.measureChildren();
            }

            @Override // com.lynx.tasm.behavior.ui.view.AndroidView, android.view.ViewGroup, android.view.View
            public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                this.layout();
            }
        };
        this.LLJI = r2;
        this.LLJIJIL = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        Window window = dialogC1321720kV0.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        Window window2 = dialogC1321720kV0.getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.0f);
        }
        r2.addView(this.mView, -1, -1);
        dialogC1321720kV0.setContentView(r2, new ViewGroup.LayoutParams(-1, -1));
        dialogC1321720kV0.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0kV5
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                LynxOverlayView lynxOverlayView = this.LL;
                int i2 = LynxOverlayView.LLJJIJIL;
                if (i == 4 && keyEvent.getAction() == 0) {
                    lynxOverlayView.LJJIJ("onRequestClose");
                    return true;
                }
                return false;
            }
        });
        r2.setClickable(true);
        r2.setFocusable(true);
        r2.setFocusableInTouchMode(true);
        this.LLJILJIL = new C1311380kEK(sVar.LJIILIIL());
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final boolean eventThrough(float f, float f2) {
        boolean z;
        if (this.mEventThrough == EnumC1311650kEl.Enable) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<ArrayList<C1315080kKI>> arrayList = this.mEventThroughActiveRegions;
        if (arrayList == null) {
            return z;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) ListProtector.get(this.mEventThroughActiveRegions, i);
            if (arrayList2 != null && arrayList2.size() == 4) {
                float fLIZ = ((C1315080kKI) ListProtector.get(arrayList2, 0)).LIZ(getWidth());
                float fLIZ2 = ((C1315080kKI) ListProtector.get(arrayList2, 1)).LIZ(getHeight());
                float fLIZ3 = ((C1315080kKI) ListProtector.get(arrayList2, 2)).LIZ(getWidth()) + fLIZ;
                float fLIZ4 = ((C1315080kKI) ListProtector.get(arrayList2, 3)).LIZ(getHeight()) + fLIZ2;
                if (f >= fLIZ && f < fLIZ3 && f2 >= fLIZ2 && f2 < fLIZ4) {
                    LynxLog.i("x-overlay", "hit the event through active regions!");
                    return z;
                }
            }
        }
        if (!z) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void onInsertChild(LynxBaseUI lynxBaseUI, int i) {
        if (this.LLIZLLLIL && this.LLJIJIL[0] == Integer.MIN_VALUE) {
            LJJIJIL();
        }
        super.onInsertChild(lynxBaseUI, i);
    }
}
