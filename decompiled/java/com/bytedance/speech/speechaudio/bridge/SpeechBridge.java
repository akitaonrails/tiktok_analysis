package com.bytedance.speech.speechaudio.bridge;

import android.content.res.AssetManager;

/* JADX INFO: loaded from: classes35.dex */
public interface SpeechBridge {
    long createEngineToNative(SpeechBridgeCallback speechBridgeCallback);

    void destroyEngineToNative(long j);

    int feedAudioToNative(long j, byte[] bArr, int i);

    int fetchResultToNative(long j, int i, byte[] bArr);

    String fetchStringResultToNative(long j, int i);

    String getVersionToNative();

    int initEngineToNative(long j, AssetManager assetManager);

    boolean isEngineSupportedToNative(String str);

    int processAudioToNative(long j, byte[] bArr, int i, boolean z);

    int resetEngineToNative(long j);

    int sendDirectiveToNative(long j, int i, String str);

    void setOptionBooleanToNative(long j, String str, boolean z);

    void setOptionDoubleToNative(long j, String str, double d);

    void setOptionIntToNative(long j, String str, int i);

    void setOptionStringToNative(long j, String str, String str2);
}
