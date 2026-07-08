package com.ss.android.ugc.gamora.editor.ailive.util;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class AILiveInboxBannerFreqCache {

    @C09CT("last_reset_day_date")
    public String lastResetDayDate;

    @C09CT("last_reset_phrase_date")
    public String lastResetPhraseDate;

    @C09CT("no_operation_time")
    public int noOperationTime;

    @C09CT("show_consecutive_day")
    public int showConsecutiveDay;

    @C09CT("show_low_freq_one_phrase")
    public int showLowFreqOnePhrase;

    @C09CT("show_one_day")
    public int showOneDay;

    public AILiveInboxBannerFreqCache() {
        this(0, 0, "", "", 0, 0);
    }

    public AILiveInboxBannerFreqCache(int i, int i2, String str, String str2, int i3, int i4) {
        this.showOneDay = i;
        this.showConsecutiveDay = i2;
        this.lastResetDayDate = str;
        this.lastResetPhraseDate = str2;
        this.showLowFreqOnePhrase = i3;
        this.noOperationTime = i4;
    }
}
