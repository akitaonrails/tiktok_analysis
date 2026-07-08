package kotlin.jvm.internal;

import X.C09AY;
import X.C20441214yg;
import X.C2188811AlT;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class AwS48S0001000_3 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1005i0;

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
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS48S0001000_3 awS48S0001000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroy tracknode: ");
        sbLIZ.append(awS48S0001000_3.f1005i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS48S0001000_3 awS48S0001000_3) {
        return Integer.valueOf(awS48S0001000_3.f1005i0);
    }

    public static final Object invoke$2(AwS48S0001000_3 awS48S0001000_3) {
        return Integer.valueOf(awS48S0001000_3.f1005i0);
    }

    public static final Object invoke$3(AwS48S0001000_3 awS48S0001000_3) {
        return Integer.valueOf(awS48S0001000_3.f1005i0);
    }

    public static final Object invoke$4(AwS48S0001000_3 awS48S0001000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseMixRefreshRepo: [PATH-3] onComplete fallback: state=StartRendering with chunkIndex=");
        sbLIZ.append(awS48S0001000_3.f1005i0);
        sbLIZ.append(", update to Success");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS48S0001000_3 awS48S0001000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request to fetch cache request_count=");
        sbLIZ.append(awS48S0001000_3.f1005i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS48S0001000_3 awS48S0001000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAfterSponsor achieved ");
        sbLIZ.append(awS48S0001000_3.f1005i0);
        sbLIZ.append(' ');
        C20441214yg.LJIIIZ("LiveNewSpecialGiftWidget", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS48S0001000_3 awS48S0001000_3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("count failed with groupId:");
        sbLIZ.append(awS48S0001000_3.f1005i0);
        sbLIZ.append('!');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S0001000_3(int i, int i2) {
        super(0);
        this.$t = i2;
        this.f1005i0 = i;
    }
}
