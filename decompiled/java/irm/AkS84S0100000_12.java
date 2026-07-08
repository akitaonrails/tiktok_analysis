package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C1537900q7g;
import X.C1541950qED;
import X.C19EG;
import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.PoiCampaignMainFragment;

/* JADX INFO: loaded from: classes13.dex */
public class AkS84S0100000_12 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public AkS84S0100000_12(PoiCampaignMainFragment poiCampaignMainFragment, int i) {
        this.$t = i;
        this.l0 = poiCampaignMainFragment;
    }

    public static final void LIZ$0(AkS84S0100000_12 akS84S0100000_12, View view) {
        C19EG activity = ((PoiCampaignMainFragment) akS84S0100000_12.l0).getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void LIZ$1(AkS84S0100000_12 akS84S0100000_12, View view) {
        Context context = ((PoiCampaignMainFragment) akS84S0100000_12.l0).getContext();
        if (context != null) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ("aweme://roma_redirect/?spark_page=poi_anchor_campaign_rule");
            c1537900q7g.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
        }
    }
}
