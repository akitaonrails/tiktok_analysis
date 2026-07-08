package com.bytedance.tux.badge;

import X.C07Y3;
import X.C1914007ec;
import X.C416900GWi;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426760GoM;
import X.C426780GoO;
import X.C426800GoQ;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC20742616Eu;
import X.InterfaceC426790GoP;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.app.R$styleable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class TuxAlertBadgeLayout extends FrameLayout implements InterfaceC20742616Eu {
    public static final int LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final C416900GWi LL;
    public C419910GdJ LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public CharSequence LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public View LLJILLL;
    public int LLJJ;
    public int LLJJI;

    public TuxAlertBadgeLayout(Context context) {
        this(context, null, 6);
    }

    public TuxAlertBadgeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static /* synthetic */ void getMaxCount$annotations() {
    }

    public static /* synthetic */ void getVariant$annotations() {
    }

    public final void LIZIZ() {
        this.LLJIJIL = false;
        invalidate();
    }

    public final void LIZJ() {
        this.LLJIJIL = true;
        invalidate();
    }

    public int getDotSize() {
        return this.LL.LIZJ;
    }

    public final void LIZLLL() {
        int i;
        int variant = getVariant();
        InterfaceC426790GoP c07y3 = variant != 0 ? variant != 1 ? variant != 2 ? variant != 3 ? null : new C07Y3(this.LLILZIL) : new C426800GoQ(this.LLILZLL) : new C426780GoO(getMaxCount(), getCount()) : new C1914007ec(getDotSize());
        if ((c07y3 instanceof C426800GoQ) && (i = this.LLILZLL) != 0) {
            C419910GdJ c419910GdJ = this.LLILLJJLI;
            if (c419910GdJ == null || c419910GdJ.LIZ != i) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = this.LLILZLL;
                c419910GdJ2.LIZLLL = Integer.valueOf(this.LLILLL);
                c419910GdJ2.LIZIZ = 44;
                c419910GdJ2.LIZJ = 44;
                this.LLILLJJLI = c419910GdJ2;
                this.LL.LIZLLL = c419910GdJ2.LIZ(getContext());
                TuxIconDrawable tuxIconDrawable = this.LL.LIZLLL;
                setContentDescription(tuxIconDrawable != null ? tuxIconDrawable.LJIILLIIL : null);
            }
        } else if (c07y3 != null) {
            this.LL.LJII = C426760GoM.LIZJ(c07y3);
            setContentDescription(this.LL.LJII);
        }
        this.LL.LIZ();
        requestLayout();
    }

    public final int getAttachTo() {
        return this.LLJ;
    }

    public final int getBadgeIconRes() {
        return this.LLILZLL;
    }

    public final CharSequence getBadgeText() {
        return this.LLILZIL;
    }

    public int getCount() {
        return this.LLIZ;
    }

    public int getMaxCount() {
        return this.LLIZLLLIL;
    }

    public final int getOffsetX() {
        return this.LLJILJIL;
    }

    public final int getOffsetY() {
        return this.LLJILJILJ;
    }

    public int getVariant() {
        return this.LLILZ;
    }

    public final void LIZ(View view) {
        if (view.getVisibility() == 8) {
            this.LLJJ = Integer.MIN_VALUE;
            this.LLJJI = Integer.MIN_VALUE;
            return;
        }
        this.LLJJ += view.getLeft();
        this.LLJJI += view.getTop();
        Object parent = view.getParent();
        if (!Intrinsics.LJFF(parent, this)) {
            LIZ((View) parent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.LLJI && this.LLJIJIL) {
            canvas.save();
            canvas.translate(this.LLJJ, this.LLJJI);
            this.LL.draw(canvas);
            canvas.restore();
        }
    }

    public final void setAttachTo(int i) {
        View viewFindViewById;
        this.LLJ = i;
        if (i == -1) {
            viewFindViewById = null;
        } else {
            viewFindViewById = findViewById(i);
        }
        this.LLJILLL = viewFindViewById;
        requestLayout();
    }

    public final void setBadgeBackgroundColor(int i) {
        C416900GWi c416900GWi = this.LL;
        c416900GWi.LIZIZ = i;
        c416900GWi.invalidateSelf();
        invalidate();
    }

    public final void setBadgeContentColor(int i) {
        this.LL.LIZ = i;
        invalidate();
    }

    public final void setBadgeIconRes(int i) {
        this.LLILZLL = i;
        LIZLLL();
    }

    public final void setBadgeText(CharSequence charSequence) {
        this.LLILZIL = charSequence;
        LIZLLL();
    }

    @Override // X.InterfaceC20742616Eu
    public void setCount(int i) {
        this.LLIZ = i;
        LIZLLL();
    }

    @Override // X.InterfaceC20742616Eu
    public void setDotSize(int i) {
        C416900GWi c416900GWi = this.LL;
        c416900GWi.LIZJ = i;
        if (c416900GWi.LJII.length() == 0) {
            requestLayout();
        }
    }

    @Override // X.InterfaceC20742616Eu
    public void setMaxCount(int i) {
        this.LLIZLLLIL = i;
        LIZLLL();
    }

    public final void setOffsetX(int i) {
        this.LLJILJIL = i;
        requestLayout();
    }

    public final void setOffsetY(int i) {
        this.LLJILJILJ = i;
        requestLayout();
    }

    public final void setTopmost(boolean z) {
        this.LLJI = z;
        invalidate();
    }

    @Override // X.InterfaceC20742616Eu
    public void setVariant(int i) {
        this.LLILZ = i;
        this.LL.LJ = i;
        LIZLLL();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.LL.LIZ();
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TuxAlertBadgeLayout(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.LLILZIL = "";
        this.LLJ = -1;
        this.LLJIJIL = true;
        this.LL = C426760GoM.LIZIZ(context, attributeSet, 60);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxAlertBadgeLayout, 0, 0);
        setVariant(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadgeLayout_tux_badgeVariant, 0));
        setCount(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadgeLayout_tux_badgeCount, 0));
        setMaxCount(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadgeLayout_tux_badgeMaxCount, 0));
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxAlertBadgeLayout_tux_badgeText);
        setBadgeText(strXd != null ? strXd : "");
        this.LLILLL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAlertBadgeLayout_tux_badgeContentColor, 0);
        setBadgeIconRes(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadgeLayout_tux_badgeIcon, 0));
        setAttachTo(typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxAlertBadgeLayout_tux_badgeAttachTo, -1));
        setTopmost(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxAlertBadgeLayout_tux_badgeTopmost, false));
        setOffsetX(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.TuxAlertBadgeLayout_tux_badgeOffsetX, 0));
        setOffsetY(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.TuxAlertBadgeLayout_tux_badgeOffsetY, 0));
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (!this.LLJI && Intrinsics.LJFF(view, this.LLJILLL) && this.LLJIJIL) {
            canvas.save();
            canvas.translate(this.LLJJ, this.LLJJI);
            this.LL.draw(canvas);
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        View childAt = this.LLJILLL;
        if (childAt == null) {
            if (getChildCount() == 0) {
                return;
            }
            childAt = getChildAt(0);
            this.LLJILLL = childAt;
        }
        this.LLJJ = 0;
        this.LLJJI = 0;
        LIZ(childAt);
        C416900GWi c416900GWi = this.LL;
        int i11 = c416900GWi.LJI;
        int i12 = c416900GWi.LJFF;
        if (getVariant() == 0) {
            if (getLayoutDirection() == 1) {
                i6 = this.LLJJ - (i11 / 2);
                i7 = this.LLJILJIL;
                i8 = i6 - i7;
            } else {
                width = (this.LLJJ - (i11 / 2)) + childAt.getWidth();
                i5 = this.LLJILJIL;
                i8 = i5 + width;
            }
        } else if (getLayoutDirection() == 1) {
            i6 = this.LLJJ - LLJJIII;
            i7 = this.LLJILJIL;
            i8 = i6 - i7;
        } else {
            width = ((this.LLJJ + childAt.getWidth()) - i11) + LLJJIII;
            i5 = this.LLJILJIL;
            i8 = i5 + width;
        }
        if (getVariant() == 0) {
            i9 = this.LLJJI;
            i10 = i12 / 2;
        } else {
            i9 = this.LLJJI;
            i10 = LLJJIII;
        }
        int i13 = (i9 - i10) + this.LLJILJILJ;
        this.LLJJ = i8;
        this.LLJJI = i13;
    }
}
