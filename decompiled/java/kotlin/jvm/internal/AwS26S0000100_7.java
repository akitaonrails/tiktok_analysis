package kotlin.jvm.internal;

import X.C09AY;
import X.C0KXJ;
import X.C473720Ihu;
import X.C477500Io0;
import X.C477680IoI;
import X.C477860Ioa;
import X.C477910Iof;
import X.C781270Ukn;
import X.RunnableC519060KXg;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.live.skylight.tooltip.ToolTipInteractRecord;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AwS26S0000100_7 extends C09AY implements Function1 {
    public final int $t;
    public long j0;

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
    public AwS26S0000100_7(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AwS26S0000100_7 awS26S0000100_7, Object obj) {
        String string;
        Throwable th = (Throwable) obj;
        C477500Io0.LIZ.getClass();
        C477500Io0.LJIILLIIL("MultiTopLiveInteractAssem", "topModuleAssem fetch feedItems failed", th);
        C477680IoI c477680IoILJIJ = C477500Io0.LJIJ(th);
        long jCurrentTimeMillis = System.currentTimeMillis() - awS26S0000100_7.j0;
        String str = c477680IoILJIJ.LIZJ;
        if (str == null) {
            str = "";
        }
        Integer num = c477680IoILJIJ.LIZ;
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        C477860Ioa.LJIIL(new C477910Iof("top_module_room", "MultiTopLiveInteractModuleAssem#enterRoomByRealtimeData, onFailed", jCurrentTimeMillis, "error", str, string, c477680IoILJIJ.LIZIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS26S0000100_7 awS26S0000100_7, Object obj) {
        long id;
        Integer numValueOf;
        SparkContext sparkContext = (SparkContext) obj;
        sparkContext.LJJJZ("event_id", String.valueOf(awS26S0000100_7.j0));
        User userLIZIZ = C0KXJ.LIZIZ();
        if (userLIZIZ != null) {
            id = userLIZIZ.getId();
        } else {
            id = 0;
        }
        sparkContext.LJJJZ("user_id", String.valueOf(id));
        IHostAppContext iHostAppContextLJIIJJI = C781270Ukn.LJIIJJI();
        if (iHostAppContextLJIIJJI != null) {
            numValueOf = Integer.valueOf(iHostAppContextLJIIJJI.appId());
        } else {
            numValueOf = null;
        }
        sparkContext.LJJJZ("aid", String.valueOf(numValueOf));
        sparkContext.LJJJZ("live_event_enter_from", "live_preview_page");
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS26S0000100_7 awS26S0000100_7, Object obj) {
        boolean z;
        RunnableC519060KXg runnableC519060KXg = (RunnableC519060KXg) obj;
        if (awS26S0000100_7.j0 - runnableC519060KXg.LLILZ > runnableC519060KXg.LL.LLILZLL) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$11(AwS26S0000100_7 awS26S0000100_7, Object obj) {
        boolean z;
        if (((RunnableC519060KXg) obj).LLILLJJLI == awS26S0000100_7.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$12(AwS26S0000100_7 awS26S0000100_7, Object obj) {
        long id;
        Integer numValueOf;
        SparkContext sparkContext = (SparkContext) obj;
        sparkContext.LJJJZ("event_id", String.valueOf(awS26S0000100_7.j0));
        User userLIZIZ = C0KXJ.LIZIZ();
        if (userLIZIZ != null) {
            id = userLIZIZ.getId();
        } else {
            id = 0;
        }
        sparkContext.LJJJZ("user_id", String.valueOf(id));
        IHostAppContext iHostAppContextLJIIJJI = C781270Ukn.LJIIJJI();
        if (iHostAppContextLJIIJJI != null) {
            numValueOf = Integer.valueOf(iHostAppContextLJIIJJI.appId());
        } else {
            numValueOf = null;
        }
        sparkContext.LJJJZ("aid", String.valueOf(numValueOf));
        sparkContext.LJJJZ("live_event_enter_from", "live_preview_page");
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS26S0000100_7 awS26S0000100_7, Object obj) {
        boolean z;
        Room room = ((FeedItem) obj).getRoom();
        if (room != null && room.getId() == awS26S0000100_7.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS26S0000100_7 awS26S0000100_7, Object obj) {
        long id;
        Integer numValueOf;
        SparkContext sparkContext = (SparkContext) obj;
        sparkContext.LJJJZ("event_id", String.valueOf(awS26S0000100_7.j0));
        User userLIZIZ = C0KXJ.LIZIZ();
        if (userLIZIZ != null) {
            id = userLIZIZ.getId();
        } else {
            id = 0;
        }
        sparkContext.LJJJZ("user_id", String.valueOf(id));
        IHostAppContext iHostAppContextLJIIJJI = C781270Ukn.LJIIJJI();
        if (iHostAppContextLJIIJJI != null) {
            numValueOf = Integer.valueOf(iHostAppContextLJIIJJI.appId());
        } else {
            numValueOf = null;
        }
        sparkContext.LJJJZ("aid", String.valueOf(numValueOf));
        sparkContext.LJJJZ("live_event_enter_from", "live_preview_page");
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS26S0000100_7 awS26S0000100_7, Object obj) {
        long id;
        Integer numValueOf;
        SparkContext sparkContext = (SparkContext) obj;
        sparkContext.LJJJZ("event_id", String.valueOf(awS26S0000100_7.j0));
        User userLIZIZ = C0KXJ.LIZIZ();
        if (userLIZIZ != null) {
            id = userLIZIZ.getId();
        } else {
            id = 0;
        }
        sparkContext.LJJJZ("user_id", String.valueOf(id));
        IHostAppContext iHostAppContextLJIIJJI = C781270Ukn.LJIIJJI();
        if (iHostAppContextLJIIJJI != null) {
            numValueOf = Integer.valueOf(iHostAppContextLJIIJJI.appId());
        } else {
            numValueOf = null;
        }
        sparkContext.LJJJZ("aid", String.valueOf(numValueOf));
        sparkContext.LJJJZ("live_event_enter_from", "live_preview_page");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS26S0000100_7 awS26S0000100_7, Object obj) {
        long id;
        Integer numValueOf;
        SparkContext sparkContext = (SparkContext) obj;
        sparkContext.LJJJZ("event_id", String.valueOf(awS26S0000100_7.j0));
        User userLIZIZ = C0KXJ.LIZIZ();
        if (userLIZIZ != null) {
            id = userLIZIZ.getId();
        } else {
            id = 0;
        }
        sparkContext.LJJJZ("user_id", String.valueOf(id));
        IHostAppContext iHostAppContextLJIIJJI = C781270Ukn.LJIIJJI();
        if (iHostAppContextLJIIJJI != null) {
            numValueOf = Integer.valueOf(iHostAppContextLJIIJJI.appId());
        } else {
            numValueOf = null;
        }
        sparkContext.LJJJZ("aid", String.valueOf(numValueOf));
        sparkContext.LJJJZ("live_event_enter_from", "live_preview_page");
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS26S0000100_7 awS26S0000100_7, Object obj) {
        boolean z;
        if (awS26S0000100_7.j0 - ((ToolTipInteractRecord) obj).showTimeStamps > C473720Ihu.LIZ) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$6(AwS26S0000100_7 awS26S0000100_7, Object obj) {
        boolean z;
        if (awS26S0000100_7.j0 - ((ToolTipInteractRecord) obj).showTimeStamps > C473720Ihu.LIZ) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$7(AwS26S0000100_7 awS26S0000100_7, Object obj) {
        boolean z;
        if (awS26S0000100_7.j0 - ((ToolTipInteractRecord) obj).showTimeStamps > C473720Ihu.LIZ) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$8(AwS26S0000100_7 awS26S0000100_7, Object obj) {
        boolean z;
        if (awS26S0000100_7.j0 - ((ToolTipInteractRecord) obj).showTimeStamps > C473720Ihu.LIZ) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$9(AwS26S0000100_7 awS26S0000100_7, Object obj) {
        boolean z;
        RunnableC519060KXg runnableC519060KXg = (RunnableC519060KXg) obj;
        if (awS26S0000100_7.j0 - runnableC519060KXg.LLILZ > runnableC519060KXg.LL.LLILZLL) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
