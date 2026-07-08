package com.lynx.textra;

import android.graphics.Paint;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class JavaShaper {
    public JavaFontManager mFontManager;
    public HashMap<Integer, JavaTypeface> mFontMap = new HashMap<>(10);
    public BBufferOutputStream bs = null;
    public Paint mPaint = new Paint();

    public JavaShapeResult OnShapeTextNew(String str, JavaTypeface javaTypeface, float f, boolean z, boolean z2) {
        return null;
    }

    public JavaShaper(JavaFontManager javaFontManager) {
        this.mFontManager = null;
        this.mFontManager = javaFontManager;
    }

    public float[] OnShapeText(String str, JavaTypeface javaTypeface, float f, boolean z, boolean z2) {
        float[] fArr = new float[str.length()];
        this.mPaint.setTypeface(javaTypeface.mTypeface);
        this.mPaint.setTextSize(TTTextUtils.Dp2Px(f));
        this.mPaint.getTextWidths(str, fArr);
        for (int i = 0; i < str.length(); i++) {
            fArr[i] = TTTextUtils.Px2Dp(fArr[i]);
        }
        javaTypeface.GetFontMetrics(f);
        return fArr;
    }
}
