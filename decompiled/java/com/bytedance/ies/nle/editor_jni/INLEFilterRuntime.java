package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes6.dex */
public interface INLEFilterRuntime {
    VecInt checkComposerNodeExclusion(String str, String str2, String str3);

    int doLensOneKeyDetect();

    String getAmazingFilterParam(String str, String str2);

    float getColorFilterIntensity(String str);

    void updateMultiComposerNodesInSwing(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2);
}
