package kotlin.jvm.internal;

import X.C09AY;
import X.C1182980gtE;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiMapModeResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS1S0110200_18 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public long j3;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS1S0110200_18 awS1S0110200_18, Object obj) {
        String str;
        String string;
        List<PoiGeneralCard> listPoiList;
        String string2;
        Integer bizCode;
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        c1182980gtE.LIZJ = (PoiMapDetailResponse) awS1S0110200_18.l0;
        c1182980gtE.LJ = "poi_detail_map_mode_main";
        c1182980gtE.LIZLLL = "tiktok/poi/card_feed/get/v2";
        c1182980gtE.LIZ = Long.valueOf(awS1S0110200_18.j2);
        c1182980gtE.LIZIZ = Long.valueOf(awS1S0110200_18.j3);
        if (awS1S0110200_18.z1) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1182980gtE.LJFF = new Pair<>("network_error", str);
        PoiMapDetailResponse poiMapDetailResponse = (PoiMapDetailResponse) awS1S0110200_18.l0;
        String string3 = null;
        if (poiMapDetailResponse != null) {
            string3 = Integer.valueOf(poiMapDetailResponse.status_code).toString();
        }
        String str2 = "";
        if (string3 == null) {
            string3 = "";
        }
        c1182980gtE.LJI = new Pair<>("status_code", string3);
        PoiMapDetailResponse poiMapDetailResponse2 = (PoiMapDetailResponse) awS1S0110200_18.l0;
        if (poiMapDetailResponse2 == null || (bizCode = poiMapDetailResponse2.getBizCode()) == null || (string = bizCode.toString()) == null) {
            string = "";
        }
        c1182980gtE.LJII = new Pair<>("biz_code", string);
        PoiMapDetailResponse poiMapDetailResponse3 = (PoiMapDetailResponse) awS1S0110200_18.l0;
        if (poiMapDetailResponse3 != null && (listPoiList = poiMapDetailResponse3.poiList()) != null && (string2 = Integer.valueOf(listPoiList.size()).toString()) != null) {
            str2 = string2;
        }
        c1182980gtE.LJIIIIZZ = new Pair<>("poi_list_size", str2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S0110200_18 awS1S0110200_18, Object obj) {
        String str;
        String string;
        List<PoiDiscoveryCard> poiList;
        String string2;
        Integer bizCode;
        C1182980gtE c1182980gtE = (C1182980gtE) obj;
        c1182980gtE.LIZJ = (PoiMapModeResponse) awS1S0110200_18.l0;
        c1182980gtE.LJ = "poi_detail_map_mode_main";
        c1182980gtE.LIZLLL = "tiktok/poi/card_feed/get/v1";
        c1182980gtE.LIZ = Long.valueOf(awS1S0110200_18.j2);
        c1182980gtE.LIZIZ = Long.valueOf(awS1S0110200_18.j3);
        if (awS1S0110200_18.z1) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1182980gtE.LJFF = new Pair<>("network_error", str);
        PoiMapModeResponse poiMapModeResponse = (PoiMapModeResponse) awS1S0110200_18.l0;
        String string3 = null;
        if (poiMapModeResponse != null) {
            string3 = Integer.valueOf(poiMapModeResponse.status_code).toString();
        }
        String str2 = "";
        if (string3 == null) {
            string3 = "";
        }
        c1182980gtE.LJI = new Pair<>("status_code", string3);
        PoiMapModeResponse poiMapModeResponse2 = (PoiMapModeResponse) awS1S0110200_18.l0;
        if (poiMapModeResponse2 == null || (bizCode = poiMapModeResponse2.getBizCode()) == null || (string = bizCode.toString()) == null) {
            string = "";
        }
        c1182980gtE.LJII = new Pair<>("biz_code", string);
        PoiMapModeResponse poiMapModeResponse3 = (PoiMapModeResponse) awS1S0110200_18.l0;
        if (poiMapModeResponse3 != null && (poiList = poiMapModeResponse3.getPoiList()) != null && (string2 = Integer.valueOf(poiList.size()).toString()) != null) {
            str2 = string2;
        }
        c1182980gtE.LJIIIIZZ = new Pair<>("poi_list_size", str2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0110200_18(PoiMapDetailResponse poiMapDetailResponse, long j, long j2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiMapDetailResponse;
        this.j2 = j;
        this.j3 = j2;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S0110200_18(PoiMapModeResponse poiMapModeResponse, long j, long j2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiMapModeResponse;
        this.j2 = j;
        this.j3 = j2;
        this.z1 = z;
    }
}
