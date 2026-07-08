package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class UrlResourceProtocol extends DAVResourceProtocol {
    public transient long swigCPtr;

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_UrlResourceProtocol(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public MapStringString getParameters() {
        return new MapStringString(DavinciResourceJniJNI.UrlResourceProtocol_getParameters(this.swigCPtr, this), true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public String getSourceFrom() {
        return DavinciResourceJniJNI.UrlResourceProtocol_getSourceFrom(this.swigCPtr, this);
    }

    public static String EXTRA_CACHE_VALID_TIME() {
        return DavinciResourceJniJNI.UrlResourceProtocol_EXTRA_CACHE_VALID_TIME();
    }

    public static String EXTRA_PARAM_MD5() {
        return DavinciResourceJniJNI.UrlResourceProtocol_EXTRA_PARAM_MD5();
    }

    public static String EXTRA_PARAM_SAVE_PATH() {
        return DavinciResourceJniJNI.UrlResourceProtocol_EXTRA_PARAM_SAVE_PATH();
    }

    public static String KEY_URL() {
        return DavinciResourceJniJNI.UrlResourceProtocol_KEY_URL();
    }

    public static String PLATFORM_STRING() {
        return DavinciResourceJniJNI.UrlResourceProtocol_PLATFORM_STRING();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public void finalize() {
        delete();
    }

    public UrlResourceProtocol(String str) {
        this(DavinciResourceJniJNI.new_UrlResourceProtocol(str), true);
    }

    public static long getCPtr(UrlResourceProtocol urlResourceProtocol) {
        if (urlResourceProtocol == null) {
            return 0L;
        }
        return urlResourceProtocol.swigCPtr;
    }

    public static boolean isUrlResource(String str) {
        return DavinciResourceJniJNI.UrlResourceProtocol_isUrlResource(str);
    }

    public UrlResourceProtocol(long j, boolean z) {
        super(DavinciResourceJniJNI.UrlResourceProtocol_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
