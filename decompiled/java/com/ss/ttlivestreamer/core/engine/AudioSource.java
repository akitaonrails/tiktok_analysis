package com.ss.ttlivestreamer.core.engine;

import X.C1266350j3h;
import X.C1268530j7D;
import X.C786410Ut5;
import X.InterfaceC1267000j4k;
import Y.ARunnableS31S0101000_20;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.WrapperNativeAudioBuffer;
import com.ss.ttlivestreamer.core.statics.StaticsReport;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AudioSource extends MediaSource {
    public AudioDeviceModule mADM;
    public InterfaceC1267000j4k mObserver;

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    public native void nativeAdaptedOutputFormat(int i, int i2, int i3);

    public native void nativeOnData(Buffer buffer, int i, int i2, int i3, long j);

    public native void nativeSetAudioQuantizeGapPeriod(long j);

    public native void nativeSetMute(boolean z);

    public native void nativeSetVolume(double d);

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        this.mADM = null;
        super.release();
    }

    public AudioDeviceModule getAudioDeviceModule() {
        return this.mADM;
    }

    private void onEvent(int i) {
        Handler handler;
        InterfaceC1267000j4k interfaceC1267000j4k = this.mObserver;
        if (interfaceC1267000j4k != null) {
            C1266350j3h c1266350j3h = (C1266350j3h) interfaceC1267000j4k;
            if ((!C1268530j7D.LIZ() && c1266350j3h.LLJJIJIIJIL == null) || (handler = c1266350j3h.LLILLJJLI) == null) {
                return;
            }
            C786410Ut5.LJJZZIII(handler, new ARunnableS31S0101000_20(c1266350j3h, i, 30));
        }
    }

    public void setAudioDeviceModule(AudioDeviceModule audioDeviceModule) {
        this.mADM = audioDeviceModule;
    }

    public void setCalculatePcmPowerEventObserver(InterfaceC1267000j4k interfaceC1267000j4k) {
        this.mObserver = interfaceC1267000j4k;
    }

    public void nativeOnData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer, int i, int i2, int i3, long j) {
        throw new AndroidRuntimeException("Not should be here.");
    }
}
