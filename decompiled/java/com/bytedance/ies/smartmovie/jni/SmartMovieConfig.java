package com.bytedance.ies.smartmovie.jni;

/* JADX INFO: loaded from: classes23.dex */
public final class SmartMovieConfig {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    SmartMovieJniJNI.delete_SmartMovieConfig(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public SmartMovieConfig() {
        long jNew_SmartMovieConfig = SmartMovieJniJNI.new_SmartMovieConfig();
        this.LIZIZ = true;
        this.LIZ = jNew_SmartMovieConfig;
    }
}
