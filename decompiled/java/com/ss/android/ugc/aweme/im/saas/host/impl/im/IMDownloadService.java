package com.ss.android.ugc.aweme.im.saas.host.impl.im;

import X.AbstractC2199801B7q;
import X.C0I0B;
import X.C894660Z7w;
import com.ss.android.ugc.aweme.IDownloaderInitService;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMDownloadAPI;

/* JADX INFO: loaded from: classes4.dex */
public final class IMDownloadService implements IMDownloadAPI {
    public final boolean LIZIZ = DownloadServiceManager.INSTANCE.isAutoRemoveListener();

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMDownloadAPI
    public final boolean LIZIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMDownloadAPI
    public final AbstractC2199801B7q LIZ(String str) {
        AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        IDownloaderInitService iDownloaderInitService = (IDownloaderInitService) PluggableExtentionKt.pluggableSpi$default(IDownloaderInitService.class, false, false, false, 14, null);
        if (iDownloaderInitService != null) {
            C0I0B.LJFF.LIZJ();
            iDownloaderInitService.LIZ(C894660Z7w.LIZ());
        }
        return abstractC2199801B7qWith;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMDownloadAPI
    public final void LIZJ(int i) {
        DownloadServiceManager.INSTANCE.getDownloadService().cancel(i);
    }
}
