package com.bytedance.tux.input;

import X.C01GW;
import X.C1308910kAL;
import X.C1697600uHG;
import X.C21369218jy;
import X.C21369318jz;
import X.C21369418k0;
import X.C21369918k5;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C434230H0z;
import X.C444900HcW;
import X.C444910HcX;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public class TuxTextView extends AppCompatTextView {
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public float LLJJI;
    public boolean LLJJIII;
    public Map<String, Float> LLJJIJI;
    public float LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public Float LLJJJ;
    public float LLJJJIL;

    public TuxTextView(Context context) {
        this(context, null, 6, 0);
    }

    public TuxTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final boolean getScreenAntiBurnEnabled() {
        return false;
    }

    private final C21369918k5 getAutoSizeHelper() {
        return (C21369918k5) this.LLJILJILJ.getValue();
    }

    private final C21369418k0 getDynamicAdaptiveHelper() {
        return (C21369418k0) this.LLJJIJIL.getValue();
    }

    public final void LJJJJIZL() {
        int i = this.LLJI;
        int i2 = this.LLJIJIL;
        boolean z = true;
        if (1 > i2 || i2 >= i) {
            C21369918k5 autoSizeHelper = getAutoSizeHelper();
            autoSizeHelper.LIZJ = -1;
            autoSizeHelper.LIZLLL = -1;
            autoSizeHelper.LJFF = new int[0];
            autoSizeHelper.LIZIZ = false;
            z = false;
        } else {
            C21369918k5 autoSizeHelper2 = getAutoSizeHelper();
            int i3 = this.LLJIJIL;
            int i4 = this.LLJI;
            autoSizeHelper2.getClass();
            if (i3 <= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Minimum auto-size text size ( ");
                sbLIZ.append(i3);
                sbLIZ.append(" px) is less or equal to (0px)");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }
            if (i4 <= i3) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Maximum auto-size text size ( ");
                sbLIZ2.append(i4);
                sbLIZ2.append(" px) is less or equal to minimum auto-size text size ( ");
                sbLIZ2.append(i3);
                sbLIZ2.append(" px)");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                strLIZIZ2.toString();
                throw new IllegalArgumentException(strLIZIZ2);
            }
            autoSizeHelper2.LIZJ = i3;
            autoSizeHelper2.LIZLLL = i4;
            int i5 = 1;
            while (true) {
                i3++;
                if (i3 > autoSizeHelper2.LIZLLL) {
                    break;
                } else {
                    i5++;
                }
            }
            int[] iArr = new int[i5];
            int i6 = autoSizeHelper2.LIZJ;
            for (int i7 = 0; i7 < i5; i7++) {
                iArr[i7] = i6;
                i6++;
            }
            autoSizeHelper2.LJFF = iArr;
            autoSizeHelper2.LIZIZ = true;
            autoSizeHelper2.LIZ(1);
        }
        this.LLJILJIL = z;
        setText(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return (isClickable() && getMovementMethod() == null && getKeyListener() == null) ? Button.class.getName() : super.getAccessibilityClassName();
    }

    public final boolean getAutoSizingWithMinWidth$tux_theme_release() {
        return this.LLJILLL;
    }

    public final Map<String, Float> getCurrentFontVariationSettings$tux_theme_release() {
        return this.LLJJIJI;
    }

    public final float getCurrentTrustTextSize$tux_theme_release() {
        return this.LLJJIJIIJIL;
    }

    public final int getMinTextSize() {
        return this.LLJIJIL;
    }

    public final float getOriginLetterSpacing$tux_theme_release() {
        return this.LLJJJIL;
    }

    public final Float getOriginTextSize$tux_theme_release() {
        return this.LLJJJ;
    }

    public final boolean getSupportDynamicFont$tux_theme_release() {
        return this.LLJJIII;
    }

    public final void LJJJIL(boolean z) {
        this.LLJILLL = z;
        getAutoSizeHelper().LJII = z;
    }

    public final void LJJJJI(float f) {
        setTextSize(1, this.LLJJI * f);
        this.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf((f * this.LLJJI) + 4)));
        this.LLJI = (int) (getTextSize() * this.LLJJI);
        LJJJJIZL();
    }

    public final void setAutoSizingWithMinWidth$tux_theme_release(boolean z) {
        this.LLJILLL = z;
    }

    public final void setCurrentFontVariationSettings$tux_theme_release(Map<String, Float> map) {
        this.LLJJIJI = map;
    }

    public final void setCurrentTrustTextSize$tux_theme_release(float f) {
        this.LLJJIJIIJIL = f;
    }

    public final void setMinTextSize(float f) {
        setMinTextSizePx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f))));
    }

    public final void setMinTextSizePx(int i) {
        this.LLJIJIL = i;
        LJJJJIZL();
    }

    public final void setOriginLetterSpacing$tux_theme_release(float f) {
        this.LLJJJIL = f;
    }

    public final void setOriginTextSize$tux_theme_release(Float f) {
        this.LLJJJ = f;
    }

    public final void setSupportDynamicFont$tux_theme_release(boolean z) {
        this.LLJJIII = z;
    }

    public final void setTextColorRes(int i) {
        Integer numLIZJ;
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(i, context)) != null) {
            setTextColor(numLIZJ.intValue());
        }
    }

    public final void setTuxFont(int i) {
        boolean z;
        boolean z2;
        if (this.LLJJIII) {
            z = true;
        } else {
            z = false;
        }
        Integer numLIZ = C1308910kAL.LIZ(R.attr.du, getContext());
        if (numLIZ != null && numLIZ.intValue() == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        C444900HcW c444900HcWLIZJ = C1697600uHG.LIZJ(i, z, z2);
        setTextSize(1, c444900HcWLIZJ.LIZ);
        setTypeface(c444900HcWLIZJ.LIZJ);
        this.LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c444900HcWLIZJ.LIZ)));
        this.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c444900HcWLIZJ.LIZIZ)));
        this.LLJ = c444900HcWLIZJ.LIZ;
        this.LLJJI = c444900HcWLIZJ.LIZLLL;
        Map<String, Float> map = c444900HcWLIZJ.LJ;
        if (map != null && !map.isEmpty()) {
            this.LLJJIJI = map;
            this.LLJJIJIIJIL = getTextSize();
        }
        LJJJJIZL();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        this.LLJJIJI = null;
        super.setTypeface(typeface);
    }

    public final void setMinTextSize(int i) {
        this.LLJIJIL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.LLJILJIL
            if (r0 == 0) goto L12
            boolean r0 = r7.LLJILLL
            if (r0 != 0) goto L12
            android.text.TextPaint r1 = r7.getPaint()
            int r0 = r7.LLJI
            float r0 = (float) r0
            r1.setTextSize(r0)
        L12:
            boolean r0 = r7.LLJJ
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.AwS46S0102000_32 r5 = new kotlin.jvm.internal.AwS46S0102000_32
            r0 = 1
            r5.<init>(r8, r9, r7, r0)
            r6 = 0
            java.lang.Class<android.text.DynamicLayout> r1 = android.text.DynamicLayout.class
            java.lang.String r0 = "sStaticLayout"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Exception -> L59
            r4 = 1
            if (r0 == 0) goto L56
            r0.setAccessible(r4)     // Catch: java.lang.Exception -> L59
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Exception -> L59
            android.text.StaticLayout r3 = (android.text.StaticLayout) r3     // Catch: java.lang.Exception -> L59
            if (r3 == 0) goto L57
            java.lang.Class<android.text.StaticLayout> r1 = android.text.StaticLayout.class
            java.lang.String r0 = "mMaximumVisibleLineCount"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch: java.lang.Exception -> L54
            if (r2 == 0) goto L60
            r2.setAccessible(r4)     // Catch: java.lang.Exception -> L54
            int r0 = r2.getInt(r3)     // Catch: java.lang.Exception -> L54
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L54
            int r0 = r7.getMaxLines()     // Catch: java.lang.Exception -> L50
            r2.setInt(r3, r0)     // Catch: java.lang.Exception -> L50
            goto L61
        L50:
            r0 = move-exception
            r1 = r6
            r6 = r2
            goto L5c
        L54:
            r0 = move-exception
            goto L5b
        L56:
            r3 = r6
        L57:
            r1 = r6
            goto L63
        L59:
            r0 = move-exception
            r3 = r6
        L5b:
            r1 = r6
        L5c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L63
        L60:
            r2 = r6
        L61:
            r1 = r6
            r6 = r2
        L63:
            r5.invoke()
            if (r6 == 0) goto L7b
            if (r1 == 0) goto L6b
            goto L6f
        L6b:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L73
        L6f:
            int r0 = r1.intValue()     // Catch: java.lang.Exception -> L77
        L73:
            r6.setInt(r3, r0)     // Catch: java.lang.Exception -> L77
            return
        L77:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7b:
            return
        L7c:
            super.onMeasure(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.input.TuxTextView.onMeasure(int, int):void");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C444910HcX c444910HcX;
        C434230H0z c434230H0z;
        Integer numValueOf;
        if (charSequence instanceof C444910HcX) {
            c444910HcX = (C444910HcX) charSequence;
        } else {
            c444910HcX = new C444910HcX(charSequence);
        }
        int i = this.LLIZLLLIL;
        int i2 = 0;
        if (i > 0) {
            C434230H0z[] c434230H0zArr = (C434230H0z[]) c444910HcX.getSpans(0, c444910HcX.length(), C434230H0z.class);
            ArrayList arrayList = new ArrayList();
            for (C434230H0z c434230H0z2 : c434230H0zArr) {
                if (!c434230H0z2.LLILLL) {
                    arrayList.add(c434230H0z2);
                }
            }
            Iterator it2 = arrayList.iterator();
            Object next = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int i3 = ((C434230H0z) next).LL;
                    do {
                        Object next2 = it2.next();
                        int i4 = ((C434230H0z) next2).LL;
                        if (i3 < i4) {
                            next = next2;
                            i3 = i4;
                        }
                    } while (it2.hasNext());
                }
            }
            C434230H0z c434230H0z3 = (C434230H0z) next;
            if (c434230H0z3 != null && (numValueOf = Integer.valueOf(c434230H0z3.LL)) != null && numValueOf.intValue() > 0) {
                c434230H0z = new C434230H0z(numValueOf.intValue());
            } else {
                c434230H0z = new C434230H0z(i);
                c434230H0z.LLILLL = true;
            }
            for (C434230H0z c434230H0z4 : c434230H0zArr) {
                c444910HcX.removeSpan(c434230H0z4);
            }
            C786410Ut5.s2(c444910HcX, c434230H0z, 0, c444910HcX.length(), 17);
        } else {
            c444910HcX.getClass();
        }
        super.setText(c444910HcX, bufferType);
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                if (getTypeface() != null && this.LLJ >= 20 && getTypeface().getWeight() >= 500) {
                    i2 = 1;
                }
                setLineBreakWordStyle(i2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (NoSuchMethodError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        this.LLJJIJI = null;
        super.setTypeface(typeface, i);
    }

    public TuxTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJI = -1;
        this.LLJIJIL = -1;
        this.LLJILJILJ = C452501pT.LIZIZ(new C21369218jy(this));
        this.LLJJI = 1.0f;
        this.LLJJIII = true;
        this.LLJJIJIL = C452501pT.LIZIZ(new C21369318jz(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTextView, i, 0);
        this.LLJIJIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxTextView_tux_minTextSize, -1);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTextView_tux_font, 0);
        this.LLJJIII = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxTextView_tux_supportDynamicFont, true);
        typedArrayObtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 28) {
            setFallbackLineSpacing(false);
        }
        setTuxFont(i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TuxTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i3 = R.attr.z4;
        } else {
            i3 = 0;
        }
        this(context, attributeSet, i3);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.LLJILJIL) {
            getAutoSizeHelper().LIZ(2);
        }
    }

    public static void LJJJJ(TuxTextView tuxTextView, float f, int i, Typeface typeface, float f2) {
        float f3 = tuxTextView.LLJJI;
        float f4 = f * f3;
        Float fValueOf = Float.valueOf(i * f3);
        tuxTextView.setTextSize(1, f4);
        tuxTextView.LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(f4)));
        tuxTextView.setTypeface(typeface);
        tuxTextView.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
        tuxTextView.setLetterSpacing(f2);
        tuxTextView.LJJJJIZL();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLJILJIL) {
            getAutoSizeHelper().LIZ(3);
        }
    }
}
