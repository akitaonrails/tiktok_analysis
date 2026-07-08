package com.ss.android.ugc.aweme.shortvideo.impl;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.services.external.IAVPublishExtractFrameService;

/* JADX INFO: loaded from: classes3.dex */
public final class AVPublishExtractFrameService implements IAVPublishExtractFrameService {
    @Override // com.ss.android.ugc.aweme.services.external.IAVPublishExtractFrameService
    public final void startExtractFrame(String str, String str2) {
        IPoiVideoPublishService iPoiVideoPublishService = (IPoiVideoPublishService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        if (iPoiVideoPublishService != null) {
            iPoiVideoPublishService.startExtractFrame(str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IAVPublishExtractFrameService
    public final void extractFrameFinish(String str, Long l, String str2, String str3) {
        IPoiVideoPublishService iPoiVideoPublishService = (IPoiVideoPublishService) ServiceManager.get().getService(IPoiService.class);
        if (iPoiVideoPublishService != null) {
            iPoiVideoPublishService.requestVideoUnderstand(str, l, str2, str3);
        }
    }
}
