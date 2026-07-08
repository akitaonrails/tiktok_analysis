package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EffectPreloadingMessage extends AbstractC1136060ffY {

    @C09CT("effect_id")
    public List<Long> effectId;

    @C09CT("gift_id")
    public List<Long> giftId;

    @C09CT("log_id")
    public String logId;

    @C09CT("priority")
    public GiftIMPriority priority;

    public EffectPreloadingMessage() {
        this.type = C001A.EFFECT_PRELOADING_MESSAGE;
        this.giftId = new ArrayList();
        this.effectId = new ArrayList();
        this.logId = "";
    }
}
