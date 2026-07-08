package com.ss.android.ugc.aweme.services.upload;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface IServiceMusicResDownListener {

    public static final class DefaultImpls {
        public static Map<String, Object> getMusicRecommendExtra(IServiceMusicResDownListener iServiceMusicResDownListener) {
            return null;
        }
    }

    Map<String, Object> getMusicRecommendExtra();

    void onFailed();

    void onSuccess(MusicModel musicModel, String str);
}
