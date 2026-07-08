package kotlin.jvm.internal;

import X.C09AY;
import X.C0SL3;
import X.C118300cf;
import X.C259800zU;
import X.C817403Hg;
import android.graphics.Rect;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS46S0500000_11 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS46S0500000_11 awS46S0500000_11, Object obj) {
        C0SL3 c0sl3 = (C0SL3) obj;
        ImageView.ScaleType scaleType = (ImageView.ScaleType) ((C259800zU) awS46S0500000_11.l0).element;
        if (scaleType == null) {
            C0SL3 c0sl32 = c0sl3.LJIIL;
            if (c0sl32 == null) {
                c0sl32 = c0sl3;
            }
            scaleType = c0sl32.LIZ;
        }
        if (c0sl3.LIZJ == ((C118300cf) awS46S0500000_11.l1).element && c0sl3.LIZIZ == ((C817403Hg) awS46S0500000_11.l2).element && scaleType == c0sl3.LIZ && Intrinsics.LJFF(c0sl3.LJ, ((C259800zU) awS46S0500000_11.l3).element) && Intrinsics.LJFF(c0sl3.LJI, ((C259800zU) awS46S0500000_11.l4).element)) {
            return null;
        }
        int i = ((C118300cf) awS46S0500000_11.l1).element;
        float f = ((C817403Hg) awS46S0500000_11.l2).element;
        C0SL3 c0sl33 = c0sl3.LJIIL;
        if (c0sl33 == null) {
            c0sl33 = c0sl3;
        }
        return C0SL3.LIZ(c0sl3, scaleType, f, i, (Rect) ((C259800zU) awS46S0500000_11.l3).element, (Rect) ((C259800zU) awS46S0500000_11.l4).element, c0sl33, 12200);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS46S0500000_11 awS46S0500000_11, Object obj) {
        C0SL3 c0sl3 = (C0SL3) obj;
        ImageView.ScaleType scaleType = (ImageView.ScaleType) ((C259800zU) awS46S0500000_11.l0).element;
        if (scaleType == null) {
            C0SL3 c0sl32 = c0sl3.LJIIL;
            if (c0sl32 == null) {
                c0sl32 = c0sl3;
            }
            scaleType = c0sl32.LIZ;
        }
        if (c0sl3.LIZJ == ((C118300cf) awS46S0500000_11.l1).element && c0sl3.LIZIZ == ((C817403Hg) awS46S0500000_11.l2).element && scaleType == c0sl3.LIZ && Intrinsics.LJFF(c0sl3.LJ, ((C259800zU) awS46S0500000_11.l3).element) && Intrinsics.LJFF(c0sl3.LJI, ((C259800zU) awS46S0500000_11.l4).element)) {
            return null;
        }
        int i = ((C118300cf) awS46S0500000_11.l1).element;
        float f = ((C817403Hg) awS46S0500000_11.l2).element;
        C0SL3 c0sl33 = c0sl3.LJIIL;
        if (c0sl33 == null) {
            c0sl33 = c0sl3;
        }
        return C0SL3.LIZ(c0sl3, scaleType, f, i, (Rect) ((C259800zU) awS46S0500000_11.l3).element, (Rect) ((C259800zU) awS46S0500000_11.l4).element, c0sl33, 12200);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS46S0500000_11(C259800zU c259800zU, C259800zU<ImageView.ScaleType> c259800zU2, C118300cf c118300cf, C817403Hg c817403Hg, C259800zU<Rect> c259800zU3, C259800zU<Rect> c259800zU4) {
        super(1);
        this.$t = c259800zU4;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c118300cf;
        this.l3 = c817403Hg;
        this.l4 = c259800zU3;
    }
}
