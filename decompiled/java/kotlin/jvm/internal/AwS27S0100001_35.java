package kotlin.jvm.internal;

import X.C09AY;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C1DYL;
import X.C1DYO;
import X.C2176151AEr;
import X.C2249171D1n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AwS27S0100001_35 extends C09AY implements Function1 {
    public final int $t;
    public float f1;
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

    public static final Object invoke$0(AwS27S0100001_35 awS27S0100001_35, Object obj) {
        String str;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2249171D1n.LIZ.getClass();
        C1002190cBd c1002190cBd = C2249171D1n.LJFF;
        C2176151AEr c2176151AEr = (C2176151AEr) awS27S0100001_35.l0;
        float f = awS27S0100001_35.f1;
        c2176151AEr.getClass();
        int i = (int) (f * 10);
        if (i != 5) {
            if (i != 10) {
                if (i != 15) {
                    if (i != 20) {
                        str = null;
                    } else {
                        str = "2.0x";
                    }
                } else {
                    str = "1.5x";
                }
            } else {
                str = "1.0x";
            }
        } else {
            str = "0.5x";
        }
        c1023640ckE.withParam(c1002190cBd, str);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS27S0100001_35 awS27S0100001_35, Object obj) {
        ((C1DYO) obj).setAlpha(awS27S0100001_35.f1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S0100001_35(C2176151AEr c2176151AEr, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2176151AEr;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S0100001_35(C1DYL c1dyl, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1dyl;
        this.f1 = f;
    }
}
