package com.ss.android.ugc.aweme.share.business.config;

import X.AbstractC1372680lpC;
import X.C1372040loA;
import X.C13LE;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;

/* JADX INFO: loaded from: classes22.dex */
public class AwemeShareConfiguration<T> extends TTShareDefaultConfig<AwemeSharePackage> {
    public static final C1372040loA LLILLJJLI = new C1372040loA("aweme", C13LE.LIZ(AwemeSharePackage.class));

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public AbstractC1372680lpC LIZLLL() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public CustomSharePanelBarProtocol LIZ(BaseSharePackage baseSharePackage) {
        return new AwemeImShareBarProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public SharePanelLogicProtocol LJ(BaseSharePackage baseSharePackage) {
        return new AwemeSharePanelLogicProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public SheetActionProtocol LJI(BaseSharePackage baseSharePackage) {
        return new AwemeSheetActionProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public ShareChannelProtocol LIZJ(Context context, BaseSharePackage baseSharePackage) {
        return new AwemeChannelShareProtocol(context, baseSharePackage);
    }
}
