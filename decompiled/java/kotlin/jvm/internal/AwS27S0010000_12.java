package kotlin.jvm.internal;

import X.AbstractC1250290idn;
import X.C09AY;
import X.C0U22;
import X.C1125820fP2;
import X.C1125840fP4;
import X.C1133120fao;
import X.C1133160fas;
import X.C1251150ifB;
import X.C1819630xS5;
import X.C2639010j;
import X.C773210UUt;
import X.C774330UZb;
import X.C784490Upz;
import android.os.SystemClock;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.creator.RoomCreatorBizInfoResponse;

/* JADX INFO: loaded from: classes13.dex */
public class AwS27S0010000_12 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S0010000_12(int i) {
        super(1);
        this.$t = i;
        this.z0 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S0010000_12(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AwS27S0010000_12 awS27S0010000_12, Object obj) {
        String str;
        C773210UUt c773210UUt = (C773210UUt) obj;
        if (awS27S0010000_12.z0) {
            str = "user_event_pause_click";
        } else {
            str = "user_event_resume_click";
        }
        c773210UUt.LJIIJJI(str, "");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS27S0010000_12 awS27S0010000_12, Object obj) {
        LiveStreamGoal liveStreamGoal;
        long j;
        Integer numValueOf;
        C784490Upz c784490Upz;
        C784490Upz c784490Upz2;
        RoomCreatorBizInfoResponse.BizInfoData bizInfoData;
        RoomCreatorBizInfoResponse.BizInfoData.BizInfoLiveGoalGet bizInfoLiveGoalGet;
        C774330UZb c774330UZb = (C774330UZb) obj;
        CopyOnWriteArrayList<C1125840fP4> copyOnWriteArrayList = C1125820fP2.LIZ;
        String str = null;
        if (c774330UZb != null && (bizInfoData = c774330UZb.LIZ) != null && (bizInfoLiveGoalGet = bizInfoData.liveGoalGetData) != null) {
            liveStreamGoal = bizInfoLiveGoalGet.ongoingGoal;
        } else {
            liveStreamGoal = null;
        }
        C1125820fP2.LJIIIIZZ(liveStreamGoal);
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (c774330UZb != null && (c784490Upz2 = c774330UZb.LIZIZ) != null) {
            j = c784490Upz2.LIZ;
        } else {
            j = 0;
        }
        long j2 = jUptimeMillis - j;
        boolean z = awS27S0010000_12.z0;
        if (c774330UZb != null && (c784490Upz = c774330UZb.LIZIZ) != null) {
            numValueOf = Integer.valueOf(c784490Upz.LIZIZ);
        } else {
            numValueOf = null;
            if (c774330UZb != null) {
            }
            C2639010j.LIZIZ(j2, numValueOf, str, z);
            return Unit.LIZ;
        }
        C784490Upz c784490Upz3 = c774330UZb.LIZIZ;
        if (c784490Upz3 != null) {
            str = c784490Upz3.LIZJ;
        }
        C2639010j.LIZIZ(j2, numValueOf, str, z);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS27S0010000_12 awS27S0010000_12, Object obj) {
        long j;
        Throwable th;
        C784490Upz c784490Upz = (C784490Upz) obj;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (c784490Upz != null) {
            j = c784490Upz.LIZ;
        } else {
            j = 0;
        }
        long j2 = jUptimeMillis - j;
        if (c784490Upz != null) {
            th = c784490Upz.LIZLLL;
        } else {
            th = null;
        }
        C1133120fao c1133120faoLIZ = C1133160fas.LIZ(th);
        C2639010j.LIZIZ(j2, Integer.valueOf(c1133120faoLIZ.LIZ), "", awS27S0010000_12.z0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS27S0010000_12 awS27S0010000_12, Object obj) {
        return C1819630xS5.LIZ((C1819630xS5) obj, awS27S0010000_12.z0, false, null, null, null, 30);
    }

    public static final Object invoke$4(AwS27S0010000_12 awS27S0010000_12, Object obj) {
        return C1819630xS5.LIZ((C1819630xS5) obj, false, awS27S0010000_12.z0, null, null, null, 29);
    }

    public static final Object invoke$5(AwS27S0010000_12 awS27S0010000_12, Object obj) {
        return ((C0U22) obj).LIZLLL(awS27S0010000_12.z0);
    }

    public static final Object invoke$6(AwS27S0010000_12 awS27S0010000_12, Object obj) {
        return ((C0U22) obj).LJI(awS27S0010000_12.z0);
    }

    public static final Object invoke$7(AwS27S0010000_12 awS27S0010000_12, Object obj) {
        ((C1251150ifB) ((AbstractC1250290idn) obj)).LJI = awS27S0010000_12.z0;
        return Unit.LIZ;
    }
}
