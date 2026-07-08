package com.ss.ttlivestreamer.livestreamv2.player;

import X.C1276290jJj;
import X.C1C7U;
import X.C2188811AlT;
import X.C774530UZv;
import X.C786410Ut5;
import X.RunnableC1276280jJi;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.player.NativeRenderObserver;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes21.dex */
public class AVPlayerV2 extends C1276290jJj implements AudioDeviceModule.RenderObserver {
    public final int STATUS_ERROR;
    public final int STATUS_INIT;
    public final int STATUS_PAUSE;
    public final int STATUS_PREPARED;
    public final int STATUS_RELEASE;
    public final int STATUS_STARTED;
    public final int STATUS_STOP;
    public boolean asyncInitByteAudio;
    public AudioDeviceModule mAdm;
    public boolean mCompleted;
    public ReentrantLock mFence;
    public Handler mHandler;
    public int mReconnectCounts;
    public NativeRenderObserver mRenderObserver;
    public AudioDeviceModule.AudioRenderSink mRenderSink;
    public int mStatus;
    public String mUrl;
    public volatile boolean released;

    @Override // X.C1276290jJj
    public C774530UZv getMetaData() {
        return null;
    }

    @Override // X.C1276290jJj
    public float getVolume() {
        return 0.0f;
    }

    @Override // X.C1276290jJj, X.InterfaceC774130UYh
    public synchronized void release() {
        String str = C1276290jJj.TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release this ");
        sbLIZ.append(this);
        AVLog.iod(str, C2188811AlT.LIZIZ(sbLIZ));
        runTaskInThread(new ARunnableS120S0100000_20(this, 260));
    }

    @Override // X.C1276290jJj
    public void setConnectTimeoutMs(long j) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$0() {
        C1C7U.LIZ("AVPlayerV2@e58.release$1L");
        this.released = true;
        this.mFence.lock();
        try {
            if (this.mStatus != 6) {
                this.mStatus = 6;
                AudioDeviceModule.AudioRenderSink audioRenderSink = this.mRenderSink;
                if (audioRenderSink != null) {
                    audioRenderSink.LLJILJILJ(null);
                    this.mRenderSink.release();
                    this.mRenderSink = null;
                }
                NativeRenderObserver nativeRenderObserver = this.mRenderObserver;
                if (nativeRenderObserver != null) {
                    nativeRenderObserver.release();
                    this.mRenderObserver = null;
                }
                this.mAdm = null;
            }
            this.mFence.unlock();
            C1C7U.LIZIZ("AVPlayerV2@e58.release$1L");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mFence.unlock();
            throw th;
        }
    }

