package kotlin.jvm.internal;

import X.C09AY;
import X.C1DQ5;
import X.C1DQ6;
import X.C1DQH;
import X.C1DQI;
import X.C1DQJ;
import X.C1DQK;
import X.C1DQL;
import X.C1DQM;
import X.C1DQN;
import X.C1EKA;
import X.C2095008Iq;
import X.C416901jj;
import android.content.Context;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes36.dex */
public class AwS324S0000000_35 extends C09AY implements Function2 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS324S0000000_35(int i) {
        super(2);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS324S0000000_35(FragmentManager fragmentManager, int i) {
        super(2);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS324S0000000_35(Context context, FragmentManager fragmentManager, int i) {
        super(2);
        this.$t = i;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        String string;
        BaseBundle baseBundle = (BaseBundle) obj;
        String str = (String) obj2;
        if (baseBundle.containsKey(str) && (string = baseBundle.getString(str)) != null) {
            C1DQK.Companion.getClass();
            return C1DQJ.LIZ(string);
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        String str;
        Object obj3 = ((Map) obj).get(obj2);
        if (obj3 == null || !(obj3 instanceof String) || (str = (String) obj3) == null) {
            return null;
        }
        return C1DQH.LIZIZ(str);
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        String string;
        BaseBundle baseBundle = (BaseBundle) obj;
        String str = (String) obj2;
        if (baseBundle.containsKey(str) && (string = baseBundle.getString(str)) != null) {
            return C1DQH.LIZIZ(string);
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        String strLIZ = C416901jj.LIZ((Uri) obj, (String) obj2);
        if (strLIZ == null) {
            return null;
        }
        C1DQK.Companion.getClass();
        return C1DQJ.LIZ(strLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        BaseBundle baseBundle = (BaseBundle) obj;
        String str = (String) obj2;
        if (baseBundle.containsKey(str)) {
            int i = baseBundle.getInt(str);
            C1DQI.Companion.getClass();
            for (C1DQI c1dqi : C1DQI.values()) {
                if (i == c1dqi.getVALUE()) {
                    return c1dqi;
                }
            }
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        String string;
        BaseBundle baseBundle = (BaseBundle) obj;
        String str = (String) obj2;
        if (baseBundle.containsKey(str) && (string = baseBundle.getString(str)) != null) {
            C1DQ5.Companion.getClass();
            return C1DQ6.LIZ(string);
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        String string;
        BaseBundle baseBundle = (BaseBundle) obj;
        String str = (String) obj2;
        if (baseBundle.containsKey(str) && (string = baseBundle.getString(str)) != null) {
            C1DQL.Companion.getClass();
            return C1DQM.LIZ(string);
        }
        return null;
    }

    public static final Object invoke$15(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        ((C1EKA) obj).LJIIJ();
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        ((C1EKA) obj).LJIIIIZZ((BaseFragment) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        ((C1EKA) obj).LIZIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        ((C1EKA) obj).LJI();
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        ((C1EKA) obj).LIZ();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        String str;
        Object obj3 = ((Map) obj).get(obj2);
        if (obj3 != null && (obj3 instanceof String) && (str = (String) obj3) != null) {
            C1DQN c1dqn = C1DQI.Companion;
            c1dqn.getClass();
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(str);
            if (numLJIIJJI != null) {
                int iIntValue = numLJIIJJI.intValue();
                c1dqn.getClass();
                for (C1DQI c1dqi : C1DQI.values()) {
                    if (iIntValue == c1dqi.getVALUE()) {
                        return c1dqi;
                    }
                }
            }
        }
        return null;
    }

    public static final Object invoke$20(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        ((C1EKA) obj).LIZLLL();
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        ((C1EKA) obj).LJIIIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        ((C1EKA) obj).LJIILL();
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        ((C1EKA) obj).LJIILLIIL((BaseFragment) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$24(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        ((C1EKA) obj).LJIIL();
        return Unit.LIZ;
    }

    public static final Object invoke$25(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        ((C1EKA) obj).LJIILIIL();
        return Unit.LIZ;
    }

    public static final Object invoke$26(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        ((C1EKA) obj).LJ();
        return Unit.LIZ;
    }

    public static final Object invoke$27(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        ((C1EKA) obj).LJIIJJI((BaseFragment) obj2);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        String str;
        Object obj3 = ((Map) obj).get(obj2);
        if (obj3 == null || !(obj3 instanceof String) || (str = (String) obj3) == null) {
            return null;
        }
        C1DQ5.Companion.getClass();
        return C1DQ6.LIZ(str);
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        String str;
        Object obj3 = ((Map) obj).get(obj2);
        if (obj3 == null || !(obj3 instanceof String) || (str = (String) obj3) == null) {
            return null;
        }
        C1DQL.Companion.getClass();
        return C1DQM.LIZ(str);
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        String str;
        Object obj3 = ((Map) obj).get(obj2);
        if (obj3 == null || !(obj3 instanceof String) || (str = (String) obj3) == null) {
            return null;
        }
        C1DQK.Companion.getClass();
        return C1DQJ.LIZ(str);
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        String strLIZ = C416901jj.LIZ((Uri) obj, (String) obj2);
        if (strLIZ == null) {
            return null;
        }
        return C1DQH.LIZIZ(strLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        String strLIZ = C416901jj.LIZ((Uri) obj, (String) obj2);
        if (strLIZ != null) {
            C1DQN c1dqn = C1DQI.Companion;
            c1dqn.getClass();
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(strLIZ);
            if (numLJIIJJI != null) {
                int iIntValue = numLJIIJJI.intValue();
                c1dqn.getClass();
                for (C1DQI c1dqi : C1DQI.values()) {
                    if (iIntValue == c1dqi.getVALUE()) {
                        return c1dqi;
                    }
                }
            }
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        String strLIZ = C416901jj.LIZ((Uri) obj, (String) obj2);
        if (strLIZ == null) {
            return null;
        }
        C1DQ5.Companion.getClass();
        return C1DQ6.LIZ(strLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS324S0000000_35 awS324S0000000_35, Object obj, Object obj2) {
        String strLIZ = C416901jj.LIZ((Uri) obj, (String) obj2);
        if (strLIZ == null) {
            return null;
        }
        C1DQL.Companion.getClass();
        return C1DQM.LIZ(strLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS324S0000000_35(Bundle bundle, FragmentManager fragmentManager, int i) {
        super(2);
        this.$t = i;
    }
}
