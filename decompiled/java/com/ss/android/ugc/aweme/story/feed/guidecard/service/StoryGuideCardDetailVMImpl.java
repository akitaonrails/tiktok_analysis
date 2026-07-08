package com.ss.android.ugc.aweme.story.feed.guidecard.service;

import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardShareViewModel;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryGuideCardDetailVMImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        HashMap<String, InterfaceC1186204kW> map = new HashMap<>();
        map.put("STORY_ENTRANCE_GUIDE_CARD", new InterfaceC1186204kW() { // from class: X.04ko
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                String storyGuideCardKey = c2189821An6.getStoryGuideCardKey();
                if (storyGuideCardKey == null) {
                    storyGuideCardKey = "";
                }
                return new Pair<>(storyGuideCardKey, StoryGuideCardShareViewModel.class);
            }
        });
        return map;
    }
}
