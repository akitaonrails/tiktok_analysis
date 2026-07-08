package com.ss.android.ugc.aweme.views.mention;

import X.C1402020maW;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;

/* JADX INFO: loaded from: classes22.dex */
public class MentionEditText$MentionSpan extends ForegroundColorSpan {
    public static final Parcelable.Creator<MentionEditText$MentionSpan> CREATOR = new C1402020maW(8);
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

    public MentionEditText$MentionSpan(Parcel parcel) {
        super(parcel);
        this.awemeId = "";
        this.mSecid = "";
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
        MentionEditText$MentionSpan mentionEditText$MentionSpan = (MentionEditText$MentionSpan) obj;
        if (this.mType != mentionEditText$MentionSpan.mType || this.subType != mentionEditText$MentionSpan.subType) {
            return false;
        }
        String str = this.mId;
        if (str != null) {
            if (!str.equals(mentionEditText$MentionSpan.mId)) {
                return false;
            }
        } else if (mentionEditText$MentionSpan.mId != null) {
            return false;
        }
        String str2 = this.mText;
        if (str2 != null) {
            if (!str2.equals(mentionEditText$MentionSpan.mText)) {
                return false;
            }
        } else if (mentionEditText$MentionSpan.mText != null) {
            return false;
        }
        TextExtraStruct textExtraStruct = this.mStruct;
        if (textExtraStruct != null) {
            if (!textExtraStruct.equals(mentionEditText$MentionSpan.mStruct)) {
                return false;
            }
        } else if (mentionEditText$MentionSpan.mStruct != null) {
            return false;
        }
        String str3 = this.awemeId;
        if (str3 != null) {
            if (!str3.equals(mentionEditText$MentionSpan.awemeId)) {
                return false;
            }
        } else if (mentionEditText$MentionSpan.awemeId != null) {
            return false;
        }
        String str4 = this.mSecid;
        String str5 = mentionEditText$MentionSpan.mSecid;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 == null) {
            return true;
        }
        return false;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
        this.mStruct.setAwemeId(str);
    }

    @Override // android.text.style.ForegroundColorSpan, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mText);
        parcel.writeInt(this.mType);
        parcel.writeParcelable(this.mStruct, i);
        parcel.writeString(this.mSecid);
    }

    public MentionEditText$MentionSpan(int i, int i2, String str, String str2, String str3, String str4) {
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
    }
}
