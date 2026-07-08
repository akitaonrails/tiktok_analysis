package kotlin.jvm.internal;

import X.C09AY;
import X.C10EY;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1397620mTQ;
import X.C190T;
import X.C1913000zsg;
import X.C191918106i;
import X.C786410Ut5;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.InlineLink;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public class AwS78S1000000_28 extends C09AY implements Function1 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS78S1000000_28(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS78S1000000_28 awS78S1000000_28, Object obj) {
        ImageView imageView = (ImageView) obj;
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(awS78S1000000_28.s0);
        c1331670kl3LJIIIZ.LJJI(imageView);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        C786410Ut5.V4(imageView, 0.34f);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS78S1000000_28 awS78S1000000_28, Object obj) {
        ImageView imageView = (ImageView) obj;
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(awS78S1000000_28.s0);
        c1331670kl3LJIIIZ.LJJI(imageView);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        C786410Ut5.V4(imageView, 0.34f);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS78S1000000_28 awS78S1000000_28, Object obj) {
        return C10EY.LJI((C10EY) obj, awS78S1000000_28.s0);
    }

    public static final Object invoke$2(AwS78S1000000_28 awS78S1000000_28, Object obj) {
        InlineLink inlineLink = (InlineLink) obj;
        if (Intrinsics.LJFF(inlineLink.url, "aweme://change_region")) {
            C1913000zsg.LIZ.getClass();
            C1913000zsg.LIZIZ();
        } else {
            C1913000zsg c1913000zsg = C1913000zsg.LIZ;
            String str = awS78S1000000_28.s0;
            c1913000zsg.getClass();
            C1913000zsg.LIZ(inlineLink, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS78S1000000_28 awS78S1000000_28, Object obj) {
        C191918106i c191918106i = C191918106i.LIZ;
        String str = awS78S1000000_28.s0;
        c191918106i.getClass();
        C191918106i.LIZJ(2, str);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS78S1000000_28 awS78S1000000_28, Object obj) {
        return C190T.LJII((C190T) obj, 0, false, false, null, awS78S1000000_28.s0, null, 895);
    }

    public static final Object invoke$5(AwS78S1000000_28 awS78S1000000_28, Object obj) {
        return C190T.LJII((C190T) obj, 0, false, false, null, awS78S1000000_28.s0, null, 895);
    }

    public static final Object invoke$6(AwS78S1000000_28 awS78S1000000_28, Object obj) {
        ((C1397620mTQ) obj).LIZJ(0, awS78S1000000_28.s0, AFwS271S0000000_28.get$arr$(243));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS78S1000000_28 awS78S1000000_28, Object obj) {
        ((C1397620mTQ) obj).LIZJ(0, awS78S1000000_28.s0, AFwS271S0000000_28.get$arr$(244));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS78S1000000_28 awS78S1000000_28, Object obj) {
        C1913000zsg c1913000zsg = C1913000zsg.LIZ;
        String str = awS78S1000000_28.s0;
        c1913000zsg.getClass();
        C1913000zsg.LIZ((InlineLink) obj, str);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS78S1000000_28 awS78S1000000_28, Object obj) {
        C1397620mTQ.LJIIIIZZ((C1397620mTQ) obj, awS78S1000000_28.s0);
        return Unit.LIZ;
    }
}
