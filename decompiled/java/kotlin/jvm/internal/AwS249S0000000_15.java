package kotlin.jvm.internal;

import X.C09AY;
import X.C1338270kvh;
import X.C1623606Xi;
import X.C20441214yg;
import X.C2188811AlT;
import X.C490701vd;
import X.C935540aS8;
import X.C983460bhQ;
import com.bytedance.android.live.liveinteract.multimatch.clientai.CoHostFriendNoticeService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS249S0000000_15 extends C09AY implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS249S0000000_15(int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS249S0000000_15(CoHostFriendNoticeService coHostFriendNoticeService, int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AwS249S0000000_15 awS249S0000000_15, Object obj) {
        return C490701vd.LIZ((C490701vd) obj, 0L, null, null, new C1623606Xi(new Object() { // from class: X.0aXe
        }), null, null, 55);
    }

    public static final Object invoke$1(AwS249S0000000_15 awS249S0000000_15, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showChooseModePanelDirectly");
        sbLIZ.append(", request match prepare api failed");
        C20441214yg.LJFF("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ), (Throwable) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS249S0000000_15 awS249S0000000_15, Object obj) {
        return C935540aS8.LIZ((C935540aS8) obj, false, false, null, null, null, false, 67);
    }

    public static final Object invoke$3(AwS249S0000000_15 awS249S0000000_15, Object obj) {
        Map<String, Object> map = C1338270kvh.LIZ;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS249S0000000_15 awS249S0000000_15, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStateTransitCountdownStart");
        sbLIZ.append(", countdownTime = ");
        sbLIZ.append(((C983460bhQ) obj).LJ);
        C20441214yg.LJIIIZ("CompetitionStatePunishing", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS249S0000000_15(int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
    }
}
