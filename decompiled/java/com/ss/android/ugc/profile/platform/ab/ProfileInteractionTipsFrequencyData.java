package com.ss.android.ugc.profile.platform.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileInteractionTipsFrequencyData {

    @C09CT("interaction_tooltips_max_times")
    public final int interactionTipsMaxTimes;

    @C09CT("tooltips_frequency")
    public final int tooltipsFrequency;

    public ProfileInteractionTipsFrequencyData() {
        this(4, 1);
    }

    public ProfileInteractionTipsFrequencyData(int i, int i2) {
        this.interactionTipsMaxTimes = i;
        this.tooltipsFrequency = i2;
    }
}
