package com.ss.android.ugc.aweme.secretreplies.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesRecordParam;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesResponseStickerStruct;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesStickerStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class SecretRepliesRecordParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<SecretRepliesRecordParam> CREATOR = new Parcelable.Creator<SecretRepliesRecordParam>() { // from class: X.11k6
        @Override // android.os.Parcelable.Creator
        public final SecretRepliesRecordParam createFromParcel(Parcel parcel) {
            SecretRepliesStickerStruct secretRepliesStickerStructCreateFromParcel;
            SecretRepliesResponseStickerStruct secretRepliesResponseStickerStructCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                secretRepliesStickerStructCreateFromParcel = null;
            } else {
                secretRepliesStickerStructCreateFromParcel = SecretRepliesStickerStruct.CREATOR.createFromParcel(parcel);
            }
            SecretRepliesStickerStruct secretRepliesStickerStruct = secretRepliesStickerStructCreateFromParcel;
            if (parcel.readInt() != 0) {
                secretRepliesResponseStickerStructCreateFromParcel = SecretRepliesResponseStickerStruct.CREATOR.createFromParcel(parcel);
            }
            return new SecretRepliesRecordParam(secretRepliesStickerStruct, secretRepliesResponseStickerStructCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SecretRepliesRecordParam[] newArray(int i) {
            return new SecretRepliesRecordParam[i];
        }
    };

    @C09CT("secret_replies_response_sticker_struct")
    public SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct;

    @C09CT("secret_replies_sticker_struct")
    public SecretRepliesStickerStruct secretRepliesStickerStruct;

    public SecretRepliesRecordParam() {
        this(null, null);
    }

    public final SecretRepliesRecordParam copy(SecretRepliesStickerStruct secretRepliesStickerStruct, SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct) {
        return new SecretRepliesRecordParam(secretRepliesStickerStruct, secretRepliesResponseStickerStruct);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecretRepliesRecordParam)) {
            return false;
        }
        SecretRepliesRecordParam secretRepliesRecordParam = (SecretRepliesRecordParam) obj;
        return Intrinsics.LJFF(this.secretRepliesStickerStruct, secretRepliesRecordParam.secretRepliesStickerStruct) && Intrinsics.LJFF(this.secretRepliesResponseStickerStruct, secretRepliesRecordParam.secretRepliesResponseStickerStruct);
    }

    public int hashCode() {
        SecretRepliesStickerStruct secretRepliesStickerStruct = this.secretRepliesStickerStruct;
        int iHashCode = (secretRepliesStickerStruct == null ? 0 : secretRepliesStickerStruct.hashCode()) * 31;
        SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct = this.secretRepliesResponseStickerStruct;
        return iHashCode + (secretRepliesResponseStickerStruct != null ? secretRepliesResponseStickerStruct.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SecretRepliesRecordParam(secretRepliesStickerStruct=");
        sbLIZ.append(this.secretRepliesStickerStruct);
        sbLIZ.append(", secretRepliesResponseStickerStruct=");
        sbLIZ.append(this.secretRepliesResponseStickerStruct);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SecretRepliesStickerStruct secretRepliesStickerStruct = this.secretRepliesStickerStruct;
        if (secretRepliesStickerStruct == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            secretRepliesStickerStruct.writeToParcel(parcel, i);
        }
        SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct = this.secretRepliesResponseStickerStruct;
        if (secretRepliesResponseStickerStruct == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            secretRepliesResponseStickerStruct.writeToParcel(parcel, i);
        }
    }

    public final SecretRepliesResponseStickerStruct getSecretRepliesResponseStickerStruct() {
        return this.secretRepliesResponseStickerStruct;
    }

    public final SecretRepliesStickerStruct getSecretRepliesStickerStruct() {
        return this.secretRepliesStickerStruct;
    }

    public final void setSecretRepliesResponseStickerStruct(SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct) {
        this.secretRepliesResponseStickerStruct = secretRepliesResponseStickerStruct;
    }

    public final void setSecretRepliesStickerStruct(SecretRepliesStickerStruct secretRepliesStickerStruct) {
        this.secretRepliesStickerStruct = secretRepliesStickerStruct;
    }

    public SecretRepliesRecordParam(SecretRepliesStickerStruct secretRepliesStickerStruct, SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct) {
        this.secretRepliesStickerStruct = secretRepliesStickerStruct;
        this.secretRepliesResponseStickerStruct = secretRepliesResponseStickerStruct;
    }
}
