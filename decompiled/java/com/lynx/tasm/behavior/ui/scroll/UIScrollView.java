package com.lynx.tasm.behavior.ui.scroll;

import X.AbstractC1311530kEZ;
import X.C1289620jfE;
import X.C1289960jfm;
import X.C1292490jjr;
import X.C1299120juY;
import X.C1310290kCZ;
import X.C1310360kCg;
import X.C1311130kDv;
import X.C1311420kEO;
import X.C1312920kGo;
import X.C1317510kOD;
import X.C1318590kPx;
import X.C1318600kPy;
import X.C1318620kQ0;
import X.C1318640kQ2;
import X.C1318660kQ4;
import X.C1318800kQI;
import X.C20094213jo;
import X.C2188811AlT;
import X.InterfaceC1312540kGC;
import X.InterfaceC1314580kJU;
import X.InterfaceC1318670kQ5;
import X.InterfaceC1967107nB;
import Y.ARunnableS0S0200010_20;
import Y.ARunnableS7S0100002_20;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.list.container.UIListContainer;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import j27.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ttpobfuscated.e3;
import u4.q0;

/* JADX INFO: loaded from: classes21.dex */
public class UIScrollView extends AbsLynxUIScroll<C1318590kPx> implements InterfaceC1314580kJU {
    public static final /* synthetic */ int LLJZIJLIL = 0;
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public ArrayList<Integer> LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public UIBounceView LLJJJJ;
    public UIBounceView LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public C1318800kQI LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public int LLJLIL;
    public Callback LLJLILLLLZIIL;
    public String LLJLL;
    public int LLJLLIL;
    public String LLJLLL;
    public final HashMap<String, Integer> LLJZ;

