package com.bytedance.hybrid.spark.security.api.protocols;

import X.C821850WLv;
import X.C828420Wee;

/* JADX INFO: loaded from: classes14.dex */
public interface SparkSecurityModifyResourceService extends SparkSecurityService {
    C821850WLv handleWillModifyNetworkResponseWithEvent(C828420Wee c828420Wee);

    C821850WLv handleWillModifyWebOfflineResourceWithEvent(C828420Wee c828420Wee);

    C821850WLv shouldModifyResource(C828420Wee c828420Wee);
}
