package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0DHG;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C19719212De;
import X.C241200wU;
import X.C343240Dcw;
import X.C632670Orh;
import X.C985403tE;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell;
import kotlin.jvm.internal.AwS213S0300000_4;
import kotlin.jvm.internal.AwS313S0300000_4;

/* JADX INFO: loaded from: classes5.dex */
public class AkS5S1200000_4 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l1;
    public Object l2;
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

    public static final void LIZ$0(AkS5S1200000_4 akS5S1200000_4, View view) {
        CollabFeedInvitedPendingCell collabFeedInvitedPendingCell = (CollabFeedInvitedPendingCell) akS5S1200000_4.l1;
        Aweme aweme = ((C343240Dcw) akS5S1200000_4.l2).LLILLJJLI;
        int i = CollabFeedInvitedPendingCell.LLIZ;
        collabFeedInvitedPendingCell.L5(aweme, "decline", "", false);
        CollabFeedInvitedPendingCell collabFeedInvitedPendingCell2 = (CollabFeedInvitedPendingCell) akS5S1200000_4.l1;
        C343240Dcw c343240Dcw = (C343240Dcw) akS5S1200000_4.l2;
        Aweme aweme2 = c343240Dcw.LLILLJJLI;
        User user = c343240Dcw.LL;
        collabFeedInvitedPendingCell2.getClass();
        if (C0DHG.LIZ() && C1388190mED.LIZ(collabFeedInvitedPendingCell2.itemView.getContext()) != null) {
            C632670Orh.LIZIZ(collabFeedInvitedPendingCell2.itemView.getContext(), new C19719212De(1309091760, new AwS313S0300000_4(collabFeedInvitedPendingCell2, aweme2, user, 0), true));
        } else {
            C1397580mTM c1397580mTM = new C1397580mTM(collabFeedInvitedPendingCell2.itemView.getContext());
            c1397580mTM.LJI(collabFeedInvitedPendingCell2.itemView.getContext().getString(2131828896));
            c1397580mTM.LIZIZ(collabFeedInvitedPendingCell2.itemView.getContext().getString(2131828895));
            C985403tE.LIZ(c1397580mTM, new AwS213S0300000_4(collabFeedInvitedPendingCell2, aweme2, user, 8));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        CollabFeedInvitedPendingCell collabFeedInvitedPendingCell3 = (CollabFeedInvitedPendingCell) akS5S1200000_4.l1;
        String str = akS5S1200000_4.s0;
        Aweme aweme3 = ((C343240Dcw) akS5S1200000_4.l2).LLILLJJLI;
        collabFeedInvitedPendingCell3.getClass();
        C241200wU c241200wU = C241200wU.LIZ;
        String aid = aweme3.getAid();
        String authorUid = AwemeExtKt.getAuthorUid(aweme3);
        c241200wU.getClass();
        C241200wU.LIZJ(str, aid, authorUid, "collab_panel", "click", "collab_panel_decline");
    }

    public static final void LIZ$1(AkS5S1200000_4 akS5S1200000_4, View view) {
        CollabFeedInvitedPendingCell collabFeedInvitedPendingCell = (CollabFeedInvitedPendingCell) akS5S1200000_4.l1;
        Aweme aweme = ((C343240Dcw) akS5S1200000_4.l2).LLILLJJLI;
        int i = CollabFeedInvitedPendingCell.LLIZ;
        collabFeedInvitedPendingCell.L5(aweme, "authorize", "", false);
        CollabFeedInvitedPendingCell collabFeedInvitedPendingCell2 = (CollabFeedInvitedPendingCell) akS5S1200000_4.l1;
        C343240Dcw c343240Dcw = (C343240Dcw) akS5S1200000_4.l2;
        Aweme aweme2 = c343240Dcw.LLILLJJLI;
        User user = c343240Dcw.LL;
        collabFeedInvitedPendingCell2.getClass();
        if (C0DHG.LIZ() && C1388190mED.LIZ(collabFeedInvitedPendingCell2.itemView.getContext()) != null) {
            C632670Orh.LIZIZ(collabFeedInvitedPendingCell2.itemView.getContext(), new C19719212De(-546424702, new AwS313S0300000_4(collabFeedInvitedPendingCell2, aweme2, user, 2), true));
        } else {
            C1397580mTM c1397580mTM = new C1397580mTM(collabFeedInvitedPendingCell2.itemView.getContext());
            c1397580mTM.LJI(collabFeedInvitedPendingCell2.itemView.getContext().getString(2131828901));
            c1397580mTM.LIZIZ(collabFeedInvitedPendingCell2.itemView.getContext().getString(2131828900));
            C985403tE.LIZ(c1397580mTM, new AwS213S0300000_4(collabFeedInvitedPendingCell2, aweme2, user, 12));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        CollabFeedInvitedPendingCell collabFeedInvitedPendingCell3 = (CollabFeedInvitedPendingCell) akS5S1200000_4.l1;
        String str = akS5S1200000_4.s0;
        Aweme aweme3 = ((C343240Dcw) akS5S1200000_4.l2).LLILLJJLI;
        collabFeedInvitedPendingCell3.getClass();
        C241200wU c241200wU = C241200wU.LIZ;
        String aid = aweme3.getAid();
        String authorUid = AwemeExtKt.getAuthorUid(aweme3);
        c241200wU.getClass();
        C241200wU.LIZJ(str, aid, authorUid, "collab_panel", "click", "collab_panel_accept");
    }

    public AkS5S1200000_4(CollabFeedInvitedPendingCell collabFeedInvitedPendingCell, C343240Dcw c343240Dcw, String str, int i) {
        this.$t = i;
        this.l1 = collabFeedInvitedPendingCell;
        this.l2 = c343240Dcw;
        this.s0 = str;
    }
}
