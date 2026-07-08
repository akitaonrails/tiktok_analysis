package com.ss.android.ugc.aweme.pns.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PNSSleepHoursAdditionalSettings {

    @C09CT("ab_group")
    public final Integer abGroup;

    @C09CT("cumulative_use_limit")
    public final Integer cumulativeUseLimit;

    @C09CT("meditation_video_urls")
    public final String meditationVideo;

    @C09CT("sleep_hours_end_timestamp")
    public final Long sleepHoursEndTimestamp;

    @C09CT("sleep_hours_start_timestamp")
    public final Long sleepHoursStartTimestamp;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSSleepHoursAdditionalSettings)) {
            return false;
        }
        PNSSleepHoursAdditionalSettings pNSSleepHoursAdditionalSettings = (PNSSleepHoursAdditionalSettings) obj;
        return Intrinsics.LJFF(this.sleepHoursStartTimestamp, pNSSleepHoursAdditionalSettings.sleepHoursStartTimestamp) && Intrinsics.LJFF(this.sleepHoursEndTimestamp, pNSSleepHoursAdditionalSettings.sleepHoursEndTimestamp) && Intrinsics.LJFF(this.abGroup, pNSSleepHoursAdditionalSettings.abGroup) && Intrinsics.LJFF(this.cumulativeUseLimit, pNSSleepHoursAdditionalSettings.cumulativeUseLimit) && Intrinsics.LJFF(this.meditationVideo, pNSSleepHoursAdditionalSettings.meditationVideo);
    }

    public final int hashCode() {
        Long l = this.sleepHoursStartTimestamp;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.sleepHoursEndTimestamp;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.abGroup;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cumulativeUseLimit;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.meditationVideo;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PNSSleepHoursAdditionalSettings(sleepHoursStartTimestamp=");
        sbLIZ.append(this.sleepHoursStartTimestamp);
        sbLIZ.append(", sleepHoursEndTimestamp=");
        sbLIZ.append(this.sleepHoursEndTimestamp);
        sbLIZ.append(", abGroup=");
        sbLIZ.append(this.abGroup);
        sbLIZ.append(", cumulativeUseLimit=");
        sbLIZ.append(this.cumulativeUseLimit);
        sbLIZ.append(", meditationVideo=");
        sbLIZ.append(this.meditationVideo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PNSSleepHoursAdditionalSettings() {
        this(0L, 0L, 0, 0, "");
    }

    public PNSSleepHoursAdditionalSettings(Long l, Long l2, Integer num, Integer num2, String str) {
        this.sleepHoursStartTimestamp = l;
        this.sleepHoursEndTimestamp = l2;
        this.abGroup = num;
        this.cumulativeUseLimit = num2;
        this.meditationVideo = str;
    }
}
