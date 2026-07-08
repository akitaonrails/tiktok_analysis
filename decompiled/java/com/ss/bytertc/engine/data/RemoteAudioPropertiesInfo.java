package com.ss.bytertc.engine.data;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class RemoteAudioPropertiesInfo {
    public AudioPropertiesInfo audioPropertiesInfo;
    public StreamKey streamKey;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoteAudioPropertiesInfo{user_id='");
        sbLIZ.append(this.streamKey.getUserId());
        sbLIZ.append('\'');
        sbLIZ.append("room_id='");
        sbLIZ.append(this.streamKey.getUserId());
        sbLIZ.append('\'');
        sbLIZ.append("stream_index='");
        sbLIZ.append(this.streamKey.getStreamIndex());
        sbLIZ.append('\'');
        sbLIZ.append("audioPropertiesInfo [");
        sbLIZ.append('\'');
        sbLIZ.append("linear_volume='");
        sbLIZ.append(this.audioPropertiesInfo.linearVolume);
        sbLIZ.append('\'');
        sbLIZ.append("nonlinear_volume='");
        sbLIZ.append(this.audioPropertiesInfo.nonlinearVolume);
        sbLIZ.append('\'');
        sbLIZ.append("]}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RemoteAudioPropertiesInfo(StreamKey streamKey, AudioPropertiesInfo audioPropertiesInfo) {
        this.streamKey = streamKey;
        this.audioPropertiesInfo = audioPropertiesInfo;
    }

    public static RemoteAudioPropertiesInfo create(String str, String str2, int i, int i2, int i3, float[] fArr, int i4) {
        return new RemoteAudioPropertiesInfo(new StreamKey(str, str2, StreamIndex.fromId(i)), new AudioPropertiesInfo(i2, i3, fArr, i4));
    }

    private void updateInfo(String str, String str2, int i, int i2, int i3, float[] fArr, int i4) {
        this.streamKey.setRoomId(str);
        this.streamKey.setUserId(str2);
        this.streamKey.setStreamIndex(StreamIndex.fromId(i));
        AudioPropertiesInfo audioPropertiesInfo = this.audioPropertiesInfo;
        audioPropertiesInfo.linearVolume = i2;
        audioPropertiesInfo.nonlinearVolume = i3;
        System.arraycopy(fArr, 0, audioPropertiesInfo.spectrum, 0, fArr.length);
        this.audioPropertiesInfo.vad = i4;
    }
}
