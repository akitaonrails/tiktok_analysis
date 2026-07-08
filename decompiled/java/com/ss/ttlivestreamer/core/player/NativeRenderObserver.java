package com.ss.ttlivestreamer.core.player;

import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.NativeObject;

/* JADX INFO: loaded from: classes21.dex */
public class NativeRenderObserver extends NativeObject implements AudioDeviceModule.RenderObserver {
    public AudioDeviceModule.RenderObserver mObserver;

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        this.mObserver = null;
        super.release();
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
    public void onBegin() {
        AudioDeviceModule.RenderObserver renderObserver = this.mObserver;
        if (renderObserver != null) {
            renderObserver.onBegin();
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
    public void onCompletion() {
        AudioDeviceModule.RenderObserver renderObserver = this.mObserver;
        if (renderObserver != null) {
            renderObserver.onCompletion();
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
    public void onStopped() {
        AudioDeviceModule.RenderObserver renderObserver = this.mObserver;
        if (renderObserver != null) {
            renderObserver.onStopped();
        }
    }

    public NativeRenderObserver(AudioDeviceModule.RenderObserver renderObserver) {
        this.mObserver = renderObserver;
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
    public void onError(int i) {
        AudioDeviceModule.RenderObserver renderObserver = this.mObserver;
        if (renderObserver != null) {
            renderObserver.onError(i);
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.RenderObserver
    public void onProgress(long j, int i) {
        AudioDeviceModule.RenderObserver renderObserver = this.mObserver;
        if (renderObserver != null) {
            renderObserver.onProgress(j, i);
        }
    }
}
