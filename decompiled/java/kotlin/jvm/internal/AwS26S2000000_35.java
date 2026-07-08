package kotlin.jvm.internal;

import X.C09AY;
import X.C1023640ckE;
import X.C2273201DyI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS26S2000000_35 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public String s1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS26S2000000_35 awS26S2000000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withParam(C2273201DyI.LJIILL, awS26S2000000_35.s0);
        c1023640ckE.withParam(C2273201DyI.LJIILLIIL, awS26S2000000_35.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS26S2000000_35 awS26S2000000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withParam(C2273201DyI.LIZJ, awS26S2000000_35.s0);
        c1023640ckE.withParam(C2273201DyI.LIZLLL, awS26S2000000_35.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS26S2000000_35 awS26S2000000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withParam(C2273201DyI.LIZJ, awS26S2000000_35.s0);
        c1023640ckE.withParam(C2273201DyI.LIZLLL, awS26S2000000_35.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS26S2000000_35 awS26S2000000_35, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withParam(C2273201DyI.LIZJ, awS26S2000000_35.s0);
        c1023640ckE.withParam(C2273201DyI.LIZLLL, awS26S2000000_35.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S2000000_35(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
