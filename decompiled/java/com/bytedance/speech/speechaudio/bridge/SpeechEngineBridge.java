package com.bytedance.speech.speechaudio.bridge;

import android.content.res.AssetManager;

/* JADX INFO: loaded from: classes35.dex */
public class SpeechEngineBridge implements SpeechBridge {
    @Override // com.bytedance.speech.speechaudio.bridge.SpeechBridge
    public native long createEngineToNative(SpeechBridgeCallback speechBridgeCallback);

    @Override // com.bytedance.speech.speechaudio.bridge.SpeechBridge
    public native void destroyEngineToNative(long j);

    @Override // com.bytedance.speech.speechaudio.bridge.SpeechBridge
    public native int feedAudioToNative(long j, byte[] bArr, int i);

    @Override // com.bytedance.speech.speechaudio.bridge.SpeechBridge
    public native int fetchResultToNative(long j, int i, byte[] bArr);

    @Override // com.bytedance.speech.speechaudio.bridge.SpeechBridge
    public native String fetchStringResultToNative(long j, int i);

    @Override // com.bytedance.speech.speechaudio.bridge.SpeechBridge
    public native String getVersionToNative();

    @Override // com.bytedance.speech.speechaudio.bridge.SpeechBridge
    public native int initEngineToNative(long j, AssetManager assetManager);

    @Override // com.bytedance.speech.speechaudio.bridge.SpeechBridge
    public native boolean isEngineSupportedToNative(String str);

    @Override // com.bytedance.speech.speechaudio.bridge.SpeechBridge
    public native int processAudioToNative(long j, byte[] bArr, int i, boolean z);

    @Override // com.bytedance.speech.speechaudio.bridge.SpeechBridge
    public native int resetEngineToNative(long j);

    @Override // com.bytedance.speech.speechaudio.bridge.SpeechBridge
    public native int sendDirectiveToNative(long j, int i, String str);

    @Override // com.bytedance.speech.speechaudio.bridge.SpeechBridge
    public native void setOptionBooleanToNative(long j, String str, boolean z);

    @Override // com.bytedance.speech.speechaudio.bridge.SpeechBridge
    public native void setOptionDoubleToNative(long j, String str, double d);

    @Override // com.bytedance.speech.speechaudio.bridge.SpeechBridge
    public native void setOptionIntToNative(long j, String str, int i);

    @Override // com.bytedance.speech.speechaudio.bridge.SpeechBridge
    public native void setOptionStringToNative(long j, String str, String str2);
}
