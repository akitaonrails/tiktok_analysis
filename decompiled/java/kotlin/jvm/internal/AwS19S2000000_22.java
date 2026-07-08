package kotlin.jvm.internal;

import X.C09AY;
import X.C13BV;
import X.C1416070mxB;
import X.C1418670n1N;
import X.C1426550nE5;
import X.C2097608Jq;
import X.C375830EoP;
import X.EnumC1416050mx9;
import X.EnumC1426980nEm;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS19S2000000_22 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS19S2000000_22 awS19S2000000_22, Object obj) {
        return C1426550nE5.LIZ((C1426550nE5) obj, Boolean.TRUE, EnumC1426980nEm.LOADING, C13BV.INSTANCE, 0, true, false, null, awS19S2000000_22.s0, awS19S2000000_22.s1, null, null, new C375830EoP(Unit.LIZ), 6149);
    }

    public static final Object invoke$1(AwS19S2000000_22 awS19S2000000_22, Object obj) {
        C1418670n1N c1418670n1N = (C1418670n1N) obj;
        C1416070mxB c1416070mxB = c1418670n1N.LJIJJ.get(awS19S2000000_22.s0);
        if (c1416070mxB != null && c1416070mxB.LIZ == EnumC1416050mx9.LOADING) {
            return C1418670n1N.LIZ(c1418670n1N, null, null, false, false, false, null, null, null, null, null, null, false, 0, C2097608Jq.LJIILIIL(c1418670n1N.LJIJJ, new Pair(awS19S2000000_22.s0, C1416070mxB.LIZ(c1416070mxB, EnumC1416050mx9.FAILED, awS19S2000000_22.s1, false, 0.0f, 0.0f, 0.0f, false, 124))), false, 3145727);
        }
        return c1418670n1N;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S2000000_22(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
