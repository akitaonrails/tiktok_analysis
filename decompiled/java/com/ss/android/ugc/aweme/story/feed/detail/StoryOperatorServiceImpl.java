package com.ss.android.ugc.aweme.story.feed.detail;

import X.InterfaceC1186204kW;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.archive.StoryArchListViewModel;
import com.ss.android.ugc.aweme.story.archive2.IStoryArchiveV2Service;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryOperatorServiceImpl implements IDetailPageShareVMService {
    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, InterfaceC1186204kW> LIZ() {
        HashMap<String, InterfaceC1186204kW> map = new HashMap<>();
        map.put("STORY_ENTRANCE_ARCHIVE", new InterfaceC1186204kW() { // from class: X.04kn
            @Override // X.InterfaceC1186204kW
            public final Pair<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(C2189821An6 c2189821An6) {
                if (C1189504l3.LIZ()) {
                    IStoryArchiveV2Service iStoryArchiveV2Service = (IStoryArchiveV2Service) PluggableExtentionKt.pluggableSpi$default(IStoryArchiveV2Service.class, false, false, false, 14, null);
                    if (iStoryArchiveV2Service != null) {
                        return iStoryArchiveV2Service.LIZ(c2189821An6);
                    }
                    return null;
                }
                return new Pair<>("story_arch_list", StoryArchListViewModel.class);
            }
        });
        return map;
    }
}
