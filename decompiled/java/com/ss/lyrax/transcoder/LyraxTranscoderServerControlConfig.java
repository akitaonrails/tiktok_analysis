package com.ss.lyrax.transcoder;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxTranscoderServerControlConfig {
    public boolean enableVolumeIndication;
    public boolean isAddVolumeValue;
    public float volumeIndicationInterval = 2.0f;
    public int[] talkVolumeLevels = {0, 20};
    public LyraxTranscoderAsrTaskMode asrTaskMode = LyraxTranscoderAsrTaskMode.Lyrax_TRANSCODER_ASR_TASK_MODE_DEFAULT;

    public boolean getAddVolumeValue() {
        return this.isAddVolumeValue;
    }

    public LyraxTranscoderAsrTaskMode getAsrTaskMode() {
        return this.asrTaskMode;
    }

    public boolean getEnableVolumeIndication() {
        return this.enableVolumeIndication;
    }

    public int[] getTalkVolumeLevels() {
        return this.talkVolumeLevels;
    }

    public float getVolumeIndicationInterval() {
        return this.volumeIndicationInterval;
    }

    public void setAddVolumeValue(boolean z) {
        this.isAddVolumeValue = z;
    }

    public void setAsrTaskMode(LyraxTranscoderAsrTaskMode lyraxTranscoderAsrTaskMode) {
        this.asrTaskMode = lyraxTranscoderAsrTaskMode;
    }

    public void setEnableVolumeIndication(boolean z) {
        this.enableVolumeIndication = z;
    }

    public void setTalkVolumeLevels(int[] iArr) {
        this.talkVolumeLevels = iArr;
    }

    public void setVolumeIndicationInterval(float f) {
        this.volumeIndicationInterval = f;
    }
}
