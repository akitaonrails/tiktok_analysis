package com.bytedance.tux.skeleton;

import X.AbstractC20628015ni;
import X.C09RD;
import X.C09RE;
import X.C450710Hlt;
import X.C786410Ut5;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes32.dex */
public final class TuxSkeletonLayout extends AbstractC20628015ni {
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public final LinearLayout LLJJIII;

    public TuxSkeletonLayout(Context context) {
        this(context, null, 6);
    }

    public TuxSkeletonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static /* synthetic */ void getRepeatOrientation$annotations() {
    }

    public final int getPreviewItemRes() {
        return this.LLJILLL;
    }

    public final int getRepeat() {
        return this.LLJILJIL;
    }

    public final int getRepeatOrientation() {
        return this.LLJILJILJ;
    }

    public final void LIZLLL(int i) {
        while (this.LLJJIII.getChildCount() < i) {
            FrameLayout.inflate(getContext(), this.LLJILLL, this.LLJJIII);
        }
        while (this.LLJJIII.getChildCount() > i) {
            C786410Ut5.LJJLJ(0, this.LLJJIII);
        }
    }

    public final void setPreviewItemRes(int i) {
        if (this.LLJILLL != i) {
            this.LLJILLL = i;
            C786410Ut5.LJJJJJL(this.LLJJIII);
            FrameLayout.inflate(getContext(), this.LLJILLL, this.LLJJIII);
            this.LLJJIII.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.LLJJ = this.LLJJIII.getMeasuredWidth();
            this.LLJJI = this.LLJJIII.getMeasuredHeight();
            C786410Ut5.LJJJJJL(this.LLJJIII);
        }
    }

    public final void setRepeat(int i) {
        if (this.LLJILJIL != i) {
            this.LLJILJIL = i;
            if (LIZJ() && this.LLJILLL != 0) {
                requestLayout();
            }
        }
    }

    public final void setRepeatOrientation(int i) {
        if (this.LLJILJILJ != i) {
            if (LIZJ() && this.LLJILLL != 0) {
                if (i != 2 && this.LLJILJILJ != 2) {
                    requestLayout();
                } else {
                    C786410Ut5.LJJJJJL(this.LLJJIII);
                }
            }
            this.LLJILJILJ = i;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 1;
        if (this.LLJILLL != 0) {
            z = true;
        } else {
            z = false;
        }
        if (LIZJ() && z) {
            Iterator<View> it2 = new C09RD(this).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (!c09re.hasNext()) {
                    break;
                } else {
                    C786410Ut5.LJLLLLLL(8, (View) c09re.next());
                }
            }
            C786410Ut5.LJZL(0, this.LLJJIII);
            LinearLayout linearLayout = this.LLJJIII;
            int i10 = this.LLJILJILJ;
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("wrong repeatOrientation");
                }
                i3 = 1;
            } else {
                i3 = 0;
            }
            linearLayout.setOrientation(i3);
            int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
            int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
            if (this.LLJILJILJ == 2) {
                int i11 = this.LLJILJIL;
                if (size == 0) {
                    i5 = 1;
                } else {
                    int i12 = this.LLJJ;
                    int i13 = size / i12;
                    if (size % i12 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                    i5 = i13 + i4;
                }
                if (size2 == 0) {
                    i7 = 1;
                } else {
                    int i14 = this.LLJJI;
                    int i15 = size2 / i14;
                    if (size2 % i14 == 0) {
                        i6 = 0;
                    } else {
                        i6 = 1;
                    }
                    i7 = i15 + i6;
                }
                if (i11 <= 0) {
                    i11 = i5 * i7;
                }
                int i16 = i11 / i5;
                int i17 = i11 % i5;
                if (i17 != 0) {
                    i9 = 0;
                }
                int i18 = i16 - i9;
                if (i17 == 0) {
                    i17 = i5;
                }
                while (true) {
                    i8 = i18 + 1;
                    if (this.LLJJIII.getChildCount() >= i8) {
                        break;
                    }
                    LinearLayout linearLayout2 = this.LLJJIII;
                    TuxSkeletonLayout tuxSkeletonLayout = new TuxSkeletonLayout(getContext(), null, 6);
                    tuxSkeletonLayout.setRepeatOrientation(0);
                    tuxSkeletonLayout.setPreviewItemRes(this.LLJILLL);
                    linearLayout2.addView(tuxSkeletonLayout, new FrameLayout.LayoutParams(-1, -2));
                }
                while (this.LLJJIII.getChildCount() > i8) {
                    C786410Ut5.LJJLJ(0, this.LLJJIII);
                }
                for (int i19 = 0; i19 < i18; i19++) {
                    ((TuxSkeletonLayout) this.LLJJIII.getChildAt(i19)).setRepeat(i5);
                }
                ((TuxSkeletonLayout) this.LLJJIII.getChildAt(i18)).setRepeat(i17);
                this.LLJJIII.requestLayout();
            } else {
                int i20 = this.LLJILJIL;
                if (i20 <= 0) {
                    if (this.LLJJIII.getOrientation() == 0) {
                        if (size == 0) {
                            LIZLLL(1);
                        } else {
                            int i21 = this.LLJJ;
                            int i22 = size / i21;
                            if (size % i21 == 0) {
                                i9 = 0;
                            }
                            LIZLLL(i22 + i9);
                        }
                    } else if (size2 == 0) {
                        LIZLLL(1);
                    } else {
                        int i23 = this.LLJJI;
                        int i24 = size2 / i23;
                        if (size2 % i23 == 0) {
                            i9 = 0;
                        }
                        LIZLLL(i24 + i9);
                    }
                } else {
                    LIZLLL(i20);
                }
            }
        } else {
            Iterator<View> it3 = new C09RD(this).iterator();
            while (true) {
                C09RE c09re2 = (C09RE) it3;
                if (!c09re2.hasNext()) {
                    break;
                } else {
                    C786410Ut5.LJLLLLLL(0, (View) c09re2.next());
                }
            }
            C786410Ut5.LJZL(8, this.LLJJIII);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TuxSkeletonLayout(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.LLJJ = Integer.MAX_VALUE;
        this.LLJJI = Integer.MAX_VALUE;
        LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-2, -2));
        this.LLJJIII = linearLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxSkeletonLayout, 0, 0);
        int i2 = R$styleable.TuxSkeletonLayout_tux_skeletonLoading;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            C450710Hlt.LIZ(typedArrayObtainStyledAttributes, i2);
            setLoading(typedArrayObtainStyledAttributes.getBoolean(i2, false));
        }
        setPreviewItemRes(typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxSkeletonLayout_tux_skeletonPreviewItem, 0));
        setRepeat(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxSkeletonLayout_tux_skeletonRepeat, 0));
        setRepeatOrientation(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxSkeletonLayout_tux_skeletonRepeatOrientation, 0));
        typedArrayObtainStyledAttributes.recycle();
        addView(linearLayout, new ViewGroup.MarginLayoutParams(-1, -1));
    }
}
