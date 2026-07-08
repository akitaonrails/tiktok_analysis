package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAB;
import X.C18KG;
import X.C18KJ;
import X.C18KS;
import X.C190T;
import X.C190Z;
import X.C21196317xB;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C861800XrO;
import X.C957403oi;
import Y.ARunnableS36S1100000_32;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpComponentTracker;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageInfo;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpPageNode;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS82S1000000_32 extends C09AY implements Function1 {
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
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S1000000_32(int i) {
        super(1);
        this.$t = i;
        this.s0 = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S1000000_32(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        C21196317xB c21196317xB = C21196317xB.LIZ;
        String str = awS82S1000000_32.s0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("retry ");
        sbLIZ.append(((Throwable) obj).getMessage());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c21196317xB.getClass();
        C21196317xB.LIZLLL(str, strLIZIZ, true, false);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        ((C0LAB) obj).LJ("click_area", awS82S1000000_32.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        ((LaneParams) obj).plusAssign("module_name", awS82S1000000_32.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi.LIZLLL("popup_name", awS82S1000000_32.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        FcpComponentTracker tracker = ((FcpPageNode) obj).getTracker();
        if (tracker != null) {
            tracker.markPositive(awS82S1000000_32.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        FcpComponentTracker tracker = ((FcpPageNode) obj).getTracker();
        if (tracker != null) {
            tracker.markPositive(awS82S1000000_32.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        String componentKey;
        FcpComponentTracker tracker = ((FcpPageNode) obj).getTracker();
        if (tracker != null) {
            componentKey = tracker.getComponentKey();
        } else {
            componentKey = null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(componentKey, awS82S1000000_32.s0));
    }

    public static final Object invoke$15(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        FcpPageNode second;
        FcpComponentTracker tracker;
        FcpPageInfo fcpPageInfo = (FcpPageInfo) obj;
        Pair<Integer, FcpPageNode> pairLIZLLL = C18KG.LIZ.LIZLLL(new AwS611S0100000_32(fcpPageInfo, 340));
        if (pairLIZLLL != null && (second = pairLIZLLL.getSecond()) != null && (tracker = second.getTracker()) != null) {
            tracker.pause();
        }
        C18KS c18ks = C18KJ.LJ;
        String str = awS82S1000000_32.s0;
        c18ks.getClass();
        ARunnableS36S1100000_32 aRunnableS36S1100000_32 = new ARunnableS36S1100000_32(fcpPageInfo, str, 7);
        C786410Ut5.LJLIIL(700L, c18ks.LIZ, aRunnableS36S1100000_32);
        c18ks.LIZIZ = aRunnableS36S1100000_32;
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch template success: ");
        sbLIZ.append(awS82S1000000_32.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Can not get channelPrefix: ");
        sbLIZ.append(awS82S1000000_32.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("git GeckoModel failed：");
        sbLIZ.append(awS82S1000000_32.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get GeckoModel failed：");
        sbLIZ.append(awS82S1000000_32.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        C861800XrO c861800XrO;
        C190T c190t = (C190T) obj;
        String str = awS82S1000000_32.s0;
        if (str != null) {
            c861800XrO = new C861800XrO(str);
        } else {
            c861800XrO = null;
        }
        return C190T.LJII(c190t, 0, false, false, c861800XrO, null, null, 955);
    }

    public static final Object invoke$20(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        obj.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch gecko failed:MynaGeckoLoaderHelper ,url:");
        sbLIZ.append(awS82S1000000_32.s0);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        return C190T.LJII((C190T) obj, 0, false, false, new C861800XrO(awS82S1000000_32.s0), null, null, 959);
    }

    public static final Object invoke$4(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        return C190T.LJII((C190T) obj, 0, false, false, null, awS82S1000000_32.s0, null, 895);
    }

    public static final Object invoke$5(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        return C190T.LJII((C190T) obj, 0, false, false, null, awS82S1000000_32.s0, null, 895);
    }

    public static final Object invoke$6(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        return C190Z.LJFF((C190Z) obj, 0, false, false, new C861800XrO(awS82S1000000_32.s0), false, 447);
    }

    public static final Object invoke$7(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        ((HashMap) obj).put("schema", awS82S1000000_32.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        ((LaneParams) obj).plusAssign("shop_cart_schema", awS82S1000000_32.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS82S1000000_32 awS82S1000000_32, Object obj) {
        ((LaneParams) obj).plusAssign("shop_cart_schema", awS82S1000000_32.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S1000000_32(String str, Throwable th, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }
}
