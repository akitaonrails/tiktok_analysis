package com.ss.android.ugc.aweme.compliance.privacy.phl;

import X.C11NZ;
import X.C344670DfF;
import X.InterfaceC1501160pAQ;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes29.dex */
public final class PhlApi {
    public static final PhlApi LIZ = new PhlApi();
    public static final RealApi LIZIZ;

    public interface RealApi {
        @InterfaceC1501160pAQ("/tiktok/privacy/highlights/videos/v1")
        C11NZ<PhlVideosResponse> getPrivacyHighlightsVideos();
    }

    static {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        String str = C344670DfF.LIZ;
        LIZIZ = (RealApi) iRetrofitFactory.LIZ(C344670DfF.LIZ).create(RealApi.class);
    }
}
