package kotlin.jvm.internal;

import X.C05XL;
import X.C099F;
import X.C09AY;
import X.C2188811AlT;
import X.C2191401Ape;
import X.C2191431Aph;
import X.C675200Qe6;
import X.EnumC994770bzf;
import X.EnumC994780bzg;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AwS1S1400200_34 extends C09AY implements Function0 {
    public final int $t;
    public long j5;
    public long j6;
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

    public static final Object invoke$0(AwS1S1400200_34 awS1S1400200_34) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PUT_NEW mode=");
        sbLIZ.append((EnumC994780bzg) awS1S1400200_34.l1);
        sbLIZ.append(" keyType=");
        C2191401Ape c2191401Ape = (C2191401Ape) awS1S1400200_34.l2;
        List list = (List) awS1S1400200_34.l3;
        c2191401Ape.getClass();
        sbLIZ.append(C2191401Ape.LJI(list));
        sbLIZ.append(" key=");
        sbLIZ.append(awS1S1400200_34.s0);
        sbLIZ.append(" keyParams=");
        sbLIZ.append((List) awS1S1400200_34.l3);
        sbLIZ.append(" expireAt=");
        sbLIZ.append(awS1S1400200_34.j5);
        sbLIZ.append(" ttl=");
        sbLIZ.append(awS1S1400200_34.j5 - awS1S1400200_34.j6);
        sbLIZ.append(" deferred=");
        sbLIZ.append(System.identityHashCode((C05XL) awS1S1400200_34.l4));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS1S1400200_34 awS1S1400200_34) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PUT_NEW path=concurrent mode=");
        sbLIZ.append((EnumC994780bzg) awS1S1400200_34.l1);
        sbLIZ.append(" keyType=");
        C2191401Ape c2191401Ape = (C2191401Ape) awS1S1400200_34.l2;
        List list = (List) awS1S1400200_34.l3;
        c2191401Ape.getClass();
        sbLIZ.append(C2191401Ape.LJI(list));
        sbLIZ.append(" key=");
        sbLIZ.append(awS1S1400200_34.s0);
        sbLIZ.append(" keyParams=");
        sbLIZ.append((List) awS1S1400200_34.l3);
        sbLIZ.append(" expireAt=");
        sbLIZ.append(awS1S1400200_34.j5);
        sbLIZ.append(" ttl=");
        sbLIZ.append(awS1S1400200_34.j5 - awS1S1400200_34.j6);
        sbLIZ.append(" deferred=");
        sbLIZ.append(System.identityHashCode((C05XL) awS1S1400200_34.l4));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS1S1400200_34 awS1S1400200_34) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PUT_NEW path=concurrent domain=");
        sbLIZ.append(((C675200Qe6) awS1S1400200_34.l1).LIZ);
        sbLIZ.append(" mode=");
        sbLIZ.append((EnumC994770bzf) awS1S1400200_34.l2);
        sbLIZ.append(" keyType=");
        C2191431Aph c2191431Aph = C2191431Aph.LIZ;
        List list = (List) awS1S1400200_34.l3;
        c2191431Aph.getClass();
        sbLIZ.append(C2191431Aph.LJ(list));
        sbLIZ.append(" key=");
        sbLIZ.append(awS1S1400200_34.s0);
        sbLIZ.append(" keyParams=");
        sbLIZ.append((List) awS1S1400200_34.l3);
        sbLIZ.append(" expireAt=");
        sbLIZ.append(awS1S1400200_34.j5);
        sbLIZ.append(" ttl=");
        sbLIZ.append(awS1S1400200_34.j5 - awS1S1400200_34.j6);
        sbLIZ.append(" deferred=");
        sbLIZ.append(System.identityHashCode((C05XL) awS1S1400200_34.l4));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S1400200_34(C675200Qe6 c675200Qe6, EnumC994770bzf enumC994770bzf, List list, String str, long j, long j2, C099F c099f, int i) {
        super(0);
        this.$t = i;
        this.l1 = c675200Qe6;
        this.l2 = enumC994770bzf;
        this.l3 = list;
        this.s0 = str;
        this.j5 = j;
        this.j6 = j2;
        this.l4 = c099f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S1400200_34(EnumC994780bzg enumC994780bzg, C2191401Ape c2191401Ape, List list, String str, long j, long j2, C099F c099f, int i) {
        super(0);
        this.$t = i;
        this.l1 = enumC994780bzg;
        this.l2 = c2191401Ape;
        this.l3 = list;
        this.s0 = str;
        this.j5 = j;
        this.j6 = j2;
        this.l4 = c099f;
    }
}
