package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.C09AY;
import X.C0RF0;
import X.C0RTA;
import X.C0S9P;
import X.C291001Au;
import X.C727300Sfw;
import X.C727320Sfy;
import X.EnumC696090RSd;
import X.InterfaceC724070Saj;
import X.InterfaceC729460SjQ;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StorySwipeInterceptComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS242S0000000_11 extends C09AY implements Function1 {
    public final int $t;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS242S0000000_11(int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS242S0000000_11(C0RF0 c0rf0, int i) {
        super(1);
        this.$t = i;
    }

    public static final Object invoke$0(AwS242S0000000_11 awS242S0000000_11, Object obj) {
        ((InterfaceC724070Saj) obj).LIZJ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS242S0000000_11 awS242S0000000_11, Object obj) {
        C0RTA c0rta = (C0RTA) obj;
        c0rta.LLJI = R.id.dyk;
        c0rta.LLJ = new StorySwipeInterceptComponent();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS242S0000000_11 awS242S0000000_11, Object obj) {
        return C0S9P.LIZ((C0S9P) obj, 0, 0, false, false, false, false, null, false, null, null, null, false, 0, null, null, null, false, false, false, null, null, 0L, false, 33554411);
    }

    public static final Object invoke$3(AwS242S0000000_11 awS242S0000000_11, Object obj) {
        return C727300Sfw.LIZ((C727300Sfw) obj, null, 0, null, null, new C291001Au(new C727320Sfy()), 15);
    }

    public static final Object invoke$4(AwS242S0000000_11 awS242S0000000_11, Object obj) {
        ((InterfaceC729460SjQ) obj).LJFF();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS242S0000000_11(EnumC696090RSd enumC696090RSd, int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS242S0000000_11(AbstractC738140SxQ abstractC738140SxQ, int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS242S0000000_11(String str, int i) {
        super(1);
        this.$t = i;
    }
}
