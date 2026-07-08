package kotlin.jvm.internal;

import X.C09AY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C950220apo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AwS202S0000000_15 extends C09AY implements Function0 {
    public final int $t;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS202S0000000_15(int i) {
        super(0);
        this.$t = i;
    }

    public static final Object invoke$0(AwS202S0000000_15 awS202S0000000_15) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openChooseModePanel");
        sbLIZ.append(" cancel choose ");
        C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS202S0000000_15 awS202S0000000_15) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openChooseModePanelDirectly");
        sbLIZ.append(" cancel choose ");
        C20441214yg.LIZIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS202S0000000_15 awS202S0000000_15) {
        boolean zLIZ = C950220apo.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attach_base");
        sbLIZ.append(", canPreJoinChannel = ");
        sbLIZ.append(zLIZ);
        C20441214yg.LJIIIZ("MultiHostService", C2188811AlT.LIZIZ(sbLIZ));
        return Boolean.valueOf(zLIZ);
    }
}
