package com.bytedance.hybrid.spark.security.api.protocols;

import X.C821850WLv;
import X.C828420Wee;

/* JADX INFO: loaded from: classes14.dex */
public interface SparkSecurityJSInjectionService extends SparkSecurityService {
    C821850WLv handleEvaluateJSByJSInjectSDKWithEvent(C828420Wee c828420Wee);

    C821850WLv handleInitScriptByJSInjectSDKWithEvent(C828420Wee c828420Wee);

    C821850WLv handleWillEvaluateJSWithEvent(C828420Wee c828420Wee);

    C821850WLv handleWillLoadURLWithScriptWithEvent(C828420Wee c828420Wee);
}
