package com.ss.android.ugc.aweme.services;

import X.C1403010mc7;
import X.C19EG;
import com.ss.android.ugc.aweme.services.optimization.IRequestMusicPreloadService;
import com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: loaded from: classes9.dex */
public final class RequestMusicPreloadServiceImp implements IRequestMusicPreloadService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.services.optimization.IRequestMusicPreloadService
    public void preDownloadMusic(C19EG c19eg, MusicModel musicModel, IServiceMusicResDownListener iServiceMusicResDownListener, String str) {
        C1403010mc7.LIZ.LJIIIIZZ().LIZ().LIZIZ(c19eg, null, iServiceMusicResDownListener, "");
    }
}
