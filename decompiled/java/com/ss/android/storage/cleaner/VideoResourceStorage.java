package com.ss.android.storage.cleaner;

import X.C13VI;
import X.C1478160oZK;
import X.C1483340ohg;
import X.C538540LAe;
import X.EnumC1335420kr6;
import android.util.LruCache;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;

/* JADX INFO: loaded from: classes31.dex */
public final class VideoResourceStorage extends C13VI {
    public final int LIZIZ = 1;
    public final int LIZJ = LSPassThroughRecordSizeConfig.DEFAULT;
    public final int LIZLLL = C538540LAe.LLJJJIL;
    public final int LJ = 3600000;
    public final int LJFF = 86400000;

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return null;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return 0L;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.RESOURCE;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis() - ((long) (((((3 * this.LJFF) * this.LJ) * this.LIZLLL) * this.LIZJ) * this.LIZIZ));
        LruCache<String, SimVideoUrlModel> lruCache = C1483340ohg.LIZ;
        return C1478160oZK.LIZ().LJIILJJIL(jCurrentTimeMillis, z);
    }
}
