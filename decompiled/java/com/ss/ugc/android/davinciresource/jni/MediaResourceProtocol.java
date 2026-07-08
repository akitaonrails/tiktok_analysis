package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class MediaResourceProtocol extends DAVResourceProtocol {
    public transient long swigCPtr;

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_MediaResourceProtocol(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public MapStringString getParameters() {
        return new MapStringString(DavinciResourceJniJNI.MediaResourceProtocol_getParameters(this.swigCPtr, this), true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public String getSourceFrom() {
        return DavinciResourceJniJNI.MediaResourceProtocol_getSourceFrom(this.swigCPtr, this);
    }

    public static String EXTRA_AUTO_UNZIP() {
        return DavinciResourceJniJNI.MediaResourceProtocol_EXTRA_AUTO_UNZIP();
    }

    public static String EXTRA_EXTRA_INFO() {
        return DavinciResourceJniJNI.MediaResourceProtocol_EXTRA_EXTRA_INFO();
    }

    public static String EXTRA_FILE_URL() {
        return DavinciResourceJniJNI.MediaResourceProtocol_EXTRA_FILE_URL();
    }

    public static String EXTRA_MD5() {
        return DavinciResourceJniJNI.MediaResourceProtocol_EXTRA_MD5();
    }

    public static String EXTRA_MEDIA_EXTENSION() {
        return DavinciResourceJniJNI.MediaResourceProtocol_EXTRA_MEDIA_EXTENSION();
    }

    public static String EXTRA_PARAM_CACHE_DIR() {
        return DavinciResourceJniJNI.MediaResourceProtocol_EXTRA_PARAM_CACHE_DIR();
    }

    public static String EXTRA_PARAM_CHANNEL_ID() {
        return DavinciResourceJniJNI.MediaResourceProtocol_EXTRA_PARAM_CHANNEL_ID();
    }

    public static String EXTRA_PARAM_DELETE_LOCAL_RES() {
        return DavinciResourceJniJNI.MediaResourceProtocol_EXTRA_PARAM_DELETE_LOCAL_RES();
    }

    public static String EXTRA_PARAM_DELETE_LOCAL_RES_RECORD() {
        return DavinciResourceJniJNI.MediaResourceProtocol_EXTRA_PARAM_DELETE_LOCAL_RES_RECORD();
    }

    public static String EXTRA_PARAM_DELETE_REMOTE_RES() {
        return DavinciResourceJniJNI.MediaResourceProtocol_EXTRA_PARAM_DELETE_REMOTE_RES();
    }

    public static String EXTRA_PARAM_MEDIA_ITEM() {
        return DavinciResourceJniJNI.MediaResourceProtocol_EXTRA_PARAM_MEDIA_ITEM();
    }

    public static String EXTRA_PARAM_SOURCE_PATH() {
        return DavinciResourceJniJNI.MediaResourceProtocol_EXTRA_PARAM_SOURCE_PATH();
    }

    public static String EXTRA_PARAM_UPDATE_MEDIA_ITEM() {
        return DavinciResourceJniJNI.MediaResourceProtocol_EXTRA_PARAM_UPDATE_MEDIA_ITEM();
    }

    public static String KEY_MEDIA_ID() {
        return DavinciResourceJniJNI.MediaResourceProtocol_KEY_MEDIA_ID();
    }

    public static String KEY_STORE_ID() {
        return DavinciResourceJniJNI.MediaResourceProtocol_KEY_STORE_ID();
    }

    public static String PLATFORM_STRING() {
        return DavinciResourceJniJNI.MediaResourceProtocol_PLATFORM_STRING();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public void finalize() {
        delete();
    }

    public MediaResourceProtocol(String str) {
        this(DavinciResourceJniJNI.new_MediaResourceProtocol__SWIG_0(str), true);
    }

    public static long getCPtr(MediaResourceProtocol mediaResourceProtocol) {
        if (mediaResourceProtocol == null) {
            return 0L;
        }
        return mediaResourceProtocol.swigCPtr;
    }

    public static boolean isMediaResource(String str) {
        return DavinciResourceJniJNI.MediaResourceProtocol_isMediaResource(str);
    }

    public MediaResourceProtocol(long j, boolean z) {
        super(DavinciResourceJniJNI.MediaResourceProtocol_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public MediaResourceProtocol(String str, String str2) {
        this(DavinciResourceJniJNI.new_MediaResourceProtocol__SWIG_1(str, str2), true);
    }
}
