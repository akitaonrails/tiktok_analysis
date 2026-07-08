package kotlin.jvm.internal;

import X.C09AY;
import X.C925310aBd;
import X.C975970bVL;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS3S0101200_15 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
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
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS3S0101200_15 r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS3S0101200_15.invoke$0(kotlin.jvm.internal.AwS3S0101200_15, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS3S0101200_15 awS3S0101200_15, Object obj) {
        ((C925310aBd) awS3S0101200_15.l0).LJI(awS3S0101200_15.i1, awS3S0101200_15.j2, awS3S0101200_15.j3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0101200_15(C925310aBd c925310aBd, long j, long j2, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c925310aBd;
        this.j2 = j;
        this.j3 = j2;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0101200_15(C975970bVL c975970bVL, long j, long j2, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c975970bVL;
        this.j2 = j;
        this.j3 = j2;
        this.i1 = i;
    }
}
