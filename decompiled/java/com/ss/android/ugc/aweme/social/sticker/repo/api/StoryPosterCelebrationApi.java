package com.ss.android.ugc.aweme.social.sticker.repo.api;

import X.C11NZ;
import X.C1886760zCM;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.social.sticker.model.base.StoryRelationshipCelebrationMaterialsResponse;
import com.ss.android.ugc.aweme.social.sticker.model.base.StoryRelationshipCelebrationsResponse;

/* JADX INFO: loaded from: classes29.dex */
public interface StoryPosterCelebrationApi {
    public static final C1886760zCM LIZ = C1886760zCM.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/story/relationship/celebration_materials")
    C11NZ<StoryRelationshipCelebrationMaterialsResponse> getRelationshipCelebrationMaterials(@InterfaceC1501120pAM("celebration_type") int i, @InterfaceC1501120pAM("celebration_date") long j, @InterfaceC1501120pAM("relationships") String str);

    @InterfaceC1501160pAQ("/tiktok/v1/story/relationship/celebrations")
    C11NZ<StoryRelationshipCelebrationsResponse> getRelationshipCelebrations(@InterfaceC1501120pAM("celebration_type") int i);
}
