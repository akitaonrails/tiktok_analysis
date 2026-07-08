package com.ss.ttlivestreamer.core.effect;

import com.ss.ttlivestreamer.core.engine.NativeObject;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class NativeAudioEffect extends NativeObject {
    private native void nativeCreate(int i, int i2);

    public native TEBundle nativeGetParameter();

    public native int nativeProcessAudioFrame(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    public native void nativeSetParameter(TEBundle tEBundle);

    public TEBundle getParameter() {
        return nativeGetParameter();
    }

    public double getPitch() {
        TEBundle parameter = getParameter();
        if (parameter == null) {
            return 0.0d;
        }
        double d = parameter.getDouble("pitch_shift");
        parameter.release();
        return d;
    }

    public void enableAutoVolume(boolean z) {
        TEBundle parameter = getParameter();
        if (parameter != null) {
            parameter.setBool("adm_enable_karaoke_agc", z);
            setParameter(parameter);
            parameter.release();
        }
    }

    public void enablePitchShift(boolean z) {
        TEBundle parameter = getParameter();
        if (parameter != null) {
            parameter.setBool("adm_enable_shift_pitch", z);
            setParameter(parameter);
            parameter.release();
        }
    }

    public void setParameter(TEBundle tEBundle) {
        nativeSetParameter(tEBundle);
    }

    public void setPitch(double d) {
        TEBundle parameter = getParameter();
        if (parameter != null) {
            parameter.setDouble("pitch_shift", d);
            setParameter(parameter);
            parameter.release();
        }
    }

    public void setVoiceAccompanySourceLufs(float f) {
        TEBundle parameter = getParameter();
        if (parameter != null) {
            parameter.setDouble("source_lufs", f);
            setParameter(parameter);
            parameter.release();
        }
    }

    public void setVoiceAccompanySourcePeak(float f) {
        TEBundle parameter = getParameter();
        if (parameter != null) {
            parameter.setDouble("source_peak", f);
            setParameter(parameter);
            parameter.release();
        }
    }

    public void setVoiceAccompanyTargetLufs(float f) {
        TEBundle parameter = getParameter();
        if (parameter != null) {
            parameter.setDouble("target_lufs", f);
            setParameter(parameter);
            parameter.release();
        }
    }

    public NativeAudioEffect(int i, int i2) {
        nativeCreate(i, i2);
    }

    public int process(ByteBuffer byteBuffer, int i, int i2, int i3) {
        return nativeProcessAudioFrame(this.mNativeObj, byteBuffer, i, i2, i3);
    }
}
