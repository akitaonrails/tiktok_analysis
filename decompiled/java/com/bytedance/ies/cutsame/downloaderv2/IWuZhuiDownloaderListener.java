package com.bytedance.ies.cutsame.downloaderv2;

import com.bytedance.ies.nle.editor_jni.NLEModel;

/* JADX INFO: loaded from: classes9.dex */
public interface IWuZhuiDownloaderListener {
    void onFailure(String str, int i, String str2);

    void onProgress(float f);

    void onSuccess(NLEModel nLEModel);
}
