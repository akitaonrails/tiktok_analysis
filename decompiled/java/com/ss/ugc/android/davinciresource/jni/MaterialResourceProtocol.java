package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class MaterialResourceProtocol extends DAVResourceProtocol {
    public transient long swigCPtr;

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_MaterialResourceProtocol(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public MapStringString getParameters() {
        return new MapStringString(DavinciResourceJniJNI.MaterialResourceProtocol_getParameters(this.swigCPtr, this), true);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public String getSourceFrom() {
        return DavinciResourceJniJNI.MaterialResourceProtocol_getSourceFrom(this.swigCPtr, this);
    }

    public static String PARAM_RESOURCE_KEY() {
        return DavinciResourceJniJNI.MaterialResourceProtocol_PARAM_RESOURCE_KEY();
    }

    public static String PLATFORM_STRING() {
        return DavinciResourceJniJNI.MaterialResourceProtocol_PLATFORM_STRING();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.DAVResourceProtocol
    public void finalize() {
        delete();
    }

    public MaterialResourceProtocol(String str) {
        this(DavinciResourceJniJNI.new_MaterialResourceProtocol(str), true);
    }

    public static long getCPtr(MaterialResourceProtocol materialResourceProtocol) {
        if (materialResourceProtocol == null) {
            return 0L;
        }
        return materialResourceProtocol.swigCPtr;
    }

    public static boolean isMaterialResource(String str) {
        return DavinciResourceJniJNI.MaterialResourceProtocol_isMaterialResource(str);
    }

    public MaterialResourceProtocol(long j, boolean z) {
        super(DavinciResourceJniJNI.MaterialResourceProtocol_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }
}
