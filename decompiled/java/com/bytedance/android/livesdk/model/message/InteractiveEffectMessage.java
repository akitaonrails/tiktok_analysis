package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class InteractiveEffectMessage extends AbstractC1136060ffY {

    @C09CT("trigger_data")
    public String triggerData;

    public InteractiveEffectMessage() {
        this.type = C001A.INTERACTIVE_EFFECT_MESSAGE;
        this.triggerData = "";
    }
}
