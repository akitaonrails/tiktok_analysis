package com.ss.android.ugc.aweme.model;

import X.C2188811AlT;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.model.PhotoMatrixState;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoMatrixState implements Parcelable {
    public static final Parcelable.Creator<PhotoMatrixState> CREATOR = new Parcelable.Creator<PhotoMatrixState>() { // from class: X.0SQj
        @Override // android.os.Parcelable.Creator
        public final PhotoMatrixState createFromParcel(Parcel parcel) {
            FeedContentLayoutInfo feedContentLayoutInfoCreateFromParcel;
            Rect rect = (Rect) parcel.readParcelable(PhotoMatrixState.class.getClassLoader());
            Rect rect2 = (Rect) parcel.readParcelable(PhotoMatrixState.class.getClassLoader());
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ImageView.ScaleType scaleTypeValueOf = null;
            if (parcel.readInt() == 0) {
                feedContentLayoutInfoCreateFromParcel = null;
            } else {
                feedContentLayoutInfoCreateFromParcel = FeedContentLayoutInfo.CREATOR.createFromParcel(parcel);
            }
            FeedContentLayoutInfo feedContentLayoutInfo = feedContentLayoutInfoCreateFromParcel;
            if (parcel.readInt() != 0) {
                scaleTypeValueOf = ImageView.ScaleType.valueOf(parcel.readString());
            }
            return new PhotoMatrixState(rect, rect2, i, i2, feedContentLayoutInfo, scaleTypeValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoMatrixState[] newArray(int i) {
            return new PhotoMatrixState[i];
        }
    };
    public Rect imageContainerRect;
    public Rect imageRect;
    public int itemH;
    public int itemW;
    public final FeedContentLayoutInfo layoutInfo;
    public final ImageView.ScaleType targetScaleType;

    public PhotoMatrixState() {
        this(null, null, 0, 0, null, ImageView.ScaleType.FIT_CENTER);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoMatrixState)) {
            return false;
        }
        PhotoMatrixState photoMatrixState = (PhotoMatrixState) obj;
        return Intrinsics.LJFF(this.imageRect, photoMatrixState.imageRect) && Intrinsics.LJFF(this.imageContainerRect, photoMatrixState.imageContainerRect) && this.itemW == photoMatrixState.itemW && this.itemH == photoMatrixState.itemH && Intrinsics.LJFF(this.layoutInfo, photoMatrixState.layoutInfo) && this.targetScaleType == photoMatrixState.targetScaleType;
    }

    public final int hashCode() {
        Rect rect = this.imageRect;
        int iHashCode = (rect == null ? 0 : rect.hashCode()) * 31;
        Rect rect2 = this.imageContainerRect;
        int iHashCode2 = (((((iHashCode + (rect2 == null ? 0 : rect2.hashCode())) * 31) + this.itemW) * 31) + this.itemH) * 31;
        FeedContentLayoutInfo feedContentLayoutInfo = this.layoutInfo;
        int iHashCode3 = (iHashCode2 + (feedContentLayoutInfo == null ? 0 : feedContentLayoutInfo.hashCode())) * 31;
        ImageView.ScaleType scaleType = this.targetScaleType;
        return iHashCode3 + (scaleType != null ? scaleType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoMatrixState(imageRect=");
        sbLIZ.append(this.imageRect);
        sbLIZ.append(", imageContainerRect=");
        sbLIZ.append(this.imageContainerRect);
        sbLIZ.append(", itemW=");
        sbLIZ.append(this.itemW);
        sbLIZ.append(", itemH=");
        sbLIZ.append(this.itemH);
        sbLIZ.append(", layoutInfo=");
        sbLIZ.append(this.layoutInfo);
        sbLIZ.append(", targetScaleType=");
        sbLIZ.append(this.targetScaleType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.imageRect, i);
        parcel.writeParcelable(this.imageContainerRect, i);
        parcel.writeInt(this.itemW);
        parcel.writeInt(this.itemH);
        FeedContentLayoutInfo feedContentLayoutInfo = this.layoutInfo;
        if (feedContentLayoutInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feedContentLayoutInfo.writeToParcel(parcel, i);
        }
        ImageView.ScaleType scaleType = this.targetScaleType;
        if (scaleType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(scaleType.name());
        }
    }

    public PhotoMatrixState(Rect rect, Rect rect2, int i, int i2, FeedContentLayoutInfo feedContentLayoutInfo, ImageView.ScaleType scaleType) {
        this.imageRect = rect;
        this.imageContainerRect = rect2;
        this.itemW = i;
        this.itemH = i2;
        this.layoutInfo = feedContentLayoutInfo;
        this.targetScaleType = scaleType;
    }
}
