package com.ss.bytertc.engine.data;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class AudioEncodeConfig {
    public int aacCodecProfile;
    public int channelNum;
    public int codecType;
    public int encBitrate;
    public int encMode;
    public int packetSize;
    public int sampleRate;
    public int useDtx;
    public int useInbandfec;

    public AudioEncodeConfig() {
        this.codecType = -1;
        this.encMode = -1;
        this.channelNum = -1;
        this.encBitrate = -1;
        this.useDtx = -1;
        this.useInbandfec = -1;
        this.sampleRate = -1;
        this.packetSize = -1;
        this.aacCodecProfile = -1;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioEncodeConfig{codecType='");
        sbLIZ.append(this.codecType);
        sbLIZ.append('\'');
        sbLIZ.append(", encMode='");
        sbLIZ.append(this.encMode);
        sbLIZ.append('\'');
        sbLIZ.append(", channelNum='");
        sbLIZ.append(this.channelNum);
        sbLIZ.append('\'');
        sbLIZ.append(", encBitrate='");
        sbLIZ.append(this.encBitrate);
        sbLIZ.append('\'');
        sbLIZ.append(", useDtx='");
        sbLIZ.append(this.useDtx);
        sbLIZ.append('\'');
        sbLIZ.append(", useInbandfec='");
        sbLIZ.append(this.useInbandfec);
        sbLIZ.append('\'');
        sbLIZ.append(", sampleRate='");
        sbLIZ.append(this.sampleRate);
        sbLIZ.append('\'');
        sbLIZ.append(", packetSize='");
        sbLIZ.append(this.packetSize);
        sbLIZ.append('\'');
        sbLIZ.append(", aacCodecProfile='");
        sbLIZ.append(this.aacCodecProfile);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getAacCodecProfile() {
        return this.aacCodecProfile;
    }

    public int getChannelNum() {
        return this.channelNum;
    }

    public int getCodecType() {
        return this.codecType;
    }

    public int getEncBitrate() {
        return this.encBitrate;
    }

    public int getEncMode() {
        return this.encMode;
    }

    public int getPacketSize() {
        return this.packetSize;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public int getUseDtx() {
        return this.useDtx;
    }

    public int getUseInbandfec() {
        return this.useInbandfec;
    }

    public void setAacCodecProfile(int i) {
        this.aacCodecProfile = i;
    }

    public void setChannelNum(int i) {
        this.channelNum = i;
    }

    public void setCodecType(int i) {
        this.codecType = i;
    }

    public void setEncBitrate(int i) {
        this.encBitrate = i;
    }

    public void setEncMode(int i) {
        this.encMode = i;
    }

    public void setPacketSize(int i) {
        this.packetSize = i;
    }

    public void setSampleRate(int i) {
        this.sampleRate = i;
    }

    public void setUseDtx(int i) {
        this.useDtx = i;
    }

    public void setUseInbandfec(int i) {
        this.useInbandfec = i;
    }

    public AudioEncodeConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.codecType = i;
        this.encMode = i2;
        this.channelNum = i3;
        this.encBitrate = i4;
        this.useDtx = i5;
        this.useInbandfec = i6;
        this.sampleRate = i7;
        this.packetSize = i8;
        this.aacCodecProfile = i9;
    }
}
