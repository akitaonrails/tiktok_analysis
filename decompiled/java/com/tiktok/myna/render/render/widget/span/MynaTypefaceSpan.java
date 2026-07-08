package com.tiktok.myna.render.render.widget.span;

import X.C1325860kbg;
import X.C2097608Jq;
import X.C21336218ee;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Objects;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class MynaTypefaceSpan extends TypefaceSpan {
    public final String biz;
    public final String fontFamily;
    public final int style;
    public Typeface tempTypeface;
    public final int weight;

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.style), Integer.valueOf(this.weight), this.fontFamily);
    }

    public final void LIZ(TextPaint textPaint) {
        try {
            if (this.tempTypeface == null) {
                this.tempTypeface = C21336218ee.LIZLLL(this.weight, this.style, textPaint.getTypeface(), this.biz, this.fontFamily);
            }
            textPaint.setTypeface(this.tempTypeface);
            C21336218ee.LIZ(textPaint, false, this.style);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1325860kbg.LIZIZ(th, AFwS223S0000000_32.get$arr$(134), C2097608Jq.LJ());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(MynaTypefaceSpan.class, obj.getClass())) {
            return false;
        }
        MynaTypefaceSpan mynaTypefaceSpan = (MynaTypefaceSpan) obj;
        if (this.style == mynaTypefaceSpan.style && this.weight == mynaTypefaceSpan.weight && Intrinsics.LJFF(this.fontFamily, mynaTypefaceSpan.fontFamily)) {
            return true;
        }
        return false;
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        LIZ(textPaint);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        LIZ(textPaint);
    }

    public MynaTypefaceSpan(String str, int i, int i2, String str2) {
        super((String) null);
        this.biz = str;
        this.style = i;
        this.weight = i2;
        this.fontFamily = str2;
    }
}
