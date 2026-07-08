package com.bytedance.ies.smartmovie.jni;

/* JADX INFO: loaded from: classes23.dex */
public final class DavinciResourceConfig {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    SmartMovieJniJNI.delete_DavinciResourceConfig(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public DavinciResourceConfig() {
        long jNew_DavinciResourceConfig = SmartMovieJniJNI.new_DavinciResourceConfig();
        this.LIZIZ = true;
        this.LIZ = jNew_DavinciResourceConfig;
    }
}
