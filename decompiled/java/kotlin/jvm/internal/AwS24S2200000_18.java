package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C1175600ghK;
import X.C1175660ghQ;
import X.C1189060h32;
import X.C1190970h67;
import X.C1367960lha;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C1558360qeg;
import X.C189200o6;
import X.C20145813s8;
import X.C20248814Kw;
import X.C20642515q3;
import X.C343970De7;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData;
import com.ss.android.ugc.aweme.poi.mapdetail.horizontal.PoiMapDetailHorizontalCardReusedAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS24S2200000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS24S2200000_18 awS24S2200000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = AFwS206S0000000_18.get$arr$(511);
        c20248814Kw.LIZIZ(new AwS40S2200000_18(awS24S2200000_18.s0, awS24S2200000_18.s1, (PoiReviewsApi.PoiReviewSummaryModel) awS24S2200000_18.l2, (C1190970h67) awS24S2200000_18.l3, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS24S2200000_18 awS24S2200000_18, Object obj) {
        C20248814Kw c20248814Kw = (C20248814Kw) obj;
        c20248814Kw.LIZ = AFwS206S0000000_18.get$arr$(512);
        c20248814Kw.LIZIZ(new AwS40S2200000_18(awS24S2200000_18.s0, awS24S2200000_18.s1, (PoiReviewsApi.PoiReviewSummaryModel) awS24S2200000_18.l2, (C1190970h67) awS24S2200000_18.l3, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS24S2200000_18 awS24S2200000_18, Object obj) {
        String str;
        Integer userCityStatus;
        String str2;
        String str3;
        String str4;
        String str5 = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) obj, C343970De7.LIZ);
        PoiMapDetailHorizontalCardReusedAssem poiMapDetailHorizontalCardReusedAssem = (PoiMapDetailHorizontalCardReusedAssem) awS24S2200000_18.l2;
        Context context = (Context) awS24S2200000_18.l3;
        String str6 = awS24S2200000_18.s0;
        String str7 = awS24S2200000_18.s1;
        try {
            poiMapDetailHorizontalCardReusedAssem.getClass();
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx.LJI(C20642515q3.LIZJ(R.color.f570cs));
                c1389890mGx.LJIIIZ(R.string.fws);
                c1389890mGx.LJIIJJI();
            }
            try {
                C1367960lha.LIZ.getClass();
                C20145813s8.LIZ("copy_address", C1367960lha.LIZ().LJLI(str6, str7), context, CertProviderManagerKt.findCert("bpea-571", 1476399106));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C1175660ghQ c1175660ghQXQ2 = poiMapDetailHorizontalCardReusedAssem.up().xQ2();
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
            if (c1175660ghQXQ2 != null) {
                str = c1175660ghQXQ2.localServiceKeyCategory;
            } else {
                str = null;
            }
            PoiMapDetailResponse poiMapDetailResponse = poiMapDetailHorizontalCardReusedAssem.up().LLJILJILJ.LIZJ;
            if (poiMapDetailResponse != null) {
                userCityStatus = poiMapDetailResponse.getUserCityStatus();
            } else {
                userCityStatus = null;
            }
            String strWQ2 = poiMapDetailHorizontalCardReusedAssem.tp().wQ2();
            PoiCardCellData poiCardCellDataZp = poiMapDetailHorizontalCardReusedAssem.zp();
            if (poiCardCellDataZp != null) {
                str2 = poiCardCellDataZp.poiId;
            } else {
                str2 = null;
            }
            PoiCardCellData poiCardCellDataZp2 = poiMapDetailHorizontalCardReusedAssem.zp();
            if (poiCardCellDataZp2 != null) {
                str3 = poiCardCellDataZp2.collectInfo;
            } else {
                str3 = null;
            }
            PoiCardCellData poiCardCellDataZp3 = poiMapDetailHorizontalCardReusedAssem.zp();
            if (poiCardCellDataZp3 != null) {
                str4 = poiCardCellDataZp3.keyCategory;
            } else {
                str4 = null;
            }
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ(poiMapDetailHorizontalCardReusedAssem);
            if (fragmentLJIIJ != null) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
            }
            C1175600ghK.LIZLLL(str, userCityStatus, strWQ2, str2, str3, str4, interfaceC665370Q7zLJFF, PageFinder.via(poiMapDetailHorizontalCardReusedAssem.LLJLILLLLZIIL));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S2200000_18(PoiMapDetailHorizontalCardReusedAssem poiMapDetailHorizontalCardReusedAssem, Context context, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = poiMapDetailHorizontalCardReusedAssem;
        this.l3 = context;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S2200000_18(String str, String str2, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel, C1190970h67 c1190970h67, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = poiReviewSummaryModel;
        this.l3 = c1190970h67;
    }
}
