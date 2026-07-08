package com.ss.android.ugc.aweme.creation.config;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creation.config.DMEncryptedImageContent;
import com.ss.android.ugc.aweme.creation.config.DMEncryptedImageContentExtra;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class DMEncryptedImageContent implements Parcelable, Serializable {
    public static final Parcelable.Creator<DMEncryptedImageContent> CREATOR = new Parcelable.Creator<DMEncryptedImageContent>() { // from class: X.0HYI
        @Override // android.os.Parcelable.Creator
        public final DMEncryptedImageContent createFromParcel(Parcel parcel) {
            return new DMEncryptedImageContent(parcel.readString(), parcel.readString(), parcel.readString(), (DMEncryptedImageContentExtra) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final DMEncryptedImageContent[] newArray(int i) {
            return new DMEncryptedImageContent[i];
        }
    };

    @C09CT("Extra")
    public final DMEncryptedImageContentExtra extra;

    @C09CT("SecretKey")
    public final String secretKey;

    @C09CT("SourceMd5")
    public final String sourceMD5;

    @C09CT("Uri")
    public final String uri;

    public DMEncryptedImageContent() {
        this(null, null, null, null);
    }

    public final DMEncryptedImageContent copy(String str, String str2, String str3, DMEncryptedImageContentExtra dMEncryptedImageContentExtra) {
        return new DMEncryptedImageContent(str, str2, str3, dMEncryptedImageContentExtra);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DMEncryptedImageContent)) {
            return false;
        }
        DMEncryptedImageContent dMEncryptedImageContent = (DMEncryptedImageContent) obj;
        return Intrinsics.LJFF(this.uri, dMEncryptedImageContent.uri) && Intrinsics.LJFF(this.secretKey, dMEncryptedImageContent.secretKey) && Intrinsics.LJFF(this.sourceMD5, dMEncryptedImageContent.sourceMD5) && Intrinsics.LJFF(this.extra, dMEncryptedImageContent.extra);
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secretKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourceMD5;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DMEncryptedImageContentExtra dMEncryptedImageContentExtra = this.extra;
        return iHashCode3 + (dMEncryptedImageContentExtra != null ? dMEncryptedImageContentExtra.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMEncryptedImageContent(uri=");
        sbLIZ.append(this.uri);
        sbLIZ.append(", secretKey=");
        sbLIZ.append(this.secretKey);
        sbLIZ.append(", sourceMD5=");
        sbLIZ.append(this.sourceMD5);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeString(this.secretKey);
        parcel.writeString(this.sourceMD5);
        parcel.writeSerializable(this.extra);
    }

    public final DMEncryptedImageContentExtra getExtra() {
        return this.extra;
    }

    public final String getSecretKey() {
        return this.secretKey;
    }

    public final String getSourceMD5() {
        return this.sourceMD5;
    }

    public final String getUri() {
        return this.uri;
    }

    public DMEncryptedImageContent(String str, String str2, String str3, DMEncryptedImageContentExtra dMEncryptedImageContentExtra) {
        this.uri = str;
        this.secretKey = str2;
        this.sourceMD5 = str3;
        this.extra = dMEncryptedImageContentExtra;
    }
}
