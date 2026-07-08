package com.ss.lyrax.transcoder;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxTranscoderSpatialAudioConfig {
    public boolean enableSpatialRender;
    public LyraxTranscoderPosition audienceSpatialPosition = new LyraxTranscoderPosition();
    public LyraxTranscoderHumanOrientation audienceSpatialOrientation = new LyraxTranscoderHumanOrientation();

    public LyraxTranscoderHumanOrientation getAudienceSpatialOrientation() {
        return this.audienceSpatialOrientation;
    }

    public LyraxTranscoderPosition getAudienceSpatialPosition() {
        return this.audienceSpatialPosition;
    }

    public boolean getEnableSpatialRender() {
        return this.enableSpatialRender;
    }

    public void setAudienceSpatialOrientation(LyraxTranscoderHumanOrientation lyraxTranscoderHumanOrientation) {
        this.audienceSpatialOrientation = lyraxTranscoderHumanOrientation;
    }

    public void setAudienceSpatialPosition(LyraxTranscoderPosition lyraxTranscoderPosition) {
        this.audienceSpatialPosition = lyraxTranscoderPosition;
    }

    public void setEnableSpatialRender(boolean z) {
        this.enableSpatialRender = z;
    }
}
