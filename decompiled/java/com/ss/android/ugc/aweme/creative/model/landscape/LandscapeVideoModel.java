package com.ss.android.ugc.aweme.creative.model.landscape;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.landscape.LandscapeVideoModel;

/* JADX INFO: loaded from: classes6.dex */
public final class LandscapeVideoModel implements Parcelable {
    public static final Parcelable.Creator<LandscapeVideoModel> CREATOR = new Parcelable.Creator<LandscapeVideoModel>() { // from class: X.0FFB
        @Override // android.os.Parcelable.Creator
        public final LandscapeVideoModel createFromParcel(Parcel parcel) {
            boolean z;
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new LandscapeVideoModel(f, f2, z, z2, parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final LandscapeVideoModel[] newArray(int i) {
            return new LandscapeVideoModel[i];
        }
    };

    @C09CT("blackLevel")
    public int blackLevel;

    @C09CT("borderBottom")
    public float borderBottom;

    @C09CT("borderLeft")
    public float borderLeft;

    @C09CT("borderRight")
    public float borderRight;

    @C09CT("borderTop")
    public float borderTop;

    @C09CT("isFakeLandscapeVideo")
    public boolean isFakeLandscapeVideo;

    @C09CT("isLandscapeVideo")
    public boolean isLandscapeVideo;

    @C09CT("surfaceViewHeight")
    public float surfaceViewHeight;

    @C09CT("surfaceViewWidth")
    public float surfaceViewWidth;

    public LandscapeVideoModel() {
        this(0.0f, 0.0f, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.surfaceViewWidth);
        parcel.writeFloat(this.surfaceViewHeight);
        parcel.writeInt(this.isLandscapeVideo ? 1 : 0);
        parcel.writeInt(this.isFakeLandscapeVideo ? 1 : 0);
        parcel.writeFloat(this.borderTop);
        parcel.writeFloat(this.borderLeft);
        parcel.writeFloat(this.borderRight);
        parcel.writeFloat(this.borderBottom);
        parcel.writeInt(this.blackLevel);
    }

    public LandscapeVideoModel(float f, float f2, boolean z, boolean z2, float f3, float f4, float f5, float f6, int i) {
        this.surfaceViewWidth = f;
        this.surfaceViewHeight = f2;
        this.isLandscapeVideo = z;
        this.isFakeLandscapeVideo = z2;
        this.borderTop = f3;
        this.borderLeft = f4;
        this.borderRight = f5;
        this.borderBottom = f6;
        this.blackLevel = i;
    }
}
