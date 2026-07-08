package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C118300cf;
import X.C1189060h32;
import X.C1204470hRt;
import X.C1204880hSY;
import X.C1205290hTD;
import X.C1210880hcE;
import X.C1360890lWB;
import X.C1389910mGz;
import X.C1440005kM;
import X.C20684815ws;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C631370Opb;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C737400SwE;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.nearby.feedcard.NearbyFeedCellAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS6S2201000_18 extends C09AY implements Function0 {
    public final int $t;
    public int i4;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS6S2201000_18 awS6S2201000_18) {
        Object obj;
        String str;
        View view;
        String string;
        PoiDataStruct poiDataStruct;
        NearbyFeedCellAssem nearbyFeedCellAssem = (NearbyFeedCellAssem) awS6S2201000_18.l2;
        if (!nearbyFeedCellAssem.LLLILZLLLI) {
            nearbyFeedCellAssem.LLLILZLLLI = true;
            C724270Sb3 c724270Sb3 = nearbyFeedCellAssem.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            C1440005kM.LIZ(new C1210880hcE("homepage_nearby", "FUNCTION_FROM_NOT_INTERESTED", "not_interested", ((C1204470hRt) obj).LL));
            C1205290hTD c1205290hTD = C1205290hTD.LIZ;
            String str2 = awS6S2201000_18.s0;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = awS6S2201000_18.s1;
            if (str4 == null) {
                str4 = "";
            }
            Aweme aweme = ((C1204470hRt) C631370Opb.LIZ((NearbyFeedCellAssem) awS6S2201000_18.l2)).LL;
            if (aweme == null || (poiDataStruct = aweme.getPoiDataStruct()) == null || (str = poiDataStruct.poiId) == null) {
                str = "";
            }
            String strValueOf = String.valueOf(awS6S2201000_18.i4);
            c1205290hTD.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "homepage_nearby");
            c2344009Gk.LJIIIIZZ("enter_method", "long_press");
            c2344009Gk.LJIIIIZZ("group_id", str2);
            c2344009Gk.LJIIIIZZ("author_id", str4);
            c2344009Gk.LJIIIIZZ("reason_id", "1");
            c2344009Gk.LJIIIIZZ("enable_location", C1204880hSY.LIZ());
            C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
            c2344009Gk.LJIIIIZZ("nearby_tab_city_id", C1204880hSY.LIZIZ());
            c2344009Gk.LJIIIIZZ("nearby_rank", strValueOf);
            C20684815ws.LJIILLIIL("dislike_reason_submit", c2344009Gk.LIZ);
            NearbyFeedCellAssem nearbyFeedCellAssem2 = (NearbyFeedCellAssem) awS6S2201000_18.l2;
            nearbyFeedCellAssem2.LLLIL = true;
            Context context = nearbyFeedCellAssem2.getContext();
            if (context != null && (string = context.getString(2131837934)) != null) {
                str3 = string;
            }
            Fragment fragmentLJI = C724240Sb0.LJI((NearbyFeedCellAssem) awS6S2201000_18.l2);
            if (fragmentLJI != null && (view = fragmentLJI.getView()) != null) {
                C118300cf c118300cf = (C118300cf) awS6S2201000_18.l3;
                C1389910mGz c1389910mGz = new C1389910mGz(view);
                c1389910mGz.LJIIJ(str3);
                c1389910mGz.LJI(R.style.y0);
                c1389910mGz.LIZIZ(c118300cf.element);
                C1360890lWB c1360890lWB = c1389910mGz.LIZ;
                c1360890lWB.LIZIZ = 0;
                c1360890lWB.LIZLLL = 3;
                c1389910mGz.LJIIJJI();
            }
        }
        return Boolean.TRUE;
    }

    public static final Object invoke$1(AwS6S2201000_18 awS6S2201000_18) {
        String str;
        View view;
        String string;
        PoiDataStruct poiDataStruct;
        NearbyFeedCellAssem nearbyFeedCellAssem = (NearbyFeedCellAssem) awS6S2201000_18.l2;
        if (!nearbyFeedCellAssem.LLLILZJ) {
            nearbyFeedCellAssem.LLLILZJ = true;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C737400SwE((NearbyFeedCellAssem) awS6S2201000_18.l2, null), 3);
            C1440005kM.LIZ(new C1210880hcE("homepage_nearby", "FUNCTION_FROM_NOT_INTERESTED", "not_interested", ((C1204470hRt) C631370Opb.LIZ((NearbyFeedCellAssem) awS6S2201000_18.l2)).LL));
            C1205290hTD c1205290hTD = C1205290hTD.LIZ;
            String str2 = awS6S2201000_18.s0;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = awS6S2201000_18.s1;
            if (str4 == null) {
                str4 = "";
            }
            Aweme aweme = ((C1204470hRt) C631370Opb.LIZ((NearbyFeedCellAssem) awS6S2201000_18.l2)).LL;
            if (aweme == null || (poiDataStruct = aweme.getPoiDataStruct()) == null || (str = poiDataStruct.poiId) == null) {
                str = "";
            }
            String strValueOf = String.valueOf(awS6S2201000_18.i4);
            c1205290hTD.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "homepage_nearby");
            c2344009Gk.LJIIIIZZ("from_page", "nearby_feedback_window");
            c2344009Gk.LJIIIIZZ("enter_method", "long_press");
            c2344009Gk.LJIIIIZZ("group_id", str2);
            c2344009Gk.LJIIIIZZ("author_id", str4);
            c2344009Gk.LJIIIIZZ("enable_location", C1204880hSY.LIZ());
            C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
            c2344009Gk.LJIIIIZZ("nearby_tab_city_id", C1204880hSY.LIZIZ());
            c2344009Gk.LJIIIIZZ("nearby_rank", strValueOf);
            C20684815ws.LJIILLIIL("dislike", c2344009Gk.LIZ);
            NearbyFeedCellAssem nearbyFeedCellAssem2 = (NearbyFeedCellAssem) awS6S2201000_18.l2;
            nearbyFeedCellAssem2.LLLIL = true;
            Context context = nearbyFeedCellAssem2.getContext();
            if (context != null && (string = context.getString(2131837935)) != null) {
                str3 = string;
            }
            Fragment fragmentLJI = C724240Sb0.LJI((NearbyFeedCellAssem) awS6S2201000_18.l2);
            if (fragmentLJI != null && (view = fragmentLJI.getView()) != null) {
                C118300cf c118300cf = (C118300cf) awS6S2201000_18.l3;
                C1389910mGz c1389910mGz = new C1389910mGz(view);
                c1389910mGz.LJIIJ(str3);
                c1389910mGz.LJI(R.style.y0);
                c1389910mGz.LIZIZ(c118300cf.element);
                C1360890lWB c1360890lWB = c1389910mGz.LIZ;
                c1360890lWB.LIZIZ = 0;
                c1360890lWB.LIZLLL = 3;
                c1389910mGz.LJIIJJI();
            }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS6S2201000_18(NearbyFeedCellAssem nearbyFeedCellAssem, String str, String str2, int i, C118300cf c118300cf, int i2) {
        super(0);
        this.$t = i2;
        this.l2 = nearbyFeedCellAssem;
        this.s0 = str;
        this.s1 = str2;
        this.i4 = i;
        this.l3 = c118300cf;
    }
}
