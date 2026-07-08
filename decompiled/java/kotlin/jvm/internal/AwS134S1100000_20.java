package kotlin.jvm.internal;

import X.C05XL;
import X.C099F;
import X.C09AY;
import X.C0NOP;
import X.C1168320gVa;
import X.C1306060k5k;
import X.C1306390k6H;
import X.C1306520k6U;
import X.C1337860kv2;
import X.C1338000kvG;
import X.C786410Ut5;
import Y.ARunnableS116S0100000_16;
import android.graphics.Bitmap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public class AwS134S1100000_20 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS134S1100000_20 awS134S1100000_20, Object obj) {
        C1306060k5k c1306060k5k = (C1306060k5k) obj;
        if (Intrinsics.LJFF(c1306060k5k.LIZLLL, awS134S1100000_20.s0)) {
            ((C05XL) awS134S1100000_20.l1).LJIIZILJ(c1306060k5k);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS134S1100000_20 awS134S1100000_20, Object obj) {
        String str;
        C0NOP c0nop = (C0NOP) obj;
        Map<String, Object> map = c0nop.LIZ;
        if (awS134S1100000_20.s0 == null) {
            str = "nodes";
        } else {
            str = "node";
        }
        map.put("method", str);
        C1306520k6U.LJFF(c0nop.LIZ, "node_name", awS134S1100000_20.s0);
        C1306390k6H c1306390k6H = (C1306390k6H) awS134S1100000_20.l1;
        if (c1306390k6H.LIZ == 0) {
            C1306520k6U.LJFF(c0nop.LIZ, "error_code", c1306390k6H.LIZJ);
            C1306520k6U.LJFF(c0nop.LIZ, "error_msg", ((C1306390k6H) awS134S1100000_20.l1).LIZIZ);
        } else {
            c0nop.LIZ.put("error_code", 0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS134S1100000_20 awS134S1100000_20, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C1338000kvG c1338000kvG = new C1338000kvG((C1337860kv2) awS134S1100000_20.l1, bitmap, awS134S1100000_20.s0);
            if (C1168320gVa.LIZIZ()) {
                c1338000kvG.invoke();
            } else {
                C786410Ut5.LJJZZIII(C1168320gVa.LIZ, new ARunnableS116S0100000_16(c1338000kvG, (Function0<Unit>) 163));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S1100000_20(C1337860kv2 c1337860kv2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1337860kv2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S1100000_20(String str, C099F c099f, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c099f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS134S1100000_20(String str, String str2, C1306390k6H<?> c1306390k6H) {
        super(1);
        this.$t = c1306390k6H;
        this.s0 = str;
        this.l1 = str2;
    }
}
