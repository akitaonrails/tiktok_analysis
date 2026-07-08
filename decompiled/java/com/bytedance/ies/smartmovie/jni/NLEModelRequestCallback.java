package com.bytedance.ies.smartmovie.jni;

import X.C1967607nG;
import com.bytedance.ies.nle.editor_jni.NLEModel;

/* JADX INFO: loaded from: classes23.dex */
public class NLEModelRequestCallback {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                SmartMovieJniJNI.delete_NLEModelRequestCallback(j);
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
        SmartMovieJniJNI.NLEModelRequestCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        SmartMovieJniJNI.NLEModelRequestCallback_change_ownership(this, this.swigCPtr, true);
    }

    public NLEModelRequestCallback() {
        this(SmartMovieJniJNI.new_NLEModelRequestCallback(), true);
        SmartMovieJniJNI.NLEModelRequestCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEModelRequestCallback nLEModelRequestCallback) {
        if (nLEModelRequestCallback == null) {
            return 0L;
        }
        return nLEModelRequestCallback.swigCPtr;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEModelRequestCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onSuccess(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
        SmartMovieJniJNI.NLEModelRequestCallback_onSuccess(this.swigCPtr, this, C1967607nG.LIZ(nLEModel), UnorderedMapStrStr.LIZIZ(unorderedMapStrStr), unorderedMapStrStr);
    }

    public void onFailure(int i, String str, UnorderedMapStrStr unorderedMapStrStr) {
        SmartMovieJniJNI.NLEModelRequestCallback_onFailure(this.swigCPtr, this, i, str, UnorderedMapStrStr.LIZIZ(unorderedMapStrStr), unorderedMapStrStr);
    }
}
