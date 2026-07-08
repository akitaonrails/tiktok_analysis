package kotlin.jvm.internal;

import X.AbstractC21673619ry;
import X.C09AY;
import X.C1182610gsd;
import X.C1189920h4Q;
import X.C1331660kl2;
import X.C18Z8;
import X.C20600815jK;
import X.C20684815ws;
import X.C21685719tv;
import X.C2188811AlT;
import X.C2344009Gk;
import X.InterfaceC1325460kb2;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesManager;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesVM;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.dishes.gallery.PoiRecommendDishesGalleryAssem;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS142S0201000_18 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS142S0201000_18 awS142S0201000_18) {
        Integer numValueOf;
        Integer numValueOf2;
        C20600815jK<InterfaceC1891350zJl> state;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bodyList scroll IDLE at/near top firstVisible=");
        sbLIZ.append(awS142S0201000_18.i2);
        sbLIZ.append(" lastVisible=");
        RavenFragment ravenFragment = (RavenFragment) awS142S0201000_18.l0;
        RecyclerView recyclerView = (RecyclerView) awS142S0201000_18.l1;
        ravenFragment.getClass();
        sbLIZ.append(RavenFragment.nS(recyclerView));
        sbLIZ.append(" adapterCount=");
        AbstractC21673619ry adapter = ((RecyclerView) awS142S0201000_18.l1).getAdapter();
        if (adapter != null) {
            numValueOf = Integer.valueOf(adapter.getItemCount());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" childCount=");
        sbLIZ.append(((RecyclerView) awS142S0201000_18.l1).getChildCount());
        sbLIZ.append(" stateSize=");
        C18Z8 c18z8 = ((RavenFragment) awS142S0201000_18.l0).LLJILJIL;
        if (c18z8 != null && (state = c18z8.getState()) != null) {
            numValueOf2 = Integer.valueOf(state.LJIIIIZZ());
        } else {
            numValueOf2 = null;
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS142S0201000_18.l0).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS142S0201000_18 awS142S0201000_18) {
        int i;
        LocationServicesVM locationServicesVM;
        int i2 = ((Bundle) awS142S0201000_18.l0).getInt("gps_authorization");
        if (awS142S0201000_18.i2 == i2) {
            i = 0;
        } else {
            i = 1;
        }
        WeakReference<LocationServicesVM> weakReference = LocationServicesManager.LJ;
        if (weakReference != null && (locationServicesVM = weakReference.get()) != null) {
            Context context = (Context) awS142S0201000_18.l1;
            Integer numValueOf = Integer.valueOf(i);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "location_services_setting");
            c2344009Gk.LIZJ(i2, "gps_authorization");
            c2344009Gk.LJ(numValueOf, "is_changed");
            Map<String, String> map = c2344009Gk.LIZ;
            if (context != null) {
                ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIII(context, map);
            }
            C20684815ws.LJIILLIIL("system_location_device_setting_result", map);
            locationServicesVM.vQ2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS142S0201000_18 awS142S0201000_18) {
        Uri uri = (Uri) awS142S0201000_18.l0;
        if (uri != null) {
            PoiRecommendDishesGalleryAssem poiRecommendDishesGalleryAssem = (PoiRecommendDishesGalleryAssem) awS142S0201000_18.l1;
            int i = awS142S0201000_18.i2;
            poiRecommendDishesGalleryAssem.getClass();
            InterfaceC1325460kb2 interfaceC1325460kb2LIZJ = C1331660kl2.LIZJ();
            if (interfaceC1325460kb2LIZJ != null) {
                interfaceC1325460kb2LIZJ.LJIIL(uri, new C1182610gsd(i, uri, poiRecommendDishesGalleryAssem));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS142S0201000_18 awS142S0201000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C1189920h4Q) awS142S0201000_18.l0).itemView.hashCode());
        sbLIZ.append('_');
        sbLIZ.append(((PoiListApi.PostTag) awS142S0201000_18.l1).tagCode);
        sbLIZ.append('_');
        sbLIZ.append(awS142S0201000_18.i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS142S0201000_18 awS142S0201000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setupBodyGroupLayout restored span lookup for StaggeredGridLayoutHandler startIndex=");
        sbLIZ.append(awS142S0201000_18.i2);
        sbLIZ.append(" lane=");
        sbLIZ.append(((C21685719tv) awS142S0201000_18.l0).LJIIJJI);
        sbLIZ.append(" dataSize=");
        sbLIZ.append(((int[]) awS142S0201000_18.l1).length);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S0201000_18(int i, C21685719tv c21685719tv, int[] iArr, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c21685719tv;
        this.l1 = iArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S0201000_18(int i, Uri uri, PoiRecommendDishesGalleryAssem poiRecommendDishesGalleryAssem, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = uri;
        this.l1 = poiRecommendDishesGalleryAssem;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS142S0201000_18(int i, int i2, RavenFragment<CONTEXT> ravenFragment, RecyclerView recyclerView) {
        super(0);
        this.$t = recyclerView;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = ravenFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S0201000_18(C1189920h4Q c1189920h4Q, PoiListApi.PostTag postTag, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1189920h4Q;
        this.l1 = postTag;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS142S0201000_18(Context context, int i, Bundle bundle, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = bundle;
        this.i2 = i;
        this.l1 = context;
    }
}
