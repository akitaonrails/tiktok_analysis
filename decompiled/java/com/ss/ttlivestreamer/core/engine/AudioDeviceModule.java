package com.ss.ttlivestreamer.core.engine;

import X.C1268530j7D;
import X.C1269300j8S;
import X.C1283100jUi;
import X.C1C7U;
import X.C2188811AlT;
import X.C775050Ual;
import X.C775060Uam;
import X.C786410Ut5;
import X.InterfaceC1268590j7J;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturer;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.mixer.AudioMixer;
import com.ss.ttlivestreamer.core.player.NativeRenderObserver;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AudioDeviceModule extends NativeObject {
    public static String ADM_HARDWARE_AUDIOEFFECT_TABLE = "";
    public static AudioManager sAudioManager;
    public final AtomicInteger admAndSinks;
    public C775060Uam audioFocusChangedCallBackInfo;
    public volatile boolean audioPushStreamEnabled;
    public AudioManager defaultAudioManager;
    public boolean enableAsyncInitByteAudio;
    public boolean enableBatchProcess;
    public volatile boolean isForceEnableAudioPushStream;
    public C1269300j8S logReportService;
    public int mAdmType;
    public NativeAudioEventObserver mAudioEventObserver;
    public volatile AudioMixer mAudioMixer;
    public int mBGMMode;
    public WeakReference<InterfaceC1268590j7J> mCaptureObserver;
    public Context mContext;
    public boolean mDisableAudioStreamForLive;
    public float mEarMonitorVolume;
    public boolean mEnableAudioNoiseDetectionCfg;
    public boolean mEnableAudioSinkStartOpt;
    public boolean mEnableMuteStatusCheck;
    public WeakReference<AudioCapturer> mExtAudioCapture;
    public Handler mHandler;
    public boolean mHardwareEchoMode;
    public boolean mIsSupportHardwareEarback;
    public float mMicVolume;
    public boolean mNativObjReleased;
    public NativeADMObserver mObserver;
    public final TEBundle mParam;
    public List<AudioFocusChangedCallBack> mRecordCallbackList;
    public volatile boolean mRelease;
    public boolean mServerMixStopBaestream;
    public float mSoftwareEarMonitorVolume;
    public boolean mSoftwareEchoMode;
    public boolean mUseFakeAudio;
    public final AtomicBoolean nativeInstanceInited;

    public interface AudioEventObserver {
        void onAudioDeviceCaptureStateChanged(int i, int i2);
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface AudioFocusChangedCallBack {
        void LIZ(List<C775050Ual> list);
    }

    public static class AudioRenderSink extends AudioSink {
        public final Handler LL;
        public volatile boolean LLILLJJLI;
        public volatile boolean LLILLL;
        public boolean LLILZ;
        public volatile boolean LLILZIL;
        public C1269300j8S LLILZLL;
        public AudioDeviceModule LLIZ;

        @Override // com.ss.ttlivestreamer.core.engine.AudioSink
        public final void onNoData() {
        }

        @Override // com.ss.ttlivestreamer.core.engine.NativeObject
        public final synchronized void release() {
            if (this.LLILLJJLI) {
                return;
            }
            this.LLILZIL = false;
            Handler handler = this.LL;
            if (handler != null) {
                Runnable runnable = new Runnable() { // from class: X.0jRR
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                        audioRenderSink.getClass();
                        C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.release$1L");
                        AudioDeviceModule.nativeRenderSinkRelease(audioRenderSink.mNativeObj);
                        audioRenderSink.setNativeObj(0L);
                        audioRenderSink.LLILLJJLI = true;
                        if (audioRenderSink.LLILZ) {
                            audioRenderSink.LLIZ.admAndSinks.decrementAndGet();
                            AudioDeviceModule.tryQuitAdmThread(audioRenderSink.LL, audioRenderSink.LLIZ);
                        }
                        C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.release$1L");
                    }
                };
                if (this.LLILZ) {
                    LLIZLLLIL(handler, runnable);
                } else {
                    C786410Ut5.LJJZZIII(handler, runnable);
                }
            } else {
                AudioDeviceModule.nativeRenderSinkRelease(this.mNativeObj);
                setNativeObj(0L);
                this.LLILLJJLI = true;
            }
        }

        public final void LLJILLL() {
            if (this.LLILZ) {
                runTaskImmediately(this.LL, new Runnable() { // from class: X.0jRQ
                    public final /* synthetic */ AudioDeviceModule.RenderObserver LLILLJJLI = null;

                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                        AudioDeviceModule.RenderObserver renderObserver = this.LLILLJJLI;
                        audioRenderSink.getClass();
                        C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.setRenderObserverImmediately$1L");
                        AudioDeviceModule.nativeRenderSetObserver(audioRenderSink.mNativeObj, renderObserver);
                        C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.setRenderObserverImmediately$1L");
                    }
                });
            } else {
                AudioDeviceModule.nativeRenderSetObserver(this.mNativeObj, null);
            }
        }

        @Override // com.ss.ttlivestreamer.core.engine.NativeObject
        public final long getNativeObj() {
            if (!this.LLILZ || this.LLILZIL) {
                return this.mNativeObj;
            }
            final long[] jArr = new long[1];
            runTaskImmediately(this.LL, new Runnable() { // from class: X.0jRO
                @Override // java.lang.Runnable
                public final void run() {
                    AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                    long[] jArr2 = jArr;
                    audioRenderSink.getClass();
                    C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.getNativeObj$1L");
                    jArr2[0] = audioRenderSink.mNativeObj;
                    C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.getNativeObj$1L");
                }
            });
            return jArr[0];
        }

        public final void pause() {
            Handler handler = this.LL;
            if (handler == null) {
                AudioDeviceModule.nativeRenderSinkPause(this.mNativeObj);
                return;
            }
            Runnable runnable = new Runnable() { // from class: X.0jRa
                @Override // java.lang.Runnable
                public final void run() {
                    AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                    audioRenderSink.getClass();
                    C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.pause$1L");
                    AudioDeviceModule.nativeRenderSinkPause(audioRenderSink.mNativeObj);
                    C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.pause$1L");
                }
            };
            if (this.LLILZ) {
                LLIZLLLIL(handler, runnable);
            } else {
                C786410Ut5.LJJZZIII(handler, runnable);
            }
        }

        public final void resume() {
            Handler handler = this.LL;
            if (handler == null) {
                AudioDeviceModule.nativeRenderSinkResume(this.mNativeObj);
                return;
            }
            Runnable runnable = new Runnable() { // from class: X.0jRZ
                @Override // java.lang.Runnable
                public final void run() {
                    AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                    audioRenderSink.getClass();
                    C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.resume$1L");
                    AudioDeviceModule.nativeRenderSinkResume(audioRenderSink.mNativeObj);
                    C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.resume$1L");
                }
            };
            if (this.LLILZ) {
                LLIZLLLIL(handler, runnable);
            } else {
                C786410Ut5.LJJZZIII(handler, runnable);
            }
        }

        public final void start() {
            if (this.LLILLL) {
                Handler handler = this.LL;
                if (handler == null) {
                    AudioDeviceModule.nativeStartAudioRenderSink(this.mNativeObj);
                    return;
                }
                Runnable runnable = new Runnable() { // from class: X.0jRb
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                        audioRenderSink.getClass();
                        C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.start$1L");
                        AudioDeviceModule.nativeStartAudioRenderSink(audioRenderSink.mNativeObj);
                        C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.start$1L");
                    }
                };
                if (this.LLILZ) {
                    LLIZLLLIL(handler, runnable);
                } else {
                    C786410Ut5.LJJZZIII(handler, runnable);
                }
            }
        }

        public final void stop() {
            if (this.LLILLL && this.LLILLL) {
                Handler handler = this.LL;
                if (handler == null) {
                    AudioDeviceModule.nativeStopAudioRenderSink(this.mNativeObj);
                    return;
                }
                Runnable runnable = new Runnable() { // from class: X.0jRX
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                        audioRenderSink.getClass();
                        C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.stop$1L");
                        AudioDeviceModule.nativeStopAudioRenderSink(audioRenderSink.mNativeObj);
                        C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.stop$1L");
                    }
                };
                if (this.LLILZ) {
                    LLIZLLLIL(handler, runnable);
                } else {
                    C786410Ut5.LJJZZIII(handler, runnable);
                }
            }
        }

        @Override // com.ss.ttlivestreamer.core.engine.NativeObject
        public final void finalize() {
            release();
        }

        public final void LLIZ(final boolean z) {
            Handler handler = this.LL;
            if (handler != null) {
                Runnable runnable = new Runnable() { // from class: X.0jRW
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                        boolean z2 = z;
                        audioRenderSink.getClass();
                        C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.enableOriginMusic$1L");
                        AudioDeviceModule.nativeRenderSinkEnableOrigin(audioRenderSink.mNativeObj, z2);
                        C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.enableOriginMusic$1L");
                    }
                };
                if (this.LLILZ) {
                    LLIZLLLIL(handler, runnable);
                    return;
                } else {
                    C786410Ut5.LJJZZIII(handler, runnable);
                    return;
                }
            }
            AudioDeviceModule.nativeRenderSinkEnableOrigin(this.mNativeObj, z);
        }

        public final boolean LLJ(final int i) {
            if (this.LLILZ && !this.LLILZIL) {
                final boolean[] zArr = new boolean[1];
                runTaskImmediately(this.LL, new Runnable() { // from class: X.0jRU
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                        boolean[] zArr2 = zArr;
                        int i2 = i;
                        audioRenderSink.getClass();
                        C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.seek$1L");
                        zArr2[0] = AudioDeviceModule.nativeRenderSinkSeek(audioRenderSink.mNativeObj, i2);
                        C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.seek$1L");
                    }
                });
                return zArr[0];
            }
            return AudioDeviceModule.nativeRenderSinkSeek(this.mNativeObj, i);
        }

        public final void LLJI(final int i) {
            Runnable runnable = new Runnable() { // from class: X.0jRc
                @Override // java.lang.Runnable
                public final void run() {
                    AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                    int i2 = i;
                    audioRenderSink.getClass();
                    C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.setLoopCount$1L");
                    AudioDeviceModule.nativeRenderSinkSetLoopCount(audioRenderSink.mNativeObj, i2);
                    C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.setLoopCount$1L");
                }
            };
            if (this.LLILZ) {
                LLIZLLLIL(this.LL, runnable);
            } else {
                runnable.run();
            }
        }

        public final void LLJIJIL(final float f) {
            Handler handler = this.LL;
            if (handler != null) {
                Runnable runnable = new Runnable() { // from class: X.0jRS
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                        float f2 = f;
                        audioRenderSink.getClass();
                        C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.setPitch$1L");
                        AudioDeviceModule.nativeRenderSinkSetPitch(audioRenderSink.mNativeObj, f2);
                        C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.setPitch$1L");
                    }
                };
                if (this.LLILZ) {
                    LLIZLLLIL(handler, runnable);
                    return;
                } else {
                    C786410Ut5.LJJZZIII(handler, runnable);
                    return;
                }
            }
            AudioDeviceModule.nativeRenderSinkSetPitch(this.mNativeObj, f);
        }

        public final void LLJILJIL(final long j) {
            Handler handler = this.LL;
            if (handler != null) {
                Runnable runnable = new Runnable() { // from class: X.0jRY
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                        long j2 = j;
                        audioRenderSink.getClass();
                        C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.setQuirks$1L");
                        AudioDeviceModule.nativeRenderSinkSetQuirks(audioRenderSink.mNativeObj, j2);
                        C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.setQuirks$1L");
                    }
                };
                if (this.LLILZ) {
                    LLIZLLLIL(handler, runnable);
                    return;
                } else {
                    C786410Ut5.LJJZZIII(handler, runnable);
                    return;
                }
            }
            AudioDeviceModule.nativeRenderSinkSetQuirks(this.mNativeObj, j);
        }

        public final void LLJILJILJ(final NativeRenderObserver nativeRenderObserver) {
            if (this.LLILZ) {
                LLIZLLLIL(this.LL, new Runnable() { // from class: X.0jRP
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                        AudioDeviceModule.RenderObserver renderObserver = nativeRenderObserver;
                        audioRenderSink.getClass();
                        C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.setRenderObserver$1L");
                        AudioDeviceModule.nativeRenderSetObserver(audioRenderSink.mNativeObj, renderObserver);
                        C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.setRenderObserver$1L");
                    }
                });
            } else {
                AudioDeviceModule.nativeRenderSetObserver(this.mNativeObj, nativeRenderObserver);
            }
        }

        public final void LLJJ(final float f) {
            Handler handler = this.LL;
            if (handler != null) {
                Runnable runnable = new Runnable() { // from class: X.0jRT
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                        float f2 = f;
                        audioRenderSink.getClass();
                        C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.setVolume$1L");
                        AudioDeviceModule.nativeRenderSinkSetVolume(audioRenderSink.mNativeObj, f2);
                        C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.setVolume$1L");
                    }
                };
                if (this.LLILZ) {
                    LLIZLLLIL(handler, runnable);
                    return;
                } else {
                    C786410Ut5.LJJZZIII(handler, runnable);
                    return;
                }
            }
            AudioDeviceModule.nativeRenderSinkSetVolume(this.mNativeObj, f);
        }

        @Override // com.ss.ttlivestreamer.core.engine.NativeObject
        public final void setNativeObj(long j) {
            boolean z;
            super.setNativeObj(j);
            if (j != 0) {
                z = true;
            } else {
                z = false;
            }
            this.LLILZIL = z;
        }

        public final void LLIZLLLIL(Handler handler, final Runnable runnable) {
            if (handler != null && !this.LLILLJJLI) {
                if (C786410Ut5.u3() == handler.getLooper().getThread()) {
                    runnable.run();
                    return;
                } else {
                    C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0jRe
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                            Runnable runnable2 = runnable;
                            audioRenderSink.getClass();
                            C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.runTaskInThread$1L");
                            if (audioRenderSink.LLILLJJLI || audioRenderSink.mNativeObj == 0) {
                                C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.runTaskInThread$1L");
                            } else {
                                runnable2.run();
                                C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.runTaskInThread$1L");
                            }
                        }
                    });
                    return;
                }
            }
            if (this.LLILZ) {
                AudioDeviceModule.reportTrace(this.LLILZLL);
            }
        }

        public final void runTaskImmediately(Handler handler, final Runnable runnable) {
            if (handler != null && !this.LLILLJJLI) {
                C1283100jUi.LIZIZ(handler, new Runnable() { // from class: X.0jRd
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                        Runnable runnable2 = runnable;
                        audioRenderSink.getClass();
                        C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.runTaskImmediately$1L");
                        if (audioRenderSink.LLILLJJLI || audioRenderSink.mNativeObj == 0) {
                            C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.runTaskImmediately$1L");
                        } else {
                            runnable2.run();
                            C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.runTaskImmediately$1L");
                        }
                    }
                });
            } else if (this.LLILZ) {
                AudioDeviceModule.reportTrace(this.LLILZLL);
            }
        }

        public AudioRenderSink(long j, Handler handler, boolean z) {
            setNativeObj(j);
            this.LL = handler;
            this.LLILLL = z;
        }

        @Override // com.ss.ttlivestreamer.core.engine.AudioSink
        public final void onData(final Buffer buffer, final int i, final int i2, final int i3, final long j) {
            if (this.LLILZ && !this.LLILZIL) {
                LLIZLLLIL(this.LL, new Runnable() { // from class: X.0jRV
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioDeviceModule.AudioRenderSink audioRenderSink = this.LL;
                        Buffer buffer2 = buffer;
                        int i4 = i;
                        int i5 = i2;
                        int i6 = i3;
                        long j2 = j;
                        audioRenderSink.getClass();
                        C1C7U.LIZ("AudioDeviceModule$AudioRenderSink@e2e.onData$1L");
                        AudioDeviceModule.nativeRenderSinkData(audioRenderSink.mNativeObj, buffer2, i4, i5, i6, j2);
                        C1C7U.LIZIZ("AudioDeviceModule$AudioRenderSink@e2e.onData$1L");
                    }
                });
            } else {
                AudioDeviceModule.nativeRenderSinkData(this.mNativeObj, buffer, i, i2, i3, j);
            }
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface Observer {
        void onADMInfo(int i, int i2, long j);
    }

    public interface RenderObserver {
        void onBegin();

        void onCompletion();

        void onError(int i);

        void onProgress(long j, int i);

        void onStopped();
    }

    public static /* synthetic */ void lambda$semisugar$nativeInitEarMonitor$0(AudioDeviceModule audioDeviceModule) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.initEarMonitor$1L");
        audioDeviceModule.nativeInitEarMonitor();
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.initEarMonitor$1L");
    }

    private native void nativeAddAudioSink(int i, AudioSink audioSink);

    private native void nativeClearLogState();

    private native long nativeCreateAuxStream(int i, int i2);

    private native long nativeCreateRenderSink(int i, boolean z);

    private native long nativeCreateRenderSinkV2(int i, int i2, int i3, boolean z);

    private native long nativeCreateV2(Context context, int i, String str, boolean z);

    private native void nativeDisableLocalAudioStream(boolean z);

    private native void nativeEnableANS(boolean z);

    private native void nativeEnableAdmObserver(boolean z);

    private native void nativeEnableApmProcess(boolean z);

    private native void nativeEnableAsyncProcess(boolean z);

    private native void nativeEnableAudioNoiseDetection(int i, int i2);

    private native void nativeEnableAudioStrangeVoice(boolean z);

    private native void nativeEnableEchoMode(boolean z);

    private native void nativeEnableHardwareEchoMode(boolean z);

    private native void nativeEnableLocalRecord(boolean z);

    private native void nativeEnableNew3ARmsStatistics(boolean z);

    private native void nativeEnablePlayOutEcho(boolean z);

    private native void nativeEnableRemoteAudio(boolean z);

    private native void nativeEnableSoftwareEchoMode(boolean z);

    private native void nativeFallbackToMicCaptureForScreenAudio(boolean z);

    private native String nativeGetAudioDiagnosisScore();

    private native long nativeGetCaptureTimeDiff();

    private native String nativeGetDiagnosisFinalResult();

    private native long nativeGetLatestAudioPts();

    private native float nativeGetMicVolumedB();

    private native long nativeGetNowTimeDiff();

    private native double nativeGetOption(int i);

    private native TEBundle nativeGetParameter();

    private native long nativeGetRenderMixer();

    private native String nativeGetReportStats();

    private native int nativeGetResetPtsIndex();

    private native void nativeInitEarMonitor();

    private native boolean nativeIsDisableLocalAudioStream();

    private native boolean nativeIsEchoMode();

    private native boolean nativeIsHeadSet();

    private native boolean nativeIsMicMute();

    private native boolean nativeIsMicSilenced();

    private native boolean nativeIsRecoding();

    private native boolean nativeIsResumeStatus();

    private native boolean nativeIsSupportHardwareEarMonitor();

    private native boolean nativeIsSupportSoftwareEarMonitor();

    private native int nativeMicVolume(float f, boolean z);

    private native void nativePushOuterAudioFarend(ByteBuffer byteBuffer, int i, int i2, int i3, long j);

    private native void nativeRegisterObserver(Observer observer);

    private native void nativeRemoveAudioSink(int i, AudioSink audioSink);

    public static native long nativeRenderDelayMs(long j);

    public static native void nativeRenderSetObserver(long j, RenderObserver renderObserver);

    public static native void nativeRenderSinkData(long j, Buffer buffer, int i, int i2, int i3, long j2);

    public static native void nativeRenderSinkEnableAgc(long j, boolean z, boolean z2);

    public static native void nativeRenderSinkEnableOrigin(long j, boolean z);

    public static native void nativeRenderSinkEnableSyncWithVocal(long j, boolean z);

    public static native double nativeRenderSinkGetOption(long j, int i);

    public static native long nativeRenderSinkGetQuirks(long j);

    public static native boolean nativeRenderSinkIsMute(long j);

    public static native void nativeRenderSinkMix2Output(long j, boolean z);

    public static native void nativeRenderSinkPause(long j);

    public static native void nativeRenderSinkRelease(long j);

    public static native void nativeRenderSinkResume(long j);

    public static native boolean nativeRenderSinkSeek(long j, int i);

    public static native void nativeRenderSinkSetLoopCount(long j, int i);

    public static native void nativeRenderSinkSetMute(long j, boolean z);

    public static native void nativeRenderSinkSetPitch(long j, float f);

    public static native void nativeRenderSinkSetPlayerVolume(long j, float f);

    public static native void nativeRenderSinkSetQuirks(long j, long j2);

    public static native void nativeRenderSinkSetVolume(long j, float f);

    public static native int nativeRenderSinkTrackId(long j);

    public static native boolean nativeRenderSinkisEnableAgc(long j);

    private native void nativeResumeStatus(boolean z);

    private native void nativeSetAudioCaptureMute(boolean z);

    private native void nativeSetAudioCaptureVolume(float f);

    private native void nativeSetAudioEventObserver(AudioEventObserver audioEventObserver);

    public static native void nativeSetAudioFilePath(long j, String str, String str2);

    private native void nativeSetAudioLiveScene(int i);

    public static native void nativeSetAudioLoudNormParam(long j, float f);

    private native void nativeSetAudioQuantizeGapPeriod(long j);

    private native void nativeSetAudioScenario(int i);

    private native void nativeSetAudioScreenVolume(float f);

    private native void nativeSetAudioStrangeResource(String str, String str2);

    private native void nativeSetDiagnosisModelPath(Object obj);

    private native int nativeSetHardwareEarMonitorVolume(float f);

    private native void nativeSetInAnchorNet(boolean z);

    private native void nativeSetInputStreamMute(boolean z);

    private native void nativeSetInputStreamVolume(float f);

    private native void nativeSetParameter(TEBundle tEBundle);

    private native void nativeSetRecordingCallback(AudioSink audioSink);

    private native int nativeSetSoftwareEarMonitorVolume(float f);

    private native void nativeSetTimeSyncMode(int i);

    private native void nativeSetTuningName(Object obj);

    private native void nativeSetTuningType(int i, Object obj);

    public static native void nativeStartAudioRenderSink(long j);

    private native int nativeStartPlayer();

    private native int nativeStartRecording();

    public static native void nativeStopAudioRenderSink(long j);

    private native int nativeStopRecording();

    private native void nativeUpdateOriginTrackIndex(int i);

    public synchronized void disableAudioStreamForLive() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("disableAudioStreamForLive, enableAsyncInitByteAudio:");
        sbLIZ.append(this.enableAsyncInitByteAudio);
        AVLog.logKibana(5, "AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ), null);
        if (!this.mRelease) {
            this.mDisableAudioStreamForLive = true;
            nativeStopRecording();
        }
    }

    public synchronized JSONObject getAudioDiagnosisScore() {
        return null;
    }

    public synchronized long getCaptureTimeDiff() {
        if (this.enableAsyncInitByteAudio && !this.nativeInstanceInited.get()) {
            final long[] jArr = new long[1];
            runTaskImmediately(this.mHandler, new Runnable() { // from class: X.0jSR
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$getCaptureTimeDiff$49(jArr);
                }
            });
            return jArr[0];
        }
        if (this.mRelease || this.mNativeObj == 0) {
            return 0L;
        }
        return nativeGetCaptureTimeDiff();
    }

    public synchronized String getDiagnosisFinalResult() {
        if (this.enableAsyncInitByteAudio && !this.nativeInstanceInited.get()) {
            return "";
        }
        if (this.mRelease || this.mNativeObj == 0) {
            return "";
        }
        return nativeGetDiagnosisFinalResult();
    }

    public synchronized long getLatestAudioPts() {
        if (this.enableAsyncInitByteAudio && !this.nativeInstanceInited.get()) {
            final long[] jArr = new long[1];
            runTaskImmediately(this.mHandler, new Runnable() { // from class: X.0jSG
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$getLatestAudioPts$48(jArr);
                }
            });
            return jArr[0];
        }
        if (this.mRelease || this.mNativeObj == 0) {
            return 0L;
        }
        return nativeGetLatestAudioPts();
    }

    public synchronized long getNowTimeDiff() {
        if (this.enableAsyncInitByteAudio && !this.nativeInstanceInited.get()) {
            final long[] jArr = new long[1];
            runTaskImmediately(this.mHandler, new Runnable() { // from class: X.0jS8
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$getNowTimeDiff$50(jArr);
                }
            });
            return jArr[0];
        }
        if (this.mRelease || this.mNativeObj == 0) {
            return 0L;
        }
        return nativeGetNowTimeDiff();
    }

    public synchronized AudioMixer getRenderMixer() {
        if (this.mAudioMixer == null) {
            if (!this.enableAsyncInitByteAudio || this.nativeInstanceInited.get()) {
                this.mAudioMixer = new InteralAudioMixer(nativeGetRenderMixer());
            } else {
                final AudioMixer[] audioMixerArr = new AudioMixer[1];
                runTaskImmediately(this.mHandler, new Runnable() { // from class: X.0jSH
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.LL.lambda$getRenderMixer$13(audioMixerArr);
                    }
                });
                this.mAudioMixer = audioMixerArr[0];
            }
        }
        return this.mAudioMixer;
    }

    public synchronized JSONObject getReportJsonStats() {
        JSONObject jSONObject = new JSONObject();
        if (this.enableAsyncInitByteAudio && !this.nativeInstanceInited.get()) {
            return jSONObject;
        }
        if (this.mRelease) {
            return jSONObject;
        }
        String strNativeGetReportStats = nativeGetReportStats();
        int admType = getAdmType();
        try {
            if (!TextUtils.isEmpty(strNativeGetReportStats)) {
                try {
                    jSONObject = new JSONObject(strNativeGetReportStats);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    jSONObject.put("adm_native_exp_error", strNativeGetReportStats);
                }
            }
            jSONObject.put("adm_type", admType);
            jSONObject.put("is_mute", nativeIsMicMute());
            jSONObject.put("is_silenced", nativeIsMicSilenced());
            jSONObject.put("is_paused", !nativeIsResumeStatus());
            jSONObject.put("mic_volume", this.mMicVolume);
            jSONObject.put("echo_volume", this.mEarMonitorVolume);
            jSONObject.put("is_support_hardware_earback", this.mIsSupportHardwareEarback);
            if (admType == 0) {
                try {
                    synchronized (this.mParam) {
                        try {
                            String string = this.mParam.contains("adm_recording_type") ? this.mParam.getString("adm_recording_type") : "opensles";
                            String string2 = this.mParam.contains("adm_player_type") ? this.mParam.getString("adm_player_type") : "opensles";
                            jSONObject.put("adm_recording_type", string);
                            jSONObject.put("adm_player_type", string2);
                        } finally {
                        }
                    }
                } catch (JSONException th) {
                    return jSONObject;
                }
            }
            return jSONObject;
        } catch (JSONException th2) {
            return jSONObject;
        }
    }

    public synchronized int getResetPtsIndex() {
        if (this.enableAsyncInitByteAudio && !this.nativeInstanceInited.get()) {
            final int[] iArr = new int[1];
            runTaskImmediately(this.mHandler, new Runnable() { // from class: X.0jRv
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$getResetPtsIndex$47(iArr);
                }
            });
            return iArr[0];
        }
        if (this.mRelease || this.mNativeObj == 0) {
            return 0;
        }
        return nativeGetResetPtsIndex();
    }

    public synchronized boolean isEchoMode() {
        if (this.enableAsyncInitByteAudio && !this.nativeInstanceInited.get()) {
            return this.mHardwareEchoMode || this.mSoftwareEchoMode;
        }
        if (this.mRelease || this.mNativeObj == 0) {
            return false;
        }
        return nativeIsEchoMode();
    }

    public synchronized boolean isSupportHardWareEarMonitor() {
        if (this.enableAsyncInitByteAudio && !this.nativeInstanceInited.get()) {
            final boolean[] zArr = new boolean[1];
            runTaskImmediately(this.mHandler, new Runnable() { // from class: X.0jSC
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$isSupportHardWareEarMonitor$25(zArr);
                }
            });
            return zArr[0];
        }
        if (this.mRelease || this.mNativeObj == 0) {
            return false;
        }
        return nativeIsSupportHardwareEarMonitor();
    }

    public synchronized boolean isSupportSoftWareEarMonitor() {
        if (this.enableAsyncInitByteAudio && !this.nativeInstanceInited.get()) {
            final boolean[] zArr = new boolean[1];
            runTaskImmediately(this.mHandler, new Runnable() { // from class: X.0jSD
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$isSupportSoftWareEarMonitor$26(zArr);
                }
            });
            return zArr[0];
        }
        if (this.mRelease || this.mNativeObj == 0) {
            return false;
        }
        return nativeIsSupportSoftwareEarMonitor();
    }

    public native void nativeEnableAudioPushStream(boolean z);

    public native void nativeRelease();

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        Runnable runnable = new Runnable() { // from class: X.0jSK
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$release$37();
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public int startPlayer() {
        return 0;
    }

    public synchronized int stopRecordingOnCurrentThread() {
        if (this.mRelease) {
            return 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopRecordingOnCurrentThread: ");
        sbLIZ.append(this.mNativObjReleased);
        AVLog.iow("AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.mNativObjReleased) {
            Runnable runnable = new Runnable() { // from class: X.0jSL
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$stopRecordingOnCurrentThread$34();
                }
            };
            if (this.enableAsyncInitByteAudio) {
                runTaskInThread(this.mHandler, runnable);
            } else {
                runnable.run();
            }
        }
        return 0;
    }

    public class InteralAudioMixer extends AudioMixer {
        @Override // com.ss.ttlivestreamer.core.mixer.Mixer
        public final void setOriginTrackIndex(int i) {
        }

        @Override // com.ss.ttlivestreamer.core.mixer.Mixer
        public final boolean enable() {
            return super.enable();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.ss.ttlivestreamer.core.mixer.Mixer
        public final void setEnable(boolean z) {
            super.setEnable(z);
            NativeADMObserver nativeADMObserver = AudioDeviceModule.this.mObserver;
            if (nativeADMObserver != null) {
                nativeADMObserver.onADMInfo(4, enable() ? 1 : 0, 0L);
            }
        }

        public InteralAudioMixer(long j) {
            super(j);
        }
    }

    private void checkMicrophoneMuteStatus() {
        AudioManager audioManager;
        if (this.mAdmType == 1 && this.mEnableMuteStatusCheck) {
            if (this.enableBatchProcess) {
                audioManager = this.defaultAudioManager;
            } else {
                Context context = this.mContext;
                if (context == null) {
                    return;
                } else {
                    audioManager = (AudioManager) C786410Ut5.H2(context, "audio");
                }
            }
            if (audioManager == null || !audioManager.isMicrophoneMute()) {
                return;
            }
            AVLog.logKibanaEvent(5, "AudioDeviceModule", "hardware_micphone_muted", false, null, null);
            audioManager.setMicrophoneMute(false);
        }
    }

    public static boolean isMicMute() {
        AudioManager audioManager = sAudioManager;
        if (audioManager != null) {
            return audioManager.isMicrophoneMute();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearLogState$45() {
        C1C7U.LIZ("AudioDeviceModule@a1ed.clearLogState$1L");
        nativeClearLogState();
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.clearLogState$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pause$39() {
        C1C7U.LIZ("AudioDeviceModule@a1ed.pause$1L");
        nativeResumeStatus(false);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.pause$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$37() {
        C1C7U.LIZ("AudioDeviceModule@a1ed.release$1L");
        if (!this.nativeInstanceInited.get()) {
            C1C7U.LIZIZ("AudioDeviceModule@a1ed.release$1L");
            return;
        }
        this.nativeInstanceInited.set(false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("++yr release.... AdmType: ");
        sbLIZ.append(this.mAdmType);
        sbLIZ.append(", UseFakeAudio: ");
        sbLIZ.append(this.mUseFakeAudio);
        AVLog.w("AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ));
        Handler handler = this.mHandler;
        if (handler == null || handler.getLooper().getThread() == C786410Ut5.u3()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("release ADM ");
            sbLIZ2.append(this);
            AVLog.ioi("AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            String name = this.mHandler.getLooper().getThread().getName();
            String name2 = C786410Ut5.u3().getName();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("release ADM ");
            sbLIZ3.append(this);
            sbLIZ3.append(" on thread \"");
            sbLIZ3.append(name2);
            sbLIZ3.append("\", handler's thread is \"");
            sbLIZ3.append(name);
            sbLIZ3.append("\", stack: ");
            AVLog.logToIODeviceInternal(4, "AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ3), new Throwable());
        }
        if (this.mAudioMixer != null) {
            this.mAudioMixer.release();
            this.mAudioMixer = null;
        }
        nativeRegisterObserver(null);
        Runnable runnable = new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.1
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AudioDeviceModule@a1ed.release$1L$1");
                try {
                    AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                    audioDeviceModule.mNativObjReleased = true;
                    audioDeviceModule.nativeRelease();
                    AudioDeviceModule.this.setNativeObj(0L);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AudioDeviceModule@a1ed.release$1L$1");
            }
        };
        if (this.mContext != null) {
            this.mContext = null;
        }
        NativeADMObserver nativeADMObserver = this.mObserver;
        if (nativeADMObserver != null) {
            nativeADMObserver.release();
        }
        if (!runTaskInThread(this.mHandler, runnable)) {
            nativeRelease();
            setNativeObj(0L);
        }
        this.admAndSinks.decrementAndGet();
        this.mParam.release();
        this.mRelease = true;
        tryQuitAdmThread(this.mHandler, this);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.release$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resume$40() {
        C1C7U.LIZ("AudioDeviceModule@a1ed.resume$1L");
        nativeResumeStatus(true);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.resume$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecording$29() {
        InterfaceC1268590j7J interfaceC1268590j7J;
        C1C7U.LIZ("AudioDeviceModule@a1ed.startRecording$1L");
        checkMicrophoneMuteStatus();
        if (this.mDisableAudioStreamForLive) {
            C1C7U.LIZIZ("AudioDeviceModule@a1ed.startRecording$1L");
            return;
        }
        int iNativeStartRecording = nativeStartRecording();
        if (iNativeStartRecording != 0 && (interfaceC1268590j7J = this.mCaptureObserver.get()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ADM start recording failed: ");
            sbLIZ.append(iNativeStartRecording);
            interfaceC1268590j7J.LJJJJLI(iNativeStartRecording, new Exception(C2188811AlT.LIZIZ(sbLIZ)));
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.startRecording$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopRecording$33() {
        C1C7U.LIZ("AudioDeviceModule@a1ed.stopRecording$1L");
        if (!this.mRelease) {
            nativeStopRecording();
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.stopRecording$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopRecordingOnCurrentThread$34() {
        C1C7U.LIZ("AudioDeviceModule@a1ed.stopRecordingOnCurrentThread$1L");
        nativeStopRecording();
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.stopRecordingOnCurrentThread$1L");
    }

    public void clearLogState() {
        Runnable runnable = new Runnable() { // from class: X.0jSB
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$clearLogState$45();
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public AudioRenderSink createRenderSink() {
        if (this.mUseFakeAudio) {
            return null;
        }
        return createRenderSink(0);
    }

    public float getMicVolumedB() {
        if (!this.enableAsyncInitByteAudio || this.nativeInstanceInited.get()) {
            return (float) getOption(3);
        }
        return -1.0f;
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public long getNativeObj() {
        if (!this.enableAsyncInitByteAudio || this.nativeInstanceInited.get()) {
            return super.getNativeObj();
        }
        final long[] jArr = new long[1];
        runTaskImmediately(this.mHandler, new Runnable() { // from class: X.0jSQ
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$getNativeObj$2(jArr);
            }
        });
        return jArr[0];
    }

    public TEBundle getParameter() {
        if (this.enableAsyncInitByteAudio && !this.nativeInstanceInited.get()) {
            final TEBundle[] tEBundleArr = new TEBundle[1];
            runTaskImmediately(this.mHandler, new Runnable() { // from class: X.0jS7
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$getParameter$28(tEBundleArr);
                }
            });
            return tEBundleArr[0];
        }
        TEBundle tEBundleNativeGetParameter = nativeGetParameter();
        synchronized (this.mParam) {
            try {
                this.mParam.updateFrom(tEBundleNativeGetParameter);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return tEBundleNativeGetParameter;
    }

    public void initEarMonitor() {
        runTaskInThread(this.mHandler, new Runnable() { // from class: X.0jSW
            @Override // java.lang.Runnable
            public final void run() {
                AudioDeviceModule.lambda$semisugar$nativeInitEarMonitor$0(this.LL);
            }
        });
    }

    public boolean isDisableLocalAudioStream() {
        if (!this.enableAsyncInitByteAudio || this.nativeInstanceInited.get()) {
            return nativeIsDisableLocalAudioStream();
        }
        final boolean[] zArr = new boolean[1];
        runTaskImmediately(this.mHandler, new Runnable() { // from class: X.0jS4
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$isDisableLocalAudioStream$32(zArr);
            }
        });
        return zArr[0];
    }

    public boolean isHeadSet() {
        if (this.enableAsyncInitByteAudio && !this.nativeInstanceInited.get()) {
            final boolean[] zArr = new boolean[1];
            runTaskImmediately(this.mHandler, new Runnable() { // from class: X.0jS9
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$isHeadSet$0(zArr);
                }
            });
            return zArr[0];
        }
        if (this.mRelease || this.mNativeObj == 0) {
            return false;
        }
        return nativeIsHeadSet();
    }

    public boolean isMicOccupiedSilenced() {
        if (!this.enableAsyncInitByteAudio || this.nativeInstanceInited.get()) {
            return nativeIsMicSilenced();
        }
        final boolean[] zArr = new boolean[1];
        runTaskImmediately(this.mHandler, new Runnable() { // from class: X.0jSI
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$isMicOccupiedSilenced$30(zArr);
            }
        });
        return zArr[0];
    }

    public boolean isMute() {
        if (!this.enableAsyncInitByteAudio || this.nativeInstanceInited.get()) {
            return nativeIsMicMute();
        }
        final boolean[] zArr = new boolean[1];
        runTaskImmediately(this.mHandler, new Runnable() { // from class: X.0jRs
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$isMute$8(zArr);
            }
        });
        return zArr[0];
    }

    public boolean isRecording() {
        if (!this.enableAsyncInitByteAudio || this.nativeInstanceInited.get()) {
            return nativeIsRecoding();
        }
        final boolean[] zArr = new boolean[1];
        runTaskImmediately(this.mHandler, new Runnable() { // from class: X.0jRx
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$isRecording$35(zArr);
            }
        });
        return zArr[0];
    }

    public void pause() {
        Runnable runnable = new Runnable() { // from class: X.0jSl
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$pause$39();
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        }
    }

    public void resume() {
        Runnable runnable = new Runnable() { // from class: X.0jSY
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$resume$40();
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        }
    }

    public int startRecording() {
        AVLog.logKibana(5, "AudioDeviceModule", "startRecording", null);
        Runnable runnable = new Runnable() { // from class: X.0jSZ
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$startRecording$29();
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
            return 0;
        }
        C786410Ut5.LJJZZIII(this.mHandler, runnable);
        return 0;
    }

    public int stopRecording() {
        Runnable runnable = new Runnable() { // from class: X.0jSb
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$stopRecording$33();
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
            return 0;
        }
        C786410Ut5.LJJZZIII(this.mHandler, runnable);
        return 0;
    }

    public int getAdmType() {
        return this.mAdmType;
    }

    /* JADX INFO: loaded from: classes13.dex */
    public class NativeADMObserver extends NativeObject implements Observer {
        public Observer LL;

        @Override // com.ss.ttlivestreamer.core.engine.NativeObject
        public final synchronized void release() {
            this.LL = null;
            super.release();
        }

        public void recordCallBack(String str) {
            try {
                List<C775050Ual> list = AudioDeviceModule.this.audioFocusChangedCallBackInfo.LIZ;
                if (list == null) {
                    return;
                }
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                    JSONObjectProtectorUtils.getInt(jSONObject, "audioSessionId");
                    JSONObjectProtectorUtils.getInt(jSONObject, "clientAudioSource");
                    JSONObjectProtectorUtils.getInt(jSONObject, "audioSource");
                    ((ArrayList) list).add(new C775050Ual(JSONObjectProtectorUtils.getInt(jSONObject, "isClientSilenced"), JSONObjectProtectorUtils.getInt(jSONObject, "isBySelf")));
                }
                Iterator<AudioFocusChangedCallBack> it2 = AudioDeviceModule.this.mRecordCallbackList.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(list);
                }
                ((ArrayList) list).clear();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }

        public NativeADMObserver(Observer observer) {
            this.LL = observer;
        }

        @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.Observer
        public void onADMInfo(int i, int i2, long j) {
            if (C1268530j7D.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AudioDeviceModule.java onADMInfo ");
                sbLIZ.append(i);
                sbLIZ.append(" ");
                sbLIZ.append(i2);
                sbLIZ.append(" ");
                sbLIZ.append(j);
                AVLog.d("AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ));
            }
            Observer observer = this.LL;
            if (observer != null) {
                observer.onADMInfo(i, i2, j);
            }
            if (i == 10) {
                if (j == 1) {
                    AudioDeviceModule.this.mIsSupportHardwareEarback = true;
                } else {
                    if (j != 0) {
                        return;
                    }
                    AudioDeviceModule.this.mIsSupportHardwareEarback = false;
                }
            }
        }
    }

    private void enableEchoModeInternal(final boolean z) {
        Runnable runnable = new Runnable() { // from class: X.0jS5
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$enableEchoModeInternal$17(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void enableHardwareEchoModeInternal(boolean z) {
        this.mHardwareEchoMode = z;
        nativeEnableHardwareEchoMode(z);
        NativeADMObserver nativeADMObserver = this.mObserver;
        if (nativeADMObserver != null) {
            nativeADMObserver.onADMInfo(3, isEchoMode() ? 1 : 0, 0L);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void enableSoftwareEchoModeInternal(boolean z) {
        this.mSoftwareEchoMode = z;
        nativeEnableSoftwareEchoMode(z);
        NativeADMObserver nativeADMObserver = this.mObserver;
        if (nativeADMObserver != null) {
            nativeADMObserver.onADMInfo(3, isEchoMode() ? 1 : 0, 0L);
        }
    }

    public static boolean isValidAdmApiType(String str) {
        if (str != null && !str.equalsIgnoreCase("opensles") && !str.equalsIgnoreCase("aaudio") && !str.equalsIgnoreCase("audiorecord")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$disableLocalAudioStream$31(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.disableLocalAudioStream$1L");
        nativeDisableLocalAudioStream(z);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.disableLocalAudioStream$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableANS$65(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.enableANS$1L");
        if (!this.mRelease) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enableANS: ");
            sbLIZ.append(z);
            AVLog.logKibana(5, "AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ), null);
            nativeEnableANS(z);
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.enableANS$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableAdmObserver$57(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.enableAdmObserver$1L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableAdmObserver: ");
        sbLIZ.append(z);
        AVLog.logKibana(5, "AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ), null);
        nativeEnableAdmObserver(z);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.enableAdmObserver$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableApmProcess$59(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.enableApmProcess$1L");
        if (!this.mRelease) {
            nativeEnableApmProcess(z);
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.enableApmProcess$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableAsyncProcess$58(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.enableAsyncProcess$1L");
        if (!this.mRelease) {
            nativeEnableAsyncProcess(z);
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.enableAsyncProcess$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableAudioPushStream$56(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.enableAudioPushStream$1L");
        if (!this.mRelease) {
            this.audioPushStreamEnabled = z;
            if (!this.isForceEnableAudioPushStream) {
                nativeEnableAudioPushStream(this.audioPushStreamEnabled);
            }
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.enableAudioPushStream$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableAudioStrangeVoice$62(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.enableAudioStrangeVoice$1L");
        if (!this.mRelease) {
            nativeEnableAudioStrangeVoice(z);
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.enableAudioStrangeVoice$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableEchoMode$18(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.enableEchoMode$1L");
        enableEchoModeInternal(z);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.enableEchoMode$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public /* synthetic */ void lambda$enableEchoModeInternal$17(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.enableEchoModeInternal$1L");
        nativeEnableEchoMode(z);
        NativeADMObserver nativeADMObserver = this.mObserver;
        if (nativeADMObserver != null) {
            nativeADMObserver.onADMInfo(3, isEchoMode() ? 1 : 0, 0L);
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.enableEchoModeInternal$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableHardwareEchoMode$19(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.enableHardwareEchoMode$1L");
        enableHardwareEchoModeInternal(z);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.enableHardwareEchoMode$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableLocalRecord$23(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.enableLocalRecord$1L");
        nativeEnableLocalRecord(z);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.enableLocalRecord$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableNew3ARmsStatistics$15(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.enableNew3ARmsStatistics$1L");
        nativeEnableNew3ARmsStatistics(z);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.enableNew3ARmsStatistics$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enablePlayOutEcho$20(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.enablePlayOutEcho$1L");
        nativeEnablePlayOutEcho(z);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.enablePlayOutEcho$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableRemoteAudio$24(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.enableRemoteAudio$1L");
        nativeEnableRemoteAudio(z);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.enableRemoteAudio$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableSoftwareEchoMode$21(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.enableSoftwareEchoMode$1L");
        enableSoftwareEchoModeInternal(z);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.enableSoftwareEchoMode$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fallbackToMicCaptureForScreenAudio$60(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.fallbackToMicCaptureForScreenAudio$1L");
        if (!this.mRelease) {
            nativeFallbackToMicCaptureForScreenAudio(z);
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.fallbackToMicCaptureForScreenAudio$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCaptureTimeDiff$49(long[] jArr) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.getCaptureTimeDiff$1L");
        jArr[0] = nativeGetCaptureTimeDiff();
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.getCaptureTimeDiff$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getLatestAudioPts$48(long[] jArr) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.getLatestAudioPts$1L");
        jArr[0] = nativeGetLatestAudioPts();
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.getLatestAudioPts$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getNativeObj$2(long[] jArr) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.getNativeObj$1L");
        jArr[0] = this.mNativeObj;
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.getNativeObj$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getNowTimeDiff$50(long[] jArr) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.getNowTimeDiff$1L");
        jArr[0] = nativeGetNowTimeDiff();
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.getNowTimeDiff$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getParameter$28(TEBundle[] tEBundleArr) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.getParameter$1L");
        tEBundleArr[0] = nativeGetParameter();
        synchronized (this.mParam) {
            try {
                this.mParam.updateFrom(tEBundleArr[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.getParameter$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getRenderMixer$13(AudioMixer[] audioMixerArr) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.getRenderMixer$1L");
        if (this.mAudioMixer == null) {
            audioMixerArr[0] = new InteralAudioMixer(nativeGetRenderMixer());
        } else {
            audioMixerArr[0] = this.mAudioMixer;
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.getRenderMixer$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getResetPtsIndex$47(int[] iArr) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.getResetPtsIndex$1L");
        iArr[0] = nativeGetResetPtsIndex();
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.getResetPtsIndex$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isDisableLocalAudioStream$32(boolean[] zArr) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.isDisableLocalAudioStream$1L");
        zArr[0] = nativeIsDisableLocalAudioStream();
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.isDisableLocalAudioStream$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isHeadSet$0(boolean[] zArr) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.isHeadSet$1L");
        zArr[0] = nativeIsHeadSet();
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.isHeadSet$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isMicOccupiedSilenced$30(boolean[] zArr) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.isMicOccupiedSilenced$1L");
        zArr[0] = nativeIsMicSilenced();
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.isMicOccupiedSilenced$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isMute$8(boolean[] zArr) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.isMute$1L");
        zArr[0] = nativeIsMicMute();
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.isMute$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isRecording$35(boolean[] zArr) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.isRecording$1L");
        zArr[0] = nativeIsRecoding();
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.isRecording$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isSupportHardWareEarMonitor$25(boolean[] zArr) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.isSupportHardWareEarMonitor$1L");
        zArr[0] = nativeIsSupportHardwareEarMonitor();
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.isSupportHardWareEarMonitor$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$isSupportSoftWareEarMonitor$26(boolean[] zArr) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.isSupportSoftWareEarMonitor$1L");
        zArr[0] = nativeIsSupportSoftwareEarMonitor();
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.isSupportSoftWareEarMonitor$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runTaskImmediately$68(Runnable runnable) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.runTaskImmediately$1L");
        if (!this.mRelease && this.mNativeObj != 0) {
            runnable.run();
            C1C7U.LIZIZ("AudioDeviceModule@a1ed.runTaskImmediately$1L");
        } else {
            C1C7U.LIZIZ("AudioDeviceModule@a1ed.runTaskImmediately$1L");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runTaskInThread$67(Runnable runnable) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.runTaskInThread$1L");
        if (!this.mRelease && this.mNativeObj != 0) {
            runnable.run();
            C1C7U.LIZIZ("AudioDeviceModule@a1ed.runTaskInThread$1L");
        } else {
            C1C7U.LIZIZ("AudioDeviceModule@a1ed.runTaskInThread$1L");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAudioCaptureMute$53(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setAudioCaptureMute$1L");
        nativeSetAudioCaptureMute(z);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setAudioCaptureMute$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAudioCaptureVolume$52(float f) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setAudioCaptureVolume$1L");
        nativeSetAudioCaptureVolume(f);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setAudioCaptureVolume$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAudioEventObserver$16(AudioEventObserver audioEventObserver) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setAudioEventObserver$1L");
        if (audioEventObserver != null) {
            NativeAudioEventObserver nativeAudioEventObserver = this.mAudioEventObserver;
            if (nativeAudioEventObserver == null) {
                NativeAudioEventObserver nativeAudioEventObserver2 = new NativeAudioEventObserver(audioEventObserver);
                this.mAudioEventObserver = nativeAudioEventObserver2;
                nativeSetAudioEventObserver(nativeAudioEventObserver2);
            } else {
                nativeAudioEventObserver.LL = audioEventObserver;
            }
        } else if (this.mAudioEventObserver != null) {
            nativeSetAudioEventObserver(null);
            this.mAudioEventObserver.release();
            this.mAudioEventObserver = null;
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setAudioEventObserver$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAudioLiveScene$64(int i) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setAudioLiveScene$1L");
        if (!this.mRelease) {
            nativeSetAudioLiveScene(i);
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setAudioLiveScene$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAudioQuantizeGapPeriod$6(long j) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setAudioQuantizeGapPeriod$1L");
        nativeSetAudioQuantizeGapPeriod(j);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setAudioQuantizeGapPeriod$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAudioScenario$9(int i) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setAudioScenario$1L");
        nativeSetAudioScenario(i);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setAudioScenario$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAudioScreenVolume$51(float f) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setAudioScreenVolume$1L");
        nativeSetAudioScreenVolume(f);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setAudioScreenVolume$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDiagnosisModelPath$22(String str) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setDiagnosisModelPath$1L");
        nativeSetDiagnosisModelPath(str);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setDiagnosisModelPath$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setHardwareEarMonitorVolume$3(float f) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setHardwareEarMonitorVolume$1L");
        nativeSetHardwareEarMonitorVolume(f);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setHardwareEarMonitorVolume$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setInAnchorNet$63(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setInAnchorNet$1L");
        if (!this.mRelease) {
            nativeSetInAnchorNet(z);
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setInAnchorNet$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setInputStreamMute$54(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setInputStreamMute$1L");
        nativeSetInputStreamMute(z);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setInputStreamMute$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setInputStreamVolume$55(float f) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setInputStreamVolume$1L");
        nativeSetInputStreamVolume(f);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setInputStreamVolume$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMicMute$7(boolean z) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setMicMute$1L");
        nativeMicVolume(this.mMicVolume, z);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setMicMute$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMicVolume$1(float f) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setMicVolume$1L");
        nativeMicVolume(f, nativeIsMicMute());
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setMicVolume$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setRecordingCallack$36(AudioSink audioSink) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setRecordingCallack$1L");
        nativeSetRecordingCallback(audioSink);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setRecordingCallack$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSoftwareEarMonitorVolume$4(float f) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setSoftwareEarMonitorVolume$1L");
        nativeSetSoftwareEarMonitorVolume(f);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setSoftwareEarMonitorVolume$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTimeSyncMode$46(int i) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setTimeSyncMode$1L");
        nativeSetTimeSyncMode(i);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setTimeSyncMode$1L");
    }

    public static /* synthetic */ void lambda$tryQuitAdmThread$38(Handler handler) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.tryQuitAdmThread$1L");
        handler.getLooper().quitSafely();
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.tryQuitAdmThread$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateOriginTrackIndex$14(int i) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.updateOriginTrackIndex$1L");
        nativeUpdateOriginTrackIndex(i);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.updateOriginTrackIndex$1L");
    }

    public static void reportTrace(C1269300j8S c1269300j8S) {
        if (c1269300j8S != null) {
            try {
                c1269300j8S.LIZ("ttlh_init_opt", "async_init_adm", Arrays.toString(new AndroidRuntimeException("runTaskInThread").getStackTrace()), null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    private void updateOriginTrackIndex(final int i) {
        Runnable runnable = new Runnable() { // from class: X.0jRw
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$updateOriginTrackIndex$14(i);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public AudioRenderSink createRenderSink(final int i) {
        if (this.mUseFakeAudio) {
            return null;
        }
        if (this.enableAsyncInitByteAudio) {
            final AudioRenderSink audioRenderSink = new AudioRenderSink(0L, this.mHandler, this.mEnableAudioSinkStartOpt);
            audioRenderSink.LLILZLL = this.logReportService;
            audioRenderSink.LLILZ = true;
            audioRenderSink.LLIZ = this;
            this.admAndSinks.incrementAndGet();
            runTaskInThread(this.mHandler, new Runnable() { // from class: X.0jRz
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$createRenderSink$11(audioRenderSink, i);
                }
            });
            return audioRenderSink;
        }
        return new AudioRenderSink(nativeCreateRenderSink(i, this.mEnableAudioSinkStartOpt), this.mHandler, this.mEnableAudioSinkStartOpt);
    }

    public void disableLocalAudioStream(final boolean z) {
        Runnable runnable = new Runnable() { // from class: X.0jSN
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$disableLocalAudioStream$31(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void enableANS(final boolean z) {
        Handler handler = this.mHandler;
        if (handler != null && this.mEnableAudioNoiseDetectionCfg) {
            Runnable runnable = new Runnable() { // from class: X.0jSh
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$enableANS$65(z);
                }
            };
            if (this.enableAsyncInitByteAudio) {
                runTaskInThread(handler, runnable);
            } else {
                C786410Ut5.LJJZZIII(handler, runnable);
            }
        }
    }

    public void enableAdmObserver(final boolean z) {
        Runnable runnable = new Runnable() { // from class: X.0jS0
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$enableAdmObserver$57(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void enableApmProcess(final boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableApmProcess:");
        sbLIZ.append(z);
        AVLog.logKibana(5, "AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ), null);
        Runnable runnable = new Runnable() { // from class: X.0jSg
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$enableApmProcess$59(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        }
    }

    public void enableAsyncProcess(final boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableAsyncProcess: ");
        sbLIZ.append(z);
        AVLog.logKibana(5, "AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ), null);
        Handler handler = this.mHandler;
        if (handler != null) {
            Runnable runnable = new Runnable() { // from class: X.0jSV
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$enableAsyncProcess$58(z);
                }
            };
            if (this.enableAsyncInitByteAudio) {
                runTaskInThread(handler, runnable);
                return;
            } else {
                C786410Ut5.LJJZZIII(handler, runnable);
                return;
            }
        }
        nativeEnableAsyncProcess(z);
    }

    public void enableAudioNoiseDetectionCfg(boolean z) {
        this.mEnableAudioNoiseDetectionCfg = z;
    }

    public synchronized void enableAudioPushStream(final boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableAudioPushStream:");
        sbLIZ.append(z);
        sbLIZ.append(",cfg:");
        sbLIZ.append(this.mServerMixStopBaestream);
        AVLog.logKibana(5, "AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ), null);
        if (this.mServerMixStopBaestream && !this.mRelease) {
            Runnable runnable = new Runnable() { // from class: X.0jSS
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$enableAudioPushStream$56(z);
                }
            };
            if (this.enableAsyncInitByteAudio) {
                runTaskInThread(this.mHandler, runnable);
            } else {
                C786410Ut5.LJJZZIII(this.mHandler, runnable);
            }
        }
    }

    public void enableAudioSinkStartOpt(boolean z) {
        this.mEnableAudioSinkStartOpt = z;
    }

    public synchronized void enableAudioStrangeVoice(final boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableAudioStrangeVoice: ");
        sbLIZ.append(z);
        AVLog.logKibana(5, "AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ), null);
        Runnable runnable = new Runnable() { // from class: X.0jSf
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$enableAudioStrangeVoice$62(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        }
    }

    public void enableEchoMode(final boolean z) {
        Runnable runnable = new Runnable() { // from class: X.0jSd
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$enableEchoMode$18(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        }
    }

    public void enableHardwareEchoMode(final boolean z) {
        Runnable runnable = new Runnable() { // from class: X.0jSj
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$enableHardwareEchoMode$19(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        }
    }

    public synchronized void enableLocalRecord(final boolean z) {
        if (this.mRelease) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: X.0jRu
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$enableLocalRecord$23(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void enableMicMuteStatusCheck(boolean z) {
        this.mEnableMuteStatusCheck = z;
    }

    public void enableNew3ARmsStatistics(final boolean z) {
        Runnable runnable = new Runnable() { // from class: X.0jRt
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$enableNew3ARmsStatistics$15(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void enablePlayOutEcho(final boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enablePlayOutEcho: ");
        sbLIZ.append(z);
        AVLog.logKibana(5, "AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ), null);
        Runnable runnable = new Runnable() { // from class: X.0jSc
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$enablePlayOutEcho$20(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        }
    }

    public synchronized void enableRemoteAudio(final boolean z) {
        if (this.mRelease) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: X.0jSA
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$enableRemoteAudio$24(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void enableSoftwareEchoMode(final boolean z) {
        Runnable runnable = new Runnable() { // from class: X.0jSe
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$enableSoftwareEchoMode$21(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        }
    }

    public void fallbackToMicCaptureForScreenAudio(final boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fallbackToMicCaptureForScreenAudio:");
        sbLIZ.append(z);
        AVLog.logKibana(5, "AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ), null);
        Runnable runnable = new Runnable() { // from class: X.0jSU
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$fallbackToMicCaptureForScreenAudio$60(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        }
    }

    public synchronized double getOption(final int i) {
        double dNativeGetOption;
        if (this.enableAsyncInitByteAudio && !this.nativeInstanceInited.get()) {
            final double[] dArr = new double[1];
            runTaskImmediately(this.mHandler, new Runnable() { // from class: X.0jSJ
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$getOption$41(dArr, i);
                }
            });
            return dArr[0];
        }
        if (!this.mRelease && this.mNativeObj != 0) {
            dNativeGetOption = nativeGetOption(i);
        } else {
            dNativeGetOption = 0.0d;
        }
        return dNativeGetOption;
    }

    public synchronized void registerAudioRecordingCallback(AudioFocusChangedCallBack audioFocusChangedCallBack) {
        if (Build.VERSION.SDK_INT >= 29 && audioFocusChangedCallBack != null && !this.mRecordCallbackList.contains(audioFocusChangedCallBack)) {
            this.mRecordCallbackList.add(audioFocusChangedCallBack);
        }
    }

    public void setAudioCaptureMute(final boolean z) {
        Runnable runnable = new Runnable() { // from class: X.0jRr
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setAudioCaptureMute$53(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void setAudioCaptureObserver(InterfaceC1268590j7J interfaceC1268590j7J) {
        this.mCaptureObserver = new WeakReference<>(interfaceC1268590j7J);
    }

    public void setAudioCaptureVolume(final float f) {
        Runnable runnable = new Runnable() { // from class: X.0jRj
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setAudioCaptureVolume$52(f);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void setAudioEventObserver(final AudioEventObserver audioEventObserver) {
        Runnable runnable = new Runnable() { // from class: X.0jRg
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setAudioEventObserver$16(audioEventObserver);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public synchronized void setAudioLiveScene(final int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAudioLiveScene: ");
        sbLIZ.append(i);
        AVLog.w("AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setAudioLiveScene: ");
        sbLIZ2.append(i);
        AVLog.logKibana(5, "AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ2), null);
        Runnable runnable = new Runnable() { // from class: X.0jSi
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setAudioLiveScene$64(i);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        }
    }

    public void setAudioQuantizeGapPeriod(final long j) {
        Runnable runnable = new Runnable() { // from class: X.0jS3
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setAudioQuantizeGapPeriod$6(j);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void setAudioScenario(final int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            Runnable runnable = new Runnable() { // from class: X.0jSO
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$setAudioScenario$9(i);
                }
            };
            if (this.enableAsyncInitByteAudio) {
                runTaskInThread(this.mHandler, runnable);
            } else {
                runnable.run();
            }
        }
    }

    public void setAudioScreenVolume(final float f) {
        Runnable runnable = new Runnable() { // from class: X.0jRm
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setAudioScreenVolume$51(f);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void setDiagnosisModelPath(final String str) {
        Runnable runnable = new Runnable() { // from class: X.0jRy
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setDiagnosisModelPath$22(str);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void setEnableBatchProcess(boolean z) {
        this.enableBatchProcess = z;
    }

    public void setHardwareEarMonitorVolume(final float f) {
        this.mEarMonitorVolume = f;
        Runnable runnable = new Runnable() { // from class: X.0jRn
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setHardwareEarMonitorVolume$3(f);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
            return;
        }
        Handler handler = this.mHandler;
        if (handler != null && handler.getLooper().getThread() != C786410Ut5.u3()) {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void setInAnchorNet(final boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setInAnchorNet: ");
        sbLIZ.append(z);
        AVLog.w("AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setInAnchorNet: ");
        sbLIZ2.append(z);
        AVLog.logKibana(5, "AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ2), null);
        Runnable runnable = new Runnable() { // from class: X.0jSX
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setInAnchorNet$63(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        }
    }

    public void setInputStreamMute(final boolean z) {
        Runnable runnable = new Runnable() { // from class: X.0jS2
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setInputStreamMute$54(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void setInputStreamVolume(final float f) {
        Runnable runnable = new Runnable() { // from class: X.0jRo
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setInputStreamVolume$55(f);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void setLogReportService(C1269300j8S c1269300j8S) {
        this.logReportService = c1269300j8S;
    }

    public void setMicMute(final boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMicMute(");
        sbLIZ.append(z);
        sbLIZ.append(")");
        AVLog.iod("AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ));
        Runnable runnable = new Runnable() { // from class: X.0jSM
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setMicMute$7(z);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
            return;
        }
        Handler handler = this.mHandler;
        if (handler != null && handler.getLooper().getThread() != C786410Ut5.u3()) {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void setMicVolume(final float f) {
        if (!this.mRelease && this.mNativeObj != 0) {
            AudioCapturer audioCapturer = this.mExtAudioCapture.get();
            if (audioCapturer != null && !audioCapturer.isMute()) {
                audioCapturer.setVolume(f);
                return;
            }
            this.mMicVolume = f;
            Runnable runnable = new Runnable() { // from class: X.0jRi
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$setMicVolume$1(f);
                }
            };
            if (this.enableAsyncInitByteAudio) {
                runTaskInThread(this.mHandler, runnable);
                return;
            }
            Handler handler = this.mHandler;
            if (handler != null && handler.getLooper().getThread() != C786410Ut5.u3()) {
                C786410Ut5.LJJZZIII(this.mHandler, runnable);
            } else {
                runnable.run();
            }
        }
    }

    public void setParameter(final TEBundle tEBundle) {
        boolean z;
        final TEBundle tEBundleCopy;
        if (this.enableAsyncInitByteAudio && !this.nativeInstanceInited.get()) {
            z = true;
            tEBundleCopy = tEBundle.copy();
        } else {
            z = false;
            tEBundleCopy = tEBundle;
        }
        Runnable runnable = new Runnable() { // from class: X.0jRp
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setParameter$27(tEBundleCopy, tEBundle);
            }
        };
        if (z) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void setRecordingCallack(final AudioSink audioSink) {
        Runnable runnable = new Runnable() { // from class: X.0jRf
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setRecordingCallack$36(audioSink);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void setServerMixStopBaestream(boolean z) {
        this.mServerMixStopBaestream = z;
    }

    public void setSoftwareEarMonitorVolume(final float f) {
        this.mSoftwareEarMonitorVolume = f;
        Runnable runnable = new Runnable() { // from class: X.0jRk
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setSoftwareEarMonitorVolume$4(f);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
            return;
        }
        Handler handler = this.mHandler;
        if (handler != null && handler.getLooper().getThread() != C786410Ut5.u3()) {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void setTimeSyncMode(final int i) {
        Runnable runnable = new Runnable() { // from class: X.0jSF
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setTimeSyncMode$46(i);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void setTuningName(String str) {
        nativeSetTuningName(str);
    }

    public void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        Context context;
        AudioManager audioManager;
        if (Build.VERSION.SDK_INT < 24 || (context = this.mContext) == null) {
            return;
        }
        if (this.enableBatchProcess) {
            audioManager = this.defaultAudioManager;
        } else {
            audioManager = (AudioManager) C786410Ut5.H2(context, "audio");
        }
        if (audioManager != null && audioRecordingCallback != null) {
            audioManager.unregisterAudioRecordingCallback(audioRecordingCallback);
        }
    }

    public class NativeAudioEventObserver extends NativeObject implements AudioEventObserver {
        public volatile AudioEventObserver LL;

        @Override // com.ss.ttlivestreamer.core.engine.NativeObject
        public final synchronized void release() {
            this.LL = null;
            super.release();
        }

        public NativeAudioEventObserver(AudioEventObserver audioEventObserver) {
            this.LL = audioEventObserver;
        }

        @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.AudioEventObserver
        public void onAudioDeviceCaptureStateChanged(int i, int i2) {
            AudioEventObserver audioEventObserver = this.LL;
            if (audioEventObserver != null) {
                audioEventObserver.onAudioDeviceCaptureStateChanged(i, i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addAudioSink$42(int i, AudioSink audioSink) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.addAudioSink$1L");
        nativeAddAudioSink(i, audioSink);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.addAudioSink$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createRenderSink$11(AudioRenderSink audioRenderSink, int i) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.createRenderSink$1L");
        audioRenderSink.setNativeObj(nativeCreateRenderSink(i, this.mEnableAudioSinkStartOpt));
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.createRenderSink$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableAudioNoiseDetection$66(int i, int i2) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.enableAudioNoiseDetection$1L");
        if (!this.mRelease) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enableAudioNoiseDetection: duration: ");
            sbLIZ.append(i);
            sbLIZ.append(", interval: ");
            sbLIZ.append(i2);
            AVLog.logKibana(5, "AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ), null);
            nativeEnableAudioNoiseDetection(i, i2);
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.enableAudioNoiseDetection$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getOption$41(double[] dArr, int i) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.getOption$1L");
        dArr[0] = nativeGetOption(i);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.getOption$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeAudioSink$43(int i, AudioSink audioSink) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.removeAudioSink$1L");
        nativeRemoveAudioSink(i, audioSink);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.removeAudioSink$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAudioStrangeResource$61(String str, String str2) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setAudioStrangeResource$1L");
        if (!this.mRelease) {
            nativeSetAudioStrangeResource(str, str2);
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setAudioStrangeResource$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setParameter$27(TEBundle tEBundle, TEBundle tEBundle2) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.setParameter$1L");
        if (tEBundle == null) {
            C1C7U.LIZIZ("AudioDeviceModule@a1ed.setParameter$1L");
            return;
        }
        nativeSetParameter(tEBundle);
        if (!tEBundle.contains("adm_ns_type")) {
            synchronized (this.mParam) {
                try {
                    this.mParam.updateFrom(tEBundle);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (tEBundle != tEBundle2) {
            tEBundle.release();
        }
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.setParameter$1L");
    }

    private void runTaskImmediately(Handler handler, final Runnable runnable) {
        if (handler != null && runnable != null && !this.mRelease) {
            C1283100jUi.LIZIZ(handler, new Runnable() { // from class: X.0jST
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$runTaskImmediately$68(runnable);
                }
            });
        } else if (this.enableAsyncInitByteAudio) {
            reportTrace(this.logReportService);
        }
    }

    private boolean runTaskInThread(Handler handler, final Runnable runnable) {
        if (handler != null && runnable != null && !this.mRelease) {
            if (C786410Ut5.u3() == handler.getLooper().getThread()) {
                runnable.run();
                return true;
            }
            return C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0jSa
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$runTaskInThread$67(runnable);
                }
            });
        }
        if (this.enableAsyncInitByteAudio) {
            reportTrace(this.logReportService);
            return false;
        }
        return false;
    }

    public static void tryQuitAdmThread(final Handler handler, AudioDeviceModule audioDeviceModule) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryQuitAdmThread count:");
        if (audioDeviceModule == null) {
            i = 0;
        } else {
            i = audioDeviceModule.admAndSinks.get();
        }
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if (audioDeviceModule != null && handler != null && audioDeviceModule.enableAsyncInitByteAudio && audioDeviceModule.admAndSinks.get() == 0) {
            C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0jS6
                @Override // java.lang.Runnable
                public final void run() {
                    AudioDeviceModule.lambda$tryQuitAdmThread$38(handler);
                }
            });
        }
    }

    public void addAudioSink(final int i, final AudioSink audioSink) {
        Runnable runnable = new Runnable() { // from class: X.0jRh
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$addAudioSink$42(i, audioSink);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public AudioRenderSink createAuxStream(final int i, final int i2) {
        if (this.mUseFakeAudio) {
            return null;
        }
        if (this.enableAsyncInitByteAudio) {
            final AudioRenderSink audioRenderSink = new AudioRenderSink(0L, this.mHandler, true);
            audioRenderSink.LLILZLL = this.logReportService;
            audioRenderSink.LLILZ = true;
            audioRenderSink.LLIZ = this;
            this.admAndSinks.incrementAndGet();
            runTaskInThread(this.mHandler, new Runnable() { // from class: X.0jSE
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$createAuxStream$12(audioRenderSink, i, i2);
                }
            });
            return audioRenderSink;
        }
        return new AudioRenderSink(nativeCreateAuxStream(i, i2), this.mHandler, true);
    }

    public AudioRenderSink createRenderSinkV2(final int i, final int i2) {
        if (this.mUseFakeAudio) {
            return null;
        }
        if (this.enableAsyncInitByteAudio) {
            final AudioRenderSink audioRenderSink = new AudioRenderSink(0L, this.mHandler, this.mEnableAudioSinkStartOpt);
            audioRenderSink.LLILZLL = this.logReportService;
            audioRenderSink.LLILZ = true;
            audioRenderSink.LLIZ = this;
            this.admAndSinks.incrementAndGet();
            runTaskInThread(this.mHandler, new Runnable() { // from class: X.0jSP
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$createRenderSinkV2$10(audioRenderSink, i, i2);
                }
            });
            return audioRenderSink;
        }
        return new AudioRenderSink(nativeCreateRenderSinkV2(0, i, i2, this.mEnableAudioSinkStartOpt), this.mHandler, this.mEnableAudioSinkStartOpt);
    }

    public void enableAudioNoiseDetection(final int i, final int i2) {
        Handler handler = this.mHandler;
        if (handler != null && this.mEnableAudioNoiseDetectionCfg) {
            Runnable runnable = new Runnable() { // from class: X.0jSm
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$enableAudioNoiseDetection$66(i, i2);
                }
            };
            if (this.enableAsyncInitByteAudio) {
                runTaskInThread(handler, runnable);
            } else {
                C786410Ut5.LJJZZIII(handler, runnable);
            }
        }
    }

    public void forceEnableAudioPushStream(final boolean z, final boolean z2) {
        if (this.mRelease) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.ss.ttlivestreamer.core.engine.AudioDeviceModule.2
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AudioDeviceModule@a1ed.forceEnableAudioPushStream$1");
                try {
                    if (!AudioDeviceModule.this.mRelease) {
                        AudioDeviceModule.this.isForceEnableAudioPushStream = z;
                        if (z2) {
                            if (AudioDeviceModule.this.isForceEnableAudioPushStream) {
                                AudioDeviceModule.this.nativeEnableAudioPushStream(true);
                            } else {
                                AudioDeviceModule audioDeviceModule = AudioDeviceModule.this;
                                audioDeviceModule.nativeEnableAudioPushStream(audioDeviceModule.audioPushStreamEnabled);
                            }
                        }
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AudioDeviceModule@a1ed.forceEnableAudioPushStream$1");
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        }
    }

    public void registerAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback, Handler handler) {
        AudioManager audioManager;
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.enableBatchProcess) {
                audioManager = this.defaultAudioManager;
            } else {
                audioManager = sAudioManager;
            }
            if (audioManager == null) {
                Context context = this.mContext;
                if (context == null) {
                    return;
                } else {
                    audioManager = (AudioManager) C786410Ut5.H2(context, "audio");
                }
            }
            if (audioRecordingCallback != null && handler != null) {
                audioManager.registerAudioRecordingCallback(audioRecordingCallback, handler);
            }
        }
    }

    public void removeAudioSink(final int i, final AudioSink audioSink) {
        Runnable runnable = new Runnable() { // from class: X.0jRl
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$removeAudioSink$43(i, audioSink);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void removeAudioSinkImmediately(int i, AudioSink audioSink) {
        if (this.nativeInstanceInited.get()) {
            nativeRemoveAudioSink(i, audioSink);
            AVLog.logKibana(5, "AudioDeviceModule", "removerAudioSinkImmediately success", null);
        } else {
            AVLog.logKibana(6, "AudioDeviceModule", "removerAudioSinkImmediately with not inited", null);
        }
    }

    public synchronized void setAudioStrangeResource(final String str, final String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAudioStrangeResource: ");
        sbLIZ.append(str);
        AVLog.logKibana(5, "AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ), null);
        Runnable runnable = new Runnable() { // from class: X.0jSk
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$setAudioStrangeResource$61(str, str2);
            }
        };
        if (this.enableAsyncInitByteAudio) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            C786410Ut5.LJJZZIII(this.mHandler, runnable);
        }
    }

    public void setTuningType(int i, String str) {
        nativeSetTuningType(i, str);
    }

    public AudioDeviceModule(Context context, Handler handler, boolean z) {
        this.mParam = new TEBundle();
        this.mCaptureObserver = new WeakReference<>(null);
        this.mMicVolume = 1.0f;
        this.mEarMonitorVolume = 1.0f;
        this.mSoftwareEarMonitorVolume = 1.0f;
        this.mBGMMode = -2;
        this.mAdmType = 0;
        this.audioFocusChangedCallBackInfo = null;
        this.mRecordCallbackList = new ArrayList();
        this.mServerMixStopBaestream = false;
        this.mUseFakeAudio = false;
        this.mNativObjReleased = false;
        this.mEnableMuteStatusCheck = false;
        this.mDisableAudioStreamForLive = false;
        this.mEnableAudioSinkStartOpt = false;
        this.mEnableAudioNoiseDetectionCfg = false;
        this.audioPushStreamEnabled = false;
        this.isForceEnableAudioPushStream = false;
        this.nativeInstanceInited = new AtomicBoolean(false);
        this.enableAsyncInitByteAudio = false;
        this.mHardwareEchoMode = false;
        this.mSoftwareEchoMode = false;
        this.admAndSinks = new AtomicInteger(1);
        this.audioFocusChangedCallBackInfo = new C775060Uam();
        this.mHandler = handler;
        this.mContext = context;
        this.mUseFakeAudio = z;
        this.mAdmType = 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("++yr AdmType: ");
        sbLIZ.append(this.mAdmType);
        sbLIZ.append(", fakeAudio: ");
        sbLIZ.append(this.mUseFakeAudio);
        AVLog.w("AudioDeviceModule", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mHandler == null) {
            this.mHandler = new BPEAHandler(Looper.getMainLooper());
        }
        this.mExtAudioCapture = new WeakReference<>(null);
        sAudioManager = null;
        this.defaultAudioManager = context != null ? (AudioManager) C786410Ut5.H2(context, "audio") : null;
    }

    private void initNativeInstance(int i, String str, Observer observer) {
        setNativeObj(nativeCreateV2(this.mContext, i, str, this.mUseFakeAudio));
        this.nativeInstanceInited.set(true);
        NativeADMObserver nativeADMObserver = new NativeADMObserver(observer);
        this.mObserver = nativeADMObserver;
        nativeRegisterObserver(nativeADMObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createAuxStream$12(AudioRenderSink audioRenderSink, int i, int i2) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.createAuxStream$1L");
        audioRenderSink.setNativeObj(nativeCreateAuxStream(i, i2));
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.createAuxStream$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createRenderSinkV2$10(AudioRenderSink audioRenderSink, int i, int i2) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.createRenderSinkV2$1L");
        audioRenderSink.setNativeObj(nativeCreateRenderSinkV2(0, i, i2, this.mEnableAudioSinkStartOpt));
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.createRenderSinkV2$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$5(int i, String str, Observer observer) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.<init>$1L");
        initNativeInstance(i, str, observer);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.<init>$1L");
    }

    public AudioDeviceModule(Observer observer, Context context, Handler handler) {
        this(0, context, handler, observer, null, true);
    }

    public AudioDeviceModule(Observer observer, Context context, Handler handler, int i) {
        this(0, context, handler, observer, null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pushOuterAudioFarend$44(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        C1C7U.LIZ("AudioDeviceModule@a1ed.pushOuterAudioFarend$1L");
        nativePushOuterAudioFarend(byteBuffer, i, i2, i3, j);
        C1C7U.LIZIZ("AudioDeviceModule@a1ed.pushOuterAudioFarend$1L");
    }

    public void pushOuterAudioFarend(final ByteBuffer byteBuffer, final int i, final int i2, final int i3, final long j) {
        Runnable runnable = new Runnable() { // from class: X.0jRq
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$pushOuterAudioFarend$44(byteBuffer, i, i2, i3, j);
            }
        };
        if (this.enableAsyncInitByteAudio && !this.nativeInstanceInited.get()) {
            runTaskInThread(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public AudioDeviceModule(int i, Context context, Handler handler, Observer observer, String str, boolean z) {
        this(i, context, handler, observer, str, z, false);
    }

    public AudioDeviceModule(final int i, Context context, Handler handler, final Observer observer, final String str, boolean z, boolean z2) {
        this(context, handler, z);
        this.enableAsyncInitByteAudio = z2;
        if (!z2) {
            initNativeInstance(i, str, observer);
        } else {
            C786410Ut5.LJJZZIII(this.mHandler, new Runnable() { // from class: X.0jS1
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$new$5(i, str, observer);
                }
            });
        }
    }
}
