package com.bytedance.ies.smartmovie.jni;

/* JADX INFO: loaded from: classes23.dex */
public class INLEModelNetworkDelegate {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                SmartMovieJniJNI.delete_INLEModelNetworkDelegate(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        SmartMovieJniJNI.INLEModelNetworkDelegate_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        SmartMovieJniJNI.INLEModelNetworkDelegate_change_ownership(this, this.swigCPtr, true);
    }

    public INLEModelNetworkDelegate() {
        this(SmartMovieJniJNI.new_INLEModelNetworkDelegate(), true);
        SmartMovieJniJNI.INLEModelNetworkDelegate_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(INLEModelNetworkDelegate iNLEModelNetworkDelegate) {
        if (iNLEModelNetworkDelegate == null) {
            return 0L;
        }
        return iNLEModelNetworkDelegate.swigCPtr;
    }

    public void cancel(String str) {
        if (getClass() == INLEModelNetworkDelegate.class) {
            SmartMovieJniJNI.INLEModelNetworkDelegate_cancel(this.swigCPtr, this, str);
        } else {
            SmartMovieJniJNI.INLEModelNetworkDelegate_cancelSwigExplicitINLEModelNetworkDelegate(this.swigCPtr, this, str);
        }
    }

    public void request(NLEModelRequestParams nLEModelRequestParams) {
        long j;
        long j2 = this.swigCPtr;
        if (nLEModelRequestParams == null) {
            j = 0;
        } else {
            j = nLEModelRequestParams.LIZ;
        }
        SmartMovieJniJNI.INLEModelNetworkDelegate_request__SWIG_1(j2, this, j, nLEModelRequestParams);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public INLEModelNetworkDelegate(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void request(NLEModelRequestParams nLEModelRequestParams, NLEModelRequestCallback nLEModelRequestCallback) {
        long j;
        long j2 = this.swigCPtr;
        if (nLEModelRequestParams == null) {
            j = 0;
        } else {
            j = nLEModelRequestParams.LIZ;
        }
        SmartMovieJniJNI.INLEModelNetworkDelegate_request__SWIG_0(j2, this, j, nLEModelRequestParams, NLEModelRequestCallback.getCPtr(nLEModelRequestCallback), nLEModelRequestCallback);
    }
}
