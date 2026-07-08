package com.ss.android.ugc.aweme.commercialize.profile;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* JADX INFO: loaded from: classes20.dex */
public interface FakeUserAwemeApi {
    @InterfaceC1501160pAQ("/tiktok/v1/ad/diversion/post/")
    C0X9S<FeedItemList> getFakeUserAwemeList(@InterfaceC1501070pAH("user_id") String str, @InterfaceC1501070pAH("sec_user_id") String str2, @InterfaceC1501070pAH("max_cursor") long j, @InterfaceC1501070pAH("min_cursor") long j2, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("adv_id") String str3, @InterfaceC1501070pAH("item_id") String str4);
}
