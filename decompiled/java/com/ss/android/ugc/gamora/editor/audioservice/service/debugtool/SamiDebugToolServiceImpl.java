package com.ss.android.ugc.gamora.editor.audioservice.service.debugtool;

import X.C04TD;
import X.C0CHQ;
import X.C19221910Hx;
import com.ss.android.ugc.aweme.services.audio.ISamiDebugToolService;

/* JADX INFO: loaded from: classes30.dex */
public final class SamiDebugToolServiceImpl implements ISamiDebugToolService {
    public static ISamiDebugToolService LIZ() {
        Object objLIZ = C04TD.LIZ(ISamiDebugToolService.class, false);
        if (objLIZ != null) {
            return (ISamiDebugToolService) objLIZ;
        }
        if (C04TD.n6 == null) {
            synchronized (ISamiDebugToolService.class) {
                if (C04TD.n6 == null) {
                    C04TD.n6 = new SamiDebugToolServiceImpl();
                }
            }
        }
        return C04TD.n6;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ISamiDebugToolService
    public final String getAppId() {
        C0CHQ.LIZ().getApplicationService();
        return String.valueOf(C19221910Hx.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.services.audio.ISamiDebugToolService
    public final String getCreativeToolRoot() {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService().getRoot();
    }
}
