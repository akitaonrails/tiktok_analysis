package com.ss.android.ugc.tools.chat.message.cell.genereatingcell;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0H94;
import X.C0IDA;
import X.C1287390jbd;
import X.C1287400jbe;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C13LE;
import X.C13LP;
import X.C1697810uHb;
import X.C18U8;
import X.C18V1;
import X.C18V9;
import X.C21291518Tx;
import X.C2188811AlT;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1287420jbg;
import X.EnumC21291418Tw;
import Y.ACListenerS134S0200000_32;
import Y.AUListenerS279S0100000_32;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class AIGeneratingAssem extends BaseSkeletonUISlotAssem<AIGeneratingAssem, C18V1> {
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public ValueAnimator LLLFF;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ae9;
    }

    public AIGeneratingAssem() {
        super(C13LE.LIZ(C18V1.class));
        this.LLJLL = C452501pT.LIZIZ(new AwS576S0100000_32((AbstractC738140SxQ) this, 408));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 406));
        this.LLJLLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 405));
        this.LLJZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 402));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 404));
        this.LLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 403));
        this.LLLF = C452501pT.LIZIZ(new AwS576S0100000_32((AbstractC738140SxQ) this, 407));
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        ValueAnimator valueAnimator = this.LLLFF;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLLFF = null;
    }

    public final C1287400jbe zp() {
        return (C1287400jbe) this.LLL.getValue();
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem
    public final void tp() {
        C786410Ut5.LLLZIIL(zp(), 8);
        ValueAnimator valueAnimator = this.LLLFF;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLLFF = null;
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem
    public final void yp() {
        if (zp().getVisibility() != 0) {
            C786410Ut5.LLLZIIL(zp(), 0);
        }
    }

    public final void j3(int i) {
        TextView textView = (TextView) this.LLJLLL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('%');
        textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        ((C1295960jpS) this.LLJLLIL.getValue()).setProgress(i / 100.0f);
        if (i < 33) {
            ((TextView) this.LLJZIJLIL.getValue()).setText(C21291518Tx.LJ(EnumC21291418Tw.GENERATION_IMAGE_PROCESS1_TEXT, new Object[0]));
        } else if (i < 66) {
            ((TextView) this.LLJZIJLIL.getValue()).setText(C21291518Tx.LJ(EnumC21291418Tw.GENERATION_IMAGE_PROCESS2_TEXT, new Object[0]));
        } else {
            ((TextView) this.LLJZIJLIL.getValue()).setText(C21291518Tx.LJ(EnumC21291418Tw.GENERATION_IMAGE_PROCESS3_TEXT, new Object[0]));
        }
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem
    public final void sp(C0H94 c0h94) {
        C18V1 c18v1 = (C18V1) c0h94;
        C786410Ut5.a9((TuxIconView) this.LLJZ.getValue(), new ACListenerS134S0200000_32(c18v1, this, 23));
        C18U8.LIZ.getClass();
        long jLIZ = C18U8.LIZ() - c18v1.LLILZ;
        if (jLIZ < 0) {
            jLIZ = 0;
        }
        long j = c18v1.LLILZIL;
        if (jLIZ >= j) {
            jLIZ = j;
        }
        int i = (int) (c18v1.LLILLJJLI + ((c18v1.LLILLL - r1) * (jLIZ / j)));
        long j2 = j - jLIZ;
        j3(i);
        ValueAnimator valueAnimator = this.LLLFF;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, c18v1.LLILLL);
        valueAnimatorOfInt.setDuration(j2);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS279S0100000_32(this, 29));
        valueAnimatorOfInt.start();
        this.LLLFF = valueAnimatorOfInt;
    }

    @Override // com.ss.android.ugc.tools.chat.message.cell.base.BaseSkeletonUISlotAssem
    public final void up(View view) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        final float[] fArrLLI;
        this.LLJL = true;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZ = R.raw.icon_x_mark_small;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(((View) this.LLJZ.getValue()).getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        ((TuxIconView) this.LLJZ.getValue()).setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(((View) this.LLJZ.getValue()).getContext())));
        C1287400jbe c1287400jbeZp = zp();
        EnumC1287420jbg enumC1287420jbg = EnumC1287420jbg.HexagonGrid;
        C1287390jbd c1287390jbd = new C1287390jbd(0.0f, 0.0f, (List) null, (List) null, 0, 0, 0, 0, 0, 0.0f, 0.0f, 4095);
        c1287390jbd.LIZ = 1.0f;
        c1287390jbd.LIZIZ = 0.0f;
        c1287390jbd.LJFF = Color.rgb(75, 183, 219);
        c1287390jbd.LJI = Color.rgb(0, 0, 0);
        c1287390jbd.LJII = Color.rgb(32, 154, 93);
        c1287390jbd.LJIIIIZZ = Color.rgb(0, 0, 0);
        c1287390jbd.LJIIIZ = Color.rgb(0, 0, 0);
        c1287390jbd.LIZLLL = C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(0.0f));
        c1287390jbd.LJ = C1697810uHb.LJIIJJI(Float.valueOf(1.3f), Float.valueOf(1.3f));
        c1287390jbd.LIZJ = -0.3f;
        c1287390jbd.LJIIJ = 1.0f;
        c1287390jbd.LJIIJJI = 0.5f;
        c1287400jbeZp.LIZ(enumC1287420jbg, c1287390jbd);
        zp().LIZJ();
        C1287400jbe c1287400jbeZp2 = zp();
        c1287400jbeZp2.setOutlineProvider(new C0IDA(20.0f, 17));
        c1287400jbeZp2.setClipToOutline(true);
        C18V9 c18v9 = new C18V9(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        int[] iArr = new int[5];
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ck, zp().getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        iArr[0] = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ch, zp().getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        iArr[1] = iIntValue2;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ce, zp().getContext());
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        iArr[2] = iIntValue3;
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.co, zp().getContext());
        if (numLIZJ4 != null) {
            iIntValue4 = numLIZJ4.intValue();
        } else {
            iIntValue4 = 0;
        }
        iArr[3] = iIntValue4;
        Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.ck, zp().getContext());
        if (numLIZJ5 != null) {
            iIntValue5 = numLIZJ5.intValue();
        } else {
            iIntValue5 = 0;
        }
        iArr[4] = iIntValue5;
        c18v9.LIZJ = iArr;
        c18v9.LIZLLL = new int[]{10, 100, 190, 280, 370};
        c18v9.LJ = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        int[] iArr2 = c18v9.LIZLLL;
        if (iArr2 != null) {
            ArrayList arrayList = new ArrayList(iArr2.length);
            for (int i : iArr2) {
                arrayList.add(Float.valueOf(i / 360.0f));
            }
            fArrLLI = C13LP.LLI(arrayList);
        } else {
            fArrLLI = null;
        }
        if (fArrLLI != null && fArrLLI.length != c18v9.LIZJ.length) {
            throw new IllegalArgumentException("The number of colors must match the number of angles provided.");
        }
        final float f = c18v9.LIZ;
        final float f2 = c18v9.LIZIZ;
        final int[] iArr3 = c18v9.LIZJ;
        final float f3 = c18v9.LJ;
        zp().setBackground(new Drawable(f, f2, iArr3, fArrLLI, f3) { // from class: X.0F6u
            public final float LIZ;
            public final float LIZIZ;
            public final int[] LIZJ;
            public final float[] LIZLLL;
            public final float LJ = 0.0f;
            public final float LJFF;
            public final Paint LJI;
            public final Path LJII;
            public final RectF LJIIIIZZ;

            @Override // android.graphics.drawable.Drawable
            @InterfaceC1294060jmO
            public final int getOpacity() {
                return -3;
            }

            public final void LIZ() {
                if (getBounds().width() <= 0 || getBounds().height() <= 0) {
                    return;
                }
                this.LJI.setShader(new SweepGradient(getBounds().exactCenterX() + this.LJ, getBounds().exactCenterY() + this.LJFF, this.LIZJ, this.LIZLLL));
                invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                canvas.drawPath(this.LJII, this.LJI);
            }

            @Override // android.graphics.drawable.Drawable
            public final void onBoundsChange(Rect rect) {
                super.onBoundsChange(rect);
                this.LJIIIIZZ.set(rect);
                RectF rectF = this.LJIIIIZZ;
                float f4 = this.LIZ;
                rectF.inset(f4 / 2.0f, f4 / 2.0f);
                this.LJII.reset();
                Path path = this.LJII;
                RectF rectF2 = this.LJIIIIZZ;
                float f5 = this.LIZIZ;
                path.addRoundRect(rectF2, f5, f5, Path.Direction.CW);
                LIZ();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i2) {
                this.LJI.setAlpha(i2);
                invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
                this.LJI.setColorFilter(colorFilter);
                invalidateSelf();
            }

            {
                this.LIZ = f;
                this.LIZIZ = f2;
                this.LIZJ = iArr3;
                this.LIZLLL = fArrLLI;
                this.LJFF = f3;
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(f);
                paint.setAntiAlias(true);
                this.LJI = paint;
                this.LJII = new Path();
                this.LJIIIIZZ = new RectF();
                LIZ();
            }
        });
    }
}
