package kotlin.jvm.internal;

import X.C09AY;
import X.C1788310wdZ;
import X.C1788330wdb;
import X.C1788720weE;
import X.C1789320wfC;
import X.C1855180yNQ;
import X.C1855260yNY;
import X.C2097608Jq;
import X.EnumC1855280yNa;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS24S2000000_27 extends C09AY implements Function1 {
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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS24S2000000_27 awS24S2000000_27, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        sparkContext.LJJJZ("event_id", awS24S2000000_27.s0);
        sparkContext.LJJJZ("enter_from", awS24S2000000_27.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS24S2000000_27 awS24S2000000_27, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        sparkContext.LJJJZ("event_id", awS24S2000000_27.s0);
        sparkContext.LJJJZ("enter_from", awS24S2000000_27.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS24S2000000_27 awS24S2000000_27, Object obj) {
        return C1855260yNY.LIZ((C1855260yNY) obj, false, false, new C1855180yNQ(awS24S2000000_27.s0, true, awS24S2000000_27.s1), null, null, EnumC1855280yNa.LOW_VOLUME, null, 72);
    }

    public static final Object invoke$3(AwS24S2000000_27 awS24S2000000_27, Object obj) {
        return C1855260yNY.LIZ((C1855260yNY) obj, false, false, new C1855180yNQ(awS24S2000000_27.s0, false, awS24S2000000_27.s1), null, null, null, null, 123);
    }

    public static final Object invoke$4(AwS24S2000000_27 awS24S2000000_27, Object obj) {
        C1789320wfC c1789320wfC = (C1789320wfC) obj;
        return C2097608Jq.LJIIIIZZ(new Pair(c1789320wfC.LIZIZ, awS24S2000000_27.s0), new Pair(c1789320wfC.LIZJ, awS24S2000000_27.s1));
    }

    public static final Object invoke$5(AwS24S2000000_27 awS24S2000000_27, Object obj) {
        C1788720weE c1788720weE = (C1788720weE) obj;
        return C2097608Jq.LJIIIIZZ(new Pair(c1788720weE.LIZJ, awS24S2000000_27.s0), new Pair(c1788720weE.LIZIZ, awS24S2000000_27.s1));
    }

    public static final Object invoke$6(AwS24S2000000_27 awS24S2000000_27, Object obj) {
        C1788310wdZ c1788310wdZ = (C1788310wdZ) obj;
        return C2097608Jq.LJIIIIZZ(new Pair(c1788310wdZ.LIZJ, awS24S2000000_27.s0), new Pair(c1788310wdZ.LIZIZ, awS24S2000000_27.s1));
    }

    public static final Object invoke$7(AwS24S2000000_27 awS24S2000000_27, Object obj) {
        C1788330wdb c1788330wdb = (C1788330wdb) obj;
        return C2097608Jq.LJIIIIZZ(new Pair(c1788330wdb.LIZJ, awS24S2000000_27.s0), new Pair(c1788330wdb.LIZIZ, awS24S2000000_27.s1));
    }

    public static final Object invoke$8(AwS24S2000000_27 awS24S2000000_27, Object obj) {
        ((Map) obj).put(awS24S2000000_27.s0, awS24S2000000_27.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S2000000_27(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
