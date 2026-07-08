package com.bytedance.creativex.editor.preview;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public interface IAudioEffectParam extends Parcelable {
    String getEffectPath();

    String getPanel();

    String getResId();

    int getSeqIn();

    int getSeqOut();

    void setPreprocessResult(byte[] bArr);

    void setSeqIn(int i);

    void setSeqOut(int i);
}
