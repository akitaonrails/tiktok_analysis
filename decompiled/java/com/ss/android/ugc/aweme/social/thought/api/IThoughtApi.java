package com.ss.android.ugc.aweme.social.thought.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.social.thought.api.model.BatchGetThoughtRequest;
import com.ss.android.ugc.aweme.social.thought.api.model.BatchGetThoughtResponse;
import com.ss.android.ugc.aweme.social.thought.api.model.CreateThoughtResponse;
import com.ss.android.ugc.aweme.social.thought.api.model.DeleteThoughtResponse;
import com.ss.android.ugc.aweme.social.thought.api.model.FriendsThoughtFeedResponse;
import com.ss.android.ugc.aweme.social.thought.api.model.InteractThoughtResponse;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInteractionListResponse;

/* JADX INFO: loaded from: classes36.dex */
public interface IThoughtApi {
    @InterfaceC1501170pAR("/tiktok/v1/thought/batch_get")
    Object batchGetThought(@InterfaceC1485405rg BatchGetThoughtRequest batchGetThoughtRequest, InterfaceC1364105Vn<? super BatchGetThoughtResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/thought/create")
    Object createThought(@InterfaceC1501050pAF("text_content") String str, InterfaceC1364105Vn<? super CreateThoughtResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/thought/delete")
    Object deleteThought(@InterfaceC1501050pAF("thought_id") String str, InterfaceC1364105Vn<? super DeleteThoughtResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/thought/feed")
    Object getFriendsThoughtFeed(@InterfaceC1501050pAF("page_token") String str, InterfaceC1364105Vn<? super FriendsThoughtFeedResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/thought/interaction/list")
    Object getThoughtInteractionList(@InterfaceC1501050pAF("thought_id") String str, @InterfaceC1501050pAF("page_token") String str2, InterfaceC1364105Vn<? super ThoughtInteractionListResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/thought/interact")
    Object interactThought(@InterfaceC1501050pAF("thought_id") String str, @InterfaceC1501050pAF("action") int i, InterfaceC1364105Vn<? super InteractThoughtResponse> interfaceC1364105Vn);
}
