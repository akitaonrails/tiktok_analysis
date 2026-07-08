package com.ss.android.ugc.aweme.airemix;

import X.C2189821An6;
import X.C275440Aqs;
import com.ss.android.ugc.airemix.api.service.IAIRemixFeedMultiAnchorSuppression;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AIRemixFeedMultiAnchorSuppressionImpl implements IAIRemixFeedMultiAnchorSuppression {
    @Override // com.ss.android.ugc.airemix.api.service.IAIRemixFeedMultiAnchorSuppression
    public final boolean LIZ(Object obj) {
        VideoItemParams videoItemParams;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        DetailNavArgModel navArgModel;
        if (!((Boolean) C275440Aqs.LIZ.getValue()).booleanValue() || !(obj instanceof VideoItemParams) || (videoItemParams = (VideoItemParams) obj) == null || (baseFeedPageParams = videoItemParams.baseFeedPageParams) == null || (c2189821An6 = baseFeedPageParams.param) == null || (navArgModel = c2189821An6.getNavArgModel()) == null) {
            return false;
        }
        return Intrinsics.LJFF(navArgModel.isFromAIRemixChain(), Boolean.TRUE);
    }
}
