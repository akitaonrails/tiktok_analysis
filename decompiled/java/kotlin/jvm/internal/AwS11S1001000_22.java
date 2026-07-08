package kotlin.jvm.internal;

import X.C09AY;
import X.C12G7;
import X.C1413660mtI;
import X.C1413890mtf;
import X.C1426330nDj;
import X.C375830EoP;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS11S1001000_22 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS11S1001000_22 awS11S1001000_22, Object obj) {
        return C1426330nDj.LIZ((C1426330nDj) obj, null, new Pair(awS11S1001000_22.s0, Integer.valueOf(awS11S1001000_22.i1)), 1);
    }

    public static final Object invoke$1(AwS11S1001000_22 awS11S1001000_22, Object obj) {
        return C12G7.LIZ((C12G7) obj, null, null, new C375830EoP(new Pair(Integer.valueOf(awS11S1001000_22.i1), awS11S1001000_22.s0)), null, null, null, null, null, null, null, null, 32751);
    }

    public static final Object invoke$2(AwS11S1001000_22 awS11S1001000_22, Object obj) {
        return C12G7.LIZ((C12G7) obj, null, null, null, new C375830EoP(new Pair(Integer.valueOf(awS11S1001000_22.i1), awS11S1001000_22.s0)), null, null, null, null, null, null, null, 32735);
    }

    public static final Object invoke$3(AwS11S1001000_22 awS11S1001000_22, Object obj) {
        return C12G7.LIZ((C12G7) obj, null, null, null, null, null, null, new C375830EoP(new Pair(Integer.valueOf(awS11S1001000_22.i1), awS11S1001000_22.s0)), null, null, null, null, 32511);
    }

    public static final Object invoke$4(AwS11S1001000_22 awS11S1001000_22, Object obj) {
        return C12G7.LIZ((C12G7) obj, null, null, null, null, new C375830EoP(new Pair(Integer.valueOf(awS11S1001000_22.i1), awS11S1001000_22.s0)), null, null, null, null, null, null, 32703);
    }

    public static final Object invoke$5(AwS11S1001000_22 awS11S1001000_22, Object obj) {
        return C1413890mtf.LIZ((C1413890mtf) obj, null, null, null, false, null, null, null, null, null, new C1413660mtI(awS11S1001000_22.i1, awS11S1001000_22.s0), null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, false, null, 134217215);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S1001000_22(int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S1001000_22(String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
