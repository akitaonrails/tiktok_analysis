package l64;

import X.AbstractC415370GQl;
import X.C0FXN;
import X.C415290GQd;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes7.dex */
public final class y20 extends AbstractC415370GQl {
    public final Paint LJ;
    public final C415290GQd LJFF;

    public y20() {
        this.LIZJ.LJIIIZ(30.53f, 33.98f);
        this.LIZJ.LJIIIIZZ(13.48f, 16.93f);
        this.LIZJ.LJIILIIL(-8.91f, 7.02f);
        C415290GQd c415290GQd = this.LIZJ;
        c415290GQd.LJIIJ(1.6f, 1.6f, false, false, 0.84f, 2.85f);
        c415290GQd.LJIILIIL(13.23f, 1.27f);
        c415290GQd.LJIILIIL(-7.6f, 17.44f);
        c415290GQd.LJIIJJI(-0.67f, 1.52f, 1.15f, 2.92f, 2.46f, 1.9f);
        this.LIZJ.LJIILIIL(17.03f, -13.43f);
        this.LIZJ.LJ();
        this.LIZJ.LJIIIZ(44.41f, 36.27f);
        this.LIZJ.LJIILIIL(-7.4f, -7.4f);
        this.LIZJ.LJIILIIL(6.44f, -5.06f);
        C415290GQd c415290GQd2 = this.LIZJ;
        c415290GQd2.LJIIJ(1.6f, 1.6f, false, false, -0.84f, -2.85f);
        c415290GQd2.LJIILIIL(-13.24f, -1.28f);
        c415290GQd2.LJIILIIL(7.6f, -17.43f);
        this.LIZJ.LJIIJJI(0.67f, -1.53f, -1.14f, -2.93f, -2.45f, -1.9f);
        this.LIZJ.LJIIIIZZ(19.97f, 11.82f);
        this.LIZJ.LJIILIIL(-8.14f, -8.14f);
        this.LIZJ.LJIIJ(2.0f, 2.0f, false, false, -2.83f, 0.0f);
        this.LIZJ.LJIIIIZZ(7.6f, 5.09f);
        C0FXN.z0(this.LIZJ);
        this.LIZJ.LJIILIIL(32.58f, 32.59f);
        this.LIZJ.LJIIJ(2.0f, 2.0f, false, false, 2.83f, 0.0f);
        this.LIZJ.LJIILIIL(1.41f, -1.42f);
        C0FXN.Eh(this.LIZJ);
        this.LIZJ.LJIJ(Path.FillType.EVEN_ODD);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-16777216);
        this.LIZIZ.setAlpha(30);
        this.LIZ.add(this.LIZIZ);
        Paint paint = new Paint();
        this.LJ = paint;
        C415290GQd c415290GQd3 = new C415290GQd();
        this.LJFF = c415290GQd3;
        c415290GQd3.LJIILJJIL(5.19f, 24.74f);
        c415290GQd3.LJIILIIL(8.2f, -6.47f);
        c415290GQd3.LJIIIIZZ(29.03f, 33.9f);
        c415290GQd3.LJIIIIZZ(12.88f, 46.62f);
        C0FXN.Oi(c415290GQd3);
        c415290GQd3.LJ();
        c415290GQd3.LJIIIZ(35.51f, 28.78f);
        c415290GQd3.LJIILIIL(8.2f, 8.2f);
        c415290GQd3.LJIIJ(1.0f, 1.0f, false, true, 0.0f, 1.4f);
        c415290GQd3.LJIILIIL(-1.42f, 1.42f);
        c415290GQd3.LJIIJ(1.0f, 1.0f, false, true, -1.41f, 0.0f);
        c415290GQd3.LJIIIIZZ(8.29f, 7.22f);
        C0FXN.sL(c415290GQd3);
        c415290GQd3.LJIIIIZZ(9.71f, 4.4f);
        C0FXN.pL(c415290GQd3);
        c415290GQd3.LJIILIIL(8.77f, 8.76f);
        c415290GQd3.LJIIIIZZ(35.14f, 1.14f);
        C0FXN.yO(c415290GQd3);
        c415290GQd3.LJIILIIL(-7.32f, 5.76f);
        c415290GQd3.LJ();
        c415290GQd3.LJIJ(Path.FillType.WINDING);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.LIZ.add(paint);
    }

    @Override // X.AbstractC415370GQl
    public final void LIZ(Canvas canvas) {
        LIZIZ(48.0f, 49.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
