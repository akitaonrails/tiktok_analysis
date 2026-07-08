package com.ss.android.ugc.aweme.music;

import X.C01GW;
import X.C1452420nto;
import X.C1452450ntr;
import X.C1458070o2v;
import X.C2275008vk;
import X.C2292008yU;
import X.C273320AnS;
import com.ss.android.ugc.aweme.services.music.IMusicBridgeService;
import com.ss.android.ugc.aweme.tools.music.ab.AIMusicFrameCountConfig;

/* JADX INFO: loaded from: classes23.dex */
public final class MusicBridgeServiceImpl implements IMusicBridgeService {
    @Override // com.ss.android.ugc.aweme.services.music.IMusicBridgeService
    public final boolean enableBAAccountRequestRecommendMusic() {
        return ((Boolean) C273320AnS.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.music.IMusicBridgeService
    public final int imgAiMusicExtractCount() {
        C01GW c01gw = C2275008vk.LIZIZ;
        if (((AIMusicFrameCountConfig) c01gw.getValue()).enable) {
            return ((AIMusicFrameCountConfig) c01gw.getValue()).imageExtractCount;
        }
        return 5;
    }

    @Override // com.ss.android.ugc.aweme.services.music.IMusicBridgeService
    public final int defaultMusicMaxLoopDuration() {
        return C1458070o2v.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.services.music.IMusicBridgeService
    public final boolean enableMusicEndTimeOnShoot() {
        return C1452420nto.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.music.IMusicBridgeService
    public final boolean enableMusicLoopExperiment() {
        return C1458070o2v.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.services.music.IMusicBridgeService
    public final void setEnableCloudContentUnderstandingABSwitch(boolean z) {
        if (!C2292008yU.LIZ()) {
            C1452450ntr.LIZ = z;
        }
    }
}
