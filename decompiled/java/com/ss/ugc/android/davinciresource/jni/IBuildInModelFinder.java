package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class IBuildInModelFinder {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_IBuildInModelFinder(j);
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
        DavinciResourceJniJNI.IBuildInModelFinder_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        DavinciResourceJniJNI.IBuildInModelFinder_change_ownership(this, this.swigCPtr, true);
    }

    public IBuildInModelFinder() {
        this(DavinciResourceJniJNI.new_IBuildInModelFinder(), true);
        DavinciResourceJniJNI.IBuildInModelFinder_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(IBuildInModelFinder iBuildInModelFinder) {
        if (iBuildInModelFinder == null) {
            return 0L;
        }
        return iBuildInModelFinder.swigCPtr;
    }

    public String findModelUri(String str) {
        return DavinciResourceJniJNI.IBuildInModelFinder_findModelUri(this.swigCPtr, this, str);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public IBuildInModelFinder(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean isBuildInModel(String str, String str2, int i) {
        return DavinciResourceJniJNI.IBuildInModelFinder_isBuildInModel(this.swigCPtr, this, str, str2, i);
    }
}
