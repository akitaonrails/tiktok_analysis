package com.ss.lyrax.audio;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAudioPropertiesConfig {
    public LyraxAudioPropertiesMode audioReportMode;
    public boolean enableSpectrum;
    public boolean enableVad;
    public boolean enableVoicePitch;
    public int interval;
    public LyraxAudioReportMode localMainReportMode;
    public float smooth;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioPropertiesConfig{interval='");
        sbLIZ.append(this.interval);
        sbLIZ.append('\'');
        sbLIZ.append("enable_spectrum='");
        sbLIZ.append(this.enableSpectrum);
        sbLIZ.append('\'');
        sbLIZ.append("enable_vad='");
        sbLIZ.append(this.enableVad);
        sbLIZ.append('\'');
        sbLIZ.append("local_main_report_mode='");
        sbLIZ.append(this.localMainReportMode);
        sbLIZ.append('\'');
        sbLIZ.append("audio_report_mode='");
        sbLIZ.append(this.audioReportMode.toString());
        sbLIZ.append('\'');
        sbLIZ.append("enable_voice_pitch='");
        sbLIZ.append(this.enableVoicePitch);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean EnableSpectrum() {
        return this.enableSpectrum;
    }

    public boolean EnableVad() {
        return this.enableVad;
    }

    public boolean EnableVoicePitch() {
        return this.enableVoicePitch;
    }

    public LyraxAudioPropertiesMode getAudioReportMode() {
        return this.audioReportMode;
    }

    public int getInterval() {
        return this.interval;
    }

    public LyraxAudioReportMode getLocalMainReportMode() {
        return this.localMainReportMode;
    }

    public float getSmooth() {
        return this.smooth;
    }

    public LyraxAudioPropertiesConfig(int i) {
        this.localMainReportMode = LyraxAudioReportMode.NORMAL;
        this.audioReportMode = LyraxAudioPropertiesMode.MICROPHONE;
        this.smooth = 1.0f;
        this.interval = i;
    }

    public LyraxAudioPropertiesConfig(int i, boolean z, boolean z2) {
        this.localMainReportMode = LyraxAudioReportMode.NORMAL;
        LyraxAudioPropertiesMode lyraxAudioPropertiesMode = LyraxAudioPropertiesMode.MICROPHONE;
        this.smooth = 1.0f;
        this.interval = i;
        this.enableSpectrum = z;
        this.enableVad = z2;
        this.audioReportMode = lyraxAudioPropertiesMode;
    }

    public LyraxAudioPropertiesConfig(int i, boolean z, boolean z2, LyraxAudioReportMode lyraxAudioReportMode) {
        this.localMainReportMode = LyraxAudioReportMode.NORMAL;
        this.audioReportMode = LyraxAudioPropertiesMode.MICROPHONE;
        this.smooth = 1.0f;
        this.interval = i;
        this.enableSpectrum = z;
        this.enableVad = z2;
        this.localMainReportMode = lyraxAudioReportMode;
    }

    public LyraxAudioPropertiesConfig(int i, boolean z, boolean z2, LyraxAudioReportMode lyraxAudioReportMode, float f) {
        this.localMainReportMode = LyraxAudioReportMode.NORMAL;
        this.audioReportMode = LyraxAudioPropertiesMode.MICROPHONE;
        this.interval = i;
        this.enableSpectrum = z;
        this.enableVad = z2;
        this.localMainReportMode = lyraxAudioReportMode;
        this.smooth = f;
    }

    public LyraxAudioPropertiesConfig(int i, boolean z, boolean z2, LyraxAudioReportMode lyraxAudioReportMode, float f, LyraxAudioPropertiesMode lyraxAudioPropertiesMode, boolean z3) {
        this.localMainReportMode = LyraxAudioReportMode.NORMAL;
        this.interval = i;
        this.enableSpectrum = z;
        this.enableVad = z2;
        this.localMainReportMode = lyraxAudioReportMode;
        this.smooth = f;
        this.audioReportMode = lyraxAudioPropertiesMode;
        this.enableVoicePitch = z3;
    }
}
