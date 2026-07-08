package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MinisAnchorInfo;

/* JADX INFO: loaded from: classes22.dex */
public final class MinisAnchorInfo implements Parcelable {
    public static final Parcelable.Creator<MinisAnchorInfo> CREATOR = new Parcelable.Creator<MinisAnchorInfo>() { // from class: X.0mKl
        @Override // android.os.Parcelable.Creator
        public final MinisAnchorInfo createFromParcel(Parcel parcel) {
            return new MinisAnchorInfo(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MinisAnchorInfo[] newArray(int i) {
            return new MinisAnchorInfo[i];
        }
    };

    @C09CT("content")
    public final String content;

    @C09CT("keyword")
    public final String keyword;

    @C09CT("minisInfos")
    public final String minisInfos;

    @C09CT("subtype")
    public final String subtype;

    @C09CT("type")
    public final int type;

    @C09CT("url")
    public final String url;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeString(this.minisInfos);
        parcel.writeString(this.url);
        parcel.writeString(this.keyword);
        parcel.writeString(this.subtype);
        parcel.writeString(this.content);
    }

    public MinisAnchorInfo() {
        this(96, "", "", "", "MINIS", "");
    }

    public MinisAnchorInfo(int i, String str, String str2, String str3, String str4, String str5) {
        this.type = i;
        this.minisInfos = str;
        this.url = str2;
        this.keyword = str3;
        this.subtype = str4;
        this.content = str5;
    }
}
