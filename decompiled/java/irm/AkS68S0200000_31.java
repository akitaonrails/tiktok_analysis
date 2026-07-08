package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C098200Yq;
import X.C1391850mK7;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1440005kM;
import X.C16CD;
import X.C16CE;
import X.C189200o6;
import X.C20610815kw;
import X.C214878197k;
import X.C316580Cb2;
import X.C453940Hr6;
import X.C737520SwQ;
import X.C985403tE;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.business.bio.cell.ProfileBioMentionCell;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.feed.assem.collab.CollabInvitedButtonAssem;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.ICollabEventTrackingService;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: loaded from: classes32.dex */
public class AkS68S0200000_31 extends AbstractViewOnClickListenerC1173120gdK {
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
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS68S0200000_31 akS68S0200000_31, View view) {
        CollabInvitedButtonAssem collabInvitedButtonAssem = (CollabInvitedButtonAssem) akS68S0200000_31.l0;
        VideoItemParams videoItemParams = (VideoItemParams) akS68S0200000_31.l1;
        collabInvitedButtonAssem.getClass();
        C1397580mTM c1397580mTM = new C1397580mTM(collabInvitedButtonAssem.LJJIJL().getContext());
        c1397580mTM.LJI(collabInvitedButtonAssem.LJJIJL().getContext().getString(2131828901));
        c1397580mTM.LIZIZ(collabInvitedButtonAssem.LJJIJL().getContext().getString(2131828892));
        C985403tE.LIZ(c1397580mTM, new AwS397S0200000_31(collabInvitedButtonAssem, videoItemParams, 10));
        c1397580mTM.LIZLLL(AFwS271S0000000_28.get$arr$(12));
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        C1440005kM.LIZ(new C453940Hr6(true, false, 6));
        C1391850mK7.LIZIZ(c1397510mTF, "393");
        c1397510mTF.LIZLLL();
        ICollabEventTrackingService iCollabEventTrackingServiceLJII = C214878197k.LIZIZ.LJII();
        String str = ((VideoItemParams) akS68S0200000_31.l1).mEventType;
        String aid = ((VideoItemParams) akS68S0200000_31.l1).getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        iCollabEventTrackingServiceLJII.reportCollabAuthorizeEntrance(str, aid, AwemeExtKt.getAuthorUid(((VideoItemParams) akS68S0200000_31.l1).getAweme()), "banner_review", "click", "banner_review");
        CollabInvitedButtonAssem collabInvitedButtonAssem2 = (CollabInvitedButtonAssem) akS68S0200000_31.l0;
        VideoItemParams videoItemParams2 = (VideoItemParams) akS68S0200000_31.l1;
        collabInvitedButtonAssem2.getClass();
        CollabInvitedButtonAssem.Bp(videoItemParams2, false, "");
    }

    public static final void LIZ$1(AkS68S0200000_31 akS68S0200000_31, View view) {
        Object c098200Yq;
        if (!((C316580Cb2) akS68S0200000_31.l0).LL.LJIIJ) {
            C20610815kw.LIZ.getClass();
            try {
                C737520SwQ.LIZ("show_unable_to_mention_prompt", null);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        ((ProfileBioMentionCell) akS68S0200000_31.l1).R5(((C316580Cb2) akS68S0200000_31.l0).LL, "bio_mention");
        ((ProfileBioMentionCell) akS68S0200000_31.l1).N5().xQ2(((C316580Cb2) akS68S0200000_31.l0).LL, ((ProfileBioMentionCell) akS68S0200000_31.l1).getBindingAdapterPosition(), true);
    }

    public static final void LIZ$2(AkS68S0200000_31 akS68S0200000_31, View view) {
        C16CE c16ce = (C16CE) akS68S0200000_31.l0;
        TikTokMediaModel tikTokMediaModel = c16ce.LLILZLL;
        if (tikTokMediaModel != null) {
            ((C16CD) akS68S0200000_31.l1).LLLI(tikTokMediaModel, c16ce.LLIZ, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$3(irm.AkS68S0200000_31 r8, android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS68S0200000_31.LIZ$3(irm.AkS68S0200000_31, android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$4(irm.AkS68S0200000_31 r12, android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS68S0200000_31.LIZ$4(irm.AkS68S0200000_31, android.view.View):void");
    }

    public AkS68S0200000_31(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
