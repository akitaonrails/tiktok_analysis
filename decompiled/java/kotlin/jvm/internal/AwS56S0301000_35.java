package kotlin.jvm.internal;

import X.C09AY;
import X.C0Y3I;
import X.C1023640ckE;
import X.C1D2Q;
import X.C1DW6;
import X.C869590Y9l;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS56S0301000_35 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS56S0301000_35 awS56S0301000_35, Object obj) {
        ((C1DW6) obj).gb(((C0Y3I) awS56S0301000_35.l0).LIZ(), (List) awS56S0301000_35.l1, (Map) awS56S0301000_35.l2, awS56S0301000_35.i3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS56S0301000_35 awS56S0301000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1D2Q.LIZ.getClass();
        c1023640ckE.withParam(C1D2Q.LIZJ, Integer.valueOf(awS56S0301000_35.i3));
        Integer num = (Integer) awS56S0301000_35.l0;
        if (num != null) {
            c1023640ckE.withParam(C1D2Q.LIZLLL, Integer.valueOf(num.intValue()));
        }
        Integer num2 = (Integer) awS56S0301000_35.l1;
        if (num2 != null) {
            c1023640ckE.withParam(C1D2Q.LJ, Integer.valueOf(num2.intValue()));
        }
        Integer num3 = (Integer) awS56S0301000_35.l2;
        if (num3 != null) {
            c1023640ckE.withParam(C1D2Q.LJFF, Integer.valueOf(num3.intValue()));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0301000_35(int i, Integer num, Integer num2, Integer num3, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.l0 = num;
        this.l1 = num2;
        this.l2 = num3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS56S0301000_35(C0Y3I c0y3i, C0Y3I c0y3i2, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0y3i;
        this.l1 = c0y3i2;
        this.l2 = list;
        this.i3 = map;
    }
}
