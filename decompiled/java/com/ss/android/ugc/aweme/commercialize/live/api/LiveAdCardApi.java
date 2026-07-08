package com.ss.android.ugc.aweme.commercialize.live.api;

import X.C0X9S;
import X.C1020710cfV;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;

/* JADX INFO: loaded from: classes17.dex */
public interface LiveAdCardApi {
    public static final C1020710cfV LIZ = C1020710cfV.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/ad/live/component/detail/")
    C0X9S<LiveAdCardModel> getLiveAdCardInfo(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("author_id") String str2, @InterfaceC1501070pAH("sec_author_id") String str3, @InterfaceC1501070pAH("component_type") int i, @InterfaceC1501070pAH("creative_id") long j, @InterfaceC1501070pAH("component_payload") String str4);
}
