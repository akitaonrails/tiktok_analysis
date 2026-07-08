package kotlin.jvm.internal;

import X.C09AY;
import X.C0ZRO;
import X.C1714830uj3;
import X.C2172771A1r;
import X.C291001Au;
import X.C887820YsG;
import X.C889930Yvf;
import X.C895910ZCr;
import X.C902390Zaf;
import X.C908950ZlF;
import X.C908960ZlG;
import X.InterfaceC2172841A1y;
import X.InterfaceC906850Zhr;
import X.InterfaceC906890Zhv;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarButtonStrategyConf;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS65S1000000_14 extends C09AY implements Function1 {
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
    public AwS65S1000000_14(int i) {
        super(1);
        this.$t = i;
        this.s0 = "local_ext_paired_msg_id";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S1000000_14(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS65S1000000_14 awS65S1000000_14, Object obj) {
        ((InterfaceC906890Zhv) obj).setBubbleId(awS65S1000000_14.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS65S1000000_14 awS65S1000000_14, Object obj) {
        return C887820YsG.LIZ((C887820YsG) obj, null, null, null, null, null, null, null, null, null, new C291001Au(Boolean.FALSE), new C291001Au(awS65S1000000_14.s0), null, 2559);
    }

    public static final Object invoke$10(AwS65S1000000_14 awS65S1000000_14, Object obj) {
        InterfaceC2172841A1y interfaceC2172841A1y = (InterfaceC2172841A1y) obj;
        if (interfaceC2172841A1y instanceof C2172771A1r) {
            return C2172771A1r.LIZ((C2172771A1r) interfaceC2172841A1y, 0, 0, awS65S1000000_14.s0, false, 1919);
        }
        return interfaceC2172841A1y;
    }

    public static final Object invoke$11(AwS65S1000000_14 awS65S1000000_14, Object obj) {
        boolean z;
        C1714830uj3 c1714830uj3 = (C1714830uj3) obj;
        if (awS65S1000000_14.s0.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        return C1714830uj3.LIZ(c1714830uj3, null, null, z, false, false, false, false, false, 0, 505);
    }

    public static final Object invoke$12(AwS65S1000000_14 awS65S1000000_14, Object obj) {
        return C895910ZCr.LIZ((C895910ZCr) obj, null, awS65S1000000_14.s0, null, null, 13);
    }

    public static final Object invoke$13(AwS65S1000000_14 awS65S1000000_14, Object obj) {
        return C0ZRO.LIZ((C0ZRO) obj, null, new C291001Au(awS65S1000000_14.s0), 1);
    }

    public static final Object invoke$14(AwS65S1000000_14 awS65S1000000_14, Object obj) {
        return C0ZRO.LIZ((C0ZRO) obj, new C291001Au(awS65S1000000_14.s0), null, 2);
    }

    public static final Object invoke$15(AwS65S1000000_14 awS65S1000000_14, Object obj) {
        ((InterfaceC906850Zhr) obj).setButton(awS65S1000000_14.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS65S1000000_14 awS65S1000000_14, Object obj) {
        String str = (String) obj;
        C902390Zaf c902390Zaf = C902390Zaf.LIZ;
        String str2 = awS65S1000000_14.s0;
        c902390Zaf.getClass();
        C902390Zaf.LJ.put(str2, str);
        C902390Zaf.LJII.storeString(C902390Zaf.LIZJ(str2), str);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS65S1000000_14 awS65S1000000_14, Object obj) {
        String str = (String) obj;
        C902390Zaf c902390Zaf = C902390Zaf.LIZ;
        String str2 = awS65S1000000_14.s0;
        c902390Zaf.getClass();
        C902390Zaf.LJ.put(str2, str);
        C902390Zaf.LJII.storeString(C902390Zaf.LIZJ(str2), str);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS65S1000000_14 awS65S1000000_14, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((ActionBarButtonStrategyConf) obj).buttonId, awS65S1000000_14.s0));
    }

    public static final Object invoke$5(AwS65S1000000_14 awS65S1000000_14, Object obj) {
        ((Map) obj).remove(awS65S1000000_14.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS65S1000000_14 awS65S1000000_14, Object obj) {
        C908960ZlG c908960ZlG = new C908960ZlG(null, awS65S1000000_14.s0);
        obj.getClass();
        return new C908950ZlF(c908960ZlG);
    }

    public static final Object invoke$7(AwS65S1000000_14 awS65S1000000_14, Object obj) {
        C889930Yvf.LJFF.LIZJ(awS65S1000000_14.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS65S1000000_14 awS65S1000000_14, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((User) obj).getUid(), awS65S1000000_14.s0));
    }

    public static final Object invoke$9(AwS65S1000000_14 awS65S1000000_14, Object obj) {
        InterfaceC2172841A1y interfaceC2172841A1y = (InterfaceC2172841A1y) obj;
        if (interfaceC2172841A1y instanceof C2172771A1r) {
            return C2172771A1r.LIZ((C2172771A1r) interfaceC2172841A1y, 0, 0, awS65S1000000_14.s0, false, 1919);
        }
        return interfaceC2172841A1y;
    }
}
