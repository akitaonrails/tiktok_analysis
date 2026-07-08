package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS61S0010000_18 extends C09AY implements Function0 {
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
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS61S0010000_18 awS61S0010000_18) {
        return Boolean.valueOf(awS61S0010000_18.z0);
    }

    public static final Object invoke$1(AwS61S0010000_18 awS61S0010000_18) {
        return Boolean.valueOf(awS61S0010000_18.z0);
    }

    public static final Object invoke$10(AwS61S0010000_18 awS61S0010000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadSuccess: (isPreload: ");
        sbLIZ.append(awS61S0010000_18.z0);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$11(AwS61S0010000_18 awS61S0010000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRuntimeReady: (isPreload: ");
        sbLIZ.append(awS61S0010000_18.z0);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS61S0010000_18 awS61S0010000_18) {
        return Boolean.valueOf(awS61S0010000_18.z0);
    }

    public static final Object invoke$3(AwS61S0010000_18 awS61S0010000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("backgroundContainer dispatchTouchEvent:");
        sbLIZ.append(awS61S0010000_18.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS61S0010000_18 awS61S0010000_18) {
        return Boolean.valueOf(awS61S0010000_18.z0);
    }

    public static final Object invoke$5(AwS61S0010000_18 awS61S0010000_18) {
        return Boolean.valueOf(awS61S0010000_18.z0);
    }

    public static final Object invoke$6(AwS61S0010000_18 awS61S0010000_18) {
        return Boolean.valueOf(awS61S0010000_18.z0);
    }

    public static final Object invoke$7(AwS61S0010000_18 awS61S0010000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("backgroundContainer dispatchTouchEvent:");
        sbLIZ.append(awS61S0010000_18.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS61S0010000_18 awS61S0010000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Portrait] isDataSensitive=");
        sbLIZ.append(awS61S0010000_18.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS61S0010000_18 awS61S0010000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Portrait] isPoorNetworkUser=");
        sbLIZ.append(awS61S0010000_18.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS61S0010000_18(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
