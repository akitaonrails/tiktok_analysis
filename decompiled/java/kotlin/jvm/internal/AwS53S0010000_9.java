package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.C09AY;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1440005kM;
import X.C1902940zcS;
import X.C1906580ziK;
import X.C1BWL;
import X.C2188811AlT;
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS53S0010000_9 extends C09AY implements Function0 {
    public final int $t;
    public boolean z0;

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
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS53S0010000_9 awS53S0010000_9) {
        int i;
        Activity activityLIZIZ;
        Activity activityLIZ;
        if (awS53S0010000_9.z0) {
            i = 2131828351;
        } else {
            i = 2131828935;
        }
        String string = C1BWL.LIZ().getString(i);
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$1(AwS53S0010000_9 awS53S0010000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runIntelligencePopupTaskAsync.success: show = ");
        sbLIZ.append(awS53S0010000_9.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS53S0010000_9 awS53S0010000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runIntelligencePopupTaskAsync.success: show = ");
        sbLIZ.append(awS53S0010000_9.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS53S0010000_9 awS53S0010000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("when edge speed up, disableSeekTouch = ");
        sbLIZ.append(awS53S0010000_9.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS53S0010000_9 awS53S0010000_9) {
        C1440005kM.LIZ(new C1902940zcS(9, 3, awS53S0010000_9.z0 ? 1 : 0, null));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS53S0010000_9 awS53S0010000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isUserIntercepted ");
        sbLIZ.append(awS53S0010000_9.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS53S0010000_9(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
