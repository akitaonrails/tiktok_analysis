package kotlin.jvm.internal;

import X.C09AY;
import X.C1212320heY;
import X.C13LY;
import X.C13LZ;
import X.C1676820tjk;
import X.C1677100tkC;
import X.C1677160tkI;
import X.C1683600tug;
import X.C1696490uFT;
import X.C1696500uFU;
import X.InterfaceC1692460u8y;
import X.InterfaceC2217461Bqa;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS4S0101001_25 extends C09AY implements Function1 {
    public final int $t;
    public float f2;
    public int i1;
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

    public static final Object invoke$0(AwS4S0101001_25 awS4S0101001_25, Object obj) {
        return new C1676820tjk((((long) C1677160tkI.LIZ(C1677100tkC.LJII(awS4S0101001_25.f2, (C13LY) awS4S0101001_25.l0) * awS4S0101001_25.i1)) << 32) | (((long) 0) & 4294967295L));
    }

    public static final Object invoke$1(AwS4S0101001_25 awS4S0101001_25, Object obj) {
        return new C1676820tjk((((long) C1677160tkI.LIZ(C1677100tkC.LJII(awS4S0101001_25.f2, (C13LY) awS4S0101001_25.l0) * awS4S0101001_25.i1)) << 32) | (((long) 0) & 4294967295L));
    }

    public static final Object invoke$2(AwS4S0101001_25 awS4S0101001_25, Object obj) {
        C1683600tug c1683600tug = new C1683600tug(((Number) C13LZ.LJII(Float.valueOf(awS4S0101001_25.f2), (C13LY) awS4S0101001_25.l0)).floatValue(), (C13LY) awS4S0101001_25.l0, awS4S0101001_25.i1);
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1696490uFT.LIZ;
        C1212320heY<C1683600tug> c1212320heY = C1696500uFU.LIZLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C1696490uFT.LIZ;
        c1212320heY.getClass();
        ((InterfaceC1692460u8y) obj).LIZJ(c1212320heY, c1683600tug);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS4S0101001_25(float f, float f2, C13LY<Float> c13ly, int i) {
        super(1);
        this.$t = i;
        this.f2 = f;
        this.l0 = f2;
        this.i1 = c13ly;
    }
}
