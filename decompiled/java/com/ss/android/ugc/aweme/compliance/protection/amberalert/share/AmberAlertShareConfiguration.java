package com.ss.android.ugc.aweme.compliance.protection.amberalert.share;

import X.AbstractC1372680lpC;
import X.AbstractC1372690lpD;
import X.C1380930m2V;
import X.C13LE;
import X.C19719912Dl;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;

/* JADX INFO: loaded from: classes22.dex */
public final class AmberAlertShareConfiguration extends TTShareDefaultConfig<AmberAlertSharePackage> {
    public static final C1380930m2V LLILLJJLI;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0m2V] */
    static {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(AmberAlertSharePackage.class);
        LLILLJJLI = new AbstractC1372690lpD(c19719912DlLIZ) { // from class: X.0m2V
            public final String LIZ = "pns_amber_alert";
            public final C13IQ<? extends BaseSharePackage> LIZIZ;

            @Override // X.AbstractC1372680lpC
            public final C13IQ<? extends BaseSharePackage> LIZ() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC1372680lpC
            public final String LIZIZ() {
                return this.LIZ;
            }

            {
                this.LIZIZ = c19719912DlLIZ;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final AbstractC1372680lpC LIZLLL() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final CustomSharePanelBarProtocol LIZ(BaseSharePackage baseSharePackage) {
        return new AmberAlertShareImProtocol();
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareChannelProtocol LIZJ(Context context, BaseSharePackage baseSharePackage) {
        return new AmberAlertShareChannelProtocol(baseSharePackage);
    }
}
