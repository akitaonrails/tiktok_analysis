package kotlin.jvm.internal;

import X.C09AY;
import X.C13SD;
import X.C14XI;
import X.C1683090ttr;
import X.C20009813Qy;
import X.C2002607su;
import X.C20247714Kl;
import X.C20248414Ks;
import X.C291001Au;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceImageModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.model.TakoEntranceRequestInfo;
import com.ss.android.ugc.aweme.tako.router.model.TakoAutoSendData;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS80S1000000_30 extends C09AY implements Function1 {
    public final int $t;
    public String s0;

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
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS80S1000000_30(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS80S1000000_30 awS80S1000000_30, Object obj) {
        TakoEntranceRequestInfo takoEntranceRequestInfo;
        TakoAutoSendData takoAutoSendData = (TakoAutoSendData) obj;
        String str = awS80S1000000_30.s0;
        if (str != null) {
            takoEntranceRequestInfo = new TakoEntranceRequestInfo(str, null, null, null, null, null);
        } else {
            takoEntranceRequestInfo = null;
        }
        takoAutoSendData.setRequestInfo(takoEntranceRequestInfo);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS80S1000000_30 awS80S1000000_30, Object obj) throws IOException {
        C13SD c13sd = (C13SD) obj;
        byte[] bArrLIZ = C20009813Qy.LIZ(awS80S1000000_30.s0);
        c13sd.LIZIZ(bArrLIZ, bArrLIZ.length);
        c13sd.LIZ();
        c13sd.close();
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS80S1000000_30 awS80S1000000_30, Object obj) {
        return C1683090ttr.LIZ((C1683090ttr) obj, null, 0, false, 0, false, awS80S1000000_30.s0, null, null, null, 0, 991);
    }

    public static final Object invoke$11(AwS80S1000000_30 awS80S1000000_30, Object obj) {
        return C1683090ttr.LIZ((C1683090ttr) obj, null, 0, false, 0, false, null, awS80S1000000_30.s0, null, null, 0, 959);
    }

    public static final Object invoke$12(AwS80S1000000_30 awS80S1000000_30, Object obj) {
        return C1683090ttr.LIZ((C1683090ttr) obj, null, 0, false, 0, false, null, null, awS80S1000000_30.s0, null, 0, 895);
    }

    public static final Object invoke$13(AwS80S1000000_30 awS80S1000000_30, Object obj) {
        return C1683090ttr.LIZ((C1683090ttr) obj, null, 0, false, 0, false, awS80S1000000_30.s0, null, null, null, 0, 991);
    }

    public static final Object invoke$14(AwS80S1000000_30 awS80S1000000_30, Object obj) {
        return C1683090ttr.LIZ((C1683090ttr) obj, null, 0, false, 0, false, null, awS80S1000000_30.s0, null, null, 0, 959);
    }

    public static final Object invoke$15(AwS80S1000000_30 awS80S1000000_30, Object obj) {
        return C1683090ttr.LIZ((C1683090ttr) obj, null, 0, false, 0, false, null, null, awS80S1000000_30.s0, null, 0, 895);
    }

    public static final Object invoke$2(AwS80S1000000_30 awS80S1000000_30, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((EcomResourceImageModel) obj).scene, awS80S1000000_30.s0));
    }

    public static final Object invoke$3(AwS80S1000000_30 awS80S1000000_30, Object obj) {
        return C20247714Kl.LIZ((C20247714Kl) obj, new C291001Au(new C20248414Ks(true, awS80S1000000_30.s0)), null, 0, 0.0f, 0, 30);
    }

    public static final Object invoke$4(AwS80S1000000_30 awS80S1000000_30, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, awS80S1000000_30.s0));
    }

    public static final Object invoke$5(AwS80S1000000_30 awS80S1000000_30, Object obj) {
        return C14XI.LIZ((C14XI) obj, false, false, false, false, false, false, null, null, false, null, null, awS80S1000000_30.s0, null, 12287);
    }

    public static final Object invoke$6(AwS80S1000000_30 awS80S1000000_30, Object obj) {
        return C14XI.LIZ((C14XI) obj, false, false, false, false, false, false, null, null, false, awS80S1000000_30.s0, null, null, null, 15359);
    }

    public static final Object invoke$7(AwS80S1000000_30 awS80S1000000_30, Object obj) {
        TakoMixFeed takoMixFeed = (TakoMixFeed) obj;
        takoMixFeed.text = awS80S1000000_30.s0;
        takoMixFeed.cardType = 0;
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS80S1000000_30 awS80S1000000_30, Object obj) {
        TakoMixFeed takoMixFeed = (TakoMixFeed) obj;
        takoMixFeed.text = awS80S1000000_30.s0;
        takoMixFeed.cardType = 0;
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS80S1000000_30 awS80S1000000_30, Object obj) {
        String str = awS80S1000000_30.s0;
        obj.getClass();
        return new C2002607su(str);
    }
}
