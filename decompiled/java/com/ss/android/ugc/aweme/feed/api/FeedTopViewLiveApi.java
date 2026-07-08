package com.ss.android.ugc.aweme.feed.api;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.feed.model.TopViewLiveInfo;

/* JADX INFO: loaded from: classes.dex */
public interface FeedTopViewLiveApi {
    @InterfaceC1501160pAQ("/aweme/v1/topview/live/")
    C11NZ<TopViewLiveInfo> getTopViewLiveInfo(@InterfaceC1501070pAH("sec_uid") String str);
}
