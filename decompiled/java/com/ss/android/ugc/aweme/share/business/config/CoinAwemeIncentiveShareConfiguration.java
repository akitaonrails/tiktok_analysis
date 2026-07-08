package com.ss.android.ugc.aweme.share.business.config;

import X.AbstractC1372680lpC;
import X.C1372030lo9;
import X.C1372040loA;
import X.C13LE;
import X.C19719912Dl;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;

/* JADX INFO: loaded from: classes22.dex */
public final class CoinAwemeIncentiveShareConfiguration extends AwemeShareConfiguration<AwemeSharePackage> {
    public static final C1372030lo9 LLILLL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0lo9] */
    static {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(AwemeSharePackage.class);
        LLILLL = new C1372040loA(c19719912DlLIZ) { // from class: X.0lo9
            public final String LIZJ;
            public final C13IQ<? extends BaseSharePackage> LIZLLL;

            @Override // X.C1372040loA, X.AbstractC1372680lpC
            public final C13IQ<? extends BaseSharePackage> LIZ() {
                return this.LIZLLL;
            }

            @Override // X.C1372040loA, X.AbstractC1372680lpC
            public final String LIZIZ() {
                return this.LIZJ;
            }

            {
                super("coin_aweme_incentive_share", c19719912DlLIZ);
                this.LIZJ = "coin_aweme_incentive_share";
                this.LIZLLL = c19719912DlLIZ;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.business.config.AwemeShareConfiguration, com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final AbstractC1372680lpC LIZLLL() {
        return LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.share.business.config.AwemeShareConfiguration, com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final CustomSharePanelBarProtocol LIZ(BaseSharePackage baseSharePackage) {
        return new CoinAwemeImShareBarProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.business.config.AwemeShareConfiguration, com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SharePanelLogicProtocol LJ(BaseSharePackage baseSharePackage) {
        return new CoinAwemeSharePanelLogicProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.business.config.AwemeShareConfiguration, com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SheetActionProtocol LJI(BaseSharePackage baseSharePackage) {
        return new CoinAwemeSheetActionProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.business.config.AwemeShareConfiguration, com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareChannelProtocol LIZJ(Context context, BaseSharePackage baseSharePackage) {
        return new CoinAwemeChannelShareProtocol(context, baseSharePackage);
    }
}
