package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C1013990cUf;
import X.C1053550dWT;
import X.C1055330dZL;
import X.C1055340dZM;
import X.C1072730e1P;
import X.C1315905Cz;
import X.C19EG;
import X.C2296808zG;
import X.C23250099c;
import X.C289060BUq;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class AwS140S0201000_16 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS140S0201000_16 awS140S0201000_16) {
        boolean z;
        C1013990cUf c1013990cUf;
        C1055330dZL c1055330dZL = ((C1055340dZM) awS140S0201000_16.l0).LIZ;
        if (c1055330dZL != null) {
            int i = awS140S0201000_16.i2;
            SparkContext sparkContext = (SparkContext) awS140S0201000_16.l1;
            if (sparkContext != null && (c1013990cUf = (C1013990cUf) sparkContext.LJFF(C1013990cUf.class)) != null) {
                z = c1013990cUf.LIZ;
            } else {
                z = false;
            }
            c1055330dZL.LIZJ = 3;
            c1055330dZL.LJFF = i;
            if (z) {
                c1055330dZL.LJJIIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS140S0201000_16 awS140S0201000_16) {
        if (Intrinsics.LJFF((Boolean) awS140S0201000_16.l0, Boolean.TRUE) && C289060BUq.LIZ()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1315905Cz((C1053550dWT) awS140S0201000_16.l1, awS140S0201000_16.i2, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS140S0201000_16 awS140S0201000_16) {
        ((C1072730e1P) awS140S0201000_16.l0).LJIIIIZZ(awS140S0201000_16.i2, (C19EG) awS140S0201000_16.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS140S0201000_16 awS140S0201000_16) {
        ((C1072730e1P) awS140S0201000_16.l0).LJIIIIZZ(awS140S0201000_16.i2, (C19EG) awS140S0201000_16.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS140S0201000_16 awS140S0201000_16) {
        ((C1072730e1P) awS140S0201000_16.l0).LIZLLL(awS140S0201000_16.i2, (Pair) awS140S0201000_16.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS140S0201000_16(C1072730e1P c1072730e1P, C1072730e1P c1072730e1P2, int i, Pair<Boolean, Boolean> pair) {
        super(0);
        this.$t = pair;
        this.l0 = c1072730e1P;
        this.i2 = c1072730e1P2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S0201000_16(C1072730e1P c1072730e1P, C19EG c19eg, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1072730e1P;
        this.l1 = c19eg;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S0201000_16(Boolean bool, C1053550dWT c1053550dWT, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = bool;
        this.l1 = c1053550dWT;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS140S0201000_16(C1055340dZM c1055340dZM, int i, String str, SparkContext sparkContext, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1055340dZM;
        this.i2 = i;
        this.l1 = sparkContext;
    }
}
