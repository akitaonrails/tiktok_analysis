package com.ss.android.ugc.aweme.mention.service;

import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: loaded from: classes3.dex */
public final class MentionViewServiceImpl implements IMentionViewService {
    @Override // com.ss.android.ugc.aweme.mention.service.IMentionViewService
    public final void LIZ(Fragment fragment) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(fragment.getContext(), "//social/mention/publish");
        smartRouteBuildRoute.withParam("extra_video_id", "");
        smartRouteBuildRoute.withParam("finish_activity_when_mention_risk", true);
        smartRouteBuildRoute.withParam("extra_from", "caption");
        smartRouteBuildRoute.open(3);
    }
}
