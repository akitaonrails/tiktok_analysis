package kotlin.jvm.internal;

import X.C062P;
import X.C09AY;
import X.C0R96;
import X.C0RFV;
import X.C0S2L;
import X.C0S9P;
import X.C0SED;
import X.C13BV;
import X.C13LP;
import X.C1606830rur;
import X.C1623606Xi;
import X.C2187451AjH;
import X.C2189821An6;
import X.C291001Au;
import X.C626160OhC;
import X.C627660Ojc;
import X.C709790Rsn;
import X.C712870Rxl;
import X.C713080Ry6;
import X.C726610Sep;
import X.C727530SgJ;
import X.C727550SgL;
import X.C730090SkR;
import X.C733280Spa;
import X.InterfaceC729460SjQ;
import android.content.Intent;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class AwS62S1000000_11 extends C09AY implements Function1 {
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
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS62S1000000_11(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        return C0RFV.LIZ((C0RFV) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(awS62S1000000_11.s0), null, null, null, null, null, null, 532676607);
    }

    public static final Object invoke$1(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        ((C062P) obj).LIZ = new C0R96(awS62S1000000_11.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        ((InterfaceC729460SjQ) obj).LJ(awS62S1000000_11.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        return C709790Rsn.LIZ((C709790Rsn) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(awS62S1000000_11.s0), -1, 0);
    }

    public static final Object invoke$12(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        return C709790Rsn.LIZ((C709790Rsn) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(awS62S1000000_11.s0), null, null, null, null, null, null, null, null, null, null, -4194305, 1);
    }

    public static final Object invoke$13(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        return C0RFV.LIZ((C0RFV) obj, null, null, null, null, null, null, new C291001Au(awS62S1000000_11.s0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870847);
    }

    public static final Object invoke$14(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        return C0RFV.LIZ((C0RFV) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(awS62S1000000_11.s0), 268435455);
    }

    public static final Object invoke$15(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        return C0RFV.LIZ((C0RFV) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(awS62S1000000_11.s0), null, null, null, 503316479);
    }

    public static final Object invoke$16(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        return C0RFV.LIZ((C0RFV) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(awS62S1000000_11.s0), null, null, null, null, 520093695);
    }

    public static final Object invoke$17(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        return C0S2L.LIZ((C0S2L) obj, null, null, null, null, null, awS62S1000000_11.s0, 0, 0, false, false, false, null, 4063);
    }

    public static final Object invoke$18(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        return C0S9P.LIZ((C0S9P) obj, 0, 0, false, false, false, false, null, false, null, null, null, false, 0, null, null, null, false, false, false, new C291001Au(awS62S1000000_11.s0), null, 0L, false, 31457279);
    }

    public static final Object invoke$19(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        C0S9P c0s9p = (C0S9P) obj;
        return C0S9P.LIZ(c0s9p, 0, 0, false, false, false, false, null, false, null, null, null, false, 0, null, null, null, false, false, false, null, awS62S1000000_11.s0, c0s9p.LLJJJJJIL + 1, false, 20971519);
    }

    public static final Object invoke$2(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        return C712870Rxl.LIZ((C712870Rxl) obj, null, null, null, null, awS62S1000000_11.s0, 15);
    }

    public static final Object invoke$3(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        C1606830rur c1606830rur = (C1606830rur) obj;
        c1606830rur.LIZIZ = awS62S1000000_11.s0;
        c1606830rur.LIZJ = "story_views_list_panel";
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        return C713080Ry6.LIZ((C713080Ry6) obj, awS62S1000000_11.s0, null, 2);
    }

    public static final Object invoke$5(AwS62S1000000_11 awS62S1000000_11, Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("account_type", awS62S1000000_11.s0);
        jSONObject.put("action_type", "show");
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        String stringExtra;
        Aweme aweme;
        DefaultLifecycleObserver defaultLifecycleObserver;
        LifecycleEventObserver lifecycleEventObserver;
        Intent intent = (Intent) obj;
        System.currentTimeMillis();
        Aweme aweme2 = null;
        try {
            stringExtra = intent.getStringExtra(FollowStatusChangeMethod.PARAM_UID);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        final C727550SgL c727550SgL = new C727550SgL();
        C2189821An6 c2189821An6 = new C2189821An6();
        c2189821An6.setFrom(awS62S1000000_11.s0);
        List<Aweme> listLIZIZ = C727530SgJ.LIZIZ(c727550SgL, c2189821An6);
        for (LifecycleObserver lifecycleObserver : c727550SgL.LL) {
            if ((lifecycleObserver instanceof LifecycleEventObserver) && (lifecycleEventObserver = (LifecycleEventObserver) lifecycleObserver) != null) {
                lifecycleEventObserver.onStateChanged(new LifecycleOwner(c727550SgL) { // from class: X.0SgM
                    public final Lifecycle LL;

                    @Override // androidx.lifecycle.LifecycleOwner
                    public final Lifecycle getLifecycle() {
                        return this.LL;
                    }

                    {
                        this.LL = c727550SgL;
                    }
                }, Lifecycle.Event.ON_DESTROY);
            }
            if ((lifecycleObserver instanceof DefaultLifecycleObserver) && (defaultLifecycleObserver = (DefaultLifecycleObserver) lifecycleObserver) != null) {
                defaultLifecycleObserver.onDestroy(new LifecycleOwner(c727550SgL) { // from class: X.0SgM
                    public final Lifecycle LL;

                    @Override // androidx.lifecycle.LifecycleOwner
                    public final Lifecycle getLifecycle() {
                        return this.LL;
                    }

                    {
                        this.LL = c727550SgL;
                    }
                });
            }
        }
        if (listLIZIZ != null) {
            if (stringExtra != null && stringExtra.length() != 0) {
                Iterator<Aweme> it2 = listLIZIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Aweme next = it2.next();
                    if (Intrinsics.LJFF(next.getAid(), stringExtra)) {
                        aweme2 = next;
                        break;
                    }
                }
                aweme = aweme2;
            } else {
                aweme = (Aweme) C13LP.LJJJLL(listLIZIZ);
            }
            if (aweme != null) {
                C727530SgJ.LIZJ(aweme);
            }
            int i = C2187451AjH.LIZ;
            System.currentTimeMillis();
            return CardStruct.IStatusCode.DEFAULT;
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$7(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        return C730090SkR.LIZ((C730090SkR) obj, new C627660Ojc(new C1623606Xi(new C626160OhC(false, false, 3)), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14), null, new C291001Au(new C0SED(awS62S1000000_11.s0, null, 0L, null, null, 26)), false, null, null, null, 0, 0, 0L, 0L, false, false, null, null, 32762);
    }

    public static final Object invoke$8(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        C733280Spa c733280Spa = (C733280Spa) obj;
        C291001Au c291001Au = new C291001Au(awS62S1000000_11.s0);
        C291001Au<Unit> c291001Au2 = c733280Spa.LLILLJJLI;
        c733280Spa.getClass();
        return new C733280Spa(c291001Au, c291001Au2);
    }

    public static final Object invoke$9(AwS62S1000000_11 awS62S1000000_11, Object obj) {
        return C726610Sep.LIZ((C726610Sep) obj, new C291001Au(C13BV.INSTANCE), awS62S1000000_11.s0, null, 12);
    }
}
