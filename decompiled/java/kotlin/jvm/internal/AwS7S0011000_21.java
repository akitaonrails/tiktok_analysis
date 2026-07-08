package kotlin.jvm.internal;

import X.C09AY;
import X.C1346950l9h;
import X.C1358490lSJ;
import X.C1358750lSj;
import X.C1358760lSk;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS7S0011000_21 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public boolean z0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0011000_21(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.z0 = true;
    }

    public static final Object invoke$0(AwS7S0011000_21 awS7S0011000_21, Object obj) {
        return C1358750lSj.LIZ((C1358750lSj) obj, null, null, null, new C1358760lSk(awS7S0011000_21.i1, !awS7S0011000_21.z0), 15);
    }

    public static final Object invoke$1(AwS7S0011000_21 awS7S0011000_21, Object obj) {
        return C1358490lSJ.LIZ((C1358490lSJ) obj, null, null, new C1358760lSk(awS7S0011000_21.i1, !awS7S0011000_21.z0), null, 0, null, 0, 123);
    }

    public static final Object invoke$2(AwS7S0011000_21 awS7S0011000_21, Object obj) {
        return C1346950l9h.LIZ((C1346950l9h) obj, null, awS7S0011000_21.z0, awS7S0011000_21.i1, 0, null, false, false, false, null, null, null, null, null, false, null, null, null, false, false, null, false, false, false, false, false, null, null, false, null, -7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0011000_21(int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.z0 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0011000_21(boolean z, int i, int i2) {
        super(1);
        this.$t = i2;
        this.z0 = z;
        this.i1 = i;
    }
}
