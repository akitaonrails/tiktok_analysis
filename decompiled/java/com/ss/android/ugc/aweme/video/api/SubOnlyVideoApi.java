package com.ss.android.ugc.aweme.video.api;

import X.C0CPU;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.video.model.SubOnlyVideoResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface SubOnlyVideoApi {
    public static final C0CPU LIZ = C0CPU.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/subscription/aweme/")
    C11NZ<SubOnlyVideoResponse> getSubOnlyVideoList(@InterfaceC1501070pAH("user_id") Long l, @InterfaceC1501070pAH("sec_user_id") String str, @InterfaceC1501070pAH("min_time") long j, @InterfaceC1501070pAH("max_time") long j2, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("cursor") String str2);
}
