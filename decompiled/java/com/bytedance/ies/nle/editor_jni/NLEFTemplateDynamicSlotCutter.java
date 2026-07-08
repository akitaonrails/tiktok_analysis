package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes36.dex */
public class NLEFTemplateDynamicSlotCutter {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                NLETemplateJNI.delete_NLEFTemplateDynamicSlotCutter(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public NLEFTemplateDynamicSlotCutter() {
        this(NLETemplateJNI.new_NLEFTemplateDynamicSlotCutter(), true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(NLEFTemplateDynamicSlotCutter nLEFTemplateDynamicSlotCutter) {
        if (nLEFTemplateDynamicSlotCutter == null) {
            return 0L;
        }
        return nLEFTemplateDynamicSlotCutter.swigCPtr;
    }

    public NLEFTemplateDynamicSlotCutter(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static VecLongLong fetchRecommendSlotDuratioinsFromLab(String str, int i) {
        return new VecLongLong(NLETemplateJNI.NLEFTemplateDynamicSlotCutter_fetchRecommendSlotDuratioinsFromLab(str, i), true);
    }

    public static NLETemplateModel cutTemplateWithDynamicSlots(VecString vecString, VecLongLong vecLongLong, NLETemplateModel nLETemplateModel, boolean z) {
        long jNLEFTemplateDynamicSlotCutter_cutTemplateWithDynamicSlots = NLETemplateJNI.NLEFTemplateDynamicSlotCutter_cutTemplateWithDynamicSlots(VecString.getCPtr(vecString), vecString, VecLongLong.getCPtr(vecLongLong), vecLongLong, NLETemplateModel.getCPtr(nLETemplateModel), nLETemplateModel, z);
        if (jNLEFTemplateDynamicSlotCutter_cutTemplateWithDynamicSlots == 0) {
            return null;
        }
        return new NLETemplateModel(jNLEFTemplateDynamicSlotCutter_cutTemplateWithDynamicSlots, true);
    }
}
