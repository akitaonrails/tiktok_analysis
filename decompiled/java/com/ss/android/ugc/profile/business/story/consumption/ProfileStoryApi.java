package com.ss.android.ugc.profile.business.story.consumption;

import X.C0CQT;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.model.StoryArchDetailResponse;
import com.ss.android.ugc.aweme.story.model.StoryViewInfoResponse;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileStoryApi implements IProfileStoryApi {
    public static final ProfileStoryApi LIZIZ = new ProfileStoryApi();
    public final /* synthetic */ IProfileStoryApi LIZ = (IProfileStoryApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(IProfileStoryApi.class);

    @Override // com.ss.android.ugc.profile.business.story.consumption.IProfileStoryApi
    @InterfaceC1501160pAQ("/tiktok/story/archive/detail/v1")
    public C11NZ<StoryArchDetailResponse> getStoryArchDetail() {
        return this.LIZ.getStoryArchDetail();
    }

    @Override // com.ss.android.ugc.profile.business.story.consumption.IProfileStoryApi
    @InterfaceC1501160pAQ("/tiktok/story/view/info/v1")
    public C11NZ<StoryViewInfoResponse> getStoryViewInfo(@InterfaceC1501070pAH("sec_author_id") String str, @InterfaceC1501070pAH("author_id") String str2) {
        return this.LIZ.getStoryViewInfo(str, str2);
    }
}
