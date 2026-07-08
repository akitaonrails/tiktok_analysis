package com.ss.android.ugc.aweme.uploader.factory;

import X.InterfaceC2208111BbV;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractVideoUploader {
    public abstract void LIZ();

    public abstract void LIZIZ();

    public abstract void LIZJ();

    public void LIZLLL(String str) {
    }

    public abstract void LJ(InterfaceC2208111BbV interfaceC2208111BbV);

    public abstract void LJFF(String str);

    public abstract void LJI(String str);

    public abstract void LJII();

    public static final class VideoUploadInfo {
        public long mErrorCode;
        public String mExtra;
        public String mTosKey;
        public String mVideoId;

        public VideoUploadInfo() {
            this(null, null, 0L, null);
        }

        public final void setMErrorCode(long j) {
            this.mErrorCode = j;
        }

        public final void setMExtra(String str) {
            this.mExtra = str;
        }

        public final void setMTosKey(String str) {
            this.mTosKey = str;
        }

        public final void setMVideoId(String str) {
            this.mVideoId = str;
        }

        public VideoUploadInfo(String str, String str2, long j, String str3) {
            this.mTosKey = str;
            this.mVideoId = str2;
            this.mErrorCode = j;
            this.mExtra = str3;
        }
    }
}
