package com.lynx.textra;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public class JavaTypeface {
    public Font mFont;
    public FontKey mFontKey;
    public int mIndex;
    public long mNativeHandler;
    public Typeface mTypeface;
    public final Paint.FontMetrics mFontMetrics = new Paint.FontMetrics();
    public float mTextSize = 0.0f;
    public float dpi = 1.0f;

    public native void BindNativeHandler(long j, JavaTypeface javaTypeface, int i);

    public int hashCode() {
        return Objects.hash(this.mFontKey);
    }

    public static class FontKey {
        public String mFontFamily = "";
        public int mFontWeight = 400;
        public boolean mItalic;

        public int hashCode() {
            return Objects.hash(this.mFontFamily, Integer.valueOf(this.mFontWeight), Boolean.valueOf(this.mItalic));
        }

        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            FontKey fontKey = (FontKey) obj;
            if (this.mFontWeight != fontKey.mFontWeight || this.mItalic != fontKey.mItalic || !Objects.equals(this.mFontFamily, fontKey.mFontFamily)) {
                return false;
            }
            return true;
        }
    }

    public float[] GetFontMetrics(float f) {
        float[] fArr = new float[2];
        float f2 = this.mTextSize;
        if (f2 != 0.0f && this.dpi == TTTextUtils.density_) {
            float f3 = f / f2;
            Paint.FontMetrics fontMetrics = this.mFontMetrics;
            fontMetrics.ascent *= f3;
            fontMetrics.descent *= f3;
        } else {
            TTText.mPainter.setTypeface(this.mTypeface);
            TTText.mPainter.setTextSize(TTTextUtils.Dp2Px(f));
            TTText.mPainter.getFontMetrics(this.mFontMetrics);
            this.dpi = TTTextUtils.density_;
        }
        this.mTextSize = f;
        fArr[0] = TTTextUtils.Px2Dp(this.mFontMetrics.ascent);
        fArr[1] = TTTextUtils.Px2Dp(this.mFontMetrics.descent);
        return fArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.mFontKey == ((JavaTypeface) obj).mFontKey) {
            return true;
        }
        return false;
    }

    public float[] GetTextBounds(char[] cArr, float f) {
        Paint paint = TTText.mPainter;
        Rect rect = new Rect();
        paint.setTypeface(this.mTypeface);
        paint.setTextSize(f);
        paint.getTextBounds(cArr, 0, cArr.length, rect);
        return new float[]{rect.left, rect.top, rect.right, rect.bottom};
    }

    public JavaTypeface(int i, Typeface typeface, FontKey fontKey, long j) {
        this.mIndex = i;
        this.mTypeface = typeface;
        this.mFontKey = fontKey;
        this.mNativeHandler = j;
        GetFontMetrics(24.0f);
        BindNativeHandler(j, this, this.mIndex);
    }

    public JavaTypeface(int i, Font font, FontKey fontKey, long j) {
        this.mIndex = i;
        this.mFont = font;
        this.mFontKey = fontKey;
        this.mNativeHandler = j;
        BindNativeHandler(j, this, i);
    }
}
