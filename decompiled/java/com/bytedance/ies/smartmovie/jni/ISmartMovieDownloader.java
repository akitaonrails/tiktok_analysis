package com.bytedance.ies.smartmovie.jni;

import X.C1967607nG;
import com.bytedance.ies.nle.editor_jni.NLEModel;

/* JADX INFO: loaded from: classes23.dex */
public class ISmartMovieDownloader {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                SmartMovieJniJNI.delete_ISmartMovieDownloader(j);
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
        SmartMovieJniJNI.ISmartMovieDownloader_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        SmartMovieJniJNI.ISmartMovieDownloader_change_ownership(this, this.swigCPtr, true);
    }

    public void clearEpCache() {
        SmartMovieJniJNI.ISmartMovieDownloader_clearEpCache(this.swigCPtr, this);
    }

    public ISmartMovieDownloader() {
        this(SmartMovieJniJNI.new_ISmartMovieDownloader(), true);
        SmartMovieJniJNI.ISmartMovieDownloader_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ISmartMovieDownloader iSmartMovieDownloader) {
        if (iSmartMovieDownloader == null) {
            return 0L;
        }
        return iSmartMovieDownloader.swigCPtr;
    }

    public boolean cancelFetch(String str) {
        return SmartMovieJniJNI.ISmartMovieDownloader_cancelFetch(this.swigCPtr, this, str);
    }

    public boolean hasCache(String str) {
        return SmartMovieJniJNI.ISmartMovieDownloader_hasCache(this.swigCPtr, this, str);
    }

    public boolean hasDavinciResourceCache(String str) {
        return SmartMovieJniJNI.ISmartMovieDownloader_hasDavinciResourceCache(this.swigCPtr, this, str);
    }

    public boolean isNeedFetch(String str) {
        return SmartMovieJniJNI.ISmartMovieDownloader_isNeedFetch(this.swigCPtr, this, str);
    }

    public void removeCachedFailedUrs(VecStr vecStr) {
        SmartMovieJniJNI.ISmartMovieDownloader_removeCachedFailedUrs(this.swigCPtr, this, VecStr.LJ(vecStr), vecStr);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ISmartMovieDownloader(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void fetch(String str, ISmartMovieDownloaderListener iSmartMovieDownloaderListener) {
        SmartMovieJniJNI.ISmartMovieDownloader_fetch__SWIG_1(this.swigCPtr, this, str, ISmartMovieDownloaderListener.getCPtr(iSmartMovieDownloaderListener), iSmartMovieDownloaderListener);
    }

    public String fetch(VecStr vecStr, int i, ISmartMovieDownloaderListener iSmartMovieDownloaderListener) {
        return SmartMovieJniJNI.ISmartMovieDownloader_fetch__SWIG_2(this.swigCPtr, this, VecStr.LJ(vecStr), vecStr, i, ISmartMovieDownloaderListener.getCPtr(iSmartMovieDownloaderListener), iSmartMovieDownloaderListener);
    }

    public String fetchEffectList(VecStr vecStr, int i, ISmartMovieDownloaderListener iSmartMovieDownloaderListener) {
        return SmartMovieJniJNI.ISmartMovieDownloader_fetchEffectList(this.swigCPtr, this, VecStr.LJ(vecStr), vecStr, i, ISmartMovieDownloaderListener.getCPtr(iSmartMovieDownloaderListener), iSmartMovieDownloaderListener);
    }

    public String fetchResourceList(VecStr vecStr, int i, ISmartMovieDownloaderListener iSmartMovieDownloaderListener) {
        return SmartMovieJniJNI.ISmartMovieDownloader_fetchResourceList(this.swigCPtr, this, VecStr.LJ(vecStr), vecStr, i, ISmartMovieDownloaderListener.getCPtr(iSmartMovieDownloaderListener), iSmartMovieDownloaderListener);
    }

    public String fetch(NLEModel nLEModel, int i, boolean z, boolean z2, int i2, ISmartMovieDownloaderListener iSmartMovieDownloaderListener) {
        return SmartMovieJniJNI.ISmartMovieDownloader_fetch__SWIG_0(this.swigCPtr, this, C1967607nG.LIZ(nLEModel), i, z, z2, i2, ISmartMovieDownloaderListener.getCPtr(iSmartMovieDownloaderListener), iSmartMovieDownloaderListener);
    }
}
