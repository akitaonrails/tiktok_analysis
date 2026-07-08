package kotlin.jvm.internal;

import X.C09AY;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1675860tiC;
import X.C1680770tq7;
import X.C1685850tyJ;
import X.C1695210uDP;
import X.InterfaceC1675870tiD;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS1S0000101_25 extends C09AY implements Function1 {
    public final int $t;
    public float f1;
    public long j0;

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

    public static final Object invoke$0(AwS1S0000101_25 awS1S0000101_25, Object obj) {
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LIZIZ = true;
        c1331100kk8.LJ(awS1S0000101_25.f1, C1685850tyJ.LJIIIZ(awS1S0000101_25.j0));
        ((C1331070kk5) obj).LJJIII(c1331100kk8);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S0000101_25 awS1S0000101_25, Object obj) {
        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj;
        float fLIZJ = C1680770tq7.LIZJ(interfaceC1675870tiD.LIZIZ());
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() & 4294967295L)) / 2.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        C1675860tiC.LIZLLL(interfaceC1675870tiD, awS1S0000101_25.j0, (fLIZJ - awS1S0000101_25.f1) / 2.0f, jFloatToRawIntBits, 0.0f, new C1695210uDP(awS1S0000101_25.f1, 0.0f, 1, 1, null, 18), 104);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0000101_25(float f, long j, int i) {
        super(1);
        this.$t = i;
        this.f1 = f;
        this.j0 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0000101_25(long j, float f, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
        this.f1 = f;
    }
}
