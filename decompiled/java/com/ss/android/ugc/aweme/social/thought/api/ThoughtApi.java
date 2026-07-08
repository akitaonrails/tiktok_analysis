package com.ss.android.ugc.aweme.social.thought.api;

import X.C0CQT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2661011f;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.social.thought.api.model.BatchGetThoughtRequest;
import com.ss.android.ugc.aweme.social.thought.api.model.BatchGetThoughtResponse;
import com.ss.android.ugc.aweme.social.thought.api.model.CreateThoughtResponse;
import com.ss.android.ugc.aweme.social.thought.api.model.DeleteThoughtResponse;
import com.ss.android.ugc.aweme.social.thought.api.model.FriendsThoughtFeedResponse;
import com.ss.android.ugc.aweme.social.thought.api.model.InteractThoughtResponse;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInteractionListResponse;

/* JADX INFO: loaded from: classes36.dex */
public final class ThoughtApi implements IThoughtApi {
    public static final ThoughtApi LIZIZ = new ThoughtApi();
    public final /* synthetic */ IThoughtApi LIZ;

    @Override // com.ss.android.ugc.aweme.social.thought.api.IThoughtApi
    @InterfaceC1501170pAR("/tiktok/v1/thought/batch_get")
    public Object batchGetThought(@InterfaceC1485405rg BatchGetThoughtRequest batchGetThoughtRequest, InterfaceC1364105Vn<? super BatchGetThoughtResponse> interfaceC1364105Vn) {
        return this.LIZ.batchGetThought(batchGetThoughtRequest, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.IThoughtApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/thought/create")
    public Object createThought(@InterfaceC1501050pAF("text_content") String str, InterfaceC1364105Vn<? super CreateThoughtResponse> interfaceC1364105Vn) {
        return this.LIZ.createThought(str, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.IThoughtApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/thought/delete")
    public Object deleteThought(@InterfaceC1501050pAF("thought_id") String str, InterfaceC1364105Vn<? super DeleteThoughtResponse> interfaceC1364105Vn) {
        return this.LIZ.deleteThought(str, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.IThoughtApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/thought/feed")
    public Object getFriendsThoughtFeed(@InterfaceC1501050pAF("page_token") String str, InterfaceC1364105Vn<? super FriendsThoughtFeedResponse> interfaceC1364105Vn) {
        return this.LIZ.getFriendsThoughtFeed(str, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.IThoughtApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/thought/interaction/list")
    public Object getThoughtInteractionList(@InterfaceC1501050pAF("thought_id") String str, @InterfaceC1501050pAF("page_token") String str2, InterfaceC1364105Vn<? super ThoughtInteractionListResponse> interfaceC1364105Vn) {
        return this.LIZ.getThoughtInteractionList(str, str2, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.social.thought.api.IThoughtApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/thought/interact")
    public Object interactThought(@InterfaceC1501050pAF("thought_id") String str, @InterfaceC1501050pAF("action") int i, InterfaceC1364105Vn<? super InteractThoughtResponse> interfaceC1364105Vn) {
        return this.LIZ.interactThought(str, i, interfaceC1364105Vn);
    }

    public ThoughtApi() {
        InterfaceC2661011f interfaceC2661011fLIZ;
        IThoughtApi iThoughtApi;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory == null || (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(C0CQT.LIZJ)) == null || (iThoughtApi = (IThoughtApi) interfaceC2661011fLIZ.create(IThoughtApi.class)) == null) {
            "must be provided".toString();
            throw new IllegalStateException("must be provided");
        }
        this.LIZ = iThoughtApi;
    }
}
