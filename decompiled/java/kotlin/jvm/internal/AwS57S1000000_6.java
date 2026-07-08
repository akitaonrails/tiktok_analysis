package kotlin.jvm.internal;

import X.C062P;
import X.C09AY;
import X.C0OWY;
import X.C1362190lYH;
import X.C15442062u;
import X.C291001Au;
import X.C427660Gpo;
import X.C449310Hjd;
import X.C449650HkB;
import X.C451400Hn0;
import X.C454050HrH;
import X.C454780HsS;
import X.C462150IAj;
import X.C463030IDt;
import X.EnumC449720HkI;
import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes7.dex */
public class AwS57S1000000_6 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS57S1000000_6(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS57S1000000_6 awS57S1000000_6, Object obj) {
        C451400Hn0 c451400Hn0 = (C451400Hn0) obj;
        C291001Au c291001Au = new C291001Au(awS57S1000000_6.s0);
        C291001Au<Boolean> c291001Au2 = c451400Hn0.LLILLJJLI;
        c451400Hn0.getClass();
        return new C451400Hn0(c291001Au, c291001Au2);
    }

    public static final Object invoke$1(AwS57S1000000_6 awS57S1000000_6, Object obj) {
        C462150IAj c462150IAj = (C462150IAj) obj;
        LinkedHashSet<String> linkedHashSet = c462150IAj.LL;
        linkedHashSet.add(awS57S1000000_6.s0);
        if (linkedHashSet.size() > 200) {
            Iterator<String> it2 = linkedHashSet.iterator();
            it2.next();
            it2.remove();
        }
        return new C462150IAj(linkedHashSet, c462150IAj.LLILLJJLI);
    }

    public static final Object invoke$10(AwS57S1000000_6 awS57S1000000_6, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((LiveEffect) obj).getResourceId(), awS57S1000000_6.s0));
    }

    public static final Object invoke$11(AwS57S1000000_6 awS57S1000000_6, Object obj) {
        ((C062P) obj).LIZ = new C449650HkB(Collections.singletonList(EnumC449720HkI.SYSTEM_EMOJI), R.attr.zm, R.attr.zm, null, null, awS57S1000000_6.s0, false, false, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -104, 255);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS57S1000000_6 awS57S1000000_6, Object obj) {
        return C454050HrH.LIZ((C454050HrH) obj, null, new C291001Au(awS57S1000000_6.s0), null, null, null, null, null, 253);
    }

    public static final Object invoke$13(AwS57S1000000_6 awS57S1000000_6, Object obj) {
        return C0OWY.LIZ((C0OWY) obj, null, null, new C291001Au(awS57S1000000_6.s0), null, null, null, null, null, 251);
    }

    public static final Object invoke$2(AwS57S1000000_6 awS57S1000000_6, Object obj) {
        return ((Context) obj).getString(2131835458, C454780HsS.LIZ(awS57S1000000_6.s0));
    }

    public static final Object invoke$3(AwS57S1000000_6 awS57S1000000_6, Object obj) {
        return ((Context) obj).getString(2131835453, C454780HsS.LIZ(awS57S1000000_6.s0));
    }

    public static final Object invoke$4(AwS57S1000000_6 awS57S1000000_6, Object obj) {
        return ((Context) obj).getString(2131835454, C454780HsS.LIZ(awS57S1000000_6.s0));
    }

    public static final Object invoke$5(AwS57S1000000_6 awS57S1000000_6, Object obj) {
        return C449310Hjd.LIZ((C449310Hjd) obj, awS57S1000000_6.s0, false, null, false, false, false, null, false, 254);
    }

    public static final Object invoke$6(AwS57S1000000_6 awS57S1000000_6, Object obj) {
        C462150IAj c462150IAj = (C462150IAj) obj;
        return new C462150IAj(c462150IAj.LL, C15442062u.LJIIIIZZ(awS57S1000000_6.s0, c462150IAj.LLILLJJLI));
    }

    public static final Object invoke$7(AwS57S1000000_6 awS57S1000000_6, Object obj) {
        C427660Gpo c427660Gpo = (C427660Gpo) obj;
        String str = awS57S1000000_6.s0;
        if (str != null && !a0.LJJJIL(str)) {
            C427660Gpo.LJIIJJI(c427660Gpo, a0.LJLIIIL(str).toString(), false, null, null, false, false, null, null, false, null, 1022);
        } else {
            C427660Gpo.LJIIJJI(c427660Gpo, Integer.valueOf(R.raw.icon_person_fill), false, null, null, false, true, null, null, false, null, 990);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS57S1000000_6 awS57S1000000_6, Object obj) {
        C427660Gpo.LJIIJJI((C427660Gpo) obj, awS57S1000000_6.s0, false, null, null, false, false, null, new C463030IDt(1), false, null, 894);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS57S1000000_6 awS57S1000000_6, Object obj) {
        return C1362190lYH.LIZ((C1362190lYH) obj, null, null, null, false, false, awS57S1000000_6.s0, null, false, null, 959);
    }
}
