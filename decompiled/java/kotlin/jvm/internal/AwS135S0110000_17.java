package kotlin.jvm.internal;

import X.AbstractC1109720ez4;
import X.AbstractC1135650fet;
import X.C09AY;
import X.C1080120eDK;
import X.C1095910ecn;
import X.C1109810ezD;
import X.C1132570fZv;
import X.C1133890fc3;
import X.C1135590fen;
import X.C1135910ffJ;
import X.C1135920ffK;
import X.C1135930ffL;
import X.C497740JfY;
import X.EnumC1096020ecy;
import Y.ARunnableS36S0110000_17;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.dataChannel.GiftTrayPositionChangeEvent;
import com.bytedance.android.livesdk.gift.base.platform.business.tray.LiveGiftTrayWidgetV2;
import com.bytedance.android.livesdk.share.ShareSettingsDialog;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS135S0110000_17 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AwS135S0110000_17 awS135S0110000_17) {
        ((C1109810ezD) awS135S0110000_17.l0).LIZIZ.setMeasureListener(null);
        AwS561S0100000_17 awS561S0100000_17 = ((C1109810ezD) awS135S0110000_17.l0).LJIIL;
        if (awS561S0100000_17 != null) {
            awS561S0100000_17.invoke();
        }
        C1109810ezD c1109810ezD = (C1109810ezD) awS135S0110000_17.l0;
        HandlerHook.viewPost(c1109810ezD.LIZIZ, new ARunnableS36S0110000_17(c1109810ezD, awS135S0110000_17.z1, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS135S0110000_17 awS135S0110000_17) {
        if (!awS135S0110000_17.z1) {
            ((C1095910ecn) awS135S0110000_17.l0).LJJJJLI = false;
        }
        ((C1095910ecn) awS135S0110000_17.l0).LJJLIIIJJI.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS135S0110000_17 awS135S0110000_17) {
        ((AbstractC1109720ez4) awS135S0110000_17.l0).N5().setMeasureListener(null);
        HandlerHook.viewPost(((AbstractC1109720ez4) awS135S0110000_17.l0).N5(), new ARunnableS36S0110000_17((AbstractC1109720ez4) awS135S0110000_17.l0, awS135S0110000_17.z1, 5));
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS135S0110000_17 awS135S0110000_17) {
        C1132570fZv.LIZLLL(((C1133890fc3) awS135S0110000_17.l0).getContext(), "gift_pannel_banner", awS135S0110000_17.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS135S0110000_17 awS135S0110000_17) {
        Function1 function1 = (Function1) awS135S0110000_17.l0;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(awS135S0110000_17.z1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS135S0110000_17 awS135S0110000_17) {
        C1135930ffL c1135930ffL;
        ((C1135910ffJ) awS135S0110000_17.l0).getClass();
        if (!awS135S0110000_17.z1 && (c1135930ffL = ((C1135910ffJ) awS135S0110000_17.l0).LJFF) != null) {
            c1135930ffL.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS135S0110000_17 awS135S0110000_17) {
        C1135930ffL c1135930ffL;
        ((C1135910ffJ) awS135S0110000_17.l0).getClass();
        if (!awS135S0110000_17.z1 && (c1135930ffL = ((C1135910ffJ) awS135S0110000_17.l0).LJFF) != null) {
            c1135930ffL.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS135S0110000_17 awS135S0110000_17) {
        DataChannel dataChannel = ((LiveGiftTrayWidgetV2) awS135S0110000_17.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(GiftTrayPositionChangeEvent.class, Boolean.valueOf(awS135S0110000_17.z1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS135S0110000_17 awS135S0110000_17) {
        if (awS135S0110000_17.z1) {
            ((C1095910ecn) awS135S0110000_17.l0).LJII(EnumC1096020ecy.FANS_CLUB_UNJOIN);
        }
        ((C1095910ecn) awS135S0110000_17.l0).LJJLIIIJJI.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS135S0110000_17 awS135S0110000_17) {
        ((C1135920ffK) awS135S0110000_17.l0).getClass();
        if (!awS135S0110000_17.z1) {
            ((C1135920ffK) awS135S0110000_17.l0).LJIILL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS135S0110000_17 awS135S0110000_17) {
        ((C1135920ffK) awS135S0110000_17.l0).getClass();
        if (!awS135S0110000_17.z1) {
            ((C1135920ffK) awS135S0110000_17.l0).LJIILL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS135S0110000_17 awS135S0110000_17) {
        ((C1135920ffK) awS135S0110000_17.l0).getClass();
        if (!awS135S0110000_17.z1) {
            ((C1135920ffK) awS135S0110000_17.l0).LJIILL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS135S0110000_17 awS135S0110000_17) {
        ((ShareSettingsDialog) awS135S0110000_17.l0).UR().setChecked(awS135S0110000_17.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS135S0110000_17 awS135S0110000_17) {
        int i;
        if (awS135S0110000_17.z1) {
            i = R.dimen.az2;
        } else {
            i = R.dimen.ayu;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(C497740JfY.LJIIIZ(i) + C497740JfY.LJIIIZ(R.dimen.asf), 0);
        valueAnimatorOfInt.setDuration(((C1080120eDK) awS135S0110000_17.l0).LIZ.getAnimationDuration());
        return valueAnimatorOfInt;
    }

    public static final Object invoke$8(AwS135S0110000_17 awS135S0110000_17) {
        int i;
        if (awS135S0110000_17.z1) {
            i = R.dimen.az2;
        } else {
            i = R.dimen.ayu;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, C497740JfY.LJIIIZ(i) + C497740JfY.LJIIIZ(R.dimen.asf));
        valueAnimatorOfInt.setDuration(((C1080120eDK) awS135S0110000_17.l0).LIZ.getAnimationDuration());
        return valueAnimatorOfInt;
    }

    public static final Object invoke$9(AwS135S0110000_17 awS135S0110000_17) {
        List<AbstractC1135650fet> list = ((C1135590fen) awS135S0110000_17.l0).LIZIZ;
        boolean z = awS135S0110000_17.z1;
        for (AbstractC1135650fet abstractC1135650fet : list) {
            abstractC1135650fet.LIZJ = z;
            if (z) {
                abstractC1135650fet.LIZ();
                abstractC1135650fet.LIZLLL = false;
            }
        }
        if (awS135S0110000_17.z1) {
            ((C1135590fen) awS135S0110000_17.l0).LJ.clear();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS135S0110000_17(AbstractC1109720ez4 abstractC1109720ez4, AbstractC1109720ez4<TEXT_MODEL, PINNED_MODEL> abstractC1109720ez42, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = abstractC1109720ez4;
        this.z1 = abstractC1109720ez42;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0110000_17(C1109810ezD c1109810ezD, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1109810ezD;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0110000_17(C1133890fc3 c1133890fc3, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1133890fc3;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0110000_17(C1135590fen c1135590fen, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1135590fen;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0110000_17(C1135910ffJ c1135910ffJ, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1135910ffJ;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0110000_17(C1135920ffK c1135920ffK, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1135920ffK;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0110000_17(LiveGiftTrayWidgetV2 liveGiftTrayWidgetV2, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveGiftTrayWidgetV2;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0110000_17(ShareSettingsDialog shareSettingsDialog, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = shareSettingsDialog;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS135S0110000_17(Function1 function1, Function1<? super Boolean, Unit> function12, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = function1;
        this.z1 = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0110000_17(boolean z, C1080120eDK c1080120eDK, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1080120eDK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0110000_17(boolean z, C1095910ecn c1095910ecn, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = c1095910ecn;
    }
}
