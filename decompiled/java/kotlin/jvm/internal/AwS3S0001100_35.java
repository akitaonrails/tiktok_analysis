package kotlin.jvm.internal;

import X.C09AY;
import X.C1023640ckE;
import X.C2249231D1t;
import X.C2249261D1w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS3S0001100_35 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f996i0;
    public long j1;

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

    public static final Object invoke$0(AwS3S0001100_35 awS3S0001100_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2249261D1w.LIZ.getClass();
        c1023640ckE.withParam(C2249261D1w.LIZIZ, Long.valueOf(awS3S0001100_35.j1));
        c1023640ckE.withParam(C2249261D1w.LJ, Integer.valueOf(awS3S0001100_35.f996i0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S0001100_35 awS3S0001100_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2249261D1w.LIZ.getClass();
        c1023640ckE.withParam(C2249261D1w.LIZIZ, Long.valueOf(awS3S0001100_35.j1));
        c1023640ckE.withParam(C2249261D1w.LJ, Integer.valueOf(awS3S0001100_35.f996i0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS3S0001100_35 awS3S0001100_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2249231D1t.LIZ.getClass();
        c1023640ckE.withParam(C2249231D1t.LIZIZ, Integer.valueOf(awS3S0001100_35.f996i0));
        c1023640ckE.withParam(C2249231D1t.LIZJ, Long.valueOf(awS3S0001100_35.j1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0001100_35(int i, long j, int i2) {
        super(1);
        this.$t = i2;
        this.f996i0 = i;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0001100_35(long j, int i, int i2) {
        super(1);
        this.$t = i2;
        this.j1 = j;
        this.f996i0 = i;
    }
}
