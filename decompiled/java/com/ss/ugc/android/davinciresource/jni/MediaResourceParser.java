package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class MediaResourceParser {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_MediaResourceParser(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String getMediaId() {
        return DavinciResourceJniJNI.MediaResourceParser_mediaId_get(this.swigCPtr, this);
    }

    public String getStoreId() {
        return DavinciResourceJniJNI.MediaResourceParser_storeId_get(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public MediaResourceParser(String str) {
        this(DavinciResourceJniJNI.new_MediaResourceParser(str), true);
    }

    public static long getCPtr(MediaResourceParser mediaResourceParser) {
        if (mediaResourceParser == null) {
            return 0L;
        }
        return mediaResourceParser.swigCPtr;
    }

    public void setMediaId(String str) {
        DavinciResourceJniJNI.MediaResourceParser_mediaId_set(this.swigCPtr, this, str);
    }

    public void setStoreId(String str) {
        DavinciResourceJniJNI.MediaResourceParser_storeId_set(this.swigCPtr, this, str);
    }

    public MediaResourceParser(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
