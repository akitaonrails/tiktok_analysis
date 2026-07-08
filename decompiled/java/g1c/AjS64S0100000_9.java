package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C0NNG;
import X.C0NNI;
import X.C0NNK;
import X.C1388190mED;
import X.C1507790pL7;
import X.C19EG;
import X.C2097608Jq;
import X.C23250099c;
import X.C608250NtP;
import X.C631370Opb;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public class AjS64S0100000_9 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC420730Ged
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS64S0100000_9(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$0(AjS64S0100000_9 ajS64S0100000_9, View view) {
        VideoItemParams videoItemParams;
        Aweme aweme;
        C0NNI c0nni;
        C19EG c19egLIZIZ;
        if (view != null && (videoItemParams = (VideoItemParams) C631370Opb.LIZ((AddYoursEntranceButtonAssem) ajS64S0100000_9.l0)) != null && (aweme = videoItemParams.getAweme()) != null && (c0nni = ((C0NNK) ((AddYoursEntranceButtonAssem) ajS64S0100000_9.l0).Ep().getState()).LL) != null && (c19egLIZIZ = C1388190mED.LIZIZ(view.getContext())) != null) {
            AddYoursEntranceButtonVM addYoursEntranceButtonVMEp = ((AddYoursEntranceButtonAssem) ajS64S0100000_9.l0).Ep();
            C608250NtP c608250NtP = new C608250NtP(aweme, c0nni, c19egLIZIZ, (AddYoursEntranceButtonAssem) ajS64S0100000_9.l0);
            C0NNI c0nni2 = ((C0NNK) addYoursEntranceButtonVMEp.getState()).LL;
            if (c0nni2 != null) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(addYoursEntranceButtonVMEp), null, null, new C0NNG(c0nni2, addYoursEntranceButtonVMEp, c608250NtP, null), 3);
            }
        }
    }

    public static final void LIZ$1(AjS64S0100000_9 ajS64S0100000_9, View view) {
        if (view != null) {
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("page_name", "creator_profile"), new Pair("module_name", "PPS"), new Pair("click_for", "PPS"));
            c1507790pL7.getClass();
            C1507790pL7.LIZJ("creator_profile_pps_tag_click", mapLJIIIIZZ);
            ((View) ajS64S0100000_9.l0).performClick();
        }
    }
}
