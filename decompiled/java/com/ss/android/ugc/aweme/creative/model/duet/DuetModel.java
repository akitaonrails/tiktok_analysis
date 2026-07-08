package com.ss.android.ugc.aweme.creative.model.duet;

import X.C040H;
import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.duet.DuetModel;
import com.ss.android.ugc.aweme.creative.model.duet.DuetUser;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class DuetModel implements Parcelable {
    public static final Parcelable.Creator<DuetModel> CREATOR = new Parcelable.Creator<DuetModel>() { // from class: X.0nWM
        @Override // android.os.Parcelable.Creator
        public final DuetModel createFromParcel(Parcel parcel) {
            DuetUser duetUserCreateFromParcel;
            boolean z;
            boolean z2;
            DuetExtraInfo duetExtraInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                duetUserCreateFromParcel = null;
            } else {
                duetUserCreateFromParcel = DuetUser.CREATOR.createFromParcel(parcel);
            }
            DuetUser duetUser = duetUserCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            AIGCInfo aIGCInfo = (AIGCInfo) parcel.readParcelable(DuetModel.class.getClassLoader());
            String string3 = parcel.readString();
            int i2 = parcel.readInt();
            String string4 = parcel.readString();
            int i3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                duetExtraInfoCreateFromParcel = DuetExtraInfo.CREATOR.createFromParcel(parcel);
            }
            DuetExtraInfo duetExtraInfo = duetExtraInfoCreateFromParcel;
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new DuetModel(duetUser, string, string2, i, aIGCInfo, string3, i2, string4, i3, duetExtraInfo, string5, z, string6, string7, z2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DuetModel[] newArray(int i) {
            return new DuetModel[i];
        }
    };

    @C09CT("aigc_info")
    public AIGCInfo aigcInfo;

    @C040H
    public DuetExtraInfo draftDuetExtraInfo;

    @C09CT("duet_author")
    public DuetUser duetAuthor;

    @C09CT("duet_entrance_type")
    public String duetEntranceType;

    @C040H
    public String duetFromAwemeId;

    @C040H
    public int duetFromDuetButton;

    @C09CT("duet_hashtag")
    public String duetHashtag;

    @C040H
    public String duetLayout;

    @C040H
    public String duetModeType;

    @C09CT("duet_prev_entrance_type")
    public String duetPrevEntranceType;

    @C09CT("duet_video_aigc_label_type")
    public int duetVideoAIGCLabelType;

    @C040H
    public int duetVideoDuration;

    @C09CT("duet_video_id")
    public String duetVideoId;

    @C09CT("is_duet_from_duet")
    public boolean isDuetFromDuet;

    @C040H
    public boolean isDuetGreenSrceen;

    @C09CT("duet_thumbnail_url")
    public String thumbnailUrl;

    public DuetModel() {
        this(null, null, null, 0, null, "", 0, null, 0, null, "", false, null, null, false, "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetModel)) {
            return false;
        }
        DuetModel duetModel = (DuetModel) obj;
        return Intrinsics.LJFF(this.duetAuthor, duetModel.duetAuthor) && Intrinsics.LJFF(this.duetVideoId, duetModel.duetVideoId) && Intrinsics.LJFF(this.duetHashtag, duetModel.duetHashtag) && this.duetVideoAIGCLabelType == duetModel.duetVideoAIGCLabelType && Intrinsics.LJFF(this.aigcInfo, duetModel.aigcInfo) && Intrinsics.LJFF(this.duetFromAwemeId, duetModel.duetFromAwemeId) && this.duetFromDuetButton == duetModel.duetFromDuetButton && Intrinsics.LJFF(this.duetLayout, duetModel.duetLayout) && this.duetVideoDuration == duetModel.duetVideoDuration && Intrinsics.LJFF(this.draftDuetExtraInfo, duetModel.draftDuetExtraInfo) && Intrinsics.LJFF(this.duetModeType, duetModel.duetModeType) && this.isDuetGreenSrceen == duetModel.isDuetGreenSrceen && Intrinsics.LJFF(this.duetEntranceType, duetModel.duetEntranceType) && Intrinsics.LJFF(this.duetPrevEntranceType, duetModel.duetPrevEntranceType) && this.isDuetFromDuet == duetModel.isDuetFromDuet && Intrinsics.LJFF(this.thumbnailUrl, duetModel.thumbnailUrl);
    }

    public final int hashCode() {
        DuetUser duetUser = this.duetAuthor;
        int iHashCode = (duetUser == null ? 0 : duetUser.hashCode()) * 31;
        String str = this.duetVideoId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.duetHashtag;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.duetVideoAIGCLabelType) * 31;
        AIGCInfo aIGCInfo = this.aigcInfo;
        int iHashCode4 = (iHashCode3 + (aIGCInfo == null ? 0 : aIGCInfo.hashCode())) * 31;
        String str3 = this.duetFromAwemeId;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.duetFromDuetButton) * 31;
        String str4 = this.duetLayout;
        int iHashCode6 = (((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.duetVideoDuration) * 31;
        DuetExtraInfo duetExtraInfo = this.draftDuetExtraInfo;
        int iHashCode7 = (iHashCode6 + (duetExtraInfo == null ? 0 : duetExtraInfo.hashCode())) * 31;
        String str5 = this.duetModeType;
        int iHashCode8 = (((iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Z2(this.isDuetGreenSrceen)) * 31;
        String str6 = this.duetEntranceType;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.duetPrevEntranceType;
        int iHashCode10 = (((iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31) + C786410Ut5.Z2(this.isDuetFromDuet)) * 31;
        String str8 = this.thumbnailUrl;
        return iHashCode10 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        return "DuetModel(duetAuthor=" + this.duetAuthor + ", duetVideoId=" + this.duetVideoId + ", duetHashtag=" + this.duetHashtag + ", duetVideoAIGCLabelType=" + this.duetVideoAIGCLabelType + ", aigcInfo=" + this.aigcInfo + ", duetFromAwemeId=" + this.duetFromAwemeId + ", duetFromDuetButton=" + this.duetFromDuetButton + ", duetLayout=" + this.duetLayout + ", duetVideoDuration=" + this.duetVideoDuration + ", draftDuetExtraInfo=" + this.draftDuetExtraInfo + ", duetModeType=" + this.duetModeType + ", isDuetGreenSrceen=" + this.isDuetGreenSrceen + ", duetEntranceType=" + this.duetEntranceType + ", duetPrevEntranceType=" + this.duetPrevEntranceType + ", isDuetFromDuet=" + this.isDuetFromDuet + ", thumbnailUrl=" + this.thumbnailUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DuetUser duetUser = this.duetAuthor;
        if (duetUser == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            duetUser.writeToParcel(parcel, i);
        }
        parcel.writeString(this.duetVideoId);
        parcel.writeString(this.duetHashtag);
        parcel.writeInt(this.duetVideoAIGCLabelType);
        parcel.writeParcelable(this.aigcInfo, i);
        parcel.writeString(this.duetFromAwemeId);
        parcel.writeInt(this.duetFromDuetButton);
        parcel.writeString(this.duetLayout);
        parcel.writeInt(this.duetVideoDuration);
        DuetExtraInfo duetExtraInfo = this.draftDuetExtraInfo;
        if (duetExtraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            duetExtraInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.duetModeType);
        parcel.writeInt(this.isDuetGreenSrceen ? 1 : 0);
        parcel.writeString(this.duetEntranceType);
        parcel.writeString(this.duetPrevEntranceType);
        parcel.writeInt(this.isDuetFromDuet ? 1 : 0);
        parcel.writeString(this.thumbnailUrl);
    }

    public DuetModel(DuetUser duetUser, String str, String str2, int i, AIGCInfo aIGCInfo, String str3, int i2, String str4, int i3, DuetExtraInfo duetExtraInfo, String str5, boolean z, String str6, String str7, boolean z2, String str8) {
        this.duetAuthor = duetUser;
        this.duetVideoId = str;
        this.duetHashtag = str2;
        this.duetVideoAIGCLabelType = i;
        this.aigcInfo = aIGCInfo;
        this.duetFromAwemeId = str3;
        this.duetFromDuetButton = i2;
        this.duetLayout = str4;
        this.duetVideoDuration = i3;
        this.draftDuetExtraInfo = duetExtraInfo;
        this.duetModeType = str5;
        this.isDuetGreenSrceen = z;
        this.duetEntranceType = str6;
        this.duetPrevEntranceType = str7;
        this.isDuetFromDuet = z2;
        this.thumbnailUrl = str8;
    }
}
