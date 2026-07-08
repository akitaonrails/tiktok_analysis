package com.ss.android.ugc.aweme.question;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.question.QuestionInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class QuestionInfo implements Parcelable {
    public static final Parcelable.Creator<QuestionInfo> CREATOR = new Parcelable.Creator<QuestionInfo>() { // from class: X.02d4
        @Override // android.os.Parcelable.Creator
        public final QuestionInfo createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long lValueOf2;
            Long lValueOf3 = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                lValueOf3 = Long.valueOf(parcel.readLong());
            }
            return new QuestionInfo(lValueOf, lValueOf2, lValueOf3, parcel.readString(), parcel.readString(), (UrlModel) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final QuestionInfo[] newArray(int i) {
            return new QuestionInfo[i];
        }
    };

    @C09CT("content")
    public String content;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public Long id;

    @C09CT("item_id")
    public Long item_id;

    @C09CT("sec_uid")
    public String secId;

    @C09CT("user_avatar")
    public UrlModel userAvatar;

    @C09CT("username")
    public String userName;

    @C09CT("user_id")
    public Long user_id;

    public QuestionInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionInfo)) {
            return false;
        }
        QuestionInfo questionInfo = (QuestionInfo) obj;
        return Intrinsics.LJFF(this.id, questionInfo.id) && Intrinsics.LJFF(this.item_id, questionInfo.item_id) && Intrinsics.LJFF(this.user_id, questionInfo.user_id) && Intrinsics.LJFF(this.userName, questionInfo.userName) && Intrinsics.LJFF(this.content, questionInfo.content) && Intrinsics.LJFF(this.userAvatar, questionInfo.userAvatar) && Intrinsics.LJFF(this.secId, questionInfo.secId);
    }

    public final int hashCode() {
        Long l = this.id;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.item_id;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.user_id;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.userName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.userAvatar;
        int iHashCode6 = (iHashCode5 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str3 = this.secId;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuestionInfo(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", item_id=");
        sbLIZ.append(this.item_id);
        sbLIZ.append(", user_id=");
        sbLIZ.append(this.user_id);
        sbLIZ.append(", userName=");
        sbLIZ.append(this.userName);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", userAvatar=");
        sbLIZ.append(this.userAvatar);
        sbLIZ.append(", secId=");
        sbLIZ.append(this.secId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.id;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.item_id;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.user_id;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.userName);
        parcel.writeString(this.content);
        parcel.writeSerializable(this.userAvatar);
        parcel.writeString(this.secId);
    }

    public QuestionInfo(Long l, Long l2, Long l3, String str, String str2, UrlModel urlModel, String str3) {
        this.id = l;
        this.item_id = l2;
        this.user_id = l3;
        this.userName = str;
        this.content = str2;
        this.userAvatar = urlModel;
        this.secId = str3;
    }
}
