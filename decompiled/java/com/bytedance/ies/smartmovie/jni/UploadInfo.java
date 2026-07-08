package com.bytedance.ies.smartmovie.jni;

/* JADX INFO: loaded from: classes23.dex */
public class UploadInfo {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public synchronized void LIZ() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                SmartMovieJniJNI.delete_UploadInfo(j);
            }
            this.LIZ = 0L;
        }
    }

    public UploadInfo() {
        this(SmartMovieJniJNI.new_UploadInfo());
    }

    public void finalize() {
        LIZ();
    }

    public UploadInfo(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
