package com.ss.lyrax.transcoder;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxTranscoderHumanOrientation {
    public LyraxTranscoderOrientation forward;
    public LyraxTranscoderOrientation right;
    public LyraxTranscoderOrientation up;

    public LyraxTranscoderHumanOrientation() {
        this.forward = new LyraxTranscoderOrientation(1.0f, 0.0f, 0.0f);
        this.right = new LyraxTranscoderOrientation(0.0f, 1.0f, 0.0f);
        this.up = new LyraxTranscoderOrientation(0.0f, 0.0f, 1.0f);
        this.forward = new LyraxTranscoderOrientation(1.0f, 0.0f, 0.0f);
        this.right = new LyraxTranscoderOrientation(0.0f, 1.0f, 0.0f);
        this.up = new LyraxTranscoderOrientation(0.0f, 0.0f, 1.0f);
    }

    public LyraxTranscoderOrientation getForward() {
        return this.forward;
    }

    public LyraxTranscoderOrientation getRight() {
        return this.right;
    }

    public LyraxTranscoderOrientation getUp() {
        return this.up;
    }

    public void setForward(LyraxTranscoderOrientation lyraxTranscoderOrientation) {
        this.forward = lyraxTranscoderOrientation;
    }

    public void setRight(LyraxTranscoderOrientation lyraxTranscoderOrientation) {
        this.right = lyraxTranscoderOrientation;
    }

    public void setUp(LyraxTranscoderOrientation lyraxTranscoderOrientation) {
        this.up = lyraxTranscoderOrientation;
    }

    public LyraxTranscoderHumanOrientation(LyraxTranscoderOrientation lyraxTranscoderOrientation, LyraxTranscoderOrientation lyraxTranscoderOrientation2, LyraxTranscoderOrientation lyraxTranscoderOrientation3) {
        this.forward = new LyraxTranscoderOrientation(1.0f, 0.0f, 0.0f);
        this.right = new LyraxTranscoderOrientation(0.0f, 1.0f, 0.0f);
        new LyraxTranscoderOrientation(0.0f, 0.0f, 1.0f);
        this.forward = lyraxTranscoderOrientation;
        this.right = lyraxTranscoderOrientation2;
        this.up = lyraxTranscoderOrientation3;
    }
}
