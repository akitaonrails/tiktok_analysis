package kotlin.jvm.internal;

import X.C09AY;
import X.C1044210dHP;
import X.C1DQ5;
import X.C1DQI;
import X.C1DQK;
import X.C1DQL;
import X.C786410Ut5;
import X.InterfaceC1631620sYq;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;

/* JADX INFO: loaded from: classes36.dex */
public class AwS357S0000000_35 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS357S0000000_35(int i) {
        super(3);
        this.$t = i;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS357S0000000_35 awS357S0000000_35, Object obj, Object obj2, Object obj3) {
        Bundle bundle = (Bundle) obj;
        C786410Ut5.LJJJI((String) obj2, ((C1DQL) obj3).getVALUE(), bundle);
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS357S0000000_35 awS357S0000000_35, Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj;
        String value = ((C1DQK) obj3).getVALUE();
        if (value != null) {
            map.put(obj2, value);
        }
        return map;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(AwS357S0000000_35 awS357S0000000_35, Object obj, Object obj2, Object obj3) {
        Bundle bundle = (Bundle) obj;
        C786410Ut5.LJJJI((String) obj2, ((C1DQK) obj3).getVALUE(), bundle);
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS357S0000000_35 awS357S0000000_35, Object obj, Object obj2, Object obj3) {
        Uri.Builder builder = (Uri.Builder) obj;
        String str = (String) obj2;
        String value = ((C1DQL) obj3).getVALUE();
        if (value != null) {
            builder.appendQueryParameter(str, value);
        }
        return builder;
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(AwS357S0000000_35 awS357S0000000_35, Object obj, Object obj2, Object obj3) {
        Bundle bundle = (Bundle) obj;
        C786410Ut5.LJJJI((String) obj2, String.valueOf(((C1044210dHP) obj3).LIZ), bundle);
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AwS357S0000000_35 awS357S0000000_35, Object obj, Object obj2, Object obj3) {
        BaseBundle baseBundle = (BaseBundle) obj;
        baseBundle.putInt((String) obj2, ((C1DQI) obj3).getVALUE());
        return baseBundle;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(AwS357S0000000_35 awS357S0000000_35, Object obj, Object obj2, Object obj3) {
        Bundle bundle = (Bundle) obj;
        C786410Ut5.LJJJI((String) obj2, ((C1DQ5) obj3).getVALUE(), bundle);
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS357S0000000_35 awS357S0000000_35, Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj;
        String strValueOf = String.valueOf(((C1044210dHP) obj3).LIZ);
        if (strValueOf != null) {
            map.put(obj2, strValueOf);
        }
        return map;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS357S0000000_35 awS357S0000000_35, Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj;
        String strValueOf = String.valueOf(((C1DQI) obj3).getVALUE());
        if (strValueOf != null) {
            map.put(obj2, strValueOf);
        }
        return map;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS357S0000000_35 awS357S0000000_35, Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj;
        String value = ((C1DQ5) obj3).getVALUE();
        if (value != null) {
            map.put(obj2, value);
        }
        return map;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS357S0000000_35 awS357S0000000_35, Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj;
        String value = ((C1DQL) obj3).getVALUE();
        if (value != null) {
            map.put(obj2, value);
        }
        return map;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS357S0000000_35 awS357S0000000_35, Object obj, Object obj2, Object obj3) {
        Uri.Builder builder = (Uri.Builder) obj;
        String str = (String) obj2;
        String value = ((C1DQK) obj3).getVALUE();
        if (value != null) {
            builder.appendQueryParameter(str, value);
        }
        return builder;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS357S0000000_35 awS357S0000000_35, Object obj, Object obj2, Object obj3) {
        Uri.Builder builder = (Uri.Builder) obj;
        String str = (String) obj2;
        String strValueOf = String.valueOf(((C1044210dHP) obj3).LIZ);
        if (strValueOf != null) {
            builder.appendQueryParameter(str, strValueOf);
        }
        return builder;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS357S0000000_35 awS357S0000000_35, Object obj, Object obj2, Object obj3) {
        Uri.Builder builder = (Uri.Builder) obj;
        String str = (String) obj2;
        String strValueOf = String.valueOf(((C1DQI) obj3).getVALUE());
        if (strValueOf != null) {
            builder.appendQueryParameter(str, strValueOf);
        }
        return builder;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS357S0000000_35 awS357S0000000_35, Object obj, Object obj2, Object obj3) {
        Uri.Builder builder = (Uri.Builder) obj;
        String str = (String) obj2;
        String value = ((C1DQ5) obj3).getVALUE();
        if (value != null) {
            builder.appendQueryParameter(str, value);
        }
        return builder;
    }
}
