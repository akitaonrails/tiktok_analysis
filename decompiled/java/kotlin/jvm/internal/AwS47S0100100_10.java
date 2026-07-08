package kotlin.jvm.internal;

import X.C09AY;
import X.C0Q2M;
import X.C646000PVm;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C651970Phj;
import X.C651980Phk;
import X.C653740Pka;
import X.C664000Q2s;
import X.C676310Qft;
import X.C676800Qgg;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchResultFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchSingleDetectionFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.tag.PhotoSearchShopResultFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.ui.SearchEffectListActivity;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public class AwS47S0100100_10 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS47S0100100_10 awS47S0100100_10, Object obj) {
        String imprId;
        String str;
        String imprId2;
        C664000Q2s c664000Q2s;
        SearchApiResult searchApiResult = (SearchApiResult) obj;
        C651970Phj.LLILLL.getClass();
        Map mapLIZJ = C651980Phk.LIZJ();
        C653740Pka c653740Pka = new C653740Pka("search");
        LogPbBean logPbBean = searchApiResult.logPb;
        String str2 = null;
        if (logPbBean != null) {
            imprId = logPbBean.getImprId();
        } else {
            imprId = null;
        }
        c653740Pka.LJIIZILJ("impr_id", imprId);
        C650950Pg5.Companion.getClass();
        C650960Pg6 c650960Pg6LIZJ = C646000PVm.LIZJ();
        if (c650960Pg6LIZJ != null && (c664000Q2s = c650960Pg6LIZJ.searchCommonModel) != null) {
            str2 = c664000Q2s.enterFrom;
        }
        c653740Pka.LJIJJ(str2);
        c653740Pka.LJIIZILJ("search_type", "effect");
        c653740Pka.LJIIZILJ("enter_method", "click_more_general_list");
        c653740Pka.LJIIZILJ("search_keyword", ((SearchEffectListActivity) awS47S0100100_10.l0).LLILLL);
        c653740Pka.LJIIZILJ("duration", String.valueOf(SystemClock.elapsedRealtime() - awS47S0100100_10.j1));
        C0Q2M.LIZ.getClass();
        c653740Pka.LJIIZILJ("group_id", C0Q2M.LJIIL());
        if (searchApiResult.status_code == 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c653740Pka.LJIIZILJ("is_success", str);
        c653740Pka.LJJJJIZL((String) mapLIZJ.get("search_id"));
        c653740Pka.LJIILJJIL();
        LogPbBean logPbBean2 = searchApiResult.logPb;
        if (logPbBean2 == null || (imprId2 = logPbBean2.getImprId()) == null) {
            imprId2 = "";
        }
        mapLIZJ.put("search_id", imprId2);
        C651980Phk.LJFF(mapLIZJ, false);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS47S0100100_10 awS47S0100100_10, Object obj) {
        Integer numValueOf;
        String str;
        String str2;
        String str3;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchLogEnterParams photoSearchLogEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchLogEnterParams photoSearchLogEnterParams2;
        PhotoSearchEnterParams photoSearchEnterParams3;
        PhotoSearchLogEnterParams photoSearchLogEnterParams3;
        PhotoSearchEnterParams photoSearchEnterParams4;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams5;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        C676310Qft c676310Qft = (C676310Qft) obj;
        c676310Qft.LIZJ = awS47S0100100_10.j1;
        PhotoSearchBaseVM photoSearchBaseVM = ((PhotoSearchResultFragment) awS47S0100100_10.l0).LLIZ;
        String str4 = null;
        if (photoSearchBaseVM != null && (photoSearchEnterParams5 = photoSearchBaseVM.LLILLL) != null && (photoSearchBusinessEnterParams2 = photoSearchEnterParams5.businessParams) != null) {
            numValueOf = Integer.valueOf(photoSearchBusinessEnterParams2.rootEnterFromType);
        } else {
            numValueOf = null;
        }
        c676310Qft.LJIIIIZZ = numValueOf;
        PhotoSearchBaseVM photoSearchBaseVM2 = ((PhotoSearchResultFragment) awS47S0100100_10.l0).LLIZ;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams4 = photoSearchBaseVM2.LLILLL) != null && (photoSearchBusinessEnterParams = photoSearchEnterParams4.businessParams) != null) {
            str = photoSearchBusinessEnterParams.enterMethod;
        } else {
            str = null;
        }
        c676310Qft.LJIIIZ = str;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams3 = photoSearchBaseVM2.LLILLL) != null && (photoSearchLogEnterParams3 = photoSearchEnterParams3.logParams) != null) {
            str2 = photoSearchLogEnterParams3.searchEntrance;
        } else {
            str2 = null;
        }
        c676310Qft.LJIIJ = str2;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams2 = photoSearchBaseVM2.LLILLL) != null && (photoSearchLogEnterParams2 = photoSearchEnterParams2.logParams) != null) {
            str3 = photoSearchLogEnterParams2.photoSearchModule;
        } else {
            str3 = null;
        }
        c676310Qft.LJIIJJI = str3;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams = photoSearchBaseVM2.LLILLL) != null && (photoSearchLogEnterParams = photoSearchEnterParams.logParams) != null) {
            str4 = photoSearchLogEnterParams.enterFromSecond;
        }
        c676310Qft.LJIIL = str4;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS47S0100100_10 awS47S0100100_10, Object obj) {
        Integer numValueOf;
        String str;
        String str2;
        String str3;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchLogEnterParams photoSearchLogEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchLogEnterParams photoSearchLogEnterParams2;
        PhotoSearchEnterParams photoSearchEnterParams3;
        PhotoSearchLogEnterParams photoSearchLogEnterParams3;
        PhotoSearchEnterParams photoSearchEnterParams4;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams5;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        C676310Qft c676310Qft = (C676310Qft) obj;
        c676310Qft.LIZJ = awS47S0100100_10.j1;
        PhotoSearchBaseVM photoSearchBaseVM = ((PhotoSearchSingleDetectionFragment) awS47S0100100_10.l0).LLJJJIL;
        String str4 = null;
        if (photoSearchBaseVM != null && (photoSearchEnterParams5 = photoSearchBaseVM.LLILLL) != null && (photoSearchBusinessEnterParams2 = photoSearchEnterParams5.businessParams) != null) {
            numValueOf = Integer.valueOf(photoSearchBusinessEnterParams2.rootEnterFromType);
        } else {
            numValueOf = null;
        }
        c676310Qft.LJIIIIZZ = numValueOf;
        PhotoSearchBaseVM photoSearchBaseVM2 = ((PhotoSearchSingleDetectionFragment) awS47S0100100_10.l0).LLJJJIL;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams4 = photoSearchBaseVM2.LLILLL) != null && (photoSearchBusinessEnterParams = photoSearchEnterParams4.businessParams) != null) {
            str = photoSearchBusinessEnterParams.enterMethod;
        } else {
            str = null;
        }
        c676310Qft.LJIIIZ = str;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams3 = photoSearchBaseVM2.LLILLL) != null && (photoSearchLogEnterParams3 = photoSearchEnterParams3.logParams) != null) {
            str2 = photoSearchLogEnterParams3.searchEntrance;
        } else {
            str2 = null;
        }
        c676310Qft.LJIIJ = str2;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams2 = photoSearchBaseVM2.LLILLL) != null && (photoSearchLogEnterParams2 = photoSearchEnterParams2.logParams) != null) {
            str3 = photoSearchLogEnterParams2.photoSearchModule;
        } else {
            str3 = null;
        }
        c676310Qft.LJIIJJI = str3;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams = photoSearchBaseVM2.LLILLL) != null && (photoSearchLogEnterParams = photoSearchEnterParams.logParams) != null) {
            str4 = photoSearchLogEnterParams.enterFromSecond;
        }
        c676310Qft.LJIIL = str4;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS47S0100100_10 awS47S0100100_10, Object obj) {
        Integer numValueOf;
        String str;
        String str2;
        String str3;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchLogEnterParams photoSearchLogEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchLogEnterParams photoSearchLogEnterParams2;
        PhotoSearchEnterParams photoSearchEnterParams3;
        PhotoSearchLogEnterParams photoSearchLogEnterParams3;
        PhotoSearchEnterParams photoSearchEnterParams4;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchEnterParams photoSearchEnterParams5;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        C676310Qft c676310Qft = (C676310Qft) obj;
        c676310Qft.LIZJ = awS47S0100100_10.j1;
        PhotoSearchBaseVM photoSearchBaseVM = ((PhotoSearchShopResultFragment) awS47S0100100_10.l0).LLILZ;
        String str4 = null;
        if (photoSearchBaseVM != null && (photoSearchEnterParams5 = photoSearchBaseVM.LLILLL) != null && (photoSearchBusinessEnterParams2 = photoSearchEnterParams5.businessParams) != null) {
            numValueOf = Integer.valueOf(photoSearchBusinessEnterParams2.rootEnterFromType);
        } else {
            numValueOf = null;
        }
        c676310Qft.LJIIIIZZ = numValueOf;
        PhotoSearchBaseVM photoSearchBaseVM2 = ((PhotoSearchShopResultFragment) awS47S0100100_10.l0).LLILZ;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams4 = photoSearchBaseVM2.LLILLL) != null && (photoSearchBusinessEnterParams = photoSearchEnterParams4.businessParams) != null) {
            str = photoSearchBusinessEnterParams.enterMethod;
        } else {
            str = null;
        }
        c676310Qft.LJIIIZ = str;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams3 = photoSearchBaseVM2.LLILLL) != null && (photoSearchLogEnterParams3 = photoSearchEnterParams3.logParams) != null) {
            str2 = photoSearchLogEnterParams3.searchEntrance;
        } else {
            str2 = null;
        }
        c676310Qft.LJIIJ = str2;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams2 = photoSearchBaseVM2.LLILLL) != null && (photoSearchLogEnterParams2 = photoSearchEnterParams2.logParams) != null) {
            str3 = photoSearchLogEnterParams2.photoSearchModule;
        } else {
            str3 = null;
        }
        c676310Qft.LJIIJJI = str3;
        if (photoSearchBaseVM2 != null && (photoSearchEnterParams = photoSearchBaseVM2.LLILLL) != null && (photoSearchLogEnterParams = photoSearchEnterParams.logParams) != null) {
            str4 = photoSearchLogEnterParams.enterFromSecond;
        }
        c676310Qft.LJIIL = str4;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS47S0100100_10 awS47S0100100_10, Object obj) {
        String imprId;
        C676310Qft c676310Qft = (C676310Qft) obj;
        c676310Qft.LJII = awS47S0100100_10.j1;
        com.ss.android.ugc.aweme.ecommerce.arch.LogPbBean value = ((C676800Qgg) awS47S0100100_10.l0).LIZ.LLIZ.getValue();
        if (value != null) {
            imprId = value.getImprId();
        } else {
            imprId = null;
        }
        c676310Qft.LJIILIIL = imprId;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS47S0100100_10 awS47S0100100_10, Object obj) {
        String imprId;
        C676310Qft c676310Qft = (C676310Qft) obj;
        c676310Qft.LJII = awS47S0100100_10.j1;
        com.ss.android.ugc.aweme.ecommerce.arch.LogPbBean value = ((C676800Qgg) awS47S0100100_10.l0).LIZ.LLIZ.getValue();
        if (value != null) {
            imprId = value.getImprId();
        } else {
            imprId = null;
        }
        c676310Qft.LJIILIIL = imprId;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0100100_10(long j, C676800Qgg c676800Qgg, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = c676800Qgg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0100100_10(long j, PhotoSearchResultFragment photoSearchResultFragment, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = photoSearchResultFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0100100_10(long j, PhotoSearchSingleDetectionFragment photoSearchSingleDetectionFragment, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = photoSearchSingleDetectionFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0100100_10(long j, PhotoSearchShopResultFragment photoSearchShopResultFragment, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = photoSearchShopResultFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS47S0100100_10(SearchEffectListActivity searchEffectListActivity, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchEffectListActivity;
        this.j1 = j;
    }
}
