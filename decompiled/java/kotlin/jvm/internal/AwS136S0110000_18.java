package kotlin.jvm.internal;

import X.AbstractC1604130rqV;
import X.C09AY;
import X.C0I7D;
import X.C1189060h32;
import X.C1200940hMC;
import X.C1391190mJ3;
import X.C13LP;
import X.C1537900q7g;
import X.C1541950qED;
import X.C2188811AlT;
import X.C343970De7;
import X.InterfaceC1542790qFZ;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpIntegrateLynxAirModel;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsMainElementsAssem;
import com.ss.android.ugc.aweme.search.detail.bottombar.ui.SearchDetailPoiBottomAssem;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS136S0110000_18 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS136S0110000_18 awS136S0110000_18) {
        ((AbstractC1604130rqV) ((EditCollectionFragment) awS136S0110000_18.l0).LLJJIJIL.getValue()).LJ("InputNameSheetFragment cancel button click");
        if (awS136S0110000_18.z1) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF((EditCollectionFragment) awS136S0110000_18.l0, C343970De7.LIZ);
        } else {
            C0I7D c0i7d = ((EditCollectionFragment) awS136S0110000_18.l0).LLILLJJLI;
            if (c0i7d != null) {
                KeyboardUtils.LIZIZ(c0i7d);
            }
            String str2 = TuxSheet._pnsPageId;
            C1391190mJ3.LJIILJJIL((EditCollectionFragment) awS136S0110000_18.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS136S0110000_18 awS136S0110000_18) {
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = ((MyMomentsMainElementsAssem) awS136S0110000_18.l0).LJJIJL().getContext();
        SparkContext sparkContext = new SparkContext();
        boolean z = awS136S0110000_18.z1;
        final MyMomentsMainElementsAssem myMomentsMainElementsAssem = (MyMomentsMainElementsAssem) awS136S0110000_18.l0;
        sparkContext.LJJLIIJ("aweme://roma_redirect/?spark_page=poi_anchor_campaign_share");
        sparkContext.LJJJZ("enter_from", "my_year_campaign_landing_page");
        sparkContext.LJJJZ("is_poi_publish_new_user", C1189060h32.LJJIJ(!z));
        C1200940hMC c1200940hMC = C1200940hMC.LIZ;
        Context context2 = myMomentsMainElementsAssem.LJJIJL().getContext();
        c1200940hMC.getClass();
        sparkContext.LJJJZ("enable_location", C1189060h32.LJJIJ(C1200940hMC.LIZIZ(context2)));
        Boolean boolValueOf = null;
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        Boolean boolValueOf2 = null;
        if (iLocationBaseServiceForMT != null) {
            boolValueOf = Boolean.valueOf(iLocationBaseServiceForMT.LJ(myMomentsMainElementsAssem.LJJIJL().getContext()));
        }
        String strLJJIIZI = C1189060h32.LJJIIZI(boolValueOf);
        String str = CardStruct.IStatusCode.DEFAULT;
        if (strLJJIIZI == null) {
            strLJJIIZI = CardStruct.IStatusCode.DEFAULT;
        }
        sparkContext.LJJJZ("system_is_precise", strLJJIIZI);
        ILocationBaseServiceForMT iLocationBaseServiceForMT2 = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        if (iLocationBaseServiceForMT2 != null) {
            boolValueOf2 = Boolean.valueOf(iLocationBaseServiceForMT2.LJJIJ());
        }
        String strLJJIIZI2 = C1189060h32.LJJIIZI(boolValueOf2);
        if (strLJJIIZI2 != null) {
            str = strLJJIIZI2;
        }
        sparkContext.LJJJZ("inapp_is_precise", str);
        sparkContext.LJJJLZIJ(myMomentsMainElementsAssem.Jo().LL.LIZLLL, "hide_shoot");
        sparkContext.LJJJLZIJ(1, "roma_enable_with_param");
        sparkContext.LJJJZ("section", "rewards");
        sparkContext.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0hCR
            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJJJI() {
                return !C444960Hcc.LIZJ(myMomentsMainElementsAssem.LJJIJL().getContext()) ? new C1725480v0E(R.anim.g6, R.anim.ed) : new C1725480v0E(R.anim.g5, R.anim.ed);
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJLI() {
                return !C444960Hcc.LIZJ(myMomentsMainElementsAssem.LJJIJL().getContext()) ? new C1725480v0E(0, R.anim.g8) : new C1725480v0E(0, R.anim.g7);
            }
        });
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS136S0110000_18 awS136S0110000_18) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preCreate ");
        sbLIZ.append(awS136S0110000_18.z1);
        sbLIZ.append(' ');
        List<String> list = ((PdpIntegrateLynxAirModel) awS136S0110000_18.l0).geckoChannels;
        if (list != null) {
            str = (String) C13LP.LJJJLL(list);
        } else {
            str = null;
        }
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS136S0110000_18 awS136S0110000_18) {
        ((SearchDetailPoiBottomAssem) awS136S0110000_18.l0).Ho(awS136S0110000_18.z1, true);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S0110000_18(EditCollectionFragment editCollectionFragment, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = editCollectionFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S0110000_18(MyMomentsMainElementsAssem myMomentsMainElementsAssem, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = myMomentsMainElementsAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S0110000_18(SearchDetailPoiBottomAssem searchDetailPoiBottomAssem, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = searchDetailPoiBottomAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S0110000_18(boolean z, PdpIntegrateLynxAirModel pdpIntegrateLynxAirModel, int i) {
        super(0);
        this.$t = i;
        this.z1 = z;
        this.l0 = pdpIntegrateLynxAirModel;
    }
}
