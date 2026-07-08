package com.ss.android.ugc.aweme.theater.common;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.theater.common.AuthConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class AuthConfig implements Parcelable {
    public static final Parcelable.Creator<AuthConfig> CREATOR = new Parcelable.Creator<AuthConfig>() { // from class: X.12o9
        @Override // android.os.Parcelable.Creator
        public final AuthConfig createFromParcel(Parcel parcel) {
            return new AuthConfig((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthConfig[] newArray(int i) {
            return new AuthConfig[i];
        }
    };
    public final CharSequence authContent;
    public final CharSequence authTitle;
    public final String learnMoreSlug;
    public final String privacyUrl;

    public AuthConfig() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthConfig)) {
            return false;
        }
        AuthConfig authConfig = (AuthConfig) obj;
        return Intrinsics.LJFF(this.authTitle, authConfig.authTitle) && Intrinsics.LJFF(this.authContent, authConfig.authContent) && Intrinsics.LJFF(this.privacyUrl, authConfig.privacyUrl) && Intrinsics.LJFF(this.learnMoreSlug, authConfig.learnMoreSlug);
    }

    public final int hashCode() {
        CharSequence charSequence = this.authTitle;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.authContent;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        String str = this.privacyUrl;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.learnMoreSlug;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuthConfig(authTitle=");
        sbLIZ.append((Object) this.authTitle);
        sbLIZ.append(", authContent=");
        sbLIZ.append((Object) this.authContent);
        sbLIZ.append(", privacyUrl=");
        sbLIZ.append(this.privacyUrl);
        sbLIZ.append(", learnMoreSlug=");
        sbLIZ.append(this.learnMoreSlug);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.authTitle, parcel, i);
        TextUtils.writeToParcel(this.authContent, parcel, i);
        parcel.writeString(this.privacyUrl);
        parcel.writeString(this.learnMoreSlug);
    }

    public AuthConfig(CharSequence charSequence, CharSequence charSequence2, String str, String str2) {
        this.authTitle = charSequence;
        this.authContent = charSequence2;
        this.privacyUrl = str;
        this.learnMoreSlug = str2;
    }
}
