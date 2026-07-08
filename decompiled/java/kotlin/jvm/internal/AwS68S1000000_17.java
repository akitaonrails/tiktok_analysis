package kotlin.jvm.internal;

import X.C09AY;
import X.C1092660eXY;
import X.C1142020fpA;
import X.C1151920g58;
import X.C2188811AlT;
import X.EnumC1142140fpM;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes18.dex */
public class AwS68S1000000_17 extends C09AY implements Function1 {
    public final int $t;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS68S1000000_17(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS68S1000000_17 awS68S1000000_17, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{ \"initial_data\":");
        sbLIZ.append(awS68S1000000_17.s0);
        sbLIZ.append('}');
        sparkContext.initData = C2188811AlT.LIZIZ(sbLIZ);
        sparkContext.LJJJJZI(new C1151920g58(0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS68S1000000_17 awS68S1000000_17, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C1092660eXY) obj).LIZ, awS68S1000000_17.s0));
    }

    public static final Object invoke$2(AwS68S1000000_17 awS68S1000000_17, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C1092660eXY) obj).LIZIZ, awS68S1000000_17.s0));
    }

    public static final Object invoke$3(AwS68S1000000_17 awS68S1000000_17, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C1092660eXY) obj).LIZ, awS68S1000000_17.s0));
    }

    public static final Object invoke$4(AwS68S1000000_17 awS68S1000000_17, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C1092660eXY) obj).LIZIZ, awS68S1000000_17.s0));
    }

    public static final Object invoke$5(AwS68S1000000_17 awS68S1000000_17, Object obj) {
        C1142020fpA c1142020fpA = (C1142020fpA) obj;
        EnumC1142140fpM enumC1142140fpM = EnumC1142140fpM.ERROR;
        String str = awS68S1000000_17.s0;
        if (a0.LJJJIL(str)) {
            str = "unknown player error";
        }
        return C1142020fpA.LIZ(c1142020fpA, null, enumC1142140fpM, 0L, 0L, 0, null, null, 0.0f, 0, null, str, 2043);
    }
}
