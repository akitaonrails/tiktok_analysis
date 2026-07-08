package com.lynx.xelement.scroll.coordinator.childitem;

import X.C1318940kQW;
import X.C1318960kQY;
import X.C1970007ne;
import X.InterfaceC1312540kGC;
import Y.ATListenerS14S0010000_20;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import j27.s;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIScrollCoordinatorSlotDrag extends AbsLynxUIScroll<C1318960kQY> {
    public static final /* synthetic */ int LLILLL = 0;
    public Object LL;
    public WeakReference<Object> LLILLJJLI;

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJIJ(boolean z) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJIJIIJI(boolean z) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final Rect getBoundRectForOverflow() {
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void scrollToIndex(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setLowerThreshole(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollBarEnable(boolean z) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollLeft(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTap(boolean z) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTop(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setUpperThreshole(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollX() {
        return this.mView.getScrollX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollY() {
        return this.mView.getScrollY();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        boolean z = ((C1318960kQY) this.mView).getOrientation() == 0;
        int width = getWidth();
        int height = getHeight();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LynxBaseUI childAt = getChildAt(i);
            if (z) {
                width = Math.max(width, childAt.getWidth() + childAt.getLeft());
            } else {
                height = Math.max(height, childAt.getHeight() + childAt.getTop());
            }
        }
        C1318960kQY c1318960kQY = (C1318960kQY) this.mView;
        c1318960kQY.LLIZLLLIL = height;
        c1318960kQY.LLIZ = width;
        C1318940kQW c1318940kQW = c1318960kQY.LL;
        if (c1318940kQW != null) {
            c1318940kQW.requestLayout();
        }
        super.measure();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1313090kH5
    public final void invalidate() {
        super.invalidate();
        LinearLayout linearLayout = ((C1318960kQY) this.mView).getLinearLayout();
        if (linearLayout != null) {
            linearLayout.invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        ((C1318960kQY) this.mView).setPadding(i, this.mPaddingTop + this.mBorderTopWidth, i2, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    public final void LJJIJIIJIL(Object obj) throws Throwable {
        Object obj2;
        this.LL = obj;
        WeakReference<Object> weakReference = this.LLILLJJLI;
        if (weakReference != null && (obj2 = weakReference.get()) != null) {
            C1970007ne.LIZ(obj2, obj);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new C1318960kQY(context);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "enable-drag")
    public final void setEnableDrag(boolean z) {
        setEnableScroll(z);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setEnableScroll(boolean z) {
        this.mView.setOnTouchListener(new ATListenerS14S0010000_20(z, 3));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOverflow(Integer num) {
        boolean z;
        super.setOverflow(num);
        if (num != null && num.intValue() == 1) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !z;
        ((ViewGroup) this.mView).setClipChildren(z2);
        ((C1318960kQY) this.mView).getLinearLayout().setClipChildren(z2);
        ((C1318960kQY) this.mView).getHScrollView().setClipChildren(z2);
    }

    public LynxUIScrollCoordinatorSlotDrag(s sVar, Object obj) {
        super(sVar, obj);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) throws Throwable {
        super.insertChild(lynxBaseUI, i);
        if (lynxBaseUI instanceof LynxUI) {
            lynxBaseUI.setParent(this);
            if (C1970007ne.LIZIZ(lynxBaseUI)) {
                LJJIJIIJIL(lynxBaseUI);
            }
        }
    }
}
