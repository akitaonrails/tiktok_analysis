package com.bytedance.ies.smartmovie.jni;

/* JADX INFO: loaded from: classes23.dex */
public final class Runnable {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    SmartMovieJniJNI.delete_Runnable(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public Runnable() {
        this(SmartMovieJniJNI.new_Runnable());
        SmartMovieJniJNI.Runnable_director_connect(this, this.LIZ, true, true);
    }

    public Runnable(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
