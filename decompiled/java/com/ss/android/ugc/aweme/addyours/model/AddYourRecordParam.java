package com.ss.android.ugc.aweme.addyours.model;

import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYourRecordParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<AddYourRecordParam> CREATOR = new Parcelable.Creator<AddYourRecordParam>() { // from class: X.0ODB
        @Override // android.os.Parcelable.Creator
        public final AddYourRecordParam createFromParcel(Parcel parcel) {
            AddYoursStickerStruct addYoursStickerStructCreateFromParcel;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Integer numValueOf;
            Integer numValueOf2;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            Integer numValueOf3 = null;
            if (parcel.readInt() == 0) {
                addYoursStickerStructCreateFromParcel = null;
            } else {
                addYoursStickerStructCreateFromParcel = AddYoursStickerStruct.CREATOR.createFromParcel(parcel);
            }
            AddYoursStickerStruct addYoursStickerStruct = addYoursStickerStructCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Number number = (Number) parcel.readSerializable();
            String string9 = parcel.readString();
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
            String string10 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new AddYourRecordParam(addYoursStickerStruct, z, z2, string, string2, string3, string4, z3, z4, string5, string6, numValueOf, numValueOf2, string7, string8, arrayListCreateStringArrayList, number, string9, z5, z6, string10, numValueOf3, string11, string12, string13, z7, z8);
        }

        @Override // android.os.Parcelable.Creator
        public final AddYourRecordParam[] newArray(int i) {
            return new AddYourRecordParam[i];
        }
    };

    @C09CT("addYoursEnterMethod")
    public final String addYoursEnterMethod;

    @C09CT("add_yours_from_group_content")
    public String addYoursFromGroupContent;

    @C09CT("addYoursStickerStruct")
    public AddYoursStickerStruct addYoursStickerStruct;

    @C09CT("autoEnterStickerEdit")
    public final boolean autoEnterStickerEdit;

    @C09CT("auto_open_album")
    public boolean autoOpenAlbum;

    @C09CT("completed_event")
    public boolean completedEvent;

    @C09CT("effect_id")
    public String effectId;

    @C09CT("enterFrom")
    public final String enterFrom;

    @C09CT("followStatus")
    public final String followStatus;

    @C09CT("forceLandRecordPage")
    public final boolean forceLandRecordPage;

    @C09CT("from_group_id")
    public final String fromGroupId;

    @C09CT("from_photo_mode")
    public boolean fromPhotoMode;

    @C09CT("hashtags")
    public final ArrayList<String> hashTags;

    @C09CT("isFollowAY")
    public final boolean isFollowAY;

    @C09CT("isFromQA")
    public final boolean isFromQA;

    @C09CT("is_operation_set")
    public final Integer isOperationSet;

    @C09CT("landing_back")
    public Number landingBack;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("music_selected_from")
    public String musicSelectedFrom;

    @C09CT("shootWay")
    public final String shootWay;

    @C09CT("source_of_trends_add_yours_in_video")
    public Integer sourceOfTrendsAddYoursInVideo;

    @C09CT("topic_id")
    public final String topicId;

    @C09CT("trend_source")
    public final Integer trendSource;

    @C09CT("wwa_back_url")
    public String wwaBackUrl;

    @C09CT("wwa_campaign_id")
    public String wwaCampaignId;

    @C09CT("wwa_show_story_button")
    public boolean wwaShowStoryButton;

    @C09CT("wwa_source_platform_channel")
    public String wwaSourcePlatformChannel;

    public AddYourRecordParam() {
        this(null, false, false, null, null, null, null, true, false, null, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, true, false);
    }

    public final AddYourRecordParam copy(AddYoursStickerStruct addYoursStickerStruct, boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3, boolean z4, String str5, String str6, Integer num, Integer num2, String str7, String str8, ArrayList<String> arrayList, Number number, String str9, boolean z5, boolean z6, String str10, Integer num3, String str11, String str12, String str13, boolean z7, boolean z8) {
        return new AddYourRecordParam(addYoursStickerStruct, z, z2, str, str2, str3, str4, z3, z4, str5, str6, num, num2, str7, str8, arrayList, number, str9, z5, z6, str10, num3, str11, str12, str13, z7, z8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYourRecordParam)) {
            return false;
        }
        AddYourRecordParam addYourRecordParam = (AddYourRecordParam) obj;
        return Intrinsics.LJFF(this.addYoursStickerStruct, addYourRecordParam.addYoursStickerStruct) && this.autoEnterStickerEdit == addYourRecordParam.autoEnterStickerEdit && this.forceLandRecordPage == addYourRecordParam.forceLandRecordPage && Intrinsics.LJFF(this.enterFrom, addYourRecordParam.enterFrom) && Intrinsics.LJFF(this.shootWay, addYourRecordParam.shootWay) && Intrinsics.LJFF(this.addYoursEnterMethod, addYourRecordParam.addYoursEnterMethod) && Intrinsics.LJFF(this.followStatus, addYourRecordParam.followStatus) && this.isFollowAY == addYourRecordParam.isFollowAY && this.isFromQA == addYourRecordParam.isFromQA && Intrinsics.LJFF(this.fromGroupId, addYourRecordParam.fromGroupId) && Intrinsics.LJFF(this.topicId, addYourRecordParam.topicId) && Intrinsics.LJFF(this.trendSource, addYourRecordParam.trendSource) && Intrinsics.LJFF(this.isOperationSet, addYourRecordParam.isOperationSet) && Intrinsics.LJFF(this.effectId, addYourRecordParam.effectId) && Intrinsics.LJFF(this.musicId, addYourRecordParam.musicId) && Intrinsics.LJFF(this.hashTags, addYourRecordParam.hashTags) && Intrinsics.LJFF(this.landingBack, addYourRecordParam.landingBack) && Intrinsics.LJFF(this.musicSelectedFrom, addYourRecordParam.musicSelectedFrom) && this.completedEvent == addYourRecordParam.completedEvent && this.fromPhotoMode == addYourRecordParam.fromPhotoMode && Intrinsics.LJFF(this.addYoursFromGroupContent, addYourRecordParam.addYoursFromGroupContent) && Intrinsics.LJFF(this.sourceOfTrendsAddYoursInVideo, addYourRecordParam.sourceOfTrendsAddYoursInVideo) && Intrinsics.LJFF(this.wwaCampaignId, addYourRecordParam.wwaCampaignId) && Intrinsics.LJFF(this.wwaSourcePlatformChannel, addYourRecordParam.wwaSourcePlatformChannel) && Intrinsics.LJFF(this.wwaBackUrl, addYourRecordParam.wwaBackUrl) && this.wwaShowStoryButton == addYourRecordParam.wwaShowStoryButton && this.autoOpenAlbum == addYourRecordParam.autoOpenAlbum;
    }

    public int hashCode() {
        AddYoursStickerStruct addYoursStickerStruct = this.addYoursStickerStruct;
        int iHashCode = (((((addYoursStickerStruct == null ? 0 : addYoursStickerStruct.hashCode()) * 31) + C786410Ut5.Z2(this.autoEnterStickerEdit)) * 31) + C786410Ut5.Z2(this.forceLandRecordPage)) * 31;
        String str = this.enterFrom;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shootWay;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addYoursEnterMethod;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.followStatus;
        int iHashCode5 = (((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + C786410Ut5.Z2(this.isFollowAY)) * 31) + C786410Ut5.Z2(this.isFromQA)) * 31;
        String str5 = this.fromGroupId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.topicId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.trendSource;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.isOperationSet;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.effectId;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.musicId;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ArrayList<String> arrayList = this.hashTags;
        int iHashCode12 = (iHashCode11 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Number number = this.landingBack;
        int iHashCode13 = (iHashCode12 + (number == null ? 0 : number.hashCode())) * 31;
        String str9 = this.musicSelectedFrom;
        int iHashCode14 = (((((iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31) + C786410Ut5.Z2(this.completedEvent)) * 31) + C786410Ut5.Z2(this.fromPhotoMode)) * 31;
        String str10 = this.addYoursFromGroupContent;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num3 = this.sourceOfTrendsAddYoursInVideo;
        int iHashCode16 = (iHashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str11 = this.wwaCampaignId;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.wwaSourcePlatformChannel;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.wwaBackUrl;
        return ((((iHashCode18 + (str13 != null ? str13.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.wwaShowStoryButton)) * 31) + C786410Ut5.Z2(this.autoOpenAlbum);
    }

    public String toString() {
        return "AddYourRecordParam(addYoursStickerStruct=" + this.addYoursStickerStruct + ", autoEnterStickerEdit=" + this.autoEnterStickerEdit + ", forceLandRecordPage=" + this.forceLandRecordPage + ", enterFrom=" + this.enterFrom + ", shootWay=" + this.shootWay + ", addYoursEnterMethod=" + this.addYoursEnterMethod + ", followStatus=" + this.followStatus + ", isFollowAY=" + this.isFollowAY + ", isFromQA=" + this.isFromQA + ", fromGroupId=" + this.fromGroupId + ", topicId=" + this.topicId + ", trendSource=" + this.trendSource + ", isOperationSet=" + this.isOperationSet + ", effectId=" + this.effectId + ", musicId=" + this.musicId + ", hashTags=" + this.hashTags + ", landingBack=" + this.landingBack + ", musicSelectedFrom=" + this.musicSelectedFrom + ", completedEvent=" + this.completedEvent + ", fromPhotoMode=" + this.fromPhotoMode + ", addYoursFromGroupContent=" + this.addYoursFromGroupContent + ", sourceOfTrendsAddYoursInVideo=" + this.sourceOfTrendsAddYoursInVideo + ", wwaCampaignId=" + this.wwaCampaignId + ", wwaSourcePlatformChannel=" + this.wwaSourcePlatformChannel + ", wwaBackUrl=" + this.wwaBackUrl + ", wwaShowStoryButton=" + this.wwaShowStoryButton + ", autoOpenAlbum=" + this.autoOpenAlbum + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AddYoursStickerStruct addYoursStickerStruct = this.addYoursStickerStruct;
        if (addYoursStickerStruct == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addYoursStickerStruct.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.autoEnterStickerEdit ? 1 : 0);
        parcel.writeInt(this.forceLandRecordPage ? 1 : 0);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.shootWay);
        parcel.writeString(this.addYoursEnterMethod);
        parcel.writeString(this.followStatus);
        parcel.writeInt(this.isFollowAY ? 1 : 0);
        parcel.writeInt(this.isFromQA ? 1 : 0);
        parcel.writeString(this.fromGroupId);
        parcel.writeString(this.topicId);
        Integer num = this.trendSource;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.isOperationSet;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.effectId);
        parcel.writeString(this.musicId);
        parcel.writeStringList(this.hashTags);
        parcel.writeSerializable(this.landingBack);
        parcel.writeString(this.musicSelectedFrom);
        parcel.writeInt(this.completedEvent ? 1 : 0);
        parcel.writeInt(this.fromPhotoMode ? 1 : 0);
        parcel.writeString(this.addYoursFromGroupContent);
        Integer num3 = this.sourceOfTrendsAddYoursInVideo;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.wwaCampaignId);
        parcel.writeString(this.wwaSourcePlatformChannel);
        parcel.writeString(this.wwaBackUrl);
        parcel.writeInt(this.wwaShowStoryButton ? 1 : 0);
        parcel.writeInt(this.autoOpenAlbum ? 1 : 0);
    }

    public final String getAddYoursEnterMethod() {
        return this.addYoursEnterMethod;
    }

    public final String getAddYoursFromGroupContent() {
        return this.addYoursFromGroupContent;
    }

    public final AddYoursStickerStruct getAddYoursStickerStruct() {
        return this.addYoursStickerStruct;
    }

    public final boolean getAutoEnterStickerEdit() {
        return this.autoEnterStickerEdit;
    }

    public final boolean getAutoOpenAlbum() {
        return this.autoOpenAlbum;
    }

    public final boolean getCompletedEvent() {
        return this.completedEvent;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getFollowStatus() {
        return this.followStatus;
    }

    public final boolean getForceLandRecordPage() {
        return this.forceLandRecordPage;
    }

    public final String getFromGroupId() {
        return this.fromGroupId;
    }

    public final boolean getFromPhotoMode() {
        return this.fromPhotoMode;
    }

    public final ArrayList<String> getHashTags() {
        return this.hashTags;
    }

    public final Number getLandingBack() {
        return this.landingBack;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getMusicSelectedFrom() {
        return this.musicSelectedFrom;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final Integer getSourceOfTrendsAddYoursInVideo() {
        return this.sourceOfTrendsAddYoursInVideo;
    }

    public final String getTopicId() {
        return this.topicId;
    }

    public final Integer getTrendSource() {
        return this.trendSource;
    }

    public final String getWwaBackUrl() {
        return this.wwaBackUrl;
    }

    public final String getWwaCampaignId() {
        return this.wwaCampaignId;
    }

    public final boolean getWwaShowStoryButton() {
        return this.wwaShowStoryButton;
    }

    public final String getWwaSourcePlatformChannel() {
        return this.wwaSourcePlatformChannel;
    }

    public final boolean isFollowAY() {
        return this.isFollowAY;
    }

    public final boolean isFromQA() {
        return this.isFromQA;
    }

    public final Integer isOperationSet() {
        return this.isOperationSet;
    }

    public final void setAddYoursFromGroupContent(String str) {
        this.addYoursFromGroupContent = str;
    }

    public final void setAddYoursStickerStruct(AddYoursStickerStruct addYoursStickerStruct) {
        this.addYoursStickerStruct = addYoursStickerStruct;
    }

    public final void setAutoOpenAlbum(boolean z) {
        this.autoOpenAlbum = z;
    }

    public final void setCompletedEvent(boolean z) {
        this.completedEvent = z;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setFromPhotoMode(boolean z) {
        this.fromPhotoMode = z;
    }

    public final void setLandingBack(Number number) {
        this.landingBack = number;
    }

    public final void setMusicSelectedFrom(String str) {
        this.musicSelectedFrom = str;
    }

    public final void setSourceOfTrendsAddYoursInVideo(Integer num) {
        this.sourceOfTrendsAddYoursInVideo = num;
    }

    public final void setWwaBackUrl(String str) {
        this.wwaBackUrl = str;
    }

    public final void setWwaCampaignId(String str) {
        this.wwaCampaignId = str;
    }

    public final void setWwaShowStoryButton(boolean z) {
        this.wwaShowStoryButton = z;
    }

    public final void setWwaSourcePlatformChannel(String str) {
        this.wwaSourcePlatformChannel = str;
    }

    public AddYourRecordParam(AddYoursStickerStruct addYoursStickerStruct, boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3, boolean z4, String str5, String str6, Integer num, Integer num2, String str7, String str8, ArrayList<String> arrayList, Number number, String str9, boolean z5, boolean z6, String str10, Integer num3, String str11, String str12, String str13, boolean z7, boolean z8) {
        this.addYoursStickerStruct = addYoursStickerStruct;
        this.autoEnterStickerEdit = z;
        this.forceLandRecordPage = z2;
        this.enterFrom = str;
        this.shootWay = str2;
        this.addYoursEnterMethod = str3;
        this.followStatus = str4;
        this.isFollowAY = z3;
        this.isFromQA = z4;
        this.fromGroupId = str5;
        this.topicId = str6;
        this.trendSource = num;
        this.isOperationSet = num2;
        this.effectId = str7;
        this.musicId = str8;
        this.hashTags = arrayList;
        this.landingBack = number;
        this.musicSelectedFrom = str9;
        this.completedEvent = z5;
        this.fromPhotoMode = z6;
        this.addYoursFromGroupContent = str10;
        this.sourceOfTrendsAddYoursInVideo = num3;
        this.wwaCampaignId = str11;
        this.wwaSourcePlatformChannel = str12;
        this.wwaBackUrl = str13;
        this.wwaShowStoryButton = z7;
        this.autoOpenAlbum = z8;
    }
}
