package com.ss.android.ugc.aweme.api;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.model.CollabAuthCheckResponse;
import com.ss.android.ugc.aweme.model.CollabStatusResponse;

/* JADX INFO: loaded from: classes20.dex */
public interface ICollabApi {
    @InterfaceC1501160pAQ("/tiktok/v1/collab/auth/check")
    C0X9S<CollabAuthCheckResponse> checkCollabEntryAuth();

    @InterfaceC1501160pAQ("/aweme/v1/aweme/post/")
    C0X9S<FeedItemList> fetchCreatorPostList(@InterfaceC1501070pAH("source") int i, @InterfaceC1501070pAH("user_avatar_shrink") String str, @InterfaceC1501070pAH("video_cover_shrink") String str2, @InterfaceC1501070pAH("filter_private") int i2, @InterfaceC1501070pAH("min_cursor") int i3, @InterfaceC1501070pAH("max_cursor") int i4, @InterfaceC1501070pAH("sec_user_id") String str3, @InterfaceC1501070pAH("is_other_user") int i5, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i6, @InterfaceC1501070pAH("count") int i7, @InterfaceC1501070pAH("screen_reader_enable") Boolean bool);

    @InterfaceC1501170pAR("/tiktok/v1/collab/status")
    C0X9S<CollabStatusResponse> updateCollabStatus(@InterfaceC1501070pAH("item_id") long j, @InterfaceC1501070pAH("collab_status") long j2);
}
