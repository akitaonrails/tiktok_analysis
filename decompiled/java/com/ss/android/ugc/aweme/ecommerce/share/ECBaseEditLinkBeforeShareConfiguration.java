package com.ss.android.ugc.aweme.ecommerce.share;

import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;

/* JADX INFO: loaded from: classes22.dex */
public class ECBaseEditLinkBeforeShareConfiguration<T extends BaseSharePackage> extends TTShareDefaultConfig<BaseSharePackage> {
    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SharePanelLogicProtocol LJ(BaseSharePackage baseSharePackage) {
        return new ECEditBeforeSharePanelLogicProtocol(baseSharePackage);
    }
}
