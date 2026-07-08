package com.bytedance.ies.nle.editor_jni;

/* JADX INFO: loaded from: classes28.dex */
public interface INLEMVInfo {
    long getMVDuration();

    NLEMVInfoBean getMVInfo();

    NLEMVAudioInfo getMVOriginalBackgroundAudio();

    void setMVListener(INLEListenerMVInit iNLEListenerMVInit);
}
