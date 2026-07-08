package com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LabelCountdown implements Serializable {

    @C09CT("countdown_text")
    public String countdownText;

    @C09CT("end_time")
    public String endTime;

    @C09CT("countdown_time_show_style")
    public Integer showStyle;

    @C09CT("start_time")
    public String startTime;

    public LabelCountdown() {
        this(null, null, null, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LabelCountdown)) {
            return false;
        }
        LabelCountdown labelCountdown = (LabelCountdown) obj;
        return Intrinsics.LJFF(this.startTime, labelCountdown.startTime) && Intrinsics.LJFF(this.endTime, labelCountdown.endTime) && Intrinsics.LJFF(this.countdownText, labelCountdown.countdownText) && Intrinsics.LJFF(this.showStyle, labelCountdown.showStyle);
    }

    public int hashCode() {
        String str = this.startTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endTime;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countdownText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.showStyle;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public LabelCountdown(String str, String str2, String str3, Integer num) {
        this.startTime = str;
        this.endTime = str2;
        this.countdownText = str3;
        this.showStyle = num;
    }
}
