package com.ss.android.ugc.aweme.search.pages.result.topsearch.llm.core.api;

import X.C1515820pY4;
import X.C15O7;
import X.C1ER1;
import X.C682710QqD;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501240pAY;
import X.InterfaceC2174608fY;
import X.InterfaceC2661011f;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.LLMStreamResponse;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.llm.core.api.SearchLLMApi;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.llm.core.model.StreamEventResponse;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLLMApi {
    public static final SearchLLMApi LIZ = new SearchLLMApi();
    public static final InterfaceC2661011f LIZIZ = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C1ER1.LIZIZ.LJIILJJIL());

    public interface RealApi {
        public static final C682710QqD LIZ = new Object() { // from class: X.0QqD
            public static final SearchLLMApi.RealApi LIZIZ;

            static {
                SearchLLMApi.LIZ.getClass();
                LIZIZ = (SearchLLMApi.RealApi) SearchLLMApi.LIZIZ.create(SearchLLMApi.RealApi.class);
            }
        };

        @InterfaceC2174608fY
        @InterfaceC1501240pAY("/aweme/v1/search/stream/loadmore/")
        @InterfaceC1485505rh
        C15O7<C1515820pY4<StreamEventResponse>> searchLLMRequestDesc(@InterfaceC1501100pAK("op_type") int i, @InterfaceC1501100pAK("stream_param") String str, @InterfaceC1501100pAK("keyword") String str2);

        @InterfaceC2174608fY
        @InterfaceC1501240pAY("/aweme/v1/search/llm/stream/")
        @InterfaceC1485505rh
        Object searchLLMStream(@InterfaceC1501100pAK(Scene.SCENE_SERVICE) Integer num, @InterfaceC1501100pAK("stream_key") String str, @InterfaceC1501100pAK("next_key") String str2, @InterfaceC1501100pAK("search_id") String str3, @InterfaceC1501100pAK("doc_id") String str4, @InterfaceC1501100pAK("biz_param") String str5, @InterfaceC1501100pAK("retry") Integer num2, InterfaceC1364105Vn<? super C1515820pY4<LLMStreamResponse>> interfaceC1364105Vn);

        @InterfaceC2174608fY
        @InterfaceC1501240pAY("/aweme/v1/search/stream/loadmore/")
        @InterfaceC1485505rh
        Object searchOnlineCard(@InterfaceC1501100pAK("op_type") int i, @InterfaceC1501100pAK("stream_param") String str, @InterfaceC1501100pAK("keyword") String str2, @InterfaceC1501100pAK("enable_tako_entrance") Integer num, @InterfaceC1501100pAK("search_id") String str3, InterfaceC1364105Vn<? super C1515820pY4<StreamEventResponse>> interfaceC1364105Vn);
    }
}
