package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class MediaConstanceDefine {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_MediaConstanceDefine(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public MediaConstanceDefine() {
        this(DavinciResourceJniJNI.new_MediaConstanceDefine(), true);
    }

    public static String DB_KEY_EXTRA() {
        return DavinciResourceJniJNI.MediaConstanceDefine_DB_KEY_EXTRA();
    }

    public static String DB_KEY_RESOURCE_PATH() {
        return DavinciResourceJniJNI.MediaConstanceDefine_DB_KEY_RESOURCE_PATH();
    }

    public static String PARAM_CURRENT_UPDATE_PROGRESS() {
        return DavinciResourceJniJNI.MediaConstanceDefine_PARAM_CURRENT_UPDATE_PROGRESS();
    }

    public static String PARAM_LOCAL_RESOURCE() {
        return DavinciResourceJniJNI.MediaConstanceDefine_PARAM_LOCAL_RESOURCE();
    }

    public static String PARAM_MEDIA_INFO() {
        return DavinciResourceJniJNI.MediaConstanceDefine_PARAM_MEDIA_INFO();
    }

    public static String PARAM_UPDATE_MATERIAL_PARAMS() {
        return DavinciResourceJniJNI.MediaConstanceDefine_PARAM_UPDATE_MATERIAL_PARAMS();
    }

    public static String PARAM_UPLOAD_STATE() {
        return DavinciResourceJniJNI.MediaConstanceDefine_PARAM_UPLOAD_STATE();
    }

    public static String PARAM_UPLOAD_STATE_DATA_MODEL() {
        return DavinciResourceJniJNI.MediaConstanceDefine_PARAM_UPLOAD_STATE_DATA_MODEL();
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(MediaConstanceDefine mediaConstanceDefine) {
        if (mediaConstanceDefine == null) {
            return 0L;
        }
        return mediaConstanceDefine.swigCPtr;
    }

    public MediaConstanceDefine(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
