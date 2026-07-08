package com.ss.android.ugc.aweme.im.whee.ug.impl.interceptor;

import com.bytedance.router.SmartRouter;

/* JADX INFO: loaded from: classes29.dex */
public final class IMWheeUGRouterAnchorTask {
    public void anchor(Object obj) {
        SmartRouter.addInterceptor(new IMWheeUGRouterInterceptor());
    }
}
