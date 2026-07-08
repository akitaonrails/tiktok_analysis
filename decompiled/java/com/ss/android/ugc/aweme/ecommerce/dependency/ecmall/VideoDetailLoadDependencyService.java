package com.ss.android.ugc.aweme.ecommerce.dependency.ecmall;

import X.C04TD;
import X.C099R;
import X.C1181304jj;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.IVideoDetailLoadService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.VideoDetailRequestParams;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IVideoDetailLoadDependencyService;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoDetailLoadDependencyService implements IVideoDetailLoadDependencyService {
    public void initService() {
    }

    public static IVideoDetailLoadDependencyService createIVideoDetailLoadDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IVideoDetailLoadDependencyService.class, z);
        if (objLIZ != null) {
            return (IVideoDetailLoadDependencyService) objLIZ;
        }
        if (C04TD.o == null) {
            synchronized (IVideoDetailLoadDependencyService.class) {
                if (C04TD.o == null) {
                    C04TD.o = new VideoDetailLoadDependencyService();
                }
            }
        }
        return C04TD.o;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IVideoDetailLoadDependencyService
    public Object preloadDetail(VideoDetailRequestParams videoDetailRequestParams, boolean z, String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        IVideoDetailLoadService iVideoDetailLoadServiceLIZ = C1181304jj.LIZ();
        if (iVideoDetailLoadServiceLIZ != null) {
            Object objPreloadDetail = iVideoDetailLoadServiceLIZ.preloadDetail(videoDetailRequestParams, z, str, interfaceC1364105Vn);
            if (objPreloadDetail == C099R.LJFF()) {
                return objPreloadDetail;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }
}
