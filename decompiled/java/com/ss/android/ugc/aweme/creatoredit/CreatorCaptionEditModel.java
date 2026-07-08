package com.ss.android.ugc.aweme.creatoredit;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CreatorCaptionEditModel extends BaseResponse {

    @C09CT("aweme_info")
    public final Aweme aweme;

    @C09CT("is_under_review")
    public final Boolean isUnderReview;

    @C09CT("subtitle_id")
    public final String newSubtitleId;

    @C09CT("remaining_edit_times")
    public final Integer remainingEditTimes;

    @C09CT("subtitles")
    public final List<CreatorCaptionEditData> subtitles;

    public final CreatorCaptionEditModel copy(String str, Aweme aweme, List<CreatorCaptionEditData> list, Integer num, Boolean bool) {
        return new CreatorCaptionEditModel(str, aweme, list, num, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatorCaptionEditModel)) {
            return false;
        }
        CreatorCaptionEditModel creatorCaptionEditModel = (CreatorCaptionEditModel) obj;
        return Intrinsics.LJFF(this.newSubtitleId, creatorCaptionEditModel.newSubtitleId) && Intrinsics.LJFF(this.aweme, creatorCaptionEditModel.aweme) && Intrinsics.LJFF(this.subtitles, creatorCaptionEditModel.subtitles) && Intrinsics.LJFF(this.remainingEditTimes, creatorCaptionEditModel.remainingEditTimes) && Intrinsics.LJFF(this.isUnderReview, creatorCaptionEditModel.isUnderReview);
    }

    public int hashCode() {
        String str = this.newSubtitleId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Aweme aweme = this.aweme;
        int iHashCode2 = (iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        List<CreatorCaptionEditData> list = this.subtitles;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.remainingEditTimes;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isUnderReview;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorCaptionEditModel(newSubtitleId=");
        sbLIZ.append(this.newSubtitleId);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(", subtitles=");
        sbLIZ.append(this.subtitles);
        sbLIZ.append(", remainingEditTimes=");
        sbLIZ.append(this.remainingEditTimes);
        sbLIZ.append(", isUnderReview=");
        sbLIZ.append(this.isUnderReview);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final String getNewSubtitleId() {
        return this.newSubtitleId;
    }

    public final Integer getRemainingEditTimes() {
        return this.remainingEditTimes;
    }

    public final List<CreatorCaptionEditData> getSubtitles() {
        return this.subtitles;
    }

    public final Boolean isUnderReview() {
        return this.isUnderReview;
    }

    public CreatorCaptionEditModel(String str, Aweme aweme, List<CreatorCaptionEditData> list, Integer num, Boolean bool) {
        this.newSubtitleId = str;
        this.aweme = aweme;
        this.subtitles = list;
        this.remainingEditTimes = num;
        this.isUnderReview = bool;
    }
}
