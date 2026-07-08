package com.ss.android.ugc.aweme.base.api;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.mention.model.MentionGeneralCheckResponse;
import com.ss.android.ugc.aweme.model.MentionCommentSortedResponse;
import com.ss.android.ugc.aweme.model.MentionFollowFriendResponse;
import com.ss.android.ugc.aweme.model.MentionRecentContactResponse;
import com.ss.android.ugc.aweme.model.MentionRecommendResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface IMentionApi {
    @InterfaceC1501160pAQ("/tiktok/interaction/mention/general/check/v1")
    C0X9S<MentionGeneralCheckResponse> queryMentionCheck(@InterfaceC1501070pAH("uids") String str, @InterfaceC1501070pAH("mention_type") String str2, @InterfaceC1501070pAH("is_check_aweme") boolean z, @InterfaceC1501070pAH("aweme_id") long j);

    @InterfaceC1501160pAQ("/aweme/v1/at/default/list/")
    C0X9S<MentionFollowFriendResponse> queryMentionFollowings(@InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("cursor") int i2, @InterfaceC1501070pAH("scenario") Integer num);

    @InterfaceC1501160pAQ("/tiktok/interaction/mention/recent/contact/query/v1")
    C0X9S<MentionRecentContactResponse> queryMentionRecentContacts(@InterfaceC1501070pAH("mention_type") long j);

    @InterfaceC1501160pAQ("/tiktok/interaction/mention/contact/query/v2")
    C0X9S<MentionRecommendResponse> queryMentionRecommendList(@InterfaceC1501070pAH("mention_type") long j, @InterfaceC1501070pAH("pagination") String str, @InterfaceC1501070pAH("aweme_id") Long l, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) Long l2);

    @InterfaceC1501160pAQ("/tiktok/v1/interacion_mention/sorted_list")
    C0X9S<MentionCommentSortedResponse> queryMentionSortedList(@InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("cursor") int i2);
}
