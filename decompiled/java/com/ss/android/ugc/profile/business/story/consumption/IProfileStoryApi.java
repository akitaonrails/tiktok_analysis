package com.ss.android.ugc.profile.business.story.consumption;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.story.model.StoryArchDetailResponse;
import com.ss.android.ugc.aweme.story.model.StoryViewInfoResponse;

/* JADX INFO: loaded from: classes20.dex */
public interface IProfileStoryApi {
    @InterfaceC1501160pAQ("/tiktok/story/archive/detail/v1")
    C11NZ<StoryArchDetailResponse> getStoryArchDetail();

    @InterfaceC1501160pAQ("/tiktok/story/view/info/v1")
    C11NZ<StoryViewInfoResponse> getStoryViewInfo(@InterfaceC1501070pAH("sec_author_id") String str, @InterfaceC1501070pAH("author_id") String str2);
}
