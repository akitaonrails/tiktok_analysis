package com.bytedance.hybrid.spark.security.api.protocols;

import X.C821850WLv;
import X.C828420Wee;

/* JADX INFO: loaded from: classes14.dex */
public interface SparkSecurityNetworkService extends SparkSecurityService {
    C821850WLv handleDidSendNetworkRequestWithEvent(C828420Wee c828420Wee);

    C821850WLv handleDidStartNetworkIntentWithEvent(C828420Wee c828420Wee);

    C821850WLv handleWillSendNetworkRequestWithEvent(C828420Wee c828420Wee);

    C821850WLv handleWillStartNetworkIntentWithEvent(C828420Wee c828420Wee);
}
