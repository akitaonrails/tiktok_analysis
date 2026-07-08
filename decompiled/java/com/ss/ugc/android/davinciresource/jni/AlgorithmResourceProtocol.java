package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class AlgorithmResourceProtocol extends DAVResourceProtocol {
    public transient long swigCPtr;

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_AlgorithmResourceProtocol(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public MapStringString getParameters() {
        return new MapStringString(DavinciResourceJniJNI.AlgorithmResourceProtocol_getParameters(this.swigCPtr, this), true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public String getSourceFrom() {
        return DavinciResourceJniJNI.AlgorithmResourceProtocol_getSourceFrom(this.swigCPtr, this);
    }

    public static String EXTRA_PARAM_INCLUDE_BUILD_IN_RES() {
        return DavinciResourceJniJNI.AlgorithmResourceProtocol_EXTRA_PARAM_INCLUDE_BUILD_IN_RES();
    }

    public static String PARAM_BUSI_ID() {
        return DavinciResourceJniJNI.AlgorithmResourceProtocol_PARAM_BUSI_ID();
    }

    public static String PARAM_MODEL_NAME() {
        return DavinciResourceJniJNI.AlgorithmResourceProtocol_PARAM_MODEL_NAME();
    }

    public static String PARAM_MODEL_NAME_MAP_STRING() {
        return DavinciResourceJniJNI.AlgorithmResourceProtocol_PARAM_MODEL_NAME_MAP_STRING();
    }

    public static String PARAM_REQUIREMENTS() {
        return DavinciResourceJniJNI.AlgorithmResourceProtocol_PARAM_REQUIREMENTS();
    }

    public static String PLATFORM_STRING() {
        return DavinciResourceJniJNI.AlgorithmResourceProtocol_PLATFORM_STRING();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public void finalize() {
        delete();
    }

    public AlgorithmResourceProtocol(String str) {
        this(DavinciResourceJniJNI.new_AlgorithmResourceProtocol__SWIG_1(str), true);
    }

    public static long getCPtr(AlgorithmResourceProtocol algorithmResourceProtocol) {
        if (algorithmResourceProtocol == null) {
            return 0L;
        }
        return algorithmResourceProtocol.swigCPtr;
    }

    public static boolean isAlgorithmResource(String str) {
        return DavinciResourceJniJNI.AlgorithmResourceProtocol_isAlgorithmResource(str);
    }

    public AlgorithmResourceProtocol(VecString vecString, String str) {
        this(DavinciResourceJniJNI.new_AlgorithmResourceProtocol__SWIG_0(VecString.getCPtr(vecString), vecString, str), true);
    }

    public AlgorithmResourceProtocol(long j, boolean z) {
        super(DavinciResourceJniJNI.AlgorithmResourceProtocol_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
