package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class AwS13S1000100_28 extends C09AY implements Function0 {
    public final int $t;
    public long j1;
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

    public static final Object invoke$0(AwS13S1000100_28 awS13S1000100_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[S3] scheduleNext reason=");
        sbLIZ.append(awS13S1000100_28.s0);
        sbLIZ.append(" delayMs=");
        sbLIZ.append(awS13S1000100_28.j1);
        sbLIZ.append(" no active hour after inactive deadline");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS13S1000100_28 awS13S1000100_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[S3] scheduleNext reason=");
        sbLIZ.append(awS13S1000100_28.s0);
        sbLIZ.append(" delayMs=");
        sbLIZ.append(awS13S1000100_28.j1);
        sbLIZ.append(" expectedPushAt=");
        sbLIZ.append(System.currentTimeMillis() + awS13S1000100_28.j1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S1000100_28(String str, long j, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.j1 = j;
    }
}
