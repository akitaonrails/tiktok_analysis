package com.ss.android.ugc.aweme.im.saas.host.impl.repost;

import X.C10EU;
import X.C1359720lUI;
import X.C1360460lVU;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.repost.RepostFeature;
import com.ss.android.ugc.aweme.upvote.service.IUpvoteService;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class RepostFeatureImpl implements RepostFeature {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.repost.RepostFeature
    public final boolean LIZ() {
        return C1360460lVU.LIZIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.repost.RepostFeature
    public final boolean LIZIZ(Aweme aweme) {
        UpvoteList upvoteListLJIIIIZZ;
        List<UpvoteStruct> list;
        IUpvoteService iUpvoteService = (IUpvoteService) PluggableExtentionKt.pluggableSpi$default(IUpvoteService.class, false, false, false, 14, null);
        if (iUpvoteService != null) {
            upvoteListLJIIIIZZ = iUpvoteService.LJIIIIZZ(aweme.getAid());
        } else {
            upvoteListLJIIIIZZ = null;
        }
        if (upvoteListLJIIIIZZ == null || (list = upvoteListLJIIIIZZ.upvotes) == null || list.isEmpty()) {
            return false;
        }
        for (UpvoteStruct upvoteStruct : list) {
            if (C10EU.LJIILLIIL(upvoteStruct.user) && C1359720lUI.LJ(upvoteStruct)) {
                return true;
            }
        }
        return false;
    }
}
