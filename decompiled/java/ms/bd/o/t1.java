package ms.bd.o;

import X.C2188811AlT;
import X.C786410Ut5;
import android.hardware.SensorManager;
import java.util.Arrays;
import java.util.Locale;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class t1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        j2 j2VarLIZ = j2.LIZ(a.LIZIZ.LIZ);
        float[] fArr = new float[9];
        SensorManager.getRotationMatrix(fArr, null, j2VarLIZ.LLJ, j2VarLIZ.LLJI);
        SensorManager.getOrientation(fArr, new float[3]);
        float[] fArr2 = {(float) Math.toDegrees(r10[0]), (float) Math.toDegrees(r10[1]), (float) Math.toDegrees(r10[2])};
        float[] fArr3 = j2VarLIZ.LLILZIL;
        float[] fArr4 = new float[fArr3.length + j2VarLIZ.LLILZLL.length + j2VarLIZ.LLIZ.length + j2VarLIZ.LLIZLLLIL.length + 3];
        System.arraycopy(fArr3, 0, fArr4, 0, fArr3.length);
        int length = j2VarLIZ.LLILZIL.length;
        float[] fArr5 = j2VarLIZ.LLILZLL;
        System.arraycopy(fArr5, 0, fArr4, length, fArr5.length);
        int length2 = length + j2VarLIZ.LLILZLL.length;
        float[] fArr6 = j2VarLIZ.LLIZ;
        System.arraycopy(fArr6, 0, fArr4, length2, fArr6.length);
        int length3 = length2 + j2VarLIZ.LLIZ.length;
        float[] fArr7 = j2VarLIZ.LLIZLLLIL;
        System.arraycopy(fArr7, 0, fArr4, length3, fArr7.length);
        System.arraycopy(fArr2, 0, fArr4, length3 + j2VarLIZ.LLIZLLLIL.length, 3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sensors_all: ");
        sbLIZ.append(Arrays.toString(fArr4));
        C2188811AlT.LIZIZ(sbLIZ);
        C786410Ut5.k4(Locale.getDefault(), "sensors_all: diff %.6f %.6f %.6f", new Object[]{Float.valueOf(j2VarLIZ.LLIZLLLIL[0] - fArr2[0]), Float.valueOf(j2VarLIZ.LLIZLLLIL[1] - fArr2[1]), Float.valueOf(j2VarLIZ.LLIZLLLIL[2] - fArr2[2])});
        return fArr4;
    }
}
