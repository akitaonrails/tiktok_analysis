package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C09CT;
import X.C1441280nbq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo;

/* JADX INFO: loaded from: classes36.dex */
public final class EmbaddedWindowInfo implements Parcelable {
    public static final C1441280nbq CREATOR = new Parcelable.Creator<EmbaddedWindowInfo>() { // from class: X.0nbq
        @Override // android.os.Parcelable.Creator
        public final EmbaddedWindowInfo createFromParcel(Parcel parcel) {
            return new EmbaddedWindowInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EmbaddedWindowInfo[] newArray(int i) {
            return new EmbaddedWindowInfo[i];
        }
    };

    @C09CT("e")
    public int end;

    @C09CT("h")
    public int height;

    @C09CT("s")
    public int start;

    @C09CT("w")
    public int width;

    @C09CT("x")
    public int x;

    @C09CT("y")
    public int y;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public EmbaddedWindowInfo() {
    }

    public EmbaddedWindowInfo(Parcel parcel) {
        this();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.start = parcel.readInt();
        this.end = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
    }

    public EmbaddedWindowInfo(int i, int i2, int i3, int i4, int i5, int i6) {
        this.width = i;
        this.height = i2;
        this.x = i3;
        this.y = i4;
        this.start = i5;
        this.end = i6;
    }
}
