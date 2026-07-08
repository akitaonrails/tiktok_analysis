package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C1198160hHi;
import X.C2188811AlT;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.poi.content.poicampaign.MyMomentsNoContentAssem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AkS6S1100000_18 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l1;
    public String s0;

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

    public static final void LIZ$0(AkS6S1100000_18 akS6S1100000_18, View view) {
        Context context = ((MyMomentsNoContentAssem) akS6S1100000_18.l1).getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://openShoot?landing_back=1&shoot_way=");
        sbLIZ.append(akS6S1100000_18.s0);
        sbLIZ.append("&type=use_challenge&challenge_id=");
        sbLIZ.append(((C1198160hHi) ((MyMomentsNoContentAssem) akS6S1100000_18.l1).LLJJI.getValue()).LLILLJJLI);
        SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ)).open();
    }

    public static final void LIZ$1(AkS6S1100000_18 akS6S1100000_18, View view) {
        ((Function1) akS6S1100000_18.l1).invoke(akS6S1100000_18.s0);
    }

    public AkS6S1100000_18(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
