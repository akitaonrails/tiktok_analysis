package com.ss.android.ugc.aweme.shortvideo.countdown;

import X.C004I;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class CountdownState implements C004I {
    public static final int $stable = 8;
    public final boolean isUgcTemplateFromAnchor;
    public final long maxDuration;
    public final String musicPath;
    public final long sdkRecordTime;
    public final long startTime;
    public final long totalTime;
    public final AVMusicWaveBean waveInfo;

    public final CountdownState copy(String str, long j, long j2, long j3, long j4, boolean z, AVMusicWaveBean aVMusicWaveBean) {
        return new CountdownState(str, j, j2, j3, j4, z, aVMusicWaveBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountdownState)) {
            return false;
        }
        CountdownState countdownState = (CountdownState) obj;
        return Intrinsics.LJFF(this.musicPath, countdownState.musicPath) && this.sdkRecordTime == countdownState.sdkRecordTime && this.startTime == countdownState.startTime && this.totalTime == countdownState.totalTime && this.maxDuration == countdownState.maxDuration && this.isUgcTemplateFromAnchor == countdownState.isUgcTemplateFromAnchor && Intrinsics.LJFF(this.waveInfo, countdownState.waveInfo);
    }

    public int hashCode() {
        String str = this.musicPath;
        int iHashCode = (((((((((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.sdkRecordTime)) * 31) + C786410Ut5.Y2(this.startTime)) * 31) + C786410Ut5.Y2(this.totalTime)) * 31) + C786410Ut5.Y2(this.maxDuration)) * 31) + C786410Ut5.Z2(this.isUgcTemplateFromAnchor)) * 31;
        AVMusicWaveBean aVMusicWaveBean = this.waveInfo;
        return iHashCode + (aVMusicWaveBean != null ? aVMusicWaveBean.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountdownState(musicPath=");
        sbLIZ.append(this.musicPath);
        sbLIZ.append(", sdkRecordTime=");
        sbLIZ.append(this.sdkRecordTime);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", totalTime=");
        sbLIZ.append(this.totalTime);
        sbLIZ.append(", maxDuration=");
        sbLIZ.append(this.maxDuration);
        sbLIZ.append(", isUgcTemplateFromAnchor=");
        sbLIZ.append(this.isUgcTemplateFromAnchor);
        sbLIZ.append(", waveInfo=");
        sbLIZ.append(this.waveInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long getMaxDuration() {
        return this.maxDuration;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final long getSdkRecordTime() {
        return this.sdkRecordTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getTotalTime() {
        return this.totalTime;
    }

    public final AVMusicWaveBean getWaveInfo() {
        return this.waveInfo;
    }

    public final boolean isUgcTemplateFromAnchor() {
        return this.isUgcTemplateFromAnchor;
    }

    public CountdownState(String str, long j, long j2, long j3, long j4, boolean z, AVMusicWaveBean aVMusicWaveBean) {
        this.musicPath = str;
        this.sdkRecordTime = j;
        this.startTime = j2;
        this.totalTime = j3;
        this.maxDuration = j4;
        this.isUgcTemplateFromAnchor = z;
        this.waveInfo = aVMusicWaveBean;
    }
}
