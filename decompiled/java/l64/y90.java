package l64;

import X.AbstractC415370GQl;
import X.C415290GQd;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes7.dex */
public final class y90 extends AbstractC415370GQl {
    public final Paint LJ;
    public final C415290GQd LJFF;

    public y90() {
        this.LIZJ.LIZJ(new RectF(28.0f, 28.0f, 48.0f, 48.0f), 10.0f, 10.0f, Path.Direction.CW);
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setColor(-119723);
        this.LIZ.add(this.LIZIZ);
        Paint paint = new Paint();
        this.LJ = paint;
        C415290GQd c415290GQd = new C415290GQd();
        this.LJFF = c415290GQd;
        c415290GQd.LJIIIZ(43.0f, 33.74f);
        c415290GQd.LJIIJJI(0.2f, 0.12f, 0.26f, 0.38f, 0.13f, 0.57f);
        c415290GQd.LJIILIIL(-5.1f, 7.99f);
        c415290GQd.LJIIJ(1.04f, 1.04f, false, true, -1.66f, 0.12f);
        c415290GQd.LJIILIIL(-3.36f, -3.85f);
        c415290GQd.LJIIJ(0.42f, 0.42f, false, true, 0.04f, -0.59f);
        c415290GQd.LJIILIIL(0.94f, -0.82f);
        c415290GQd.LJIIJ(0.42f, 0.42f, false, true, 0.59f, 0.04f);
        c415290GQd.LJIILIIL(2.45f, 2.8f);
        c415290GQd.LJIILIIL(4.35f, -6.8f);
        c415290GQd.LJIIJJI(0.12f, -0.2f, 0.38f, -0.26f, 0.57f, -0.13f);
        c415290GQd.LJIILIIL(1.06f, 0.67f);
        c415290GQd.LJ();
        c415290GQd.LJIJ(Path.FillType.WINDING);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        this.LIZ.add(paint);
    }

    @Override // X.AbstractC415370GQl
    public final void LIZ(Canvas canvas) {
        LIZIZ(48.0f, 48.0f, canvas);
        canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
        canvas.drawPath(this.LJFF.LIZ, this.LJ);
    }
}
