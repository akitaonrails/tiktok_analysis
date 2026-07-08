package com.ss.android.ugc.aweme.ecommerce.publish.aidubbing;

import X.C1420670n4b;
import X.C2188811AlT;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: loaded from: classes23.dex */
public final class AIDubbingServiceImpl implements IAIDubbingService {
    @Override // com.ss.android.ugc.aweme.ecommerce.publish.aidubbing.IAIDubbingService
    public final void LIZIZ() {
        String strLJFF = C1420670n4b.LJFF();
        Keva kevaLJIIIIZZ = C1420670n4b.LJIIIIZZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ai_dubbing_more_options_subtitle_shown_");
        sbLIZ.append(strLJFF);
        kevaLJIIIIZZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.publish.aidubbing.IAIDubbingService
    public final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (C1420670n4b.LJIILIIL() && C1420670n4b.LJIIJJI(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.publish.aidubbing.IAIDubbingService
    public final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (!C1420670n4b.LJIILIIL() || !C1420670n4b.LJIIJJI(videoPublishEditModel)) {
            return false;
        }
        String strLJFF = C1420670n4b.LJFF();
        Keva kevaLJIIIIZZ = C1420670n4b.LJIIIIZZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ai_dubbing_more_options_subtitle_shown_");
        sbLIZ.append(strLJFF);
        if (kevaLJIIIIZZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
            return false;
        }
        return true;
    }
}
