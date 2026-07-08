package com.ss.android.ugc.tiktok.tuc.mask.report;

import X.C11NZ;
import X.C2188811AlT;
import X.C844470XAv;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes3.dex */
public final class CancelReportMaskApi {
    public static final CancelReportMaskApi LIZ = new CancelReportMaskApi();
    public static final RealApi LIZIZ;

    /* JADX INFO: loaded from: classes14.dex */
    public interface RealApi {
        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/aweme/v1/mask/cancel/")
        C11NZ<BaseResponse> cancelReportMask(@InterfaceC1501050pAF("aweme_id") String str, @InterfaceC1501050pAF("mask_type") Integer num, @InterfaceC1501050pAF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) Integer num2);
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        LIZIZ = (RealApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C2188811AlT.LIZIZ(sbLIZ)).build().retrofit.LIZ(RealApi.class);
    }
}
