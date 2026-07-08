package com.ss.android.ugc.aweme.share.config;

import X.AbstractC1372680lpC;
import X.C1372700lpE;
import X.C13LE;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.ShareTitleProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;

/* JADX INFO: loaded from: classes22.dex */
public class TTShareDefaultConfig<T extends BaseSharePackage> extends ShareConfiguration<BaseSharePackage> {
    public final C1372700lpE LL = new C1372700lpE("default_share", C13LE.LIZ(SharePackage.class));

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public AbstractC1372680lpC LIZLLL() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public CustomSharePanelBarProtocol LIZ(BaseSharePackage baseSharePackage) {
        return new TTCustomSharePanelBarProtocol();
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public SharePanelLogicProtocol LJ(BaseSharePackage baseSharePackage) {
        return new TTSharePanelLogicProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public ShareTitleProtocol LJFF(BaseSharePackage baseSharePackage) {
        return new TTShareTitleProtocol();
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public SheetActionProtocol LJI(BaseSharePackage baseSharePackage) {
        return new TTSheetActionProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public ShareChannelProtocol LIZJ(Context context, BaseSharePackage baseSharePackage) {
        return new TTShareChannelProtocol(baseSharePackage);
    }
}
