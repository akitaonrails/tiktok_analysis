package com.ss.android.ugc.aweme.tako.common.ui.markdown.style;

import X.C2188811AlT;
import X.C418440Gaw;
import X.InterfaceC430910Gv3;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.BulletSpan;

/* JADX INFO: loaded from: classes7.dex */
public class TakoMarkDownBulletSpan extends BulletSpan implements InterfaceC430910Gv3 {
    public static final int BULLET_LEFT;
    public static final int BULLET_RADIUS;
    public static final int BULLET_RIGHRT;
    public static final Path CIRCLE_BULLET_PATH;
    public static final Path RECT_BULLET_PATH;
    public final int mBulletColor;
    public final String mIndex;
    public final int mLevel;
    public int mMargin;
    public int mPointIndex;
    public int orderIndexMargin;
    public static final int GAP_WIDTH = C418440Gaw.LIZ(11);
    public static final int GAP_WIDTH_ORDER = C418440Gaw.LIZ(6);
    public static final int GAP_WIDTH_ONE_NUM = C418440Gaw.LIZ(11);

    @Override // X.InterfaceC430910Gv3
    public final int LIZIZ() {
        return getLeadingMargin(true);
    }

    static {
        int iLIZ = C418440Gaw.LIZ(Double.valueOf(2.5d));
        BULLET_RADIUS = iLIZ;
        BULLET_LEFT = C418440Gaw.LIZ(6);
        BULLET_RIGHRT = C418440Gaw.LIZ(5);
        float f = iLIZ;
        Path path = new Path();
        RECT_BULLET_PATH = path;
        float f2 = -f;
        path.addRect(f2, f2, f, f, Path.Direction.CW);
        Path path2 = new Path();
        CIRCLE_BULLET_PATH = path2;
        path2.addCircle(0.0f, 0.0f, f, Path.Direction.CW);
    }

    public final void LIZ(int i) {
        if (i >= 10) {
            this.orderIndexMargin = ((int) Math.log10(i)) * GAP_WIDTH_ONE_NUM;
        }
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        if (this.mPointIndex > 0) {
            this.mMargin = (((BULLET_RADIUS * 2) + GAP_WIDTH_ONE_NUM + GAP_WIDTH_ORDER) * (this.mLevel + 1)) + this.orderIndexMargin;
        } else {
            this.mMargin = (((BULLET_RADIUS * 2) + BULLET_LEFT + BULLET_RIGHRT + GAP_WIDTH_ORDER) * (this.mLevel + 1)) + this.orderIndexMargin;
        }
        return this.mMargin;
    }

    public TakoMarkDownBulletSpan(int i, int i2, int i3) {
        super(GAP_WIDTH, i2);
        this.mPointIndex = i3;
        this.mLevel = i;
        if (i3 > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(String.valueOf(i3));
            sbLIZ.append('.');
            this.mIndex = C2188811AlT.LIZIZ(sbLIZ);
            if (i3 >= 10) {
                this.orderIndexMargin = ((int) Math.log10(i3)) * GAP_WIDTH_ONE_NUM;
            }
        } else {
            this.mIndex = null;
        }
        this.mBulletColor = i2;
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Paint.Style style;
        Path path;
        int i8;
        if (((Spanned) charSequence).getSpanStart(this) != i6) {
            return;
        }
        int color = paint.getColor();
        paint.setColor(this.mBulletColor);
        String str = this.mIndex;
        if (str != null) {
            int i9 = (((i + this.mMargin) - GAP_WIDTH_ORDER) - (BULLET_RADIUS * 2)) - GAP_WIDTH_ONE_NUM;
            if (str.length() >= 3) {
                i8 = this.orderIndexMargin;
            } else {
                i8 = 0;
            }
            canvas.drawText(this.mIndex, i9 - i8, i4, paint);
        } else {
            float f = ((paint.getFontMetrics().bottom - paint.getFontMetrics().top) * 0.5f) + i3;
            int i10 = BULLET_RADIUS;
            float f2 = f + i10;
            Paint.Style style2 = paint.getStyle();
            if (this.mLevel == 1) {
                style = Paint.Style.STROKE;
            } else {
                style = Paint.Style.FILL;
            }
            paint.setStyle(style);
            float f3 = (((i + this.mMargin) - GAP_WIDTH_ORDER) - BULLET_RIGHRT) - i10;
            if (!canvas.isHardwareAccelerated()) {
                if (this.mLevel >= 2) {
                    path = RECT_BULLET_PATH;
                } else {
                    path = CIRCLE_BULLET_PATH;
                }
                canvas.save();
                canvas.translate(f3, f2);
                canvas.drawPath(path, paint);
                canvas.restore();
            } else {
                canvas.drawCircle(f3, f2, i10, paint);
            }
            paint.setStyle(style2);
        }
        paint.setColor(color);
    }
}
