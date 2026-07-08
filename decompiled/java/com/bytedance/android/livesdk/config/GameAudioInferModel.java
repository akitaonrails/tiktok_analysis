package com.bytedance.android.livesdk.config;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class GameAudioInferModel {

    @C09CT("model")
    public String modeFile;

    @C09CT("sound_effect")
    public Map<String, AudioInferScene> soundEffect;

    public GameAudioInferModel() {
        this(null, null);
    }

    public final String getModeFile() {
        return this.modeFile;
    }

    public final Map<String, AudioInferScene> getSoundEffect() {
        return this.soundEffect;
    }

    public final void setModeFile(String str) {
        this.modeFile = str;
    }

    public final void setSoundEffect(Map<String, AudioInferScene> map) {
        this.soundEffect = map;
    }

    public GameAudioInferModel(String str, Map<String, AudioInferScene> map) {
        this.modeFile = str;
        this.soundEffect = map;
    }
}
