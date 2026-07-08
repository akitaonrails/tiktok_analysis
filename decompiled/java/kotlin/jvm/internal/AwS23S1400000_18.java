package kotlin.jvm.internal;

import X.AbstractC1207540hWq;
import X.C09AY;
import X.C1207450hWh;
import X.C1207520hWo;
import X.C1207640hX0;
import X.C19EG;
import X.C20248814Kw;
import X.C20489080x;
import X.C20656615sK;
import X.InterfaceC1207030hW1;
import X.InterfaceC1207490hWl;
import android.view.ViewGroup;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.hotel.PoiDetailHotelHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.PoiDetailTravelHeaderAssemV2;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS23S1400000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS23S1400000_18 awS23S1400000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS546S0100000_2((ViewGroup) awS23S1400000_18.l1, 740);
        c20248814Kw.LIZIZ(new AwS97S1300000_18(awS23S1400000_18.s0, (PoiListApi.PoiDetailResponse) awS23S1400000_18.l2, (PoiReviewsApi.PoiReviewSummaryModel) awS23S1400000_18.l3, (PoiDetailHeaderAssem) awS23S1400000_18.l4, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS23S1400000_18 awS23S1400000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS546S0100000_2((ViewGroup) awS23S1400000_18.l1, 36);
        c20248814Kw.LIZIZ(new AwS97S1300000_18(awS23S1400000_18.s0, (PoiListApi.PoiDetailResponse) awS23S1400000_18.l2, (PoiReviewsApi.PoiReviewSummaryModel) awS23S1400000_18.l3, (PoiDetailHotelHeaderAssem) awS23S1400000_18.l4, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS23S1400000_18 awS23S1400000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = new AwS546S0100000_2((ViewGroup) awS23S1400000_18.l1, 742);
        c20248814Kw.LIZIZ(new AwS97S1300000_18(awS23S1400000_18.s0, (PoiListApi.PoiDetailResponse) awS23S1400000_18.l2, (PoiReviewsApi.PoiReviewSummaryModel) awS23S1400000_18.l3, (PoiDetailTravelHeaderAssemV2) awS23S1400000_18.l4, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS23S1400000_18 awS23S1400000_18, Object obj) {
        final AbstractC1207540hWq abstractC1207540hWq = (AbstractC1207540hWq) awS23S1400000_18.l1;
        String str = awS23S1400000_18.s0;
        C19EG c19eg = (C19EG) awS23S1400000_18.l2;
        C1207520hWo c1207520hWo = (C1207520hWo) awS23S1400000_18.l3;
        final TokenCert tokenCert = (TokenCert) awS23S1400000_18.l4;
        abstractC1207540hWq.getClass();
        final AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18((C20656615sK) obj, 2623);
        C1207640hX0.LIZ.getClass();
        c1207520hWo.LIZIZ = C1207640hX0.LIZIZ;
        C1207450hWh c1207450hWh = C1207450hWh.LIZ;
        InterfaceC1207030hW1 interfaceC1207030hW1 = new InterfaceC1207030hW1() { // from class: X.0hWy
            @Override // X.InterfaceC1207030hW1
            public final void LIZ() {
                awS562S0100000_18.invoke();
                AbstractC1207540hWq abstractC1207540hWq2 = abstractC1207540hWq;
                TokenCert tokenCert2 = tokenCert;
                abstractC1207540hWq2.getClass();
                AbstractC1207540hWq.LIZ(0, tokenCert2);
            }

            @Override // X.InterfaceC1207030hW1
            public final void LIZJ(int i) {
                awS562S0100000_18.invoke();
                AbstractC1207540hWq abstractC1207540hWq2 = abstractC1207540hWq;
                TokenCert tokenCert2 = tokenCert;
                abstractC1207540hWq2.getClass();
                AbstractC1207540hWq.LIZ(i, tokenCert2);
            }

            @Override // X.InterfaceC1207030hW1
            public final void LIZIZ(int i, String str2) {
                awS562S0100000_18.invoke();
                AbstractC1207540hWq abstractC1207540hWq2 = abstractC1207540hWq;
                TokenCert tokenCert2 = tokenCert;
                abstractC1207540hWq2.getClass();
                AbstractC1207540hWq.LIZ(i, tokenCert2);
            }
        };
        c1207450hWh.getClass();
        ((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJIJJ("poi", "fyp_interaction", tokenCert, c19eg, c1207520hWo, interfaceC1207030hW1, null);
        C20489080x.LIZ.getClass();
        C20489080x.LJIIIZ(str);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S1400000_18(AbstractC1207540hWq abstractC1207540hWq, String str, C19EG c19eg, C1207520hWo c1207520hWo, TokenCert tokenCert, int i) {
        super(1);
        this.$t = i;
        this.l1 = abstractC1207540hWq;
        this.s0 = str;
        this.l2 = c19eg;
        this.l3 = c1207520hWo;
        this.l4 = tokenCert;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S1400000_18(ViewGroup viewGroup, String str, PoiListApi.PoiDetailResponse poiDetailResponse, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, PoiDetailHeaderAssem poiDetailHeaderAssem, int i) {
        super(1);
        this.$t = i;
        this.l1 = viewGroup;
        this.s0 = str;
        this.l2 = poiDetailResponse;
        this.l3 = poiReviewSummaryModel;
        this.l4 = poiDetailHeaderAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S1400000_18(ViewGroup viewGroup, String str, PoiListApi.PoiDetailResponse poiDetailResponse, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, PoiDetailHotelHeaderAssem poiDetailHotelHeaderAssem, int i) {
        super(1);
        this.$t = i;
        this.l1 = viewGroup;
        this.s0 = str;
        this.l2 = poiDetailResponse;
        this.l3 = poiReviewSummaryModel;
        this.l4 = poiDetailHotelHeaderAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S1400000_18(ViewGroup viewGroup, String str, PoiListApi.PoiDetailResponse poiDetailResponse, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, PoiDetailTravelHeaderAssemV2 poiDetailTravelHeaderAssemV2, int i) {
        super(1);
        this.$t = i;
        this.l1 = viewGroup;
        this.s0 = str;
        this.l2 = poiDetailResponse;
        this.l3 = poiReviewSummaryModel;
        this.l4 = poiDetailTravelHeaderAssemV2;
    }
}
