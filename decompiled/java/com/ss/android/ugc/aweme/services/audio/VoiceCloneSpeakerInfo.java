package com.ss.android.ugc.aweme.services.audio;

/* JADX INFO: loaded from: classes3.dex */
public final class VoiceCloneSpeakerInfo {
    public Boolean isPrivate;
    public String speakerId;
    public String ttsId;

    public VoiceCloneSpeakerInfo() {
        this(null, null, null);
    }

    public final Boolean isPrivate() {
        return this.isPrivate;
    }

    public final void setPrivate(Boolean bool) {
        this.isPrivate = bool;
    }

    public final void setSpeakerId(String str) {
        this.speakerId = str;
    }

    public final void setTtsId(String str) {
        this.ttsId = str;
    }

    public VoiceCloneSpeakerInfo(Boolean bool, String str, String str2) {
        this.isPrivate = bool;
        this.speakerId = str;
        this.ttsId = str2;
    }
}
