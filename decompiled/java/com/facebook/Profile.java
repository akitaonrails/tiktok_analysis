package com.facebook;

import X.C0W7K;
import X.C1D13;
import X.C2202571BIh;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class Profile implements Parcelable {
    public final String firstName;
    public final String id;
    public final String lastName;
    public final Uri linkUri;
    public final String middleName;
    public final String name;
    public final Uri pictureUri;
    public static final C2202571BIh Companion = new C2202571BIh();
    public static final String TAG = "Profile";
    public static final Parcelable.Creator<Profile> CREATOR = new C1D13(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.firstName;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.middleName;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.lastName;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.name;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.linkUri;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.pictureUri;
        return uri2 != null ? (iHashCode * 31) + uri2.hashCode() : iHashCode;
    }

    public Profile(JSONObject jSONObject) {
        Uri uri;
        this.id = jSONObject.optString(FollowStatusChangeMethod.PARAM_UID, null);
        this.firstName = jSONObject.optString("first_name", null);
        this.middleName = jSONObject.optString("middle_name", null);
        this.lastName = jSONObject.optString("last_name", null);
        this.name = jSONObject.optString("name", null);
        String strOptString = jSONObject.optString("link_uri", null);
        if (strOptString == null) {
            uri = null;
        } else {
            uri = Uri.parse(strOptString);
        }
        this.linkUri = uri;
        String strOptString2 = jSONObject.optString("picture_uri", null);
        this.pictureUri = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        String str = this.id;
        if ((str == null && ((Profile) obj).id == null) || Intrinsics.LJFF(str, ((Profile) obj).id)) {
            String str2 = this.firstName;
            if ((str2 == null && ((Profile) obj).firstName == null) || Intrinsics.LJFF(str2, ((Profile) obj).firstName)) {
                String str3 = this.middleName;
                if ((str3 == null && ((Profile) obj).middleName == null) || Intrinsics.LJFF(str3, ((Profile) obj).middleName)) {
                    String str4 = this.lastName;
                    if ((str4 == null && ((Profile) obj).lastName == null) || Intrinsics.LJFF(str4, ((Profile) obj).lastName)) {
                        String str5 = this.name;
                        if ((str5 == null && ((Profile) obj).name == null) || Intrinsics.LJFF(str5, ((Profile) obj).name)) {
                            Uri uri = this.linkUri;
                            if ((uri == null && ((Profile) obj).linkUri == null) || Intrinsics.LJFF(uri, ((Profile) obj).linkUri)) {
                                Uri uri2 = this.pictureUri;
                                if ((uri2 == null && ((Profile) obj).pictureUri == null) || Intrinsics.LJFF(uri2, ((Profile) obj).pictureUri)) {
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public Profile(Parcel parcel) {
        Uri uri;
        this.id = parcel.readString();
        this.firstName = parcel.readString();
        this.middleName = parcel.readString();
        this.lastName = parcel.readString();
        this.name = parcel.readString();
        String string = parcel.readString();
        if (string == null) {
            uri = null;
        } else {
            uri = Uri.parse(string);
        }
        this.linkUri = uri;
        String string2 = parcel.readString();
        this.pictureUri = string2 != null ? Uri.parse(string2) : null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String string;
        parcel.writeString(this.id);
        parcel.writeString(this.firstName);
        parcel.writeString(this.middleName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.name);
        Uri uri = this.linkUri;
        String string2 = null;
        if (uri == null) {
            string = null;
        } else {
            string = uri.toString();
        }
        parcel.writeString(string);
        Uri uri2 = this.pictureUri;
        if (uri2 != null) {
            string2 = uri2.toString();
        }
        parcel.writeString(string2);
    }

    public Profile(Uri uri, Uri uri2, String str, String str2, String str3, String str4, String str5) {
        C0W7K.LJ(str, FollowStatusChangeMethod.PARAM_UID);
        this.id = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.name = str5;
        this.linkUri = uri;
        this.pictureUri = uri2;
    }
}
