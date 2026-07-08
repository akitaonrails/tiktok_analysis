package com.ss.android.ugc.aweme.series.feed.searchhub;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.series.feed.IMiniDramaSearchHubService;
import com.ss.android.ugc.aweme.service.IDramaJSBService;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MiniDramaSearchHubServiceImpl implements IMiniDramaSearchHubService {
    @Override // com.ss.android.ugc.aweme.series.feed.IMiniDramaSearchHubService
    public final void LIZ(Map<String, ? extends Object> map) {
        IDramaJSBService.LIZ.getClass();
        IDramaJSBService iDramaJSBService = (IDramaJSBService) PluggableExtentionKt.pluggableSpi$default(IDramaJSBService.class, false, false, false, 14, null);
        if (iDramaJSBService == null) {
            iDramaJSBService = new IDramaJSBService() { // from class: X.04Pp
                @Override // com.ss.android.ugc.aweme.service.IDramaJSBService
                public final void LIZ(Map<String, ? extends Object> map2) {
                }
            };
        }
        iDramaJSBService.LIZ(map);
    }
}
