package com.ss.android.ugc.aweme.services.external;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: loaded from: classes26.dex */
public interface IAVTransformModelService {
    MusicModel transformAVMusic(AVMusic aVMusic);

    AVMusic transformMusicModel(MusicModel musicModel);
}
