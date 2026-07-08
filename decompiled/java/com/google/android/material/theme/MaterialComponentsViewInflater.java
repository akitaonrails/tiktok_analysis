package com.google.android.material.theme;

import X.C19S0;
import X.C21410218qa;
import X.C21411218qk;
import X.C21412018qs;
import X.C21412118qt;
import X.C21413018r2;
import X.C21552219We;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: loaded from: classes34.dex */
public class MaterialComponentsViewInflater extends C21413018r2 {
    @Override // X.C21413018r2
    public final C21411218qk createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C21552219We(context, attributeSet);
    }

    @Override // X.C21413018r2
    public final C21410218qa createButton(Context context, AttributeSet attributeSet) {
        return new C19S0(context, attributeSet);
    }

    @Override // X.C21413018r2
    public final C21412118qt createCheckBox(final Context context, final AttributeSet attributeSet) {
        return new C21412118qt(context, attributeSet) { // from class: X.19PL
            public static final int[][] LLIZ = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
            public ColorStateList LLILZIL;
            public boolean LLILZLL;

            private ColorStateList getMaterialThemeColorsTintList() {
                if (this.LLILZIL == null) {
                    int iLIZIZ = C19PM.LIZIZ(com.zhiliaoapp.musically.R.attr.bif, this);
                    int iLIZIZ2 = C19PM.LIZIZ(com.zhiliaoapp.musically.R.attr.bix, this);
                    int iLIZIZ3 = C19PM.LIZIZ(com.zhiliaoapp.musically.R.attr.bio, this);
                    this.LLILZIL = new ColorStateList(LLIZ, new int[]{C19PM.LIZJ(1.0f, iLIZIZ2, iLIZIZ), C19PM.LIZJ(0.54f, iLIZIZ2, iLIZIZ3), C19PM.LIZJ(0.38f, iLIZIZ2, iLIZIZ3), C19PM.LIZJ(0.38f, iLIZIZ2, iLIZIZ3)});
                }
                return this.LLILZIL;
            }

            @Override // android.widget.TextView, android.view.View
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                if (this.LLILZLL && C20744916Fr.LIZ(this) == null) {
                    setUseMaterialThemeColors(true);
                }
            }

            public void setUseMaterialThemeColors(boolean z) {
                this.LLILZLL = z;
                if (z) {
                    C20744916Fr.LIZJ(this, getMaterialThemeColorsTintList());
                } else {
                    C20744916Fr.LIZJ(this, null);
                }
            }

            {
                super(C1369550lk9.LIZ(context, attributeSet, com.zhiliaoapp.musically.R.attr.bfw, com.zhiliaoapp.musically.R.style.a4u), attributeSet, com.zhiliaoapp.musically.R.attr.bfw);
                Context context2 = getContext();
                TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context2, attributeSet, R$styleable.MaterialCheckBox, com.zhiliaoapp.musically.R.attr.bfw, com.zhiliaoapp.musically.R.style.a4u, new int[0]);
                if (typedArrayLIZLLL.hasValue(R$styleable.MaterialCheckBox_buttonTint)) {
                    C20744916Fr.LIZJ(this, C19RN.LIZ(context2, typedArrayLIZLLL, R$styleable.MaterialCheckBox_buttonTint));
                }
                this.LLILZLL = typedArrayLIZLLL.getBoolean(R$styleable.MaterialCheckBox_useMaterialThemeColors, false);
                typedArrayLIZLLL.recycle();
            }
        };
    }

    @Override // X.C21413018r2
    public final C21412018qs createRadioButton(final Context context, final AttributeSet attributeSet) {
        return new C21412018qs(context, attributeSet) { // from class: X.19PK
            public static final int[][] LLIZ = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
            public ColorStateList LLILZIL;
            public boolean LLILZLL;

            private ColorStateList getMaterialThemeColorsTintList() {
                if (this.LLILZIL == null) {
                    int iLIZIZ = C19PM.LIZIZ(com.zhiliaoapp.musically.R.attr.bif, this);
                    int iLIZIZ2 = C19PM.LIZIZ(com.zhiliaoapp.musically.R.attr.bio, this);
                    int iLIZIZ3 = C19PM.LIZIZ(com.zhiliaoapp.musically.R.attr.bix, this);
                    this.LLILZIL = new ColorStateList(LLIZ, new int[]{C19PM.LIZJ(1.0f, iLIZIZ3, iLIZIZ), C19PM.LIZJ(0.54f, iLIZIZ3, iLIZIZ2), C19PM.LIZJ(0.38f, iLIZIZ3, iLIZIZ2), C19PM.LIZJ(0.38f, iLIZIZ3, iLIZIZ2)});
                }
                return this.LLILZIL;
            }

            @Override // android.widget.TextView, android.view.View
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                if (this.LLILZLL && C20744916Fr.LIZ(this) == null) {
                    setUseMaterialThemeColors(true);
                }
            }

            public void setUseMaterialThemeColors(boolean z) {
                this.LLILZLL = z;
                if (z) {
                    C20744916Fr.LIZJ(this, getMaterialThemeColorsTintList());
                } else {
                    C20744916Fr.LIZJ(this, null);
                }
            }

            {
                super(C1369550lk9.LIZ(context, attributeSet, com.zhiliaoapp.musically.R.attr.fdd, com.zhiliaoapp.musically.R.style.a4v), attributeSet, com.zhiliaoapp.musically.R.attr.fdd);
                Context context2 = getContext();
                TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context2, attributeSet, R$styleable.MaterialRadioButton, com.zhiliaoapp.musically.R.attr.fdd, com.zhiliaoapp.musically.R.style.a4v, new int[0]);
                if (typedArrayLIZLLL.hasValue(R$styleable.MaterialRadioButton_buttonTint)) {
                    C20744916Fr.LIZJ(this, C19RN.LIZ(context2, typedArrayLIZLLL, R$styleable.MaterialRadioButton_buttonTint));
                }
                this.LLILZLL = typedArrayLIZLLL.getBoolean(R$styleable.MaterialRadioButton_useMaterialThemeColors, false);
                typedArrayLIZLLL.recycle();
            }
        };
    }

    @Override // X.C21413018r2
    public final AppCompatTextView createTextView(final Context context, final AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet) { // from class: X.19PD
            {
                int iLIZJ;
                super(C1369550lk9.LIZ(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
                Context context2 = getContext();
                TypedValue typedValueLIZ = C19PF.LIZ(com.zhiliaoapp.musically.R.attr.fs_, context2);
                if (typedValueLIZ == null || typedValueLIZ.type != 18 || typedValueLIZ.data != 0) {
                    Resources.Theme theme = context2.getTheme();
                    int[] iArr = R$styleable.MaterialTextView;
                    TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                    int[] iArr2 = {R$styleable.MaterialTextView_android_lineHeight, R$styleable.MaterialTextView_lineHeight};
                    int i = 0;
                    do {
                        iLIZJ = C19RN.LIZJ(context2, typedArrayObtainStyledAttributes, iArr2[i], -1);
                        i++;
                        if (i >= 2) {
                            break;
                        }
                    } while (iLIZJ < 0);
                    typedArrayObtainStyledAttributes.recycle();
                    if (iLIZJ == -1) {
                        TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(R$styleable.MaterialTextView_android_textAppearance, -1);
                        typedArrayObtainStyledAttributes2.recycle();
                        if (resourceId != -1) {
                            LJJJI(resourceId, theme);
                        }
                    }
                }
            }

            public final void LJJJI(int i, Resources.Theme theme) {
                int iLIZJ;
                TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, R$styleable.MaterialTextAppearance);
                Context context2 = getContext();
                int i2 = 0;
                int[] iArr = {R$styleable.MaterialTextAppearance_android_lineHeight, R$styleable.MaterialTextAppearance_lineHeight};
                do {
                    iLIZJ = C19RN.LIZJ(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
                    i2++;
                    if (i2 >= 2) {
                        break;
                    }
                } while (iLIZJ < 0);
                typedArrayObtainStyledAttributes.recycle();
                if (iLIZJ >= 0) {
                    setLineHeight(iLIZJ);
                }
            }

            @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
            public final void setTextAppearance(Context context2, int i) {
                super.setTextAppearance(context2, i);
                TypedValue typedValueLIZ = C19PF.LIZ(com.zhiliaoapp.musically.R.attr.fs_, context2);
                if (typedValueLIZ == null || typedValueLIZ.type != 18 || typedValueLIZ.data != 0) {
                    LJJJI(i, context2.getTheme());
                }
            }
        };
    }
}
