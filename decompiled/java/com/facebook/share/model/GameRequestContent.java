package com.facebook.share.model;

import X.C08FW;
import X.C1D13;
import X.C2206991BZh;
import X.EnumC2229508oP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class GameRequestContent implements ShareModel {
    public final EnumC2229508oP actionType;
    public final String cta;
    public final String data;
    public final C08FW filters;
    public final String message;
    public final String objectId;
    public final List<String> recipients;
    public final List<String> suggestions;
    public final String title;
    public static final C2206991BZh Companion = new Object() { // from class: X.1BZh
    };
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new C1D13(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public GameRequestContent(Parcel parcel) {
        this.message = parcel.readString();
        this.cta = parcel.readString();
        this.recipients = parcel.createStringArrayList();
        this.title = parcel.readString();
        this.data = parcel.readString();
        this.actionType = (EnumC2229508oP) parcel.readSerializable();
        this.objectId = parcel.readString();
        this.filters = (C08FW) parcel.readSerializable();
        this.suggestions = parcel.createStringArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.message);
        parcel.writeString(this.cta);
        parcel.writeStringList(this.recipients);
        parcel.writeString(this.title);
        parcel.writeString(this.data);
        parcel.writeSerializable(this.actionType);
        parcel.writeString(this.objectId);
        parcel.writeSerializable(this.filters);
        parcel.writeStringList(this.suggestions);
    }
}
