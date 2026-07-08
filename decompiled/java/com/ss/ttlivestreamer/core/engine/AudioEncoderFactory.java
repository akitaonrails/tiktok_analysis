package com.ss.ttlivestreamer.core.engine;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AudioEncoderFactory extends NativeObject {
    public abstract AudioEncoder CreateAudioEncoder(String str, boolean z);

    public abstract String GetSupportedFormats();
}
