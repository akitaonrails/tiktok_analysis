package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class StreaksPushRemindConfig implements Serializable {

    @C09CT("im_streaks_inline_frequency_days")
    public final int imStreaksInlineFrequency;

    @C09CT("im_streaks_popup_frequency_days")
    public final int imStreaksPopupFrequency;

    @C09CT("variant")
    public final int variant;

    public StreaksPushRemindConfig() {
        this(0, 15, 15);
    }

    public StreaksPushRemindConfig(int i, int i2, int i3) {
        this.variant = i;
        this.imStreaksPopupFrequency = i2;
        this.imStreaksInlineFrequency = i3;
    }
}
