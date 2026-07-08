package com.bytedance.ies.smartmovie.jni;

import X.C1967607nG;
import com.bytedance.ies.nle.editor_jni.NLEModel;

/* JADX INFO: loaded from: classes23.dex */
public class ISmartMovieDownloaderListener {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                SmartMovieJniJNI.delete_ISmartMovieDownloaderListener(j);
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
        SmartMovieJniJNI.ISmartMovieDownloaderListener_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        SmartMovieJniJNI.ISmartMovieDownloaderListener_change_ownership(this, this.swigCPtr, true);
    }

    public ISmartMovieDownloaderListener() {
        this(SmartMovieJniJNI.new_ISmartMovieDownloaderListener(), true);
        SmartMovieJniJNI.ISmartMovieDownloaderListener_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ISmartMovieDownloaderListener iSmartMovieDownloaderListener) {
        if (iSmartMovieDownloaderListener == null) {
            return 0L;
        }
        return iSmartMovieDownloaderListener.swigCPtr;
    }

    public void onProgress(float f) {
        SmartMovieJniJNI.ISmartMovieDownloaderListener_onProgress(this.swigCPtr, this, f);
    }

    public void onSuccess(NLEModel nLEModel) {
        SmartMovieJniJNI.ISmartMovieDownloaderListener_onSuccess(this.swigCPtr, this, C1967607nG.LIZ(nLEModel));
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ISmartMovieDownloaderListener(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void onFailure(String str, int i, String str2) {
        SmartMovieJniJNI.ISmartMovieDownloaderListener_onFailure(this.swigCPtr, this, str, i, str2);
    }
}
