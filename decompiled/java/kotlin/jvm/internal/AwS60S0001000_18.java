package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS60S0001000_18 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1019i0;

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

    public static final Object invoke$0(AwS60S0001000_18 awS60S0001000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load more complete, shouldFetchMoreWhenFirstFetch, cursor = ");
        sbLIZ.append(awS60S0001000_18.f1019i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS60S0001000_18 awS60S0001000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load more complete, page hasMore, cursor = ");
        sbLIZ.append(awS60S0001000_18.f1019i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS60S0001000_18 awS60S0001000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageContentScrolled, ");
        sbLIZ.append(awS60S0001000_18.f1019i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS60S0001000_18 awS60S0001000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageHeaderScrolled, ");
        sbLIZ.append(awS60S0001000_18.f1019i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS60S0001000_18 awS60S0001000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashComposeComponentModel onRegisterCell contentType: ");
        sbLIZ.append(awS60S0001000_18.f1019i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS60S0001000_18 awS60S0001000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyFooterRealHeightChanged newHeight:");
        sbLIZ.append(awS60S0001000_18.f1019i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS60S0001000_18(int i, int i2) {
        super(0);
        this.$t = i2;
        this.f1019i0 = i;
    }
}
