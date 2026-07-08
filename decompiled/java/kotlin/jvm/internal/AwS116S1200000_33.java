package kotlin.jvm.internal;

import X.C09AY;
import X.C0CNO;
import X.C1524805y2;
import X.C21665219qc;
import X.C21665319qd;
import X.C21665419qe;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes34.dex */
public class AwS116S1200000_33 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS116S1200000_33 awS116S1200000_33, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!bitmap.isRecycled()) {
            C0CNO.LIZLLL(0L, new AwS93S1300000_33((C21665419qe) awS116S1200000_33.l2, (C21665419qe) bitmap, (Bitmap) awS116S1200000_33.s0, (String) awS116S1200000_33.l1, (Function0<Unit>) 0));
        } else {
            Function0 function0 = (Function0) awS116S1200000_33.l1;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS116S1200000_33 awS116S1200000_33, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap.isRecycled()) {
            Function0 function0 = (Function0) awS116S1200000_33.l1;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            C1524805y2.LIZIZ(0L, new AwS93S1300000_33((C21665319qd) awS116S1200000_33.l2, (C21665319qd) bitmap, (Bitmap) awS116S1200000_33.s0, (String) awS116S1200000_33.l1, (Function0<Unit>) 1));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1200000_33(C21665219qc c21665219qc, C21665419qe c21665419qe, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c21665219qc;
        this.l2 = c21665419qe;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS116S1200000_33(AwS87S0500000_33 awS87S0500000_33, C21665319qd c21665319qd, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = awS87S0500000_33;
        this.l2 = c21665319qd;
        this.s0 = str;
    }
}
