package com.lynx.tasm.behavior.ui;

import X.C1311730kEt;
import X.C1311820kF2;
import X.C1312040kFO;
import X.C1313240kHK;
import X.C1313340kHU;
import X.C1313360kHW;
import X.C1314710kJh;
import X.InterfaceC1311410kEN;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import j27.s;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class UIShadowProxy extends UIGroup<C1313240kHK> {
    public final LynxBaseUI LL;
    public List<C1313360kHW> LLILLJJLI;
    public C1313340kHU LLILLL;
    public final Matrix LLILZ;
    public boolean LLILZIL;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final Rect getBoundRectForOverflow() {
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        this.LLILZIL = true;
    }

    public final C1313340kHU LJJIIZI() {
        if (this.LLILLL == null) {
            C1313340kHU c1313340kHU = new C1313340kHU();
            this.LLILLL = c1313340kHU;
            T t = this.mView;
            if (t != 0) {
                ((C1313240kHK) t).LLILLL = c1313340kHU;
            }
        }
        return this.LLILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI() {
        /*
            Method dump skipped, instruction units count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.UIShadowProxy.LJJIJIIJI():void");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean enableLayoutAnimation() {
        return this.LL.enableLayoutAnimation();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final float getAlpha() {
        LynxBaseUI lynxBaseUI = this.LL;
        if (lynxBaseUI instanceof LynxUI) {
            return ((LynxUI) lynxBaseUI).mView.getAlpha();
        }
        return 1.0f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final Rect getBound() {
        return this.LL.getBound();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final int getChildCount() {
        LynxBaseUI lynxBaseUI = this.LL;
        if (lynxBaseUI instanceof UIGroup) {
            return ((UIGroup) lynxBaseUI).getChildCount();
        }
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final List<LynxBaseUI> getChildren() {
        return this.LL.getChildren();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getHeight() {
        return this.LL.getHeight();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final String getIdSelector() {
        LynxBaseUI lynxBaseUI = this.LL;
        if (lynxBaseUI != null) {
            return lynxBaseUI.getIdSelector();
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final C1311820kF2 getLayoutAnimator() {
        return this.LL.getLayoutAnimator();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getLeft() {
        return this.LL.getLeft();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getOriginLeft() {
        return this.LL.getOriginLeft();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getOriginTop() {
        return this.LL.getOriginTop();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final JavaOnlyMap getProps() {
        return this.LL.getProps();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final float getRealTimeTranslationZ() {
        LynxBaseUI lynxBaseUI = this.LL;
        if (lynxBaseUI instanceof LynxUI) {
            return lynxBaseUI.getRealTimeTranslationZ();
        }
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final String getRefIdSelector() {
        LynxBaseUI lynxBaseUI = this.LL;
        if (lynxBaseUI != null) {
            return lynxBaseUI.getRefIdSelector();
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final String getTagName() {
        LynxBaseUI lynxBaseUI = this.LL;
        if (lynxBaseUI != null) {
            return lynxBaseUI.getTagName();
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getTop() {
        return this.LL.getTop();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final C1312040kFO getTransitionAnimator() {
        return this.LL.getTransitionAnimator();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final float getTranslationZ() {
        LynxBaseUI lynxBaseUI = this.LL;
        if (lynxBaseUI instanceof LynxUI) {
            return lynxBaseUI.getTranslationZ();
        }
        return 0.0f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getWidth() {
        return this.LL.getWidth();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isFirstAnimatedReady() {
        return this.LL.isFirstAnimatedReady();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isFlatten() {
        return this.LL.isFlatten();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final boolean isInsertViewCalled() {
        LynxBaseUI lynxBaseUI = this.LL;
        return lynxBaseUI instanceof UIGroup ? ((UIGroup) lynxBaseUI).isInsertViewCalled() : super.isInsertViewCalled();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        View view = (View) this.mView.getParent();
        if (view == null) {
            return;
        }
        ((ViewGroup) this.mView).layout(0, 0, view.getWidth(), view.getHeight());
        if (this.mView.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.mView.getParent()).setClipChildren(false);
            this.mView.setClipBounds(getBoundRectForOverflow());
        }
        LynxBaseUI lynxBaseUI = this.LL;
        if (lynxBaseUI instanceof LynxUI) {
            lynxBaseUI.layout();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        this.LL.measure();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReady() {
        LynxBaseUI lynxBaseUI = this.LL;
        if (lynxBaseUI != null) {
            lynxBaseUI.onNodeReady();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        LynxBaseUI lynxBaseUI = this.LL;
        if (lynxBaseUI != null) {
            lynxBaseUI.onPropsUpdated();
        }
        super.onPropsUpdated();
        this.LLILZIL = true;
    }

    public final void LJJIJ() {
        invalidate();
        this.LLILZIL = true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final void initAccessibilityDelegate() {
        super.initAccessibilityDelegate();
        this.mView.setImportantForAccessibility(1);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onDrawingPositionChanged() {
        super.onDrawingPositionChanged();
        this.LLILZIL = true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new C1313240kHK(this, context);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final LynxBaseUI getChildAt(int i) {
        return (LynxBaseUI) ListProtector.get(this.LL.mChildren, i);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void insertView(LynxUI lynxUI) {
        ((UIGroup) this.LL).insertView(lynxUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        this.LL.removeChild(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void removeView(LynxBaseUI lynxBaseUI) {
        ((UIGroup) this.LL).removeView(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setBound(Rect rect) {
        this.LL.setBound(rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setBoxShadow(ReadableArray readableArray) {
        this.LLILLJJLI = C1313360kHW.LIZIZ(readableArray);
        LJJIJIIJI();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setLeft(int i) {
        this.LL.setLeft(i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOutlineColor(int i) {
        LJJIIZI().LIZIZ = Integer.valueOf(i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOutlineWidth(float f) {
        LJJIIZI().LIZJ = f;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setStickyTranslate(PointF pointF) {
        this.LL.setStickyTranslate(pointF);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setTop(int i) {
        this.LL.setTop(i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateExtraData(Object obj) {
        this.LL.updateExtraData(obj);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayoutInfo(LynxBaseUI lynxBaseUI) {
        this.LL.updateLayoutInfo(lynxBaseUI);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updatePropertiesInterval(C1311730kEt c1311730kEt) {
        this.LL.updateProperties(c1311730kEt);
        onPropsUpdated();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateSticky(float[] fArr) {
        this.LL.updateSticky(fArr);
        invalidate();
    }

    public UIShadowProxy(s sVar, LynxBaseUI lynxBaseUI) {
        super(sVar);
        this.LLILZ = new Matrix();
        this.LLILZIL = false;
        this.mOverflow = 3;
        this.LL = lynxBaseUI;
        lynxBaseUI.setParent(this);
        setSign(lynxBaseUI.getSign(), lynxBaseUI.getTagName());
        initialize();
        onInsertChild(lynxBaseUI, 0);
        super.insertDrawList(null, lynxBaseUI);
        super.insertView((LynxUI) lynxBaseUI);
        setVisibilityForView(lynxBaseUI.getVisibility() ? 0 : 4);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean checkStickyOnParentScroll(int i, int i2) {
        boolean zCheckStickyOnParentScroll = this.LL.checkStickyOnParentScroll(i, i2);
        if (zCheckStickyOnParentScroll) {
            invalidate();
        }
        return zCheckStickyOnParentScroll;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean childrenContainPoint(float f, float f2) {
        LynxBaseUI lynxBaseUI = this.LL;
        if (lynxBaseUI == null) {
            return false;
        }
        return lynxBaseUI.childrenContainPoint(f, f2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean containsPoint(float f, float f2) {
        return containsPoint(f, f2, false);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final InterfaceC1311410kEN hitTest(float f, float f2) {
        return hitTest(f, f2, false);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        this.LL.insertChild(lynxBaseUI, i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final void insertDrawList(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2) {
        ((LynxUI) this.LL).insertDrawList(lynxBaseUI, lynxBaseUI2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutFinish(long j, LynxBaseUI lynxBaseUI) {
        LynxBaseUI lynxBaseUI2 = this.LL;
        if (lynxBaseUI2 != null) {
            lynxBaseUI2.onLayoutFinish(j, lynxBaseUI);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean containsPoint(float f, float f2, boolean z) {
        LynxBaseUI lynxBaseUI = this.LL;
        if (lynxBaseUI == null) {
            return false;
        }
        return lynxBaseUI.containsPoint(f, f2, z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final InterfaceC1311410kEN hitTest(float f, float f2, boolean z) {
        LynxBaseUI lynxBaseUI = this.LL;
        if (lynxBaseUI == null) {
            return null;
        }
        return lynxBaseUI.hitTest(f, f2, z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean updateDrawingLayoutInfo(int i, int i2, Rect rect) {
        if (this.LL.updateDrawingLayoutInfo(i, i2, rect)) {
            this.LLILZIL = true;
            invalidate();
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean calculateStickyTranslateWithOffset(int i, boolean z, int i2, int i3) {
        boolean zCalculateStickyTranslateWithOffset = this.LL.calculateStickyTranslateWithOffset(i, z, i2, i3);
        if (zCalculateStickyTranslateWithOffset) {
            invalidate();
        }
        return zCalculateStickyTranslateWithOffset;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final C1314710kJh getTransformValue(float f, float f2, float f3, float f4) {
        return this.LL.getTransformValue(f, f2, f3, f4);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Rect rect) {
        this.LL.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, rect);
        onLayoutUpdated();
    }
}
