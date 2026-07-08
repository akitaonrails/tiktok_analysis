package com.ss.android.ugc.aweme.im.saas.host.impl.views;

import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.ss.android.ugc.aweme.im.saas.host.api.views.IMStyleViewBridgeApi;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;

/* JADX INFO: loaded from: classes3.dex */
public final class IMStyleViewBridgeService implements IMStyleViewBridgeApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.views.IMStyleViewBridgeApi
    public final Class<? extends PowerLoadingCell> LIZ() {
        return LoadingCell.class;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.views.IMStyleViewBridgeApi
    public final Class<? extends PowerLoadingCell> LIZIZ() {
        return LoadingFooterCell.class;
    }
}
