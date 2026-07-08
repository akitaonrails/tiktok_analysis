package com.ss.android.ugc.aweme.music.ui.helper;

import X.AbstractC1661230tKb;
import X.C1661360tKo;
import X.C202045143v;
import X.C571360Mb0;
import X.InterfaceC202048143y;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.service.IMusicStreamDownloadService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: loaded from: classes26.dex */
public final class MusicStreamDownloadServiceImpl implements IMusicStreamDownloadService {
    @Override // com.ss.android.ugc.aweme.music.service.IMusicStreamDownloadService
    public final void LIZIZ(MusicModel musicModel, C571360Mb0 c571360Mb0, float f, int i) {
        C202045143v.LJ(musicModel, false, false, new AbstractC1661230tKb() { // from class: X.0tKc
        }, c571360Mb0, f, i);
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicStreamDownloadService
    public final void LIZ(AVMusic aVMusic, boolean z, boolean z2, AbstractC1661230tKb abstractC1661230tKb, InterfaceC202048143y interfaceC202048143y, float f, int i) {
        MusicModel musicModelLIZ = C1661360tKo.LIZ(aVMusic);
        if (musicModelLIZ == null) {
            interfaceC202048143y.LIZIZ();
        } else {
            C202045143v.LJ(musicModelLIZ, z, z2, abstractC1661230tKb, interfaceC202048143y, f, i);
        }
    }
}
