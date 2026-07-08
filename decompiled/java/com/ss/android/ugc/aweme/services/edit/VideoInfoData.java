package com.ss.android.ugc.aweme.services.edit;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoInfoData {
    public float rusumeVolumeMusic;
    public float rusumeVolumeOrigin;
    public float rusumeVolumeRecord;

    public VideoInfoData() {
        this(0.0f, 0.0f, 0.0f);
    }

    public final float getRusumeVolumeMusic() {
        return this.rusumeVolumeMusic;
    }

    public final float getRusumeVolumeOrigin() {
        return this.rusumeVolumeOrigin;
    }

    public final float getRusumeVolumeRecord() {
        return this.rusumeVolumeRecord;
    }

    public final void setRusumeVolumeMusic(float f) {
        this.rusumeVolumeMusic = f;
    }

    public final void setRusumeVolumeOrigin(float f) {
        this.rusumeVolumeOrigin = f;
    }

    public final void setRusumeVolumeRecord(float f) {
        this.rusumeVolumeRecord = f;
    }

    public VideoInfoData(float f, float f2, float f3) {
        this.rusumeVolumeOrigin = f;
        this.rusumeVolumeMusic = f2;
        this.rusumeVolumeRecord = f3;
    }
}
