package com.ss.android.ugc.aweme.lexical.platform.span;

import X.C913910ZtF;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public class MentionSpan extends ForegroundColorSpan {
    public static final Parcelable.Creator<MentionSpan> CREATOR = new C913910ZtF(2);
    public String awemeId;
    public String mId;
    public String mSecid;
    public TextExtraStruct mStruct;
    public String mText;
    public int mType;
    public int subType;

    @Override // android.text.style.ForegroundColorSpan, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.mId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mText;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.mType) * 31;
        TextExtraStruct textExtraStruct = this.mStruct;
        int iHashCode3 = (iHashCode2 + (textExtraStruct != null ? textExtraStruct.hashCode() : 0)) * 31;
        String str3 = this.awemeId;
        int iHashCode4 = (((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.subType) * 31;
        String str4 = this.mSecid;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public MentionSpan(Parcel parcel) {
        super(parcel);
        this.awemeId = "";
        this.mId = parcel.readString();
        this.mText = parcel.readString();
        this.mType = parcel.readInt();
        this.mStruct = (TextExtraStruct) parcel.readParcelable(TextExtraStruct.class.getClassLoader());
        this.mSecid = parcel.readString();
    }

    public final void LIZ(int i) {
        this.subType = i;
        this.mStruct.setSubType(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MentionSpan mentionSpan = (MentionSpan) obj;
        if (this.mType != mentionSpan.mType || this.subType != mentionSpan.subType || !Objects.equals(this.mId, mentionSpan.mId) || !Objects.equals(this.mText, mentionSpan.mText) || !Objects.equals(this.mStruct, mentionSpan.mStruct) || !Objects.equals(this.awemeId, mentionSpan.awemeId)) {
            return false;
        }
        return Objects.equals(this.mSecid, mentionSpan.mSecid);
    }

    @Override // android.text.style.ForegroundColorSpan, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mText);
        parcel.writeInt(this.mType);
        parcel.writeParcelable(this.mStruct, i);
        parcel.writeString(this.mSecid);
    }

    public MentionSpan(String str, int i, long j, String str2, String str3, int i2, String str4) {
        super(i);
        this.awemeId = "";
        this.mId = str2;
        this.mText = str;
        this.mType = i2;
        this.mSecid = str4;
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        this.mStruct = textExtraStruct;
        textExtraStruct.setUserId(str2);
        this.mStruct.setType(i2);
        this.mStruct.setAtUserType(str3);
        this.mStruct.setSecUid(str4);
        this.mStruct.setCommentId(j);
    }
}
