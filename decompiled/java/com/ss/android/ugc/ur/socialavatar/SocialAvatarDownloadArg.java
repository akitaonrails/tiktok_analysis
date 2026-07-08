package com.ss.android.ugc.ur.socialavatar;

import X.C445700Hdo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarDownloadArg;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarDownloadArg implements IRouteArg {
    public final String enterFrom;
    public final long startTime;
    public final String userId;
    public final String username;
    public static final C445700Hdo Companion = new Object() { // from class: X.0Hdo
    };
    public static final Parcelable.Creator<SocialAvatarDownloadArg> CREATOR = new Parcelable.Creator<SocialAvatarDownloadArg>() { // from class: X.0HWH
        @Override // android.os.Parcelable.Creator
        public final SocialAvatarDownloadArg createFromParcel(Parcel parcel) {
            return new SocialAvatarDownloadArg(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final SocialAvatarDownloadArg[] newArray(int i) {
            return new SocialAvatarDownloadArg[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.userId);
        parcel.writeString(this.username);
        parcel.writeLong(this.startTime);
    }

    public SocialAvatarDownloadArg() {
        this("", "", "", -1L);
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public static SocialAvatarDownloadArg __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3;
        long jLongValue;
        Long l = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("key_enter_from")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("key_enter_from"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("key_user_uid")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("key_user_uid"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("key_user_name")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("key_user_name"), String.class);
        } else {
            i += 4;
            str3 = null;
        }
        if (!bundle.containsKey("key_start_time") || (l = (Long) RouteParser.INSTANCE.parse(bundle.get("key_start_time"), Long.class)) == null) {
            i += 8;
        }
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        String str4 = "";
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) == 0) {
            str4 = str3;
        }
        if ((i & 8) != 0) {
            jLongValue = -1;
        }
        return new SocialAvatarDownloadArg(str, str2, str4, jLongValue);
    }

    public SocialAvatarDownloadArg(String str, String str2, String str3, long j) {
        this.enterFrom = str;
        this.userId = str2;
        this.username = str3;
        this.startTime = j;
    }
}
