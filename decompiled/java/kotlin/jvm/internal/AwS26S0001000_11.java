package kotlin.jvm.internal;

import X.C09AY;
import X.C0RJW;
import X.C0S9P;
import X.C0S9Z;
import X.C2188811AlT;
import X.C23250099c;
import X.C291001Au;
import X.C704520RkI;
import X.C709790Rsn;
import X.C727300Sfw;
import X.C727320Sfy;
import X.C730090SkR;
import X.C738510Sy1;
import X.C738520Sy2;
import X.C738560Sy6;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.fcpbusiness.funnel.DecisionPair;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS26S0001000_11 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f980i0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S0001000_11(int i) {
        super(1);
        this.$t = i;
        this.f980i0 = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S0001000_11(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f980i0 = i;
    }

    public static final Object invoke$0(AwS26S0001000_11 awS26S0001000_11, Object obj) {
        C738510Sy1 c738510Sy1 = (C738510Sy1) obj;
        C23250099c.LIZLLL(C738560Sy6.LL, null, null, new C738520Sy2(c738510Sy1.LIZJ, awS26S0001000_11.f980i0, c738510Sy1, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS26S0001000_11 awS26S0001000_11, Object obj) {
        C727300Sfw c727300Sfw = (C727300Sfw) obj;
        int i = c727300Sfw.LLILLJJLI;
        int i2 = awS26S0001000_11.f980i0;
        if (i == i2) {
            return C727300Sfw.LIZ(c727300Sfw, null, 0, null, null, new C291001Au(new C727320Sfy(0)), 15);
        }
        return C727300Sfw.LIZ(c727300Sfw, null, 0, null, new C291001Au(Integer.valueOf(i2)), null, 23);
    }

    public static final Object invoke$10(AwS26S0001000_11 awS26S0001000_11, Object obj) {
        return C0S9Z.LIZ((C0S9Z) obj, 0, awS26S0001000_11.f980i0, 0, 0, 0, 0, 61);
    }

    public static final Object invoke$11(AwS26S0001000_11 awS26S0001000_11, Object obj) {
        return C0S9Z.LIZ((C0S9Z) obj, 0, 0, 0, awS26S0001000_11.f980i0, 0, 0, 55);
    }

    public static final Object invoke$12(AwS26S0001000_11 awS26S0001000_11, Object obj) {
        return C0S9Z.LIZ((C0S9Z) obj, 0, 0, 0, 0, awS26S0001000_11.f980i0, 0, 47);
    }

    public static final Object invoke$2(AwS26S0001000_11 awS26S0001000_11, Object obj) {
        return C730090SkR.LIZ((C730090SkR) obj, null, null, null, false, null, null, null, 0, awS26S0001000_11.f980i0, 0L, 0L, false, false, null, null, 32511);
    }

    public static final Object invoke$3(AwS26S0001000_11 awS26S0001000_11, Object obj) {
        int i = awS26S0001000_11.f980i0;
        obj.getClass();
        return new C0RJW(i);
    }

    public static final Object invoke$4(AwS26S0001000_11 awS26S0001000_11, Object obj) {
        DecisionPair decisionPair = (DecisionPair) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("w=");
        sbLIZ.append(decisionPair.successKey);
        sbLIZ.append("&b=");
        sbLIZ.append(decisionPair.failedKey);
        sbLIZ.append("&l=");
        sbLIZ.append(awS26S0001000_11.f980i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS26S0001000_11 awS26S0001000_11, Object obj) {
        return C709790Rsn.LIZ((C709790Rsn) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(Integer.valueOf(awS26S0001000_11.f980i0)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32769, 1);
    }

    public static final Object invoke$6(AwS26S0001000_11 awS26S0001000_11, Object obj) {
        return C709790Rsn.LIZ((C709790Rsn) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(Integer.valueOf(awS26S0001000_11.f980i0)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, 1);
    }

    public static final Object invoke$7(AwS26S0001000_11 awS26S0001000_11, Object obj) {
        C704520RkI c704520RkI = (C704520RkI) obj;
        Integer num = c704520RkI.LLILLL;
        int i = awS26S0001000_11.f980i0;
        if (num != null && num.intValue() == i) {
            return c704520RkI;
        }
        return C704520RkI.LIZ(c704520RkI, null, null, Integer.valueOf(awS26S0001000_11.f980i0), 3);
    }

    public static final Object invoke$8(AwS26S0001000_11 awS26S0001000_11, Object obj) {
        C0S9P c0s9p = (C0S9P) obj;
        return C0S9P.LIZ(c0s9p, 0, 0, false, false, false, false, null, false, null, null, null, false, c0s9p.LLJILJILJ + awS26S0001000_11.f980i0, null, null, null, false, false, false, null, null, 0L, false, 33550335);
    }

    public static final Object invoke$9(AwS26S0001000_11 awS26S0001000_11, Object obj) {
        boolean z;
        C0S9P c0s9p = (C0S9P) obj;
        int i = awS26S0001000_11.f980i0;
        if (i == 0 && !c0s9p.LLJJIJIIJIL) {
            z = false;
        } else {
            z = true;
        }
        return C0S9P.LIZ(c0s9p, i, 0, false, false, false, false, null, false, null, null, null, false, 0, null, null, null, false, z, false, null, null, 0L, false, 33292286);
    }
}
