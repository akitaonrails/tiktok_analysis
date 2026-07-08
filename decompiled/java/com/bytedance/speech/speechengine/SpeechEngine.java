package com.bytedance.speech.speechengine;

import android.content.Context;
import android.view.SurfaceView;
import com.bytedance.bpea.basics.Cert;

/* JADX INFO: loaded from: classes28.dex */
public interface SpeechEngine {

    public interface SpeechListener {
        void onSpeechMessage(int i, byte[] bArr, int i2);
    }

    long createEngine();

    void destroyEngine();

    void destroyEngine(long j);

    int feedAudio(long j, byte[] bArr, int i);

    int feedAudio(byte[] bArr, int i);

    int fetchResult(int i, byte[] bArr);

    int fetchResult(long j, byte[] bArr);

    String fetchResult(int i);

    String getVersion();

    String getVersion(long j);

    int initEngine();

    int initEngine(long j);

    boolean isEngineSupported(String str);

    int processAudio(byte[] bArr, int i, boolean z);

    int resetEngine();

    int resetEngine(long j);

    int sendDirective(int i, String str);

    int sendDirective(int i, String str, Cert cert);

    int sendDirective(long j, int i, String str);

    int sendDirective(long j, int i, String str, Cert cert);

    void setContext(Context context);

    void setListener(SpeechListener speechListener);

    void setOptionBoolean(long j, String str, boolean z);

    void setOptionBoolean(String str, boolean z);

    void setOptionDouble(String str, double d);

    void setOptionInt(long j, String str, int i);

    void setOptionInt(String str, int i);

    void setOptionString(long j, String str, String str2);

    void setOptionString(String str, String str2);

    void setRemoteView(SurfaceView surfaceView);
}
