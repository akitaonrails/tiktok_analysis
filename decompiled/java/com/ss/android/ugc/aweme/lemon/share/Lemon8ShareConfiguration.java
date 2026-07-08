package com.ss.android.ugc.aweme.lemon.share;

import X.AbstractC1372680lpC;
import X.AbstractC1372690lpD;
import X.C1371890lnv;
import X.C13LE;
import X.C19719912Dl;
import android.content.Context;
import com.ss.android.ugc.aweme.lemon.share.protocol.Lemon8ShareChannelProtocol;
import com.ss.android.ugc.aweme.lemon.share.protocol.Lemon8SheetActionProtocol;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol;
import com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;

/* JADX INFO: loaded from: classes22.dex */
public final class Lemon8ShareConfiguration extends TTShareDefaultConfig<Lemon8SharePackage> {
    public static final C1371890lnv LLILLJJLI;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0lnv] */
    static {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(Lemon8SharePackage.class);
        LLILLJJLI = new AbstractC1372690lpD(c19719912DlLIZ) { // from class: X.0lnv
            public final String LIZ = "lemon8_share";
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
        return new TTCustomSharePanelBarProtocol() { // from class: com.ss.android.ugc.aweme.lemon.share.Lemon8ShareConfiguration$getCustomSharePanelBar$1
            @Override // com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol, com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
            public final boolean PK1() {
                return true;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SheetActionProtocol LJI(BaseSharePackage baseSharePackage) {
        return new Lemon8SheetActionProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareChannelProtocol LIZJ(Context context, BaseSharePackage baseSharePackage) {
        return new Lemon8ShareChannelProtocol(baseSharePackage);
    }
}
