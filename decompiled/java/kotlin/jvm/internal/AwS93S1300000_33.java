package kotlin.jvm.internal;

import X.C09AY;
import X.C19LC;
import X.C21665319qd;
import X.C21665419qe;
import X.C21666019qk;
import X.C389830FQf;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public class AwS93S1300000_33 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS93S1300000_33 awS93S1300000_33) {
        float f;
        BitmapDrawable bitmapDrawable;
        C21665419qe c21665419qe = (C21665419qe) awS93S1300000_33.l1;
        if (c21665419qe.mView != null) {
            Drawable drawable = c21665419qe.LLLLLLLLLL().getDrawable();
            Bitmap bitmap = null;
            if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null) {
                bitmap = bitmapDrawable.getBitmap();
            }
            ((C21665419qe) awS93S1300000_33.l1).LLLLLLLLLL().setImageBitmap((Bitmap) awS93S1300000_33.l2);
            if (bitmap != null) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
            C21666019qk c21666019qk = ((C21665419qe) awS93S1300000_33.l1).LLL;
            c21666019qk.LIZIZ = awS93S1300000_33.s0;
            c21666019qk.LIZJ = ((Bitmap) awS93S1300000_33.l2).getWidth();
            ((C21665419qe) awS93S1300000_33.l1).LLL.LIZLLL = ((Bitmap) awS93S1300000_33.l2).getHeight();
            ((C21665419qe) awS93S1300000_33.l1).LLL.LIZ = C19LC.LIZ(((Bitmap) awS93S1300000_33.l2).getWidth(), ((Bitmap) awS93S1300000_33.l2).getHeight(), ((C21665419qe) awS93S1300000_33.l1).LLLLLL(), ((C21665419qe) awS93S1300000_33.l1).LLLLLLIL(), ((C21665419qe) awS93S1300000_33.l1).LLLLLLL().getCropRectMaxWidth(), ((C21665419qe) awS93S1300000_33.l1).LLLLLLL().getCropRectMaxHeight());
            ((C21665419qe) awS93S1300000_33.l1).LLLLLLLLLL().setImageMatrix(new Matrix(((C21665419qe) awS93S1300000_33.l1).LLL.LIZ));
            C389830FQf c389830FQfLLLLLLL = ((C21665419qe) awS93S1300000_33.l1).LLLLLLL();
            int i = ((C21665419qe) awS93S1300000_33.l1).LLL.LIZLLL;
            if (i == 0) {
                f = 0.0f;
            } else {
                f = r0.LIZJ / i;
            }
            c389830FQfLLLLLLL.setOriginRatio(f);
            Function0 function0 = (Function0) awS93S1300000_33.l3;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010d A[PHI: r3
      0x010d: PHI (r3v3 int) = (r3v2 int), (r3v4 int) binds: [B:28:0x0109, B:20:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$1(kotlin.jvm.internal.AwS93S1300000_33 r9) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS93S1300000_33.invoke$1(kotlin.jvm.internal.AwS93S1300000_33):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS93S1300000_33(C21665319qd c21665319qd, C21665319qd c21665319qd2, Bitmap bitmap, String str, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l1 = c21665319qd;
        this.l2 = c21665319qd2;
        this.s0 = bitmap;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS93S1300000_33(C21665419qe c21665419qe, C21665419qe c21665419qe2, Bitmap bitmap, String str, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l1 = c21665419qe;
        this.l2 = c21665419qe2;
        this.s0 = bitmap;
        this.l3 = str;
    }
}
