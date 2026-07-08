package com.facebook.share.model;

import X.C1D13;
import X.C2206981BZg;
import X.EnumC2206971BZf;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes35.dex */
public final class AppGroupCreationContent implements ShareModel {
    public final EnumC2206971BZf appGroupPrivacy;
    public final String description;
    public final String name;
    public static final C2206981BZg Companion = new Object() { // from class: X.1BZg
    };
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new C1D13(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public AppGroupCreationContent(Parcel parcel) {
        this.name = parcel.readString();
        this.description = parcel.readString();
        this.appGroupPrivacy = (EnumC2206971BZf) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeSerializable(this.appGroupPrivacy);
    }
}
