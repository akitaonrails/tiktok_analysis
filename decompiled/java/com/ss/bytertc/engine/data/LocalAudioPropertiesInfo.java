package com.ss.bytertc.engine.data;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class LocalAudioPropertiesInfo {
    public AudioPropertiesInfo audioPropertiesInfo;
    public StreamIndex streamIndex;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalAudioPropertiesInfo{streamIndex='");
        sbLIZ.append(this.streamIndex);
        sbLIZ.append('\'');
        sbLIZ.append("audioPropertiesInfo='");
        sbLIZ.append(this.audioPropertiesInfo.toString());
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LocalAudioPropertiesInfo(StreamIndex streamIndex, AudioPropertiesInfo audioPropertiesInfo) {
        this.streamIndex = streamIndex;
        this.audioPropertiesInfo = audioPropertiesInfo;
    }

    public static LocalAudioPropertiesInfo create(int i, int i2, int i3, float[] fArr, int i4, double d) {
        AudioPropertiesInfo audioPropertiesInfo = new AudioPropertiesInfo(i2, i3, fArr, i4);
        audioPropertiesInfo.voicePitch = d;
        return new LocalAudioPropertiesInfo(StreamIndex.fromId(i), audioPropertiesInfo);
    }

    private void updateInfo(int i, int i2, int i3, float[] fArr, int i4, double d) {
        this.streamIndex = StreamIndex.fromId(i);
        AudioPropertiesInfo audioPropertiesInfo = this.audioPropertiesInfo;
        audioPropertiesInfo.linearVolume = i2;
        audioPropertiesInfo.nonlinearVolume = i3;
        System.arraycopy(fArr, 0, audioPropertiesInfo.spectrum, 0, fArr.length);
        AudioPropertiesInfo audioPropertiesInfo2 = this.audioPropertiesInfo;
        audioPropertiesInfo2.vad = i4;
        audioPropertiesInfo2.voicePitch = d;
    }
}
