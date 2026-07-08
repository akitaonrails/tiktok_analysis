package com.ss.android.ugc.aweme.friends.api;

import X.C0CQT;
import X.C0X9S;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.model.FollowUserListModel;
import com.ss.android.ugc.aweme.friends.model.RecentFriendModel;
import com.ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.ss.android.ugc.aweme.mention.model.MentionGeneralCheckResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class SummonFriendApi {
    public static final SummonFriendService LIZ = (SummonFriendService) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(SummonFriendService.class);

    /* JADX INFO: loaded from: classes5.dex */
    public interface SummonFriendService {
        @InterfaceC1501160pAQ("/tiktok/interaction/mention/general/check/v1")
        C0X9S<MentionGeneralCheckResponse> batchCheckMentionPrivacy(@InterfaceC1501070pAH("uids") String str, @InterfaceC1501070pAH("mention_type") String str2, @InterfaceC1501070pAH("is_check_aweme") boolean z, @InterfaceC1501070pAH("aweme_id") long j);

        @InterfaceC1501160pAQ("/aweme/v1/user/following/list/")
        C0X9S<FollowUserListModel> queryFollowFriends(@InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("user_id") String str, @InterfaceC1501070pAH("sec_user_id") String str2, @InterfaceC1501070pAH("max_time") long j, @InterfaceC1501070pAH("min_time") long j2, @InterfaceC1501070pAH("address_book_access") int i2);

        @InterfaceC1501160pAQ("/aweme/v1/user/recent/contact/")
        C0X9S<RecentFriendModel> queryRecentFriends();

        @InterfaceC1501160pAQ("/aweme/v1/user/recent/contact/")
        C11NZ<RecentFriendModel> queryRecentFriends4At();

        @InterfaceC1501160pAQ("/tiktok/interaction/mention/recent/contact/query/v1")
        C0X9S<Object> queryRecentFriendsV2(@InterfaceC1501070pAH("mention_type") long j);

        @InterfaceC1501160pAQ("/aweme/v1/discover/search/")
        C0X9S<SummonFriendList> searchFriends(@InterfaceC1501070pAH("keyword") String str, @InterfaceC1501070pAH("count") long j, @InterfaceC1501070pAH("cursor") long j2, @InterfaceC1501070pAH("type") int i, @InterfaceC1501070pAH("search_source") String str2, @InterfaceC1501070pAH("filter_block") int i2);
    }
}