    @Override // X.C1276290jJj, X.InterfaceC774130UYh
    public boolean isPlaying() {
        return this.mStatus == 3;
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
    public void onBegin() {
        AVLog.e(C1276290jJj.TAG, "java onBegin");
        onStarted(this, 0);
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
    public void onCompletion() {
        AVLog.e(C1276290jJj.TAG, "java onCompletion");
        this.mCompleted = true;
        onCompletion(this);
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
    public void onStopped() {
        if (this.mCompleted) {
            return;
        }
        onStop(this, 0);
    }

    @Override // X.C1276290jJj, X.InterfaceC774130UYh
    public void pause() {
        this.mFence.lock();
        try {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mRenderSink;
            if (audioRenderSink != null && this.mStatus == 3) {
                this.mStatus = 5;
                audioRenderSink.pause();
                onPause(null, 0);
            }
            this.mFence.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mFence.unlock();
            throw th;
        }
    }

    @Override // X.C1276290jJj, X.InterfaceC774130UYh
    public void prepare() {
        String str = C1276290jJj.TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepare this ");
        sbLIZ.append(this);
        AVLog.iod(str, C2188811AlT.LIZIZ(sbLIZ));
        this.mFence.lock();
        try {
            AudioDeviceModule audioDeviceModule = this.mAdm;
            if (audioDeviceModule != null && this.mRenderSink == null) {
                this.mRenderSink = audioDeviceModule.createAuxStream(0, 1);
            }
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mRenderSink;
            if (audioRenderSink != null) {
                RunnableC1276280jJi runnableC1276280jJi = new RunnableC1276280jJi(audioRenderSink, this.mUrl, null);
                if (audioRenderSink.LLILZ) {
                    audioRenderSink.LLIZLLLIL(audioRenderSink.LL, runnableC1276280jJi);
                } else {
                    runnableC1276280jJi.run();
                }
                if (this.mRenderObserver == null) {
                    this.mRenderObserver = new NativeRenderObserver(this);
                }
                this.mRenderSink.LLJILJILJ(this.mRenderObserver);
            }
            this.mStatus = 2;
            onPrepared(this, 0);
            this.mFence.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mFence.unlock();
            throw th;
        }
    }

    @Override // X.C1276290jJj, X.InterfaceC774130UYh
    public void start() {
        String str = C1276290jJj.TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start this ");
        sbLIZ.append(this);
        AVLog.iod(str, C2188811AlT.LIZIZ(sbLIZ));
        this.mFence.lock();
        try {
            this.mCompleted = false;
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mRenderSink;
            if (audioRenderSink != null) {
                int i = this.mStatus;
                if (i == 5) {
                    audioRenderSink.resume();
                    this.mStatus = 3;
                } else if (i == 2) {
                    audioRenderSink.start();
                    this.mStatus = 3;
                }
            }
            this.mFence.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mFence.unlock();
            throw th;
        }
    }

    @Override // X.C1276290jJj, X.InterfaceC774130UYh
    public void stop() {
        String str = C1276290jJj.TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop this ");
        sbLIZ.append(this);
        AVLog.iod(str, C2188811AlT.LIZIZ(sbLIZ));
        this.mFence.lock();
        try {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mRenderSink;
            if (audioRenderSink != null && this.mStatus != 6) {
                this.mStatus = 4;
                audioRenderSink.stop();
            }
            this.mFence.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mFence.unlock();
            throw th;
        }
    }

    @Override // X.C1276290jJj
    public void prepareAsync() {
        prepare();
    }

    public AVPlayerV2(AudioDeviceModule audioDeviceModule) {
        this(audioDeviceModule, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runTaskInThread$1(Runnable runnable) {
        C1C7U.LIZ("AVPlayerV2@e58.runTaskInThread$1L");
        if (this.released) {
            C1C7U.LIZIZ("AVPlayerV2@e58.runTaskInThread$1L");
        } else {
            runnable.run();
            C1C7U.LIZIZ("AVPlayerV2@e58.runTaskInThread$1L");
        }
    }

    private void runTaskInThread(Runnable runnable) {
        if (this.asyncInitByteAudio) {
            if (this.mHandler != null && !this.released) {
                if (C786410Ut5.u3() == this.mHandler.getLooper().getThread()) {
                    runnable.run();
                    return;
                } else {
                    C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS89S0200000_20(runnable, this, 162));
                    return;
                }
            }
            return;
        }
        runnable.run();
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
    public void onError(int i) {
        String str = C1276290jJj.TAG;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("java onError: ");
        sbLIZ.append(i);
        AVLog.e(str, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("aux stream error code: ");
        sbLIZ2.append(i);
        onError(this, i, new Exception(C2188811AlT.LIZIZ(sbLIZ2)));
    }

    @Override // X.C1276290jJj
    public void seekTo(long j) {
        this.mFence.lock();
        try {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mRenderSink;
            if (audioRenderSink != null) {
                onSeeked(null, j, audioRenderSink.LLJ((int) j));
            }
            this.mFence.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mFence.unlock();
            throw th;
        }
    }

    @Override // X.C1276290jJj, X.InterfaceC774130UYh
    public void setLoop(boolean z) {
        int i;
        super.setLoop(z);
        this.mFence.lock();
        try {
            AudioDeviceModule.AudioRenderSink audioRenderSink = this.mRenderSink;
            if (audioRenderSink != null) {
                if (z) {
                    i = -1;
                } else {
                    i = 1;
                }
                audioRenderSink.LLJI(i);
            }
            this.mFence.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mFence.unlock();
            throw th;
        }
    }

    @Override // X.C1276290jJj, X.InterfaceC774130UYh
    public void setMixerEnable(boolean z) {
        long j;
        super.setMixerEnable(z);
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mRenderSink;
        if (audioRenderSink != null) {
            if (z) {
                j = 7;
            } else {
                j = 0;
            }
            audioRenderSink.LLJILJIL(j);
        }
    }

    @Override // X.C1276290jJj, X.InterfaceC774130UYh
    public void setVolume(float f) {
        AudioDeviceModule.AudioRenderSink audioRenderSink = this.mRenderSink;
        if (audioRenderSink != null) {
            audioRenderSink.LLJJ(f);
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
    public void onProgress(long j, int i) {
        onProgress(this, j);
    }

    @Override // X.C1276290jJj, X.InterfaceC774130UYh
    public void setDataSource(Context context, String str) {
        this.mUrl = str;
    }

    public AVPlayerV2(AudioDeviceModule audioDeviceModule, Handler handler, boolean z) {
        this.STATUS_INIT = 1;
        this.STATUS_PREPARED = 2;
        this.STATUS_STARTED = 3;
        this.STATUS_STOP = 4;
        this.STATUS_PAUSE = 5;
        this.STATUS_RELEASE = 6;
        this.STATUS_ERROR = 7;
        this.mStatus = 1;
        this.mReconnectCounts = -1;
        this.mAdm = audioDeviceModule;
        this.mFence = new ReentrantLock();
        this.mCompleted = false;
        this.mHandler = handler;
        this.asyncInitByteAudio = z;
    }
}
