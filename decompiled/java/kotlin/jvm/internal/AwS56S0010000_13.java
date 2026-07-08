package kotlin.jvm.internal;

import X.C036E;
import X.C09AY;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C20648087a;
import X.C2188811AlT;
import X.C2261941Dg8;
import X.C810670Vr7;
import X.C814390Vx7;
import X.C818880WAk;
import X.C844470XAv;
import X.C845400XEk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS56S0010000_13 extends C09AY implements Function0 {
    public final int $t;
    public boolean z0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS56S0010000_13 awS56S0010000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInterceptTouchEvent: last dispatch handled=");
        sbLIZ.append(awS56S0010000_13.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS56S0010000_13 awS56S0010000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchNestedFling: result=");
        sbLIZ.append(awS56S0010000_13.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(AwS56S0010000_13 awS56S0010000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExitProcessor checkHitStrategyRealtime ---> shouldExit: ");
        sbLIZ.append(awS56S0010000_13.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS56S0010000_13 awS56S0010000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchNestedPreFling: result=");
        sbLIZ.append(awS56S0010000_13.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS56S0010000_13 awS56S0010000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fling: result=");
        sbLIZ.append(awS56S0010000_13.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS56S0010000_13 awS56S0010000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchTouchEvent: first dispatch handled=");
        sbLIZ.append(awS56S0010000_13.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS56S0010000_13 awS56S0010000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInterceptTouchEvent: last dispatch handled=");
        sbLIZ.append(awS56S0010000_13.z0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS56S0010000_13 awS56S0010000_13) throws Throwable {
        Object firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(C818880WAk.LIZIZ());
        }
        boolean zBooleanValue = awS56S0010000_13.z0;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyQdp1HqHmhUw2mMY/0359FB66bat8LW1FBwVfwXl8Q+gfSmZi82empATVd5Fb/", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {Boolean.valueOf(zBooleanValue)};
        C0WZW c0wzw = new C0WZW(false, "(Z)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11038, "com/google/firebase/messaging/FirebaseMessaging", "setDeliveryMetricsExportToBigQuery", firebaseMessaging, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11038, "com/google/firebase/messaging/FirebaseMessaging", "setDeliveryMetricsExportToBigQuery", null, objArr, firebaseMessaging, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    firebaseMessaging = obj;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    zBooleanValue = ((Boolean) obj2).booleanValue();
                }
            }
            firebaseMessaging.getClass();
            C818880WAk c818880WAkLIZIZ = C818880WAk.LIZIZ();
            c818880WAkLIZIZ.LIZ();
            C810670Vr7.LIZJ(c818880WAkLIZIZ.LIZ, 0, "com.google.firebase.messaging").edit().putBoolean("export_to_big_query", zBooleanValue).apply();
            c0wst.LIZ(11038, "com/google/firebase/messaging/FirebaseMessaging", "setDeliveryMetricsExportToBigQuery", null, objArr, firebaseMessaging, c0wzw, true);
        }
        return C814390Vx7.LIZ(Unit.LIZ);
    }

    public static final Object invoke$7(AwS56S0010000_13 awS56S0010000_13) {
        String str;
        if (awS56S0010000_13.z0) {
            str = "background_count_by_others";
        } else {
            str = "foreground_count_by_others";
        }
        C2261941Dg8.LIZ.getClass();
        C2261941Dg8.LIZIZ().storeInt(str, C2261941Dg8.LIZIZ().getInt(str, 0) + 1);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS56S0010000_13 awS56S0010000_13) {
        String str;
        if (awS56S0010000_13.z0) {
            str = "background_count_by_network";
        } else {
            str = "foreground_count_by_network";
        }
        C2261941Dg8.LIZ.getClass();
        C2261941Dg8.LIZIZ().storeInt(str, C2261941Dg8.LIZIZ().getInt(str, 0) + 1);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS56S0010000_13 awS56S0010000_13) {
        boolean zLIZIZ;
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (zLIZIZ) {
            C20648087a.LIZ(new AwS56S0010000_13(awS56S0010000_13.z0, 7));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[storeDisconnectedCount], isAppBackground = ");
            sbLIZ.append(awS56S0010000_13.z0);
            sbLIZ.append(", disconnected caused by other reason");
            C845400XEk.LIZIZ("WsOnlineRateMonitor", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C20648087a.LIZ(new AwS56S0010000_13(awS56S0010000_13.z0, 8));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[storeDisconnectedCount], isAppBackground = ");
            sbLIZ2.append(awS56S0010000_13.z0);
            sbLIZ2.append(", disconnected caused by unavailable network");
            C845400XEk.LIZIZ("WsOnlineRateMonitor", C2188811AlT.LIZIZ(sbLIZ2));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS56S0010000_13(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
