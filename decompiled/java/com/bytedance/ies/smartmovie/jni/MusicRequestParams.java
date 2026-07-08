package com.bytedance.ies.smartmovie.jni;

/* JADX INFO: loaded from: classes23.dex */
public final class MusicRequestParams {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    SmartMovieJniJNI.delete_MusicRequestParams(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public final UnorderedMapStrStr LIZ() {
        return new UnorderedMapStrStr(SmartMovieJniJNI.MusicRequestParams_getExtraParams(this.LIZ, this));
    }

    public final VecMeta LIZIZ() {
        long jMusicRequestParams_getMediaList = SmartMovieJniJNI.MusicRequestParams_getMediaList(this.LIZ, this);
        if (jMusicRequestParams_getMediaList == 0) {
            return null;
        }
        return new VecMeta(jMusicRequestParams_getMediaList);
    }

    public MusicRequestParams() {
        this(SmartMovieJniJNI.new_MusicRequestParams__SWIG_0());
    }

    public MusicRequestParams(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
