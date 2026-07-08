package com.bytedance.ies.nle.editor_jni;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes36.dex */
public class NLEModelDownloader {
    public List<NLEResourceDownloadCallback> nleResourceDownloadCallback;
    public List<NLEResourceListDownloadCallback> nleResourceListDownloadCallbackList;
    public List<NLESingleResourceDownloadCallback> nleSingleResourceDownloadCallback;
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEResourcesDAVJNI.delete_NLEModelDownloader(j);
                this.nleResourceDownloadCallback.clear();
                this.nleResourceDownloadCallback = null;
                this.nleSingleResourceDownloadCallback.clear();
                this.nleSingleResourceDownloadCallback = null;
                this.nleResourceListDownloadCallbackList.clear();
                this.nleResourceListDownloadCallbackList = null;
            }
            this.swigCPtr = 0L;
        }
    }

    public void clearEpCache() {
        NLEResourcesDAVJNI.NLEModelDownloader_clearEpCache(this.swigCPtr, this);
    }

    public NLEModelDownloader() {
        this(NLEResourcesDAVJNI.new_NLEModelDownloader(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEModelDownloader nLEModelDownloader) {
        if (nLEModelDownloader == null) {
            return 0L;
        }
        return nLEModelDownloader.swigCPtr;
    }

    public boolean cancelFetch(String str) {
        return NLEResourcesDAVJNI.NLEModelDownloader_cancelFetch(this.swigCPtr, this, str);
    }

    public boolean hasCache(String str) {
        return NLEResourcesDAVJNI.NLEModelDownloader_hasCache(this.swigCPtr, this, str);
    }

    public boolean hasDavinciResourceCache(String str) {
        return NLEResourcesDAVJNI.NLEModelDownloader_hasDavinciResourceCache(this.swigCPtr, this, str);
    }

    public boolean isNeedFetch(String str) {
        return NLEResourcesDAVJNI.NLEModelDownloader_isNeedFetch(this.swigCPtr, this, str);
    }

    public void removeCachedFailedUrs(VecString vecString) {
        NLEResourcesDAVJNI.NLEModelDownloader_removeCachedFailedUrs(this.swigCPtr, this, VecString.getCPtr(vecString), vecString);
    }

    public void removeNLEResourceDownloadCallback(NLEResourceDownloadCallback nLEResourceDownloadCallback) {
        List<NLEResourceDownloadCallback> list = this.nleResourceDownloadCallback;
        if (list != null && nLEResourceDownloadCallback != null) {
            list.remove(nLEResourceDownloadCallback);
        }
    }

    public void removeNLEResourceListDownloadCallback(NLEResourceListDownloadCallback nLEResourceListDownloadCallback) {
        List<NLEResourceListDownloadCallback> list = this.nleResourceListDownloadCallbackList;
        if (list != null && nLEResourceListDownloadCallback != null) {
            list.remove(nLEResourceListDownloadCallback);
        }
    }

    public void removeNLESingleResourceDownloadCallback(NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback) {
        List<NLESingleResourceDownloadCallback> list = this.nleSingleResourceDownloadCallback;
        if (list != null && nLESingleResourceDownloadCallback != null) {
            list.remove(nLESingleResourceDownloadCallback);
        }
    }

    public NLEModelDownloader(long j, boolean z) {
        this.nleResourceDownloadCallback = new CopyOnWriteArrayList();
        this.nleSingleResourceDownloadCallback = new CopyOnWriteArrayList();
        this.nleResourceListDownloadCallbackList = new CopyOnWriteArrayList();
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void fetch(String str, NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback) {
        List<NLESingleResourceDownloadCallback> list = this.nleSingleResourceDownloadCallback;
        if (list != null && nLESingleResourceDownloadCallback != null) {
            list.add(nLESingleResourceDownloadCallback);
        }
        NLEResourcesDAVJNI.NLEModelDownloader_fetch__SWIG_1(this.swigCPtr, this, str, NLESingleResourceDownloadCallback.getCPtr(nLESingleResourceDownloadCallback), nLESingleResourceDownloadCallback);
    }

    public String fetch(VecString vecString, int i, NLEResourceListDownloadCallback nLEResourceListDownloadCallback) {
        List<NLEResourceListDownloadCallback> list = this.nleResourceListDownloadCallbackList;
        if (list != null && nLEResourceListDownloadCallback != null) {
            list.add(nLEResourceListDownloadCallback);
        }
        return NLEResourcesDAVJNI.NLEModelDownloader_fetch__SWIG_2(this.swigCPtr, this, VecString.getCPtr(vecString), vecString, i, NLEResourceListDownloadCallback.getCPtr(nLEResourceListDownloadCallback), nLEResourceListDownloadCallback);
    }

    public String fetchEffectList(VecString vecString, int i, NLEResourceListDownloadCallback nLEResourceListDownloadCallback) {
        List<NLEResourceListDownloadCallback> list = this.nleResourceListDownloadCallbackList;
        if (list != null && nLEResourceListDownloadCallback != null) {
            list.add(nLEResourceListDownloadCallback);
        }
        return NLEResourcesDAVJNI.NLEModelDownloader_fetchEffectList(this.swigCPtr, this, VecString.getCPtr(vecString), vecString, i, NLEResourceListDownloadCallback.getCPtr(nLEResourceListDownloadCallback), nLEResourceListDownloadCallback);
    }

    public String fetchResourceList(VecString vecString, int i, NLEResourceListDownloadCallback nLEResourceListDownloadCallback) {
        return NLEResourcesDAVJNI.NLEModelDownloader_fetchResourceList(this.swigCPtr, this, VecString.getCPtr(vecString), vecString, i, NLEResourceListDownloadCallback.getCPtr(nLEResourceListDownloadCallback), nLEResourceListDownloadCallback);
    }

    public String fetch(NLEModel nLEModel, int i, boolean z, boolean z2, NLEResourceDownloadCallback nLEResourceDownloadCallback) {
        return NLEResourcesDAVJNI.NLEModelDownloader_fetch__SWIG_0(this.swigCPtr, this, NLEModel.getCPtr(nLEModel), nLEModel, i, z, z2, NLEResourceDownloadCallback.getCPtr(nLEResourceDownloadCallback), nLEResourceDownloadCallback);
    }
}
