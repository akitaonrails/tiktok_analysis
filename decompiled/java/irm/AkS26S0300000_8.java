package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0MU2;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialGeneratingReusedUISlot;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class AkS26S0300000_8 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS26S0300000_8 akS26S0300000_8, View view) {
        String str;
        C0MU2 c0mu2 = C0MU2.LIZ;
        AIGCSocialModel aIGCSocialModel = (AIGCSocialModel) akS26S0300000_8.l0;
        if (aIGCSocialModel != null) {
            str = aIGCSocialModel.conversationId;
        } else {
            str = null;
        }
        c0mu2.getClass();
        C0MU2.LIZJ(1, str, "generate_aitheater_video_server_fail");
        ((AITheaterSocialGeneratingReusedUISlot) akS26S0300000_8.l2).zp(C0MU2.LIZ((AIGCSocialModel) akS26S0300000_8.l0, false, (List) akS26S0300000_8.l1, true));
    }

    public static final void LIZ$1(AkS26S0300000_8 akS26S0300000_8, View view) {
        String str;
        C0MU2 c0mu2 = C0MU2.LIZ;
        AIGCSocialModel aIGCSocialModel = (AIGCSocialModel) akS26S0300000_8.l0;
        if (aIGCSocialModel != null) {
            str = aIGCSocialModel.conversationId;
        } else {
            str = null;
        }
        c0mu2.getClass();
        C0MU2.LIZJ(1, str, "generate_aitheater_video_server_fail");
        ((AITheaterSocialGeneratingReusedUISlot) akS26S0300000_8.l2).zp(C0MU2.LIZ((AIGCSocialModel) akS26S0300000_8.l0, false, (List) akS26S0300000_8.l1, true));
    }

    public static final void LIZ$2(AkS26S0300000_8 akS26S0300000_8, View view) {
        String str;
        C0MU2 c0mu2 = C0MU2.LIZ;
        AIGCSocialModel aIGCSocialModel = (AIGCSocialModel) akS26S0300000_8.l0;
        if (aIGCSocialModel != null) {
            str = aIGCSocialModel.conversationId;
        } else {
            str = null;
        }
        c0mu2.getClass();
        C0MU2.LIZJ(1, str, "generate_aitheater_video_check_fail");
        ((AITheaterSocialGeneratingReusedUISlot) akS26S0300000_8.l2).zp(C0MU2.LIZ((AIGCSocialModel) akS26S0300000_8.l0, false, (List) akS26S0300000_8.l1, true));
    }

    public static final void LIZ$3(AkS26S0300000_8 akS26S0300000_8, View view) {
        String str;
        C0MU2 c0mu2 = C0MU2.LIZ;
        AIGCSocialModel aIGCSocialModel = (AIGCSocialModel) akS26S0300000_8.l0;
        if (aIGCSocialModel != null) {
            str = aIGCSocialModel.conversationId;
        } else {
            str = null;
        }
        c0mu2.getClass();
        C0MU2.LIZJ(1, str, "generate_aitheater_video_check_fail");
        ((AITheaterSocialGeneratingReusedUISlot) akS26S0300000_8.l2).zp(C0MU2.LIZ((AIGCSocialModel) akS26S0300000_8.l0, false, (List) akS26S0300000_8.l1, true));
    }

    public AkS26S0300000_8(AIGCSocialModel aIGCSocialModel, List list, AITheaterSocialGeneratingReusedUISlot aITheaterSocialGeneratingReusedUISlot, int i) {
        this.$t = i;
        this.l0 = aIGCSocialModel;
        this.l1 = list;
        this.l2 = aITheaterSocialGeneratingReusedUISlot;
    }
}
