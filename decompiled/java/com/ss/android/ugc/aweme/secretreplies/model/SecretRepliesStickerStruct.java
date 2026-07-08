package com.ss.android.ugc.aweme.secretreplies.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesStickerStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class SecretRepliesStickerStruct implements Parcelable, Serializable {
    public static final Parcelable.Creator<SecretRepliesStickerStruct> CREATOR = new Parcelable.Creator<SecretRepliesStickerStruct>() { // from class: X.11k7
        @Override // android.os.Parcelable.Creator
        public final SecretRepliesStickerStruct createFromParcel(Parcel parcel) {
            return new SecretRepliesStickerStruct(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SecretRepliesStickerStruct[] newArray(int i) {
            return new SecretRepliesStickerStruct[i];
        }
    };

    @C09CT("prompt_text")
    public final String questionText;

    public SecretRepliesStickerStruct() {
        this(null);
    }

    public final SecretRepliesStickerStruct copy(String str) {
        return new SecretRepliesStickerStruct(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SecretRepliesStickerStruct) && Intrinsics.LJFF(this.questionText, ((SecretRepliesStickerStruct) obj).questionText);
    }

    public int hashCode() {
        String str = this.questionText;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SecretRepliesStickerStruct(questionText=");
        sbLIZ.append(this.questionText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.questionText);
    }

    public final String getQuestionText() {
        return this.questionText;
    }

    public SecretRepliesStickerStruct(String str) {
        this.questionText = str;
    }
}
