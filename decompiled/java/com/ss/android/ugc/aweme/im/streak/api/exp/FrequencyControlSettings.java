package com.ss.android.ugc.aweme.im.streak.api.exp;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes3.dex */
public final class FrequencyControlSettings {

    @C09CT("card_cooldown_period_milliseconds")
    public final long cardCooldownPeriodMs;

    @C09CT("card_display_interval_milliseconds")
    public final long cardDisplayIntervalMs;

    @C09CT("card_max_consecutive_ignored")
    public final int cardMaxConsecutiveIgnored;

    @C09CT("card_max_cooldown_triggers")
    public final int cardMaxCooldownTriggers;

    @C09CT("text_bubble_maximum_show_times")
    public final int textBubbleMaximumShowTimes;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyControlSettings)) {
            return false;
        }
        FrequencyControlSettings frequencyControlSettings = (FrequencyControlSettings) obj;
        return this.cardCooldownPeriodMs == frequencyControlSettings.cardCooldownPeriodMs && this.cardDisplayIntervalMs == frequencyControlSettings.cardDisplayIntervalMs && this.cardMaxConsecutiveIgnored == frequencyControlSettings.cardMaxConsecutiveIgnored && this.cardMaxCooldownTriggers == frequencyControlSettings.cardMaxCooldownTriggers && this.textBubbleMaximumShowTimes == frequencyControlSettings.textBubbleMaximumShowTimes;
    }

    public int hashCode() {
        return (((((((C786410Ut5.Y2(this.cardCooldownPeriodMs) * 31) + C786410Ut5.Y2(this.cardDisplayIntervalMs)) * 31) + this.cardMaxConsecutiveIgnored) * 31) + this.cardMaxCooldownTriggers) * 31) + this.textBubbleMaximumShowTimes;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyControlSettings(cardCooldownPeriodMs=");
        sbLIZ.append(this.cardCooldownPeriodMs);
        sbLIZ.append(", cardDisplayIntervalMs=");
        sbLIZ.append(this.cardDisplayIntervalMs);
        sbLIZ.append(", cardMaxConsecutiveIgnored=");
        sbLIZ.append(this.cardMaxConsecutiveIgnored);
        sbLIZ.append(", cardMaxCooldownTriggers=");
        sbLIZ.append(this.cardMaxCooldownTriggers);
        sbLIZ.append(", textBubbleMaximumShowTimes=");
        sbLIZ.append(this.textBubbleMaximumShowTimes);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FrequencyControlSettings() {
        this(432000000L, 259200000L, 3, 5, 5);
    }

    public FrequencyControlSettings(long j, long j2, int i, int i2, int i3) {
        this.cardCooldownPeriodMs = j;
        this.cardDisplayIntervalMs = j2;
        this.cardMaxConsecutiveIgnored = i;
        this.cardMaxCooldownTriggers = i2;
        this.textBubbleMaximumShowTimes = i3;
    }
}
