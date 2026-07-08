package com.ss.bytertc.engine;

import com.ss.bytertc.engine.handler.LyraxAudioPlayerAudioFrameObserver;
import com.ss.bytertc.engine.handler.LyraxAudioPlayerCustomSourceProvider;
import com.ss.bytertc.engine.handler.LyraxAudioPlayerListener;

/* JADX INFO: loaded from: classes21.dex */
public class NativeLyraxAudioPlayerFunctions {
    public static native void nativeDestory(long j);

    public static native int nativeGetAudioTrackCount(long j);

    public static native int nativeGetPlaybackDuration(long j);

    public static native int nativeGetPosition(long j);

    public static native int nativeGetTotalDuration(long j);

    public static native int nativeGetVolume(long j, int i);

    public static native int nativeOpen(long j, String str, int i, int i2, int i3, boolean z, long j2, boolean z2);

    public static native int nativeOpenWithCustomSource(long j, int i, int i2, LyraxAudioPlayerCustomSourceProvider lyraxAudioPlayerCustomSourceProvider, int i3, int i4, int i5, boolean z, long j2, boolean z2);

    public static native int nativePause(long j);

    public static native int nativePushExternalAudioFrame(long j, byte[] bArr, int i, int i2, int i3);

    public static native int nativeRegisterAudioFrameObserver(long j, LyraxAudioPlayerAudioFrameObserver lyraxAudioPlayerAudioFrameObserver);

    public static native int nativeResume(long j);

    public static native int nativeSelectAudioTrack(long j, int i);

    public static native int nativeSetAudioDualMonoMode(long j, int i);

    public static native int nativeSetAudioPitch(long j, int i);

    public static native int nativeSetListener(long j, LyraxAudioPlayerListener lyraxAudioPlayerListener);

    public static native int nativeSetLoudness(long j, float f);

    public static native int nativeSetPlaybackSpeed(long j, int i);

    public static native int nativeSetPosition(long j, int i);

    public static native int nativeSetProgressInterval(long j, long j2);

    public static native int nativeSetVolume(long j, int i, int i2);

    public static native int nativeStart(long j);

    public static native int nativeStop(long j);
}
