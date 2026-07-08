package com.lynx.tasm.behavior.ui;

import X.C1310660kDA;
import X.C1313210kHH;
import X.C1313270kHN;
import X.C1313410kHb;
import X.C1313890kIN;
import X.C1313910kIP;
import X.C1315680kLG;
import X.C786410Ut5;
import X.InterfaceC1311410kEN;
import X.InterfaceC1314130kIl;
import X.InterfaceC1314720kJi;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.image.FlattenUIImage;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.text.FlattenUIText;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import j27.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes21.dex */
public abstract class UIGroup<T extends ViewGroup> extends LynxUI<T> implements InterfaceC1314130kIl {
    public int mCurrentDrawIndex;
    public LynxBaseUI mCurrentDrawUI;
    public C1313890kIN mDrawingOrderHelper;
    public boolean mIsInsertViewCalled;
    public Rect mOverflowClipRect;
    public static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<>();
    public static final float[] mEventCoords = new float[2];
    public static final PointF mTempPoint = new PointF();
    public static final float[] mMatrixTransformCoords = new float[2];
    public static final Matrix mInverseMatrix = new Matrix();

    @Override // X.InterfaceC1314130kIl
    public void afterDraw(Canvas canvas) {
    }

    @Override // X.InterfaceC1314130kIl
    public void afterDrawChild(Canvas canvas, View view, long j) {
    }

