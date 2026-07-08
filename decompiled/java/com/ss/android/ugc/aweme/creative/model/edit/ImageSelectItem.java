package com.ss.android.ugc.aweme.creative.model.edit;

import X.C040H;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSelectItem;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageSelectItem implements Parcelable {
    public static final Parcelable.Creator<ImageSelectItem> CREATOR = new Parcelable.Creator<ImageSelectItem>() { // from class: X.0msc
        @Override // android.os.Parcelable.Creator
        public final ImageSelectItem createFromParcel(Parcel parcel) {
            boolean z;
            LivePhotoPreviewMode livePhotoPreviewModeCreateFromParcel;
            SrcImageInfo srcImageInfoCreateFromParcel = SrcImageInfo.CREATOR.createFromParcel(parcel);
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                livePhotoPreviewModeCreateFromParcel = null;
            } else {
                livePhotoPreviewModeCreateFromParcel = LivePhotoPreviewMode.CREATOR.createFromParcel(parcel);
            }
            LivePhotoPreviewMode livePhotoPreviewMode = livePhotoPreviewModeCreateFromParcel;
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new ImageSelectItem(srcImageInfoCreateFromParcel, z, livePhotoPreviewMode, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageSelectItem[] newArray(int i) {
            return new ImageSelectItem[i];
        }
    };

    @C040H
    public SrcImageInfo imageData;

    @C040H
    public boolean isLivePhotoMode;

    @C040H
    public boolean isSelected;

    @C040H
    public LivePhotoPreviewMode livePhotoPreviewMode;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.imageData.writeToParcel(parcel, i);
        parcel.writeInt(this.isLivePhotoMode ? 1 : 0);
        LivePhotoPreviewMode livePhotoPreviewMode = this.livePhotoPreviewMode;
        if (livePhotoPreviewMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            livePhotoPreviewMode.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public ImageSelectItem(SrcImageInfo srcImageInfo, boolean z, LivePhotoPreviewMode livePhotoPreviewMode, boolean z2) {
        this.imageData = srcImageInfo;
        this.isLivePhotoMode = z;
        this.livePhotoPreviewMode = livePhotoPreviewMode;
        this.isSelected = z2;
    }
}
