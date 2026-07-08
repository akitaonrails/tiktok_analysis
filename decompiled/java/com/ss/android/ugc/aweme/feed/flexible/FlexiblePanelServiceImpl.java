package com.ss.android.ugc.aweme.feed.flexible;

import com.bytedance.router.interceptor.IInterceptor;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FlexiblePanelServiceImpl implements IFlexiblePanelService {
    @Override // com.ss.android.ugc.aweme.feed.flexible.IFlexiblePanelService
    public final List<IInterceptor> LIZ() {
        return Collections.singletonList(new FlexiblePanelRouteInterceptor());
    }
}
