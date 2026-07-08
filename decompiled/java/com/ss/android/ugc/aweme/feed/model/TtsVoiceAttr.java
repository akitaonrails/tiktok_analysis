package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class TtsVoiceAttr implements Serializable {

    @C09CT("create_source")
    public String createSource;

    @C09CT("tts_voice_id")
    public String effectId;

    @C09CT("tts_voice_origin")
    public String ttsVoiceOrigin;

    public TtsVoiceAttr() {
        this(null, null, null);
    }

    public final void setCreateSource(String str) {
        this.createSource = str;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setTtsVoiceOrigin(String str) {
        this.ttsVoiceOrigin = str;
    }

    public TtsVoiceAttr(String str, String str2, String str3) {
        this.effectId = str;
        this.createSource = str2;
        this.ttsVoiceOrigin = str3;
    }
}
