package kotlin.jvm.internal;

import X.C09AY;
import X.C0JC4;
import X.C0JC5;
import X.C0JHK;
import X.C0JHL;
import X.C0KCH;
import X.C0WZX;
import X.C1124140fMK;
import X.C1161920gLG;
import X.C1701330uNH;
import X.C19EG;
import X.C2204961BRm;
import X.C291001Au;
import X.C479390Ir3;
import X.C479490IrD;
import X.C482500Iw4;
import X.C482550Iw9;
import X.C488470JDp;
import X.C488550JDx;
import X.C513800KDa;
import X.EnumC479370Ir1;
import X.EnumC482480Iw2;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AwS58S1000000_7 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS58S1000000_7(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS58S1000000_7 awS58S1000000_7, Object obj) {
        return C0JC4.LIZ((C0JC4) obj, new C291001Au(awS58S1000000_7.s0), null, null, null, 0.0f, 61);
    }

    public static final Object invoke$1(AwS58S1000000_7 awS58S1000000_7, Object obj) throws Throwable {
        C19EG c19egLIZ;
        Intent intentCreateStartBroadcastIntent;
        Context context = (Context) obj;
        if (context != null) {
            c19egLIZ = C1124140fMK.LIZ(context);
        } else {
            c19egLIZ = null;
        }
        if (!Intrinsics.LJFF(awS58S1000000_7.s0, "live_studio") && !Intrinsics.LJFF(awS58S1000000_7.s0, "screen_share")) {
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext != null) {
                iHostAppContext.openQrScannerPage(c19egLIZ);
            }
            if (c19egLIZ != null) {
                c19egLIZ.finish();
            }
        } else if (c19egLIZ != null) {
            IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (iHostAction != null && (intentCreateStartBroadcastIntent = iHostAction.createStartBroadcastIntent(c19egLIZ, 6)) != null) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19egLIZ, intentCreateStartBroadcastIntent, "Context_startActivity_1");
                C1701330uNH.LIZ(intentCreateStartBroadcastIntent, c19egLIZ);
                C2204961BRm.LLJJJJ(c19egLIZ, intentCreateStartBroadcastIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5P9FjWjGGNP7Glx35bkDLCY+17iBNX1AY0zw9Z0TLvA==", null));
            }
            c19egLIZ.finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS58S1000000_7 awS58S1000000_7, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((Pair) obj).getFirst(), awS58S1000000_7.s0));
    }

    public static final Object invoke$11(AwS58S1000000_7 awS58S1000000_7, Object obj) {
        String string;
        Room room = ((FeedItem) obj).getRoom();
        if (room != null) {
            string = Long.valueOf(room.getOwnerUserId()).toString();
        } else {
            string = null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(string, awS58S1000000_7.s0));
    }

    public static final Object invoke$2(AwS58S1000000_7 awS58S1000000_7, Object obj) {
        EnumC479370Ir1 enumC479370Ir1;
        C479490IrD c479490IrD = (C479490IrD) obj;
        C479390Ir3 c479390Ir3 = EnumC479370Ir1.Companion;
        String str = awS58S1000000_7.s0;
        c479390Ir3.getClass();
        EnumC479370Ir1[] enumC479370Ir1ArrValues = EnumC479370Ir1.values();
        int length = enumC479370Ir1ArrValues.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC479370Ir1 = enumC479370Ir1ArrValues[i];
                if (Intrinsics.LJFF(enumC479370Ir1.getValue(), str)) {
                    break;
                }
                i++;
            } else {
                enumC479370Ir1 = EnumC479370Ir1.DEFAULT;
                break;
            }
        }
        return C479490IrD.LIZ(c479490IrD, null, enumC479370Ir1, null, false, null, 61);
    }

    public static final Object invoke$3(AwS58S1000000_7 awS58S1000000_7, Object obj) {
        List<PGCSubscriptionProductDetailWithTemplateInfo> list;
        Map<String, List<PGCSubscriptionProductDetailWithTemplateInfo>> map;
        C513800KDa c513800KDa = (C513800KDa) obj;
        String str = awS58S1000000_7.s0;
        C0KCH c0kch = c513800KDa.LLILLJJLI;
        if (c0kch != null && (map = c0kch.LIZ) != null) {
            list = map.get(str);
        } else {
            list = null;
        }
        return C513800KDa.LIZ(c513800KDa, null, null, new Pair(str, list), null, null, null, null, 503);
    }

    public static final Object invoke$4(AwS58S1000000_7 awS58S1000000_7, Object obj) {
        EnumC482480Iw2 enumC482480Iw2;
        C482550Iw9 c482550Iw9 = (C482550Iw9) obj;
        C482500Iw4 c482500Iw4 = EnumC482480Iw2.Companion;
        String str = awS58S1000000_7.s0;
        c482500Iw4.getClass();
        EnumC482480Iw2[] enumC482480Iw2ArrValues = EnumC482480Iw2.values();
        int length = enumC482480Iw2ArrValues.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC482480Iw2 = enumC482480Iw2ArrValues[i];
                if (Intrinsics.LJFF(enumC482480Iw2.getValue(), str)) {
                    break;
                }
                i++;
            } else {
                enumC482480Iw2 = EnumC482480Iw2.DEFAULT;
                break;
            }
        }
        return C482550Iw9.LIZ(c482550Iw9, null, enumC482480Iw2, 1);
    }

    public static final Object invoke$5(AwS58S1000000_7 awS58S1000000_7, Object obj) {
        return C0JC5.LIZ((C0JC5) obj, new C291001Au(awS58S1000000_7.s0), null, null, null, 0.0f, 61);
    }

    public static final Object invoke$6(AwS58S1000000_7 awS58S1000000_7, Object obj) {
        C488470JDp c488470JDp;
        C488550JDx c488550JDx = (C488550JDx) obj;
        C488470JDp c488470JDp2 = c488550JDx.LLJ;
        if (c488470JDp2 != null) {
            c488470JDp = new C488470JDp(c488470JDp2.LIZ, awS58S1000000_7.s0);
        } else {
            c488470JDp = new C488470JDp(null, awS58S1000000_7.s0, 1);
        }
        return C488550JDx.LIZ(c488550JDx, null, null, null, null, null, null, false, false, c488470JDp, null, null, 0, 3839);
    }

    public static final Object invoke$7(AwS58S1000000_7 awS58S1000000_7, Object obj) {
        C488470JDp c488470JDp;
        C488550JDx c488550JDx = (C488550JDx) obj;
        C488470JDp c488470JDp2 = c488550JDx.LLJ;
        if (c488470JDp2 != null) {
            c488470JDp = new C488470JDp(awS58S1000000_7.s0, c488470JDp2.LIZIZ);
        } else {
            c488470JDp = new C488470JDp(awS58S1000000_7.s0, null, 2);
        }
        return C488550JDx.LIZ(c488550JDx, null, null, null, null, null, null, false, false, c488470JDp, null, null, 0, 3839);
    }

    public static final Object invoke$8(AwS58S1000000_7 awS58S1000000_7, Object obj) {
        return C0JHK.LIZ((C0JHK) obj, null, null, awS58S1000000_7.s0, 3);
    }

    public static final Object invoke$9(AwS58S1000000_7 awS58S1000000_7, Object obj) {
        return C0JHL.LIZ((C0JHL) obj, null, null, null, false, null, awS58S1000000_7.s0, 31);
    }
}
