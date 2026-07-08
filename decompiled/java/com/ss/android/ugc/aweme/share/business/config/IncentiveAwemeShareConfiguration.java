package com.ss.android.ugc.aweme.share.business.config;

import X.AbstractC1372680lpC;
import X.C1372040loA;
import X.C1372230loT;
import X.C13LE;
import X.C19719912Dl;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;

/* JADX INFO: loaded from: classes22.dex */
public final class IncentiveAwemeShareConfiguration extends AwemeShareConfiguration<AwemeSharePackage> {
    public static final C1372230loT LLILLL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0loT] */
    static {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(AwemeSharePackage.class);
        LLILLL = new C1372040loA(c19719912DlLIZ) { // from class: X.0loT
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
                super("incentive_aweme_share", c19719912DlLIZ);
                this.LIZJ = "incentive_aweme_share";
                this.LIZLLL = c19719912DlLIZ;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.business.config.AwemeShareConfiguration, com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final AbstractC1372680lpC LIZLLL() {
        return LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.share.business.config.AwemeShareConfiguration, com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SharePanelLogicProtocol LJ(BaseSharePackage baseSharePackage) {
        return new IncentiveAwemeSharePanelLogicProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.business.config.AwemeShareConfiguration, com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareChannelProtocol LIZJ(Context context, BaseSharePackage baseSharePackage) {
        return new IncentiveAwemeChannelShareProtocol(context, baseSharePackage);
    }
}
