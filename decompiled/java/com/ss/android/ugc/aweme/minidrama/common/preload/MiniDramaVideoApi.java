package com.ss.android.ugc.aweme.minidrama.common.preload;

import X.C11NZ;
import X.C1617470sC1;
import X.InterfaceC1485405rg;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.minidrama.common.model.TiktokV1PaidContentMiniDramaVideoByIdsRequest;
import com.ss.android.ugc.aweme.minidrama.common.model.TiktokV1PaidContentMiniDramaVideoByIdsResponse;

/* JADX INFO: loaded from: classes25.dex */
public interface MiniDramaVideoApi {
    public static final C1617470sC1 LIZ = C1617470sC1.LIZ;

    @InterfaceC1501170pAR("{path}")
    C11NZ<TiktokV1PaidContentMiniDramaVideoResponse> getMiniDramaVideoList(@InterfaceC1501060pAG(encode = false, value = "path") String str, @InterfaceC1485405rg TiktokV1PaidContentMiniDramaVideoRequest tiktokV1PaidContentMiniDramaVideoRequest);

    @InterfaceC1501170pAR("{path}")
    C11NZ<TiktokV1PaidContentMiniDramaVideoByIdsResponse> getMiniDramaVideoListByIds(@InterfaceC1501060pAG(encode = false, value = "path") String str, @InterfaceC1485405rg TiktokV1PaidContentMiniDramaVideoByIdsRequest tiktokV1PaidContentMiniDramaVideoByIdsRequest);
}
