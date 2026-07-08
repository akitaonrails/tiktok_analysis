package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import X.C2191401Ape;
import X.C2191421Apg;
import X.C2191431Aph;
import X.C2191441Api;
import X.C675200Qe6;
import X.EnumC994770bzf;
import X.EnumC994780bzg;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AwS5S1400100_34 extends C09AY implements Function0 {
    public final int $t;
    public long j5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS5S1400100_34 awS5S1400100_34) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PUT_REUSE mode=");
        sbLIZ.append((EnumC994780bzg) awS5S1400100_34.l1);
        sbLIZ.append(" keyType=");
        C2191401Ape c2191401Ape = (C2191401Ape) awS5S1400100_34.l2;
        List list = (List) awS5S1400100_34.l3;
        c2191401Ape.getClass();
        sbLIZ.append(C2191401Ape.LJI(list));
        sbLIZ.append(" key=");
        sbLIZ.append(awS5S1400100_34.s0);
        sbLIZ.append(" expireAt=");
        sbLIZ.append(((C2191421Apg) awS5S1400100_34.l4).LIZLLL);
        sbLIZ.append(" ttl=");
        sbLIZ.append(((C2191421Apg) awS5S1400100_34.l4).LIZLLL - awS5S1400100_34.j5);
        sbLIZ.append(" deferred=");
        sbLIZ.append(System.identityHashCode(((C2191421Apg) awS5S1400100_34.l4).LIZJ));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS5S1400100_34 awS5S1400100_34) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PUT_REUSE path=concurrent mode=");
        sbLIZ.append((EnumC994780bzg) awS5S1400100_34.l1);
        sbLIZ.append(" keyType=");
        C2191401Ape c2191401Ape = (C2191401Ape) awS5S1400100_34.l2;
        List list = (List) awS5S1400100_34.l3;
        c2191401Ape.getClass();
        sbLIZ.append(C2191401Ape.LJI(list));
        sbLIZ.append(" key=");
        sbLIZ.append(awS5S1400100_34.s0);
        sbLIZ.append(" expireAt=");
        sbLIZ.append(((C2191421Apg) awS5S1400100_34.l4).LIZLLL);
        sbLIZ.append(" ttl=");
        sbLIZ.append(((C2191421Apg) awS5S1400100_34.l4).LIZLLL - awS5S1400100_34.j5);
        sbLIZ.append(" deferred=");
        sbLIZ.append(System.identityHashCode(((C2191421Apg) awS5S1400100_34.l4).LIZJ));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS5S1400100_34 awS5S1400100_34) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PUT_REUSE path=concurrent domain=");
        sbLIZ.append(((C675200Qe6) awS5S1400100_34.l1).LIZ);
        sbLIZ.append(" mode=");
        sbLIZ.append((EnumC994770bzf) awS5S1400100_34.l2);
        sbLIZ.append(" keyType=");
        C2191431Aph c2191431Aph = C2191431Aph.LIZ;
        List list = (List) awS5S1400100_34.l3;
        c2191431Aph.getClass();
        sbLIZ.append(C2191431Aph.LJ(list));
        sbLIZ.append(" key=");
        sbLIZ.append(awS5S1400100_34.s0);
        sbLIZ.append(" expireAt=");
        sbLIZ.append(((C2191441Api) awS5S1400100_34.l4).LJ);
        sbLIZ.append(" ttl=");
        sbLIZ.append(((C2191441Api) awS5S1400100_34.l4).LJ - awS5S1400100_34.j5);
        sbLIZ.append(" deferred=");
        sbLIZ.append(System.identityHashCode(((C2191441Api) awS5S1400100_34.l4).LIZJ));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0000: IPUT (r10 I:int), (r2 I:kotlin.jvm.internal.AwS5S1400100_34) (LINE:117440512) kotlin.jvm.internal.AwS5S1400100_34.$t int, block:B:2:0x0000 */
    public AwS5S1400100_34(C675200Qe6 c675200Qe6, C675200Qe6<Object> c675200Qe62, EnumC994770bzf enumC994770bzf, List<String> list, String str, C2191441Api c2191441Api, long j) {
        int i;
        super(0);
        this.$t = i;
        this.l1 = c675200Qe6;
        this.l2 = c675200Qe62;
        this.l3 = enumC994770bzf;
        this.s0 = list;
        this.l4 = str;
        this.j5 = c2191441Api;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0000: IPUT (r10 I:int), (r2 I:kotlin.jvm.internal.AwS5S1400100_34) (LINE:117506048) kotlin.jvm.internal.AwS5S1400100_34.$t int, block:B:2:0x0000 */
    public AwS5S1400100_34(EnumC994780bzg enumC994780bzg, EnumC994780bzg enumC994780bzg2, C2191401Ape<Object> c2191401Ape, List<String> list, String str, C2191421Apg<Object> c2191421Apg, long j) {
        int i;
        super(0);
        this.$t = i;
        this.l1 = enumC994780bzg;
        this.l2 = enumC994780bzg2;
        this.l3 = c2191401Ape;
        this.s0 = list;
        this.l4 = str;
        this.j5 = c2191421Apg;
    }
}
