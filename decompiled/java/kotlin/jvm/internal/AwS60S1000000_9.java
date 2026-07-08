package kotlin.jvm.internal;

import X.C09AY;
import X.C0OFR;
import X.C0OLM;
import X.C0OWY;
import X.C0P3X;
import X.C1623606Xi;
import X.C291001Au;
import X.C491001vg;
import X.C607520NsE;
import X.C608930NuV;
import X.C612580O0y;
import X.C618290OMx;
import X.C618380ONg;
import X.C620540OVo;
import X.C629660Omq;
import X.C631690Oq7;
import X.C631970OqZ;
import X.C731530Sml;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.inbox.bulletin.voice.BulletinVoicePlayedStore;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.vibefeed.clientai.cache.VibeIntentScoreIndex;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS60S1000000_9 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS60S1000000_9(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        String str = awS60S1000000_9.s0;
        obj.getClass();
        return new C608930NuV(str);
    }

    public static final Object invoke$1(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        return C731530Sml.LIZ((C731530Sml) obj, null, null, null, new C291001Au(awS60S1000000_9.s0), null, null, null, 119);
    }

    public static final Object invoke$10(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        return C0OFR.LIZ((C0OFR) obj, null, awS60S1000000_9.s0, false, 13);
    }

    public static final Object invoke$11(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        return C0P3X.LIZ((C0P3X) obj, awS60S1000000_9.s0, false, null, true, null, null, null, null, null, null, null, null, 4086);
    }

    public static final Object invoke$12(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        return C0P3X.LIZ((C0P3X) obj, awS60S1000000_9.s0, true, null, false, null, null, null, null, null, null, null, null, 4084);
    }

    public static final Object invoke$13(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        return C620540OVo.LIZ((C620540OVo) obj, null, new C291001Au(awS60S1000000_9.s0), null, null, null, false, null, 125);
    }

    public static final Object invoke$14(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        return C620540OVo.LIZ((C620540OVo) obj, null, null, null, null, null, false, awS60S1000000_9.s0, 63);
    }

    public static final Object invoke$15(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        return C629660Omq.LIZ((C629660Omq) obj, null, 0, 0, 0, null, awS60S1000000_9.s0, 127);
    }

    public static final Object invoke$16(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        return new C612580O0y(awS60S1000000_9.s0, 2);
    }

    public static final Object invoke$17(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        return C0OWY.LIZ((C0OWY) obj, null, null, null, null, null, awS60S1000000_9.s0, null, null, 223);
    }

    public static final Object invoke$2(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        C291001Au c291001Au = new C291001Au(Boolean.FALSE);
        C291001Au c291001Au2 = new C291001Au(awS60S1000000_9.s0);
        obj.getClass();
        return new C0OLM(c291001Au, c291001Au2);
    }

    public static final Object invoke$3(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        return C618380ONg.LIZ((C618380ONg) obj, new C1623606Xi(awS60S1000000_9.s0), null, null, false, 14);
    }

    public static final Object invoke$4(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        return C618290OMx.LIZ((C618290OMx) obj, new C491001vg(new Throwable(awS60S1000000_9.s0)), null, 2);
    }

    public static final Object invoke$5(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((BulletinVoicePlayedStore.Entry) obj).sourceId, awS60S1000000_9.s0));
    }

    public static final Object invoke$6(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        return C631690Oq7.LIZ((C631690Oq7) obj, null, false, new C291001Au(awS60S1000000_9.s0), 3);
    }

    public static final Object invoke$7(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        return C631970OqZ.LIZ((C631970OqZ) obj, false, new C291001Au(awS60S1000000_9.s0), 1);
    }

    public static final Object invoke$8(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        C607520NsE.LIZ.getClass();
        ((CopyOnWriteArraySet) C607520NsE.LIZJ.getValue()).add(awS60S1000000_9.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS60S1000000_9 awS60S1000000_9, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((VibeIntentScoreIndex.IndexItem) obj).storageKey, awS60S1000000_9.s0));
    }
}
