package kotlin.jvm.internal;

import X.C09AY;
import X.C1159320gH4;
import X.C1164780gPs;
import X.C1177570gkV;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1189060h32;
import X.C1367960lha;
import X.C1391190mJ3;
import X.C1558520qew;
import X.C1623706Xj;
import X.C2276411E8h;
import X.C2344009Gk;
import X.C343970De7;
import X.InterfaceC1192660h8q;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitViewModel;
import com.ss.android.ugc.aweme.poi.osp.repo.model.OrderAttribute;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SkuData;
import com.ss.android.ugc.aweme.poi.revisit.view.IPoiRevisitNavAssemAbility;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitFragment;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS0S5400000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l5;
    public Object l6;
    public Object l7;
    public Object l8;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public String s4;

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

    public static final Object invoke$0(AwS0S5400000_18 awS0S5400000_18, Object obj) {
        if (!(((C1159320gH4) obj).LL instanceof C1623706Xj)) {
            ((PoiOrderSubmitViewModel) awS0S5400000_18.l5).setState(AFwS256S0000000_18.get$arr$(541));
            C2276411E8h.LIZIZ.log("poi", "osp submitOrder");
            InterfaceC1192660h8q interfaceC1192660h8q = (InterfaceC1192660h8q) awS0S5400000_18.l6;
            if (interfaceC1192660h8q != null) {
                interfaceC1192660h8q.LJFF(new C1164780gPs((PoiOrderSubmitViewModel) awS0S5400000_18.l5, awS0S5400000_18.s0, (List) awS0S5400000_18.l7, awS0S5400000_18.s1, (OrderAttribute) awS0S5400000_18.l8, awS0S5400000_18.s2, awS0S5400000_18.s3, awS0S5400000_18.s4));
            } else {
                ((PoiOrderSubmitViewModel) awS0S5400000_18.l5).setState(AFwS256S0000000_18.get$arr$(545));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S5400000_18 awS0S5400000_18, Object obj) {
        IPoiRevisitNavAssemAbility iPoiRevisitNavAssemAbility;
        Double d;
        View view = (View) obj;
        InterfaceC665370Q7z interfaceC665370Q7z = ((PoiRevisitFragment) awS0S5400000_18.l5).VR().LLJ;
        Double d2 = null;
        if (interfaceC665370Q7z != null) {
            iPoiRevisitNavAssemAbility = (IPoiRevisitNavAssemAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPoiRevisitNavAssemAbility.class, null);
        } else {
            iPoiRevisitNavAssemAbility = null;
        }
        C1177570gkV c1177570gkV = C1177570gkV.LIZ;
        PoiRevisitFragment poiRevisitFragment = (PoiRevisitFragment) awS0S5400000_18.l5;
        c1177570gkV.getClass();
        String strLIZ = C1177570gkV.LIZ(iPoiRevisitNavAssemAbility);
        String str = awS0S5400000_18.s0;
        String str2 = awS0S5400000_18.s1;
        if (Intrinsics.LJFF(str2, "Others")) {
            str2 = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", "ttsocial_collection_detail_page");
        c2344009Gk.LJFF("current_page", "ttls_collection_poi_list_page");
        c2344009Gk.LJFF("enable_location", C1177570gkV.LIZIZ());
        C1189060h32.LJIJJLI(c2344009Gk, "ttls_filter_type_list", strLIZ);
        C1189060h32.LJIJJLI(c2344009Gk, "poi_id", str);
        C1189060h32.LJIJJLI(c2344009Gk, "local_service_key_category", str2);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        C1185050gwZ c1185050gwZ = new C1185050gwZ(PageFinder.via((Fragment) poiRevisitFragment));
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("open_in_google_maps", map, c1185050gwZ);
        String str3 = TuxSheet._pnsPageId;
        C1391190mJ3.LJ(view, C343970De7.LIZ);
        C1367960lha.LIZ.getClass();
        IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
        Context context = (Context) awS0S5400000_18.l6;
        PoiLocation poiLocation = (PoiLocation) awS0S5400000_18.l7;
        if (poiLocation != null) {
            d = poiLocation.lat;
            d2 = poiLocation.lng;
        } else {
            d = null;
        }
        iPoiServiceLIZ.LJLL(context, d, d2, awS0S5400000_18.s2, awS0S5400000_18.s3, (Float) awS0S5400000_18.l8, awS0S5400000_18.s4, awS0S5400000_18.s0, PageFinder.via((Fragment) awS0S5400000_18.l5));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S5400000_18(PoiRevisitFragment poiRevisitFragment, String str, String str2, Context context, PoiLocation poiLocation, String str3, String str4, int i) {
        super(1);
        this.$t = i;
        this.l5 = poiRevisitFragment;
        this.s0 = str;
        this.s1 = str2;
        this.l6 = context;
        this.l7 = poiLocation;
        this.s2 = str3;
        this.s3 = str4;
        this.l8 = null;
        this.s4 = "map_mode";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S5400000_18(PoiOrderSubmitViewModel poiOrderSubmitViewModel, PoiOrderSubmitViewModel poiOrderSubmitViewModel2, InterfaceC1192660h8q interfaceC1192660h8q, String str, List<SkuData> list, String str2, OrderAttribute orderAttribute, String str3, String str4, String str5) {
        super(1);
        this.$t = str5;
        this.l5 = poiOrderSubmitViewModel;
        this.l6 = poiOrderSubmitViewModel2;
        this.s0 = interfaceC1192660h8q;
        this.l7 = str;
        this.s1 = list;
        this.l8 = str2;
        this.s2 = orderAttribute;
        this.s3 = str3;
        this.s4 = str4;
    }
}
