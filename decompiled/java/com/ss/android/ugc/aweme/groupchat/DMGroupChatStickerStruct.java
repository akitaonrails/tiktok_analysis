package com.ss.android.ugc.aweme.groupchat;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.groupchat.DMGroupChatStickerStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class DMGroupChatStickerStruct implements Parcelable, Serializable {
    public static final Parcelable.Creator<DMGroupChatStickerStruct> CREATOR = new Parcelable.Creator<DMGroupChatStickerStruct>() { // from class: X.0wRX
        @Override // android.os.Parcelable.Creator
        public final DMGroupChatStickerStruct createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3 = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
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
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new DMGroupChatStickerStruct(lValueOf, string, string2, string3, numValueOf, numValueOf2, string4, numValueOf3, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DMGroupChatStickerStruct[] newArray(int i) {
            return new DMGroupChatStickerStruct[i];
        }
    };

    @C09CT("access_criteria_copy")
    public String accessCriteriaCopy;

    @C09CT("conversation_short_id")
    public Long conversationShortId;

    @C09CT("event_track_data")
    public String eventTracking;

    @C09CT("group_avatar_url")
    public String groupAvatar;

    @C09CT("group_description")
    public String groupDesc;

    @C09CT("group_member_count")
    public Integer groupMemberCount;

    @C09CT("group_name")
    public String groupName;

    @C09CT("verify_status")
    public Integer groupStatus;

    @C09CT("sticker_style")
    public Integer uiStyle;

    public final DMGroupChatStickerStruct copy(Long l, String str, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, String str5) {
        return new DMGroupChatStickerStruct(l, str, str2, str3, num, num2, str4, num3, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DMGroupChatStickerStruct)) {
            return false;
        }
        DMGroupChatStickerStruct dMGroupChatStickerStruct = (DMGroupChatStickerStruct) obj;
        return Intrinsics.LJFF(this.conversationShortId, dMGroupChatStickerStruct.conversationShortId) && Intrinsics.LJFF(this.groupName, dMGroupChatStickerStruct.groupName) && Intrinsics.LJFF(this.groupAvatar, dMGroupChatStickerStruct.groupAvatar) && Intrinsics.LJFF(this.accessCriteriaCopy, dMGroupChatStickerStruct.accessCriteriaCopy) && Intrinsics.LJFF(this.groupStatus, dMGroupChatStickerStruct.groupStatus) && Intrinsics.LJFF(this.uiStyle, dMGroupChatStickerStruct.uiStyle) && Intrinsics.LJFF(this.eventTracking, dMGroupChatStickerStruct.eventTracking) && Intrinsics.LJFF(this.groupMemberCount, dMGroupChatStickerStruct.groupMemberCount) && Intrinsics.LJFF(this.groupDesc, dMGroupChatStickerStruct.groupDesc);
    }

    public int hashCode() {
        Long l = this.conversationShortId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.groupName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.groupAvatar;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accessCriteriaCopy;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.groupStatus;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.uiStyle;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.eventTracking;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.groupMemberCount;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str5 = this.groupDesc;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMGroupChatStickerStruct(conversationShortId=");
        sbLIZ.append(this.conversationShortId);
        sbLIZ.append(", groupName=");
        sbLIZ.append(this.groupName);
        sbLIZ.append(", groupAvatar=");
        sbLIZ.append(this.groupAvatar);
        sbLIZ.append(", accessCriteriaCopy=");
        sbLIZ.append(this.accessCriteriaCopy);
        sbLIZ.append(", groupStatus=");
        sbLIZ.append(this.groupStatus);
        sbLIZ.append(", uiStyle=");
        sbLIZ.append(this.uiStyle);
        sbLIZ.append(", eventTracking=");
        sbLIZ.append(this.eventTracking);
        sbLIZ.append(", groupMemberCount=");
        sbLIZ.append(this.groupMemberCount);
        sbLIZ.append(", groupDesc=");
        sbLIZ.append(this.groupDesc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.conversationShortId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.groupName);
        parcel.writeString(this.groupAvatar);
        parcel.writeString(this.accessCriteriaCopy);
        Integer num = this.groupStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.uiStyle;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.eventTracking);
        Integer num3 = this.groupMemberCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.groupDesc);
    }

    public DMGroupChatStickerStruct() {
        this(0L, "", "", "", -1, 0, "", 0, "");
    }

    public final boolean isValid() {
        Long l = this.conversationShortId;
        return (l == null || l.longValue() == 0) ? false : true;
    }

    public final String getAccessCriteriaCopy() {
        return this.accessCriteriaCopy;
    }

    public final Long getConversationShortId() {
        return this.conversationShortId;
    }

    public final String getEventTracking() {
        return this.eventTracking;
    }

    public final String getGroupAvatar() {
        return this.groupAvatar;
    }

    public final String getGroupDesc() {
        return this.groupDesc;
    }

    public final Integer getGroupMemberCount() {
        return this.groupMemberCount;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final Integer getGroupStatus() {
        return this.groupStatus;
    }

    public final Integer getUiStyle() {
        return this.uiStyle;
    }

    public DMGroupChatStickerStruct(Long l, String str, String str2, String str3, Integer num, Integer num2, String str4, Integer num3, String str5) {
        this.conversationShortId = l;
        this.groupName = str;
        this.groupAvatar = str2;
        this.accessCriteriaCopy = str3;
        this.groupStatus = num;
        this.uiStyle = num2;
        this.eventTracking = str4;
        this.groupMemberCount = num3;
        this.groupDesc = str5;
    }
}
