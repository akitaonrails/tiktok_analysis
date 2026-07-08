package com.lynx.xelement.overlay;

import X.C0DRA;
import X.C1289960jfm;
import X.C1297770jsN;
import X.C1298530jtb;
import X.C1298720jtu;
import X.C1299120juY;
import X.C1311380kEK;
import X.C1313070kH3;
import X.C1315080kKI;
import X.C1318590kPx;
import X.C1321730kV1;
import X.C1321790kV7;
import X.C1321800kV8;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C785410UrT;
import X.C816490W1f;
import X.DialogC1321700kUy;
import X.EnumC1311640kEk;
import X.EnumC1311650kEl;
import X.InterfaceC1298070jsr;
import X.InterfaceC1311410kEN;
import X.InterfaceC1312540kGC;
import X.InterfaceC1313090kH5;
import X.ViewTreeObserverOnDrawListenerC1304940k3w;
import X.ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ;
import X.ViewTreeObserverOnScrollChangedListenerC1304930k3v;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.xelement.overlay.LynxOverlayView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import j27.s;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxOverlayView extends UIGroup<AndroidView> {
    public static final /* synthetic */ int LLJLILLLLZIIL = 0;
    public final LynxUIOverlay LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;
    public boolean LLJ;
    public String LLJI;
    public String LLJIJIL;
    public LynxBaseUI LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public final boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public VelocityTracker LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public Boolean LLJJJ;
    public final DialogC1321700kUy LLJJJIL;
    public final C1313070kH3 LLJJJJ;
    public final int[] LLJJJJJIL;
    public final C1311380kEK LLJJJJLIIL;
    public ViewTreeObserver LLJJL;
    public ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ LLJJLIIIJLLLLLLLZ;
    public ViewTreeObserverOnScrollChangedListenerC1304930k3v LLJL;
    public ViewTreeObserverOnDrawListenerC1304940k3w LLJLIL;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isOverlay() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isUserInteractionEnabled() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0k3v] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0k3w] */
    public final void LJJIJLIJ() {
        Activity activityLIZ = C1298530jtb.LIZ(this.mContext);
        int i = 0;
        if (this.LLJ) {
            DialogC1321700kUy dialogC1321700kUy = this.LLJJJIL;
            try {
                Field declaredField = Dialog.class.getDeclaredField("mContext");
                declaredField.setAccessible(true);
                declaredField.set(dialogC1321700kUy, activityLIZ);
                declaredField.setAccessible(false);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LynxLog.e("overlay", e.toString());
            }
        }
        if (activityLIZ == null) {
            s sVar = this.mContext;
            LJJIJIL(1, sVar != null ? sVar.getBaseContext() : null);
            return;
        }
        if (activityLIZ.isFinishing()) {
            return;
        }
        String str = this.LLJI;
        if (str != null) {
            Iterator it2 = ((ArrayList) C1321730kV1.LIZ).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if (Intrinsics.LJFF(((C1321790kV7) next).LIZ, str)) {
                        if (next != null) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.LLJI = C1321730kV1.LIZ(this.LLJJJIL);
            this.LLJJJIL.getClass();
            if (activityLIZ.isFinishing()) {
                i = -1;
            } else if (activityLIZ.isDestroyed()) {
                i = -2;
            } else {
                DialogC1321700kUy dialogC1321700kUy2 = this.LLJJJIL;
                dialogC1321700kUy2.show();
                C785410UrT.LIZIZ(dialogC1321700kUy2);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(dialogC1321700kUy2);
                C816490W1f.LIZ(dialogC1321700kUy2);
            }
            LJJIJIL(i, activityLIZ);
            C1313070kH3 c1313070kH3 = this.LLJJJJ;
            this.LLJJL = c1313070kH3 != null ? c1313070kH3.getViewTreeObserver() : null;
            this.LLJJLIIIJLLLLLLLZ = new ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ(this, 5);
            ViewTreeObserver viewTreeObserver = this.LLJJL;
            if (viewTreeObserver != null) {
                ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ viewTreeObserverOnGlobalLayoutListenerC1339270kxJ = this.LLJJLIIIJLLLLLLLZ;
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1339270kxJ);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1339270kxJ, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
            this.LLJL = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0k3v
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    C1309670kBZ c1309670kBZ;
                    LynxOverlayView lynxOverlayView = this.LL;
                    int i2 = LynxOverlayView.LLJLILLLLZIIL;
                    s sVar2 = lynxOverlayView.mContext;
                    if (sVar2 == null || (c1309670kBZ = sVar2.LLJJJJLIIL) == null) {
                        return;
                    }
                    c1309670kBZ.LJIIJ();
                }
            };
            ViewTreeObserver viewTreeObserver2 = this.LLJJL;
            if (viewTreeObserver2 != null) {
                ViewTreeObserverOnScrollChangedListenerC1304930k3v viewTreeObserverOnScrollChangedListenerC1304930k3v = this.LLJL;
                viewTreeObserver2.addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC1304930k3v);
                C2187701Ajg.LIZ(viewTreeObserver2, viewTreeObserverOnScrollChangedListenerC1304930k3v, ViewTreeObserver.OnScrollChangedListener.class);
            }
            this.LLJLIL = new ViewTreeObserver.OnDrawListener() { // from class: X.0k3w
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    C1309670kBZ c1309670kBZ;
                    LynxOverlayView lynxOverlayView = this.LL;
                    int i2 = LynxOverlayView.LLJLILLLLZIIL;
                    s sVar2 = lynxOverlayView.mContext;
                    if (sVar2 == null || (c1309670kBZ = sVar2.LLJJJJLIIL) == null) {
                        return;
                    }
                    c1309670kBZ.LJIIJ();
                }
            };
            ViewTreeObserver viewTreeObserver3 = this.LLJJL;
            if (viewTreeObserver3 != null) {
                ViewTreeObserverOnDrawListenerC1304940k3w viewTreeObserverOnDrawListenerC1304940k3w = this.LLJLIL;
                viewTreeObserver3.addOnDrawListener(viewTreeObserverOnDrawListenerC1304940k3w);
                C2187701Ajg.LIZ(viewTreeObserver3, viewTreeObserverOnDrawListenerC1304940k3w, ViewTreeObserver.OnDrawListener.class);
            }
        } catch (WindowManager.BadTokenException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LynxLog.w("overlay", e2.toString());
        } catch (RuntimeException e3) {
            TryCatchGuardChecker.doCheck(e3);
            LynxLog.w("overlay", e3.toString());
        }
    }

    public final void LJJJ() {
        int[] iArr = {0, 0};
        int[] iArr2 = {0, 0};
        this.mContext.LLJILJILJ.LL.getLocationOnScreen(iArr);
        this.mView.getLocationOnScreen(iArr2);
        int[] iArr3 = this.LLJJJJJIL;
        iArr3[0] = iArr2[0] - iArr[0];
        iArr3[1] = iArr2[1] - iArr[1];
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        if (this.LLJJJIL.isShowing()) {
            try {
                DialogC1321700kUy dialogC1321700kUy = this.LLJJJIL;
                dialogC1321700kUy.dismiss();
                C785410UrT.LIZ(dialogC1321700kUy);
                C1321730kV1.LIZIZ(this.LLJI);
                ViewTreeObserver viewTreeObserver = this.LLJJL;
                if (viewTreeObserver != null) {
                    ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ viewTreeObserverOnGlobalLayoutListenerC1339270kxJ = this.LLJJLIIIJLLLLLLLZ;
                    viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1339270kxJ);
                    C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1339270kxJ, ViewTreeObserver.OnGlobalLayoutListener.class);
                }
                ViewTreeObserver viewTreeObserver2 = this.LLJJL;
                if (viewTreeObserver2 != null) {
                    ViewTreeObserverOnScrollChangedListenerC1304930k3v viewTreeObserverOnScrollChangedListenerC1304930k3v = this.LLJL;
                    viewTreeObserver2.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC1304930k3v);
                    C2187701Ajg.LIZIZ(viewTreeObserver2, viewTreeObserverOnScrollChangedListenerC1304930k3v, ViewTreeObserver.OnScrollChangedListener.class);
                }
                ViewTreeObserver viewTreeObserver3 = this.LLJJL;
                if (viewTreeObserver3 != null) {
                    ViewTreeObserverOnDrawListenerC1304940k3w viewTreeObserverOnDrawListenerC1304940k3w = this.LLJLIL;
                    viewTreeObserver3.removeOnDrawListener(viewTreeObserverOnDrawListenerC1304940k3w);
                    C2187701Ajg.LIZIZ(viewTreeObserver3, viewTreeObserverOnDrawListenerC1304940k3w, ViewTreeObserver.OnDrawListener.class);
                }
            } catch (WindowManager.BadTokenException e) {
                TryCatchGuardChecker.doCheck(e);
                LynxLog.w("overlay", e.toString());
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                LynxLog.w("overlay", e2.toString());
            }
        }
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final Rect getBoundingClientRect() {
        if (this.LLJJ && this.LLJJJJJIL[0] == Integer.MIN_VALUE) {
            LJJJ();
        }
        return super.getBoundingClientRect();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final Window getWindow() {
        DialogC1321700kUy dialogC1321700kUy = this.LLJJJIL;
        if (dialogC1321700kUy != null) {
            return dialogC1321700kUy.getWindow();
        }
        return null;
    }

    public final void hide() {
        if (this.LLJJJIL.isShowing()) {
            try {
                DialogC1321700kUy dialogC1321700kUy = this.LLJJJIL;
                dialogC1321700kUy.dismiss();
                C785410UrT.LIZ(dialogC1321700kUy);
                this.mContext.LLIZ.LIZIZ(new C1289960jfm(getSign(), "dismissoverlay"));
                C1321730kV1.LIZIZ(this.LLJI);
                ViewTreeObserver viewTreeObserver = this.LLJJL;
                if (viewTreeObserver != null) {
                    ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ viewTreeObserverOnGlobalLayoutListenerC1339270kxJ = this.LLJJLIIIJLLLLLLLZ;
                    viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1339270kxJ);
                    C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1339270kxJ, ViewTreeObserver.OnGlobalLayoutListener.class);
                }
                ViewTreeObserver viewTreeObserver2 = this.LLJJL;
                if (viewTreeObserver2 != null) {
                    ViewTreeObserverOnScrollChangedListenerC1304930k3v viewTreeObserverOnScrollChangedListenerC1304930k3v = this.LLJL;
                    viewTreeObserver2.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC1304930k3v);
                    C2187701Ajg.LIZIZ(viewTreeObserver2, viewTreeObserverOnScrollChangedListenerC1304930k3v, ViewTreeObserver.OnScrollChangedListener.class);
                }
                ViewTreeObserver viewTreeObserver3 = this.LLJJL;
                if (viewTreeObserver3 != null) {
                    ViewTreeObserverOnDrawListenerC1304940k3w viewTreeObserverOnDrawListenerC1304940k3w = this.LLJLIL;
                    viewTreeObserver3.removeOnDrawListener(viewTreeObserverOnDrawListenerC1304940k3w);
                    C2187701Ajg.LIZIZ(viewTreeObserver3, viewTreeObserverOnDrawListenerC1304940k3w, ViewTreeObserver.OnDrawListener.class);
                }
            } catch (WindowManager.BadTokenException e) {
                TryCatchGuardChecker.doCheck(e);
                LynxLog.w("overlay", e.toString());
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                LynxLog.w("overlay", e2.toString());
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
        if (this.LLJJ) {
            LJJJ();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onAttach() {
        super.onAttach();
        if (this.LLJJI) {
            this.LLJJIJI = VelocityTracker.obtain();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onDetach() {
        super.onDetach();
        if (this.LLJJI) {
            try {
                VelocityTracker velocityTracker = this.LLJJIJI;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LynxLog.e("overlay", th.toString());
            }
            this.LLJJIJI = null;
        }
        if (this.LLJILLL) {
            return;
        }
        hide();
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
        return this.LLJJJJJIL;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final C1311380kEK getTouchEventDispatcher() {
        return this.LLJJJJLIIL;
    }

    public static boolean LJJIJ(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof UIScrollView) {
            C1318590kPx c1318590kPx = (C1318590kPx) ((LynxUI) lynxBaseUI).mView;
            if (!c1318590kPx.LLJJJ) {
                if (c1318590kPx.getRealScrollY() > 0) {
                    return true;
                }
                return false;
            }
        }
        if (lynxBaseUI instanceof UIList) {
            UIList uIList = (UIList) lynxBaseUI;
            if (uIList.LLJJJJJIL) {
                if (((RecyclerView) uIList.mView).computeVerticalScrollOffset() > 0) {
                    return true;
                }
                return false;
            }
        }
        if ((lynxBaseUI instanceof LynxUI) && ((LynxUI) lynxBaseUI).mView.getScrollY() > 0) {
            return true;
        }
        return false;
    }

    public final boolean LJJIIZI(InterfaceC1311410kEN interfaceC1311410kEN) {
        String str;
        if (interfaceC1311410kEN == null || !(interfaceC1311410kEN instanceof LynxBaseUI) || (interfaceC1311410kEN instanceof LynxOverlayView) || (str = this.LLJIJIL) == null || str.length() == 0) {
            return false;
        }
        LynxBaseUI lynxBaseUI = this.LLJILJIL;
        if (lynxBaseUI != null) {
            return LJJIJ(lynxBaseUI);
        }
        if (!(interfaceC1311410kEN instanceof UIGroup)) {
            LJJIIZI(((LynxBaseUI) interfaceC1311410kEN).parent());
        }
        LynxBaseUI lynxBaseUI2 = (LynxBaseUI) interfaceC1311410kEN;
        if (Intrinsics.LJFF(this.LLJIJIL, lynxBaseUI2.getIdSelector())) {
            this.LLJILJIL = lynxBaseUI2;
            return LJJIJ(lynxBaseUI2);
        }
        return LJJIIZI(lynxBaseUI2.parent());
    }

    public final float LJJIJIIJI(float f) {
        return (f / this.mContext.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public final void LJJIJL(int i) {
        Window window = this.LLJJJIL.getWindow();
        if (window != null) {
            window.setType(i);
        }
    }

    public final void LJJIZ(boolean z) {
        int iIntValue;
        int i;
        Window window;
        View decorView;
        View decorView2;
        View decorView3;
        Window window2;
        View decorView4;
        if (z) {
            Window window3 = this.LLJJJIL.getWindow();
            if (window3 != null) {
                window3.addFlags(65792);
            }
            Window window4 = this.LLJJJIL.getWindow();
            if (window4 != null) {
                window4.addFlags(Integer.MIN_VALUE);
            }
            Window window5 = this.LLJJJIL.getWindow();
            if (window5 != null) {
                window5.setStatusBarColor(0);
            }
        } else {
            Window window6 = this.LLJJJIL.getWindow();
            if (window6 != null) {
                window6.clearFlags(256);
            }
            Window window7 = this.LLJJJIL.getWindow();
            if (window7 != null) {
                window7.clearFlags(65536);
            }
            Window window8 = this.LLJJJIL.getWindow();
            if (window8 != null) {
                window8.clearFlags(Integer.MIN_VALUE);
            }
        }
        Integer numValueOf = null;
        if (Intrinsics.LJFF(this.LLIZLLLIL, "lite")) {
            DialogC1321700kUy dialogC1321700kUy = this.LLJJJIL;
            if (dialogC1321700kUy != null && (window2 = dialogC1321700kUy.getWindow()) != null && (decorView4 = window2.getDecorView()) != null) {
                numValueOf = Integer.valueOf(decorView4.getSystemUiVisibility());
            }
            iIntValue = numValueOf.intValue();
            i = 9472;
        } else {
            DialogC1321700kUy dialogC1321700kUy2 = this.LLJJJIL;
            if (dialogC1321700kUy2 != null && (window = dialogC1321700kUy2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                numValueOf = Integer.valueOf(decorView.getSystemUiVisibility());
            }
            iIntValue = numValueOf.intValue();
            i = 1280;
        }
        int i2 = iIntValue | i;
        if (z) {
            Window window9 = this.LLJJJIL.getWindow();
            if (window9 != null && (decorView3 = window9.getDecorView()) != null) {
                decorView3.setSystemUiVisibility(i2);
                return;
            }
            return;
        }
        Window window10 = this.LLJJJIL.getWindow();
        if (window10 == null || (decorView2 = window10.getDecorView()) == null) {
            return;
        }
        decorView2.setSystemUiVisibility(0);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new AndroidView(context);
    }

    @InterfaceC1312540kGC(name = "android-hide-navigation-bar")
    public final void hideNavBar(boolean z) {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        Window window3;
        View decorView3;
        Integer numValueOf = null;
        if (z) {
            DialogC1321700kUy dialogC1321700kUy = this.LLJJJIL;
            if (dialogC1321700kUy != null && (window3 = dialogC1321700kUy.getWindow()) != null && (decorView3 = window3.getDecorView()) != null) {
                numValueOf = Integer.valueOf(decorView3.getSystemUiVisibility());
            }
            int iIntValue = numValueOf.intValue() | 4866;
            DialogC1321700kUy dialogC1321700kUy2 = this.LLJJJIL;
            if (dialogC1321700kUy2 != null && (window2 = dialogC1321700kUy2.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
                decorView2.setSystemUiVisibility(iIntValue);
                return;
            }
            return;
        }
        DialogC1321700kUy dialogC1321700kUy3 = this.LLJJJIL;
        if (dialogC1321700kUy3 == null || (window = dialogC1321700kUy3.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(256);
    }

    @InterfaceC1312540kGC(name = "android-adapt-edge-to-edge")
    public final void setAdaptEdgeToEdge(boolean z) {
        Window window = getWindow();
        if (window != null && Build.VERSION.SDK_INT >= 35) {
            C0DRA.LIZ(window, !z);
        }
    }

    @InterfaceC1312540kGC(name = "always-show")
    public final void setAlwaysShow(boolean z) {
        this.LLJILLL = z;
    }

    @InterfaceC1312540kGC(name = "android-set-soft-input-mode")
    public final void setAndroidSetSoftInputMode(String str) {
        Window window;
        if ("unspecified".equals(str)) {
            Window window2 = this.LLJJJIL.getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(0);
                return;
            }
            return;
        }
        if ("nothing".equals(str)) {
            Window window3 = this.LLJJJIL.getWindow();
            if (window3 == null) {
                return;
            }
            window3.setSoftInputMode(48);
            return;
        }
        if ("pan".equals(str)) {
            Window window4 = this.LLJJJIL.getWindow();
            if (window4 == null) {
                return;
            }
            window4.setSoftInputMode(32);
            return;
        }
        if (!"resize".equals(str) || (window = this.LLJJJIL.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }

    @InterfaceC1312540kGC(name = "android-container-popup-tag")
    public final void setContainerPopupTag(String str) {
        this.LLJJJIL.LLILLL = str;
    }

    @InterfaceC1312540kGC(name = "cut-out-mode")
    public final void setCutOutMode(boolean z) {
        Window window;
        WindowManager.LayoutParams attributes;
        int i;
        this.LLILZIL = z;
        DialogC1321700kUy dialogC1321700kUy = this.LLJJJIL;
        if (dialogC1321700kUy != null && (window = dialogC1321700kUy.getWindow()) != null && (attributes = window.getAttributes()) != null && Build.VERSION.SDK_INT >= 28) {
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            attributes.layoutInDisplayCutoutMode = i;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map == null) {
            return;
        }
        this.LLJJI = map.containsKey("overlaymoved");
        boolean zContainsKey = map.containsKey("overlaytouch");
        this.LLJJIII = zContainsKey;
        if (this.LLJJI || zContainsKey) {
            this.LLJJIJI = VelocityTracker.obtain();
            DialogC1321700kUy dialogC1321700kUy = this.LLJJJIL;
            if (dialogC1321700kUy != null) {
                dialogC1321700kUy.LLILLJJLI = new C1321800kV8(this);
            }
        }
    }

    @InterfaceC1312540kGC(name = "events-pass-through")
    public final void setEventsPassThrough(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.LLIZ = true;
        ReadableType type = interfaceC1298070jsr.getType();
        if (type != null) {
            int i = C1297770jsN.LIZ[type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LLILZLL = interfaceC1298070jsr.asBoolean();
                    return;
                }
                return;
            }
            this.LLILZLL = Boolean.parseBoolean(interfaceC1298070jsr.asString());
        }
    }

    @InterfaceC1312540kGC(name = "android-full-screen")
    public final void setFullScreen(boolean z) {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        if (z) {
            DialogC1321700kUy dialogC1321700kUy = this.LLJJJIL;
            Integer numValueOf = null;
            if (dialogC1321700kUy != null && (window2 = dialogC1321700kUy.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
                numValueOf = Integer.valueOf(decorView2.getSystemUiVisibility());
            }
            int iIntValue = numValueOf.intValue() | 5894;
            DialogC1321700kUy dialogC1321700kUy2 = this.LLJJJIL;
            if (dialogC1321700kUy2 != null && (window = dialogC1321700kUy2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setSystemUiVisibility(iIntValue);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(name = "ignore-focus")
    public void setIgnoreFocus(InterfaceC1298070jsr interfaceC1298070jsr) {
        boolean z;
        super.setIgnoreFocus(interfaceC1298070jsr);
        if (this.mIgnoreFocus == EnumC1311650kEl.Enable) {
            z = true;
        } else {
            z = false;
        }
        setFocusable(!z);
        setFocusableInTouchMode(!z);
        if (z) {
            Window window = this.LLJJJIL.getWindow();
            if (window != null) {
                window.clearFlags(131072);
            }
            Window window2 = this.LLJJJIL.getWindow();
            if (window2 != null) {
                window2.setFlags(8, 8);
                return;
            }
            return;
        }
        Window window3 = this.LLJJJIL.getWindow();
        if (window3 == null) {
            return;
        }
        window3.clearFlags(8);
    }

    @InterfaceC1312540kGC(name = "android-lazy-init-context")
    public final void setLazyInitContext(boolean z) {
        this.LLJ = z;
    }

    @InterfaceC1312540kGC(defaultInt = 1, name = "level")
    public final void setLevel(int i) {
        Number number = this.LLJJJIL.LLILZ;
        if ((number instanceof Integer) && i == number.intValue()) {
            return;
        }
        if (this.LLJJJIL.isShowing()) {
            LynxError lynxError = new LynxError(229800, "Overlay set Level error!", "The visible attribute needs to default to false. After creation, change visible to true at the appropriate time", "error");
            lynxError.LIZ = true;
            this.mContext.LJIILLIIL(lynxError);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        LJJIJL(2);
                    } else {
                        LJJIJL(LSPassThroughRecordSizeConfig.DEFAULT);
                    }
                } else {
                    LJJIJL(1002);
                }
            } else {
                LJJIJL(1);
            }
        } else {
            LJJIJL(2);
        }
        this.LLJJJIL.LLILZ = Integer.valueOf(i);
    }

    @InterfaceC1312540kGC(name = "android-native-event-pass")
    public final void setNativeEventPass(boolean z) {
        if (z) {
            Window window = this.LLJJJIL.getWindow();
            if (window != null) {
                window.addFlags(16);
                return;
            }
            return;
        }
        Window window2 = this.LLJJJIL.getWindow();
        if (window2 == null) {
            return;
        }
        window2.clearFlags(16);
    }

    @InterfaceC1312540kGC(name = "nest-scroll")
    public final void setNestScroll(String str) {
        this.LLJIJIL = str;
        this.LLJILJIL = null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setParent(InterfaceC1313090kH5 interfaceC1313090kH5) {
        super.setParent(interfaceC1313090kH5);
        if (interfaceC1313090kH5 == null) {
            hide();
        } else {
            if (!this.LLILLL) {
                return;
            }
            LJJIJLIJ();
        }
    }

    @InterfaceC1312540kGC(name = "status-bar-translucent")
    public final void setStatusBarTranslucent(InterfaceC1298070jsr interfaceC1298070jsr) {
        ReadableType type = interfaceC1298070jsr.getType();
        if (type != null) {
            int i = C1297770jsN.LIZ[type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LLILZ = interfaceC1298070jsr.asBoolean();
                }
            } else {
                this.LLILZ = Boolean.parseBoolean(interfaceC1298070jsr.asString());
            }
        }
        LJJIZ(this.LLILZ);
    }

    @InterfaceC1312540kGC(name = "status-bar-translucent-style")
    public final void setStatusBarTranslucentStyle(String str) {
        if (str == null) {
            str = "dark";
        }
        this.LLIZLLLIL = str;
        LJJIZ(this.LLILZ);
    }

    @InterfaceC1312540kGC(name = "visible")
    public final void setVisible(InterfaceC1298070jsr interfaceC1298070jsr) {
        ReadableType type = interfaceC1298070jsr.getType();
        if (type != null) {
            int i = C1297770jsN.LIZ[type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LLILLL = interfaceC1298070jsr.asBoolean();
                }
            } else {
                this.LLILLL = Boolean.parseBoolean(interfaceC1298070jsr.asString());
            }
        }
        if (this.LLILLL) {
            LJJIJLIJ();
        } else {
            hide();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0kH3, android.view.View, android.view.ViewGroup] */
    public LynxOverlayView(final s sVar, LynxUIOverlay lynxUIOverlay) {
        super(sVar);
        this.LL = lynxUIOverlay;
        this.LLILZ = true;
        this.LLILZIL = true;
        this.LLILZLL = true;
        this.LLIZLLLIL = "dark";
        this.LLJILLL = true;
        this.LLJJ = true;
        DialogC1321700kUy dialogC1321700kUy = new DialogC1321700kUy(sVar, this);
        this.LLJJJIL = dialogC1321700kUy;
        ?? r2 = new AndroidView(sVar) { // from class: X.0kH3
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
        this.LLJJJJ = r2;
        this.LLJJJJJIL = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        Window window = dialogC1321700kUy.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        Window window2 = dialogC1321700kUy.getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.0f);
        }
        r2.addView(this.mView, -1, -1);
        dialogC1321700kUy.setContentView(r2, new ViewGroup.LayoutParams(-1, -1));
        dialogC1321700kUy.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0kV4
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                LynxOverlayView lynxOverlayView = this.LL;
                int i2 = LynxOverlayView.LLJLILLLLZIIL;
                if (i == 4 && keyEvent.getAction() == 0) {
                    lynxOverlayView.mContext.LLIZ.LIZIZ(new C1289960jfm(lynxOverlayView.getSign(), "requestclose"));
                    return true;
                }
                return false;
            }
        });
        setAdaptEdgeToEdge(false);
        r2.setClickable(true);
        r2.setFocusable(true);
        r2.setFocusableInTouchMode(true);
        this.LLJJJJLIIL = new C1311380kEK(sVar.LJIILIIL());
        LJJIZ(this.LLILZ);
    }

    public final void LJJIJIL(int i, Context context) {
        String strLIZIZ;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        strLIZIZ = "";
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("context is not activity, context is ");
                        sbLIZ.append(context);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("show success, context is ");
                    sbLIZ2.append(context);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("context is finishing, context is ");
                sbLIZ3.append(context);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("context is destroyed, context is ");
            sbLIZ4.append(context);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        }
        C1298720jtu c1298720jtu = this.mContext.LLIZ;
        C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "showoverlay");
        c1289960jfm.LIZIZ(Integer.valueOf(i), "errorCode");
        c1289960jfm.LIZIZ(strLIZIZ, "errorMsg");
        c1298720jtu.LIZIZ(c1289960jfm);
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
                    LynxLog.i("overlay", "hit the event through active regions!");
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
        if (this.LLJJ && this.LLJJJJJIL[0] == Integer.MIN_VALUE) {
            LJJJ();
        }
        super.onInsertChild(lynxBaseUI, i);
    }

    public final void LJJIJIIJIL(float f, float f2, float f3, float f4, String str) {
        C1298720jtu c1298720jtu = this.mContext.LLIZ;
        C1289960jfm c1289960jfm = new C1289960jfm(getSign(), str);
        c1289960jfm.LIZIZ(Float.valueOf(f), "x");
        c1289960jfm.LIZIZ(Float.valueOf(f2), "y");
        c1289960jfm.LIZIZ(Float.valueOf(f3), "vx");
        c1289960jfm.LIZIZ(Float.valueOf(f4), "vy");
        c1289960jfm.LIZIZ(Integer.valueOf(this.LLILLJJLI), "state");
        c1298720jtu.LIZIZ(c1289960jfm);
    }
}
