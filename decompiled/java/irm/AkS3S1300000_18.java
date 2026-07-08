package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C098200Yq;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1185410gx9;
import X.C1186070gyD;
import X.C1252710ihh;
import X.C13LE;
import X.C1558520qew;
import X.C189200o6;
import X.InterfaceC1184330gvP;
import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.hotel.PoiDetailHotelHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.model.PoiCurrentSessionInfo;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public class AkS3S1300000_18 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS3S1300000_18 akS3S1300000_18, View view) {
        Object c098200Yq;
        String initialPoiId;
        String initialPoiFromGroupId;
        String initialEnterFrom;
        String initialEnterMethod;
        String str;
        String fromGroupId;
        C1184480gve c1184480gve;
        String str2;
        C1184480gve c1184480gve2;
        String str3 = null;
        try {
            c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ((PoiDetailHeaderAssem) akS3S1300000_18.l1, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
        C1186070gyD c1186070gyD = C1186070gyD.LIZ;
        Context context = ((View) akS3S1300000_18.l2).getContext();
        if (c1185410gx9 != null) {
            initialPoiId = c1185410gx9.getInitialPoiId();
        } else {
            initialPoiId = null;
        }
        String str4 = "";
        if (initialPoiId == null) {
            initialPoiId = "";
        }
        if (c1185410gx9 == null || (initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId()) == null) {
            initialPoiFromGroupId = "";
        }
        if (c1185410gx9 == null || (initialEnterFrom = c1185410gx9.getInitialEnterFrom()) == null) {
            initialEnterFrom = "";
        }
        if (c1185410gx9 == null || (initialEnterMethod = c1185410gx9.getInitialEnterMethod()) == null) {
            initialEnterMethod = "";
        }
        C1184460gvc c1184460gvcOo = ((PoiDetailHeaderAssem) akS3S1300000_18.l1).Oo();
        if (c1184460gvcOo == null || (c1184480gve2 = c1184460gvcOo.LLILLL) == null || (str = c1184480gve2.LL) == null) {
            str = "";
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailHeaderAssem) akS3S1300000_18.l1).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null && (str2 = c1184480gve.LLILLJJLI) != null) {
            str4 = str2;
        }
        if (c1185410gx9 != null) {
            fromGroupId = c1185410gx9.getFromGroupId();
        } else {
            fromGroupId = null;
        }
        PoiCurrentSessionInfo poiCurrentSessionInfoDp = ((PoiDetailHeaderAssem) akS3S1300000_18.l1).dp();
        if (poiCurrentSessionInfoDp != null) {
            str3 = poiCurrentSessionInfoDp.poiSessionId;
        }
        C1186070gyD.LIZLLL(c1186070gyD, context, akS3S1300000_18.s0, (PoiListApi.PoiDetailResponse) akS3S1300000_18.l3, initialPoiId, initialPoiFromGroupId, initialEnterFrom, initialEnterMethod, str, str4, "header_no_reviews", fromGroupId, new AwS562S0100000_18((PoiDetailHeaderAssem) akS3S1300000_18.l1, 1001), str3, C1558520qew.LJIIL((PoiDetailHeaderAssem) akS3S1300000_18.l1), ((PoiDetailHeaderAssem) akS3S1300000_18.l1).Zo());
    }

    public static final void LIZ$1(AkS3S1300000_18 akS3S1300000_18, View view) {
        Object c098200Yq;
        String initialPoiId;
        String initialPoiFromGroupId;
        String initialEnterFrom;
        String initialEnterMethod;
        String str;
        String fromGroupId;
        C1184480gve c1184480gve;
        String str2;
        C1184480gve c1184480gve2;
        String str3 = null;
        try {
            c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ((PoiDetailHotelHeaderAssem) akS3S1300000_18.l1, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1185410gx9 c1185410gx9 = (C1185410gx9) c098200Yq;
        C1186070gyD c1186070gyD = C1186070gyD.LIZ;
        Context context = ((View) akS3S1300000_18.l2).getContext();
        if (c1185410gx9 != null) {
            initialPoiId = c1185410gx9.getInitialPoiId();
        } else {
            initialPoiId = null;
        }
        String str4 = "";
        if (initialPoiId == null) {
            initialPoiId = "";
        }
        if (c1185410gx9 == null || (initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId()) == null) {
            initialPoiFromGroupId = "";
        }
        if (c1185410gx9 == null || (initialEnterFrom = c1185410gx9.getInitialEnterFrom()) == null) {
            initialEnterFrom = "";
        }
        if (c1185410gx9 == null || (initialEnterMethod = c1185410gx9.getInitialEnterMethod()) == null) {
            initialEnterMethod = "";
        }
        C1184460gvc c1184460gvcOo = ((PoiDetailHotelHeaderAssem) akS3S1300000_18.l1).Oo();
        if (c1184460gvcOo == null || (c1184480gve2 = c1184460gvcOo.LLILLL) == null || (str = c1184480gve2.LL) == null) {
            str = "";
        }
        C1184460gvc c1184460gvcOo2 = ((PoiDetailHotelHeaderAssem) akS3S1300000_18.l1).Oo();
        if (c1184460gvcOo2 != null && (c1184480gve = c1184460gvcOo2.LLILLL) != null && (str2 = c1184480gve.LLILLJJLI) != null) {
            str4 = str2;
        }
        if (c1185410gx9 != null) {
            fromGroupId = c1185410gx9.getFromGroupId();
        } else {
            fromGroupId = null;
        }
        PoiCurrentSessionInfo poiCurrentSessionInfoDp = ((PoiDetailHotelHeaderAssem) akS3S1300000_18.l1).dp();
        if (poiCurrentSessionInfoDp != null) {
            str3 = poiCurrentSessionInfoDp.poiSessionId;
        }
        C1186070gyD.LIZLLL(c1186070gyD, context, akS3S1300000_18.s0, (PoiListApi.PoiDetailResponse) akS3S1300000_18.l3, initialPoiId, initialPoiFromGroupId, initialEnterFrom, initialEnterMethod, str, str4, "header_no_reviews", fromGroupId, new AwS562S0100000_18((PoiDetailHotelHeaderAssem) akS3S1300000_18.l1, 1015), str3, C1558520qew.LJIIL((PoiDetailHotelHeaderAssem) akS3S1300000_18.l1), ((PoiDetailHotelHeaderAssem) akS3S1300000_18.l1).Zo());
    }

    public AkS3S1300000_18(Object obj, Object obj2, String str, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
        this.l3 = obj3;
    }
}
