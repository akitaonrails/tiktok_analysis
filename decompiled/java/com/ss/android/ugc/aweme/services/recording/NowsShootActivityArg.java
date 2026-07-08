package com.ss.android.ugc.aweme.services.recording;

import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class NowsShootActivityArg implements IRouteArg {
    public static final Parcelable.Creator<NowsShootActivityArg> CREATOR = new Creator();
    public final String authorId;
    public final String enterFrom;
    public final String enterMethod;
    public final String enterPosition;
    public final String fromAwemeId;
    public final boolean isBlueVUser;
    public int isNewPage;
    public final String nowCardType;
    public final String nowPostBy;
    public final String nowShootEnterScene;
    public String nowTabEnterMethod;
    public final String nowType;
    public String previousPage;
    public final String requestId;
    public String shootMethod;
    public final String shootPosition;
    public final String shootWay;
    public final boolean shouldBackToCurPageAfterPublish;
    public Long startNowsRecordTime;

    public static final class Creator implements Parcelable.Creator<NowsShootActivityArg> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NowsShootActivityArg createFromParcel(Parcel parcel) {
            return new NowsShootActivityArg(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NowsShootActivityArg[] newArray(int i) {
            return new NowsShootActivityArg[i];
        }
    }

    public NowsShootActivityArg() {
        this("now", "click_regular_push", "push", false, false, "friends", null, "", null, "", "", "", "", null, 0, "", "", "", "record_button");
    }

    public final NowsShootActivityArg copy(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l, int i, String str12, String str13, String str14, String str15) {
        return new NowsShootActivityArg(str, str2, str3, z, z2, str4, str5, str6, str7, str8, str9, str10, str11, l, i, str12, str13, str14, str15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowsShootActivityArg)) {
            return false;
        }
        NowsShootActivityArg nowsShootActivityArg = (NowsShootActivityArg) obj;
        return Intrinsics.LJFF(this.shootWay, nowsShootActivityArg.shootWay) && Intrinsics.LJFF(this.enterMethod, nowsShootActivityArg.enterMethod) && Intrinsics.LJFF(this.enterFrom, nowsShootActivityArg.enterFrom) && this.isBlueVUser == nowsShootActivityArg.isBlueVUser && this.shouldBackToCurPageAfterPublish == nowsShootActivityArg.shouldBackToCurPageAfterPublish && Intrinsics.LJFF(this.nowCardType, nowsShootActivityArg.nowCardType) && Intrinsics.LJFF(this.nowType, nowsShootActivityArg.nowType) && Intrinsics.LJFF(this.enterPosition, nowsShootActivityArg.enterPosition) && Intrinsics.LJFF(this.fromAwemeId, nowsShootActivityArg.fromAwemeId) && Intrinsics.LJFF(this.nowPostBy, nowsShootActivityArg.nowPostBy) && Intrinsics.LJFF(this.shootPosition, nowsShootActivityArg.shootPosition) && Intrinsics.LJFF(this.requestId, nowsShootActivityArg.requestId) && Intrinsics.LJFF(this.authorId, nowsShootActivityArg.authorId) && Intrinsics.LJFF(this.startNowsRecordTime, nowsShootActivityArg.startNowsRecordTime) && this.isNewPage == nowsShootActivityArg.isNewPage && Intrinsics.LJFF(this.previousPage, nowsShootActivityArg.previousPage) && Intrinsics.LJFF(this.nowTabEnterMethod, nowsShootActivityArg.nowTabEnterMethod) && Intrinsics.LJFF(this.nowShootEnterScene, nowsShootActivityArg.nowShootEnterScene) && Intrinsics.LJFF(this.shootMethod, nowsShootActivityArg.shootMethod);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.shootWay.hashCode() * 31) + this.enterMethod.hashCode()) * 31) + this.enterFrom.hashCode()) * 31) + C786410Ut5.Z2(this.isBlueVUser)) * 31) + C786410Ut5.Z2(this.shouldBackToCurPageAfterPublish)) * 31) + this.nowCardType.hashCode()) * 31;
        String str = this.nowType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.enterPosition;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fromAwemeId;
        int iHashCode4 = (((((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.nowPostBy.hashCode()) * 31) + this.shootPosition.hashCode()) * 31) + this.requestId.hashCode()) * 31) + this.authorId.hashCode()) * 31;
        Long l = this.startNowsRecordTime;
        int iHashCode5 = (((iHashCode4 + (l == null ? 0 : l.hashCode())) * 31) + this.isNewPage) * 31;
        String str4 = this.previousPage;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nowTabEnterMethod;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nowShootEnterScene;
        return ((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.shootMethod.hashCode();
    }

    public String toString() {
        return "NowsShootActivityArg(shootWay=" + this.shootWay + ", enterMethod=" + this.enterMethod + ", enterFrom=" + this.enterFrom + ", isBlueVUser=" + this.isBlueVUser + ", shouldBackToCurPageAfterPublish=" + this.shouldBackToCurPageAfterPublish + ", nowCardType=" + this.nowCardType + ", nowType=" + this.nowType + ", enterPosition=" + this.enterPosition + ", fromAwemeId=" + this.fromAwemeId + ", nowPostBy=" + this.nowPostBy + ", shootPosition=" + this.shootPosition + ", requestId=" + this.requestId + ", authorId=" + this.authorId + ", startNowsRecordTime=" + this.startNowsRecordTime + ", isNewPage=" + this.isNewPage + ", previousPage=" + this.previousPage + ", nowTabEnterMethod=" + this.nowTabEnterMethod + ", nowShootEnterScene=" + this.nowShootEnterScene + ", shootMethod=" + this.shootMethod + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.shootWay);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.enterFrom);
        parcel.writeInt(this.isBlueVUser ? 1 : 0);
        parcel.writeInt(this.shouldBackToCurPageAfterPublish ? 1 : 0);
        parcel.writeString(this.nowCardType);
        parcel.writeString(this.nowType);
        parcel.writeString(this.enterPosition);
        parcel.writeString(this.fromAwemeId);
        parcel.writeString(this.nowPostBy);
        parcel.writeString(this.shootPosition);
        parcel.writeString(this.requestId);
        parcel.writeString(this.authorId);
        Long l = this.startNowsRecordTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.isNewPage);
        parcel.writeString(this.previousPage);
        parcel.writeString(this.nowTabEnterMethod);
        parcel.writeString(this.nowShootEnterScene);
        parcel.writeString(this.shootMethod);
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getEnterPosition() {
        return this.enterPosition;
    }

    public final String getFromAwemeId() {
        return this.fromAwemeId;
    }

    public final String getNowCardType() {
        return this.nowCardType;
    }

    public final String getNowPostBy() {
        return this.nowPostBy;
    }

    public final String getNowShootEnterScene() {
        return this.nowShootEnterScene;
    }

    public final String getNowTabEnterMethod() {
        return this.nowTabEnterMethod;
    }

    public final String getNowType() {
        return this.nowType;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getShootMethod() {
        return this.shootMethod;
    }

    public final String getShootPosition() {
        return this.shootPosition;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final boolean getShouldBackToCurPageAfterPublish() {
        return this.shouldBackToCurPageAfterPublish;
    }

    public final Long getStartNowsRecordTime() {
        return this.startNowsRecordTime;
    }

    public final boolean isBlueVUser() {
        return this.isBlueVUser;
    }

    public final int isNewPage() {
        return this.isNewPage;
    }

    public final void setNewPage(int i) {
        this.isNewPage = i;
    }

    public final void setNowTabEnterMethod(String str) {
        this.nowTabEnterMethod = str;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setShootMethod(String str) {
        this.shootMethod = str;
    }

    public final void setStartNowsRecordTime(Long l) {
        this.startNowsRecordTime = l;
    }

    public NowsShootActivityArg(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l, int i, String str12, String str13, String str14, String str15) {
        this.shootWay = str;
        this.enterMethod = str2;
        this.enterFrom = str3;
        this.isBlueVUser = z;
        this.shouldBackToCurPageAfterPublish = z2;
        this.nowCardType = str4;
        this.nowType = str5;
        this.enterPosition = str6;
        this.fromAwemeId = str7;
        this.nowPostBy = str8;
        this.shootPosition = str9;
        this.requestId = str10;
        this.authorId = str11;
        this.startNowsRecordTime = l;
        this.isNewPage = i;
        this.previousPage = str12;
        this.nowTabEnterMethod = str13;
        this.nowShootEnterScene = str14;
        this.shootMethod = str15;
    }
}
