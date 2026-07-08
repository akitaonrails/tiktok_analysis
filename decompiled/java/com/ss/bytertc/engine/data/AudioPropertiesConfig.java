package com.ss.bytertc.engine.data;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class AudioPropertiesConfig {
    public AudioPropertiesMode audioReportMode;
    public boolean enableSpectrum;
    public boolean enableVad;
    public boolean enableVoicePitch;
    public int interval;
    public AudioReportMode localMainReportMode;
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

    public AudioPropertiesConfig(int i) {
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        this.audioReportMode = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.smooth = 1.0f;
        this.interval = i;
    }

    public AudioPropertiesConfig(int i, boolean z, boolean z2) {
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        AudioPropertiesMode audioPropertiesMode = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.smooth = 1.0f;
        this.interval = i;
        this.enableSpectrum = z;
        this.enableVad = z2;
        this.audioReportMode = audioPropertiesMode;
    }

    public AudioPropertiesConfig(int i, boolean z, boolean z2, AudioReportMode audioReportMode) {
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        this.audioReportMode = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.smooth = 1.0f;
        this.interval = i;
        this.enableSpectrum = z;
        this.enableVad = z2;
        this.localMainReportMode = audioReportMode;
    }

    public AudioPropertiesConfig(int i, boolean z, boolean z2, AudioReportMode audioReportMode, float f) {
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        this.audioReportMode = AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE;
        this.interval = i;
        this.enableSpectrum = z;
        this.enableVad = z2;
        this.localMainReportMode = audioReportMode;
        this.smooth = f;
    }

    public AudioPropertiesConfig(int i, boolean z, boolean z2, AudioReportMode audioReportMode, float f, AudioPropertiesMode audioPropertiesMode) {
        this.localMainReportMode = AudioReportMode.AUDIO_REPORT_MODE_NORMAL;
        this.interval = i;
        this.enableSpectrum = z;
        this.enableVad = z2;
        this.localMainReportMode = audioReportMode;
        this.smooth = f;
        this.audioReportMode = audioPropertiesMode;
    }
}
