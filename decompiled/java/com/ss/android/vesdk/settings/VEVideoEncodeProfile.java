package com.ss.android.vesdk.settings;

import X.C08FF;
import X.C1864730ycp;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes28.dex */
public enum VEVideoEncodeProfile implements Parcelable {
    ENCODE_PROFILE_UNKNOWN,
    ENCODE_PROFILE_BASELINE,
    ENCODE_PROFILE_MAIN,
    ENCODE_PROFILE_HIGH;

    public static final Parcelable.Creator<VEVideoEncodeProfile> CREATOR = new C1864730ycp(29);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static VEVideoEncodeProfile valueOf(String str) {
        return (VEVideoEncodeProfile) C08FF.LIZ(VEVideoEncodeProfile.class, str);
    }

    public static VEVideoEncodeProfile valueOfString(String str) {
        VEVideoEncodeProfile vEVideoEncodeProfile = ENCODE_PROFILE_UNKNOWN;
        if (!TextUtils.isEmpty(str)) {
            if ("baseline".equals(str)) {
                return ENCODE_PROFILE_BASELINE;
            }
            if ("main".equals(str)) {
                return ENCODE_PROFILE_MAIN;
            }
            if (!"high".equals(str)) {
                return vEVideoEncodeProfile;
            }
            return ENCODE_PROFILE_HIGH;
        }
        return vEVideoEncodeProfile;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
