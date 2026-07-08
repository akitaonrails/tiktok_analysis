package com.ss.android.ugc.aweme.nimblecard.tako.vm;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;

/* JADX INFO: loaded from: classes.dex */
public interface NimbleApi {
    @InterfaceC1501160pAQ("/aweme/v1/user/profile/other/")
    Object fetchUserOther(@InterfaceC1501070pAH("user_id") String str, @InterfaceC1501070pAH("sec_user_id") String str2, @InterfaceC1501070pAH("scene_id") Integer num, InterfaceC1364105Vn<? super UserOtherResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/multi/aweme/detail/")
    Object queryBatchAweme(@InterfaceC1501070pAH("aweme_ids") String str, @InterfaceC1501070pAH("request_source") int i, InterfaceC1364105Vn<? super BatchDetailList> interfaceC1364105Vn);
}
