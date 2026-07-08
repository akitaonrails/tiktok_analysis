package com.ss.android.storage;

import X.AbstractC2454309jZ;
import X.EnumC1335420kr6;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class PublishedCacheCleanTask extends AbstractC2454309jZ {
    public final IAVPublishService LIZIZ = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIL() {
        return this.LIZIZ.getCacheFileListWithOutPublishing();
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIILJJIL() {
        return this.LIZIZ.getNotCleanableFileList();
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }
}
