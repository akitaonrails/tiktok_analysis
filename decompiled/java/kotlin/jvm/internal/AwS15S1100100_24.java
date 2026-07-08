package kotlin.jvm.internal;

import X.AbstractC725510Sd3;
import X.C09AY;
import X.C725430Scv;
import X.C725490Sd1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS15S1100100_24 extends C09AY implements Function0 {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
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

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS15S1100100_24 awS15S1100100_24) {
        C725430Scv.LIZ.put(new C725490Sd1((AbstractC725510Sd3) awS15S1100100_24.l1, awS15S1100100_24.s0), Long.valueOf(awS15S1100100_24.j2));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS15S1100100_24 awS15S1100100_24) {
        C725430Scv.LIZ.put(new C725490Sd1((AbstractC725510Sd3) awS15S1100100_24.l1, awS15S1100100_24.s0), Long.valueOf(awS15S1100100_24.j2));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS15S1100100_24 awS15S1100100_24) {
        C725430Scv.LIZ.put(new C725490Sd1((AbstractC725510Sd3) awS15S1100100_24.l1, awS15S1100100_24.s0), Long.valueOf(awS15S1100100_24.j2));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S1100100_24(AbstractC725510Sd3 abstractC725510Sd3, String str, long j, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC725510Sd3;
        this.s0 = str;
        this.j2 = j;
    }
}
