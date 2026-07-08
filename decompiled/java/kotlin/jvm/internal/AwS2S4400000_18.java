package kotlin.jvm.internal;

import X.C09AY;
import X.C1175600ghK;
import X.C1175660ghQ;
import X.C1182410gsJ;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1367960lha;
import X.C1391190mJ3;
import X.C1558360qeg;
import X.C343970De7;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.poi.detail.cells.PoiCardCellData;
import com.ss.android.ugc.aweme.poi.mapdetail.horizontal.PoiMapDetailHorizontalCardReusedAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiMapDetailResponse;
import com.ss.android.ugc.aweme.poi.mapmode.cell.PoiMapModeHorizontalCardCell;
import com.ss.android.ugc.aweme.poi.mapmode.model.Location;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS2S4400000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l4;
    public Object l5;
    public Object l7;
    public String s0;
    public String s1;
    public String s3;
    public Object l6 = null;
    public String s2 = "map_mode";

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

    public static final Object invoke$0(AwS2S4400000_18 awS2S4400000_18, Object obj) {
        Double d;
        Double d2;
        String str;
        Integer userCityStatus;
        String str2;
        String str3;
        String str4;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        View view = (View) obj;
        String str5 = TuxSheet._pnsPageId;
        C1391190mJ3.LJ(view, C343970De7.LIZ);
        C1367960lha.LIZ.getClass();
        IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
        Context context = (Context) awS2S4400000_18.l4;
        Location location = (Location) awS2S4400000_18.l5;
        String strLIZ = null;
        if (location != null) {
            d = location.lat;
            d2 = location.lng;
        } else {
            d = null;
            d2 = null;
        }
        iPoiServiceLIZ.LJLL(context, d, d2, awS2S4400000_18.s0, awS2S4400000_18.s1, (Float) awS2S4400000_18.l6, awS2S4400000_18.s2, awS2S4400000_18.s3, PageFinder.via(view));
        C1175660ghQ c1175660ghQXQ2 = ((PoiMapDetailHorizontalCardReusedAssem) awS2S4400000_18.l7).up().xQ2();
        if (c1175660ghQXQ2 != null) {
            str = c1175660ghQXQ2.localServiceKeyCategory;
        } else {
            str = null;
        }
        PoiMapDetailResponse poiMapDetailResponse = ((PoiMapDetailHorizontalCardReusedAssem) awS2S4400000_18.l7).up().LLJILJILJ.LIZJ;
        if (poiMapDetailResponse != null) {
            userCityStatus = poiMapDetailResponse.getUserCityStatus();
        } else {
            userCityStatus = null;
        }
        String strWQ2 = ((PoiMapDetailHorizontalCardReusedAssem) awS2S4400000_18.l7).tp().wQ2();
        PoiCardCellData poiCardCellDataZp = ((PoiMapDetailHorizontalCardReusedAssem) awS2S4400000_18.l7).zp();
        if (poiCardCellDataZp != null) {
            str2 = poiCardCellDataZp.poiId;
        } else {
            str2 = null;
        }
        PoiCardCellData poiCardCellDataZp2 = ((PoiMapDetailHorizontalCardReusedAssem) awS2S4400000_18.l7).zp();
        if (poiCardCellDataZp2 != null) {
            str3 = poiCardCellDataZp2.collectInfo;
        } else {
            str3 = null;
        }
        PoiCardCellData poiCardCellDataZp3 = ((PoiMapDetailHorizontalCardReusedAssem) awS2S4400000_18.l7).zp();
        if (poiCardCellDataZp3 != null) {
            str4 = poiCardCellDataZp3.keyCategory;
        } else {
            str4 = null;
        }
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ((PoiMapDetailHorizontalCardReusedAssem) awS2S4400000_18.l7);
        if (fragmentLJIIJ != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
        } else {
            interfaceC665370Q7zLJFF = null;
        }
        PageFinder pageFinderVia = PageFinder.via(((PoiMapDetailHorizontalCardReusedAssem) awS2S4400000_18.l7).LLJLILLLLZIIL);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJFF);
        if (str != null) {
            strLIZ = C1175600ghK.LIZ(str);
        }
        C1189060h32.LJJ("tab_code", strLIZ, linkedHashMap);
        C1189060h32.LJJ("map_mode_type", C1175600ghK.LJIIJ(userCityStatus), linkedHashMap);
        C1189060h32.LJJ("ttls_filter_type_list", strWQ2, linkedHashMap);
        C1189060h32.LJJ("target_poi_id", str2, linkedHashMap);
        C1189060h32.LJJ("target_collect_info", str3, linkedHashMap);
        C1189060h32.LJJ("target_local_service_key_category", str4, linkedHashMap);
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("open_in_google_maps", linkedHashMap, c1185050gwZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S4400000_18 awS2S4400000_18, Object obj) {
        Double d;
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) obj, C343970De7.LIZ);
        C1367960lha.LIZ.getClass();
        IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
        Context context = (Context) awS2S4400000_18.l4;
        Location location = (Location) awS2S4400000_18.l5;
        Double d2 = null;
        if (location != null) {
            d2 = location.lat;
            d = location.lng;
        } else {
            d = null;
        }
        iPoiServiceLIZ.LJLL(context, d2, d, awS2S4400000_18.s0, awS2S4400000_18.s1, (Float) awS2S4400000_18.l6, awS2S4400000_18.s2, awS2S4400000_18.s3, ((PoiMapModeHorizontalCardCell) awS2S4400000_18.l7).N5());
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        String str2 = awS2S4400000_18.s2;
        String str3 = awS2S4400000_18.s3;
        PageFinder pageFinderN5 = ((PoiMapModeHorizontalCardCell) awS2S4400000_18.l7).N5();
        c1185430gxB.getClass();
        C1185430gxB.LJJI(pageFinderN5, str2, str3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S4400000_18(Context context, Location location, String str, String str2, String str3, PoiMapDetailHorizontalCardReusedAssem poiMapDetailHorizontalCardReusedAssem, int i) {
        super(1);
        this.$t = i;
        this.l4 = context;
        this.l5 = location;
        this.s0 = str;
        this.s1 = str2;
        this.s3 = str3;
        this.l7 = poiMapDetailHorizontalCardReusedAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S4400000_18(Context context, Location location, String str, String str2, String str3, PoiMapModeHorizontalCardCell poiMapModeHorizontalCardCell, int i) {
        super(1);
        this.$t = i;
        this.l4 = context;
        this.l5 = location;
        this.s0 = str;
        this.s1 = str2;
        this.s3 = str3;
        this.l7 = poiMapModeHorizontalCardCell;
    }
}
