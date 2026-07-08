package com.ss.android.ugc.aweme.iab;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes.dex */
public interface ITtopIABApi {
    @InterfaceC1501160pAQ("/openplatform/governance/review/iab_url_review")
    Object reviewIABUrl(@InterfaceC1501070pAH("url") String str, @InterfaceC1501070pAH("iab_url_scene_type") int i, @InterfaceC1501070pAH("user_id") Long l, @InterfaceC1501070pAH("conversation_id") String str2, @InterfaceC1501070pAH("conversation_type") Integer num, InterfaceC1364105Vn<? super TtopUrlReviewResp> interfaceC1364105Vn);
}
