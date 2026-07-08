package com.ss.android.ugc.aweme.social.creation.mediapicker.data;

import X.C0M9J;
import X.C11NZ;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.story.model.StoryArchDetailResponse;

/* JADX INFO: loaded from: classes9.dex */
public interface ISocialMediaPickerAPI {
    public static final C0M9J LIZ = C0M9J.LIZ;

    @InterfaceC1501160pAQ("/tiktok/story/archive/detail/v1")
    C11NZ<StoryArchDetailResponse> getStoryArchDetail();
}
