package kotlin.jvm.internal;

import X.C09AY;
import X.C13LP;
import X.C1555930qal;
import X.C1A1J;
import X.C1A5X;
import X.C21667819r2;
import X.C2172721A1m;
import X.C2172731A1n;
import X.C2172781A1s;
import X.C995890c1T;
import X.EnumC2174511A8j;
import X.InterfaceC2172841A1y;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes34.dex */
public class AwS45S0010000_33 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S0010000_33(int i) {
        super(1);
        this.$t = i;
        this.z0 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S0010000_33(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AwS45S0010000_33 awS45S0010000_33, Object obj) {
        boolean z = awS45S0010000_33.z0;
        obj.getClass();
        return new C995890c1T(z);
    }

    public static final Object invoke$1(AwS45S0010000_33 awS45S0010000_33, Object obj) {
        C2172731A1n c2172731A1n = (C2172731A1n) obj;
        boolean z = awS45S0010000_33.z0;
        InterfaceC2172841A1y interfaceC2172841A1y = c2172731A1n.LLILLJJLI;
        c2172731A1n.getClass();
        return new C2172731A1n(z, interfaceC2172841A1y);
    }

    public static final Object invoke$10(AwS45S0010000_33 awS45S0010000_33, Object obj) {
        return C21667819r2.LIZ((C21667819r2) obj, false, null, false, awS45S0010000_33.z0, null, null, 55);
    }

    public static final Object invoke$11(AwS45S0010000_33 awS45S0010000_33, Object obj) {
        return C21667819r2.LIZ((C21667819r2) obj, awS45S0010000_33.z0, null, false, false, null, null, 62);
    }

    public static final Object invoke$2(AwS45S0010000_33 awS45S0010000_33, Object obj) {
        return C2172721A1m.LIZ((C2172721A1m) obj, awS45S0010000_33.z0, false, null, 6);
    }

    public static final Object invoke$3(AwS45S0010000_33 awS45S0010000_33, Object obj) {
        return C2172721A1m.LIZ((C2172721A1m) obj, false, awS45S0010000_33.z0, null, 5);
    }

    public static final Object invoke$4(AwS45S0010000_33 awS45S0010000_33, Object obj) {
        return C2172781A1s.LIZ((C2172781A1s) obj, awS45S0010000_33.z0, null, 2);
    }

    public static final Object invoke$5(AwS45S0010000_33 awS45S0010000_33, Object obj) {
        List listLJLIIIL;
        C1555930qal c1555930qal = (C1555930qal) obj;
        if (awS45S0010000_33.z0) {
            listLJLIIIL = C13LP.LJJJJI(C13LP.LJLILLLLZI(EnumC2174511A8j.ORDERS, c1555930qal.LLILLJJLI));
        } else {
            listLJLIIIL = C13LP.LJLIIIL(EnumC2174511A8j.ORDERS, c1555930qal.LLILLJJLI);
        }
        c1555930qal.getClass();
        return new C1555930qal(listLJLIIIL);
    }

    public static final Object invoke$6(AwS45S0010000_33 awS45S0010000_33, Object obj) {
        return C1A1J.LIZ((C1A1J) obj, null, null, null, awS45S0010000_33.z0, null, 23);
    }

    public static final Object invoke$7(AwS45S0010000_33 awS45S0010000_33, Object obj) {
        return C1A5X.LIZ((C1A5X) obj, null, awS45S0010000_33.z0, false, 5);
    }

    public static final Object invoke$8(AwS45S0010000_33 awS45S0010000_33, Object obj) {
        return C1A5X.LIZ((C1A5X) obj, null, false, awS45S0010000_33.z0, 3);
    }

    public static final Object invoke$9(AwS45S0010000_33 awS45S0010000_33, Object obj) {
        return C21667819r2.LIZ((C21667819r2) obj, false, null, awS45S0010000_33.z0, false, null, null, 59);
    }
}
