package com.ss.android.ugc.aweme.creatoredit;

import X.C09CT;
import X.C2188811AlT;
import X.C480701u1;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleEditInfo extends BaseResponse {

    @C09CT("edit_subtitles")
    public final List<CreatorCaptionEditData> editSubtitlesList;

    @C09CT("language")
    public final String language;

    @C09CT("last_modified_time")
    public final Long lastModifiedTime;

    @C09CT("edit_status")
    public final Integer mtEditStatus;

    @C09CT("subtitle_id")
    public final Long mtId;

    @C09CT("remaining_edit_count")
    public final Integer remainingEditCount;

    public final SubtitleEditInfo copy(Long l, String str, Integer num, Long l2, Integer num2, List<CreatorCaptionEditData> list) {
        return new SubtitleEditInfo(l, str, num, l2, num2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubtitleEditInfo)) {
            return false;
        }
        SubtitleEditInfo subtitleEditInfo = (SubtitleEditInfo) obj;
        return Intrinsics.LJFF(this.mtId, subtitleEditInfo.mtId) && Intrinsics.LJFF(this.language, subtitleEditInfo.language) && Intrinsics.LJFF(this.remainingEditCount, subtitleEditInfo.remainingEditCount) && Intrinsics.LJFF(this.lastModifiedTime, subtitleEditInfo.lastModifiedTime) && Intrinsics.LJFF(this.mtEditStatus, subtitleEditInfo.mtEditStatus) && Intrinsics.LJFF(this.editSubtitlesList, subtitleEditInfo.editSubtitlesList);
    }

    public int hashCode() {
        Long l = this.mtId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.language;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.remainingEditCount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.lastModifiedTime;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.mtEditStatus;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<CreatorCaptionEditData> list = this.editSubtitlesList;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubtitleEditInfo(mtId=");
        sbLIZ.append(this.mtId);
        sbLIZ.append(", language=");
        sbLIZ.append(this.language);
        sbLIZ.append(", remainingEditCount=");
        sbLIZ.append(this.remainingEditCount);
        sbLIZ.append(", lastModifiedTime=");
        sbLIZ.append(this.lastModifiedTime);
        sbLIZ.append(", mtEditStatus=");
        sbLIZ.append(this.mtEditStatus);
        sbLIZ.append(", editSubtitlesList=");
        sbLIZ.append(this.editSubtitlesList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final MTEditStatusEnum getMTEditStatus() {
        C480701u1 c480701u1 = MTEditStatusEnum.Companion;
        Integer num = this.mtEditStatus;
        c480701u1.getClass();
        if (num == null) {
            return MTEditStatusEnum.MT_EDIT_STATUS_UNKNOWN;
        }
        num.intValue();
        for (MTEditStatusEnum mTEditStatusEnum : MTEditStatusEnum.values()) {
            if (mTEditStatusEnum.getValue() == num.intValue()) {
                return mTEditStatusEnum;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final List<CreatorCaptionEditData> getEditSubtitlesList() {
        return this.editSubtitlesList;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public final Integer getMtEditStatus() {
        return this.mtEditStatus;
    }

    public final Long getMtId() {
        return this.mtId;
    }

    public final Integer getRemainingEditCount() {
        return this.remainingEditCount;
    }

    public SubtitleEditInfo(Long l, String str, Integer num, Long l2, Integer num2, List<CreatorCaptionEditData> list) {
        this.mtId = l;
        this.language = str;
        this.remainingEditCount = num;
        this.lastModifiedTime = l2;
        this.mtEditStatus = num2;
        this.editSubtitlesList = list;
    }
}
