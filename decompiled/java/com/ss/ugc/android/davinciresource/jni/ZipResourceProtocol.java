package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class ZipResourceProtocol extends DAVResourceProtocol {
    public transient long swigCPtr;

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_ZipResourceProtocol(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public MapStringString getParameters() {
        return new MapStringString(DavinciResourceJniJNI.ZipResourceProtocol_getParameters(this.swigCPtr, this), true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public String getSourceFrom() {
        return DavinciResourceJniJNI.ZipResourceProtocol_getSourceFrom(this.swigCPtr, this);
    }

    public static String EXTRA_PARAM_AUTO_UNZIP() {
        return DavinciResourceJniJNI.ZipResourceProtocol_EXTRA_PARAM_AUTO_UNZIP();
    }

    public static String EXTRA_PARAM_MD5() {
        return DavinciResourceJniJNI.ZipResourceProtocol_EXTRA_PARAM_MD5();
    }

    public static String EXTRA_PARAM_RELATIVE_PATH() {
        return DavinciResourceJniJNI.ZipResourceProtocol_EXTRA_PARAM_RELATIVE_PATH();
    }

    public static String EXTRA_PARAM_SAVE_PATH() {
        return DavinciResourceJniJNI.ZipResourceProtocol_EXTRA_PARAM_SAVE_PATH();
    }

    public static String KEY_URL() {
        return DavinciResourceJniJNI.ZipResourceProtocol_KEY_URL();
    }

    public static String PLATFORM_STRING() {
        return DavinciResourceJniJNI.ZipResourceProtocol_PLATFORM_STRING();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public void finalize() {
        delete();
    }

    public ZipResourceProtocol(String str) {
        this(DavinciResourceJniJNI.new_ZipResourceProtocol__SWIG_0(str), true);
    }

    public static long getCPtr(ZipResourceProtocol zipResourceProtocol) {
        if (zipResourceProtocol == null) {
            return 0L;
        }
        return zipResourceProtocol.swigCPtr;
    }

    public static boolean isZipResource(String str) {
        return DavinciResourceJniJNI.ZipResourceProtocol_isZipResource(str);
    }

    public ZipResourceProtocol(long j, boolean z) {
        super(DavinciResourceJniJNI.ZipResourceProtocol_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public ZipResourceProtocol(String str, String str2) {
        this(DavinciResourceJniJNI.new_ZipResourceProtocol__SWIG_1(str, str2), true);
    }
}
