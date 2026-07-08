package com.ss.android.ugc.aweme.share.business.config;

import X.AbstractC1372680lpC;
import X.AbstractC1372690lpD;
import X.C1372660lpA;
import X.C13LE;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemePhotoDownloadSharePackage;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;

/* JADX INFO: loaded from: classes22.dex */
public final class AwemePhotoDownloadShareConfiguration extends TTShareDefaultConfig<AwemePhotoDownloadSharePackage> {
    public static final C1372660lpA LLILLJJLI = new AbstractC1372690lpD(C13LE.LIZ(AwemePhotoDownloadSharePackage.class)) { // from class: X.0lpA
        public final String LIZ = "aweme_photo_download_share";
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
            this.LIZIZ = c19719912Dl;
        }
    };

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final AbstractC1372680lpC LIZLLL() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final CustomSharePanelBarProtocol LIZ(BaseSharePackage baseSharePackage) {
        return new AwemePhotoDownloadShareImBarProtocol();
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SharePanelLogicProtocol LJ(BaseSharePackage baseSharePackage) {
        return new AwemePhotoDownloadSharePanelProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareChannelProtocol LIZJ(Context context, BaseSharePackage baseSharePackage) {
        return new AwemePhotoDownloadShareChannelProtocol(baseSharePackage);
    }
}
