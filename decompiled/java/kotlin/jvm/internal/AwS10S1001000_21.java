package kotlin.jvm.internal;

import X.C09AY;
import X.C1346950l9h;
import X.C1347410lAR;
import X.C291001Au;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS10S1001000_21 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
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

    public static final Object invoke$0(AwS10S1001000_21 awS10S1001000_21, Object obj) {
        C1347410lAR c1347410lAR = (C1347410lAR) obj;
        int i = awS10S1001000_21.i1;
        if (i >= 0 && i < c1347410lAR.LIZIZ.size()) {
            ArrayList arrayList = new ArrayList(c1347410lAR.LIZIZ);
            ListProtector.set(arrayList, awS10S1001000_21.i1, awS10S1001000_21.s0);
            return C1347410lAR.LIZIZ(c1347410lAR, null, arrayList, null, 5);
        }
        return c1347410lAR;
    }

    public static final Object invoke$1(AwS10S1001000_21 awS10S1001000_21, Object obj) {
        return C1346950l9h.LIZ((C1346950l9h) obj, null, false, 0, 0, null, false, false, false, null, null, null, null, null, false, null, null, null, false, false, null, false, false, false, false, false, null, null, false, new C291001Au(new Pair(awS10S1001000_21.s0, Integer.valueOf(awS10S1001000_21.i1))), Integer.MAX_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S1001000_21(int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S1001000_21(String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
