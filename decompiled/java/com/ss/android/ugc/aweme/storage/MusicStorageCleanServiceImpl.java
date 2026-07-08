package com.ss.android.ugc.aweme.storage;

import X.C01GW;
import X.C0AR3;
import X.C0C0Y;
import X.C0WKX;
import X.C13BV;
import X.C13TC;
import X.C13TD;
import X.C201955140j;
import X.C823050WQl;
import X.RunnableC514601zU;
import bsj.x0;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.service.IMusicStorageCleanService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.setting.EnableMusicStorageTrimSize;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class MusicStorageCleanServiceImpl implements IMusicStorageCleanService {
    @Override // com.ss.android.ugc.aweme.music.service.IMusicStorageCleanService
    public final List<String> LIZ() {
        IConfigService iConfigServiceConfigService;
        ICacheService iCacheServiceCacheConfig;
        ArrayList<String> arrayListDraftMusicList;
        boolean z = C13TD.LIZIZ;
        C13TC.LIZIZ();
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService == null || (iConfigServiceConfigService = iExternalService.configService()) == null || (iCacheServiceCacheConfig = iConfigServiceConfigService.cacheConfig()) == null || (arrayListDraftMusicList = iCacheServiceCacheConfig.draftMusicList()) == null) {
            return C13BV.INSTANCE;
        }
        C0WKX c0wkx = C13TD.LIZJ;
        if (c0wkx != null) {
            c0wkx.LIZJ.addAll(arrayListDraftMusicList);
        }
        arrayListDraftMusicList.addAll(C13TD.LJ);
        return arrayListDraftMusicList;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicStorageCleanService
    public final void LIZJ(AFwS274S0000000_30 aFwS274S0000000_30) {
        x0.LIZ.getClass();
        if (((Number) x0.LIZIZ.getValue()).intValue() <= 0 || !C0C0Y.LIZ()) {
            aFwS274S0000000_30.invoke(0L);
        }
        C01GW c01gw = EnableMusicStorageTrimSize.LIZIZ;
        if (((EnableMusicStorageTrimSize.MusicStorageTrimSizeConfig) c01gw.getValue()).isOpen) {
            boolean z = C13TD.LIZIZ;
            C13TC.LIZIZ();
            long j = ((EnableMusicStorageTrimSize.MusicStorageTrimSizeConfig) c01gw.getValue()).cacheThresholdMb * 1048576;
            float f = ((EnableMusicStorageTrimSize.MusicStorageTrimSizeConfig) c01gw.getValue()).cleanFactor;
            C0WKX c0wkx = C13TD.LIZJ;
            if (c0wkx != null) {
                c0wkx.LJIIIIZZ = f;
                c0wkx.LJ(j);
            }
        }
        long jLongValue = ((Number) C0AR3.LIZ.getValue()).longValue();
        boolean z2 = C13TD.LIZIZ;
        C13TC.LIZIZ();
        C0WKX c0wkx2 = C13TD.LIZJ;
        if (c0wkx2 != null) {
            C201955140j.LIZ("MusicDiskLruCache try to remove unused key.");
            C823050WQl.LIZLLL().execute(new RunnableC514601zU(jLongValue, c0wkx2, aFwS274S0000000_30, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicStorageCleanService
    public final long LIZIZ(long j, boolean z) {
        if (!C0C0Y.LIZ()) {
            return 0L;
        }
        boolean z2 = C13TD.LIZIZ;
        C13TC.LIZIZ();
        C0WKX c0wkx = C13TD.LIZJ;
        if (c0wkx == null) {
            return 0L;
        }
        return c0wkx.LIZLLL(j, z);
    }
}
