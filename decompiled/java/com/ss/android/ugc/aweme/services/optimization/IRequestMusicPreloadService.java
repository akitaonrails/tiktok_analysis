package com.ss.android.ugc.aweme.services.optimization;

import X.C19EG;
import com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: loaded from: classes9.dex */
public interface IRequestMusicPreloadService {
    void preDownloadMusic(C19EG c19eg, MusicModel musicModel, IServiceMusicResDownListener iServiceMusicResDownListener, String str);
}
