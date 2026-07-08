package com.ss.ugc.android.editor.base.data;

import X.C2500009qw;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public class Media implements Parcelable {
    public static final Parcelable.Creator<Media> CREATOR = new C2500009qw(4);
    public String extension;
    public int id;
    public int mediaType;
    public String name;
    public String parentDir;
    public String path;
    public long size;
    public long time;
    public Uri uri;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Media(Parcel parcel) {
        this.path = parcel.readString();
        this.name = parcel.readString();
        this.extension = parcel.readString();
        this.time = parcel.readLong();
        this.mediaType = parcel.readInt();
        this.size = parcel.readLong();
        this.id = parcel.readInt();
        this.parentDir = parcel.readString();
        this.uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeString(this.name);
        parcel.writeString(this.extension);
        parcel.writeLong(this.time);
        parcel.writeInt(this.mediaType);
        parcel.writeLong(this.size);
        parcel.writeInt(this.id);
        parcel.writeString(this.parentDir);
        parcel.writeParcelable(this.uri, i);
    }

    public Media(String str, String str2, long j, int i, long j2, int i2, String str3) {
        this.path = str;
        this.name = str2;
        if (!TextUtils.isEmpty(str2) && str2.indexOf(e3.d) != -1) {
            this.extension = str2.substring(str2.lastIndexOf(e3.d), str2.length());
        } else {
            this.extension = "null";
        }
        this.time = j;
        this.mediaType = i;
        this.size = j2;
        this.id = i2;
        this.parentDir = str3;
    }
}
