package kotlin.jvm.internal;

import X.C09AY;
import X.C1352910lJJ;
import X.C1353820lKm;
import X.C291001Au;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS36S0000100_21 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS36S0000100_21(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS36S0000100_21 awS36S0000100_21, Object obj) {
        return C1352910lJJ.LIZ((C1352910lJJ) obj, null, null, new C291001Au(Long.valueOf(awS36S0000100_21.j0)), null, false, 119);
    }

    public static final Object invoke$1(AwS36S0000100_21 awS36S0000100_21, Object obj) {
        return C1353820lKm.LIZ((C1353820lKm) obj, null, null, false, null, new C291001Au(Long.valueOf(awS36S0000100_21.j0)), null, 223);
    }
}