    public boolean enableAutoClipRadius() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return null;
    }

    public void layoutChildren() {
        for (int i = 0; i < this.mChildren.size(); i++) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) ListProtector.get(this.mChildren, i);
            if (needCustomLayout()) {
                if (lynxBaseUI instanceof UIGroup) {
                    ((UIGroup) lynxBaseUI).layoutChildren();
                }
            } else if (lynxBaseUI.isFlatten()) {
                ((LynxFlattenUI) lynxBaseUI).layout(lynxBaseUI.getOriginLeft(), lynxBaseUI.getOriginTop(), null);
            } else {
                lynxBaseUI.layout();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean needCustomLayout() {
        return false;
    }

    public void dispatchOnAttach() {
        Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
        while (it2.hasNext()) {
            it2.next().onAttach();
        }
    }

    public void dispatchOnDetach() {
        Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
        while (it2.hasNext()) {
            it2.next().onDetach();
        }
    }

    public int getChildCount() {
        return this.mChildren.size();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void layout() {
        if (this.mView.isLayoutRequested()) {
            super.layout();
            layoutChildren();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void measure() {
        if (this.mView.isLayoutRequested()) {
            measureChildren();
            super.measure();
        }
    }

    public void measureChildren() {
        Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
        while (it2.hasNext()) {
            it2.next().measure();
        }
    }

    public void removeAll() {
        for (LynxBaseUI lynxBaseUI = this.mDrawHead; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
            lynxBaseUI.mDrawParent = null;
        }
        this.mDrawHead = null;
        Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
        while (it2.hasNext()) {
            it2.next().setParent(null);
        }
        this.mChildren.clear();
        T t = this.mView;
        if (t != 0) {
            C786410Ut5.LJJJJI((ViewGroup) t);
        }
    }

    public void updateDrawingOrder() {
        C1313890kIN c1313890kIN = this.mDrawingOrderHelper;
        c1313890kIN.LIZIZ = 0;
        for (int i = 0; i < c1313890kIN.LIZ.getChildCount(); i++) {
            if (getViewZIndex(c1313890kIN.LIZ.getChildAt(i)) != null) {
                c1313890kIN.LIZIZ++;
            }
        }
        c1313890kIN.LIZJ = null;
        setChildrenDrawingOrderEnabledHelper(this.mDrawingOrderHelper.LIZIZ > 0);
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
        while (it2.hasNext()) {
            it2.next().destroy();
        }
    }

    @Override // X.InterfaceC1314130kIl
    public boolean hasOverlappingRendering() {
        return hasOverlappingRenderingEnabled();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void initialize() {
        super.initialize();
        T t = this.mView;
        this.mDrawingOrderHelper = new C1313890kIN((ViewGroup) t);
        if (t instanceof InterfaceC1314720kJi) {
            ((InterfaceC1314720kJi) t).bindDrawChildHook(this);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onAttach() {
        super.onAttach();
        dispatchOnAttach();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
        dispatchOnDetach();
    }

    public View getAccessibilityHostView() {
        return this.mView;
    }

    public View getRealParentView() {
        return this.mView;
    }

    public boolean isInsertViewCalled() {
        return this.mIsInsertViewCalled;
    }

    @Override // X.InterfaceC1314130kIl
    public void performLayoutChildrenUI() {
        layoutChildren();
    }

    @Override // X.InterfaceC1314130kIl
    public void performMeasureChildrenUI() {
        measureChildren();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, X.InterfaceC1314320kJ4
    public void processLayoutChildren() {
        performLayoutChildrenUI();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, X.InterfaceC1314320kJ4
    public void processMeasureChildren() {
        performMeasureChildrenUI();
    }

    public UIGroup(s sVar) {
        this(sVar, null);
    }

    public static Integer getViewZIndex(View view) {
        return mZIndexHash.get(view);
    }

    private void onRemoveChildUI(LynxUI lynxUI) {
        boolean z;
        if (!LynxUI.ENABLE_ZINDEX) {
            return;
        }
        C1313890kIN c1313890kIN = this.mDrawingOrderHelper;
        T t = lynxUI.mView;
        c1313890kIN.getClass();
        if (getViewZIndex(t) != null) {
            c1313890kIN.LIZIZ--;
        }
        c1313890kIN.LIZJ = null;
        if (this.mDrawingOrderHelper.LIZIZ > 0) {
            z = true;
        } else {
            z = false;
        }
        setChildrenDrawingOrderEnabledHelper(z);
    }

    private void setChildrenDrawingOrderEnabledHelper(boolean z) {
        T t = this.mView;
        if (t instanceof AndroidView) {
            ((AndroidView) t).setChildrenDrawingOrderEnabled(z);
        } else {
            if (!(t instanceof C1310660kDA)) {
                return;
            }
            ((C1310660kDA) t).setChildrenDrawingOrderEnabled(z);
        }
    }

    @Override // X.InterfaceC1314130kIl
    public void afterDispatchDraw(Canvas canvas) throws Throwable {
        for (LynxBaseUI lynxBaseUI = this.mCurrentDrawUI; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
            if (lynxBaseUI.isFlatten() && !(lynxBaseUI instanceof UIShadowProxy)) {
                drawChild((LynxFlattenUI) lynxBaseUI, canvas);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, X.InterfaceC1314320kJ4
    public void afterDispatchProcessViewInfo(C1313210kHH c1313210kHH) {
        super.afterDispatchProcessViewInfo(c1313210kHH);
        LynxBaseUI lynxBaseUI = this.mCurrentDrawUI;
        while (lynxBaseUI != null) {
            if (lynxBaseUI.isFlatten() && !(lynxBaseUI instanceof UIShadowProxy)) {
                C1313410kHb c1313410kHb = new C1313410kHb(false, lynxBaseUI.getBound(), lynxBaseUI.mLynxBackground);
                int left = lynxBaseUI.getLeft();
                int top = lynxBaseUI.getTop();
                int width = lynxBaseUI.getWidth();
                int height = lynxBaseUI.getHeight();
                int i = lynxBaseUI.mPaddingLeft;
                int i2 = lynxBaseUI.mPaddingTop;
                int i3 = lynxBaseUI.mPaddingRight;
                int i4 = lynxBaseUI.mPaddingBottom;
                float alpha = lynxBaseUI.getAlpha();
                c1313410kHb.LJI = left;
                c1313410kHb.LJII = top;
                c1313410kHb.LJIIIIZZ = width;
                c1313410kHb.LJIIIZ = height;
                c1313410kHb.LJIIJ = i;
                c1313410kHb.LJIIJJI = i3;
                c1313410kHb.LJIIL = i2;
                c1313410kHb.LJIILIIL = i4;
                c1313410kHb.LJIILJJIL = alpha;
                c1313410kHb.LJIJ = lynxBaseUI.needGenerateMeaningfulPaintingArea();
                tryAddInfoForSubDraw(c1313410kHb, lynxBaseUI);
                c1313210kHH.LIZ(this.mCurrentDrawIndex, c1313410kHb);
            }
            lynxBaseUI = lynxBaseUI.mNextDrawUI;
            this.mCurrentDrawIndex++;
        }
    }

    @Override // X.InterfaceC1314130kIl
    public void beforeDispatchDraw(Canvas canvas) {
        C1313270kHN c1313270kHN;
        BackgroundDrawable backgroundDrawable;
        this.mCurrentDrawUI = this.mDrawHead;
        boolean z = false;
        this.mCurrentDrawIndex = 0;
        if (this.mSkewX != 0.0f || this.mSkewY != 0.0f) {
            z = true;
        }
        if ((this.mClipToRadius || (this.mContext.LJI() && this.mOverflow == 0 && enableAutoClipRadius())) && (c1313270kHN = this.mLynxBackground) != null && (backgroundDrawable = (BackgroundDrawable) c1313270kHN.LIZIZ) != null) {
            Path pathLJIIJJI = backgroundDrawable.LJIIJJI();
            if (pathLJIIJJI != null) {
                canvas.clipPath(pathLJIIJJI);
            } else {
                if (!z) {
                    return;
                }
                canvas.clipRect(getClipBounds());
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, X.InterfaceC1314320kJ4
    public void beforeDispatchProcessViewInfo(C1313210kHH c1313210kHH) {
        boolean z;
        Path pathLJIIJJI;
        BackgroundDrawable backgroundDrawable;
        super.beforeDispatchProcessViewInfo(c1313210kHH);
        this.mCurrentDrawUI = this.mDrawHead;
        boolean z2 = false;
        this.mCurrentDrawIndex = 0;
        c1313210kHH.LLJJ.clear();
        if (this.mClipToRadius || (this.mContext.LJI() && this.mOverflow == 0 && enableAutoClipRadius())) {
            z = true;
        } else {
            z = false;
        }
        c1313210kHH.LLJIJIL = z;
        if (z) {
            C1313270kHN c1313270kHN = this.mLynxBackground;
            if (c1313270kHN != null && (backgroundDrawable = (BackgroundDrawable) c1313270kHN.LIZIZ) != null) {
                pathLJIIJJI = backgroundDrawable.LJIIJJI();
            } else {
                pathLJIIJJI = null;
            }
            if (this.mSkewX != 0.0f || this.mSkewY != 0.0f) {
                z2 = true;
            }
            if (pathLJIIJJI != null) {
                c1313210kHH.LLJILJIL = pathLJIIJJI;
                c1313210kHH.LLJILJILJ = null;
            } else if (z2) {
                c1313210kHH.LLJILJIL = null;
                c1313210kHH.LLJILJILJ = getClipBounds();
            } else {
                c1313210kHH.LLJILJIL = null;
                c1313210kHH.LLJILJILJ = null;
            }
        }
    }

    @Override // X.InterfaceC1314130kIl
    public void beforeDraw(Canvas canvas) {
        Path pathLIZJ;
        float f = this.mSkewX;
        if (f != 0.0f || this.mSkewY != 0.0f) {
            canvas.skew(f, this.mSkewY);
            canvas.translate((-this.mView.getPivotY()) * this.mSkewX, (-this.mView.getPivotX()) * this.mSkewY);
        }
        C1313910kIP c1313910kIP = this.mClipPath;
        if (c1313910kIP != null && (pathLIZJ = c1313910kIP.LIZJ(getWidth(), getHeight())) != null) {
            canvas.clipPath(pathLIZJ);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, X.InterfaceC1314320kJ4
    public void beforeProcessViewInfo(C1313210kHH c1313210kHH) {
        super.beforeProcessViewInfo(c1313210kHH);
        C1313890kIN c1313890kIN = this.mDrawingOrderHelper;
        if (c1313890kIN != null) {
            c1313890kIN.LIZ();
            c1313210kHH.LLIZLLLIL = this.mDrawingOrderHelper.LIZJ;
        }
        c1313210kHH.LLJ = hasOverlappingRendering();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public LynxBaseUI getChildAt(int i) {
        return (LynxBaseUI) ListProtector.get(this.mChildren, i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getIndex(LynxBaseUI lynxBaseUI) {
        return this.mChildren.indexOf(lynxBaseUI);
    }

    public void insertChildWhenRebuildView(LynxBaseUI lynxBaseUI) {
        if (!(lynxBaseUI instanceof LynxUI)) {
            return;
        }
        int i = 0;
        for (LynxBaseUI lynxBaseUI2 = this.mDrawHead; lynxBaseUI2 != null && lynxBaseUI != lynxBaseUI2; lynxBaseUI2 = lynxBaseUI2.mNextDrawUI) {
            if (lynxBaseUI2 instanceof LynxUI) {
                i++;
            }
        }
        View view = ((LynxUI) lynxBaseUI).mView;
        if (view.getParent() != null) {
            if (view.getParent() == this.mView) {
                view.requestLayout();
                return;
            }
            C786410Ut5.LJJJLZIJ(view, (ViewGroup) view.getParent());
        }
        ((ViewGroup) this.mView).addView(view, i);
    }

    public void insertView(LynxUI lynxUI) {
        s sVar = this.mContext;
        if (sVar != null && sVar.LLLIIIL && lynxUI.mView.getParent() == this.mView) {
            lynxUI.mView.requestLayout();
            return;
        }
        int i = -1;
        for (LynxBaseUI lynxBaseUI = this.mDrawHead; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
            if (lynxBaseUI instanceof LynxUI) {
                i++;
            }
            if (lynxBaseUI == lynxUI) {
                break;
            }
        }
        if (lynxUI.mView.getParent() != null && (lynxUI.mView.getParent() instanceof ViewGroup)) {
            C786410Ut5.LJJJLZIJ(lynxUI.mView, (ViewGroup) lynxUI.mView.getParent());
            onRemoveChildUI(lynxUI);
        }
        ((ViewGroup) this.mView).addView(lynxUI.mView, i);
        onAddChildUI(lynxUI, i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void markDetachWithViewRecursively(boolean z) {
        if (z) {
            C1313210kHH c1313210kHH = new C1313210kHH(this, this.mView);
            this.mViewInfo = c1313210kHH;
            c1313210kHH.LLJI = needGenerateMeaningfulPaintingArea();
            T t = this.mView;
            if (t instanceof InterfaceC1314720kJi) {
                ((InterfaceC1314720kJi) t).bindDrawChildHook(this.mViewInfo);
            }
        }
        super.markDetachWithViewRecursively(z);
    }

    public boolean onRemoveChild(LynxBaseUI lynxBaseUI) {
        if (!this.mChildren.remove(lynxBaseUI)) {
            return false;
        }
        lynxBaseUI.setParent(null);
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void removeChild(LynxBaseUI lynxBaseUI) {
        if (onRemoveChild(lynxBaseUI)) {
            removeView(lynxBaseUI);
        }
    }

    public void removeView(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxUI) {
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            C786410Ut5.LJJJLZIJ(lynxUI.mView, (ViewGroup) this.mView);
            if (lynxBaseUI instanceof UIList) {
                C786410Ut5.LJJJLZIJ(((UIList) lynxBaseUI).LLJJIII, (ViewGroup) this.mView);
            }
            onRemoveChildUI(lynxUI);
            return;
        }
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
    }

    public UIGroup(s sVar, Object obj) {
        super(sVar, obj);
        this.mCurrentDrawUI = this.mDrawHead;
        this.mOverflowClipRect = new Rect();
        this.mIsInsertViewCalled = false;
    }

    private void onAddChildUI(LynxUI lynxUI, int i) {
        if (!LynxUI.ENABLE_ZINDEX) {
            return;
        }
        C1313890kIN c1313890kIN = this.mDrawingOrderHelper;
        T t = lynxUI.mView;
        c1313890kIN.getClass();
        boolean z = true;
        if (getViewZIndex(t) != null) {
            c1313890kIN.LIZIZ++;
        }
        c1313890kIN.LIZJ = null;
        if (this.mDrawingOrderHelper.LIZIZ <= 0) {
            z = false;
        }
        setChildrenDrawingOrderEnabledHelper(z);
    }

    public static void setViewZIndex(View view, int i) {
        mZIndexHash.put(view, Integer.valueOf(i));
    }

    private void tryAddInfoForSubDraw(C1313410kHb c1313410kHb, LynxBaseUI lynxBaseUI) {
        int i;
        if (lynxBaseUI instanceof FlattenUIImage) {
            FlattenUIImage flattenUIImage = (FlattenUIImage) lynxBaseUI;
            flattenUIImage.LJJIIZI();
            C1315680kLG c1315680kLG = flattenUIImage.LL;
            if (c1315680kLG == null) {
                c1315680kLG = null;
            }
            c1313410kHb.LJ = c1315680kLG;
        }
        if (lynxBaseUI instanceof FlattenUIText) {
            FlattenUIText flattenUIText = (FlattenUIText) lynxBaseUI;
            c1313410kHb.LJFF = flattenUIText.LL;
            int i2 = flattenUIText.mPaddingLeft + flattenUIText.mBorderLeftWidth;
            PointF pointF = flattenUIText.LLILLJJLI;
            int i3 = 0;
            if (pointF != null) {
                i = (int) pointF.x;
            } else {
                i = 0;
            }
            int i4 = i2 + i;
            int i5 = flattenUIText.mPaddingTop + flattenUIText.mBorderTopWidth;
            if (pointF != null) {
                i3 = (int) pointF.y;
            }
            c1313410kHb.LJIILL = i4;
            c1313410kHb.LJIILLIIL = i5 + i3;
        }
    }

    public void drawChild(LynxFlattenUI lynxFlattenUI, Canvas canvas) throws Throwable {
        Rect bound = lynxFlattenUI.getBound();
        canvas.save();
        if (bound != null) {
            canvas.clipRect(bound);
        }
        lynxFlattenUI.innerDraw(canvas);
        canvas.restore();
    }

    @Override // X.InterfaceC1314130kIl
    public int getChildDrawingOrder(int i, int i2) {
        C1313890kIN c1313890kIN = this.mDrawingOrderHelper;
        if (c1313890kIN != null) {
            c1313890kIN.LIZ();
            return c1313890kIN.LIZJ[i2];
        }
        return i2;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void insertChild(LynxBaseUI lynxBaseUI, int i) {
        onInsertChild(lynxBaseUI, i);
        this.mIsInsertViewCalled = true;
    }

    public void onInsertChild(LynxBaseUI lynxBaseUI, int i) {
        lynxBaseUI.setOffsetDescendantRectToLynxView(getOffsetDescendantRectToLynxView());
        ListProtector.add(this.mChildren, i, lynxBaseUI);
        lynxBaseUI.setParent(this);
    }

    private Rect drawFlattenUIBefore(Canvas canvas, View view, long j) throws Throwable {
        for (LynxBaseUI lynxBaseUI = this.mCurrentDrawUI; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
            if (!lynxBaseUI.isFlatten()) {
                if (((LynxUI) lynxBaseUI).mView == view) {
                    Rect bound = lynxBaseUI.getBound();
                    this.mCurrentDrawUI = lynxBaseUI.mNextDrawUI;
                    return bound;
                }
            } else if (lynxBaseUI.isFlatten()) {
                drawChild((LynxFlattenUI) lynxBaseUI, canvas);
            }
        }
        return null;
    }

    private LynxUI findTouchTargetOnViewChian(float[] fArr, ViewGroup viewGroup, Map<View, LynxUI> map) {
        LynxUI lynxUIFindTouchTargetOnViewChian = null;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (this.mContext.LJII()) {
                float[] fArr2 = new float[2];
                if (!isTransformedTouchPointInView(fArr, viewGroup, childAt, fArr2, map)) {
                    continue;
                } else if (map.containsKey(childAt)) {
                    lynxUIFindTouchTargetOnViewChian = map.get(childAt);
                    fArr[0] = fArr2[0];
                    fArr[1] = fArr2[1];
                    if (lynxUIFindTouchTargetOnViewChian != null) {
                        return lynxUIFindTouchTargetOnViewChian;
                    }
                } else if ((childAt instanceof ViewGroup) && (lynxUIFindTouchTargetOnViewChian = findTouchTargetOnViewChian(fArr2, (ViewGroup) childAt, map)) != null) {
                    fArr[0] = fArr2[0];
                    fArr[1] = fArr2[1];
                    return lynxUIFindTouchTargetOnViewChian;
                }
            } else {
                PointF pointF = mTempPoint;
                if (isTransformedTouchPointInView(fArr[0], fArr[1], viewGroup, childAt, pointF)) {
                    float f = fArr[0];
                    float f2 = fArr[1];
                    fArr[0] = pointF.x;
                    fArr[1] = pointF.y;
                    if (map.containsKey(childAt)) {
                        lynxUIFindTouchTargetOnViewChian = map.get(childAt);
                    } else {
                        if (childAt instanceof ViewGroup) {
                            lynxUIFindTouchTargetOnViewChian = findTouchTargetOnViewChian(fArr, (ViewGroup) childAt, map);
                        }
                        fArr[0] = f;
                        fArr[1] = f2;
                    }
                    if (lynxUIFindTouchTargetOnViewChian != null) {
                        return lynxUIFindTouchTargetOnViewChian;
                    }
                    fArr[0] = f;
                    fArr[1] = f2;
                } else {
                    continue;
                }
            }
        }
        return lynxUIFindTouchTargetOnViewChian;
    }

    @Override // X.InterfaceC1314130kIl
    public Rect beforeDrawChild(Canvas canvas, View view, long j) {
        return drawFlattenUIBefore(canvas, view, j);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, X.InterfaceC1314320kJ4
    public void beforeProcessChildViewInfo(C1313210kHH c1313210kHH, View view, long j) {
        super.beforeProcessChildViewInfo(c1313210kHH, view, j);
        LynxBaseUI lynxBaseUI = this.mCurrentDrawUI;
        while (lynxBaseUI != null) {
            if (!lynxBaseUI.isFlatten()) {
                LynxUI lynxUI = (LynxUI) lynxBaseUI;
                if (lynxUI.mView == view) {
                    this.mCurrentDrawUI = lynxBaseUI.mNextDrawUI;
                    C1313410kHb c1313410kHb = new C1313410kHb(lynxBaseUI.getBound(), lynxUI.mViewInfo, lynxUI.mView);
                    c1313410kHb.LJIJ = lynxBaseUI.needGenerateMeaningfulPaintingArea();
                    c1313210kHH.LIZ(this.mCurrentDrawIndex, c1313410kHb);
                    if (lynxBaseUI instanceof LynxUI) {
                        c1313410kHb.LIZIZ = view;
                        c1313410kHb.LJI = lynxUI.getLeft();
                        c1313410kHb.LJII = lynxUI.getTop();
                        c1313410kHb.LJIIIIZZ = lynxUI.getWidth();
                        c1313410kHb.LJIIIZ = lynxUI.getHeight();
                        lynxUI.getOverflow();
                    }
                    this.mCurrentDrawIndex++;
                    return;
                }
            } else if (lynxBaseUI.isFlatten()) {
                C1313410kHb c1313410kHb2 = new C1313410kHb(false, lynxBaseUI.getBound(), lynxBaseUI.mLynxBackground);
                int left = lynxBaseUI.getLeft();
                int top = lynxBaseUI.getTop();
                int width = lynxBaseUI.getWidth();
                int height = lynxBaseUI.getHeight();
                int i = lynxBaseUI.mPaddingLeft;
                int i2 = lynxBaseUI.mPaddingTop;
                int i3 = lynxBaseUI.mPaddingRight;
                int i4 = lynxBaseUI.mPaddingBottom;
                float alpha = lynxBaseUI.getAlpha();
                c1313410kHb2.LJI = left;
                c1313410kHb2.LJII = top;
                c1313410kHb2.LJIIIIZZ = width;
                c1313410kHb2.LJIIIZ = height;
                c1313410kHb2.LJIIJ = i;
                c1313410kHb2.LJIIJJI = i3;
                c1313410kHb2.LJIIL = i2;
                c1313410kHb2.LJIILIIL = i4;
                c1313410kHb2.LJIILJJIL = alpha;
                c1313410kHb2.LJIJ = lynxBaseUI.needGenerateMeaningfulPaintingArea();
                tryAddInfoForSubDraw(c1313410kHb2, lynxBaseUI);
                c1313210kHH.LIZ(this.mCurrentDrawIndex, c1313410kHb2);
            }
            lynxBaseUI = lynxBaseUI.mNextDrawUI;
            this.mCurrentDrawIndex++;
        }
    }

    public InterfaceC1311410kEN findUIWithCustomLayout(float f, float f2, UIGroup uIGroup) {
        HashMap map = new HashMap();
        for (int childCount = uIGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            LynxBaseUI childAt = uIGroup.getChildAt(childCount);
            if (childAt instanceof UIShadowProxy) {
                childAt = ((UIShadowProxy) childAt).LL;
            }
            if (childAt instanceof LynxUI) {
                LynxUI lynxUI = (LynxUI) childAt;
                map.put(lynxUI.mView, lynxUI);
            } else {
                LynxLog.DTHROW(new RuntimeException("ui that need custom layout should not have flatten child!"));
            }
        }
        return findUIWithCustomLayoutByChildren(f, f2, uIGroup, map);
    }

    public InterfaceC1311410kEN findUIWithCustomLayoutByChildren(float f, float f2, UIGroup uIGroup, Map<View, LynxUI> map) {
        float[] fArr = {f, f2};
        LynxUI lynxUIFindTouchTargetOnViewChian = findTouchTargetOnViewChian(fArr, (ViewGroup) uIGroup.mView, map);
        if (lynxUIFindTouchTargetOnViewChian == null) {
            return uIGroup;
        }
        if (lynxUIFindTouchTargetOnViewChian.needCustomLayout() && (lynxUIFindTouchTargetOnViewChian instanceof UIGroup)) {
            UIGroup uIGroup2 = (UIGroup) lynxUIFindTouchTargetOnViewChian;
            return uIGroup2.findUIWithCustomLayout(fArr[0], fArr[1], uIGroup2);
        }
        if (this.mContext.LJII()) {
            return lynxUIFindTouchTargetOnViewChian.hitTest(fArr[0], fArr[1]);
        }
        return lynxUIFindTouchTargetOnViewChian.hitTest(fArr[0] + lynxUIFindTouchTargetOnViewChian.getScrollX(), fArr[1] + lynxUIFindTouchTargetOnViewChian.getScrollY());
    }

    private boolean isTransformedTouchPointInView(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f2 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = mMatrixTransformCoords;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = mInverseMatrix;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        if (scrollX < 0.0f || scrollX >= view.getRight() - view.getLeft() || scrollY < 0.0f || scrollY >= view.getBottom() - view.getTop()) {
            return false;
        }
        pointF.set(scrollX, scrollY);
        return true;
    }

    public boolean isTransformedTouchPointInView(float[] fArr, View view, View view2, float[] fArr2, Map<View, LynxUI> map) {
        float[] targetPoint = getTargetPoint(fArr[0], fArr[1], view.getScrollX(), view.getScrollY(), view2, view2.getMatrix());
        float f = targetPoint[0];
        fArr2[0] = f;
        fArr2[1] = targetPoint[1];
        if (f >= 0.0f && f < view2.getRight() - view2.getLeft()) {
            float f2 = fArr2[1];
            if (f2 >= 0.0f && f2 < view2.getBottom() - view2.getTop()) {
                return true;
            }
        }
        return false;
    }
}
