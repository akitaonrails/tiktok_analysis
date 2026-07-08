package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public class GuideMessage extends AbstractC1136060ffY {

    @C09CT("description")
    public String description;

    @C09CT("display_style")
    public long displayStyle;

    @C09CT("duration")
    public long duration;

    @C09CT("frequency_rule")
    public GuideMessageFrequencyRule frequencyRule;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("guide_type")
    public long guideType;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public GuideMessage() {
        this.type = C001A.GUIDE_MESSAGE;
    }
}
