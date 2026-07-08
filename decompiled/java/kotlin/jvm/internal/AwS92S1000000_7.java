package kotlin.jvm.internal;

import X.AbstractC1387200mCc;
import X.C09AY;
import X.C0IJT;
import X.C0K77;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1906580ziK;
import X.C474500IjA;
import X.C511430K3x;
import android.app.Activity;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class AwS92S1000000_7 extends C09AY implements Function0 {
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
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS92S1000000_7 awS92S1000000_7) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            String str = awS92S1000000_7.s0;
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
            c1389890mGx.LJII(R.attr.ee);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS92S1000000_7 awS92S1000000_7) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_entrance_show");
        c474500IjALIZ.LJJII("hashtag", "enter_from");
        c474500IjALIZ.LJJII("hashtag", "live_entrance_name");
        c474500IjALIZ.LJJII(awS92S1000000_7.s0, "entrance_room_id");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS92S1000000_7 awS92S1000000_7) {
        return Boolean.valueOf(Intrinsics.LJFF(awS92S1000000_7.s0, "click"));
    }

    public static final Object invoke$11(AwS92S1000000_7 awS92S1000000_7) {
        return Boolean.valueOf(Intrinsics.LJFF(awS92S1000000_7.s0, "click"));
    }

    public static final Object invoke$12(AwS92S1000000_7 awS92S1000000_7) {
        return Boolean.valueOf(Intrinsics.LJFF(awS92S1000000_7.s0, "click"));
    }

    public static final Object invoke$13(AwS92S1000000_7 awS92S1000000_7) {
        return Boolean.valueOf(Intrinsics.LJFF(awS92S1000000_7.s0, "click"));
    }

    public static final Object invoke$14(AwS92S1000000_7 awS92S1000000_7) {
        return Boolean.valueOf(Intrinsics.LJFF(awS92S1000000_7.s0, "click"));
    }

    public static final Object invoke$15(AwS92S1000000_7 awS92S1000000_7) {
        return Boolean.valueOf(Intrinsics.LJFF(awS92S1000000_7.s0, "drag"));
    }

    public static final Object invoke$16(AwS92S1000000_7 awS92S1000000_7) {
        return Boolean.valueOf(Intrinsics.LJFF(awS92S1000000_7.s0, "drag"));
    }

    public static final Object invoke$17(AwS92S1000000_7 awS92S1000000_7) {
        return Boolean.valueOf(Intrinsics.LJFF(awS92S1000000_7.s0, "drag"));
    }

    public static final Object invoke$18(AwS92S1000000_7 awS92S1000000_7) {
        C511430K3x c511430K3x = C511430K3x.LIZ;
        String str = awS92S1000000_7.s0;
        c511430K3x.getClass();
        C0K77 c0k77LJ = C511430K3x.LJ();
        if (c0k77LJ != null) {
            return c0k77LJ.LJJIIJZLJL(str);
        }
        return null;
    }

    public static final Object invoke$2(AwS92S1000000_7 awS92S1000000_7) {
        return Boolean.valueOf(Intrinsics.LJFF(awS92S1000000_7.s0, "click"));
    }

    public static final Object invoke$3(AwS92S1000000_7 awS92S1000000_7) {
        return Boolean.valueOf(Intrinsics.LJFF(awS92S1000000_7.s0, "click"));
    }

    public static final Object invoke$4(AwS92S1000000_7 awS92S1000000_7) {
        return Boolean.valueOf(Intrinsics.LJFF(awS92S1000000_7.s0, "submit"));
    }

    public static final Object invoke$5(AwS92S1000000_7 awS92S1000000_7) {
        return Boolean.valueOf(Intrinsics.LJFF(awS92S1000000_7.s0, "submit"));
    }

    public static final Object invoke$6(AwS92S1000000_7 awS92S1000000_7) {
        return Boolean.valueOf(Intrinsics.LJFF(awS92S1000000_7.s0, "click"));
    }

    public static final Object invoke$7(AwS92S1000000_7 awS92S1000000_7) {
        return Boolean.valueOf(Intrinsics.LJFF(awS92S1000000_7.s0, "click"));
    }

    public static final Object invoke$8(AwS92S1000000_7 awS92S1000000_7) {
        boolean z;
        if (!Intrinsics.LJFF(awS92S1000000_7.s0, "close") && !Intrinsics.LJFF(awS92S1000000_7.s0, "confirm")) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$9(AwS92S1000000_7 awS92S1000000_7) {
        return Boolean.valueOf(Intrinsics.LJFF(awS92S1000000_7.s0, "click"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS92S1000000_7(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
