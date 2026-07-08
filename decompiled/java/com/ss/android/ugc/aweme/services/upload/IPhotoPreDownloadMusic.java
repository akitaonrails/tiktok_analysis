package com.ss.android.ugc.aweme.services.upload;

import X.C2286708xd;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: loaded from: classes9.dex */
public interface IPhotoPreDownloadMusic {

    public static final class PhotoPreDownloadMusicData {
        public String musicFile;
        public MusicModel musicModel;

        public PhotoPreDownloadMusicData() {
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

        public PhotoPreDownloadMusicData(MusicModel musicModel, String str) {
            this.musicModel = musicModel;
            this.musicFile = str;
        }
    }

    void firstMusicDownloadSuccess(MusicModel musicModel, String str);

    PhotoPreDownloadMusicData getPreDownloadMusicData();
}
