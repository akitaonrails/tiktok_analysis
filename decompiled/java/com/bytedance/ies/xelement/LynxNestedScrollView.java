package com.bytedance.ies.xelement;

import X.C1299120juY;
import X.C1317510kOD;
import X.C1318710kQ9;
import X.C1318730kQB;
import X.InterfaceC1318760kQE;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.xelement.LynxNestedScrollView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import j27.s;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class LynxNestedScrollView extends AbsLynxUIScroll<C1318730kQB> implements InterfaceC1318760kQE {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    @Override // X.InterfaceC1318760kQE
    public final void LIZ(int i) {
    }

    @Override // X.InterfaceC1318760kQE
    public final void LJIJJ() {
    }

    @Override // X.InterfaceC1318760kQE
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC1318760kQE
    public final void LJIL() {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJIIZI(LynxBaseUI lynxBaseUI, boolean z, String str, String str2) {
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
    public final void setScrollLeft(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTop(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setUpperThreshole(int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollX() {
        return ((C1318730kQB) this.mView).getHScrollView().getScrollX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollY() {
        return this.mView.getScrollY();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1313090kH5
    public final void invalidate() {
        ((C1318730kQB) this.mView).getLinearLayout().invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        boolean z = ((C1318730kQB) this.mView).getOrientation() == 0;
        int width = getWidth();
        int height = getHeight();
        for (int i = 0; i < getChildCount(); i++) {
            LynxBaseUI childAt = getChildAt(i);
            if (z) {
                width = Math.max(width, childAt.getWidth() + childAt.getLeft());
            } else {
                height = Math.max(height, childAt.getHeight() + childAt.getTop());
            }
        }
        C1318730kQB c1318730kQB = (C1318730kQB) this.mView;
        c1318730kQB.LLIZLLLIL = height;
        c1318730kQB.LLIZ = width;
        C1318710kQ9 c1318710kQ9 = c1318730kQB.LL;
        if (c1318710kQ9 != null) {
            c1318710kQ9.requestLayout();
        }
        super.measure();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        ((C1318730kQB) this.mView).setPadding(i, this.mPaddingTop + this.mBorderTopWidth, i2, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    public LynxNestedScrollView(s sVar) {
        super(sVar, null);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJIJ(boolean z) {
        if (!z) {
            ((C1318730kQB) this.mView).setOrientation(1);
        } else {
            ((C1318730kQB) this.mView).setOrientation(0);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJIJIIJI(boolean z) {
        if (z) {
            ((C1318730kQB) this.mView).setOrientation(1);
        } else {
            ((C1318730kQB) this.mView).setOrientation(0);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        C1318730kQB c1318730kQB = new C1318730kQB(context);
        c1318730kQB.setOnScrollListener(new InterfaceC1318760kQE() { // from class: X.0kQA
            @Override // X.InterfaceC1318760kQE
            public final void LJIJJ() {
            }

            @Override // X.InterfaceC1318760kQE
            public final void LJIJJLI() {
            }

            @Override // X.InterfaceC1318760kQE
            public final void LJIL() {
            }

            @Override // X.InterfaceC1318760kQE
            public final void onScrollChanged(int i, int i2, int i3, int i4) {
            }

            @Override // X.InterfaceC1318760kQE
            public final void LIZ(int i) {
                LynxNestedScrollView lynxNestedScrollView = this.LL;
                if (!lynxNestedScrollView.LLILZ) {
                    if (i != 0) {
                        lynxNestedScrollView.recognizeGesturere();
                    }
                } else {
                    if (i != 1) {
                        return;
                    }
                    lynxNestedScrollView.recognizeGesturere();
                }
            }
        });
        return c1318730kQB;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map == null) {
            return;
        }
        this.LL = false;
        this.LLILLJJLI = false;
        this.LLILLL = false;
        if (map.containsKey("scrolltolower")) {
            this.LLILLJJLI = true;
        }
        if (map.containsKey("scrolltoupper")) {
            this.LL = true;
        }
        if (map.containsKey("scroll")) {
            this.LLILLL = true;
        }
        if (this.LLILLJJLI || this.LL || this.LLILLL) {
            ((C1318730kQB) this.mView).setOnScrollListener(this);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollBarEnable(boolean z) {
        try {
            ((C1318730kQB) this.mView).setScrollBarEnable(Boolean.valueOf(z).booleanValue());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LynxLog.e("UIScrollView", e.getMessage());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTap(boolean z) {
        this.LLILZ = z;
    }

    public LynxNestedScrollView(s sVar, Object obj) {
        super(sVar, obj);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void drawChild(LynxFlattenUI lynxFlattenUI, Canvas canvas) throws Throwable {
        lynxFlattenUI.draw(canvas);
    }

    @Override // X.InterfaceC1318760kQE
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        View childAt;
        if (this.LLILLL) {
            LJJIJIIJIL(i, i2, i3, i4, "scroll");
        }
        if (i == i3 && i == 0) {
            if (i2 == 0) {
                if (this.LL) {
                    LJJIJIIJIL(0, 0, i3, i4, "scrolltoupper");
                    return;
                }
                return;
            } else {
                View childAt2 = ((ViewGroup) this.mView).getChildAt(0);
                if (childAt2 != null && childAt2.getMeasuredHeight() == getScrollY() + this.mView.getMeasuredHeight() && this.LLILLJJLI) {
                    LJJIJIIJIL(0, i2, i3, i4, "scrolltolower");
                    return;
                }
                return;
            }
        }
        if (i2 == i4 && i2 == 0) {
            if (i == 0 || (i > 0 && i3 == 0)) {
                if (this.LL) {
                    LJJIJIIJIL(i, 0, i3, i4, "scrolltoupper");
                }
            } else {
                if (((C1318730kQB) this.mView).getHScrollView() == null || (childAt = ((C1318730kQB) this.mView).getHScrollView().getChildAt(0)) == null || i != childAt.getMeasuredWidth() - this.mView.getMeasuredWidth() || !this.LLILLJJLI) {
                    return;
                }
                LJJIJIIJIL(i, 0, i3, i4, "scrolltolower");
            }
        }
    }

    public final void LJJIJIIJIL(int i, int i2, int i3, int i4, String str) {
        C1317510kOD c1317510kOD = new C1317510kOD(getSign(), str);
        c1317510kOD.LJ(i, i2, ((C1318730kQB) this.mView).getContentHeight(), ((C1318730kQB) this.mView).getContentWidth(), i3 - i, i4 - i2);
        s sVar = this.mContext;
        if (sVar != null) {
            sVar.LLIZ.LIZIZ(c1317510kOD);
        }
    }
}
