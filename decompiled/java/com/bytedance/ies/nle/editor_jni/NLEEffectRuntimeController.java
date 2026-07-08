package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes23.dex */
public class NLEEffectRuntimeController {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLEMediaPublicJniJNI.delete_NLEEffectRuntimeController(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int removeEffectMessageCenterCallback() {
        return NLEMediaPublicJniJNI.NLEEffectRuntimeController_removeEffectMessageCenterCallback(this.swigCPtr, this);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEEffectRuntimeController nLEEffectRuntimeController) {
        if (nLEEffectRuntimeController == null) {
            return 0L;
        }
        return nLEEffectRuntimeController.swigCPtr;
    }

    public int setEffectMessageCenterCallback(NLEEffectMsgListenerWrapper nLEEffectMsgListenerWrapper) {
        return NLEMediaPublicJniJNI.NLEEffectRuntimeController_setEffectMessageCenterCallback(this.swigCPtr, this, NLEEffectMsgListenerWrapper.getCPtr(nLEEffectMsgListenerWrapper), nLEEffectMsgListenerWrapper);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public NLEEffectRuntimeController(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public int doAction(boolean z, String str, int i, MapStrStr mapStrStr, NLEDoActionListenerWrapper nLEDoActionListenerWrapper) {
        return NLEMediaPublicJniJNI.NLEEffectRuntimeController_doAction(this.swigCPtr, this, z, str, i, MapStrStr.getCPtr(mapStrStr), mapStrStr, NLEDoActionListenerWrapper.getCPtr(nLEDoActionListenerWrapper), nLEDoActionListenerWrapper);
    }
}
