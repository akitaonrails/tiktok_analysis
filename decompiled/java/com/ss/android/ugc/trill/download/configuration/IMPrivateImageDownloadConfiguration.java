package com.ss.android.ugc.trill.download.configuration;

import X.AbstractC21169117sn;
import X.C1379850m0l;
import X.C13LE;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadUIProtocol;
import com.ss.android.ugc.trill.download.protocol.download.IMPrivateImageDownloadAbilityProtocol;
import com.ss.android.ugc.trill.download.ui.AwemeUIProtocol;

/* JADX INFO: loaded from: classes22.dex */
public final class IMPrivateImageDownloadConfiguration extends DownloadConfiguration<C1379850m0l> {
    public final C19719912Dl LL = C13LE.LIZ(C1379850m0l.class);

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration
    public final DownloadUIProtocol LIZJ() {
        return new AwemeUIProtocol();
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration
    public final C19719912Dl LIZLLL() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration
    public final DownloadAbilityProtocol LIZ(AbstractC21169117sn abstractC21169117sn) {
        return new IMPrivateImageDownloadAbilityProtocol((C1379850m0l) abstractC21169117sn);
    }
}
