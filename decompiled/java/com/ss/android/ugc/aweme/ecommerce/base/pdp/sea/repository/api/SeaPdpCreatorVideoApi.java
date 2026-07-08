package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.repository.api;

import X.C01K1;
import X.C099R;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501240pAY;
import X.InterfaceC859903Xp;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.service.IGecNetInterceptorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface SeaPdpCreatorVideoApi {
    public static final Companion LIZ = Companion.LIZ;

    public static final class Companion {
        public static final /* synthetic */ Companion LIZ = new Companion();
        public static final C01K1 LIZIZ;

        static {
            C01K1 c01k1Build;
            InterfaceC859903Xp interfaceC859903XpCreateBuilder;
            GecNetInterceptor gecNetInterceptorLIZ;
            IECRetrofitFactory iECRetrofitFactory = (IECRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IECRetrofitFactory.class, false, false, false, 14, null);
            if (iECRetrofitFactory == null || (interfaceC859903XpCreateBuilder = iECRetrofitFactory.createBuilder("https://oec-api.tiktokv.com/")) == null) {
                c01k1Build = null;
            } else {
                IGecNetInterceptorService iGecNetInterceptorService = (IGecNetInterceptorService) PluggableExtentionKt.pluggableSpi$default(IGecNetInterceptorService.class, false, false, false, 14, null);
                if (iGecNetInterceptorService != null && (gecNetInterceptorLIZ = iGecNetInterceptorService.LIZ()) != null) {
                    interfaceC859903XpCreateBuilder.LIZ(gecNetInterceptorLIZ);
                }
                c01k1Build = interfaceC859903XpCreateBuilder.build();
            }
            LIZIZ = c01k1Build;
        }

        public final Object getRecommendList(@InterfaceC1485405rg Map<String, Object> map, InterfaceC1364105Vn<? super Response<RecommendListResponse>> interfaceC1364105Vn) {
            SeaPdpCreatorVideoApi seaPdpCreatorVideoApi;
            C01K1 c01k1 = LIZIZ;
            if (c01k1 != null && (seaPdpCreatorVideoApi = (SeaPdpCreatorVideoApi) c01k1.create(SeaPdpCreatorVideoApi.class)) != null) {
                Object recommendCardList = seaPdpCreatorVideoApi.getRecommendCardList(map, interfaceC1364105Vn);
                if (recommendCardList == C099R.LJFF()) {
                    return recommendCardList;
                }
                return recommendCardList;
            }
            return null;
        }
    }

    @InterfaceC1501240pAY("/api/v1/shop/pdp_creator_video/recommend_card")
    Object getRecommendCardList(@InterfaceC1485405rg Map<String, Object> map, InterfaceC1364105Vn<? super Response<RecommendListResponse>> interfaceC1364105Vn);
}
