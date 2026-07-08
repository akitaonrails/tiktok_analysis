package com.ss.android.ugc.gamora.editor.audioservice.service.anchor;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class CapcutVoiceAnchorInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("text_to_speech")
    public List<String> ttsSpeakerIds;

    @C09CT("voice_conversion")
    public List<String> vcSpeakerIds;

    public CapcutVoiceAnchorInfo() {
        this(null, null);
    }

    public final void setTtsSpeakerIds(List<String> list) {
        this.ttsSpeakerIds = list;
    }

    public final void setVcSpeakerIds(List<String> list) {
        this.vcSpeakerIds = list;
    }

    public CapcutVoiceAnchorInfo(List<String> list, List<String> list2) {
        this.ttsSpeakerIds = list;
        this.vcSpeakerIds = list2;
    }
}