    @Override // X.InterfaceC1314580kJU
    public final void LJJIII() {
        this.LLJILJIL = true;
        LJJJJ();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityHostUI() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollContainer() {
        return true;
    }

    @Override // X.InterfaceC1314580kJU
    public final void LIZLLL() {
        if (!this.LLJILJIL || this.LLJILLL == null || this.mContext == null) {
            return;
        }
        int realScrollY = this.LL ? ((C1318590kPx) this.mView).getRealScrollY() : ((C1318590kPx) this.mView).getRealScrollX();
        int height = this.LL ? getHeight() : getWidth();
        int iMax = Math.max((this.LL ? ((C1318590kPx) this.mView).getContentHeight() : ((C1318590kPx) this.mView).getContentWidth()) - height, 0);
        for (int i = 0; i < this.LLJILLL.size(); i++) {
            LynxBaseUI lynxBaseUILJ = this.mContext.LJ(((Integer) ListProtector.get(this.LLJILLL, i)).intValue());
            if (lynxBaseUILJ != null) {
                lynxBaseUILJ.calculateStickyTranslateWithOffset(realScrollY, this.LL, height, iMax);
            }
        }
    }

    public final LynxBaseUI LJJIJLIJ() {
        LynxBaseUI lynxBaseUILJIILLIIL = this.mContext.LJIILIIL().LJIILLIIL(this.LLJLLIL);
        if ((lynxBaseUILJIILLIIL instanceof UIList) || (lynxBaseUILJIILLIIL instanceof UIListContainer)) {
            return lynxBaseUILJIILLIIL;
        }
        return null;
    }

    public final int LJJIZ() {
        return (this.LL ? ((C1318590kPx) this.mView).getContentHeight() : ((C1318590kPx) this.mView).getContentWidth()) - LJJJ();
    }

    public final int LJJJ() {
        int width;
        int paddingRight;
        if (this.LL) {
            width = getHeight() - this.mView.getPaddingBottom();
            paddingRight = this.mView.getPaddingTop();
        } else {
            width = getWidth() - this.mView.getPaddingLeft();
            paddingRight = this.mView.getPaddingRight();
        }
        return width - paddingRight;
    }

    public final void LJJJI() {
        if (this.LLJJIII > 0 && (this.mFirstRender || LJJIJLIJ() == null || !LJJIJLIJ().initialPropsFlushed("initialScrollOffset", LJJIJL()))) {
            if (LJJIJLIJ() != null) {
                LJJIJLIJ().setInitialPropsHasFlushed("initialScrollOffset", LJJIJL());
            }
            if (this.LL && this.LLJJIII + getHeight() <= ((C1318590kPx) this.mView).getContentHeight()) {
                ((C1318590kPx) this.mView).LJII(((C1318590kPx) this.mView).getRealScrollX(), this.LLJJIII, false);
                LJJJJL(0);
            } else if (!this.LL && this.LLJJIII + getWidth() <= ((C1318590kPx) this.mView).getContentWidth()) {
                ((C1318590kPx) this.mView).LJII(this.LLJJIII, ((C1318590kPx) this.mView).getRealScrollY(), false);
                LJJJJL(0);
            }
        }
        if (this.LLJJJIL != -1) {
            if (this.mFirstRender || LJJIJLIJ() == null || !LJJIJLIJ().initialPropsFlushed("initialScrollIndex", LJJIJL())) {
                if (LJJIJLIJ() != null) {
                    LJJIJLIJ().setInitialPropsHasFlushed("initialScrollIndex", LJJIJL());
                }
                ((C1318590kPx) this.mView).setScrollToIndex(this.LLJJJIL);
            }
            this.LLJJJIL = -1;
        }
    }

    public final void LJJJIL() {
        if (this.LL) {
            ((C1318590kPx) this.mView).setOrientation(1);
        } else {
            ((C1318590kPx) this.mView).setOrientation(0);
        }
    }

    public final void LJJJJIZL() {
        UIBounceView uIBounceView;
        int width;
        int height;
        if (this.LLJJJJLIIL || (uIBounceView = this.LLJJJJ) == null) {
            return;
        }
        if (this.LL) {
            if (uIBounceView.LL != 3 || uIBounceView.getTop() >= getScrollY() + getHeight()) {
                UIBounceView uIBounceView2 = this.LLJJJJ;
                if (uIBounceView2.LL != 2 || uIBounceView2.getHeight() <= getScrollY()) {
                    return;
                } else {
                    height = this.LLJJJJ.getHeight();
                }
            } else {
                height = this.LLJJJJ.getTop() - getHeight();
            }
            if (height > 0) {
                T t = this.mView;
                if (t != 0) {
                    ((C1318590kPx) t).fling((int) 0.0d);
                }
                ((C1318590kPx) this.mView).LJII(0, height, true);
                return;
            }
            return;
        }
        if (uIBounceView.LL != 0 || uIBounceView.getLeft() >= getScrollX() + getWidth()) {
            UIBounceView uIBounceView3 = this.LLJJJJ;
            if (uIBounceView3.LL != 1 || uIBounceView3.getWidth() <= getScrollX()) {
                return;
            } else {
                width = this.LLJJJJ.getWidth();
            }
        } else {
            width = this.LLJJJJ.getLeft() - getWidth();
        }
        if (width > 0) {
            T t2 = this.mView;
            if (t2 != 0) {
                ((C1318590kPx) t2).getHScrollView().fling((int) 0.0d);
            }
            ((C1318590kPx) this.mView).LJII(width, 0, true);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final View getRealParentView() {
        C1318590kPx c1318590kPx = (C1318590kPx) this.mView;
        return (this.LL || c1318590kPx == null) ? c1318590kPx : c1318590kPx.getHScrollView();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getScrollContainerDirection() {
        return ((C1318590kPx) this.mView).LLJJJ ? -1 : 1;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollX() {
        return ((C1318590kPx) this.mView).getHScrollView().getScrollX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollY() {
        return this.mView.getScrollY();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1313090kH5
    public final void invalidate() {
        ((C1318590kPx) this.mView).getLinearLayout().invalidate();
        this.mView.invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        boolean z = ((C1318590kPx) this.mView).getOrientation() == 0;
        int width = getWidth();
        int height = getHeight();
        for (int i = 0; i < getChildCount(); i++) {
            LynxBaseUI childAt = getChildAt(i);
            if (z) {
                width = Math.max(width, childAt.getWidth() + childAt.getLeft() + childAt.mMarginRight + this.mPaddingRight);
            } else {
                height = Math.max(height, childAt.getHeight() + childAt.getTop() + childAt.mMarginBottom + this.mPaddingBottom);
            }
        }
        if (((C1318590kPx) this.mView).getContentWidth() != width || ((C1318590kPx) this.mView).getContentHeight() != height) {
            float f = width;
            float f2 = height;
            if (this.LLJIJIL) {
                C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "contentsizechanged");
                c1289960jfm.LIZIZ(Float.valueOf(C1311130kDv.LIZJ(f)), "scrollWidth");
                c1289960jfm.LIZIZ(Float.valueOf(C1311130kDv.LIZJ(f2)), "scrollHeight");
                s sVar = this.mContext;
                if (sVar != null) {
                    sVar.LLIZ.LIZIZ(c1289960jfm);
                }
            }
            C1318590kPx c1318590kPx = (C1318590kPx) this.mView;
            c1318590kPx.LLJJJJJIL = height;
            c1318590kPx.LLJJJJ = width;
            C1318660kQ4 c1318660kQ4 = c1318590kPx.LLJJI;
            if (c1318660kQ4 != null) {
                c1318660kQ4.requestLayout();
            }
            C1318590kPx c1318590kPx2 = (C1318590kPx) this.mView;
            c1318590kPx2.LJI(c1318590kPx2.getScrollX(), this.mView.getScrollY());
            this.LLJILJILJ = true;
        }
        super.measure();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final void onInvalidate() {
        if (this.mView == 0 || !isEnableNewGesture()) {
            return;
        }
        this.mView.postInvalidateOnAnimation();
    }

    public final String LJJIJL() {
        return constructListStateCacheKey(getTagName(), this.LLJLLL, getIdSelector());
    }

    public final void LJJJJ() {
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        for (int i = 0; i < this.mChildren.size(); i++) {
            ((LynxBaseUI) ListProtector.get(this.mChildren, i)).checkStickyOnParentScroll(scrollX, scrollY);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        this.LLJLILLLLZIIL = null;
        ArrayList<InterfaceC1318670kQ5> arrayList = ((C1318590kPx) this.mView).LLJJJJLIIL;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final View getAccessibilityHostView() {
        return getRealParentView();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final Rect getBoundRectForOverflow() {
        return super.getClipBounds();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final Map<Integer, AbstractC1311530kEZ> getGestureHandlers() {
        return super.getGestureHandlers();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getMemberScrollX() {
        return getScrollX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getMemberScrollY() {
        return getScrollY();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        C1310290kCZ c1310290kCZ;
        if (getOverflow() != 0) {
            ((ViewGroup) this.mView).setClipChildren(false);
            if (((C1318590kPx) this.mView).getHScrollView() != null) {
                ((C1318590kPx) this.mView).getHScrollView().setClipChildren(false);
            }
            if (((C1318590kPx) this.mView).getLinearLayout() != null) {
                ((C1318590kPx) this.mView).getLinearLayout().setClipToPadding(false);
            }
        }
        if (this.LLJJJJLIIL) {
            if (!this.LL) {
                UIBounceView uIBounceView = this.LLJJJJJIL;
                int width = uIBounceView != null ? uIBounceView.getWidth() : 0;
                C1318600kPy hScrollView = ((C1318590kPx) this.mView).getHScrollView();
                int iLJJIZ = LJJIZ();
                C1318640kQ2 c1318640kQ2 = hScrollView.LLJJIJI;
                if (c1318640kQ2 != null) {
                    if (iLJJIZ != c1318640kQ2.LJ || width != c1318640kQ2.LJFF) {
                        hScrollView.requestLayout();
                    }
                    C1318640kQ2 c1318640kQ22 = hScrollView.LLJJIJI;
                    c1318640kQ22.LJ = iLJJIZ;
                    c1318640kQ22.LJFF = width;
                }
            } else if (this.LL) {
                UIBounceView uIBounceView2 = this.LLJJJJJIL;
                int height = uIBounceView2 != null ? uIBounceView2.getHeight() : 0;
                C1318620kQ0 c1318620kQ0 = (C1318620kQ0) this.mView;
                int iLJJIZ2 = LJJIZ();
                C1318640kQ2 c1318640kQ23 = c1318620kQ0.LLJ;
                if (c1318640kQ23 != null) {
                    if (iLJJIZ2 != c1318640kQ23.LJ || height != c1318640kQ23.LJFF) {
                        c1318620kQ0.requestLayout();
                    }
                    C1318640kQ2 c1318640kQ24 = c1318620kQ0.LLJ;
                    c1318640kQ24.LJ = iLJJIZ2;
                    c1318640kQ24.LJFF = height;
                }
            }
        }
        super.layout();
        int i = this.LLJJI;
        if (i > 0) {
            if (this.LL && i + getHeight() <= ((C1318590kPx) this.mView).getContentHeight()) {
                ((C1318590kPx) this.mView).LJII(((C1318590kPx) this.mView).getRealScrollX(), this.LLJJI, false);
                this.LLJJI = 0;
            } else if (!this.LL && this.LLJJI + getWidth() <= ((C1318590kPx) this.mView).getContentWidth()) {
                ((C1318590kPx) this.mView).LJII(this.LLJJI, ((C1318590kPx) this.mView).getRealScrollY(), false);
                this.LLJJI = 0;
            }
        }
        if (this.LLJILJILJ) {
            this.LLJILJILJ = false;
            s sVar = this.mContext;
            if (sVar == null || (c1310290kCZ = sVar.LLLIIII) == null || !c1310290kCZ.LJJJI) {
                return;
            }
            LIZLLL();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        ((C1318590kPx) this.mView).setPadding(i, this.mPaddingTop + this.mBorderTopWidth, i2, this.mPaddingBottom + this.mBorderBottomWidth);
        this.LLJILJILJ = true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReady() {
        C1310290kCZ c1310290kCZ;
        super.onNodeReady();
        int i = this.LLJLIL;
        if (i > 0) {
            this.mView.setFadingEdgeLength(i);
            this.mView.setHorizontalFadingEdgeEnabled(!this.LL);
            this.mView.setVerticalFadingEdgeEnabled(this.LL);
        }
        if (this.LLJL) {
            if (this.LL) {
                T t = this.mView;
                t.getClass();
                try {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(t.getContext());
                    Field declaredField = ScrollView.class.getDeclaredField("mTouchSlop");
                    if (viewConfiguration != null && declaredField != null) {
                        int scaledPagingTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                        declaredField.setAccessible(true);
                        declaredField.set(t, Integer.valueOf(scaledPagingTouchSlop));
                    }
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                    LynxLog.e("LynxNestedScrollView", "Failed to get mTouchSlop field of NestedScrollView!");
                } catch (NoSuchFieldException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    LynxLog.e("LynxNestedScrollView", "Failed to get mTouchSlop field of NestedScrollView!");
                }
            } else {
                C1318600kPy hScrollView = ((C1318590kPx) this.mView).getHScrollView();
                hScrollView.getClass();
                try {
                    ViewConfiguration viewConfiguration2 = ViewConfiguration.get(hScrollView.getContext());
                    Field declaredField2 = HorizontalScrollView.class.getDeclaredField("mTouchSlop");
                    if (viewConfiguration2 != null && declaredField2 != null) {
                        int scaledPagingTouchSlop2 = viewConfiguration2.getScaledPagingTouchSlop();
                        declaredField2.setAccessible(true);
                        declaredField2.set(hScrollView, Integer.valueOf(scaledPagingTouchSlop2));
                        hScrollView.LLILZLL = scaledPagingTouchSlop2;
                    }
                } catch (IllegalAccessException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    LynxLog.e("LynxNestedHorizontalScrollView", "Failed to get mTouchSlop field of HorizontalScrollView!");
                } catch (NoSuchFieldException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    LynxLog.e("LynxNestedHorizontalScrollView", "Failed to get mTouchSlop field of HorizontalScrollView!");
                }
            }
        }
        this.mFirstRender = false;
        if (this.LLJILJILJ) {
            this.LLJILJILJ = false;
            s sVar = this.mContext;
            if (sVar == null || (c1310290kCZ = sVar.LLLIIII) == null || !c1310290kCZ.LJJJI) {
                return;
            }
            LIZLLL();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReload() {
        super.onNodeReload();
        if (this.mLynxDirection == 2) {
            ((C1318590kPx) this.mView).LJII(LJJIZ(), 0, false);
        } else {
            ((C1318590kPx) this.mView).LJII(0, 0, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [X.0kQI] */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.LL) {
            ((C1318620kQ0) this.mView).setEnableNewBounce(this.LLJJJJLIIL);
        } else {
            ((C1318590kPx) this.mView).getHScrollView().setEnableNewBounce(this.LLJJJJLIIL);
        }
        C1310360kCg c1310360kCgLJIIL = this.mContext.LJIIL();
        if (c1310360kCgLJIIL != null) {
            if (c1310360kCgLJIIL.LJ() || c1310360kCgLJIIL.LJFF()) {
                if (this.LLJJL == null) {
                    this.LLJJL = new C20094213jo() { // from class: X.0kQI
                        @Override // X.C20094213jo
                        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                            boolean z;
                            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                            int iLJJIZ = this.LIZ.LJJIZ();
                            if (this.LIZ.LLJJLIIIJLLLLLLLZ && iLJJIZ > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            accessibilityEvent.setScrollable(z);
                            accessibilityEvent.setScrollX(((C1318590kPx) this.LIZ.mView).getRealScrollX());
                            accessibilityEvent.setScrollY(((C1318590kPx) this.LIZ.mView).getRealScrollY());
                            UIScrollView uIScrollView = this.LIZ;
                            if (uIScrollView.LL) {
                                accessibilityEvent.setMaxScrollX(((C1318590kPx) uIScrollView.mView).getRealScrollX());
                                accessibilityEvent.setMaxScrollY(iLJJIZ);
                            } else {
                                accessibilityEvent.setMaxScrollX(iLJJIZ);
                                accessibilityEvent.setMaxScrollY(((C1318590kPx) this.LIZ.mView).getRealScrollY());
                            }
                        }

                        @Override // X.C20094213jo
                        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                            boolean z;
                            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                            int iLJJIZ = this.LIZ.LJJIZ();
                            if (this.LIZ.LLJJLIIIJLLLLLLLZ && iLJJIZ > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            accessibilityNodeInfoCompat.setScrollable(z);
                            if (z) {
                                UIScrollView uIScrollView = this.LIZ;
                                if (uIScrollView.LL) {
                                    if (((C1318590kPx) uIScrollView.mView).getRealScrollY() > 0) {
                                        accessibilityNodeInfoCompat.addAction(C20092413jW.LJIILL);
                                        return;
                                    } else {
                                        if (((C1318590kPx) this.LIZ.mView).getRealScrollY() >= iLJJIZ) {
                                            return;
                                        }
                                        accessibilityNodeInfoCompat.addAction(C20092413jW.LJIILJJIL);
                                        return;
                                    }
                                }
                                if (((C1318590kPx) uIScrollView.mView).getRealScrollX() > 0) {
                                    accessibilityNodeInfoCompat.addAction(C20092413jW.LJIILL);
                                } else {
                                    if (((C1318590kPx) this.LIZ.mView).getRealScrollX() >= iLJJIZ) {
                                        return;
                                    }
                                    accessibilityNodeInfoCompat.addAction(C20092413jW.LJIILJJIL);
                                }
                            }
                        }

                        @Override // X.C20094213jo
                        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                            int iLJJJ = this.LIZ.LJJJ();
                            int iLJJIZ = this.LIZ.LJJIZ();
                            UIScrollView uIScrollView = this.LIZ;
                            if (!uIScrollView.LLJJLIIIJLLLLLLLZ || iLJJIZ <= 0) {
                                return false;
                            }
                            int realScrollX = ((C1318590kPx) uIScrollView.mView).getRealScrollX();
                            int realScrollY = ((C1318590kPx) this.LIZ.mView).getRealScrollY();
                            if (i != 4096) {
                                if (i != 8192) {
                                    return false;
                                }
                                if (this.LIZ.LL) {
                                    int iMax = Math.max(realScrollY - (iLJJJ / 2), 0);
                                    if (iMax != realScrollY) {
                                        ((C1318590kPx) this.LIZ.mView).LJII(0, iMax, true);
                                    }
                                } else {
                                    int iMax2 = Math.max(realScrollX - (iLJJJ / 2), 0);
                                    if (iMax2 != realScrollX) {
                                        ((C1318590kPx) this.LIZ.mView).LJII(iMax2, 0, true);
                                        return true;
                                    }
                                }
                                return true;
                            }
                            if (this.LIZ.LL) {
                                int iMin = Math.min((iLJJJ / 2) + realScrollY, iLJJIZ);
                                if (iMin != realScrollY) {
                                    ((C1318590kPx) this.LIZ.mView).LJII(0, iMin, true);
                                }
                            } else {
                                int iMin2 = Math.min((iLJJJ / 2) + realScrollX, iLJJIZ);
                                if (iMin2 != realScrollX) {
                                    ((C1318590kPx) this.LIZ.mView).LJII(iMin2, 0, true);
                                    return true;
                                }
                            }
                            return true;
                        }
                    };
                }
                if (this.LL) {
                    q0.LJIJ(this.mView, this.LLJJL);
                    q0.LJIJ(((C1318590kPx) this.mView).getHScrollView(), null);
                } else {
                    q0.LJIJ(this.mView, null);
                    q0.LJIJ(((C1318590kPx) this.mView).getHScrollView(), this.LLJJL);
                }
                if (c1310360kCgLJIIL.LJFF()) {
                    this.mView.setImportantForAccessibility(this.LL ? 1 : 2);
                    ((C1318590kPx) this.mView).getHScrollView().setImportantForAccessibility(this.LL ? 2 : 1);
                    ((C1318590kPx) this.mView).getLinearLayout().setImportantForAccessibility(2);
                }
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityDirectionVertical() {
        return this.LL;
    }

    @Override // X.InterfaceC1314580kJU
    public final void LJIIIZ(int i) {
        if (this.LLJILLL == null) {
            this.LLJILLL = new ArrayList<>();
        }
        if (!this.LLJILLL.contains(Integer.valueOf(i))) {
            this.LLJILLL.add(Integer.valueOf(i));
        }
        this.LLJILJIL = !this.LLJILLL.isEmpty();
    }

    @Override // X.InterfaceC1314580kJU
    public final void LJIILL(int i) {
        ArrayList<Integer> arrayList = this.LLJILLL;
        if (arrayList == null) {
            this.LLJILJIL = false;
        } else {
            arrayList.remove(Integer.valueOf(i));
            this.LLJILJIL = !this.LLJILLL.isEmpty();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJIJ(boolean z) {
        boolean z2;
        if (!this.LLJILJILJ && this.LL != z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.LLJILJILJ = z2;
        this.LL = !z;
        LJJJIL();
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJIJIIJI(boolean z) {
        boolean z2;
        if (!this.LLJILJILJ && this.LL == z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.LLJILJILJ = z2;
        this.LL = z;
        LJJJIL();
    }

    public final boolean LJJIJIIJIL(int i) {
        T t = this.mView;
        if (t == 0) {
            return false;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    return ((C1318590kPx) t).getHScrollView().canScrollHorizontally(1);
                }
                return ((C1318590kPx) t).getHScrollView().canScrollHorizontally(-1);
            }
            return ((C1318590kPx) t).canScrollVertically(1);
        }
        return ((C1318590kPx) t).canScrollVertically(-1);
    }

    public final void LJJJJI(int i) {
        if (!this.LLJI) {
            if (i != 0 && i != 3) {
                recognizeGesturere();
                return;
            }
            return;
        }
        if (i != 1 && i != 4) {
            return;
        }
        recognizeGesturere();
    }

    public final void LJJJJL(int i) {
        if (i == 0) {
            this.LLJJIII = 0;
        } else {
            if (LJJIJLIJ() != null) {
                if (LJJIJLIJ().initialPropsFlushed("initialScrollOffset", LJJIJL())) {
                    i = 0;
                }
                this.LLJJIII = i;
                return;
            }
            this.LLJJIII = i;
        }
    }

    public final void LJJJJLI(int i) {
        if (i == -1) {
            this.LLJJJIL = -1;
        } else {
            if (LJJIJLIJ() != null) {
                if (LJJIJLIJ().initialPropsFlushed("initialScrollIndex", LJJIJL())) {
                    i = -1;
                }
                this.LLJJJIL = i;
                return;
            }
            this.LLJJJIL = i;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0kQ3] */
    @InterfaceC1967107nB
    public void autoScroll(ReadableMap readableMap) {
        final C1318590kPx c1318590kPx = (C1318590kPx) this.mView;
        c1318590kPx.getClass();
        double d = readableMap.getDouble("rate", 0.0d);
        if (readableMap.getBoolean("start", true)) {
            int iLIZ = (int) C1311130kDv.LIZ(d / 60.0d);
            if (d == 0.0d) {
                LynxLog.e("LynxUIScrollView", "the rate of speed  is not right, current value is 0");
                return;
            } else {
                if (c1318590kPx.LLJLLL) {
                    return;
                }
                c1318590kPx.LLJLLL = true;
                c1318590kPx.LLJZIJLIL = iLIZ;
                c1318590kPx.LLJLLIL = new Runnable(c1318590kPx) { // from class: X.0kQ3
                    public final WeakReference<C1318590kPx> LL;

                    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
                    
                        r5.LLJLLL = false;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
                    
                        return;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ() {
                        /*
                            r10 = this;
                            java.lang.ref.WeakReference<X.0kPx> r0 = r10.LL
                            if (r0 == 0) goto L40
                            java.lang.Object r0 = r0.get()
                            if (r0 == 0) goto L40
                            java.lang.ref.WeakReference<X.0kPx> r0 = r10.LL
                            java.lang.Object r0 = r0.get()
                            X.0kPx r0 = (X.C1318590kPx) r0
                            X.0kQ4 r0 = r0.LLJJI
                            if (r0 == 0) goto L40
                            java.lang.ref.WeakReference<X.0kPx> r0 = r10.LL
                            java.lang.Object r5 = r0.get()
                            X.0kPx r5 = (X.C1318590kPx) r5
                            boolean r0 = r5.LLJLLL
                            if (r0 == 0) goto L40
                            int r9 = r5.getRealScrollX()
                            int r8 = r5.getRealScrollY()
                            int r7 = r5.LLJZIJLIL
                            X.0kQ4 r6 = r5.LLJJI
                            boolean r0 = r5.LLJJJ
                            r1 = 16
                            r4 = 0
                            if (r0 != 0) goto L57
                            int r3 = r8 + r7
                            r5.LJII(r9, r3, r4)
                            if (r7 >= 0) goto L45
                            if (r8 > 0) goto L41
                            r5.LLJLLL = r4
                        L40:
                            return
                        L41:
                            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r5, r10, r1)
                            return
                        L45:
                            int r0 = r5.getMeasuredHeight()
                            int r3 = r3 + r0
                            int r0 = r6.getMeasuredHeight()
                            if (r3 >= r0) goto L54
                            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r5, r10, r1)
                            return
                        L54:
                            r5.LLJLLL = r4
                            return
                        L57:
                            int r3 = r5.getLayoutDirection()
                            r0 = 1
                            if (r3 != r0) goto L7c
                            int r3 = r9 - r7
                        L60:
                            r5.LJII(r3, r8, r4)
                            if (r7 >= 0) goto L83
                            int r0 = r5.getLayoutDirection()
                            if (r0 != 0) goto L70
                            if (r9 > 0) goto L7f
                        L6d:
                            r5.LLJLLL = r4
                            return
                        L70:
                            int r0 = r5.getMeasuredWidth()
                            int r3 = r3 + r0
                            int r0 = r6.getMeasuredWidth()
                            if (r3 < r0) goto L7f
                            goto L6d
                        L7c:
                            int r3 = r9 + r7
                            goto L60
                        L7f:
                            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r5, r10, r1)
                            return
                        L83:
                            if (r3 <= 0) goto L94
                            int r0 = r5.getMeasuredWidth()
                            int r3 = r3 + r0
                            int r0 = r6.getMeasuredWidth()
                            if (r3 >= r0) goto L94
                            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r5, r10, r1)
                            return
                        L94:
                            r5.LLJLLL = r4
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1318650kQ3.LIZ():void");
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AndroidScrollView$SmoothScrollRunnable@8a10.run");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AndroidScrollView$SmoothScrollRunnable@8a10.run");
                    }

                    {
                        this.LL = new WeakReference<>(c1318590kPx);
                    }
                };
                HandlerHook.viewPost(c1318590kPx, c1318590kPx.LLJLLIL);
                return;
            }
        }
        c1318590kPx.LLJLLL = false;
        c1318590kPx.LLJZIJLIL = 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void consumeGesture(boolean z) {
        C1318590kPx c1318590kPx = (C1318590kPx) this.mView;
        c1318590kPx.LLJILJILJ = Boolean.valueOf(z);
        if (z) {
            c1318590kPx.LLJILJIL = false;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        final C1318590kPx c1318590kPx = new C1318590kPx(context, this);
        c1318590kPx.setOnScrollListener(new InterfaceC1318670kQ5() { // from class: X.0kPw
            @Override // X.InterfaceC1318670kQ5
            public final void LIZJ() {
                UIScrollView uIScrollView = this.LIZIZ;
                T t = uIScrollView.mView;
                if (t != 0 && uIScrollView.mEnableScrollMonitor) {
                    uIScrollView.mContext.LLJJIJI.LJIIJJI(new C1318050kP5(t, uIScrollView.getTagName(), this.LIZIZ.mScrollMonitorTag));
                }
            }

            @Override // X.InterfaceC1318670kQ5
            public final void LJIJJ() {
                C1310290kCZ c1310290kCZ;
                this.LIZIZ.mContext.LJIIIZ().LIZIZ(this.LIZIZ.getSign(), this.LIZIZ.mScrollMonitorTag);
                UIScrollView uIScrollView = this.LIZIZ;
                if (uIScrollView.LLJILJIL) {
                    s sVar = uIScrollView.mContext;
                    if (sVar == null || (c1310290kCZ = sVar.LLLIIII) == null || !c1310290kCZ.LJJJI) {
                        uIScrollView.LJJJJ();
                    } else {
                        uIScrollView.LIZLLL();
                    }
                }
                UIScrollView uIScrollView2 = this.LIZIZ;
                if (uIScrollView2.LLIZLLLIL) {
                    uIScrollView2.LJJJJJL(uIScrollView2.getScrollX(), this.LIZIZ.getScrollY(), this.LIZIZ.getScrollX(), this.LIZIZ.getScrollY(), "scrollstart");
                }
                UIScrollView uIScrollView3 = this.LIZIZ;
                if (uIScrollView3.mEnableScrollMonitor) {
                    uIScrollView3.mContext.LLJJIJI.LJJII(new C1318050kP5(c1318590kPx, uIScrollView3.getTagName(), this.LIZIZ.mScrollMonitorTag));
                }
            }

            @Override // X.InterfaceC1318670kQ5
            public final void LJIJJLI() {
                C1309780kBk c1309780kBk;
                this.LIZIZ.mContext.LJIIIZ().LIZJ(this.LIZIZ.getSign());
                UIScrollView uIScrollView = this.LIZIZ;
                if (uIScrollView.LLJ) {
                    uIScrollView.LJJJJJL(uIScrollView.getScrollX(), this.LIZIZ.getScrollY(), this.LIZIZ.getScrollX(), this.LIZIZ.getScrollY(), "scrollend");
                }
                UIScrollView uIScrollView2 = this.LIZIZ;
                if (!uIScrollView2.mEnableScrollMonitor || (c1309780kBk = uIScrollView2.mContext.LLJJIJI) == null) {
                    return;
                }
                c1309780kBk.LJJIII(new C1318050kP5(c1318590kPx, uIScrollView2.getTagName(), this.LIZIZ.mScrollMonitorTag));
            }

            @Override // X.InterfaceC1318670kQ5
            public final void LIZ(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onScrollStateChanged: ");
                sbLIZ.append(i);
                LynxLog.i("LynxUIScrollView", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZIZ.LJJJJI(i);
                UIScrollView uIScrollView = this.LIZIZ;
                Callback callback = uIScrollView.LLJLILLLLZIIL;
                if (callback != null && i == 0 && ((C1318590kPx) uIScrollView.mView).LLLII == 3) {
                    String str = uIScrollView.LLJLL;
                    uIScrollView.LLJLILLLLZIIL = null;
                    uIScrollView.LLJLL = "";
                    callback.invoke(0, str);
                }
            }

            @Override // X.InterfaceC1318670kQ5
            public final void onScrollChanged(int i, int i2, int i3, int i4) {
                C1310290kCZ c1310290kCZ;
                UIScrollView uIScrollView = this.LIZIZ;
                if (uIScrollView.LLJILJIL) {
                    s sVar = uIScrollView.mContext;
                    if (sVar != null && (c1310290kCZ = sVar.LLLIIII) != null && c1310290kCZ.LJJJI) {
                        uIScrollView.LIZLLL();
                    } else {
                        uIScrollView.LJJJJ();
                    }
                }
                UIScrollView uIScrollView2 = this.LIZIZ;
                if (uIScrollView2.LLIZ) {
                    uIScrollView2.LJJJJJL(i, i2, i3, i4, "scroll");
                }
                UIScrollView uIScrollView3 = this.LIZIZ;
                if (uIScrollView3.LLILZ || uIScrollView3.LLILLJJLI) {
                    int iLJJJJZI = uIScrollView3.LJJJJZI(i, i2, uIScrollView3.LLJJIJIIJIL, uIScrollView3.LLJJIJI);
                    UIScrollView uIScrollView4 = this.LIZIZ;
                    if (uIScrollView4.LLILZ && (iLJJJJZI & 2) != 0 && (uIScrollView4.LLJJIJIL & 2) == 0) {
                        uIScrollView4.LJJJJJL(uIScrollView4.getScrollX(), this.LIZIZ.getScrollY(), this.LIZIZ.getScrollX(), this.LIZIZ.getScrollY(), "scrolltolower");
                    } else if (uIScrollView4.LLILLJJLI && (iLJJJJZI & 1) != 0 && (uIScrollView4.LLJJIJIL & 1) == 0) {
                        uIScrollView4.LJJJJJL(uIScrollView4.getScrollX(), this.LIZIZ.getScrollY(), this.LIZIZ.getScrollX(), this.LIZIZ.getScrollY(), "scrolltoupper");
                    }
                    this.LIZIZ.LLJJIJIL = iLJJJJZI;
                }
            }
        });
        return c1318590kPx;
    }

    @InterfaceC1967107nB
    public void getScrollInfo(Callback callback) {
        int memberScrollX = getMemberScrollX();
        int memberScrollY = getMemberScrollY();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("scrollX", C1292490jjr.LJI(memberScrollX, this.mContext));
        javaOnlyMap.putInt("scrollY", C1292490jjr.LJI(memberScrollY, this.mContext));
        javaOnlyMap.putInt("scrollRange", C1292490jjr.LJI(LJJIZ(), this.mContext));
        callback.invoke(0, javaOnlyMap);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void interceptGesture(boolean z) {
        ((C1318590kPx) this.mView).LLJILLL = Boolean.valueOf(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final boolean isAtBorder(boolean z) {
        T t;
        if (!isEnableNewGesture() || (t = this.mView) == 0) {
            return false;
        }
        if (z) {
            if (((C1318590kPx) t).LLJJJ) {
                return !LJJIJIIJIL(2);
            }
            return !LJJIJIIJIL(0);
        }
        if (((C1318590kPx) t).LLJJJ) {
            return !LJJIJIIJIL(3);
        }
        return !LJJIJIIJIL(1);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void scrollToIndex(int i) {
        LJJJJJ(i, false);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setBlockDescendantFocusability(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((C1318590kPx) t).setBlockDescendantFocusability(z);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-nested-scroll")
    public void setEnableNestedScroll(boolean z) {
        T t = this.mView;
        if (t == 0) {
            return;
        }
        ((C1318620kQ0) t).setNestedScrollingEnabled(z);
        if (((C1318590kPx) this.mView).getHScrollView() != null) {
            ((C1318590kPx) this.mView).getHScrollView().setNestedScrollingEnabled(z);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-enable-new-bounce")
    public void setEnableNewBounce(boolean z) {
        this.LLJJJJLIIL = z;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setEnableNewNested(boolean z) {
        T t = this.mView;
        if (t == 0) {
            return;
        }
        ((C1318620kQ0) t).setEnableNewNested(z);
        if (((C1318590kPx) this.mView).getHScrollView() != null) {
            ((C1318590kPx) this.mView).getHScrollView().setEnableNewNested(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setEnableScroll(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((C1318590kPx) t).setEnableScroll(z);
        }
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map == null) {
            return;
        }
        this.LLILLJJLI = false;
        this.LLILZ = false;
        this.LLIZ = false;
        this.LLJ = false;
        if (map.containsKey("scrolltolower")) {
            this.LLILZ = true;
        }
        if (map.containsKey("scrolltoloweredge")) {
            this.LLILZIL = true;
        }
        if (map.containsKey("scrolltoupper")) {
            this.LLILLJJLI = true;
        }
        if (map.containsKey("scrolltoupperedge")) {
            this.LLILLL = true;
        }
        if (map.containsKey("scrolltonormalstate")) {
            this.LLILZLL = true;
        }
        if (map.containsKey("scroll")) {
            this.LLIZ = true;
        }
        if (map.containsKey("scrollstart")) {
            this.LLIZLLLIL = true;
        }
        if (map.containsKey("scrollend")) {
            this.LLJ = true;
        }
        if (map.containsKey("contentsizechanged")) {
            this.LLJIJIL = true;
        }
    }

    @InterfaceC1312540kGC(name = "fading-edge-length")
    public void setFadingEdgeLength(String str) {
        T t;
        int iLIZLLL = (int) C1312920kGo.LIZLLL(str, 0.0f, 0.0f, this.mContext.LLJJJ);
        this.LLJLIL = iLIZLLL;
        if (iLIZLLL <= 0 && (t = this.mView) != 0) {
            t.setHorizontalFadingEdgeEnabled(false);
            this.mView.setVerticalFadingEdgeEnabled(false);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setForbidFlingFocusChange(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((C1318590kPx) t).setForbidFlingFocusChange(z);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "force-can-scroll")
    public void setForceCanScroll(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((C1318590kPx) t).setForceCanScroll(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setGestureDetectors(Map<Integer, C1311420kEO> map) {
        super.setGestureDetectors(map);
    }

    @InterfaceC1312540kGC(name = "initial-scroll-offset")
    public void setInitialScrollOffset(Integer num) {
        if (num == null) {
            this.LLJZ.remove("initialScrollOffset");
            return;
        }
        this.LLJZ.put("initialScrollOffset", Integer.valueOf((int) C1311130kDv.LIZIZ(num.intValue(), 0.0f)));
        if (this.LL) {
            LJJJJZ(num.intValue(), true, true);
        } else {
            LJJJJLL(num.intValue(), true, true);
        }
    }

    @InterfaceC1312540kGC(name = "initial-scroll-to-index")
    public void setInitialScrollToIndex(Integer num) {
        if (num == null) {
            this.LLJZ.remove("initialScrollIndex");
        } else {
            this.LLJZ.put("initialScrollIndex", num);
            LJJJJJ(num.intValue(), true);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setLowerThreshole(int i) {
        this.LLJJIJI = i;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setLynxDirection(int i) {
        boolean z;
        T t = this.mView;
        C1318590kPx c1318590kPx = (C1318590kPx) t;
        if (i != this.mLynxDirection) {
            z = true;
        } else {
            z = false;
        }
        c1318590kPx.LLLF = z;
        this.mLynxDirection = i;
        if (i == 2) {
            t.setLayoutDirection(1);
            ((C1318590kPx) this.mView).getHScrollView().setLayoutDirection(1);
            ((C1318590kPx) this.mView).getLinearLayout().setLayoutDirection(1);
        } else {
            t.setLayoutDirection(0);
            ((C1318590kPx) this.mView).getHScrollView().setLayoutDirection(0);
            ((C1318590kPx) this.mView).getLinearLayout().setLayoutDirection(0);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final void setPanInterceptAncestors(boolean z) {
        ((C1318620kQ0) this.mView).setPanInterceptAncestors(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final void setPanInterceptDescendants(boolean z) {
        ((C1318620kQ0) this.mView).setPanInterceptDescendants(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final void setPanInterceptSelf(boolean z) {
        ((C1318620kQ0) this.mView).setPanInterceptSelf(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-preference-consume-gesture")
    public void setPreferenceConsumeGesture(boolean z) {
        this.LLJJ = z;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollBarEnable(boolean z) {
        try {
            ((C1318590kPx) this.mView).setScrollBarEnable(Boolean.valueOf(z).booleanValue());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("UIScrollView", e.getMessage());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollLeft(int i) {
        LJJJJLL(i, true, false);
    }

    @InterfaceC1312540kGC(customType = "vertical", name = "scroll-orientation")
    public void setScrollOrientation(String str) {
        boolean z = this.LL;
        boolean z2 = false;
        if (!TextUtils.equals(str, "vertical") && TextUtils.equals(str, "horizontal")) {
            this.LL = false;
        } else {
            this.LL = true;
        }
        if (this.LLJILJILJ || z != this.LL) {
            z2 = true;
        }
        this.LLJILJILJ = z2;
        LJJJIL();
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTap(boolean z) {
        this.LLJI = z;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTop(int i) {
        LJJJJZ(i, true, false);
    }

    @InterfaceC1312540kGC(name = "android-touch-slop")
    public void setTouchSlop(String str) {
        this.LLJL = TextUtils.equals(str, "paging");
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setUpperThreshole(int i) {
        this.LLJJIJIIJIL = i;
    }

    public UIScrollView(s sVar, Object obj) {
        super(sVar, obj);
        this.LLJJIJIL = 1;
        this.LLJJJ = -1;
        this.LLJJJIL = -1;
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJZ = new HashMap<>();
    }

    public final void LJJJJJ(int i, boolean z) {
        int width;
        int width2;
        T t = this.mView;
        if (t != 0 && ((C1318590kPx) t).getLinearLayout() != null) {
            if (z) {
                LJJJJLI(-1);
            } else {
                this.LLJJJ = -1;
            }
            if (i < 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid scroll-to-index with index < 0: ");
                sbLIZ.append(i);
                LynxLog.e("LynxUIScrollView", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            if (this.mChildren.size() == 0) {
                if (z) {
                    LJJJJLI(i);
                    return;
                } else {
                    this.LLJJJ = i;
                    return;
                }
            }
            if (i >= this.mChildren.size()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Invalid scroll-to-index with index out of boundary: ");
                sbLIZ2.append(i);
                LynxLog.e("LynxUIScrollView", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            LinearLayout linearLayout = ((C1318590kPx) this.mView).getLinearLayout();
            if (this.LL) {
                width = this.mView.getHeight();
            } else {
                width = this.mView.getWidth();
            }
            if (this.LL) {
                width2 = linearLayout.getHeight();
            } else {
                width2 = linearLayout.getWidth();
            }
            if (width != 0 && width2 != 0) {
                if (!z) {
                    ((C1318590kPx) this.mView).setScrollToIndex(i);
                    return;
                }
            } else if (!z) {
                this.LLJJJ = i;
                return;
            }
            LJJJJLI(i);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final boolean canConsumeGesture(float f, float f2) {
        T t;
        if (!isEnableNewGesture() || (t = this.mView) == 0) {
            return false;
        }
        if (((C1318590kPx) t).LLJJJ) {
            if (isAtBorder(true) && f < 0.0f) {
                return false;
            }
            if (isAtBorder(false) && f > 0.0f) {
                return false;
            }
            return true;
        }
        if (isAtBorder(true) && f2 < 0.0f) {
            return false;
        }
        if (isAtBorder(false) && f2 > 0.0f) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void drawChild(LynxFlattenUI lynxFlattenUI, Canvas canvas) throws Throwable {
        super.drawChild(lynxFlattenUI, canvas);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        super.insertChild(lynxBaseUI, i);
        if (lynxBaseUI instanceof UIBounceView) {
            UIBounceView uIBounceView = (UIBounceView) lynxBaseUI;
            if (this.LLJJJJLIIL) {
                int i2 = uIBounceView.LL;
                if (i2 != 1 && i2 != 2) {
                    return;
                }
                this.LLJJJJJIL = uIBounceView;
                return;
            }
            this.LLJJJJ = uIBounceView;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final void onGestureScrollBy(float f, float f2) {
        if (!isEnableNewGesture()) {
            return;
        }
        C1289620jfE.LIZLLL(new ARunnableS7S0100002_20(this, f, f2, 12));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onListCellAppear(String str, LynxBaseUI lynxBaseUI) {
        super.onListCellAppear(str, lynxBaseUI);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.LLJLLL = str;
        this.LLJLLIL = lynxBaseUI.getSign();
        String strConstructListStateCacheKey = constructListStateCacheKey(getTagName(), str, getIdSelector());
        Object valueFromNativeStorage = lynxBaseUI.getValueFromNativeStorage(strConstructListStateCacheKey);
        if (valueFromNativeStorage != null) {
            int iIntValue = ((Integer) valueFromNativeStorage).intValue();
            if (((C1318590kPx) this.mView).LLJJJ) {
                LJJJJLL(iIntValue, false, false);
                return;
            } else {
                LJJJJZ(iIntValue, false, false);
                return;
            }
        }
        if (this.LLJZ.containsKey("initialScrollIndex") && !lynxBaseUI.initialPropsFlushed("initialScrollIndex", strConstructListStateCacheKey)) {
            LJJJJLI(this.LLJZ.get("initialScrollIndex").intValue());
        }
        if (!this.LLJZ.containsKey("initialScrollOffset") || lynxBaseUI.initialPropsFlushed("initialScrollOffset", strConstructListStateCacheKey)) {
            return;
        }
        LJJJJL(this.LLJZ.get("initialScrollOffset").intValue());
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onListCellPrepareForReuse(String str, LynxBaseUI lynxBaseUI) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.LLJLLIL = lynxBaseUI.getSign();
        this.LLJLLL = str;
        if (this.LL) {
            ((C1318590kPx) this.mView).LJII(0, 0, false);
        } else if (this.mLynxDirection == 2) {
            C1318590kPx c1318590kPx = (C1318590kPx) this.mView;
            c1318590kPx.LJII(c1318590kPx.getContentWidth() - this.mView.getWidth(), 0, false);
        } else {
            ((C1318590kPx) this.mView).LJII(0, 0, false);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final float[] scrollBy(float f, float f2) {
        float[] fArr = new float[4];
        if (this.mView == 0) {
            return fArr;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        T t = this.mView;
        if (((C1318590kPx) t).LLJJJ) {
            ((C1318590kPx) t).getHScrollView().scrollBy((int) f, 0);
        } else {
            t.scrollBy(0, (int) f2);
        }
        if (Math.abs(f) > Float.MIN_VALUE || Math.abs(f2) > Float.MIN_VALUE) {
            recognizeGesturere();
        }
        if (((C1318590kPx) this.mView).LLJJJ) {
            float scrollX2 = getScrollX() - scrollX;
            fArr[0] = scrollX2;
            fArr[1] = 0.0f;
            fArr[2] = f - scrollX2;
            fArr[3] = f2;
            return fArr;
        }
        fArr[0] = 0.0f;
        float scrollY2 = getScrollY() - scrollY;
        fArr[1] = scrollY2;
        fArr[2] = f;
        fArr[3] = f2 - scrollY2;
        return fArr;
    }

    @InterfaceC1967107nB
    public void scrollTo(ReadableMap readableMap, Callback callback) {
        int i;
        boolean z;
        int i2;
        Callback callback2 = this.LLJLILLLLZIIL;
        if (callback2 != null) {
            this.LLJLILLLLZIIL = null;
            callback2.invoke(0, "Due to the start of a new scrollTo operation, the previous scrollTo has stopped.");
        }
        if (this.mChildren.isEmpty()) {
            callback.invoke(4, "Invoke scrollTo failed due to empty children.");
            return;
        }
        this.LLJLL = "";
        double d = 0.0d;
        double dLIZ = C1311130kDv.LIZ(readableMap.getDouble("offset", 0.0d));
        boolean z2 = readableMap.getBoolean("smooth", false);
        if (readableMap.hasKey("index")) {
            i = readableMap.getInt("index");
            if (i < 0 || i >= this.mChildren.size()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("scrollTo index ");
                sbLIZ.append(i);
                sbLIZ.append(" is out of range [0, ");
                sbLIZ.append(this.mChildren.size());
                sbLIZ.append(e3.f);
                callback.invoke(4, C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        } else {
            i = -1;
        }
        if (this.LL) {
            if (i >= 0 && i < this.mChildren.size()) {
                dLIZ += (double) ((LynxBaseUI) ListProtector.get(this.mChildren, i)).getTop();
            }
            if (dLIZ < 0.0d || dLIZ > LJJIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Target scroll position = ");
                sbLIZ2.append(dLIZ);
                sbLIZ2.append(" is beyond threshold. ");
                this.LLJLL = C2188811AlT.LIZIZ(sbLIZ2);
                double dLJJIZ = LJJIZ();
                if (dLIZ >= 0.0d) {
                    if (dLIZ > dLJJIZ) {
                        d = dLJJIZ;
                    } else {
                        d = dLIZ;
                    }
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(this.LLJLL);
                sbLIZ3.append("Clamped to position = ");
                sbLIZ3.append(d);
                this.LLJLL = C2188811AlT.LIZIZ(sbLIZ3);
                dLIZ = d;
            }
            if (dLIZ != getScrollY()) {
                z = true;
            } else {
                z = false;
            }
            ((C1318590kPx) this.mView).LJII(0, (int) dLIZ, z2);
        } else {
            if (i >= 0 && i < this.mChildren.size()) {
                dLIZ = this.mLynxDirection == 2 ? Math.max(0.0d, ((double) ((((LynxBaseUI) ListProtector.get(this.mChildren, i)).getLeft() + ((LynxBaseUI) ListProtector.get(this.mChildren, i)).getWidth()) - getWidth())) - dLIZ) : dLIZ + ((double) ((LynxBaseUI) ListProtector.get(this.mChildren, i)).getLeft());
            }
            if (dLIZ < 0.0d || dLIZ > LJJIZ()) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Target scroll position = ");
                sbLIZ4.append(dLIZ);
                sbLIZ4.append(" is beyond threshold. ");
                this.LLJLL = C2188811AlT.LIZIZ(sbLIZ4);
                double dLJJIZ2 = LJJIZ();
                if (dLIZ >= 0.0d) {
                    if (dLIZ > dLJJIZ2) {
                        d = dLJJIZ2;
                    } else {
                        d = dLIZ;
                    }
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(this.LLJLL);
                sbLIZ5.append("Clamped to position = ");
                sbLIZ5.append(d);
                this.LLJLL = C2188811AlT.LIZIZ(sbLIZ5);
                dLIZ = d;
            }
            if (dLIZ != getScrollX()) {
                z = true;
            } else {
                z = false;
            }
            ((C1318590kPx) this.mView).LJII((int) dLIZ, 0, z2);
        }
        if (z2 && z) {
            this.LLJLILLLLZIIL = callback;
            return;
        }
        Object[] objArr = new Object[2];
        if (this.LLJLL.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = this.LLJLL;
        callback.invoke(objArr);
        this.LLJLILLLLZIIL = null;
        this.LLJLL = "";
    }

    @InterfaceC1967107nB
    public void scrollBy(ReadableMap readableMap, Callback callback) {
        if (callback == null) {
            return;
        }
        if (readableMap != null && readableMap.hasKey("offset")) {
            C1289620jfE.LIZLLL(new ARunnableS0S0200010_20(this, C1311130kDv.LIZ(readableMap.getDouble("offset", 0.0d)), callback, 4));
        } else {
            callback.invoke(4, "Invoke scrollBy failed due to param is null");
        }
    }

    public final void LJJJJLL(int i, boolean z, boolean z2) {
        int realScrollY = ((C1318590kPx) this.mView).getRealScrollY();
        if (z) {
            i = (int) C1311130kDv.LIZIZ(i, 0.0f);
        }
        if (!z2) {
            if (getWidth() + i <= ((C1318590kPx) this.mView).getContentWidth()) {
                ((C1318590kPx) this.mView).LJII(i, realScrollY, false);
                this.LLJJI = 0;
                return;
            } else {
                this.LLJJI = i;
                return;
            }
        }
        LJJJJL(i);
    }

    public final void LJJJJZ(int i, boolean z, boolean z2) {
        int realScrollX = ((C1318590kPx) this.mView).getRealScrollX();
        if (z) {
            i = (int) C1311130kDv.LIZIZ(i, 0.0f);
        }
        if (!z2) {
            if (getHeight() + i <= ((C1318590kPx) this.mView).getContentHeight()) {
                ((C1318590kPx) this.mView).LJII(realScrollX, i, false);
                this.LLJJI = 0;
                return;
            } else {
                this.LLJJI = i;
                return;
            }
        }
        LJJJJL(i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onListCellDisAppear(String str, LynxBaseUI lynxBaseUI, boolean z) {
        super.onListCellDisAppear(str, lynxBaseUI, z);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strConstructListStateCacheKey = constructListStateCacheKey(getTagName(), str, getIdSelector());
        this.LLJLLIL = lynxBaseUI.getSign();
        this.LLJLLL = str;
        if (z) {
            lynxBaseUI.storeKeyToNativeStorage(strConstructListStateCacheKey, Integer.valueOf(((C1318590kPx) this.mView).getRealScrollX()));
        } else {
            lynxBaseUI.removeKeyFromNativeStorage(strConstructListStateCacheKey);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean requestChildUIRectangleOnScreen(LynxBaseUI lynxBaseUI, Rect rect, boolean z) {
        if (!this.LLJJLIIIJLLLLLLLZ || lynxBaseUI == null) {
            return false;
        }
        rect.offset(lynxBaseUI.getLeft() - lynxBaseUI.getScrollX(), lynxBaseUI.getTop() - lynxBaseUI.getScrollY());
        if (this.LL) {
            int iComputeScrollDeltaToGetChildRectOnScreen = ((C1318590kPx) this.mView).computeScrollDeltaToGetChildRectOnScreen(rect);
            if (iComputeScrollDeltaToGetChildRectOnScreen == 0) {
                return false;
            }
            T t = this.mView;
            ((C1318590kPx) t).LJII(((C1318590kPx) t).getRealScrollX(), ((C1318590kPx) this.mView).getRealScrollY() + iComputeScrollDeltaToGetChildRectOnScreen, z);
        } else {
            int iComputeScrollDeltaToGetChildRectOnScreen2 = ((C1318590kPx) this.mView).getHScrollView().computeScrollDeltaToGetChildRectOnScreen(rect);
            if (iComputeScrollDeltaToGetChildRectOnScreen2 == 0) {
                return false;
            }
            T t2 = this.mView;
            ((C1318590kPx) t2).LJII(((C1318590kPx) t2).getRealScrollX() + iComputeScrollDeltaToGetChildRectOnScreen2, ((C1318590kPx) this.mView).getRealScrollY(), z);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(com.lynx.tasm.behavior.ui.LynxBaseUI r6, boolean r7, java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.scroll.UIScrollView.LJJIIZI(com.lynx.tasm.behavior.ui.LynxBaseUI, boolean, java.lang.String, java.lang.String):void");
    }

    public final int LJJJJZI(int i, int i2, int i3, int i4) {
        if (this.LL) {
            return LJJIJIL(i2, i3, i4, 1, 2);
        }
        if (this.mLynxDirection == 2) {
            return LJJIJIL(i, i4, i3, 2, 1);
        }
        return LJJIJIL(i, i3, i4, 1, 2);
    }

    public final int LJJIJIL(int i, int i2, int i3, int i4, int i5) {
        int measuredWidth;
        int measuredWidth2;
        if (i > i2) {
            i4 = 0;
        }
        if (((C1318590kPx) this.mView).getHScrollView() != null) {
            View childAt = ((C1318590kPx) this.mView).getHScrollView().getChildAt(0);
            if (this.LL) {
                measuredWidth = childAt.getMeasuredHeight();
                measuredWidth2 = this.mView.getMeasuredHeight();
            } else {
                measuredWidth = childAt.getMeasuredWidth();
                measuredWidth2 = this.mView.getMeasuredWidth();
            }
            if (i >= (measuredWidth - measuredWidth2) - i3) {
                return i4 | i5;
            }
            return i4;
        }
        return i4;
    }

    public final void LJJJJJL(int i, int i2, int i3, int i4, String str) {
        C1317510kOD c1317510kOD = new C1317510kOD(getSign(), str);
        c1317510kOD.LJ(i, i2, ((C1318590kPx) this.mView).getContentHeight(), ((C1318590kPx) this.mView).getContentWidth(), i - i3, i2 - i4);
        s sVar = this.mContext;
        if (sVar != null) {
            sVar.LLIZ.LIZIZ(c1317510kOD);
        }
    }
}
