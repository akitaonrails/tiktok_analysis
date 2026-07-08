package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum AudioSceneType {
    AUDIO_SCENE_DEFAULT(0),
    AUDIO_SCENE_CHATROOM(1),
    AUDIO_SCENE_HIGH_QUALITY_CHATROOM(2),
    AUDIO_SCENE_LOW_LATENCY(3),
    AUDIO_SCENE_KARAOKE(4);

    public final int value;

    public int value() {
        return this.value;
    }

    public static AudioSceneType valueOf(String str) {
        return (AudioSceneType) C08FF.LIZ(AudioSceneType.class, str);
    }

    AudioSceneType(int i) {
        this.value = i;
    }
}
