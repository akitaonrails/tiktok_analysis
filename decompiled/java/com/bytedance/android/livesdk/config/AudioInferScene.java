package com.bytedance.android.livesdk.config;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class AudioInferScene {

    @C09CT("message_type")
    public Integer messageType;

    @C09CT("effect_array")
    public List<Integer> sceneList;

    @C09CT("shadow_message_type")
    public Integer shadowMessageType;

    public AudioInferScene() {
        this(null, null, null);
    }

    public final Integer getMessageType() {
        return this.messageType;
    }

    public final List<Integer> getSceneList() {
        return this.sceneList;
    }

    public final Integer getShadowMessageType() {
        return this.shadowMessageType;
    }

    public final void setMessageType(Integer num) {
        this.messageType = num;
    }

    public final void setSceneList(List<Integer> list) {
        this.sceneList = list;
    }

    public final void setShadowMessageType(Integer num) {
        this.shadowMessageType = num;
    }

    public AudioInferScene(Integer num, Integer num2, List<Integer> list) {
        this.messageType = num;
        this.shadowMessageType = num2;
        this.sceneList = list;
    }
}
