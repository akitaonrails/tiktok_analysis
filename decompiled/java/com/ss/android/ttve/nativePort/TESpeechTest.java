package com.ss.android.ttve.nativePort;

/* JADX INFO: loaded from: classes4.dex */
public class TESpeechTest {
    public long handle;

    public static native long createSpeechUtils();

    public static native void init(long j);

    public static native int process(long j, short[] sArr, int i);

    public static native int stop(long j);

    public static TESpeechTest create() {
        TESpeechTest tESpeechTest = new TESpeechTest();
        tESpeechTest.handle = createSpeechUtils();
        return tESpeechTest;
    }

    public void init() {
        init(this.handle);
    }

    public int stop() {
        return stop(this.handle);
    }

    public int process(short[] sArr, int i) {
        return process(this.handle, sArr, i);
    }
}
