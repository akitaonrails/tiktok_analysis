package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AwS89S1000000_4 extends C09AY implements Function0 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return this.s0;
            case 1:
                return this.s0;
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return this.s0;
            default:
                return null;
        }
    }

    public static final Object invoke$2(AwS89S1000000_4 awS89S1000000_4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("jsb_video_detail_");
        sbLIZ.append(awS89S1000000_4.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS89S1000000_4 awS89S1000000_4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("jsb_video_detail_");
        sbLIZ.append(awS89S1000000_4.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS89S1000000_4(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
