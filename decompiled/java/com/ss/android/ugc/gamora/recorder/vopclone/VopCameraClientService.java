package com.ss.android.ugc.gamora.recorder.vopclone;

import X.C04TD;
import X.C0CHQ;
import X.EnumC20227914Cv;
import com.ss.android.ugc.aweme.services.audio.IVopCameraClientService;

/* JADX INFO: loaded from: classes30.dex */
public final class VopCameraClientService implements IVopCameraClientService {
    public static IVopCameraClientService LIZ() {
        Object objLIZ = C04TD.LIZ(IVopCameraClientService.class, false);
        if (objLIZ != null) {
            return (IVopCameraClientService) objLIZ;
        }
        if (C04TD.x6 == null) {
            synchronized (IVopCameraClientService.class) {
                if (C04TD.x6 == null) {
                    C04TD.x6 = new VopCameraClientService();
                }
            }
        }
        return C04TD.x6;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopCameraClientService
    public final String genVopSdkSavePath() {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILIIL(EnumC20227914Cv.VOP_CLONE, "");
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopCameraClientService
    public final String getCurrentUserId() {
        return C0CHQ.LIZ().getAccountService().getCurrentUserID();
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopCameraClientService
    public final String getSDKVersion() {
        C0CHQ.LIZ().getAccountService().getSDKVersion();
        return "2";
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopCameraClientService
    public final String getUserTTToken() {
        String userTTToken = C0CHQ.LIZ().getAccountService().getUserTTToken();
        return userTTToken == null ? "" : userTTToken;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopCameraClientService
    public final void initDownloadableModel() {
        C0CHQ.LIZ().initDownloadableModel();
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IVopCameraClientService
    public final void initVESdk() {
        C0CHQ.LIZ().LJJ();
    }
}
