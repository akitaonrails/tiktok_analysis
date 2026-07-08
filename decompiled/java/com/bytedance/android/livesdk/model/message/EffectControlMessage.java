package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public final class EffectControlMessage extends AbstractC1136060ffY {

    @C09CT("type")
    public int controlType;

    @C09CT("replace_resume_effect")
    public boolean replaceResumeEffect;

    @C09CT("resource_id")
    public String resourceId;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    public EffectControlMessage() {
        this.type = C001A.EFFECT_CONTROL_MESSAGE;
        this.resourceId = "";
    }
}
