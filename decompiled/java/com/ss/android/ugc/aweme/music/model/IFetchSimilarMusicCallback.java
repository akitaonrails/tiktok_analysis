package com.ss.android.ugc.aweme.music.model;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: loaded from: classes19.dex */
public interface IFetchSimilarMusicCallback {
    void onFailed(int i, String str, String str2);

    void onStart();

    void onSuccess(MusicModel musicModel);
}
