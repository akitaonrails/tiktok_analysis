package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEMediaReverse {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEMediaReverse(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEError cancelReverse() {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEMediaReverse_cancelReverse(this.swigCPtr, this));
    }

    public void releaseReverse() {
        NLEMediaPublicJniJNI.NLEMediaReverse_releaseReverse(this.swigCPtr, this);
    }

    public NLEMediaReverse() {
        this(NLEMediaPublicJniJNI.new_NLEMediaReverse(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEMediaReverse nLEMediaReverse) {
        if (nLEMediaReverse == null) {
            return 0L;
        }
        return nLEMediaReverse.swigCPtr;
    }

    public NLEMediaReverse(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public NLEError startReverse(NLEModel nLEModel, String str, INLEMediaOnProgressChanged iNLEMediaOnProgressChanged, INLEMediaOnDone iNLEMediaOnDone, String str2) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEMediaReverse_startReverse__SWIG_3(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, str, INLEMediaOnProgressChanged.getCPtr(iNLEMediaOnProgressChanged), iNLEMediaOnProgressChanged, INLEMediaOnDone.getCPtr(iNLEMediaOnDone), iNLEMediaOnDone, str2));
    }

    public NLEError startReverse(NLEModel nLEModel, String str, INLEMediaOnProgressChanged iNLEMediaOnProgressChanged, INLEMediaOnDone iNLEMediaOnDone, String str2, int i) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEMediaReverse_startReverse__SWIG_2(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, str, INLEMediaOnProgressChanged.getCPtr(iNLEMediaOnProgressChanged), iNLEMediaOnProgressChanged, INLEMediaOnDone.getCPtr(iNLEMediaOnDone), iNLEMediaOnDone, str2, i));
    }

    public NLEError startReverse(NLEModel nLEModel, String str, INLEMediaOnProgressChanged iNLEMediaOnProgressChanged, INLEMediaOnDone iNLEMediaOnDone, String str2, int i, int i2) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEMediaReverse_startReverse__SWIG_1(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, str, INLEMediaOnProgressChanged.getCPtr(iNLEMediaOnProgressChanged), iNLEMediaOnProgressChanged, INLEMediaOnDone.getCPtr(iNLEMediaOnDone), iNLEMediaOnDone, str2, i, i2));
    }

    public NLEError startReverse(NLEModel nLEModel, String str, INLEMediaOnProgressChanged iNLEMediaOnProgressChanged, INLEMediaOnDone iNLEMediaOnDone, String str2, int i, int i2, boolean z) {
        return NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEMediaReverse_startReverse__SWIG_0(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, str, INLEMediaOnProgressChanged.getCPtr(iNLEMediaOnProgressChanged), iNLEMediaOnProgressChanged, INLEMediaOnDone.getCPtr(iNLEMediaOnDone), iNLEMediaOnDone, str2, i, i2, z));
    }
}
