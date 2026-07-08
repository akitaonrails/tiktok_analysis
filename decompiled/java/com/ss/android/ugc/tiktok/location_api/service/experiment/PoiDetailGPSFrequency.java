package com.ss.android.ugc.tiktok.location_api.service.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailGPSFrequency {

    @C09CT("float_notice_closed_frequency_days")
    public Integer floatNoticeFrequencyDays;

    @C09CT("float_notice_closed_max_close_count")
    public Integer floatNoticeMaxCloseCount;

    @C09CT("float_notice_no_close_frequency_days")
    public Integer floatNoticeNoCloseFrequencyDays;

    @C09CT("popup_frequency_days")
    public int popupFrequencyDays;

    @C09CT("popup_max_close_count")
    public int popupMaxCloseCount;

    @C09CT("popup_show_once")
    public boolean popupShowOnce;

    public PoiDetailGPSFrequency() {
        this(false, 0, 0, null, null, null);
    }

    public PoiDetailGPSFrequency(boolean z, int i, int i2, Integer num, Integer num2, Integer num3) {
        this.popupShowOnce = z;
        this.popupFrequencyDays = i;
        this.popupMaxCloseCount = i2;
        this.floatNoticeNoCloseFrequencyDays = num;
        this.floatNoticeFrequencyDays = num2;
        this.floatNoticeMaxCloseCount = num3;
    }
}
