package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class IRequirementsPeeker {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_IRequirementsPeeker(j);
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
        DavinciResourceJniJNI.IRequirementsPeeker_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        DavinciResourceJniJNI.IRequirementsPeeker_change_ownership(this, this.swigCPtr, true);
    }

    public IRequirementsPeeker() {
        this(DavinciResourceJniJNI.new_IRequirementsPeeker(), true);
        DavinciResourceJniJNI.IRequirementsPeeker_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(IRequirementsPeeker iRequirementsPeeker) {
        if (iRequirementsPeeker == null) {
            return 0L;
        }
        return iRequirementsPeeker.swigCPtr;
    }

    public VecString peekRequirements(VecString vecString) {
        return new VecString(DavinciResourceJniJNI.IRequirementsPeeker_peekRequirements(this.swigCPtr, this, VecString.getCPtr(vecString), vecString), true);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public IRequirementsPeeker(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
