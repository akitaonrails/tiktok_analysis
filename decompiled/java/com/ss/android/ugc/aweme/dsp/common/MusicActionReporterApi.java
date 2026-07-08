package com.ss.android.ugc.aweme.dsp.common;

import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes35.dex */
public final class MusicActionReporterApi {
    public static MusicActionReporterOperatorApi LIZ;

    public interface MusicActionReporterOperatorApi {
        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/music/dsp/action/report/v2/")
        C11NZ<BaseResponse> actionReport(@InterfaceC1501050pAF("actions") String str);
    }
}
