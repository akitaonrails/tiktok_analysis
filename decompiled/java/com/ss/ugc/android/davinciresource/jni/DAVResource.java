package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVResource {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVResource(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public VecDAVResource getDependResource() {
        return new VecDAVResource(DavinciResourceJniJNI.DAVResource_getDependResource(this.swigCPtr, this), true);
    }

    public DavResourceExtraData getExtraData() {
        return new DavResourceExtraData(DavinciResourceJniJNI.DAVResource_getExtraData(this.swigCPtr, this), true);
    }

    public String getResourceFile() {
        return DavinciResourceJniJNI.DAVResource_getResourceFile(this.swigCPtr, this);
    }

    public String getResourceId() {
        return DavinciResourceJniJNI.DAVResource_getResourceId(this.swigCPtr, this);
    }

    public String toString() {
        return DavinciResourceJniJNI.DAVResource_toString(this.swigCPtr, this);
    }

    public DAVResource() {
        this(DavinciResourceJniJNI.new_DAVResource__SWIG_0(), true);
    }

    public void finalize() {
        delete();
    }

    public DAVResource(String str) {
        this(DavinciResourceJniJNI.new_DAVResource__SWIG_1(str), true);
    }

    public static long getCPtr(DAVResource dAVResource) {
        if (dAVResource == null) {
            return 0L;
        }
        return dAVResource.swigCPtr;
    }

    public void setDependResource(VecDAVResource vecDAVResource) {
        DavinciResourceJniJNI.DAVResource_setDependResource(this.swigCPtr, this, VecDAVResource.getCPtr(vecDAVResource), vecDAVResource);
    }

    public void setExtraData(DavResourceExtraData davResourceExtraData) {
        DavinciResourceJniJNI.DAVResource_setExtraData(this.swigCPtr, this, DavResourceExtraData.getCPtr(davResourceExtraData), davResourceExtraData);
    }

    public void setResourceFile(String str) {
        DavinciResourceJniJNI.DAVResource_setResourceFile(this.swigCPtr, this, str);
    }

    public void setResourceId(String str) {
        DavinciResourceJniJNI.DAVResource_setResourceId(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DAVResource(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
