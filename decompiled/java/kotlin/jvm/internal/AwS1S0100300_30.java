package kotlin.jvm.internal;

import X.C09AY;
import X.C13OW;
import X.C13OX;
import X.C20003813Oq;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS1S0100300_30 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public long j2;
    public long j3;
    public Object l0;

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

    public static final Object invoke$0(AwS1S0100300_30 awS1S0100300_30, Object obj) {
        ((C20003813Oq) awS1S0100300_30.l0).LIZIZ(awS1S0100300_30.j1, awS1S0100300_30.j2, awS1S0100300_30.j3, ((Number) obj).intValue(), System.currentTimeMillis());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S0100300_30 awS1S0100300_30, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C13OW c13ow = (C13OW) awS1S0100300_30.l0;
        c13ow.LJIIIIZZ = iIntValue;
        c13ow.LIZIZ(awS1S0100300_30.j1, awS1S0100300_30.j2, awS1S0100300_30.j3, System.currentTimeMillis());
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS1S0100300_30 awS1S0100300_30, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C13OX c13ox = (C13OX) awS1S0100300_30.l0;
        c13ox.LJIIIZ = iIntValue;
        c13ox.LIZIZ(awS1S0100300_30.j1, awS1S0100300_30.j2, awS1S0100300_30.j3, System.currentTimeMillis());
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0100300_30(C13OW c13ow, long j, long j2, long j3, int i) {
        super(1);
        this.$t = i;
        this.l0 = c13ow;
        this.j1 = j;
        this.j2 = j2;
        this.j3 = j3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0100300_30(C13OX c13ox, long j, long j2, long j3, int i) {
        super(1);
        this.$t = i;
        this.l0 = c13ox;
        this.j1 = j;
        this.j2 = j2;
        this.j3 = j3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0100300_30(C20003813Oq c20003813Oq, long j, long j2, long j3, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20003813Oq;
        this.j1 = j;
        this.j2 = j2;
        this.j3 = j3;
    }
}
