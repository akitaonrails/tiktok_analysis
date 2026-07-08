package com.ss.android.vesdk.jni;

import com.ss.android.vesdk.filterparam.VEAudioDspFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioEffectFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioFadeFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter;
import com.ss.android.vesdk.filterparam.VEAudioMetricsFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioNoiseFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioSamiFilterParam;
import com.ss.android.vesdk.filterparam.VEAudioVolumeFilterParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;

/* JADX INFO: loaded from: classes36.dex */
public class TEAudioEffectInterface {
    public long mNative;

    private native int nativeUpdateAudioDspFilterParam(long j, int i, int i2, VEAudioDspFilterParam vEAudioDspFilterParam);

    private native int nativeUpdateAudioEffectFilterParam(long j, int i, int i2, VEAudioEffectFilterParam vEAudioEffectFilterParam);

    private native int nativeUpdateAudioFadeFilterParam(long j, int i, int i2, VEAudioFadeFilterParam vEAudioFadeFilterParam);

    private native int nativeUpdateAudioLoudnessBalanceFilterParam(long j, int i, int i2, VEAudioLoudnessBalanceFilter vEAudioLoudnessBalanceFilter);

    private native int nativeUpdateAudioMetricsFilterParam(long j, int i, int i2, VEAudioMetricsFilterParam vEAudioMetricsFilterParam);

    private native int nativeUpdateAudioNoiseFilterParam(long j, int i, int i2, VEAudioNoiseFilterParam vEAudioNoiseFilterParam);

    private native int nativeUpdateAudioSamiFilterParam(long j, int i, int i2, VEAudioSamiFilterParam vEAudioSamiFilterParam);

    private native int nativeUpdateAudioVolumeFilterParam(long j, int i, int i2, VEAudioVolumeFilterParam vEAudioVolumeFilterParam);

    public void clearNative() {
        this.mNative = 0L;
    }

    public TEAudioEffectInterface(long j) {
        this.mNative = j;
    }

    public int updateAudioFilterParam(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        if (this.mNative == 0) {
            return -112;
        }
        if (vEBaseFilterParam.filterName.equals("audio volume filter")) {
            return nativeUpdateAudioVolumeFilterParam(this.mNative, i, i2, (VEAudioVolumeFilterParam) vEBaseFilterParam);
        }
        if (vEBaseFilterParam.filterName.equals("audio fading")) {
            return nativeUpdateAudioFadeFilterParam(this.mNative, i, i2, (VEAudioFadeFilterParam) vEBaseFilterParam);
        }
        if (vEBaseFilterParam.filterName.equals("audio effect")) {
            return nativeUpdateAudioEffectFilterParam(this.mNative, i, i2, (VEAudioEffectFilterParam) vEBaseFilterParam);
        }
        if (vEBaseFilterParam.filterName.equals("audio noise")) {
            return nativeUpdateAudioNoiseFilterParam(this.mNative, i, i2, (VEAudioNoiseFilterParam) vEBaseFilterParam);
        }
        if (vEBaseFilterParam.filterName.equals("loudness balance")) {
            return nativeUpdateAudioLoudnessBalanceFilterParam(this.mNative, i, i2, (VEAudioLoudnessBalanceFilter) vEBaseFilterParam);
        }
        if (vEBaseFilterParam.filterName.equals("audio dsp filter")) {
            return nativeUpdateAudioDspFilterParam(this.mNative, i, i2, (VEAudioDspFilterParam) vEBaseFilterParam);
        }
        if (vEBaseFilterParam.filterName.equals("audio sami filter")) {
            return nativeUpdateAudioSamiFilterParam(this.mNative, i, i2, (VEAudioSamiFilterParam) vEBaseFilterParam);
        }
        if (vEBaseFilterParam.filterName.equals("audio metrics filter")) {
            return nativeUpdateAudioMetricsFilterParam(this.mNative, i, i2, (VEAudioMetricsFilterParam) vEBaseFilterParam);
        }
        return -1;
    }
}
