package com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data;

import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class MusicLocal implements Serializable {
    public static final int $stable = 8;
    public long duration;
    public boolean loop;
    public long musicId;
    public String previewUrl;
    public float volume;

    public MusicLocal() {
        this(0L, "", 0.0f, 0L, false);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final boolean getLoop() {
        return this.loop;
    }

    public final long getMusicId() {
        return this.musicId;
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public final float getVolume() {
        return this.volume;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setLoop(boolean z) {
        this.loop = z;
    }

    public final void setMusicId(long j) {
        this.musicId = j;
    }

    public final void setPreviewUrl(String str) {
        this.previewUrl = str;
    }

    public final void setVolume(float f) {
        this.volume = f;
    }

    public MusicLocal(long j, String str, float f, long j2, boolean z) {
        this.musicId = j;
        this.previewUrl = str;
        this.volume = f;
        this.duration = j2;
        this.loop = z;
    }
}
