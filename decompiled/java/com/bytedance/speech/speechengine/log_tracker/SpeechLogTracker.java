package com.bytedance.speech.speechengine.log_tracker;

import com.bytedance.speech.speechengine.SpeechEngineLoader;

/* JADX INFO: loaded from: classes35.dex */
public class SpeechLogTracker {
    private native long getInstanceToNative(String str, String str2, String str3, String str4);

    private native void writeLogToNative(long j, long j2, String str, String str2);

    static {
        new SpeechLogTracker();
        SpeechEngineLoader.getInstance().load();
    }
}
