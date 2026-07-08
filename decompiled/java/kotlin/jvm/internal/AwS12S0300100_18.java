package kotlin.jvm.internal;

import X.C09AY;
import X.C1182980gtE;
import X.C1197910hHJ;
import X.C1199140hJI;
import X.C1207400hWc;
import X.C1207520hWo;
import X.C1207840hXK;
import X.C1207850hXL;
import X.C1207920hXS;
import X.C12QB;
import X.C1397630mTR;
import X.C849850XVn;
import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS12S0300100_18 extends C09AY implements Function1 {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS12S0300100_18 awS12S0300100_18, Object obj) {
        String str;
        Integer numValueOf;
        String str2;
        List<PoiData> list;
        List<PoiData> list2;
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        String str3 = ((C1199140hJI) awS12S0300100_18.l0).LJ;
        if (str3 != null && str3.length() != 0) {
            c1182980gtE.LIZLLL = "/tiktok/poi/api/place/search";
            c1182980gtE.LJ = "search_poi";
        } else {
            c1182980gtE.LIZLLL = "/tiktok/poi/api/place/recommend";
            if (Intrinsics.LJFF(((C1199140hJI) awS12S0300100_18.l0).LJFF, "RECOMMEND")) {
                str = "recommend";
            } else {
                str = "default_search_poi";
            }
            c1182980gtE.LJ = str;
        }
        c1182980gtE.LIZ = Long.valueOf(awS12S0300100_18.j3);
        c1182980gtE.LIZIZ = Long.valueOf(System.currentTimeMillis());
        c1182980gtE.LIZJ = (PoiSearchApi.PoiSearchResultWrapperV2) awS12S0300100_18.l1;
        c1182980gtE.LJFF = new Pair<>("", "request_send");
        PoiSearchApi.PoiSearchResult poiSearchResult = ((PoiSearchApi.PoiSearchResultWrapper) awS12S0300100_18.l2).poiSearchResult;
        String str4 = null;
        if (poiSearchResult != null && (list2 = poiSearchResult.poiList) != null) {
            numValueOf = Integer.valueOf(list2.size());
        } else {
            numValueOf = null;
        }
        c1182980gtE.LJIIL = numValueOf;
        PoiSearchApi.PoiSearchResult poiSearchResult2 = ((PoiSearchApi.PoiSearchResultWrapper) awS12S0300100_18.l2).poiSearchResult;
        if (poiSearchResult2 != null && (list = poiSearchResult2.poiList) != null && list.size() > 0) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        c1182980gtE.LJI = new Pair<>("isEmpty", str2);
        PoiSearchApi.PoiSearchResultV2 poiSearchResultV2 = ((PoiSearchApi.PoiSearchResultWrapperV2) awS12S0300100_18.l1).poiSearchResult;
        if (poiSearchResultV2 != null) {
            str4 = poiSearchResultV2.debugInfo;
        }
        C1197910hHJ.LJ(c1182980gtE, str4);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS12S0300100_18 awS12S0300100_18, Object obj) {
        String str;
        C1207400hWc c1207400hWc = C1207400hWc.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS12S0300100_18.j3;
        C1207520hWo c1207520hWo = ((C1207850hXL) awS12S0300100_18.l0).LIZIZ;
        String str2 = null;
        if (c1207520hWo != null) {
            str = c1207520hWo.LIZ;
            str2 = c1207520hWo.LIZIZ;
        } else {
            str = null;
        }
        c1207400hWc.getClass();
        C1207400hWc.LIZJ(jCurrentTimeMillis, str, str2, true);
        ((C12QB) awS12S0300100_18.l1).LIZ();
        ((C1207840hXK) awS12S0300100_18.l2).LIZIZ.invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS12S0300100_18 awS12S0300100_18, Object obj) {
        ((C1397630mTR) obj).LIZJ(0, ((C1207850hXL) awS12S0300100_18.l0).LIZ.getResources().getString(R.string.epx), new AwS12S0300100_18(awS12S0300100_18.j3, (C12QB) awS12S0300100_18.l1, (C1207840hXK) awS12S0300100_18.l2, (C1207850hXL) awS12S0300100_18.l0, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS12S0300100_18 awS12S0300100_18, Object obj) {
        ((C1397630mTR) obj).LIZJ(0, ((Activity) awS12S0300100_18.l0).getResources().getString(R.string.epx), new AwS31S0200100_18(awS12S0300100_18.j3, (C1207920hXS) awS12S0300100_18.l1, (C12QB) awS12S0300100_18.l2, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS12S0300100_18 awS12S0300100_18, Object obj) {
        String str;
        C849850XVn.LIZIZ.LIZJ().LJIJI("location", ((Activity) awS12S0300100_18.l0).getResources().getString(R.string.epx), true);
        C1207400hWc c1207400hWc = C1207400hWc.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS12S0300100_18.j3;
        C1207520hWo c1207520hWo = (C1207520hWo) awS12S0300100_18.l1;
        String str2 = null;
        if (c1207520hWo != null) {
            str = c1207520hWo.LIZ;
            str2 = c1207520hWo.LIZIZ;
        } else {
            str = null;
        }
        c1207400hWc.getClass();
        C1207400hWc.LIZJ(jCurrentTimeMillis, str, str2, true);
        ((Function0) awS12S0300100_18.l2).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS12S0300100_18 awS12S0300100_18, Object obj) {
        ((C1397630mTR) obj).LIZJ(0, ((Activity) awS12S0300100_18.l0).getResources().getString(R.string.epx), new AwS12S0300100_18((Activity) awS12S0300100_18.l0, (Activity) awS12S0300100_18.j3, (long) awS12S0300100_18.l1, (C1207520hWo) awS12S0300100_18.l2, (Function0<Unit>) 4));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS12S0300100_18(long r3, X.C12QB r5, X.C1207840hXK r6, X.C1207850hXL r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            int r8 = 1 - r8
            if (r8 == 0) goto L14
            r1 = r2
            r1.l0 = r7
            r1.j3 = r3
            r1.l1 = r5
            r1.l2 = r6
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.j3 = r3
            r1.l0 = r7
            r1.l1 = r5
            r1.l2 = r6
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS12S0300100_18.<init>(long, X.12QB, X.0hXK, X.0hXL, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S0300100_18(long j, Activity activity, C12QB c12qb, C1207920hXS c1207920hXS, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.j3 = j;
        this.l1 = c1207920hXS;
        this.l2 = c12qb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S0300100_18(C1199140hJI c1199140hJI, long j, PoiSearchApi.PoiSearchResultWrapperV2 poiSearchResultWrapperV2, PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1199140hJI;
        this.j3 = j;
        this.l1 = poiSearchResultWrapperV2;
        this.l2 = poiSearchResultWrapper;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS12S0300100_18) (LINE:84082695) kotlin.jvm.internal.AwS12S0300100_18.l1 java.lang.Object, block:B:2:0x0000 */
    public AwS12S0300100_18(Activity activity, Activity activity2, long j, C1207520hWo c1207520hWo, Function0<Unit> function0) {
        Object obj;
        super(1);
        this.$t = function0;
        this.l0 = activity;
        this.j3 = activity2;
        this.l1 = obj;
        this.l2 = c1207520hWo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS12S0300100_18(Activity activity, long j, C1207520hWo c1207520hWo, AwS56S0310000_18 awS56S0310000_18, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.j3 = j;
        this.l1 = c1207520hWo;
        this.l2 = awS56S0310000_18;
    }
}
