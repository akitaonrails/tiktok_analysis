package kotlin.jvm.internal;

import X.C09AY;
import X.C1786620waq;
import X.C1786640was;
import X.C1786680waw;
import X.C1786850wbD;
import X.C1786880wbG;
import X.C1787830wcn;
import X.C1788060wdA;
import X.C1788590we1;
import X.C1788610we3;
import X.C1789830wg1;
import X.C1789850wg3;
import X.C2097608Jq;
import X.C2097908Jt;
import X.EnumC1157990gEv;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes28.dex */
public class AwS34S0200100_27 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS34S0200100_27 awS34S0200100_27, Object obj) {
        Object objValueOf;
        C1786680waw c1786680waw;
        C1789830wg1 c1789830wg1 = (C1789830wg1) obj;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair(c1789830wg1.LIZIZ, ((C1789850wg3) awS34S0200100_27.l0).LIZIZ.toString());
        pairArr[1] = new Pair(c1789830wg1.LIZJ, ((C1789850wg3) awS34S0200100_27.l0).LIZJ.toString());
        pairArr[2] = new Pair(c1789830wg1.LJ, String.valueOf(System.currentTimeMillis() - awS34S0200100_27.j2));
        pairArr[3] = new Pair(c1789830wg1.LJFF, "205");
        String str = c1789830wg1.LJI;
        Throwable th = (Throwable) awS34S0200100_27.l1;
        if ((th instanceof C1786680waw) && (c1786680waw = (C1786680waw) th) != null) {
            objValueOf = Integer.valueOf(c1786680waw.getErrorCode());
        } else {
            objValueOf = "-1";
        }
        pairArr[4] = new Pair(str, objValueOf.toString());
        pairArr[5] = new Pair(c1789830wg1.LJII, "failure on query common sku");
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static final Object invoke$1(AwS34S0200100_27 awS34S0200100_27, Object obj) {
        C1788610we3 c1788610we3 = (C1788610we3) obj;
        return C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair(c1788610we3.LIZIZ, ((List) awS34S0200100_27.l0).toString()), new Pair(c1788610we3.LIZJ, String.valueOf(System.currentTimeMillis() - awS34S0200100_27.j2))), ((C1788590we1) awS34S0200100_27.l1).LIZ.getCommonEventInfo());
    }

    public static final Object invoke$2(AwS34S0200100_27 awS34S0200100_27, Object obj) {
        return C2097608Jq.LJIIL(C2097608Jq.LJIIL(C2097908Jt.LIZJ(new Pair(((C1786620waq) obj).LIZIZ, String.valueOf(((C1786640was) awS34S0200100_27.l0).LIZIZ.currentTimeMillis() - awS34S0200100_27.j2))), ((C1787830wcn) awS34S0200100_27.l1).LIZIZ()), ((C1786640was) awS34S0200100_27.l0).LIZ.getCommonEventInfo());
    }

    public static final Object invoke$3(AwS34S0200100_27 awS34S0200100_27, Object obj) {
        C1786880wbG c1786880wbG = (C1786880wbG) obj;
        return C2097608Jq.LJIIL(C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair(c1786880wbG.LIZIZ, String.valueOf(awS34S0200100_27.j2)), new Pair(c1786880wbG.LIZJ, String.valueOf(EnumC1157990gEv.PURCHASED.getValue()))), ((C1787830wcn) awS34S0200100_27.l0).LIZIZ()), ((C1786850wbD) awS34S0200100_27.l1).LIZ.getCommonEventInfo());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S0200100_27(long j, C1787830wcn c1787830wcn, C1786850wbD c1786850wbD, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.l0 = c1787830wcn;
        this.l1 = c1786850wbD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S0200100_27(C1786640was c1786640was, long j, C1787830wcn c1787830wcn, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1786640was;
        this.j2 = j;
        this.l1 = c1787830wcn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS34S0200100_27(C1789850wg3 c1789850wg3, long j, Throwable th, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1789850wg3;
        this.j2 = j;
        this.l1 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS34S0200100_27) (LINE:67305479) kotlin.jvm.internal.AwS34S0200100_27.l1 java.lang.Object, block:B:2:0x0000 */
    public AwS34S0200100_27(List list, List<C1788060wdA> list2, long j, C1788590we1 c1788590we1) {
        Object obj;
        super(1);
        this.$t = c1788590we1;
        this.l0 = list;
        this.j2 = list2;
        this.l1 = obj;
    }
}
