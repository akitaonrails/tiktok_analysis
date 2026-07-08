package com.ss.android.ugc.aweme.service;

import X.C1260570iuN;
import X.C1260600iuQ;
import X.C23250099c;
import com.ss.android.ugc.aweme.model.BannerDisplayInfo;
import com.ss.android.ugc.aweme.model.PhotoTopicBannerReadStatus;

/* JADX INFO: loaded from: classes20.dex */
public final class PhotoTopicBannerServiceImpl implements IPhotoTopicBannerService {
    @Override // com.ss.android.ugc.aweme.service.IPhotoTopicBannerService
    public final void LIZIZ() {
        BannerDisplayInfo bannerDisplayInfo = C1260600iuQ.LIZ;
        C1260600iuQ.LIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotoTopicBannerService
    public final void LIZ(PhotoTopicBannerReadStatus photoTopicBannerReadStatus) {
        C23250099c.LIZLLL(C1260600iuQ.LIZIZ, null, null, new C1260570iuN(photoTopicBannerReadStatus, null), 3);
    }
}
