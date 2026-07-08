package kotlin.jvm.internal;

import X.C09AY;
import X.C1420480n4I;
import X.C1439480nYw;
import X.C1440005kM;
import X.C1443230nez;
import X.C2188811AlT;
import X.C570490MZb;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS106S1000000_22 extends C09AY implements Function0 {
    public final int $t;
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
            case 3:
                return invoke$3(this);
            case 4:
                return this.s0;
            case 5:
                return invoke$5(this);
            case 6:
                return this.s0;
            case 7:
                return this.s0;
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS106S1000000_22 awS106S1000000_22) {
        IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("There is already a unified method for reporting this event ");
        sbLIZ.append(awS106S1000000_22.s0);
        sbLIZ.append(" . Please use the unified method for reporting. If you have any questions, you can contact fengminchao.");
        C2188811AlT.LIZIZ(sbLIZ);
        iToolsDebugGpService.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS106S1000000_22 awS106S1000000_22) {
        C1440005kM.LIZ(new C1439480nYw(awS106S1000000_22.s0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS106S1000000_22 awS106S1000000_22) {
        C1420480n4I c1420480n4I = C1420480n4I.LIZ;
        String str = awS106S1000000_22.s0;
        c1420480n4I.getClass();
        Pair pairLIZIZ = C1420480n4I.LIZIZ(str);
        if (((Number) pairLIZIZ.getFirst()).intValue() != 1) {
            return Unit.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("File path is ");
        sbLIZ.append(awS106S1000000_22.s0);
        sbLIZ.append(" but NLEResType is video, mimeType: ");
        sbLIZ.append((String) pairLIZIZ.getSecond());
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object invoke$3(AwS106S1000000_22 awS106S1000000_22) {
        C1420480n4I c1420480n4I = C1420480n4I.LIZ;
        String str = awS106S1000000_22.s0;
        c1420480n4I.getClass();
        Pair pairLIZIZ = C1420480n4I.LIZIZ(str);
        if (((Number) pairLIZIZ.getFirst()).intValue() != 100) {
            return Unit.LIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("File path is ");
        sbLIZ.append(awS106S1000000_22.s0);
        sbLIZ.append(" but NLEResType is image, mimeType: ");
        sbLIZ.append((String) pairLIZIZ.getSecond());
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object invoke$5(AwS106S1000000_22 awS106S1000000_22) {
        return C570490MZb.LIZJ(C1443230nez.LJIIIIZZ(awS106S1000000_22.s0));
    }

    public static final Object invoke$8(AwS106S1000000_22 awS106S1000000_22) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("query history terminates failed, excludeSessionId = ");
        sbLIZ.append(awS106S1000000_22.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS106S1000000_22(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
