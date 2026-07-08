package com.ss.android.ugc.tiktok.location.popup.config;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class FypGpsPopupTimingStrategyData {

    @C09CT("is_poi_relevant")
    public final Boolean isPoiRelevent;

    @C09CT("no_frequency_time")
    public final Long noFrequencyTime;

    @C09CT("no_popup_time")
    public final Long noPopupTime;

    @C09CT("threshold")
    public final Double thresHold;

    @C09CT("vv_count")
    public final Integer vvCount;

    public FypGpsPopupTimingStrategyData() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FypGpsPopupTimingStrategyData)) {
            return false;
        }
        FypGpsPopupTimingStrategyData fypGpsPopupTimingStrategyData = (FypGpsPopupTimingStrategyData) obj;
        return Intrinsics.LJFF(this.vvCount, fypGpsPopupTimingStrategyData.vvCount) && Intrinsics.LJFF(this.isPoiRelevent, fypGpsPopupTimingStrategyData.isPoiRelevent) && Intrinsics.LJFF(this.noPopupTime, fypGpsPopupTimingStrategyData.noPopupTime) && Intrinsics.LJFF(this.noFrequencyTime, fypGpsPopupTimingStrategyData.noFrequencyTime) && Intrinsics.LJFF(this.thresHold, fypGpsPopupTimingStrategyData.thresHold);
    }

    public FypGpsPopupTimingStrategyData(Integer num, Boolean bool, Long l, Long l2, Double d) {
        this.vvCount = num;
        this.isPoiRelevent = bool;
        this.noPopupTime = l;
        this.noFrequencyTime = l2;
        this.thresHold = d;
    }
}
