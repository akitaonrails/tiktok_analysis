package kotlin.jvm.internal;

import X.AbstractC1250290idn;
import X.AbstractC885540Yoa;
import X.C09AY;
import X.C0YWS;
import X.C0ZV9;
import X.C1165820gRY;
import X.C1250300ido;
import X.C1383370m6R;
import X.C15438062q;
import X.C291001Au;
import X.C627660Ojc;
import X.C885430YoP;
import X.C885570Yod;
import X.C887820YsG;
import X.C907220ZiS;
import X.C912570Zr5;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS29S0010000_14 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0010000_14(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AwS29S0010000_14 awS29S0010000_14, Object obj) {
        C1165820gRY c1165820gRY = (C1165820gRY) obj;
        C291001Au c291001Au = new C291001Au(Boolean.valueOf(awS29S0010000_14.z0));
        C627660Ojc<C912570Zr5> c627660Ojc = c1165820gRY.LL;
        c1165820gRY.getClass();
        return new C1165820gRY(c291001Au, c627660Ojc);
    }

    public static final Object invoke$1(AwS29S0010000_14 awS29S0010000_14, Object obj) {
        ((C0YWS) obj).LJJLI(awS29S0010000_14.z0);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS29S0010000_14 awS29S0010000_14, Object obj) {
        C1250300ido c1250300ido;
        AbstractC1250290idn abstractC1250290idn = (AbstractC1250290idn) obj;
        if ((abstractC1250290idn instanceof C1250300ido) && (c1250300ido = (C1250300ido) abstractC1250290idn) != null) {
            c1250300ido.LJ = awS29S0010000_14.z0;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS29S0010000_14 awS29S0010000_14, Object obj) {
        ArrayList arrayList;
        C885430YoP c885430YoP = (C885430YoP) obj;
        List<AbstractC885540Yoa<?>> list = c885430YoP.LLILLJJLI;
        if (list != null) {
            boolean z = awS29S0010000_14.z0;
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<AbstractC885540Yoa<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZ(Boolean.valueOf(z)));
            }
        } else {
            arrayList = null;
        }
        return C885430YoP.LIZ(c885430YoP, null, arrayList, null, null, null, false, null, 125);
    }

    public static final Object invoke$3(AwS29S0010000_14 awS29S0010000_14, Object obj) {
        ArrayList arrayList;
        C885430YoP c885430YoP = (C885430YoP) obj;
        List<AbstractC885540Yoa<?>> list = c885430YoP.LLILLJJLI;
        if (list != null) {
            boolean z = awS29S0010000_14.z0;
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<AbstractC885540Yoa<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZ(Boolean.valueOf(z)));
            }
        } else {
            arrayList = null;
        }
        return C885430YoP.LIZ(c885430YoP, null, arrayList, null, null, null, false, null, 125);
    }

    public static final Object invoke$4(AwS29S0010000_14 awS29S0010000_14, Object obj) {
        return C0ZV9.LIZ((C0ZV9) obj, Boolean.valueOf(awS29S0010000_14.z0), null, 2);
    }

    public static final Object invoke$5(AwS29S0010000_14 awS29S0010000_14, Object obj) {
        String str;
        C907220ZiS c907220ZiS = (C907220ZiS) obj;
        if (awS29S0010000_14.z0) {
            str = "On";
        } else {
            str = "Off";
        }
        return C907220ZiS.LJII(c907220ZiS, false, str, null, 23);
    }

    public static final Object invoke$6(AwS29S0010000_14 awS29S0010000_14, Object obj) {
        return C885570Yod.LIZ((C885570Yod) obj, null, null, null, null, new C291001Au(Boolean.valueOf(!awS29S0010000_14.z0)), null, null, 111);
    }

    public static final Object invoke$7(AwS29S0010000_14 awS29S0010000_14, Object obj) {
        return C885570Yod.LIZ((C885570Yod) obj, null, null, null, null, new C291001Au(Boolean.valueOf(awS29S0010000_14.z0)), null, null, 111);
    }

    public static final Object invoke$8(AwS29S0010000_14 awS29S0010000_14, Object obj) {
        return C887820YsG.LIZ((C887820YsG) obj, null, null, null, null, null, null, null, null, new C291001Au(Boolean.valueOf(!awS29S0010000_14.z0)), new C291001Au(Boolean.FALSE), null, null, 3327);
    }

    public static final Object invoke$9(AwS29S0010000_14 awS29S0010000_14, Object obj) {
        return C887820YsG.LIZ((C887820YsG) obj, null, null, null, null, null, null, null, null, new C291001Au(Boolean.valueOf(awS29S0010000_14.z0)), new C291001Au(Boolean.FALSE), new C291001Au(C1383370m6R.LJIIJ(2131846486)), null, 2303);
    }
}
