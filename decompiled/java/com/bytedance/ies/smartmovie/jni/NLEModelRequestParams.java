package com.bytedance.ies.smartmovie.jni;

/* JADX INFO: loaded from: classes23.dex */
public final class NLEModelRequestParams {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    SmartMovieJniJNI.delete_NLEModelRequestParams(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public final UnorderedMapStrStr LIZ() {
        return new UnorderedMapStrStr(SmartMovieJniJNI.NLEModelRequestParams_getExtraParams(this.LIZ, this));
    }

    public final VecMeta LIZIZ() {
        long jNLEModelRequestParams_getInputList = SmartMovieJniJNI.NLEModelRequestParams_getInputList(this.LIZ, this);
        if (jNLEModelRequestParams_getInputList == 0) {
            return null;
        }
        return new VecMeta(jNLEModelRequestParams_getInputList);
    }

    public final String LIZJ() {
        return SmartMovieJniJNI.NLEModelRequestParams_getRecConfig(this.LIZ, this);
    }

    public NLEModelRequestParams(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public NLEModelRequestParams(String str, VecMeta vecMeta, VecStr vecStr, String str2) {
        this(SmartMovieJniJNI.new_NLEModelRequestParams__SWIG_2(str, VecMeta.LJ(vecMeta), vecMeta, VecStr.LJ(vecStr), vecStr, str2));
    }
}
