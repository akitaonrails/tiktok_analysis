package kotlin.jvm.internal;

import X.C09AY;
import X.C1358490lSJ;
import X.C1358520lSM;
import X.C1358750lSj;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS0S0011100_21 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public long j2;
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

    public static final Object invoke$0(AwS0S0011100_21 awS0S0011100_21, Object obj) {
        return C1358490lSJ.LIZ((C1358490lSJ) obj, null, new C1358520lSM(awS0S0011100_21.i1, awS0S0011100_21.j2, awS0S0011100_21.z0), null, null, 0, null, 0, 125);
    }

    public static final Object invoke$1(AwS0S0011100_21 awS0S0011100_21, Object obj) {
        return C1358750lSj.LIZ((C1358750lSj) obj, null, null, new C1358520lSM(awS0S0011100_21.i1, awS0S0011100_21.j2, awS0S0011100_21.z0), null, 23);
    }

    public static final Object invoke$2(AwS0S0011100_21 awS0S0011100_21, Object obj) {
        return C1358490lSJ.LIZ((C1358490lSJ) obj, null, new C1358520lSM(awS0S0011100_21.i1, awS0S0011100_21.j2, awS0S0011100_21.z0), null, null, 0, null, 0, 125);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0011100_21(int i, long j, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.j2 = j;
        this.z0 = z;
    }
}
