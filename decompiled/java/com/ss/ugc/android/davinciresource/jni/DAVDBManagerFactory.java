package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class DAVDBManagerFactory {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVDBManagerFactory(j);
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
        DavinciResourceJniJNI.DAVDBManagerFactory_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        DavinciResourceJniJNI.DAVDBManagerFactory_change_ownership(this, this.swigCPtr, true);
    }

    public DAVDBManagerFactory() {
        this(DavinciResourceJniJNI.new_DAVDBManagerFactory(), true);
        DavinciResourceJniJNI.DAVDBManagerFactory_director_connect(this, this.swigCPtr, true, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVDBManagerFactory dAVDBManagerFactory) {
        if (dAVDBManagerFactory == null) {
            return 0L;
        }
        return dAVDBManagerFactory.swigCPtr;
    }

    public IDAVDBManager getDBManager(String str) {
        long jDAVDBManagerFactory_getDBManager = DavinciResourceJniJNI.DAVDBManagerFactory_getDBManager(this.swigCPtr, this, str);
        if (jDAVDBManagerFactory_getDBManager == 0) {
            return null;
        }
        return new IDAVDBManager(jDAVDBManagerFactory_getDBManager, true);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public DAVDBManagerFactory(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
