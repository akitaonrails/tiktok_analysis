package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AwS20S2000000_23 extends C09AY implements Function1 {
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

    public static final Object invoke$0(AwS20S2000000_23 awS20S2000000_23, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resolveSource ok: from=");
        sbLIZ.append(awS20S2000000_23.s0);
        sbLIZ.append(", to=");
        sbLIZ.append(awS20S2000000_23.s1);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS20S2000000_23 awS20S2000000_23, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchResourceToLocalFile ok: url=");
        sbLIZ.append(awS20S2000000_23.s0);
        sbLIZ.append(", target=");
        sbLIZ.append(awS20S2000000_23.s1);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S2000000_23(String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
