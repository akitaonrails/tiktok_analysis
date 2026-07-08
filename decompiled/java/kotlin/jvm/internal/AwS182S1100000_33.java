package kotlin.jvm.internal;

import X.C09AY;
import X.C1A5B;
import X.C2185481Ag6;
import X.C2188811AlT;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public class AwS182S1100000_33 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
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

    public static final Object invoke$0(AwS182S1100000_33 awS182S1100000_33) {
        ((C2185481Ag6) awS182S1100000_33.l1).LIZIZ(awS182S1100000_33.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS182S1100000_33 awS182S1100000_33) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getHeroName, aid: ");
        sbLIZ.append(awS182S1100000_33.s0);
        sbLIZ.append(", heroTag: ");
        sbLIZ.append(((C1A5B) awS182S1100000_33.l1).LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS182S1100000_33 awS182S1100000_33) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRelatedTagWithHeroId, aid: ");
        sbLIZ.append(awS182S1100000_33.s0);
        sbLIZ.append(", heroTag: ");
        sbLIZ.append(((C1A5B) awS182S1100000_33.l1).LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS182S1100000_33(String str, C1A5B c1a5b, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1a5b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS182S1100000_33(String str, C2185481Ag6 c2185481Ag6, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c2185481Ag6;
    }
}
