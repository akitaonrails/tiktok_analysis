package com.ss.android.ugc.aweme.creative.model.stickers;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.stickers.MentionStickerParam;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MentionStickerParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<MentionStickerParam> CREATOR = new Parcelable.Creator<MentionStickerParam>() { // from class: X.0oGI
        @Override // android.os.Parcelable.Creator
        public final MentionStickerParam createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            User user = (User) parcel.readSerializable();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            String string4 = parcel.readString();
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
            return new MentionStickerParam(user, string, string2, string3, urlModel, string4, z, z2, z3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final MentionStickerParam[] newArray(int i) {
            return new MentionStickerParam[i];
        }
    };

    @C09CT("user_avatar_url")
    public UrlModel avatarUrl;

    @C09CT("editable")
    public boolean editable;

    @C09CT("nickname")
    public String nickname;

    @C09CT("sec_uid")
    public String secUid;

    @C09CT("use_capsule_style")
    public final boolean useCapsuleStyle;

    @C09CT("use_nick_name")
    public boolean useNickName;

    @C09CT("user")
    public User user;

    @C09CT("user_id")
    public String userId;

    @C09CT("user_name")
    public String userName;

    @C09CT("visible")
    public final boolean visible;

    public MentionStickerParam() {
        this(null, null, null, null, null, null, true, false, true, false);
    }

    public final MentionStickerParam copy(User user, String str, String str2, String str3, UrlModel urlModel, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        return new MentionStickerParam(user, str, str2, str3, urlModel, str4, z, z2, z3, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MentionStickerParam)) {
            return false;
        }
        MentionStickerParam mentionStickerParam = (MentionStickerParam) obj;
        return Intrinsics.LJFF(this.user, mentionStickerParam.user) && Intrinsics.LJFF(this.userId, mentionStickerParam.userId) && Intrinsics.LJFF(this.secUid, mentionStickerParam.secUid) && Intrinsics.LJFF(this.userName, mentionStickerParam.userName) && Intrinsics.LJFF(this.avatarUrl, mentionStickerParam.avatarUrl) && Intrinsics.LJFF(this.nickname, mentionStickerParam.nickname) && this.useNickName == mentionStickerParam.useNickName && this.editable == mentionStickerParam.editable && this.visible == mentionStickerParam.visible && this.useCapsuleStyle == mentionStickerParam.useCapsuleStyle;
    }

    public int hashCode() {
        User user = this.user;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        String str = this.userId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secUid;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UrlModel urlModel = this.avatarUrl;
        int iHashCode5 = (iHashCode4 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str4 = this.nickname;
        return ((((((((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.useNickName)) * 31) + C786410Ut5.Z2(this.editable)) * 31) + C786410Ut5.Z2(this.visible)) * 31) + C786410Ut5.Z2(this.useCapsuleStyle);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionStickerParam(user=");
        sbLIZ.append(this.user);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.secUid);
        sbLIZ.append(", userName=");
        sbLIZ.append(this.userName);
        sbLIZ.append(", avatarUrl=");
        sbLIZ.append(this.avatarUrl);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", useNickName=");
        sbLIZ.append(this.useNickName);
        sbLIZ.append(", editable=");
        sbLIZ.append(this.editable);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.visible);
        sbLIZ.append(", useCapsuleStyle=");
        sbLIZ.append(this.useCapsuleStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.user);
        parcel.writeString(this.userId);
        parcel.writeString(this.secUid);
        parcel.writeString(this.userName);
        parcel.writeSerializable(this.avatarUrl);
        parcel.writeString(this.nickname);
        parcel.writeInt(this.useNickName ? 1 : 0);
        parcel.writeInt(this.editable ? 1 : 0);
        parcel.writeInt(this.visible ? 1 : 0);
        parcel.writeInt(this.useCapsuleStyle ? 1 : 0);
    }

    public final UrlModel getAvatarUrl() {
        return this.avatarUrl;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final boolean getUseCapsuleStyle() {
        return this.useCapsuleStyle;
    }

    public final boolean getUseNickName() {
        return this.useNickName;
    }

    public final User getUser() {
        return this.user;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final void setAvatarUrl(UrlModel urlModel) {
        this.avatarUrl = urlModel;
    }

    public final void setEditable(boolean z) {
        this.editable = z;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUseNickName(boolean z) {
        this.useNickName = z;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUserName(String str) {
        this.userName = str;
    }

    public MentionStickerParam(User user, String str, String str2, String str3, UrlModel urlModel, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.user = user;
        this.userId = str;
        this.secUid = str2;
        this.userName = str3;
        this.avatarUrl = urlModel;
        this.nickname = str4;
        this.useNickName = z;
        this.editable = z2;
        this.visible = z3;
        this.useCapsuleStyle = z4;
    }
}
