package kotlin.jvm.internal;

import X.C09AY;
import X.C1672250tcN;
import X.C935650aSJ;
import X.C948130amR;
import X.C948300ami;
import X.C953610avH;
import X.C953620avI;
import X.C953670avN;
import X.InterfaceC954910axN;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS30S0010000_15 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S0010000_15(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AwS30S0010000_15 awS30S0010000_15, Object obj) {
        float fLJI;
        float fFloatValue = ((Number) obj).floatValue();
        C953670avN c953670avN = C953610avH.LJJI;
        if (awS30S0010000_15.z0) {
            fLJI = 0.01f;
        } else {
            fLJI = C953620avI.LJI(fFloatValue);
        }
        c953670avN.getClass();
        C953610avH.LJJIIZI = fLJI;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS30S0010000_15 awS30S0010000_15, Object obj) {
        C935650aSJ c935650aSJ = (C935650aSJ) obj;
        return new C935650aSJ(awS30S0010000_15.z0, c935650aSJ.LLILLJJLI, c935650aSJ.LLILLL, c935650aSJ.LLILZ);
    }

    public static final Object invoke$2(AwS30S0010000_15 awS30S0010000_15, Object obj) {
        return C1672250tcN.LIZ((C1672250tcN) obj, null, awS30S0010000_15.z0, null, null, false, 1015);
    }

    public static final Object invoke$3(AwS30S0010000_15 awS30S0010000_15, Object obj) {
        ((InterfaceC954910axN) obj).LJIILIIL(String.valueOf(awS30S0010000_15.z0), "isInCohostWithGuest");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS30S0010000_15 awS30S0010000_15, Object obj) {
        C948130amR c948130amR = (C948130amR) obj;
        return C948130amR.LIZ(c948130amR, C948300ami.LIZ(c948130amR.LIZ, null, 0, awS30S0010000_15.z0, 0, false, false, 59), 0, 6);
    }

    public static final Object invoke$5(AwS30S0010000_15 awS30S0010000_15, Object obj) {
        C948130amR c948130amR = (C948130amR) obj;
        return C948130amR.LIZ(c948130amR, C948300ami.LIZ(c948130amR.LIZ, null, 0, awS30S0010000_15.z0, 0, false, false, 59), 0, 6);
    }

    public static final Object invoke$6(AwS30S0010000_15 awS30S0010000_15, Object obj) {
        C948130amR c948130amR = (C948130amR) obj;
        return C948130amR.LIZ(c948130amR, C948300ami.LIZ(c948130amR.LIZ, null, 0, awS30S0010000_15.z0, 0, false, false, 59), 0, 6);
    }
}
