package com.ss.android.ugc.gamora.editor.music.stream;

import X.C01GW;
import X.C11NZ;
import X.C1458370o3P;
import X.C1458410o3T;
import X.C452501pT;
import X.InterfaceC1662290tMJ;
import com.ss.android.ugc.aweme.music.model.SimpleMusicRequestParam;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class MusicStreamServiceImpl implements IMusicExternalService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(222));

    @Override // com.ss.android.ugc.aweme.music.service.IMusicExternalService
    public final InterfaceC1662290tMJ LIZJ() {
        return (InterfaceC1662290tMJ) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicExternalService
    public final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel instanceof VideoPublishEditModel) {
            C1458370o3P.LIZ.getClass();
            return C1458370o3P.LJIL(videoPublishEditModel);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicExternalService
    public final C11NZ LIZIZ(int i, int i2, long j, SimpleMusicRequestParam simpleMusicRequestParam) {
        return C1458410o3T.LJ(C1458410o3T.LIZ, i, i2, j, simpleMusicRequestParam);
    }
}
