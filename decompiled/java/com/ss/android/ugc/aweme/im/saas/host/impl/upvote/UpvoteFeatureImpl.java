package com.ss.android.ugc.aweme.im.saas.host.impl.upvote;

import X.C1360460lVU;
import X.EnumC1359020lTA;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.upvote.UpvoteFeature;
import com.ss.android.ugc.aweme.upvote.experiment.UpvoteBatchQpsCutoffExp;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvoteFeatureImpl implements UpvoteFeature {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.upvote.UpvoteFeature
    public final boolean LIZIZ() {
        UpvoteBatchQpsCutoffExp.UpvoteBatchQpsCutoffConfig upvoteBatchQpsCutoffConfigLIZIZ;
        return UpvoteBatchQpsCutoffExp.LIZ() && (upvoteBatchQpsCutoffConfigLIZIZ = UpvoteBatchQpsCutoffExp.LIZIZ()) != null && (upvoteBatchQpsCutoffConfigLIZIZ.optTask & 2) == 2;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.upvote.UpvoteFeature
    public final boolean LIZJ() {
        UpvoteBatchQpsCutoffExp.UpvoteBatchQpsCutoffConfig upvoteBatchQpsCutoffConfigLIZIZ;
        return UpvoteBatchQpsCutoffExp.LIZ() && (upvoteBatchQpsCutoffConfigLIZIZ = UpvoteBatchQpsCutoffExp.LIZIZ()) != null && (upvoteBatchQpsCutoffConfigLIZIZ.optTask & 4) == 4;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.upvote.UpvoteFeature
    public final void LIZ(List<? extends Aweme> list) {
        C1360460lVU.LIZIZ.LJJI(list, EnumC1359020lTA.IM_CHAT, null);
    }
}
