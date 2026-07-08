package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class DoBStatus extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("appeal_url")
    public final String appealUrl;

    @C09CT("birthday_edibility")
    public final Integer birthdayEdibilityStatus;

    @C09CT("celebrate_birthday")
    public final Integer celebrateBirthday;

    @C09CT("content")
    public final String content;

    @C09CT("default_birthdate")
    public final String defaultDoB;

    @C09CT("desc_type")
    public final Integer descType;

    @C09CT("edibility_status_display")
    public final EdibilityStatusDisplay edibilityStatusDisplay;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("notification_msg")
    public final String msg;

    @C09CT("title")
    public final String title;

    @C09CT("edibility_birthdate_type")
    public final Integer type;

    @C09CT("upper_bound_date")
    public final String upperBoundDate;

    public DoBStatus() {
        this(0, "", "", "", "", 0, "", "", null, null, 0, 0);
    }

    public final DoBStatus copy(Integer num, String str, String str2, String str3, String str4, Integer num2, String str5, String str6, String str7, EdibilityStatusDisplay edibilityStatusDisplay, Integer num3, Integer num4) {
        return new DoBStatus(num, str, str2, str3, str4, num2, str5, str6, str7, edibilityStatusDisplay, num3, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoBStatus)) {
            return false;
        }
        DoBStatus doBStatus = (DoBStatus) obj;
        return Intrinsics.LJFF(this.type, doBStatus.type) && Intrinsics.LJFF(this.defaultDoB, doBStatus.defaultDoB) && Intrinsics.LJFF(this.msg, doBStatus.msg) && Intrinsics.LJFF(this.appealUrl, doBStatus.appealUrl) && Intrinsics.LJFF(this.upperBoundDate, doBStatus.upperBoundDate) && Intrinsics.LJFF(this.descType, doBStatus.descType) && Intrinsics.LJFF(this.title, doBStatus.title) && Intrinsics.LJFF(this.content, doBStatus.content) && Intrinsics.LJFF(this.imageUrl, doBStatus.imageUrl) && Intrinsics.LJFF(this.edibilityStatusDisplay, doBStatus.edibilityStatusDisplay) && Intrinsics.LJFF(this.celebrateBirthday, doBStatus.celebrateBirthday) && Intrinsics.LJFF(this.birthdayEdibilityStatus, doBStatus.birthdayEdibilityStatus);
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.defaultDoB;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.msg;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appealUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.upperBoundDate;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.descType;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.content;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.imageUrl;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        EdibilityStatusDisplay edibilityStatusDisplay = this.edibilityStatusDisplay;
        int iHashCode10 = (iHashCode9 + (edibilityStatusDisplay == null ? 0 : edibilityStatusDisplay.hashCode())) * 31;
        Integer num3 = this.celebrateBirthday;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.birthdayEdibilityStatus;
        return iHashCode11 + (num4 != null ? num4.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "DoBStatus(type=" + this.type + ", defaultDoB=" + this.defaultDoB + ", msg=" + this.msg + ", appealUrl=" + this.appealUrl + ", upperBoundDate=" + this.upperBoundDate + ", descType=" + this.descType + ", title=" + this.title + ", content=" + this.content + ", imageUrl=" + this.imageUrl + ", edibilityStatusDisplay=" + this.edibilityStatusDisplay + ", celebrateBirthday=" + this.celebrateBirthday + ", birthdayEdibilityStatus=" + this.birthdayEdibilityStatus + ')';
    }

    public final String getAppealUrl() {
        return this.appealUrl;
    }

    public final Integer getBirthdayEdibilityStatus() {
        return this.birthdayEdibilityStatus;
    }

    public final Integer getCelebrateBirthday() {
        return this.celebrateBirthday;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getDefaultDoB() {
        return this.defaultDoB;
    }

    public final Integer getDescType() {
        return this.descType;
    }

    public final EdibilityStatusDisplay getEdibilityStatusDisplay() {
        return this.edibilityStatusDisplay;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getUpperBoundDate() {
        return this.upperBoundDate;
    }

    public DoBStatus(Integer num, String str, String str2, String str3, String str4, Integer num2, String str5, String str6, String str7, EdibilityStatusDisplay edibilityStatusDisplay, Integer num3, Integer num4) {
        this.type = num;
        this.defaultDoB = str;
        this.msg = str2;
        this.appealUrl = str3;
        this.upperBoundDate = str4;
        this.descType = num2;
        this.title = str5;
        this.content = str6;
        this.imageUrl = str7;
        this.edibilityStatusDisplay = edibilityStatusDisplay;
        this.celebrateBirthday = num3;
        this.birthdayEdibilityStatus = num4;
    }
}
