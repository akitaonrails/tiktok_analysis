package kotlin.jvm.internal;

import X.C09AY;
import X.C259800zU;
import X.C355480Dwg;
import X.InterfaceC355460Dwe;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS2S0210100_5 extends C09AY implements Function0 {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS2S0210100_5 awS2S0210100_5) {
        InterfaceC355460Dwe interfaceC355460Dwe = (InterfaceC355460Dwe) awS2S0210100_5.l0;
        if (interfaceC355460Dwe != null) {
            interfaceC355460Dwe.LIZIZ(1, (float[]) ((C259800zU) awS2S0210100_5.l1).element, new C355480Dwg(awS2S0210100_5.j3, awS2S0210100_5.z2));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS2S0210100_5 awS2S0210100_5) {
        InterfaceC355460Dwe interfaceC355460Dwe = (InterfaceC355460Dwe) awS2S0210100_5.l0;
        if (interfaceC355460Dwe != null) {
            interfaceC355460Dwe.LIZIZ(1, (float[]) ((C259800zU) awS2S0210100_5.l1).element, new C355480Dwg(awS2S0210100_5.j3, awS2S0210100_5.z2));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:boolean), (r1 I:kotlin.jvm.internal.AwS2S0210100_5) (LINE:83886089) kotlin.jvm.internal.AwS2S0210100_5.z2 boolean, block:B:2:0x0000 */
    public AwS2S0210100_5(InterfaceC355460Dwe interfaceC355460Dwe, InterfaceC355460Dwe interfaceC355460Dwe2, C259800zU<float[]> c259800zU, long j, boolean z) {
        boolean z2;
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = interfaceC355460Dwe;
        this.l1 = interfaceC355460Dwe2;
        this.j3 = c259800zU;
        this.z2 = z2;
    }
}
