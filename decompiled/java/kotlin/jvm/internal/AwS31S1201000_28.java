package kotlin.jvm.internal;

import X.C09AY;
import X.C1893670zNV;
import X.C1893680zNW;
import X.C1894700zPA;
import X.C1895700zQm;
import X.C1896750zST;
import X.C1896810zSZ;
import X.C20484080s;
import X.C2189821An6;
import X.C259800zU;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.touchpoint.api.service.IWatchVideoService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public class AwS31S1201000_28 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, X.0zNV] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$0(AwS31S1201000_28 awS31S1201000_28) {
        TouchPoint touchPoint = (TouchPoint) C20484080s.LIZ(awS31S1201000_28.s0, TouchPoint.class);
        ((C1894700zPA) awS31S1201000_28.l1).LIZJ.put(Integer.valueOf(touchPoint.touchPointId), touchPoint);
        ((C259800zU) awS31S1201000_28.l2).element = ((C1894700zPA) awS31S1201000_28.l1).LJII(touchPoint);
        if (((C259800zU) awS31S1201000_28.l2).element == 0) {
            C1893670zNV c1893670zNV = new C1893670zNV();
            c1893670zNV.LIZ = awS31S1201000_28.i3;
            c1893670zNV.LIZJ = touchPoint.launchPlanId;
            C1893680zNW.LJIIJ(C1893680zNW.LIZ, c1893670zNV);
        }
        C1894700zPA c1894700zPA = (C1894700zPA) awS31S1201000_28.l1;
        int i = awS31S1201000_28.i3;
        T t = ((C259800zU) awS31S1201000_28.l2).element;
        c1894700zPA.LJIIIIZZ.put(Integer.valueOf(i), (C1893670zNV) t);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS31S1201000_28 awS31S1201000_28) {
        String eventType;
        long duration;
        C1895700zQm c1895700zQm = C1895700zQm.LIZ;
        Aweme aweme = (Aweme) awS31S1201000_28.l1;
        String str = awS31S1201000_28.s0;
        C2189821An6 c2189821An6 = (C2189821An6) awS31S1201000_28.l2;
        int i = awS31S1201000_28.i3;
        c1895700zQm.getClass();
        if (aweme != null) {
            IWatchVideoService iWatchVideoService = (IWatchVideoService) ServiceManager.get().getService(IWatchVideoService.class);
            C1896810zSZ c1896810zSZ = new C1896810zSZ();
            String strLIZ = C1895700zQm.LIZ(str);
            c1896810zSZ.LIZ = C1896750zST.LIZIZ(i);
            String str2 = "";
            if (c2189821An6 == null || (eventType = c2189821An6.getEventType()) == null) {
                eventType = "";
            }
            if (Intrinsics.LJFF(eventType, "paid_series_detail_page")) {
                c1896810zSZ.LIZ = "drama";
            }
            c1896810zSZ.LIZIZ = aweme.isAd();
            c1896810zSZ.LIZJ = aweme.getAwemeType();
            c1896810zSZ.LIZLLL = true;
            Video video = aweme.getVideo();
            if (video != null) {
                duration = video.getDuration();
            } else {
                duration = 0;
            }
            c1896810zSZ.LJII = duration;
            c1896810zSZ.LJ = strLIZ;
            String aid = aweme.getAid();
            if (aid != null) {
                str2 = aid;
            }
            c1896810zSZ.LJIIJ = str2;
            iWatchVideoService.LIZLLL(c1896810zSZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S1201000_28(String str, C1894700zPA c1894700zPA, C259800zU c259800zU, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1894700zPA;
        this.l2 = c259800zU;
        this.i3 = 93;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S1201000_28(int i, Aweme aweme, C2189821An6 c2189821An6, String str, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = aweme;
        this.s0 = str;
        this.l2 = c2189821An6;
        this.i3 = i;
    }
}
