package com.ss.android.ugc.aweme.servicimpl;

import X.C04TD;
import X.C0C64;
import com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService;

/* JADX INFO: loaded from: classes3.dex */
public final class SplitVideoServiceImpl implements ISplitVideoService {
    public static ISplitVideoService LIZ() {
        Object objLIZ = C04TD.LIZ(ISplitVideoService.class, false);
        if (objLIZ != null) {
            return (ISplitVideoService) objLIZ;
        }
        if (C04TD.R4 == null) {
            synchronized (ISplitVideoService.class) {
                if (C04TD.R4 == null) {
                    C04TD.R4 = new SplitVideoServiceImpl();
                }
            }
        }
        return C04TD.R4;
    }

    @Override // com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService
    public final boolean playListAutoTake() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "tiktok_playlist_status", true) == 2;
    }

    @Override // com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService
    public final boolean showPlayList() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "tiktok_playlist_status", true) > 0;
    }
}
