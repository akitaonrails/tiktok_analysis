package com.ss.android.ugc.aweme.mediaselector;

import X.C2286708xd;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: loaded from: classes9.dex */
public interface IPreDownloadMusic {

    public static final class PreDownloadMusicData {
        public static final int $stable = 8;
        public String musicFile;
        public MusicModel musicModel;

        public PreDownloadMusicData() {
            this(null, null);
        }

        public final boolean isDataValid() {
            String str;
            return (this.musicModel == null || (str = this.musicFile) == null || !C2286708xd.LIZJ(str)) ? false : true;
        }

        public final String getMusicFile() {
            return this.musicFile;
        }

        public final MusicModel getMusicModel() {
            return this.musicModel;
        }

        public final void setMusicFile(String str) {
            this.musicFile = str;
        }

        public final void setMusicModel(MusicModel musicModel) {
            this.musicModel = musicModel;
        }

        public PreDownloadMusicData(MusicModel musicModel, String str) {
            this.musicModel = musicModel;
            this.musicFile = str;
        }
    }

    PreDownloadMusicData getPreDownloadMusicData();

    boolean isReEnterChoosePhoto();

    void setIsChangeMusicDownloadSuccess(boolean z, MusicModel musicModel, String str);

    void setIsReEnterChoosePhoto(boolean z);
}
