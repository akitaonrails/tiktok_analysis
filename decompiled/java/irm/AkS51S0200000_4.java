package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0DHG;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C19719212De;
import X.C343260Dcy;
import X.C632670Orh;
import X.C985403tE;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tako.botpage.cards.novel.image.TakoNovelImageAssem;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell;
import kotlin.jvm.internal.AwS213S0300000_4;
import kotlin.jvm.internal.AwS313S0300000_4;

/* JADX INFO: loaded from: classes5.dex */
public class AkS51S0200000_4 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void LIZ$0(AkS51S0200000_4 akS51S0200000_4, View view) {
        ((TakoNovelImageAssem) akS51S0200000_4.l0).LLLZLL.invoke((SmartImageView) akS51S0200000_4.l1);
    }

    public static final void LIZ$1(AkS51S0200000_4 akS51S0200000_4, View view) {
        ((CollabFeedInvitedCell) akS51S0200000_4.l0).P5("exit_collab");
        CollabFeedInvitedCell collabFeedInvitedCell = (CollabFeedInvitedCell) akS51S0200000_4.l0;
        C343260Dcy c343260Dcy = (C343260Dcy) akS51S0200000_4.l1;
        Aweme aweme = c343260Dcy.LLILZ;
        User user = c343260Dcy.LLILLJJLI;
        collabFeedInvitedCell.R5(aweme, "exit", "", false);
        if (C0DHG.LIZ() && C1388190mED.LIZ(collabFeedInvitedCell.itemView.getContext()) != null) {
            C632670Orh.LIZIZ(collabFeedInvitedCell.itemView.getContext(), new C19719212De(957381240, new AwS313S0300000_4(collabFeedInvitedCell, aweme, user, 1), true));
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(collabFeedInvitedCell.itemView.getContext());
        c1397580mTM.LJI(collabFeedInvitedCell.itemView.getContext().getString(2131828921));
        c1397580mTM.LIZIZ(collabFeedInvitedCell.itemView.getContext().getString(2131828920));
        C985403tE.LIZ(c1397580mTM, new AwS213S0300000_4(collabFeedInvitedCell, aweme, user, 10));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public AkS51S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
