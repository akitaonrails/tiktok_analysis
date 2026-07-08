package kotlin.jvm.internal;

import X.C09AY;
import X.C2188811AlT;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectStrategyPreloadSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class AwS55S0010000_12 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS55S0010000_12 awS55S0010000_12) {
        return Boolean.valueOf(awS55S0010000_12.z0);
    }

    public static final Object invoke$1(AwS55S0010000_12 awS55S0010000_12) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchList -----> isRefresh: ");
        sbLIZ.append(awS55S0010000_12.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(AwS55S0010000_12 awS55S0010000_12) {
        return Boolean.valueOf(awS55S0010000_12.z0);
    }

    public static final Object invoke$2(AwS55S0010000_12 awS55S0010000_12) {
        boolean z;
        if (awS55S0010000_12.z0 && LiveEffectStrategyPreloadSetting.INSTANCE.withStrategy()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AwS55S0010000_12 awS55S0010000_12) {
        return Boolean.valueOf(awS55S0010000_12.z0);
    }

    public static final Object invoke$4(AwS55S0010000_12 awS55S0010000_12) {
        return Boolean.valueOf(awS55S0010000_12.z0);
    }

    public static final Object invoke$5(AwS55S0010000_12 awS55S0010000_12) {
        boolean z;
        if (awS55S0010000_12.z0 && LiveEffectStrategyPreloadSetting.INSTANCE.withStrategy()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$6(AwS55S0010000_12 awS55S0010000_12) {
        return Boolean.valueOf(!awS55S0010000_12.z0);
    }

    public static final Object invoke$7(AwS55S0010000_12 awS55S0010000_12) {
        return Boolean.valueOf(!awS55S0010000_12.z0);
    }

    public static final Object invoke$8(AwS55S0010000_12 awS55S0010000_12) {
        boolean z;
        if (awS55S0010000_12.z0 && LiveEffectStrategyPreloadSetting.INSTANCE.withStrategy()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$9(AwS55S0010000_12 awS55S0010000_12) {
        boolean z;
        if (awS55S0010000_12.z0 && LiveEffectStrategyPreloadSetting.INSTANCE.withStrategy()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S0010000_12(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
