package com.bytedance.ies.cutsame.cut_android;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;

/* JADX INFO: loaded from: classes23.dex */
public interface NLEPrepareListener {
    void onError(int i, String str);

    void onPreSuccess(NLETemplateModel nLETemplateModel);

    void onProgress(float f, String str);

    void onSuccess(NLETemplateModel nLETemplateModel);
}
