package com.ss.android.ugc.aweme.texttoimage.choose;

import X.AbstractC558210Lut;
import X.C01GW;
import X.C07CH;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C2211631BhB;
import X.C2471909mP;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS143S0100000_8;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public class Text2ImageBaseChooseCell<ITEM extends AbstractC558210Lut> extends PowerCell<ITEM> {
    public View LL;
    public SmartImageView LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS552S0100000_8((Text2ImageBaseChooseCell) this, 381));

    public void I5() {
        C2211631BhB.LJ(this.itemView, new AwS587S0100000_8(this, 294));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new ACListenerS143S0100000_8(this, 82), this.itemView);
        I5();
        this.LLILLJJLI = (SmartImageView) this.itemView.findViewById(R.id.l2h);
        if (C07CH.LIZIZ()) {
            this.LL = this.itemView.findViewById(R.id.c9_);
            SmartImageView smartImageView = this.LLILLJJLI;
            if (smartImageView != null) {
                C426750GoL.LJIIIZ(smartImageView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), false, 16);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: L5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(ITEM item) {
        C1331730kl9 c1331730kl9;
        Integer numLIZJ;
        Integer numLIZJ2;
        int iIntValue = 0;
        if (item.isSelected() && !C07CH.LIZIZ()) {
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C418440Gaw.LIZIZ(8);
            c1331750klB.LIZIZ = C418440Gaw.LIZIZ(Double.valueOf(2.5d));
            Context context = this.itemView.getContext();
            if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1r, context)) != null) {
                iIntValue = numLIZJ2.intValue();
            }
            c1331750klB.LIZJ = iIntValue;
            c1331730kl9 = new C1331730kl9(c1331750klB);
        } else {
            C1331750klB c1331750klB2 = new C1331750klB();
            c1331750klB2.LJ = C418440Gaw.LIZIZ(8);
            c1331750klB2.LIZIZ = C418440Gaw.LIZIZ(1);
            Context context2 = this.itemView.getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context2)) != null) {
                iIntValue = numLIZJ.intValue();
            }
            c1331750klB2.LIZJ = iIntValue;
            c1331730kl9 = new C1331730kl9(c1331750klB2);
        }
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(C2471909mP.LJIILIIL(item.LJ()));
        c1331670kl3LJI.LJJIJL(this.itemView.getContext());
        c1331670kl3LJI.LJJI(this.LLILLJJLI);
        c1331670kl3LJI.LJJI = c1331730kl9;
        C786410Ut5.h3(c1331670kl3LJI);
        if (C07CH.LIZIZ()) {
            P5(item);
        }
    }

    public final void P5(ITEM item) {
        final int iIntValue;
        final int iIntValue2;
        final int iIntValue3;
        if (C07CH.LIZIZ()) {
            if (item.isSelected()) {
                View view = this.LL;
                if (view != null) {
                    Context context = this.itemView.getContext();
                    final float fLIZIZ = C418440Gaw.LIZIZ(2);
                    final float fLIZIZ2 = C418440Gaw.LIZIZ(10);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.d5, context);
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.d2, context);
                    if (numLIZJ2 != null) {
                        iIntValue2 = numLIZJ2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ci, context);
                    if (numLIZJ3 != null) {
                        iIntValue3 = numLIZJ3.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    view.setBackground(new Drawable(fLIZIZ, fLIZIZ2, iIntValue, iIntValue2, iIntValue3) { // from class: X.0Ean
                        public static final /* synthetic */ int LJIIIIZZ = 0;
                        public final float LIZ;
                        public final float LIZIZ;
                        public final int LIZJ;
                        public final int LIZLLL;
                        public final int LJ;
                        public final float LJFF = 150.0f;
                        public final Paint LJI = new Paint(1);
                        public final RectF LJII = new RectF();

                        @Override // android.graphics.drawable.Drawable
                        @InterfaceC1294060jmO
                        public final int getOpacity() {
                            return -3;
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void draw(Canvas canvas) {
                            this.LJI.setStyle(Paint.Style.STROKE);
                            this.LJI.setStrokeWidth(this.LIZ);
                            RectF rectF = this.LJII;
                            float f = this.LIZIZ;
                            canvas.drawRoundRect(rectF, f, f, this.LJI);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void onBoundsChange(Rect rect) {
                            float fCenterX;
                            float fCenterY;
                            float fCenterX2;
                            float fCenterY2;
                            super.onBoundsChange(rect);
                            float f = rect.left;
                            float f2 = this.LIZ;
                            float f3 = 2;
                            this.LJII.set(f + (f2 / f3), rect.top + (f2 / f3), rect.right - (f2 / f3), rect.bottom - (f2 / f3));
                            try {
                                double dTan = Math.tan(Math.toRadians(this.LJFF));
                                double dAbs = Math.abs(dTan);
                                if (Math.abs(this.LJFF - 90.0f) < 0.001f) {
                                    Paint paint = this.LJI;
                                    float fCenterX3 = this.LJII.centerX();
                                    RectF rectF = this.LJII;
                                    paint.setShader(new LinearGradient(fCenterX3, rectF.top, rectF.centerX(), this.LJII.bottom, new int[]{this.LIZJ, this.LIZLLL, this.LJ}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                                    return;
                                }
                                if (Math.abs(this.LJFF - 270.0f) < 0.001f) {
                                    Paint paint2 = this.LJI;
                                    float fCenterX4 = this.LJII.centerX();
                                    RectF rectF2 = this.LJII;
                                    paint2.setShader(new LinearGradient(fCenterX4, rectF2.bottom, rectF2.centerX(), this.LJII.top, new int[]{this.LIZJ, this.LIZLLL, this.LJ}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                                    return;
                                }
                                if (this.LJII.width() > 0.0f && this.LJII.height() > 0.0f) {
                                    float fHeight = this.LJII.height() / this.LJII.width();
                                    if (Math.abs(dAbs) > Double.MAX_VALUE || dAbs > fHeight) {
                                        if (Math.abs(dAbs) <= Double.MAX_VALUE && dTan != 0.0d) {
                                            double dHeight = ((((double) 1) / dTan) * ((double) this.LJII.height())) / ((double) 2);
                                            fCenterX = (float) (((double) this.LJII.centerX()) - dHeight);
                                            RectF rectF3 = this.LJII;
                                            fCenterY = rectF3.top;
                                            fCenterX2 = (float) (((double) rectF3.centerX()) + dHeight);
                                            fCenterY2 = this.LJII.bottom;
                                        } else {
                                            Paint paint3 = this.LJI;
                                            RectF rectF4 = this.LJII;
                                            float f4 = rectF4.left;
                                            float fCenterY3 = rectF4.centerY();
                                            RectF rectF5 = this.LJII;
                                            paint3.setShader(new LinearGradient(f4, fCenterY3, rectF5.right, rectF5.centerY(), new int[]{this.LIZJ, this.LIZLLL, this.LJ}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                                            return;
                                        }
                                    } else {
                                        double dWidth = dTan * ((double) this.LJII.width());
                                        RectF rectF6 = this.LJII;
                                        fCenterX = rectF6.left;
                                        double d = dWidth / ((double) 2);
                                        fCenterY = (float) (((double) rectF6.centerY()) - d);
                                        RectF rectF7 = this.LJII;
                                        fCenterX2 = rectF7.right;
                                        fCenterY2 = (float) (((double) rectF7.centerY()) + d);
                                    }
                                    this.LJI.setShader(new LinearGradient(fCenterX, fCenterY, fCenterX2, fCenterY2, new int[]{this.LIZJ, this.LIZLLL, this.LJ}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                                    return;
                                }
                                Paint paint4 = this.LJI;
                                RectF rectF8 = this.LJII;
                                paint4.setShader(new LinearGradient(rectF8.left, rectF8.top, rectF8.right, rectF8.bottom, new int[]{this.LIZJ, this.LIZLLL, this.LJ}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                Paint paint5 = this.LJI;
                                RectF rectF9 = this.LJII;
                                paint5.setShader(new LinearGradient(rectF9.left, rectF9.top, rectF9.right, rectF9.bottom, new int[]{this.LIZJ, this.LIZLLL, this.LJ}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                            }
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setAlpha(int i) {
                            this.LJI.setAlpha(i);
                            invalidateSelf();
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setColorFilter(ColorFilter colorFilter) {
                            this.LJI.setColorFilter(colorFilter);
                            invalidateSelf();
                        }

                        {
                            this.LIZ = fLIZIZ;
                            this.LIZIZ = fLIZIZ2;
                            this.LIZJ = iIntValue;
                            this.LIZLLL = iIntValue2;
                            this.LJ = iIntValue3;
                        }
                    });
                    return;
                }
                return;
            }
            View view2 = this.LL;
            if (view2 == null) {
                return;
            }
            view2.setBackground(null);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup viewGroup) {
        int i;
        if (C07CH.LIZIZ()) {
            i = R.layout.ae5;
        } else {
            i = R.layout.ae3;
        }
        return PowerCell.inflateItemView$default(this, viewGroup, i, false, 4, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(ITEM item, List<? extends Object> list) {
        P5(item);
    }
}
