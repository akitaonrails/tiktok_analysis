package com.ss.android.ugc.aweme.search.innerflowpage;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.search.model.UrlStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchKeyFramePoint {
    public final UrlStruct LIZ;
    public float LIZIZ;
    public boolean LIZJ;

    @C09CT("content_details")
    public String contentDetails;

    @C09CT("from_key_segment_info")
    public boolean fromKeySegmentInfo;

    @C09CT("index_start")
    public int indexStart;

    @C09CT("second_end")
    public final int secondEnd;

    @C09CT("second_mid")
    public final Integer secondMid;

    @C09CT("second_start")
    public final int secondStart;

    @C09CT("sub_title_playing")
    public String subTitlePlaying;

    @C09CT("title")
    public String title;

    @C09CT("title_playing")
    public String titlePlaying;

    public SearchKeyFramePoint() {
        this("", "", -1, -1, null, null, false, null, -1, -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchKeyFramePoint)) {
            return false;
        }
        SearchKeyFramePoint searchKeyFramePoint = (SearchKeyFramePoint) obj;
        return Intrinsics.LJFF(this.title, searchKeyFramePoint.title) && Intrinsics.LJFF(this.contentDetails, searchKeyFramePoint.contentDetails) && this.secondStart == searchKeyFramePoint.secondStart && this.secondEnd == searchKeyFramePoint.secondEnd && Intrinsics.LJFF(this.titlePlaying, searchKeyFramePoint.titlePlaying) && Intrinsics.LJFF(this.subTitlePlaying, searchKeyFramePoint.subTitlePlaying) && this.fromKeySegmentInfo == searchKeyFramePoint.fromKeySegmentInfo && Intrinsics.LJFF(this.LIZ, searchKeyFramePoint.LIZ) && this.indexStart == searchKeyFramePoint.indexStart && Intrinsics.LJFF(this.secondMid, searchKeyFramePoint.secondMid);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.title.hashCode() * 31) + this.contentDetails.hashCode()) * 31) + this.secondStart) * 31) + this.secondEnd) * 31;
        String str = this.titlePlaying;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subTitlePlaying;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.fromKeySegmentInfo)) * 31;
        UrlStruct urlStruct = this.LIZ;
        int iHashCode4 = (((iHashCode3 + (urlStruct == null ? 0 : urlStruct.hashCode())) * 31) + this.indexStart) * 31;
        Integer num = this.secondMid;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public SearchKeyFramePoint(String str, String str2, int i, int i2, String str3, String str4, boolean z, UrlStruct urlStruct, int i3, Integer num) {
        this.title = str;
        this.contentDetails = str2;
        this.secondStart = i;
        this.secondEnd = i2;
        this.titlePlaying = str3;
        this.subTitlePlaying = str4;
        this.fromKeySegmentInfo = z;
        this.LIZ = urlStruct;
        this.indexStart = i3;
        this.secondMid = num;
    }
}
