package kotlin.jvm.internal;

import X.C09AY;
import X.C0C39;
import X.C0J97;
import X.C10ID;
import X.C1128704bF;
import X.C1720106oR;
import X.C1901540zaC;
import X.C1904150zeP;
import X.C1904200zeU;
import X.C1904220zeW;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2252408s6;
import X.C786410Ut5;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.cache.PreloadManager;
import com.ss.android.ugc.aweme.inbox.land.LandInboxExperiment;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.repo.api.NotificationApi$INotificationApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class AwS63S0001000_28 extends C09AY implements Function0 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1022i0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS63S0001000_28 awS63S0001000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keyboard change height ");
        sbLIZ.append(awS63S0001000_28.f1022i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS63S0001000_28 awS63S0001000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keyboard open ");
        sbLIZ.append(awS63S0001000_28.f1022i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS63S0001000_28 awS63S0001000_28) {
        boolean z;
        if (awS63S0001000_28.f1022i0 > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AwS63S0001000_28 awS63S0001000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Freq] debug ignore strategy=");
        sbLIZ.append(awS63S0001000_28.f1022i0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS63S0001000_28 awS63S0001000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Freq] release strategy=");
        sbLIZ.append(awS63S0001000_28.f1022i0);
        sbLIZ.append(" sentToday=");
        sbLIZ.append(C10ID.LJII());
        sbLIZ.append(" sentThisWeek=");
        sbLIZ.append(C10ID.LJI());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS63S0001000_28 awS63S0001000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Freq] reserve ok strategy=");
        sbLIZ.append(awS63S0001000_28.f1022i0);
        sbLIZ.append(" sentToday=");
        sbLIZ.append(C10ID.LJII());
        sbLIZ.append(" sentThisWeek=");
        sbLIZ.append(C10ID.LJI());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS63S0001000_28 awS63S0001000_28) {
        boolean z;
        boolean z2;
        String imprId;
        int i;
        int i2;
        boolean zLJI = MethodIDManager.LJI(196647);
        boolean zLJI2 = MethodIDManager.LJI(196647);
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch start thread=");
        sbLIZ.append(C786410Ut5.u3());
        C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ));
        C1904220zeW.LL.getClass();
        if (((Boolean) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZJ(Boolean.TRUE, "following_inbox_bubble_enable")).booleanValue() && (((i = awS63S0001000_28.f1022i0) == 1 || i == 10 || i == 11) && 2 <= (i2 = ((C0J97) C1904220zeW.LLILLL.getValue()).LIZ) && i2 < 4)) {
            z = true;
        } else {
            z = false;
        }
        int i4 = awS63S0001000_28.f1022i0;
        String strLIZIZ = C1901540zaC.LIZIZ();
        boolean zLIZ = C0C39.LIZ();
        C1904150zeP.LIZ.getClass();
        int iLIZ = LandInboxExperiment.LIZ();
        if (1 <= iLIZ && iLIZ < 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLJI3 = MethodIDManager.LJI(202223);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("query notice/count, source=");
        sbLIZ2.append(i4);
        C1720106oR.LJI("NotificationApi", C2188811AlT.LIZIZ(sbLIZ2));
        NoticeList noticeList = ((NotificationApi$INotificationApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C1128704bF.LIZ).create(NotificationApi$INotificationApi.class)).query(i4, strLIZIZ, z, zLIZ, z2).execute().LIZIZ;
        if (zLJI3) {
            MethodIDManager.LJ();
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("fetch end ");
        LogPbBean logPb = noticeList.getLogPb();
        if (logPb != null) {
            imprId = logPb.getImprId();
        } else {
            imprId = null;
        }
        sbLIZ3.append(imprId);
        C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ3));
        int i5 = awS63S0001000_28.f1022i0;
        if (i5 == 12) {
            C2252408s6.LJIIJ("fetchNoticeCount_push", new AwS144S0101000_4(noticeList, i5, 2));
            if (zLJI2) {
                MethodIDManager.LJ();
            }
        } else {
            C2252408s6.LJIIJ("handleNoticeCountData", new C1904200zeU(noticeList, i5));
            PreloadManager.LIZLLL(noticeList, awS63S0001000_28.f1022i0);
            C1904150zeP.LJI(noticeList.getLatestUnreadNoticeTime(), "notice/count");
            if (zLJI2) {
                MethodIDManager.LJ();
            }
        }
        Unit unit = Unit.LIZ;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return unit;
    }

    public static final Object invoke$7(AwS63S0001000_28 awS63S0001000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Reconcile] already clicked strategy=");
        sbLIZ.append(awS63S0001000_28.f1022i0);
        sbLIZ.append(" clear pending");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS63S0001000_28(int i, int i2) {
        super(0);
        this.$t = i2;
        this.f1022i0 = i;
    }
}
