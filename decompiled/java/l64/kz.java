package l64;

import X.AbstractC415370GQl;
import X.C0FXN;
import X.C415290GQd;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes7.dex */
public final class kz extends AbstractC415370GQl {
    public final Paint LJ;
    public final C415290GQd LJFF;

    public kz() {
        this.LIZJ.LJIILJJIL(24.0f, 25.84f);
        this.LIZJ.LJIILIIL(13.17f, -13.17f);
        C0FXN.nL(this.LIZJ);
        this.LIZJ.LJIILIIL(2.82f, 2.83f);
        C0FXN.vL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(25.06f, 33.27f);
        C0FXN.LLLLZIL(this.LIZJ);
        this.LIZJ.LJIIIIZZ(6.59f, 16.9f);
        C0FXN.tL(this.LIZJ);
        C415290GQd c415290GQd = this.LIZJ;
        c415290GQd.LJIILIIL(2.82f, -2.83f);
        c415290GQd.LJIIJ(1.0f, 1.0f, false, true, 1.42f, 0.0f);
        C415290GQd c415290GQd2 = this.LIZJ;
        c415290GQd2.LJIIIIZZ(24.0f, 25.84f);
        c415290GQd2.LJ();
        this.LIZJ.LJIJ(Path.FillType.WINDING);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-1);
        this.LIZ.add(this.LIZIZ);
        Paint paint = new Paint();
        this.LJ = paint;
        C415290GQd c415290GQd3 = new C415290GQd();
        this.LJFF = c415290GQd3;
        c415290GQd3.LJIILJJIL(24.0f, 24.43f);
        c415290GQd3.LJIILIIL(12.46f, -12.47f);
        C0FXN.D0(c415290GQd3);
        c415290GQd3.LJIILIIL(2.83f, 2.83f);
        C0FXN.B0(c415290GQd3);
        c415290GQd3.LJIIIIZZ(25.77f, 33.97f);
        c415290GQd3.LJIIJ(2.5f, 2.5f, false, true, -3.54f, 0.0f);
        c415290GQd3.LJIIIIZZ(5.88f, 17.62f);
        C0FXN.C0(c415290GQd3);
        c415290GQd3.LJIILIIL(2.83f, -2.83f);
        C0FXN.D0(c415290GQd3);
        c415290GQd3.LJIIIIZZ(24.0f, 24.43f);
        c415290GQd3.LJ();
        c415290GQd3.LJIILJJIL(0.0f, 1.41f);
        c415290GQd3.LJIIIIZZ(10.83f, 12.67f);
        C0FXN.xL(c415290GQd3);
        c415290GQd3.LJIIIIZZ(6.6f, 15.5f);
        C0FXN.EL(c415290GQd3);
        c415290GQd3.LJIILIIL(16.35f, 16.36f);
        C0FXN.LLLLZ(c415290GQd3);
        c415290GQd3.LJIIIIZZ(41.41f, 16.9f);
        c415290GQd3.LJIIJ(1.0f, 1.0f, false, false, 0.0f, -1.41f);
        c415290GQd3.LJIILIIL(-2.82f, -2.83f);
        c415290GQd3.LJIIJ(1.0f, 1.0f, false, false, -1.42f, 0.0f);
        c415290GQd3.LJIIIIZZ(24.0f, 25.84f);
        c415290GQd3.LJ();
        c415290GQd3.LJIJ(Path.FillType.EVEN_ODD);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16777216);
        paint.setAlpha(30);
        this.LIZ.add(paint);
    }

    @Override // X.AbstractC415370GQl
    public final void LIZ(Canvas canvas) {
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
