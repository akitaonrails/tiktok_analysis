package kotlin.jvm.internal;

import X.C09AY;
import X.C1537480q70;
import X.C1537510q73;
import X.C1537900q7g;
import X.C1541950qED;
import X.C212374189c;
import X.InterfaceC1631620sYq;
import X.InterfaceC21503119Dh;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.SoftReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes33.dex */
public class AFwS355S0000000_32 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(11);
    public final int $t;

    public static AFwS355S0000000_32 get$arr$(int i) {
        AFwS355S0000000_32 aFwS355S0000000_32 = (AFwS355S0000000_32) arr$.get(i);
        if (aFwS355S0000000_32 != null) {
            return aFwS355S0000000_32;
        }
        arr$.compareAndSet(i, null, new AFwS355S0000000_32(i));
        return (AFwS355S0000000_32) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS355S0000000_32(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS355S0000000_32 aFwS355S0000000_32, Object obj, Object obj2, Object obj3) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
        C1537510q73 c1537510q73;
        Context context = (Context) obj;
        String str = (String) obj2;
        C1537480q70 c1537480q70 = (C1537480q70) obj3;
        if (c1537480q70 instanceof SparkContext) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = (SparkContext) c1537480q70;
            sparkContext.usePreload = true;
            c1537900q7g.getClass();
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
        } else {
            SparkContext sparkContext2 = new SparkContext();
            sparkContext2.LJJLIIJ(str);
            sparkContext2.usePreload = true;
            if (c1537480q70 != null && (c1537510q73 = c1537480q70.runtimeInfo) != null) {
                sparkContext2.LJJLIIIJILLIZJL(c1537510q73);
            }
            C1541950qED.LIZJ.getClass();
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext2).LIZ(false);
        }
        C212374189c.LIZIZ = new SoftReference<>(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
    }

    public static final Object invoke$1(AFwS355S0000000_32 aFwS355S0000000_32, Object obj, Object obj2, Object obj3) {
        ((InterfaceC21503119Dh) obj).finish();
        return Unit.LIZ;
    }

    public static final Object invoke$10(AFwS355S0000000_32 aFwS355S0000000_32, Object obj, Object obj2, Object obj3) {
        ((InterfaceC21503119Dh) obj).LJJIII();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS355S0000000_32 aFwS355S0000000_32, Object obj, Object obj2, Object obj3) {
        ((InterfaceC21503119Dh) obj).LJJIJLIJ((BaseActivity) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AFwS355S0000000_32 aFwS355S0000000_32, Object obj, Object obj2, Object obj3) {
        ((InterfaceC21503119Dh) obj).LJJI((BaseActivity) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS355S0000000_32 aFwS355S0000000_32, Object obj, Object obj2, Object obj3) {
        ((InterfaceC21503119Dh) obj).LJJIJIL((BaseActivity) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS355S0000000_32 aFwS355S0000000_32, Object obj, Object obj2, Object obj3) {
        ((InterfaceC21503119Dh) obj).LJJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS355S0000000_32 aFwS355S0000000_32, Object obj, Object obj2, Object obj3) {
        ((InterfaceC21503119Dh) obj).LJJIJIIJIL();
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS355S0000000_32 aFwS355S0000000_32, Object obj, Object obj2, Object obj3) {
        ((InterfaceC21503119Dh) obj).LJJJIL();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AFwS355S0000000_32 aFwS355S0000000_32, Object obj, Object obj2, Object obj3) {
        ((InterfaceC21503119Dh) obj).LJFF();
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS355S0000000_32 aFwS355S0000000_32, Object obj, Object obj2, Object obj3) {
        ((InterfaceC21503119Dh) obj).LJJIZ();
        return Unit.LIZ;
    }
}
