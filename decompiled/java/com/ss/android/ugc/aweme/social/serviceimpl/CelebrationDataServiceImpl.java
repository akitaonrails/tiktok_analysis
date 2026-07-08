package com.ss.android.ugc.aweme.social.serviceimpl;

import X.C11NZ;
import X.C1886760zCM;
import com.ss.android.ugc.aweme.social.service.ICelebrationDataService;
import com.ss.android.ugc.aweme.social.sticker.repo.api.StoryPosterCelebrationApi;

/* JADX INFO: loaded from: classes29.dex */
public final class CelebrationDataServiceImpl implements ICelebrationDataService {
    @Override // com.ss.android.ugc.aweme.social.service.ICelebrationDataService
    public final C11NZ LIZIZ() {
        StoryPosterCelebrationApi.LIZ.getClass();
        StoryPosterCelebrationApi storyPosterCelebrationApi = C1886760zCM.LIZIZ;
        if (storyPosterCelebrationApi != null) {
            return storyPosterCelebrationApi.getRelationshipCelebrations(8);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.social.service.ICelebrationDataService
    public final C11NZ LIZ(long j, String str) {
        StoryPosterCelebrationApi.LIZ.getClass();
        StoryPosterCelebrationApi storyPosterCelebrationApi = C1886760zCM.LIZIZ;
        if (storyPosterCelebrationApi != null) {
            return storyPosterCelebrationApi.getRelationshipCelebrationMaterials(8, j, str);
        }
        return null;
    }
}
