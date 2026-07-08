package com.ss.android.ugc.aweme.story.highlights.service;

import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsService;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryHighlightsDetailPageShareVMService implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        HashMap<String, InterfaceC1186204kW> map = new HashMap<>();
        map.put("STORY_ENTRANCE_HIGHLIGHTS", new InterfaceC1186204kW() { // from class: X.04kq
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                IStoryHighlightsService iStoryHighlightsService = (IStoryHighlightsService) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsService.class, false, false, false, 14, null);
                if (iStoryHighlightsService != null) {
                    return iStoryHighlightsService.LIZ(c2189821An6);
                }
                return null;
            }
        });
        return map;
    }
}
