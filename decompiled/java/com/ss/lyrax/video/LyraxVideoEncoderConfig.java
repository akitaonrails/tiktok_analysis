package com.ss.lyrax.video;

import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoEncoderConfig {
    public LyraxVideoEncoderMode encoderMode;
    public List<LyraxVideoEncoderProfile> encoderProfiles;

    public LyraxVideoEncoderMode getEncoderMode() {
        return this.encoderMode;
    }

    public List<LyraxVideoEncoderProfile> getEncoderProfiles() {
        return this.encoderProfiles;
    }

    public LyraxVideoEncoderConfig(LyraxVideoEncoderMode lyraxVideoEncoderMode, List<LyraxVideoEncoderProfile> list) {
        this.encoderMode = lyraxVideoEncoderMode;
        this.encoderProfiles = list;
    }
}
