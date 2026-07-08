package com.ss.android.ugc.aweme.creative.model.common;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.common.MentionVideoItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MentionVideoItem implements Parcelable {
    public static final Parcelable.Creator<MentionVideoItem> CREATOR = new Parcelable.Creator<MentionVideoItem>() { // from class: X.0Lyc
        @Override // android.os.Parcelable.Creator
        public final MentionVideoItem createFromParcel(Parcel parcel) {
            return new MentionVideoItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MentionVideoItem[] newArray(int i) {
            return new MentionVideoItem[i];
        }
    };

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("sec_uid")
    public final String secUid;

    @C09CT("unique_id")
    public final String uniqueId;

    @C09CT("uid")
    public final String userId;

    public MentionVideoItem() {
        this(null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MentionVideoItem)) {
            return false;
        }
        MentionVideoItem mentionVideoItem = (MentionVideoItem) obj;
        return Intrinsics.LJFF(this.awemeId, mentionVideoItem.awemeId) && Intrinsics.LJFF(this.nickname, mentionVideoItem.nickname) && Intrinsics.LJFF(this.userId, mentionVideoItem.userId) && Intrinsics.LJFF(this.secUid, mentionVideoItem.secUid) && Intrinsics.LJFF(this.uniqueId, mentionVideoItem.uniqueId);
    }

    public final int hashCode() {
        String str = this.awemeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nickname;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secUid;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.uniqueId;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionVideoItem(awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.secUid);
        sbLIZ.append(", uniqueId=");
        sbLIZ.append(this.uniqueId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.awemeId);
        parcel.writeString(this.nickname);
        parcel.writeString(this.userId);
        parcel.writeString(this.secUid);
        parcel.writeString(this.uniqueId);
    }

    public final boolean LIZ() {
        String str;
        String str2;
        String str3;
        String str4 = this.awemeId;
        return (str4 == null || str4.length() == 0 || (str = this.nickname) == null || str.length() == 0 || (str2 = this.userId) == null || str2.length() == 0 || (str3 = this.secUid) == null || str3.length() == 0) ? false : true;
    }

    public MentionVideoItem(String str, String str2, String str3, String str4, String str5) {
        this.awemeId = str;
        this.nickname = str2;
        this.userId = str3;
        this.secUid = str4;
        this.uniqueId = str5;
    }
}
