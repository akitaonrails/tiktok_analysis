package com.bytedance.ies.xelement.viewpager.childitem;

import X.C1318930kQV;
import X.C1318950kQX;
import X.C1336710ktB;
import X.InterfaceC1312540kGC;
import Y.ATListenerS14S0010000_20;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import j27.s;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxFoldSlotDrag extends AbsLynxUIScroll<C1318950kQX> {
    public static final /* synthetic */ int LLILLL = 0;
    public LynxTabBarView LL;
    public WeakReference<C1336710ktB> LLILLJJLI;

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
        boolean z = ((C1318950kQX) this.mView).getOrientation() == 0;
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
        C1318950kQX c1318950kQX = (C1318950kQX) this.mView;
        c1318950kQX.LLIZLLLIL = height;
        c1318950kQX.LLIZ = width;
        C1318930kQV c1318930kQV = c1318950kQX.LL;
        if (c1318930kQV != null) {
            c1318930kQV.requestLayout();
        }
        super.measure();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1313090kH5
    public final void invalidate() {
        super.invalidate();
        LinearLayout linearLayout = ((C1318950kQX) this.mView).getLinearLayout();
        if (linearLayout != null) {
            linearLayout.invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        ((C1318950kQX) this.mView).setPadding(i, this.mPaddingTop + this.mBorderTopWidth, i2, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    public LynxFoldSlotDrag(s sVar) {
        super(sVar, null);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new C1318950kQX(context);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "enable-drag")
    public final void setEnableDrag(boolean z) {
        setEnableScroll(z);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setEnableScroll(boolean z) {
        this.mView.setOnTouchListener(new ATListenerS14S0010000_20(z, 2));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOverflow(Integer num) {
        super.setOverflow(num);
        Object obj = num;
        if (num == null) {
            obj = Boolean.FALSE;
        }
        boolean z = !(!Intrinsics.LJFF(obj, 1));
        ((ViewGroup) this.mView).setClipChildren(z);
        ((C1318950kQX) this.mView).getLinearLayout().setClipChildren(z);
        ((C1318950kQX) this.mView).getHScrollView().setClipChildren(z);
    }

    public LynxFoldSlotDrag(s sVar, Object obj) {
        super(sVar, obj);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        C1336710ktB c1336710ktB;
        C1336710ktB c1336710ktB2;
        super.insertChild(lynxBaseUI, i);
        if (lynxBaseUI instanceof LynxUI) {
            lynxBaseUI.setParent(this);
            if (lynxBaseUI instanceof LynxTabBarView) {
                LynxTabBarView lynxTabBarView = (LynxTabBarView) lynxBaseUI;
                this.LL = lynxTabBarView;
                WeakReference<C1336710ktB> weakReference = this.LLILLJJLI;
                if (weakReference != null && (c1336710ktB2 = weakReference.get()) != null) {
                    c1336710ktB2.setTabLayout(lynxTabBarView);
                }
                WeakReference<C1336710ktB> weakReference2 = this.LLILLJJLI;
                if (weakReference2 != null && (c1336710ktB = weakReference2.get()) != null) {
                    c1336710ktB.setTabBarElementAdded(false);
                }
            }
        }
    }
}
