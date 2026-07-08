package com.ss.android.ugc.aweme.feed.assem.quickcomment;

import X.C0BJT;
import X.C0R93;
import X.C10EU;
import X.C1351250lGd;
import X.C523420Kfs;
import X.C729510SjV;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendTabQuickCommentTrigger extends VideoQuickCommentTrigger {
    @Override // com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentTrigger, com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean kp(BaseFeedPageParams baseFeedPageParams, int i) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentTrigger, com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        if (C0BJT.LIZ() && C0R93.LIZ(videoItemParams.mEventType) && !videoItemParams.getAweme().isAd() && !C729510SjV.LJJIJIL(videoItemParams.getAweme()) && !C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(videoItemParams.getAweme()))) {
            C1351250lGd c1351250lGd = C1351250lGd.LIZ;
            Aweme aweme = videoItemParams.getAweme();
            c1351250lGd.getClass();
            if (!C1351250lGd.LJIIJ(aweme) && (!ComplianceServiceProvider.LJFF().LIZJ(3)) && !ComplianceServiceProvider.LJFF().LJFF()) {
                CommentService.LIZ.getClass();
                if (!C523420Kfs.LIZ().LJIILLIIL(videoItemParams.getAweme()) && C523420Kfs.LIZ().LJJIJIIJIL(videoItemParams.getAweme())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
