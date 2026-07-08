package kotlin.jvm.internal;

import X.AbstractC725510Sd3;
import X.C09AY;
import X.C1555620qaG;
import X.C725430Scv;
import X.C725480Sd0;
import X.C725490Sd1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AwS2S1110100_24 extends C09AY implements Function0 {
    public final int $t;
    public long j3;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS2S1110100_24 awS2S1110100_24) {
        Long lRemove = C725430Scv.LIZ.remove(new C725490Sd1((AbstractC725510Sd3) awS2S1110100_24.l1, awS2S1110100_24.s0));
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            if (C725480Sd0.LIZ((AbstractC725510Sd3) awS2S1110100_24.l1)) {
                long j = awS2S1110100_24.j3 - jLongValue;
                C1555620qaG c1555620qaG = new C1555620qaG("activity");
                boolean z = awS2S1110100_24.z2;
                c1555620qaG.LIZ = j;
                c1555620qaG.LIZIZ = z;
                C725480Sd0.LIZIZ((AbstractC725510Sd3) awS2S1110100_24.l1, c1555620qaG);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS2S1110100_24 awS2S1110100_24) {
        Long lRemove = C725430Scv.LIZ.remove(new C725490Sd1((AbstractC725510Sd3) awS2S1110100_24.l1, awS2S1110100_24.s0));
        if (lRemove != null) {
            long jLongValue = lRemove.longValue();
            if (C725480Sd0.LIZ((AbstractC725510Sd3) awS2S1110100_24.l1)) {
                long j = awS2S1110100_24.j3 - jLongValue;
                C1555620qaG c1555620qaG = new C1555620qaG("fragment");
                boolean z = awS2S1110100_24.z2;
                c1555620qaG.LIZ = j;
                c1555620qaG.LIZIZ = z;
                C725480Sd0.LIZIZ((AbstractC725510Sd3) awS2S1110100_24.l1, c1555620qaG);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S1110100_24(AbstractC725510Sd3 abstractC725510Sd3, String str, long j, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC725510Sd3;
        this.s0 = str;
        this.j3 = j;
        this.z2 = z;
    }
}
