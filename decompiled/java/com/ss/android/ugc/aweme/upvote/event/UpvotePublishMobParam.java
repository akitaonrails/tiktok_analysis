package com.ss.android.ugc.aweme.upvote.event;

import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.RecReasonEntry;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvotePublishMobParam implements Parcelable {
    public static final Parcelable.Creator<UpvotePublishMobParam> CREATOR = new Parcelable.Creator<UpvotePublishMobParam>() { // from class: X.0lTn
        @Override // android.os.Parcelable.Creator
        public final UpvotePublishMobParam createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Boolean boolValueOf;
            Integer numValueOf;
            boolean z5;
            boolean z6;
            Boolean boolValueOf2;
            Integer numValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            boolean z7 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            RecReasonEntry recReasonEntry = (RecReasonEntry) parcel.readSerializable();
            RecReasonsStruct recReasonsStruct = (RecReasonsStruct) parcel.readSerializable();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            double d = parcel.readDouble();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            Integer numValueOf3 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolValueOf = Boolean.valueOf(z4);
            }
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            int i = parcel.readInt();
            String string21 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string22 = parcel.readString();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z7 = false;
                }
                boolValueOf2 = Boolean.valueOf(z7);
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new UpvotePublishMobParam(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, z, string11, string12, z2, recReasonEntry, recReasonsStruct, string13, string14, string15, string16, string17, string18, d, z3, boolValueOf, string19, string20, i, string21, numValueOf, string22, z5, z6, boolValueOf2, numValueOf2, numValueOf3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UpvotePublishMobParam[] newArray(int i) {
            return new UpvotePublishMobParam[i];
        }
    };
    public String authorId;
    public final Integer avatarPosition;
    public final String awemeRequestId;
    public String awemeType;
    public final String commentId;
    public final int commentRepostNum;
    public final String commentUid;
    public String enterFrom;
    public String enterMethod;
    public String followStatus;
    public final String friendsV3Scene;
    public final String friendsV3Version;
    public String fromPage;
    public String groupId;
    public final Integer groupMemberCount;
    public Boolean hasText;
    public final String homepageUid;
    public boolean isAiDecision;
    public boolean isConvertedTextPost;
    public String isFirst;
    public boolean isFirstShow;
    public String isRecommend;
    public final int mentionCnt;
    public final String mentionUid;
    public final Integer messageCount;
    public final String panelDetail;
    public String panelSource;
    public String panelStyle;
    public String poiId;
    public final String profileEntranceId;
    public String publishRepostTextEnterMethod;
    public String recommendCount;
    public RecReasonEntry redistributeReason;
    public RecReasonsStruct redistributeReasonWhyThisVideo;
    public final String relationTag;
    public final String repostType;
    public String searchId;
    public String searchKeyword;
    public String searchResultId;
    public String searchType;
    public final boolean showNoteGuide;
    public String subPosition;
    public final String tabName;
    public String traceId;
    public String trigger;
    public double videoPlayTime;
    public final Boolean withRecommend;
    public final boolean withRecommendation;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public UpvotePublishMobParam() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        this(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, false, objArr7, objArr8, 0 == true ? 1 : 0, objArr9, objArr10, objArr11, objArr12, 0.0d, 0 == true ? 1 : 0, objArr13, objArr14, objArr15, 0 == true ? 1 : 0, objArr16, objArr17, objArr18, 0 == true ? 1 : 0, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, 0 == true ? 1 : 0, objArr27, objArr28, objArr29, -1, 65535);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpvotePublishMobParam)) {
            return false;
        }
        UpvotePublishMobParam upvotePublishMobParam = (UpvotePublishMobParam) obj;
        return Intrinsics.LJFF(this.enterFrom, upvotePublishMobParam.enterFrom) && Intrinsics.LJFF(this.enterMethod, upvotePublishMobParam.enterMethod) && Intrinsics.LJFF(this.groupId, upvotePublishMobParam.groupId) && Intrinsics.LJFF(this.authorId, upvotePublishMobParam.authorId) && Intrinsics.LJFF(this.followStatus, upvotePublishMobParam.followStatus) && Intrinsics.LJFF(this.isFirst, upvotePublishMobParam.isFirst) && Intrinsics.LJFF(this.isRecommend, upvotePublishMobParam.isRecommend) && Intrinsics.LJFF(this.recommendCount, upvotePublishMobParam.recommendCount) && Intrinsics.LJFF(this.trigger, upvotePublishMobParam.trigger) && Intrinsics.LJFF(this.panelSource, upvotePublishMobParam.panelSource) && this.isAiDecision == upvotePublishMobParam.isAiDecision && Intrinsics.LJFF(this.traceId, upvotePublishMobParam.traceId) && Intrinsics.LJFF(this.awemeType, upvotePublishMobParam.awemeType) && this.isConvertedTextPost == upvotePublishMobParam.isConvertedTextPost && Intrinsics.LJFF(this.redistributeReason, upvotePublishMobParam.redistributeReason) && Intrinsics.LJFF(this.redistributeReasonWhyThisVideo, upvotePublishMobParam.redistributeReasonWhyThisVideo) && Intrinsics.LJFF(this.searchId, upvotePublishMobParam.searchId) && Intrinsics.LJFF(this.searchResultId, upvotePublishMobParam.searchResultId) && Intrinsics.LJFF(this.searchKeyword, upvotePublishMobParam.searchKeyword) && Intrinsics.LJFF(this.searchType, upvotePublishMobParam.searchType) && Intrinsics.LJFF(this.fromPage, upvotePublishMobParam.fromPage) && Intrinsics.LJFF(this.poiId, upvotePublishMobParam.poiId) && Double.compare(this.videoPlayTime, upvotePublishMobParam.videoPlayTime) == 0 && this.isFirstShow == upvotePublishMobParam.isFirstShow && Intrinsics.LJFF(this.hasText, upvotePublishMobParam.hasText) && Intrinsics.LJFF(this.panelStyle, upvotePublishMobParam.panelStyle) && Intrinsics.LJFF(this.subPosition, upvotePublishMobParam.subPosition) && this.mentionCnt == upvotePublishMobParam.mentionCnt && Intrinsics.LJFF(this.mentionUid, upvotePublishMobParam.mentionUid) && Intrinsics.LJFF(this.avatarPosition, upvotePublishMobParam.avatarPosition) && Intrinsics.LJFF(this.tabName, upvotePublishMobParam.tabName) && this.showNoteGuide == upvotePublishMobParam.showNoteGuide && this.withRecommendation == upvotePublishMobParam.withRecommendation && Intrinsics.LJFF(this.withRecommend, upvotePublishMobParam.withRecommend) && Intrinsics.LJFF(this.messageCount, upvotePublishMobParam.messageCount) && Intrinsics.LJFF(this.groupMemberCount, upvotePublishMobParam.groupMemberCount) && Intrinsics.LJFF(this.homepageUid, upvotePublishMobParam.homepageUid) && Intrinsics.LJFF(this.profileEntranceId, upvotePublishMobParam.profileEntranceId) && Intrinsics.LJFF(this.panelDetail, upvotePublishMobParam.panelDetail) && Intrinsics.LJFF(this.friendsV3Version, upvotePublishMobParam.friendsV3Version) && Intrinsics.LJFF(this.friendsV3Scene, upvotePublishMobParam.friendsV3Scene) && Intrinsics.LJFF(this.awemeRequestId, upvotePublishMobParam.awemeRequestId) && Intrinsics.LJFF(this.commentUid, upvotePublishMobParam.commentUid) && Intrinsics.LJFF(this.commentId, upvotePublishMobParam.commentId) && this.commentRepostNum == upvotePublishMobParam.commentRepostNum && Intrinsics.LJFF(this.repostType, upvotePublishMobParam.repostType) && Intrinsics.LJFF(this.relationTag, upvotePublishMobParam.relationTag) && Intrinsics.LJFF(this.publishRepostTextEnterMethod, upvotePublishMobParam.publishRepostTextEnterMethod);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((this.enterFrom.hashCode() * 31) + this.enterMethod.hashCode()) * 31) + this.groupId.hashCode()) * 31) + this.authorId.hashCode()) * 31) + this.followStatus.hashCode()) * 31) + this.isFirst.hashCode()) * 31) + this.isRecommend.hashCode()) * 31) + this.recommendCount.hashCode()) * 31) + this.trigger.hashCode()) * 31) + this.panelSource.hashCode()) * 31) + C786410Ut5.Z2(this.isAiDecision)) * 31) + this.traceId.hashCode()) * 31) + this.awemeType.hashCode()) * 31) + C786410Ut5.Z2(this.isConvertedTextPost)) * 31;
        RecReasonEntry recReasonEntry = this.redistributeReason;
        int iHashCode2 = (iHashCode + (recReasonEntry == null ? 0 : recReasonEntry.hashCode())) * 31;
        RecReasonsStruct recReasonsStruct = this.redistributeReasonWhyThisVideo;
        int iHashCode3 = (iHashCode2 + (recReasonsStruct == null ? 0 : recReasonsStruct.hashCode())) * 31;
        String str = this.searchId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.searchResultId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.searchKeyword;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.searchType;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fromPage;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.poiId;
        int iHashCode9 = (((((iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31) + C786410Ut5.X2(this.videoPlayTime)) * 31) + C786410Ut5.Z2(this.isFirstShow)) * 31;
        Boolean bool = this.hasText;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.panelStyle;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.subPosition;
        int iHashCode12 = (((((iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.mentionCnt) * 31) + this.mentionUid.hashCode()) * 31;
        Integer num = this.avatarPosition;
        int iHashCode13 = (((((((iHashCode12 + (num == null ? 0 : num.hashCode())) * 31) + this.tabName.hashCode()) * 31) + C786410Ut5.Z2(this.showNoteGuide)) * 31) + C786410Ut5.Z2(this.withRecommendation)) * 31;
        Boolean bool2 = this.withRecommend;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.messageCount;
        int iHashCode15 = (iHashCode14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.groupMemberCount;
        int iHashCode16 = (((((iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.homepageUid.hashCode()) * 31) + this.profileEntranceId.hashCode()) * 31;
        String str9 = this.panelDetail;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.friendsV3Version;
        int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.friendsV3Scene;
        int iHashCode19 = (((iHashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.awemeRequestId.hashCode()) * 31;
        String str12 = this.commentUid;
        int iHashCode20 = (iHashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.commentId;
        int iHashCode21 = (((iHashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31) + this.commentRepostNum) * 31;
        String str14 = this.repostType;
        int iHashCode22 = (iHashCode21 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.relationTag;
        int iHashCode23 = (iHashCode22 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.publishRepostTextEnterMethod;
        return iHashCode23 + (str16 != null ? str16.hashCode() : 0);
    }

    public final String toString() {
        return "UpvotePublishMobParam(enterFrom=" + this.enterFrom + ", enterMethod=" + this.enterMethod + ", groupId=" + this.groupId + ", authorId=" + this.authorId + ", followStatus=" + this.followStatus + ", isFirst=" + this.isFirst + ", isRecommend=" + this.isRecommend + ", recommendCount=" + this.recommendCount + ", trigger=" + this.trigger + ", panelSource=" + this.panelSource + ", isAiDecision=" + this.isAiDecision + ", traceId=" + this.traceId + ", awemeType=" + this.awemeType + ", isConvertedTextPost=" + this.isConvertedTextPost + ", redistributeReason=" + this.redistributeReason + ", redistributeReasonWhyThisVideo=" + this.redistributeReasonWhyThisVideo + ", searchId=" + this.searchId + ", searchResultId=" + this.searchResultId + ", searchKeyword=" + this.searchKeyword + ", searchType=" + this.searchType + ", fromPage=" + this.fromPage + ", poiId=" + this.poiId + ", videoPlayTime=" + this.videoPlayTime + ", isFirstShow=" + this.isFirstShow + ", hasText=" + this.hasText + ", panelStyle=" + this.panelStyle + ", subPosition=" + this.subPosition + ", mentionCnt=" + this.mentionCnt + ", mentionUid=" + this.mentionUid + ", avatarPosition=" + this.avatarPosition + ", tabName=" + this.tabName + ", showNoteGuide=" + this.showNoteGuide + ", withRecommendation=" + this.withRecommendation + ", withRecommend=" + this.withRecommend + ", messageCount=" + this.messageCount + ", groupMemberCount=" + this.groupMemberCount + ", homepageUid=" + this.homepageUid + ", profileEntranceId=" + this.profileEntranceId + ", panelDetail=" + this.panelDetail + ", friendsV3Version=" + this.friendsV3Version + ", friendsV3Scene=" + this.friendsV3Scene + ", awemeRequestId=" + this.awemeRequestId + ", commentUid=" + this.commentUid + ", commentId=" + this.commentId + ", commentRepostNum=" + this.commentRepostNum + ", repostType=" + this.repostType + ", relationTag=" + this.relationTag + ", publishRepostTextEnterMethod=" + this.publishRepostTextEnterMethod + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.groupId);
        parcel.writeString(this.authorId);
        parcel.writeString(this.followStatus);
        parcel.writeString(this.isFirst);
        parcel.writeString(this.isRecommend);
        parcel.writeString(this.recommendCount);
        parcel.writeString(this.trigger);
        parcel.writeString(this.panelSource);
        parcel.writeInt(this.isAiDecision ? 1 : 0);
        parcel.writeString(this.traceId);
        parcel.writeString(this.awemeType);
        parcel.writeInt(this.isConvertedTextPost ? 1 : 0);
        parcel.writeSerializable(this.redistributeReason);
        parcel.writeSerializable(this.redistributeReasonWhyThisVideo);
        parcel.writeString(this.searchId);
        parcel.writeString(this.searchResultId);
        parcel.writeString(this.searchKeyword);
        parcel.writeString(this.searchType);
        parcel.writeString(this.fromPage);
        parcel.writeString(this.poiId);
        parcel.writeDouble(this.videoPlayTime);
        parcel.writeInt(this.isFirstShow ? 1 : 0);
        Boolean bool = this.hasText;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.panelStyle);
        parcel.writeString(this.subPosition);
        parcel.writeInt(this.mentionCnt);
        parcel.writeString(this.mentionUid);
        Integer num = this.avatarPosition;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.tabName);
        parcel.writeInt(this.showNoteGuide ? 1 : 0);
        parcel.writeInt(this.withRecommendation ? 1 : 0);
        Boolean bool2 = this.withRecommend;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.messageCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.groupMemberCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.homepageUid);
        parcel.writeString(this.profileEntranceId);
        parcel.writeString(this.panelDetail);
        parcel.writeString(this.friendsV3Version);
        parcel.writeString(this.friendsV3Scene);
        parcel.writeString(this.awemeRequestId);
        parcel.writeString(this.commentUid);
        parcel.writeString(this.commentId);
        parcel.writeInt(this.commentRepostNum);
        parcel.writeString(this.repostType);
        parcel.writeString(this.relationTag);
        parcel.writeString(this.publishRepostTextEnterMethod);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UpvotePublishMobParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, boolean z2, RecReasonEntry recReasonEntry, RecReasonsStruct recReasonsStruct, String str10, String str11, double d, boolean z3, Boolean bool, String str12, String str13, int i, String str14, Integer num, String str15, boolean z4, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, int i2, String str24, String str25, String str26, int i3, int i4) {
        String str27;
        String str28;
        String str29;
        String str30 = str26;
        String str31 = str25;
        String str32 = str24;
        int i5 = i2;
        String str33 = str23;
        String str34 = str22;
        String str35 = str20;
        String str36 = str19;
        String str37 = str18;
        String str38 = str17;
        String str39 = str16;
        boolean z5 = z4;
        String str40 = str15;
        String str41 = str14;
        int i6 = i;
        String str42 = str13;
        String str43 = str12;
        Boolean bool2 = bool;
        boolean z6 = z3;
        double d2 = d;
        String str44 = str11;
        String str45 = str10;
        RecReasonsStruct recReasonsStruct2 = recReasonsStruct;
        RecReasonEntry recReasonEntry2 = recReasonEntry;
        boolean z7 = z2;
        String str46 = str9;
        String str47 = str8;
        boolean z8 = z;
        String str48 = str7;
        String str49 = str6;
        String str50 = str5;
        String str51 = str4;
        String str52 = str3;
        String str53 = str2;
        Integer num2 = num;
        String str54 = (i3 & 1) != 0 ? "" : str;
        str53 = (i3 & 2) != 0 ? "" : str53;
        str52 = (i3 & 4) != 0 ? "" : str52;
        str51 = (i3 & 8) != 0 ? "" : str51;
        str50 = (i3 & 16) != 0 ? "" : str50;
        if ((i3 & 32) != 0) {
            str27 = "";
        } else {
            str27 = null;
        }
        if ((i3 & 64) != 0) {
            str28 = "";
        } else {
            str28 = null;
        }
        if ((i3 & 128) != 0) {
            str29 = "";
        } else {
            str29 = null;
        }
        this(str54, str53, str52, str51, str50, str27, str28, str29, (i3 & 256) != 0 ? "" : str49, (i3 & 512) != 0 ? "" : str48, (i3 & 1024) != 0 ? false : z8, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str47, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str46, (i3 & 8192) != 0 ? false : z7, (i3 & 16384) != 0 ? null : recReasonEntry2, (i3 & 32768) != 0 ? null : recReasonsStruct2, null, null, null, null, (1048576 & i3) != 0 ? null : str45, (2097152 & i3) != 0 ? null : str44, (4194304 & i3) != 0 ? 0.0d : d2, (8388608 & i3) != 0 ? false : z6, (16777216 & i3) != 0 ? null : bool2, (33554432 & i3) != 0 ? null : str43, (67108864 & i3) != 0 ? null : str42, (134217728 & i3) != 0 ? 0 : i6, (268435456 & i3) != 0 ? "" : str41, (536870912 & i3) != 0 ? null : num2, (1073741824 & i3) != 0 ? "" : str40, (i3 & Integer.MIN_VALUE) != 0 ? false : z5, false, null, null, null, (i4 & 16) != 0 ? "" : str39, (i4 & 32) != 0 ? "" : str38, (i4 & 64) != 0 ? null : str37, (i4 & 128) != 0 ? null : str36, (i4 & 256) != 0 ? null : str35, (i4 & 512) == 0 ? str21 : "", (i4 & 1024) != 0 ? null : str34, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str33, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0 : i5, (i4 & 8192) != 0 ? null : str32, (i4 & 16384) != 0 ? null : str31, (i4 & 32768) != 0 ? null : str30);
    }

    public UpvotePublishMobParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, boolean z2, RecReasonEntry recReasonEntry, RecReasonsStruct recReasonsStruct, String str13, String str14, String str15, String str16, String str17, String str18, double d, boolean z3, Boolean bool, String str19, String str20, int i, String str21, Integer num, String str22, boolean z4, boolean z5, Boolean bool2, Integer num2, Integer num3, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, int i2, String str31, String str32, String str33) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.groupId = str3;
        this.authorId = str4;
        this.followStatus = str5;
        this.isFirst = str6;
        this.isRecommend = str7;
        this.recommendCount = str8;
        this.trigger = str9;
        this.panelSource = str10;
        this.isAiDecision = z;
        this.traceId = str11;
        this.awemeType = str12;
        this.isConvertedTextPost = z2;
        this.redistributeReason = recReasonEntry;
        this.redistributeReasonWhyThisVideo = recReasonsStruct;
        this.searchId = str13;
        this.searchResultId = str14;
        this.searchKeyword = str15;
        this.searchType = str16;
        this.fromPage = str17;
        this.poiId = str18;
        this.videoPlayTime = d;
        this.isFirstShow = z3;
        this.hasText = bool;
        this.panelStyle = str19;
        this.subPosition = str20;
        this.mentionCnt = i;
        this.mentionUid = str21;
        this.avatarPosition = num;
        this.tabName = str22;
        this.showNoteGuide = z4;
        this.withRecommendation = z5;
        this.withRecommend = bool2;
        this.messageCount = num2;
        this.groupMemberCount = num3;
        this.homepageUid = str23;
        this.profileEntranceId = str24;
        this.panelDetail = str25;
        this.friendsV3Version = str26;
        this.friendsV3Scene = str27;
        this.awemeRequestId = str28;
        this.commentUid = str29;
        this.commentId = str30;
        this.commentRepostNum = i2;
        this.repostType = str31;
        this.relationTag = str32;
        this.publishRepostTextEnterMethod = str33;
    }
}
