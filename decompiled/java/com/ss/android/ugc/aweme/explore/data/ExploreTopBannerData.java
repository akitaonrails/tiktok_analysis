package com.ss.android.ugc.aweme.explore.data;

import X.C09CT;
import X.C2188811AlT;
import X.C288830BTt;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreTopBannerData implements Serializable {

    @C09CT("end_time")
    public final long endTime;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("jump_url")
    public final String jumpUrl;

    @C09CT("landing_id")
    public final String landingId;

    @C09CT("start_time")
    public final long startTime;

    @C09CT("subtitle")
    public final String subtitle;

    @C09CT("title")
    public final String title;

    public ExploreTopBannerData() {
        this(null, null, null, null, 0L, 0L, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreTopBannerData)) {
            return false;
        }
        ExploreTopBannerData exploreTopBannerData = (ExploreTopBannerData) obj;
        return Intrinsics.LJFF(this.title, exploreTopBannerData.title) && Intrinsics.LJFF(this.subtitle, exploreTopBannerData.subtitle) && Intrinsics.LJFF(this.iconUrl, exploreTopBannerData.iconUrl) && Intrinsics.LJFF(this.jumpUrl, exploreTopBannerData.jumpUrl) && this.startTime == exploreTopBannerData.startTime && this.endTime == exploreTopBannerData.endTime && Intrinsics.LJFF(this.landingId, exploreTopBannerData.landingId);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.jumpUrl;
        int iHashCode4 = (((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + C786410Ut5.Y2(this.startTime)) * 31) + C786410Ut5.Y2(this.endTime)) * 31;
        String str5 = this.landingId;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreTopBannerData(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.subtitle);
        sbLIZ.append(", iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", jumpUrl=");
        sbLIZ.append(this.jumpUrl);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", landingId=");
        sbLIZ.append(this.landingId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isActiveNow() {
        return C288830BTt.LIZ();
    }

    public ExploreTopBannerData(String str, String str2, String str3, String str4, long j, long j2, String str5) {
        this.title = str;
        this.subtitle = str2;
        this.iconUrl = str3;
        this.jumpUrl = str4;
        this.startTime = j;
        this.endTime = j2;
        this.landingId = str5;
    }
}
