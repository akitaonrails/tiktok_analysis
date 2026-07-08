package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class Configuration {
    public static final int $stable = 0;

    @C09CT("option_count_max")
    public final int optionCountMax;

    @C09CT("option_count_min")
    public final int optionCountMin;

    @C09CT("option_text_character_max")
    public final int optionTextCharacterMax;

    @C09CT("poll_title_character_max")
    public final int titleCharacterMax;

    public Configuration() {
        this(50, 2, 5, 20);
    }

    public Configuration(int i, int i2, int i3, int i4) {
        this.titleCharacterMax = i;
        this.optionCountMin = i2;
        this.optionCountMax = i3;
        this.optionTextCharacterMax = i4;
    }
}
