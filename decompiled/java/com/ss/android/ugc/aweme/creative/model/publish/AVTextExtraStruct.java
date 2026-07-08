package com.ss.android.ugc.aweme.creative.model.publish;

import X.C09CT;
import X.C893190Z2f;
import X.C913910ZtF;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class AVTextExtraStruct implements Parcelable, Serializable, Cloneable {

    @C09CT("at_user_type")
    public String atUserType;

    @C09CT("aweme_id")
    public String awemeId;
    public String cid;

    @C09CT("comment_id")
    public long commentId;

    @C09CT("end")
    public int end;

    @C09CT("hashtag_name")
    public String hashTagName;
    public boolean isDuet;

    @C09CT("is_preset")
    public boolean isPreset;
    public boolean isTransient;

    @C09CT("line_idx")
    public int lineIndex;

    @C09CT("sec_uid")
    public String secUid;

    @C09CT("start")
    public int start;

    @C09CT("sub_type")
    public int subType;

    @C09CT("tag_id")
    public String tagId;

    @C09CT("type")
    public int type;

    @C09CT("user_id")
    public String userId;
    public static final C893190Z2f Companion = new Object() { // from class: X.0Z2f
    };
    public static final Parcelable.Creator<AVTextExtraStruct> CREATOR = new C913910ZtF(0);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AVTextExtraStruct m175clone() {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.start = this.start;
        aVTextExtraStruct.end = this.end;
        aVTextExtraStruct.userId = this.userId;
        aVTextExtraStruct.type = this.type;
        aVTextExtraStruct.atUserType = this.atUserType;
        aVTextExtraStruct.hashTagName = this.hashTagName;
        aVTextExtraStruct.awemeId = this.awemeId;
        aVTextExtraStruct.commentId = this.commentId;
        aVTextExtraStruct.subType = this.subType;
        aVTextExtraStruct.secUid = this.secUid;
        aVTextExtraStruct.lineIndex = this.lineIndex;
        aVTextExtraStruct.isTransient = this.isTransient;
        aVTextExtraStruct.isPreset = this.isPreset;
        return aVTextExtraStruct;
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.type + this.subType) * 31;
        String str2 = this.atUserType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.hashTagName;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AVTextExtraStruct(start=" + this.start + ", end=" + this.end + ", userId=" + this.userId + ", type=" + this.type + ", atUserType=" + this.atUserType + ", hashTagName=" + this.hashTagName + ", awemeId=" + this.awemeId + ", subType=" + this.subType + ", secUid=" + this.secUid + ", lineIndex=" + this.lineIndex + ", isDuet=" + this.isDuet + ", isTransient=" + this.isTransient + ", isPreset=" + this.isPreset + ", tagId=" + this.tagId + ", cid=" + this.cid + ')';
    }

    public final TextExtraStruct toTextExtraStruct() {
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setStart(this.start);
        textExtraStruct.setEnd(this.end);
        textExtraStruct.setUserId(this.userId);
        textExtraStruct.setType(this.type);
        textExtraStruct.setHashTagName(this.hashTagName);
        textExtraStruct.setAwemeId(this.awemeId);
        textExtraStruct.setCommentId(this.commentId);
        textExtraStruct.setSubType(this.subType);
        textExtraStruct.setSecUid(this.secUid);
        textExtraStruct.setLineIndex(this.lineIndex);
        textExtraStruct.setTagId(this.tagId);
        return textExtraStruct;
    }

    public AVTextExtraStruct() {
    }

    public final int getLineIndex() {
        return this.lineIndex;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getTagId() {
        return this.tagId;
    }

    public final boolean isDuet() {
        return this.isDuet;
    }

    public final boolean isPreset() {
        return this.isPreset;
    }

    public final boolean isTransient() {
        return this.isTransient;
    }

    public AVTextExtraStruct(Parcel parcel) {
        boolean z;
        boolean z2;
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readString();
        this.type = parcel.readInt();
        this.atUserType = parcel.readString();
        this.hashTagName = parcel.readString();
        this.awemeId = parcel.readString();
        this.commentId = parcel.readLong();
        this.subType = parcel.readInt();
        this.secUid = parcel.readString();
        this.lineIndex = parcel.readInt();
        this.tagId = parcel.readString();
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.isTransient = z;
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isPreset = z2;
        this.isDuet = parcel.readInt() == 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AVTextExtraStruct)) {
            return false;
        }
        AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) obj;
        if (this.type != aVTextExtraStruct.type || this.subType != aVTextExtraStruct.subType || !Intrinsics.LJFF(this.userId, aVTextExtraStruct.userId) || !TextUtils.equals(this.hashTagName, aVTextExtraStruct.hashTagName)) {
            return false;
        }
        return Intrinsics.LJFF(this.atUserType, aVTextExtraStruct.atUserType);
    }

    public final void setDuet(boolean z) {
        this.isDuet = z;
    }

    public final void setLineIndex(int i) {
        this.lineIndex = i;
    }

    public final void setPreset(boolean z) {
        this.isPreset = z;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setTagId(String str) {
        this.tagId = str;
    }

    public final void setTransient(boolean z) {
        this.isTransient = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeString(this.userId);
        parcel.writeInt(this.type);
        parcel.writeString(this.atUserType);
        parcel.writeString(this.hashTagName);
        parcel.writeString(this.awemeId);
        parcel.writeLong(this.commentId);
        parcel.writeInt(this.subType);
        parcel.writeString(this.secUid);
        parcel.writeInt(this.lineIndex);
        parcel.writeString(this.tagId);
        parcel.writeInt(this.isTransient ? 1 : 0);
        parcel.writeInt(this.isPreset ? 1 : 0);
        parcel.writeInt(this.isDuet ? 1 : 0);
    }
}
