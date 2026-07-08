package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class ResourceUtil {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEResourcesDAVJNI.delete_ResourceUtil(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public ResourceUtil() {
        this(NLEResourcesDAVJNI.new_ResourceUtil(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(ResourceUtil resourceUtil) {
        if (resourceUtil == null) {
            return 0L;
        }
        return resourceUtil.swigCPtr;
    }

    public static void updateRichContentResourceForTextSticker(NLEModel nLEModel) {
        NLEResourcesDAVJNI.ResourceUtil_updateRichContentResourceForTextSticker(NLEModel.getCPtr(nLEModel), nLEModel);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public ResourceUtil(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static void updateResourceFile(NLEResourceNode nLEResourceNode, String str) {
        NLEResourcesDAVJNI.ResourceUtil_updateResourceFile(NLEResourceNode.getCPtr(nLEResourceNode), nLEResourceNode, str);
    }
}
