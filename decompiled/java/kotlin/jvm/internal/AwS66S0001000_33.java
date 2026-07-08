package kotlin.jvm.internal;

import X.C09AY;
import X.C1ATJ;
import X.C632670Orh;
import android.graphics.Paint;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public class AwS66S0001000_33 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1025i0;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS66S0001000_33 awS66S0001000_33) {
        ((C1ATJ) LivePitayaEnv.LJIIL()).restart(awS66S0001000_33.f1025i0);
        LivePitayaEnv.LJIILJJIL();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS66S0001000_33 awS66S0001000_33) {
        C632670Orh.LIZ(awS66S0001000_33.f1025i0);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS66S0001000_33 awS66S0001000_33) {
        C632670Orh.LIZ(awS66S0001000_33.f1025i0);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS66S0001000_33 awS66S0001000_33) {
        C632670Orh.LIZ(awS66S0001000_33.f1025i0);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS66S0001000_33 awS66S0001000_33) {
        C632670Orh.LIZ(awS66S0001000_33.f1025i0);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS66S0001000_33 awS66S0001000_33) {
        C632670Orh.LIZ(awS66S0001000_33.f1025i0);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS66S0001000_33 awS66S0001000_33) {
        int i = awS66S0001000_33.f1025i0;
        boolean z = true;
        if (1 > i || i >= 4) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$15(AwS66S0001000_33 awS66S0001000_33) {
        int i = awS66S0001000_33.f1025i0;
        boolean z = true;
        if (1 > i || i >= 4) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS66S0001000_33 awS66S0001000_33) {
        C632670Orh.LIZ(awS66S0001000_33.f1025i0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS66S0001000_33 awS66S0001000_33) {
        C632670Orh.LIZ(awS66S0001000_33.f1025i0);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS66S0001000_33 awS66S0001000_33) {
        CpusetManager.resetCoreBind(awS66S0001000_33.f1025i0);
        JatoXL.setPriority(awS66S0001000_33.f1025i0, 0);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS66S0001000_33 awS66S0001000_33) {
        C632670Orh.LIZ(awS66S0001000_33.f1025i0);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS66S0001000_33 awS66S0001000_33) {
        C632670Orh.LIZ(awS66S0001000_33.f1025i0);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS66S0001000_33 awS66S0001000_33) {
        C632670Orh.LIZ(awS66S0001000_33.f1025i0);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS66S0001000_33 awS66S0001000_33) {
        C632670Orh.LIZ(awS66S0001000_33.f1025i0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS66S0001000_33 awS66S0001000_33) {
        Paint paint = new Paint(1);
        paint.setColor(awS66S0001000_33.f1025i0);
        return paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS66S0001000_33(int i, int i2) {
        super(0);
        this.$t = i2;
        this.f1025i0 = i;
    }
}
