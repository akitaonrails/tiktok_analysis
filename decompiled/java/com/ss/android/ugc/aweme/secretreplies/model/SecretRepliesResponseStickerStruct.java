package com.ss.android.ugc.aweme.secretreplies.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesResponseStickerStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class SecretRepliesResponseStickerStruct implements Parcelable, Serializable {
    public static final Parcelable.Creator<SecretRepliesResponseStickerStruct> CREATOR = new Parcelable.Creator<SecretRepliesResponseStickerStruct>() { // from class: X.0SiA
        @Override // android.os.Parcelable.Creator
        public final SecretRepliesResponseStickerStruct createFromParcel(Parcel parcel) {
            Long lValueOf;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new SecretRepliesResponseStickerStruct(lValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SecretRepliesResponseStickerStruct[] newArray(int i) {
            return new SecretRepliesResponseStickerStruct[i];
        }
    };

    @C09CT("original_aweme_id")
    public final Long baseAwemeId;

    @C09CT("prompt_text")
    public final String questionText;

    @C09CT("reply_text")
    public final String responseText;

    public SecretRepliesResponseStickerStruct() {
        this(null, null, null);
    }

    public final SecretRepliesResponseStickerStruct copy(Long l, String str, String str2) {
        return new SecretRepliesResponseStickerStruct(l, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecretRepliesResponseStickerStruct)) {
            return false;
        }
        SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct = (SecretRepliesResponseStickerStruct) obj;
        return Intrinsics.LJFF(this.baseAwemeId, secretRepliesResponseStickerStruct.baseAwemeId) && Intrinsics.LJFF(this.questionText, secretRepliesResponseStickerStruct.questionText) && Intrinsics.LJFF(this.responseText, secretRepliesResponseStickerStruct.responseText);
    }

    public int hashCode() {
        Long l = this.baseAwemeId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.questionText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.responseText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SecretRepliesResponseStickerStruct(baseAwemeId=");
        sbLIZ.append(this.baseAwemeId);
        sbLIZ.append(", questionText=");
        sbLIZ.append(this.questionText);
        sbLIZ.append(", responseText=");
        sbLIZ.append(this.responseText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.baseAwemeId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.questionText);
        parcel.writeString(this.responseText);
    }

    public final Long getBaseAwemeId() {
        return this.baseAwemeId;
    }

    public final String getQuestionText() {
        return this.questionText;
    }

    public final String getResponseText() {
        return this.responseText;
    }

    public SecretRepliesResponseStickerStruct(Long l, String str, String str2) {
        this.baseAwemeId = l;
        this.questionText = str;
        this.responseText = str2;
    }
}
