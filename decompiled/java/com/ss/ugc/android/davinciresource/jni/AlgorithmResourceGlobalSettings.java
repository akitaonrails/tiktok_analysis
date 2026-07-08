package com.ss.ugc.android.davinciresource.jni;

/* JADX INFO: loaded from: classes36.dex */
public class AlgorithmResourceGlobalSettings {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_AlgorithmResourceGlobalSettings(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public AlgorithmResourceGlobalSettings() {
        this(DavinciResourceJniJNI.new_AlgorithmResourceGlobalSettings(), true);
    }

    public static boolean getAlgorithmModelMappingRuleValid() {
        return DavinciResourceJniJNI.AlgorithmResourceGlobalSettings_getAlgorithmModelMappingRuleValid();
    }

    public static long getResourceFinder() {
        return DavinciResourceJniJNI.AlgorithmResourceGlobalSettings_getResourceFinder();
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(AlgorithmResourceGlobalSettings algorithmResourceGlobalSettings) {
        if (algorithmResourceGlobalSettings == null) {
            return 0L;
        }
        return algorithmResourceGlobalSettings.swigCPtr;
    }

    public static void setAlgorithmModelMappingRuleValid(boolean z) {
        DavinciResourceJniJNI.AlgorithmResourceGlobalSettings_setAlgorithmModelMappingRuleValid(z);
    }

    public static void setBuildInModelFinder(IBuildInModelFinder iBuildInModelFinder) {
        DavinciResourceJniJNI.AlgorithmResourceGlobalSettings_setBuildInModelFinder(IBuildInModelFinder.getCPtr(iBuildInModelFinder), iBuildInModelFinder);
    }

    public static void setRequirementsPeeker(IRequirementsPeeker iRequirementsPeeker) {
        DavinciResourceJniJNI.AlgorithmResourceGlobalSettings_setRequirementsPeeker(IRequirementsPeeker.getCPtr(iRequirementsPeeker), iRequirementsPeeker);
    }

    public AlgorithmResourceGlobalSettings(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
