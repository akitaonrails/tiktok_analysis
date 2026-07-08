package com.lynx.tasm.behavior.ui.text;

import X.AbstractC1315450kKt;
import X.C1299120juY;
import X.C1310290kCZ;
import X.C1311370kEJ;
import X.C1311720kEs;
import X.C1313100kH6;
import X.C1313210kHH;
import X.C1316700kMu;
import X.C1316710kMv;
import X.C1316780kN2;
import X.EnumC1311070kDp;
import X.InterfaceC1311410kEN;
import X.InterfaceC1312730kGV;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import j27.s;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class FlattenUIText extends LynxFlattenUI {
    public Layout LL;
    public PointF LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public CharSequence LLILZLL;
    public C1316780kN2 LLIZ;
    public InterfaceC1312730kGV LLIZLLLIL;

    public final void LJJIIZI() {
        if (this.LLILLL && (LJJIJ() instanceof Spanned)) {
            Spanned spanned = (Spanned) LJJIJ();
            for (AbstractC1315450kKt abstractC1315450kKt : (AbstractC1315450kKt[]) spanned.getSpans(0, spanned.length(), AbstractC1315450kKt.class)) {
                abstractC1315450kKt.LJFF();
                if (!this.mContext.LLLIILIL) {
                    abstractC1315450kKt.LJIIIZ(null);
                }
            }
        }
    }

    public final CharSequence LJJIJ() {
        Layout layout = this.LL;
        if (layout != null) {
            return layout.getText();
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final EnumC1311070kDp getMeaningfulContentStatus() {
        return (this.LL == null && this.LLIZLLLIL == null) ? EnumC1311070kDp.PENDING : EnumC1311070kDp.PRESENTED;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        if (this.LLILLL && (LJJIJ() instanceof Spanned)) {
            AbstractC1315450kKt.LJIIIIZZ((Spanned) LJJIJ(), null);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final CharSequence getAccessibilityLabel() {
        CharSequence accessibilityLabel = super.getAccessibilityLabel();
        return !TextUtils.isEmpty(accessibilityLabel) ? accessibilityLabel : LJJIJ();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReady() {
        super.onNodeReady();
        if (this.mContext.LJIJJLI()) {
            C1311720kEs c1311720kEsLJIILIIL = this.mContext.LJIILIIL();
            int sign = getSign();
            C1316700kMu c1316700kMu = c1311720kEsLJIILIIL.LJIJJ;
            updateExtraData(c1316700kMu != null ? c1316700kMu.LIZIZ.get(sign) : null);
        }
        C1316780kN2 c1316780kN2 = this.LLIZ;
        if (c1316780kN2 != null) {
            C1313100kH6.LIZ(c1316780kN2, this);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxFlattenUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void detachWithViewInfo(C1313210kHH c1313210kHH) {
        super.detachWithViewInfo(c1313210kHH);
        if (this.LLILLL && (LJJIJ() instanceof Spanned)) {
            AbstractC1315450kKt.LJIIIIZZ((Spanned) LJJIJ(), new C1311370kEJ(this));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxFlattenUI
    public final void onDraw(Canvas canvas) throws Throwable {
        Spanned spanned;
        TraceEvent.LIZLLL("text.FlattenUIText.onDraw");
        super.onDraw(canvas);
        if (this.mIsDetachedWithView) {
            TraceEvent.LJII("text.FlattenUIText.onDraw");
            return;
        }
        if (this.LLIZLLLIL != null) {
            int i = this.mPaddingLeft + this.mBorderLeftWidth;
            int i2 = this.mPaddingRight + this.mBorderRightWidth;
            int i3 = this.mPaddingTop + this.mBorderTopWidth;
            int i4 = this.mPaddingBottom + this.mBorderBottomWidth;
            canvas.save();
            if (getOverflow() != 0) {
                Rect boundRectForOverflow = getBoundRectForOverflow();
                if (boundRectForOverflow != null) {
                    canvas.clipRect(boundRectForOverflow);
                }
            } else {
                C1310290kCZ c1310290kCZ = this.mContext.LLLIIII;
                if (c1310290kCZ == null || !c1310290kCZ.LJIJJ) {
                    canvas.clipRect(i, i3, getWidth() - i2, getHeight() - i4);
                }
            }
            canvas.translate(i, i3);
            this.LLIZLLLIL.xa(canvas, new C1311370kEJ(this));
            canvas.restore();
            TraceEvent.LJII("text.FlattenUIText.onDraw");
            return;
        }
        if (this.LL == null) {
            TraceEvent.LJII("text.FlattenUIText.onDraw");
            return;
        }
        int i5 = this.mPaddingLeft + this.mBorderLeftWidth;
        int i6 = this.mPaddingRight + this.mBorderRightWidth;
        int i7 = this.mPaddingTop + this.mBorderTopWidth;
        int i8 = this.mPaddingBottom + this.mBorderBottomWidth;
        canvas.save();
        if (getOverflow() != 0) {
            Rect boundRectForOverflow2 = getBoundRectForOverflow();
            if (boundRectForOverflow2 != null) {
                canvas.clipRect(boundRectForOverflow2);
            }
        } else {
            C1310290kCZ c1310290kCZ2 = this.mContext.LLLIIII;
            if (c1310290kCZ2 == null || !c1310290kCZ2.LJIJJ) {
                canvas.clipRect(i5, i7, getWidth() - i6, getHeight() - i8);
            }
        }
        PointF pointF = this.LLILLJJLI;
        canvas.translate(i5 + pointF.x, i7 + pointF.y);
        Layout layout = this.LL;
        if (layout != null) {
            spanned = (Spanned) layout.getText();
        } else {
            spanned = null;
        }
        if (spanned != null) {
            for (AbstractC1315450kKt abstractC1315450kKt : (AbstractC1315450kKt[]) spanned.getSpans(0, spanned.length(), AbstractC1315450kKt.class)) {
                abstractC1315450kKt.LIZLLL();
            }
        }
        if (this.LLILZIL && Build.VERSION.SDK_INT < 26) {
            C1316710kMv.LJFF(canvas, this.LL, (getWidth() - i5) - i6);
        } else {
            this.LL.draw(canvas);
        }
        if (this.LLILZ) {
            C1316710kMv.LJI(canvas, this.LL);
        }
        C1316710kMv.LJ(canvas, this.LL);
        canvas.restore();
        TraceEvent.LJII("text.FlattenUIText.onDraw");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateExtraData(Object obj) {
        Map<String, C1299120juY> map;
        if (obj instanceof C1316780kN2) {
            C1316780kN2 c1316780kN2 = (C1316780kN2) obj;
            this.LLIZ = c1316780kN2;
            this.LLIZLLLIL = null;
            LJJIIZI();
            this.LL = c1316780kN2.LIZJ;
            this.LLILLJJLI = c1316780kN2.LJ;
            boolean z = c1316780kN2.LIZ;
            this.LLILLL = z;
            this.LLILZ = c1316780kN2.LJFF;
            this.LLILZIL = c1316780kN2.LIZIZ;
            this.LLILZLL = c1316780kN2.LJI;
            if (z && (LJJIJ() instanceof Spanned)) {
                AbstractC1315450kKt.LJIIIIZZ((Spanned) LJJIJ(), new C1311370kEJ(this));
            }
            invalidate();
            if (this.mContext.LJIJJLI() && this.LLIZ != null && (map = this.mEvents) != null && map.containsKey("layout")) {
                C1316710kMv.LIZJ(this.mContext, getSign(), this.LLIZ);
                return;
            }
            return;
        }
        if (!(obj instanceof InterfaceC1312730kGV)) {
            return;
        }
        this.LLIZLLLIL = (InterfaceC1312730kGV) obj;
        this.LLIZ = null;
        LJJIIZI();
        this.LL = null;
        this.LLILLJJLI = new PointF();
        this.LLILLL = false;
        this.LLILZ = false;
        this.LLILZIL = false;
        this.LLILZLL = null;
        invalidate();
    }

    public FlattenUIText(s sVar, Object obj) {
        super(sVar, obj);
        this.mAccessibilityElementStatus = 1;
        s sVar2 = this.mContext;
        C1310290kCZ c1310290kCZ = sVar2.LLLIIII;
        if (c1310290kCZ != null && c1310290kCZ.LJIJJ && !sVar2.LJIJJLI()) {
            this.mOverflow = 3;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final InterfaceC1311410kEN hitTest(float f, float f2) {
        return hitTest(f, f2, false);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final InterfaceC1311410kEN hitTest(float f, float f2, boolean z) {
        float f3 = f - (this.mPaddingLeft + this.mBorderLeftWidth);
        float f4 = f2 - (this.mPaddingTop + this.mBorderTopWidth);
        Layout layout = this.LL;
        Spanned spanned = null;
        if (layout != null && (layout.getText() instanceof Spanned)) {
            spanned = (Spanned) layout.getText();
        }
        return C1313100kH6.LIZJ(this, f3, f4, this, layout, spanned, this.LLILLJJLI, this.LLIZLLLIL, z);
    }
}
