package com.ss.android.storage;

import X.C13VI;
import X.C2454209jY;
import X.EnumC1335420kr6;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class AVCreativeCacheCleanTask extends C13VI {
    public final IAVPublishService LIZIZ = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        List<File> cacheFileListWithOutPublishing = this.LIZIZ.getCacheFileListWithOutPublishing();
        if (!cacheFileListWithOutPublishing.isEmpty()) {
            return ((File) ListProtector.get(cacheFileListWithOutPublishing, 0)).getParentFile();
        }
        return null;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        long jLJIILL = LJIILL(z, true);
        this.LIZIZ.removedUnusedLocalVideoCache();
        return jLJIILL;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        return LJIILL(z, false);
    }

    @Override // X.C13VI
    public final long LJIIJJI(boolean z) {
        return LJIILL(z, false);
    }

    public final long LJIILL(boolean z, boolean z2) {
        List<File> cacheFileListWithOutPublishing = this.LIZIZ.getCacheFileListWithOutPublishing();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LIZIZ.getNotCleanableFileList());
        if (z2) {
            arrayList.addAll(this.LIZIZ.getLocalVideoCacheWhitelist());
        }
        Iterator<File> it2 = cacheFileListWithOutPublishing.iterator();
        long jLIZIZ = 0;
        while (it2.hasNext()) {
            jLIZIZ += C2454209jY.LIZIZ(it2.next(), arrayList, z);
        }
        return jLIZIZ;
    }
}
