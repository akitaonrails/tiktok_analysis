package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class AwS15S1001000_3 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS15S1001000_3 awS15S1001000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepoImpl-requestSortList, scene=");
        sbLIZ.append(awS15S1001000_3.s0);
        sbLIZ.append(", sourceAction=");
        sbLIZ.append(awS15S1001000_3.i1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS15S1001000_3 awS15S1001000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepoImpl-tryGetInternalShareSortedList, no cache scene=");
        sbLIZ.append(awS15S1001000_3.s0);
        sbLIZ.append(", sourceAction=");
        sbLIZ.append(awS15S1001000_3.i1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S1001000_3(String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.i1 = i;
    }
}
