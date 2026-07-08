package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class LokiResourceProtocol extends DAVResourceProtocol {
    public transient long swigCPtr;

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_LokiResourceProtocol(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public MapStringString getParameters() {
        return new MapStringString(DavinciResourceJniJNI.LokiResourceProtocol_getParameters(this.swigCPtr, this), true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public String getSourceFrom() {
        return DavinciResourceJniJNI.LokiResourceProtocol_getSourceFrom(this.swigCPtr, this);
    }

    public static String PARAM_EFFECT_ID() {
        return DavinciResourceJniJNI.LokiResourceProtocol_PARAM_EFFECT_ID();
    }

    public static String PARAM_NOT_DOWNLOAD_DEPENDENT_RES() {
        return DavinciResourceJniJNI.LokiResourceProtocol_PARAM_NOT_DOWNLOAD_DEPENDENT_RES();
    }

    public static String PARAM_PANEL() {
        return DavinciResourceJniJNI.LokiResourceProtocol_PARAM_PANEL();
    }

    public static String PARAM_RESOURCE_ID() {
        return DavinciResourceJniJNI.LokiResourceProtocol_PARAM_RESOURCE_ID();
    }

    public static String PLATFORM_STRING() {
        return DavinciResourceJniJNI.LokiResourceProtocol_PLATFORM_STRING();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public void finalize() {
        delete();
    }

    public LokiResourceProtocol(String str) {
        this(DavinciResourceJniJNI.new_LokiResourceProtocol__SWIG_0(str), true);
    }

    public static long getCPtr(LokiResourceProtocol lokiResourceProtocol) {
        if (lokiResourceProtocol == null) {
            return 0L;
        }
        return lokiResourceProtocol.swigCPtr;
    }

    public static boolean isLokiResource(String str) {
        return DavinciResourceJniJNI.LokiResourceProtocol_isLokiResource(str);
    }

    public LokiResourceProtocol(long j, boolean z) {
        super(DavinciResourceJniJNI.LokiResourceProtocol_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public LokiResourceProtocol(String str, String str2) {
        this(DavinciResourceJniJNI.new_LokiResourceProtocol__SWIG_1(str, str2), true);
    }
}
