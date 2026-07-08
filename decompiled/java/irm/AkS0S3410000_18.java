package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C098200Yq;
import X.C1184460gvc;
import X.C1184480gve;
import X.C1185410gx9;
import X.C1191160h6Q;
import X.C1252710ihh;
import X.C13LE;
import X.C1558520qew;
import X.C189200o6;
import X.EnumC1190240h4w;
import X.InterfaceC1184330gvP;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.hotel.PoiDetailHotelHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;

/* JADX INFO: loaded from: classes19.dex */
public class AkS0S3410000_18 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;
    public String s2;
    public boolean z7;

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

    public static final void LIZ$0(AkS0S3410000_18 akS0S3410000_18, View view) {
        Object c098200Yq;
        String initialEnterFrom;
        String initialEnterMethod;
        String str;
        String str2;
        float fDoubleValue;
        int iLongValue;
        int value;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        String initialPoiId = null;
        try {
            c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ((PoiDetailHotelHeaderAssem) akS0S3410000_18.l3, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
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
        if (!akS0S3410000_18.z7) {
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            if (c1185410gx9 != null) {
                initialPoiId = c1185410gx9.getInitialPoiId();
            }
            String str3 = "";
            if (initialPoiId == null) {
                initialPoiId = "";
            }
            if (c1185410gx9 == null || (initialEnterFrom = c1185410gx9.getInitialEnterFrom()) == null) {
                initialEnterFrom = "";
            }
            if (c1185410gx9 == null || (initialEnterMethod = c1185410gx9.getInitialEnterMethod()) == null) {
                initialEnterMethod = "";
            }
            C1184460gvc c1184460gvcOo = ((PoiDetailHotelHeaderAssem) akS0S3410000_18.l3).Oo();
            if (c1184460gvcOo == null || (c1184480gve2 = c1184460gvcOo.LLILLL) == null || (str = c1184480gve2.LL) == null) {
                str = "";
            }
            C1184460gvc c1184460gvcOo2 = ((PoiDetailHotelHeaderAssem) akS0S3410000_18.l3).Oo();
            if (c1184460gvcOo2 == null || (c1184480gve = c1184460gvcOo2.LLILLL) == null || (str2 = c1184480gve.LLILLJJLI) == null) {
                str2 = "";
            }
            String str4 = akS0S3410000_18.s0;
            if (str4 == null) {
                str4 = "";
            }
            String collectInfo = ((PoiListApi.PoiDetailResponse) akS0S3410000_18.l4).getCollectInfo();
            if (collectInfo != null) {
                str3 = collectInfo;
            }
            Double d = ((PoiReviewsApi.PoiReviewSummaryModel) akS0S3410000_18.l5).score;
            if (d != null) {
                fDoubleValue = (float) d.doubleValue();
            } else {
                fDoubleValue = 0.0f;
            }
            Long l = ((PoiReviewsApi.PoiReviewSummaryModel) akS0S3410000_18.l5).totalCount;
            if (l != null) {
                iLongValue = (int) l.longValue();
            } else {
                iLongValue = 0;
            }
            Integer num = ((PoiReviewsApi.PoiReviewSummaryModel) akS0S3410000_18.l5).source;
            if (num != null) {
                value = num.intValue();
            } else {
                value = EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
            }
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailHotelHeaderAssem) akS0S3410000_18.l3);
            PageFinder pageFinderZo = ((PoiDetailHotelHeaderAssem) akS0S3410000_18.l3).Zo();
            c1191160h6Q.getClass();
            C1191160h6Q.LJIIL(initialPoiId, initialEnterFrom, initialEnterMethod, str, str2, "click_reviews_summary", str4, str3, fDoubleValue, iLongValue, value, interfaceC665370Q7zLJIIL, pageFinderZo);
            ((PoiDetailHotelHeaderAssem) akS0S3410000_18.l3).kp(PageFinder.via((View) akS0S3410000_18.l6), akS0S3410000_18.s0, akS0S3410000_18.s1, akS0S3410000_18.s2, "click_reviews_summary");
        }
    }

    public static final void LIZ$1(AkS0S3410000_18 akS0S3410000_18, View view) {
        Object c098200Yq;
        String initialEnterFrom;
        String initialEnterMethod;
        String str;
        String str2;
        float fDoubleValue;
        int iLongValue;
        int value;
        C1184480gve c1184480gve;
        C1184480gve c1184480gve2;
        String initialPoiId = null;
        try {
            c098200Yq = ((InterfaceC1184330gvP) C1252710ihh.LIZIZ((PoiDetailHeaderAssem) akS0S3410000_18.l3, C13LE.LIZ(InterfaceC1184330gvP.class), null)).Nf();
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
        if (!akS0S3410000_18.z7) {
            C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
            if (c1185410gx9 != null) {
                initialPoiId = c1185410gx9.getInitialPoiId();
            }
            String str3 = "";
            if (initialPoiId == null) {
                initialPoiId = "";
            }
            if (c1185410gx9 == null || (initialEnterFrom = c1185410gx9.getInitialEnterFrom()) == null) {
                initialEnterFrom = "";
            }
            if (c1185410gx9 == null || (initialEnterMethod = c1185410gx9.getInitialEnterMethod()) == null) {
                initialEnterMethod = "";
            }
            C1184460gvc c1184460gvcOo = ((PoiDetailHeaderAssem) akS0S3410000_18.l3).Oo();
            if (c1184460gvcOo == null || (c1184480gve2 = c1184460gvcOo.LLILLL) == null || (str = c1184480gve2.LL) == null) {
                str = "";
            }
            C1184460gvc c1184460gvcOo2 = ((PoiDetailHeaderAssem) akS0S3410000_18.l3).Oo();
            if (c1184460gvcOo2 == null || (c1184480gve = c1184460gvcOo2.LLILLL) == null || (str2 = c1184480gve.LLILLJJLI) == null) {
                str2 = "";
            }
            String str4 = akS0S3410000_18.s0;
            if (str4 == null) {
                str4 = "";
            }
            String collectInfo = ((PoiListApi.PoiDetailResponse) akS0S3410000_18.l4).getCollectInfo();
            if (collectInfo != null) {
                str3 = collectInfo;
            }
            Double d = ((PoiReviewsApi.PoiReviewSummaryModel) akS0S3410000_18.l5).score;
            if (d != null) {
                fDoubleValue = (float) d.doubleValue();
            } else {
                fDoubleValue = 0.0f;
            }
            Long l = ((PoiReviewsApi.PoiReviewSummaryModel) akS0S3410000_18.l5).totalCount;
            if (l != null) {
                iLongValue = (int) l.longValue();
            } else {
                iLongValue = 0;
            }
            Integer num = ((PoiReviewsApi.PoiReviewSummaryModel) akS0S3410000_18.l5).source;
            if (num != null) {
                value = num.intValue();
            } else {
                value = EnumC1190240h4w.PoiReviewSource_TikTok.getValue();
            }
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((PoiDetailHeaderAssem) akS0S3410000_18.l3);
            PageFinder pageFinderZo = ((PoiDetailHeaderAssem) akS0S3410000_18.l3).Zo();
            c1191160h6Q.getClass();
            C1191160h6Q.LJIIL(initialPoiId, initialEnterFrom, initialEnterMethod, str, str2, "click_reviews_summary", str4, str3, fDoubleValue, iLongValue, value, interfaceC665370Q7zLJIIL, pageFinderZo);
            ((PoiDetailHeaderAssem) akS0S3410000_18.l3).kp(PageFinder.via((View) akS0S3410000_18.l6), akS0S3410000_18.s0, akS0S3410000_18.s1, akS0S3410000_18.s2, "click_reviews_summary");
        }
    }

    public AkS0S3410000_18(Object obj, boolean z, String str, Object obj2, Object obj3, String str2, String str3, Object obj4, int i) {
        this.$t = i;
        this.l3 = obj;
        this.z7 = z;
        this.s0 = str;
        this.l4 = obj2;
        this.l5 = obj3;
        this.s1 = str2;
        this.s2 = str3;
        this.l6 = obj4;
    }
}
