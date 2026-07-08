package kotlin.jvm.internal;

import X.C09AY;
import X.C1023640ckE;
import X.C1040740dBo;
import X.C1043500dGG;
import X.C2266131Dmt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS2S1100010_16 extends C09AY implements Function1 {
    public final int $t;
    public double d2;
    public Object l1;
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

    public static final Object invoke$0(AwS2S1100010_16 awS2S1100010_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LJIILJJIL, Integer.valueOf(((C1040740dBo) awS2S1100010_16.l1).LLILLL));
        c1023640ckE.withParam(C1043500dGG.LJIILLIIL, ((C1040740dBo) awS2S1100010_16.l1).LLJI);
        c1023640ckE.withParam(C1043500dGG.LJJJLZIJ, "iab");
        c1023640ckE.withParam(C1043500dGG.LJJJ, Integer.valueOf(((C1040740dBo) awS2S1100010_16.l1).LLJJIJIL));
        c1023640ckE.withParam(C1043500dGG.LJJLL, awS2S1100010_16.s0);
        c1023640ckE.withParam(C1043500dGG.LJJZ, Double.valueOf(awS2S1100010_16.d2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S1100010_16 awS2S1100010_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2266131Dmt.LIZ.getClass();
        c1023640ckE.withParam(C2266131Dmt.LJIIJJI, Long.valueOf(((C1040740dBo) awS2S1100010_16.l1).LLILLL));
        c1023640ckE.withParam(C2266131Dmt.LJIL, ((C1040740dBo) awS2S1100010_16.l1).LLJI);
        c1023640ckE.withParam(C2266131Dmt.LJFF, "iab");
        c1023640ckE.withParam(C2266131Dmt.LJ, Long.valueOf(((C1040740dBo) awS2S1100010_16.l1).LLJJIJIL));
        c1023640ckE.withParam(C2266131Dmt.LJIIIZ, awS2S1100010_16.s0);
        c1023640ckE.withParam(C2266131Dmt.LJJII, Double.valueOf(awS2S1100010_16.d2));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S1100010_16(C1040740dBo c1040740dBo, String str, double d, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1040740dBo;
        this.s0 = str;
        this.d2 = d;
    }
}
