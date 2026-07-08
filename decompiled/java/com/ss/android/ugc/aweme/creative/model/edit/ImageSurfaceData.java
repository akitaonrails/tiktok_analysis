package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSurfaceData;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageSurfaceData implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageSurfaceData> CREATOR = new Parcelable.Creator<ImageSurfaceData>() { // from class: X.0nba
        @Override // android.os.Parcelable.Creator
        public final ImageSurfaceData createFromParcel(Parcel parcel) {
            return new ImageSurfaceData(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageSurfaceData[] newArray(int i) {
            return new ImageSurfaceData[i];
        }
    };

    @C09CT("surface_view_height")
    public int surfaceViewHeight;

    @C09CT("surface_view_width")
    public int surfaceViewWidth;

    @C09CT("topMargin")
    public int topMargin;

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageSurfaceData() {
        int i = 0;
        this(i, i, i, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.surfaceViewWidth);
        parcel.writeInt(this.surfaceViewHeight);
        parcel.writeInt(this.topMargin);
    }

    public final float getSurfaceViewRatio() {
        int i = this.surfaceViewHeight;
        if (i == 0) {
            return 0.0f;
        }
        return this.surfaceViewWidth / i;
    }

    public final int getSurfaceViewHeight() {
        return this.surfaceViewHeight;
    }

    public final int getSurfaceViewWidth() {
        return this.surfaceViewWidth;
    }

    public final int getTopMargin() {
        return this.topMargin;
    }

    public final void setSurfaceViewHeight(int i) {
        this.surfaceViewHeight = i;
    }

    public final void setSurfaceViewWidth(int i) {
        this.surfaceViewWidth = i;
    }

    public final void setTopMargin(int i) {
        this.topMargin = i;
    }

    public ImageSurfaceData(int i, int i2, int i3) {
        this.surfaceViewWidth = i;
        this.surfaceViewHeight = i2;
        this.topMargin = i3;
    }

    public /* synthetic */ ImageSurfaceData(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
