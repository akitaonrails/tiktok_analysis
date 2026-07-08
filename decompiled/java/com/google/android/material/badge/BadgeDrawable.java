package com.google.android.material.badge;

import X.C19PG;
import X.C19Q9;
import X.C19QD;
import X.C19QF;
import X.C21538919Rb;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes34.dex */
public final class BadgeDrawable extends Drawable implements C19QF {
    public final WeakReference<Context> LL;
    public final C21538919Rb LLILLJJLI;
    public final C19QD LLILLL;
    public final Rect LLILZ;
    public final float LLILZIL;
    public final float LLILZLL;
    public final float LLIZ;
    public final SavedState LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public int LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public WeakReference<View> LLJJ;
    public WeakReference<FrameLayout> LLJJI;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final FrameLayout LIZLLL() {
        WeakReference<FrameLayout> weakReference = this.LLJJI;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final boolean LJFF() {
        return this.LLIZLLLIL.number != -1;
    }

    public final void LJIIIZ() {
        FrameLayout frameLayout;
        Context context = this.LL.get();
        WeakReference<View> weakReference = this.LLJJ;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.LLILZ);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.LLJJI;
        if (weakReference2 != null && (frameLayout = weakReference2.get()) != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        int i = this.LLIZLLLIL.badgeGravity;
        if (i == 8388691 || i == 8388693) {
            this.LLJI = rect2.bottom - r7.verticalOffset;
        } else {
            this.LLJI = rect2.top + r7.verticalOffset;
        }
        if (LJ() <= 9) {
            float f = !LJFF() ? this.LLILZIL : this.LLILZLL;
            this.LLJILJIL = f;
            this.LLJILLL = f;
            this.LLJILJILJ = f;
        } else {
            float f2 = this.LLILZLL;
            this.LLJILJIL = f2;
            this.LLJILLL = f2;
            this.LLJILJILJ = (this.LLILLL.LIZ(LIZIZ()) / 2.0f) + this.LLIZ;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(LJFF() ? R.dimen.a7m : R.dimen.a7j);
        int i2 = this.LLIZLLLIL.badgeGravity;
        if (i2 == 8388659 || i2 == 8388691) {
            this.LLJ = view.getLayoutDirection() == 0 ? (rect2.left - this.LLJILJILJ) + dimensionPixelSize + this.LLIZLLLIL.horizontalOffset : ((rect2.right + this.LLJILJILJ) - dimensionPixelSize) - this.LLIZLLLIL.horizontalOffset;
        } else {
            this.LLJ = view.getLayoutDirection() == 0 ? ((rect2.right + this.LLJILJILJ) - dimensionPixelSize) - this.LLIZLLLIL.horizontalOffset : (rect2.left - this.LLJILJILJ) + dimensionPixelSize + this.LLIZLLLIL.horizontalOffset;
        }
        Rect rect3 = this.LLILZ;
        float f3 = this.LLJ;
        float f4 = this.LLJI;
        float f5 = this.LLJILJILJ;
        float f6 = this.LLJILLL;
        rect3.set((int) (f3 - f5), (int) (f4 - f6), (int) (f3 + f5), (int) (f4 + f6));
        C21538919Rb c21538919Rb = this.LLILLJJLI;
        c21538919Rb.setShapeAppearanceModel(c21538919Rb.LL.LIZ.LJ(this.LLJILJIL));
        if (rect.equals(this.LLILZ)) {
            return;
        }
        this.LLILLJJLI.setBounds(this.LLILZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LLIZLLLIL.alpha;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LLILZ.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LLILZ.width();
    }

    public final String LIZIZ() {
        if (LJ() <= this.LLJIJIL) {
            return NumberFormat.getInstance().format(LJ());
        }
        Context context = this.LL.get();
        return context == null ? "" : context.getString(2131837539, Integer.valueOf(this.LLJIJIL), "+");
    }

    public final CharSequence LIZJ() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!LJFF()) {
            return this.LLIZLLLIL.contentDescriptionNumberless;
        }
        if (this.LLIZLLLIL.contentDescriptionQuantityStrings <= 0 || (context = this.LL.get()) == null) {
            return null;
        }
        int iLJ = LJ();
        int i = this.LLJIJIL;
        return iLJ <= i ? context.getResources().getQuantityString(this.LLIZLLLIL.contentDescriptionQuantityStrings, LJ(), Integer.valueOf(LJ())) : context.getString(this.LLIZLLLIL.contentDescriptionExceedsMaxBadgeNumberRes, Integer.valueOf(i));
    }

    public final int LJ() {
        if (LJFF()) {
            return this.LLIZLLLIL.number;
        }
        return 0;
    }

    @Override // X.C19QF
    public final void LIZ() {
        invalidateSelf();
    }

    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: X.19S9
            @Override // android.os.Parcelable.Creator
            public final BadgeDrawable.SavedState createFromParcel(Parcel parcel) {
                return new BadgeDrawable.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final BadgeDrawable.SavedState[] newArray(int i) {
                return new BadgeDrawable.SavedState[i];
            }
        };
        public int alpha;
        public int backgroundColor;
        public int badgeGravity;
        public int badgeTextColor;
        public int contentDescriptionExceedsMaxBadgeNumberRes;
        public CharSequence contentDescriptionNumberless;
        public int contentDescriptionQuantityStrings;
        public int horizontalOffset;
        public boolean isVisible;
        public int maxCharacterCount;
        public int number;
        public int verticalOffset;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState(Parcel parcel) {
            boolean z;
            this.alpha = 255;
            this.number = -1;
            this.backgroundColor = parcel.readInt();
            this.badgeTextColor = parcel.readInt();
            this.alpha = parcel.readInt();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = parcel.readInt();
            this.horizontalOffset = parcel.readInt();
            this.verticalOffset = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.isVisible = z;
        }

        public SavedState(Context context) {
            this.alpha = 255;
            this.number = -1;
            this.badgeTextColor = new C19Q9(context, R.style.qc).LIZ.getDefaultColor();
            this.contentDescriptionNumberless = context.getString(2131837536);
            this.contentDescriptionQuantityStrings = 2131755421;
            this.contentDescriptionExceedsMaxBadgeNumberRes = 2131837538;
            this.isVisible = true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.backgroundColor);
            parcel.writeInt(this.badgeTextColor);
            parcel.writeInt(this.alpha);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            parcel.writeString(this.contentDescriptionNumberless.toString());
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeInt(this.badgeGravity);
            parcel.writeInt(this.horizontalOffset);
            parcel.writeInt(this.verticalOffset);
            parcel.writeInt(this.isVisible ? 1 : 0);
        }
    }

    public BadgeDrawable(Context context) {
        C19Q9 c19q9;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.LL = weakReference;
        C19PG.LIZJ(context, C19PG.LIZIZ, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.LLILZ = new Rect();
        this.LLILLJJLI = new C21538919Rb();
        this.LLILZIL = resources.getDimensionPixelSize(R.dimen.a7l);
        this.LLIZ = resources.getDimensionPixelSize(R.dimen.a7k);
        this.LLILZLL = resources.getDimensionPixelSize(R.dimen.a7q);
        C19QD c19qd = new C19QD(this);
        this.LLILLL = c19qd;
        c19qd.LIZ.setTextAlign(Paint.Align.CENTER);
        this.LLIZLLLIL = new SavedState(context);
        Context context3 = weakReference.get();
        if (context3 != null && c19qd.LJFF != (c19q9 = new C19Q9(context3, R.style.qc)) && (context2 = weakReference.get()) != null) {
            c19qd.LIZIZ(c19q9, context2);
            LJIIIZ();
        }
    }

    public final void LJI(int i) {
        FrameLayout frameLayout;
        SavedState savedState = this.LLIZLLLIL;
        if (savedState.badgeGravity != i) {
            savedState.badgeGravity = i;
            WeakReference<View> weakReference = this.LLJJ;
            if (weakReference != null && weakReference.get() != null) {
                View view = this.LLJJ.get();
                WeakReference<FrameLayout> weakReference2 = this.LLJJI;
                if (weakReference2 != null) {
                    frameLayout = weakReference2.get();
                } else {
                    frameLayout = null;
                }
                LJIIIIZZ(view, frameLayout);
            }
        }
    }

    public final void LJII(int i) {
        SavedState savedState = this.LLIZLLLIL;
        if (savedState.maxCharacterCount != i) {
            savedState.maxCharacterCount = i;
            this.LLJIJIL = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
            this.LLILLL.LIZLLL = true;
            LJIIIZ();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && this.LLIZLLLIL.alpha != 0 && isVisible()) {
            this.LLILLJJLI.draw(canvas);
            if (LJFF()) {
                Rect rect = new Rect();
                String strLIZIZ = LIZIZ();
                this.LLILLL.LIZ.getTextBounds(strLIZIZ, 0, strLIZIZ.length(), rect);
                canvas.drawText(strLIZIZ, this.LLJ, this.LLJI + (rect.height() / 2), this.LLILLL.LIZ);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable, X.C19QF
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LLIZLLLIL.alpha = i;
        this.LLILLL.LIZ.setAlpha(i);
        invalidateSelf();
    }

    public final void LJIIIIZZ(View view, FrameLayout frameLayout) {
        this.LLJJ = new WeakReference<>(view);
        this.LLJJI = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        LJIIIZ();
        invalidateSelf();
    }
}
