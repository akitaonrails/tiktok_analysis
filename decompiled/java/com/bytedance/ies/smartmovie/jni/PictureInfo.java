package com.bytedance.ies.smartmovie.jni;

/* JADX INFO: loaded from: classes23.dex */
public final class PictureInfo extends UploadInfo {
    public transient long LIZJ;
    public transient boolean LIZLLL;

    @Override // com.bytedance.ies.smartmovie.jni.UploadInfo
    public final synchronized void LIZ() {
        long j = this.LIZJ;
        if (j != 0) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                SmartMovieJniJNI.delete_PictureInfo(j);
            }
            this.LIZJ = 0L;
        }
        super.LIZ();
    }

    public PictureInfo() {
        this(SmartMovieJniJNI.new_PictureInfo());
    }

    @Override // com.bytedance.ies.smartmovie.jni.UploadInfo
    public final void finalize() {
        LIZ();
    }

    public PictureInfo(long j) {
        super(SmartMovieJniJNI.PictureInfo_SWIGSmartPtrUpcast(j));
        this.LIZLLL = true;
        this.LIZJ = j;
    }
}
