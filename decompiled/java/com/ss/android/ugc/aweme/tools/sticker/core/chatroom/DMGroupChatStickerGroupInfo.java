package com.ss.android.ugc.aweme.tools.sticker.core.chatroom;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class DMGroupChatStickerGroupInfo implements Parcelable, Serializable {

    @C09CT("access_criteria_copy")
    public final String accessCriteriaCopy;

    @C09CT("conv_short_id")
    public final Long conversationShortId;

    @C09CT("et_group_type")
    public final String etGroupType;

    @C09CT("group_avatar")
    public final String groupAvatar;

    @C09CT("group_description")
    public final String groupDesc;

    @C09CT("group_member_count")
    public final Integer groupMemberCount;

    @C09CT("group_name")
    public final String groupName;

    @C09CT("group_owner_account_type")
    public final String groupOwnerAccountType;

    @C09CT("verify_status")
    public final Integer groupStatus;
    public static final Parcelable.Creator<DMGroupChatStickerGroupInfo> CREATOR = new Parcelable.Creator<DMGroupChatStickerGroupInfo>() { // from class: X.0i99
        @Override // android.os.Parcelable.Creator
        public final DMGroupChatStickerGroupInfo createFromParcel(Parcel parcel) {
            Long lValueOf;
            Integer numValueOf;
            Integer numValueOf2 = null;
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
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new DMGroupChatStickerGroupInfo(lValueOf, string, string2, string3, numValueOf, string4, string5, numValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DMGroupChatStickerGroupInfo[] newArray(int i) {
            return new DMGroupChatStickerGroupInfo[i];
        }
    };
    public static final int $stable = 8;

    public final DMGroupChatStickerGroupInfo copy(Long l, String str, String str2, String str3, Integer num, String str4, String str5, Integer num2, String str6) {
        return new DMGroupChatStickerGroupInfo(l, str, str2, str3, num, str4, str5, num2, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DMGroupChatStickerGroupInfo)) {
            return false;
        }
        DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo = (DMGroupChatStickerGroupInfo) obj;
        return Intrinsics.LJFF(this.conversationShortId, dMGroupChatStickerGroupInfo.conversationShortId) && Intrinsics.LJFF(this.groupName, dMGroupChatStickerGroupInfo.groupName) && Intrinsics.LJFF(this.accessCriteriaCopy, dMGroupChatStickerGroupInfo.accessCriteriaCopy) && Intrinsics.LJFF(this.groupAvatar, dMGroupChatStickerGroupInfo.groupAvatar) && Intrinsics.LJFF(this.groupStatus, dMGroupChatStickerGroupInfo.groupStatus) && Intrinsics.LJFF(this.etGroupType, dMGroupChatStickerGroupInfo.etGroupType) && Intrinsics.LJFF(this.groupOwnerAccountType, dMGroupChatStickerGroupInfo.groupOwnerAccountType) && Intrinsics.LJFF(this.groupMemberCount, dMGroupChatStickerGroupInfo.groupMemberCount) && Intrinsics.LJFF(this.groupDesc, dMGroupChatStickerGroupInfo.groupDesc);
    }

    public int hashCode() {
        Long l = this.conversationShortId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.groupName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.accessCriteriaCopy;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.groupAvatar;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.groupStatus;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.etGroupType;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.groupOwnerAccountType;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.groupMemberCount;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.groupDesc;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMGroupChatStickerGroupInfo(conversationShortId=");
        sbLIZ.append(this.conversationShortId);
        sbLIZ.append(", groupName=");
        sbLIZ.append(this.groupName);
        sbLIZ.append(", accessCriteriaCopy=");
        sbLIZ.append(this.accessCriteriaCopy);
        sbLIZ.append(", groupAvatar=");
        sbLIZ.append(this.groupAvatar);
        sbLIZ.append(", groupStatus=");
        sbLIZ.append(this.groupStatus);
        sbLIZ.append(", etGroupType=");
        sbLIZ.append(this.etGroupType);
        sbLIZ.append(", groupOwnerAccountType=");
        sbLIZ.append(this.groupOwnerAccountType);
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
        parcel.writeString(this.accessCriteriaCopy);
        parcel.writeString(this.groupAvatar);
        Integer num = this.groupStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.etGroupType);
        parcel.writeString(this.groupOwnerAccountType);
        Integer num2 = this.groupMemberCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.groupDesc);
    }

    public final String getAccessCriteriaCopy() {
        return this.accessCriteriaCopy;
    }

    public final Long getConversationShortId() {
        return this.conversationShortId;
    }

    public final String getEtGroupType() {
        return this.etGroupType;
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

    public final String getGroupOwnerAccountType() {
        return this.groupOwnerAccountType;
    }

    public final Integer getGroupStatus() {
        return this.groupStatus;
    }

    public DMGroupChatStickerGroupInfo(Long l, String str, String str2, String str3, Integer num, String str4, String str5, Integer num2, String str6) {
        this.conversationShortId = l;
        this.groupName = str;
        this.accessCriteriaCopy = str2;
        this.groupAvatar = str3;
        this.groupStatus = num;
        this.etGroupType = str4;
        this.groupOwnerAccountType = str5;
        this.groupMemberCount = num2;
        this.groupDesc = str6;
    }
}
